package com.yuanxin.pojo;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ass_goods_type")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class GoodsType {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String name;
    @Column(name = "type_order")
    private Integer typeOrder;
    private String scrq;


}
