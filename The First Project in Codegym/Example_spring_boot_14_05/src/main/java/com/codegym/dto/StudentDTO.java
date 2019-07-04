package com.codegym.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;

public class StudentDTO implements Serializable {
    private  String id;
    @NotBlank(message = "Student name is not null")
    @Pattern(regexp =  "(^$|[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ])*$",message = "Student is not valid")
    private String name;
    @NotBlank(message = "Birthday is not null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthday;
    private  Boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
