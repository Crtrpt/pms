package com.dj.pms.modules.wiki.entity;


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
@SQLDelete(sql = "update `wiki` SET deleted_at =  unix_timestamp(now()) WHERE id = ?")
@Entity
@Table(name = "wiki")
@Where(clause = "deleted_at is null")
@DynamicUpdate
@Cacheable
public class WikiEntity extends BaseEntity implements Serializable {

    @Id
    String id;

    String project_id;

    String name;

    String description;
}
