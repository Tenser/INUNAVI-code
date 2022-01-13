package com.maru.inunavi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import javax.persistence.*;

@Builder
@AllArgsConstructor
@Entity(name="UserLecture")
@Getter
public class UserLecture {
    public UserLecture(){}

    // 아이디
    @Id
    @Column(length = 45, nullable=false)
    private String UserID;

    // 과목번호
    @Column(length = 45, nullable=false)
    private String LectureID;

}
