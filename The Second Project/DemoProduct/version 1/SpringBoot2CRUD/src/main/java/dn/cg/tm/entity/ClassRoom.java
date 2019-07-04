package dn.cg.tm.entity;

import dn.cg.tm.domain.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "classes")
public class ClassRoom extends BaseEntity {
	@Id
	private String id= UUID.randomUUID().toString();
	private String name;
	private Boolean deleted;
	private LocalDate startDay;
	private LocalDate endDay;
	private String learningStatus;

	public ClassRoom() {
	}

	public String getLearningStatus() {
		return learningStatus;
	}

	public void setLearningStatus(String learningStatus) {
		this.learningStatus = learningStatus;
	}

	public LocalDate getStartDay() { return startDay; }

	public void setStartDay(LocalDate startDay) { this.startDay = startDay; }

	public LocalDate getEndDay() { return endDay; }

	public void setEndDay(LocalDate endDay) { this.endDay = endDay; }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
