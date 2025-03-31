package com.metacoding.blogv1_upgrade.board;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor // 풀 생성자
@NoArgsConstructor  // 디폴트 생성자
@Table(name = "board_tb") // table 명 설정
@Entity // jpa가 관리할 수 있게 설정
public class Board {
    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto_increment 설정
    private Integer id;
    private String title;
    private String content;
    private String username;
    private Timestamp createdAt;
}