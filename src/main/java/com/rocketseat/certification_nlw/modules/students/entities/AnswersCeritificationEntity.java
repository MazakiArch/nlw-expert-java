package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCeritificationEntity {

    private UUID id;
    private UUID certificationID;
    private UUID studentID;
    private UUID answerID;
    private Boolean isCorrect;

}
