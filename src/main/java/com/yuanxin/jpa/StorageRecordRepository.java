package com.yuanxin.jpa;

import com.yuanxin.pojo.StorageRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRecordRepository extends JpaRepository<StorageRecord, String> {

}
