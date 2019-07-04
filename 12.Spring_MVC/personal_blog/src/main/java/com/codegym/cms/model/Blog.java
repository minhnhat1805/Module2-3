package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titleStatus;
    private String status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Category getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return String.format("Blog[id=%d, titleStatus='%s', status='%s']", id, titleStatus, status);
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public  Blog(){}
    public  Blog(String titleStatus){
        this.titleStatus= titleStatus;
    }

    public String getStatus() {
        return status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleStatus() {
        return titleStatus;
    }

    public void setTitleStatus(String titleStatus) {
        this.titleStatus = titleStatus;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
