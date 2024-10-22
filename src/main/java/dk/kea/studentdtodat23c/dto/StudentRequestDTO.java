package dk.kea.studentdtodat23c.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record StudentRequestDTO(String name, String password, String email, LocalDate bornDate, LocalTime bornTime) {
}
