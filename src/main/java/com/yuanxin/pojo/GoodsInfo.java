package com.yuanxin.pojo;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ass_goods_info")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class GoodsInfo {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(name = "type_id")
    private String typeId;
    @Column(name = "canon_id")
    private String canonId;
    @Column(name = "bar_code")
    private String barCode;
    private String name;
    @Column(name = "short_name")
    private String shortName;
    @Column(name = "goods_order")
    private Integer goodsOrder;
    private String price;
    private String address;
    @Column(name = "createId")
    private String create_id;
    private String scrq;

}
