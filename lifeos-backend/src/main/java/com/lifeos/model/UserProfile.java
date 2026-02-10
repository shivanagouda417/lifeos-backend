package com.lifeos.model;
import lombok.Data;
import java.time.LocalDate;
@Data
public class UserProfile {
 private String name;
 private LocalDate dob;
 private int age;
 private String gender;
 private String cityName;
 private String educationLevel;
 private String currentWorkType;
 private String lifestyleType;
 private String familyResponsibility;
}