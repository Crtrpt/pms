package com.dj.pms.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Data
@SQLDelete(sql = "update `users` SET deleted_at =  unix_timestamp(now()) WHERE id = ?")
@Entity
@Table(name = "users")
@Where(clause = "deleted_at is null")
@DynamicUpdate
@Cacheable
public class UserEntity extends BaseEntity implements Serializable {
    @Id
    String id;

    String name;

    String account;

    String password;

    String phone;
}
