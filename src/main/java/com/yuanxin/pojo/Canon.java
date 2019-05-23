package com.yuanxin.pojo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ass_canon")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Canon {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String name;
    private String address;
    @Column(name = "tel_phone")
    private String telPhone;
    private String scrq;

}
