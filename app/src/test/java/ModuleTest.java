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

public class ModuleTest {
    Modules newModule;

    @BeforeEach
    void setUp() {
        newModule = new Modules("Software Engineering III", "CT417");
    }
    //getUsername test for taskA
    @Test
    @DisplayName("Check getter")
    void testModuleGeneration() {
        assertEquals("Software Engineering III", newModule.getModName());
    }

}