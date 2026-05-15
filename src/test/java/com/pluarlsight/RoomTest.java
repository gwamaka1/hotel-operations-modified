package com.pluarlsight;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_RoomInitialStatus_RoomIsOccupiedAndDirty(){
        //Arrange
        Room room = new Room(3,100);
        //Act
        room.checkIn();
        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    public void checkOut_RoomInitialStatus_RoomIsNotOccupied(){
        //Arrange
        Room room = new Room(1,100);
        //Act
        room.checkOut();
        //Assert
        assertFalse(room.isOccupied());
    }
    @Test
    public void cleanRoom_RoomInitialStatus_RoomIsNotDirty(){
        //Arrange
        Room room = new Room(1,100);
        //Act
        room.cleanRoom();
        //Assert
        assertFalse(room.isDirty());

    }

}