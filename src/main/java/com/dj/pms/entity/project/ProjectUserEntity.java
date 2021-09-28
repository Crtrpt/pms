package com.dj.pms.entity.project;


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

/**
 * 项目成员
 */
@Data
@SQLDelete(sql = "update `project_user` SET deleted_at =  unix_timestamp(now()) WHERE id = ?")
@Entity
@Table(name = "project_user")
@Where(clause = "deleted_at is null")
@DynamicUpdate
@Cacheable
public class ProjectUserEntity extends BaseEntity implements Serializable {

    @Id
    String id;

    String name;

    String description;

    /**
     * 是否私有项目
     */
    boolean isPrivate;


    /**
     * 项目id
     */
    String owner_id;
}
