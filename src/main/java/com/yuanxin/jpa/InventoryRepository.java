package com.yuanxin.jpa;

import com.yuanxin.pojo.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {

}
