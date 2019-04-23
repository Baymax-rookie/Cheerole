package org.rookie.cheerole.entity;

/**
 * @author 12589
 */
public class Student {
    private String stuName;
    private String stuId;
    private String vote;
    public Student(String stuName, String stuId, String vote) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.vote = vote;
    }

    public Student(){}

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }
}
