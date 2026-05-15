package com.pluarlsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedRooms;
    private int bookedSuites;
    Hotel(String name, int numberOfRooms,int numberOfSuites, int bookedRooms,int bookedSuites){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        bookedRooms = 0;
        bookedSuites = 0;
    }
    Hotel(String name, int numberOfRooms, int numberOfSuites){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(getAvailableRooms() == 0|| getAvailableSuites() == 0){
            return false;
        }
        if(isSuite){
            this.bookedSuites += numberOfRooms;
        }
        this.bookedRooms+= numberOfRooms;
        return true;




    }
    public int getAvailableRooms(){
       return this.numberOfRooms- this.bookedRooms;

    }
    public int getAvailableSuites(){
        return this.numberOfSuites - this.bookedSuites;

    }

}
