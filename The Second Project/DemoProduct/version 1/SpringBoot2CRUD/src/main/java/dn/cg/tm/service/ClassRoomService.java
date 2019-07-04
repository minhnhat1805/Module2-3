package dn.cg.tm.service;


import dn.cg.tm.dto.ClassRoomDTO;
import dn.cg.tm.entity.ClassRoom;
import java.util.List;


public interface ClassRoomService {
    List<ClassRoom> findAllByDeletedIsFalse();

    void save(ClassRoomDTO classRoomDTO);

    void update(ClassRoomDTO classRoomDTO);

    ClassRoomDTO findById(String id);

    void delete(String id);



}
