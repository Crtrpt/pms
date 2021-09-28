package com.dj.pms.entity.project;


import com.dj.pms.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Data
@SQLDelete(sql = "update `project` SET deleted_at =  unix_timestamp(now()) WHERE id = ?")
@Entity
@Table(name = "project")
@Where(clause = "deleted_at is null")
@DynamicUpdate
@Cacheable
public class ProjectEntity extends BaseEntity implements Serializable {

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
