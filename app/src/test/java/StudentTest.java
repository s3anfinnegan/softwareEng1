package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StudentTest {
    Student newStudent;

    @BeforeEach
    void setUp() {
          newStudent = new Student("Sean", 21, new DateTime(2001,10,02,0,0,0,0), 12345);
    }
//getUsername test for taskA
    @Test
    @DisplayName("Check correct username is generated")
    void testUsernameGeneration() {
        assertEquals("Sean21", newStudent.getUsername());
    }

}