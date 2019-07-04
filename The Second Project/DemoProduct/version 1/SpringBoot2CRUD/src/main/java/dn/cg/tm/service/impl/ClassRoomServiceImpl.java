package dn.cg.tm.service.impl;


import dn.cg.tm.constants.AppConsts;
import dn.cg.tm.dto.ClassRoomDTO;
import dn.cg.tm.entity.ClassRoom;
import dn.cg.tm.service.ClassRoomService;
import dn.cg.tm.repository.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.lang.Boolean.TRUE;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Autowired
    private ClassRoomRepository classRoomRepository;


    @Override
    public void save(ClassRoomDTO classRoom) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(AppConsts.STRING_TO_DATE_FORMAT);
        LocalDate startDay = LocalDate.parse(classRoom.getStartDay(), dateTimeFormatter);
        LocalDate endDay = LocalDate.parse(classRoom.getEndDay(), dateTimeFormatter);

        ClassRoom classes = new ClassRoom();
        System.out.println(classes.getId());
        classes.setName(classRoom.getName());
        classes.setLearningStatus(classRoom.getLearningStatus());
        classes.setStartDay(startDay);
        classes.setEndDay(endDay);
        classes.setDeleted(Boolean.FALSE);
        classRoomRepository.save(classes);
    }

    @Override
    public void update(ClassRoomDTO classRoomDTO) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(AppConsts.STRING_TO_DATE_FORMAT);
        LocalDate startDay = LocalDate.parse(classRoomDTO.getStartDay(), dateTimeFormatter);
        LocalDate endDay = LocalDate.parse(classRoomDTO.getEndDay(), dateTimeFormatter);
        ClassRoom classRoom = classRoomRepository.findById(classRoomDTO.getId()).orElse(null);
        classRoom.setStartDay(startDay);
        classRoom.setEndDay(endDay);
        classRoom.setName(classRoomDTO.getName());
        classRoom.setLearningStatus(classRoomDTO.getLearningStatus());

        classRoomRepository.save(classRoom);
    }

    @Override
    public ClassRoomDTO findById(String id) {
        ClassRoom classRoom = classRoomRepository.findById(id).orElse(null);

        if (classRoom != null) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(AppConsts.STRING_TO_DATE_FORMAT);
            String startDay = classRoom.getStartDay().format(dateTimeFormatter);
            String endDay = classRoom.getEndDay().format(dateTimeFormatter);

            ClassRoomDTO classRoomDTO = new ClassRoomDTO();
            classRoomDTO.setId(classRoom.getId());
            classRoomDTO.setName(classRoom.getName());
            classRoomDTO.setLearningStatus(classRoom.getLearningStatus());
            classRoomDTO.setStartDay(startDay);
            classRoomDTO.setEndDay(endDay);

            return classRoomDTO;
        }
        return null;
    }

    @Override
    public void delete(String id) {
        ClassRoom classRoom = classRoomRepository.findById(id).orElse(null);
        classRoom.setDeleted(TRUE);
        classRoomRepository.save(classRoom);
    }


    @Override
    public List<ClassRoom> findAllByDeletedIsFalse() {

        List<ClassRoom> classRooms = classRoomRepository.findAllByDeletedIsFalse();

        return classRooms;
    }


}