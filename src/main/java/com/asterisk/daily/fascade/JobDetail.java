package com.asterisk.daily.fascade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class JobDetail {
    private String companyImageUrl;
    private String title;
    private String company;
    private String companyAddress;
    private List<String> keySkills;
    private String deadLine;
    private String views;
}
