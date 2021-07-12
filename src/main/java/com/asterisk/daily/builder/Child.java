package com.asterisk.daily.builder;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Child {
private Long id;
private  String fname;
private String lname;
}
