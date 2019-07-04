package dn.cg.tm.dto;



import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class ClassRoomDTO implements Serializable {
    private String id;
    @NotEmpty(message = "Class name is not valid")
    private String name;
    @NotEmpty(message = "Start day is not valid!")
    private String startDay;
    @NotEmpty(message = "End day is not valid!")
    private String endDay;
    private Boolean deleted;
    private String learningStatus;

    public String getLearningStatus() { return learningStatus; }

    public void setLearningStatus(String learningStatus) { this.learningStatus = learningStatus; }

    public String getStartDay() { return startDay; }

    public void setStartDay(String startDay) { this.startDay = startDay; }

    public String getEndDay() { return endDay; }

    public void setEndDay(String endDay) { this.endDay = endDay; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name;}

    public void setName(String name) { this.name = name; }


    public Boolean isDeleted() { return deleted; }

    public void setDeleted(Boolean deleted) { this.deleted = deleted; }
}
