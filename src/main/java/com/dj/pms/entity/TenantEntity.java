package com.dj.pms.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@SQLDelete(sql = "update `tenant` SET deleted_at =  unix_timestamp(now()) WHERE id = ?")
@Entity
@Table(name = "tenant")
@Where(clause = "deleted_at is null")
@DynamicUpdate
@Cacheable
public class TenantEntity extends BaseEntity implements Serializable {

    @Id
    String id;

    String name;

//    所有者 用户id
    String owner_id;
}
