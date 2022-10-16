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

public class ProgrammeTest {
    Programme newProgramme;

    @BeforeEach
    void setUp() {
        newProgramme = new Programme("Electronic and Computer Engineering", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));
    }

    @Test
    @DisplayName("Check getter")
    void testProgrammeGeneration() {
        assertEquals("Electronic and Computer Engineering", newProgramme.getCourseName());
    }

}