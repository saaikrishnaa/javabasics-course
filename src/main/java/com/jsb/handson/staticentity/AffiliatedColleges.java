package com.jsb.handson.staticentity;

public class AffiliatedColleges {
    private String collegeName;
    private Integer uniqueCollegeId;
    private Boolean isCampusPlacementsProvided;
    private String universityName;

    public AffiliatedColleges() {
    }

    public AffiliatedColleges(String collegeName, Integer uniqueCollegeId, Boolean isCampusPlacementsProvided, String universityName) {
        this.collegeName = collegeName;
        this.uniqueCollegeId = uniqueCollegeId;
        this.isCampusPlacementsProvided = isCampusPlacementsProvided;
        this.universityName = universityName;
    }


    public String toString() {
        return "AffiliatedColleges{" +
                "collegeName='" + collegeName + '\'' +
                ", uniqueCollegeId=" + uniqueCollegeId +
                ", isCampusPlacementsProvided=" + isCampusPlacementsProvided +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
