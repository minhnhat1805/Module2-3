package dn.cg.tm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import dn.cg.tm.dto.ClassRoomDTO;
import dn.cg.tm.entity.ClassRoom;
import dn.cg.tm.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
public class ClassRoomController {

	@Autowired
	private ClassRoomService classRoomService;


	@GetMapping("/classRooms")
	public List<ClassRoom> getAllClassRooms() {
		List<ClassRoom> classRooms;

			classRooms = classRoomService.findAllByDeletedIsFalse();

		return classRooms;
	}

	@GetMapping("/classRooms/{id}")
	public ResponseEntity<ClassRoomDTO> getClassRoomById(@PathVariable(value = "id") String classRoomId)
			{
		ClassRoomDTO classRoom = classRoomService.findById(classRoomId);

		return ResponseEntity.ok().body(classRoom);
	}

	@PostMapping("/classRooms")
	public ClassRoomDTO createClassRoom(@RequestBody ClassRoomDTO classRoom) {
		classRoomService.save(classRoom);
		return classRoom;
	}

	@PutMapping("/classRooms/{id}")
	public ResponseEntity<ClassRoomDTO> updateClassRoom(@PathVariable(value = "id") String id,@RequestBody ClassRoomDTO classRoom) {
        classRoomService.update(classRoom);
		return ResponseEntity.ok(classRoom);
	}

	@DeleteMapping("/classRooms/{id}")
	public Map<String, Boolean> deleteClassRoom(@PathVariable(value = "id") String classRoomId) {
		ClassRoomDTO classRoom = classRoomService.findById(classRoomId);
		classRoomService.delete(classRoom.getId());
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
