package com.jsb.javabasics.staticentity;

public class AffiliatedCollegesUsingStatic {
    private String collegeName;
    private Integer uniqueCollegeId;
    private Boolean isCampusPlacementsProvided;
    private static String universityName = "Acharya Nagarjuna University";

    public AffiliatedCollegesUsingStatic() {
    }

    public AffiliatedCollegesUsingStatic(String collegeName, Integer uniqueCollegeId, Boolean isCampusPlacementsProvided) {
        this.collegeName = collegeName;
        this.uniqueCollegeId = uniqueCollegeId;
        this.isCampusPlacementsProvided = isCampusPlacementsProvided;
    }

    @Override
    public String toString() {
        return "AffiliatedColleges{" +
                "collegeName='" + collegeName + '\'' +
                ", uniqueCollegeId=" + uniqueCollegeId +
                ", isCampusPlacementsProvided=" + isCampusPlacementsProvided +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
