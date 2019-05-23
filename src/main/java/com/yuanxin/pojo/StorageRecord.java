package com.yuanxin.pojo;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ass_storage_record")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class StorageRecord {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "eventType")
    private Integer event_type;
    private String amount;
    private String operator;
    private String scrq;

}
