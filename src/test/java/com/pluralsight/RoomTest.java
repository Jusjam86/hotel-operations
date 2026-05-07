package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_shouldMarkRoom_asDirtyAndOccupied() {
        // arrange
        Room room = new Room("Queen Size", 2, 256.89, false, false);
        // act
        room.checkIn();
        // assert
        assertTrue(room.isOccupied(), "Room should be marked as occupied");
        assertTrue(room.isDirty(), "Room should be marked as dirty");
    }

    @Test
    public void checkOut_shouldMarkRoom_asUnoccupied() {
        // arrange
        Room room = new Room("Queen Size", 2, 256.89, true, false);
        // act
        room.checkOut();
        // assert
        assertFalse(room.isOccupied(), "Room should be marked as unoccupied");
        assertTrue(room.isDirty(), "Room should be marked as dirty because you can't clean a room that hasn't been checked out yet");
    }

    @Test
    public void cleanRoom_shouldMarkRoom_asClean() {
        // arrange
        Room room = new Room("Queen Size", 2, 256.89, false, true);
        // act
        room.cleanRoom();
        // assert
        assertFalse(room.isOccupied(), "Room should be marked as clean, method doesn't use isOccupied bool");
    }

}