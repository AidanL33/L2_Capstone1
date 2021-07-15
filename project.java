package com.capstone;

public class project {

    //Attributes for new project
     private int projNum;
     private String projName;
     private String buildType;
     private String projAdd;
     private String erfNum;
     private long projFee;
     private long totPaid;
     private String dDate;

     //constructor
    public project(int projNum, String projName, String buildType, String projAdd, String erfNum, long projFee, long totPaid, String dDate) {
        this.projNum = projNum;
        this.projName = projName;
        this .buildType = buildType;
        this.projAdd = projAdd;
        this.erfNum = erfNum;
        this.projFee = projFee;
        this.totPaid = totPaid;
        this.dDate = dDate;
    }

    //Getters
    public int getProjNum() {
        return projNum;
    }

    public String getProjName() {
        return projName;
    }

    public String getBuildType() {
        return buildType;
    }

    public String getProjAdd() {
        return projAdd;
    }

    public String getErfNum() {
        return erfNum;
    }

    public long getProjFee() {
        return projFee;
    }

    public long getTotPaid() {
        return totPaid;
    }

    public String getdDate() {
        return dDate;
    }

    //Setters
    public void setdDate(String dDate) {
        this.dDate = dDate;
    }

    public void setTotPaid(long totPaid) {
        this.totPaid = totPaid;
    }

    public void setProjFee(long projFee) {
        this.projFee = projFee;
    }

    public void setErfNum(String erfNum) {
        this.erfNum = erfNum;
    }

    public void setProjAdd(String projAdd) {
        this.projAdd = projAdd;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public void setProjNum(int projNum) {
        this.projNum = projNum;
    }

    //toString method
    public String toString() {
        String output = "Project number: " + projNum;
        output += "\nProject name: " + projName;
        output += "\nBuilding type: " + buildType;
        output += "\nPhysical address: " + projAdd;
        output += "\nERF number: " + erfNum;
        output += "\nProject fee: " + projFee;
        output += "\nTotal paid: " + totPaid;
        output+= "\nDeadline: " + dDate;

        return output;
    }
}
