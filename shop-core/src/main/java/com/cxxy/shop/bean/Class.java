package com.cxxy.shop.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author:liuhui
 * Description:
 * Date: 下午4:44 2017/11/20
 */
@Data
@Entity
@Table(name = "t_class")
@NoArgsConstructor
@AllArgsConstructor
public class Class implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long class_id;

    @Column
    private String class_name;
}
