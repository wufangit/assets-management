package com.yuanxin.pojo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ass_inventory")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Inventory {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(name = "goods_id")
    private String goodsId;
    private String amount;
    private String modify_time;
    private String scrq;

}
