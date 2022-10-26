package org.example.demo.student;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
// Not use @Data because we don't want to use final in each field
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
