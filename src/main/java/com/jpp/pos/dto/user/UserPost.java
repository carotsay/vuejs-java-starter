package com.jpp.pos.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by JackPham
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPost {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime creationDate;
}
