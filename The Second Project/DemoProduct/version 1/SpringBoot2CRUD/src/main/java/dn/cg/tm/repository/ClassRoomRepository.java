package dn.cg.tm.repository;


import dn.cg.tm.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClassRoomRepository extends JpaRepository<ClassRoom, String> {
    List<ClassRoom> findAllByDeletedIsFalse();


}
