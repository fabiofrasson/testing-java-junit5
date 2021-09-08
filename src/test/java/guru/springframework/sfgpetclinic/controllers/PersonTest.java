package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

  @Test
  void groupedAssertions() {
    // given
    Person person = new Person(1L, "Fabio", "Frasson");

    // then
    assertAll(
        "Test Props Set",
        () -> assertEquals("Fabio", person.getFirstName()),
        () -> assertEquals("Frasson", person.getLastName()));
  }

  @Test
  void groupedAssertionMsgs() {
    // given
    Person person = new Person(1L, "Fabio", "Frasson");

    // then
    assertAll(
        "Test Props Set",
        () -> assertEquals("Fabio", person.getFirstName(), "First name fail"),
        () -> assertEquals("Frasson", person.getLastName(), "Last name fail"));
  }
}
