package Models;


import java.time.LocalDateTime;

import Enums.PRIO;
import Enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String title;
private String description;
@Enumerated(EnumType.STRING)
private PRIO priority;
@Enumerated(EnumType.STRING)
private Status status;

private LocalDateTime creationDate;
private LocalDateTime dueDateTime; 
private LocalDateTime updatedTime;

}
