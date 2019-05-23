package com.yuanxin.pojo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ass_role")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Role {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String name;
    private String scrq;

}
