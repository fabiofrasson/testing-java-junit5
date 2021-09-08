package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IndexControllerTest {

  IndexController controller;

  @BeforeEach
  void setUp() {
    controller = new IndexController();
  }

  @Test
  void index() {
    assertEquals("index", controller.index());
    assertEquals("index", controller.index(), "Wrong view returned");

    assertEquals(
        "index",
        controller.index(),
        () -> "Another expensive message. Make me only if you have to :)");
  }

  @Test
  void oupsHandler() {
    assertTrue(
        "notimplemented".equals(controller.oupsHandler()),
        () -> "This is some expensive" + " Message to build" + " for my test.");

    // Simplified version of the statement above
    assertEquals(
        "notimplemented",
        controller.oupsHandler(),
        () -> "This is some expensive" + " Message to build" + " for my test.");
  }
}
