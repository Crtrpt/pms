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
@SQLDelete(sql = "update `active` SET deleted_at =  unix_timestamp(now()) WHERE id = ?")
@Entity
@Table(name = "active")
@Where(clause = "deleted_at is null")
@DynamicUpdate
@Cacheable
public class ActiveEntity extends BaseEntity implements Serializable {
    @Id
    String id;

    String user_id;

    String title;

    String content;
}
