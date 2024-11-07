package org.example.heartrate.entity;

import lombok.Data;

@Data
public class ResultEntity {
    private String msg;
    private Object data;
    private Integer code;
}
