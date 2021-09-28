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

/**
 * 组织成员
 */
@Data
@SQLDelete(sql = "update `org_user` SET deleted_at =  unix_timestamp(now()) WHERE id = ?")
@Entity
@Table(name = "org_user")
@Where(clause = "deleted_at is null")
@DynamicUpdate
@Cacheable
public class OrgUserEntity extends BaseEntity implements Serializable {
    @Id
    String id;

    String org_id;

    String user_id;
}
