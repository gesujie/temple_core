package com.jibinfo.temple.entity.system;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SystemWebsite implements Serializable {
    private Long id;

    private String logo;

    private String name;

    private String synopses;

    private String icp;

    private String copyright;

    private String domain;

    private String title;

    private String description;

    private String isDel;

    private Date createdDate;

    private Date updatedDate;

    private String keywords;

    private static final long serialVersionUID = 1L;

}