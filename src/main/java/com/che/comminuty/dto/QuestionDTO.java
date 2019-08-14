package com.che.comminuty.dto;

import com.che.comminuty.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private int id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private int creator;
    private int viewCount;
    private int commentCount;
    private int likeCount;
    private User user;
}
