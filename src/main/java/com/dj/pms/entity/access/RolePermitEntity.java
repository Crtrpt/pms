package com.dj.pms.entity.access;


import com.dj.pms.entity.BaseEntity;
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
@SQLDelete(sql = "update `role_permit` SET deleted_at =  unix_timestamp(now()) WHERE id = ?")
@Entity
@Table(name = "role_permit")
@Where(clause = "deleted_at is null")
@DynamicUpdate
@Cacheable
public class RolePermitEntity extends BaseEntity implements Serializable {
    @Id
    String id;
    /**
     * 角色id
     */
    String role_id;
    /**
     * 权限id
     */
    String permit_id;
}
