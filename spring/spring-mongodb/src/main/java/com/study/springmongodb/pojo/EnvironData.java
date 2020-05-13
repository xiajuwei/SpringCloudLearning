package com.study.springmongodb.pojo;

import lombok.Data;

@Data
public class EnvironData {
    private Long ID;
    private String UUID;
    private String EDEVCODE;
    private String PARAMCODE;
    private String NAME;
    private String VAL;
    private String DESCRIPTION;
    private String COLLECTTIME;
    private Integer STYPE;
    private Integer STATIONID;
    private String AUTHORIZEID;

}
