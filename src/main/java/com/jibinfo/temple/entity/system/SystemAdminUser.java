
package com.jibinfo.temple.entity.system;

import java.io.Serializable;
import java.util.Date;

import javax.ws.rs.DefaultValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SystemAdminUser implements Serializable {
    private Long id;

    private String userName;

    private String userPwd;

    private Date birthday;

    private String name;

    private String userIcon;

    private String sex;

    private String nickname;

    private String stat;

    private Long userMall;

    private Date lastLoginDate;

    private String lastLoginIp;

    private Long srcOpenUserId;

    private String email;

    private String mobile;

    @DefaultValue("0")
    private String isDel;

    private String isEmailConfirmed;

    private String isPhoneConfirmed;

    private Long creater;

    private Date createDate;

    private Date updateDate;

    private String pwdIntensity;

    private String mobileTgc;

    private String mac;

    private String source;

    private static final long serialVersionUID = 1L;
}