package org.rookie.cheerole.entity;

/**
 * @author 12589
 */

public class College {
    private String name;
    private int vote;
    private String intro;

    public College(){}
    public College(String name, int vote, String intro) {
        this.name = name;
        this.vote = vote;
        this.intro = intro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
