package com.yuanxin.pojo;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ass_usr")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class User {


    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String username;
    private String password;
    @Column(name = "login_account")
    private String loginAccount;
    private Integer status;
    @Column(name = "last_login_time")
    private String lastLoginTime;
    private String scrq;

}
