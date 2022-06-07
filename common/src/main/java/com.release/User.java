package com.release;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yancheng
 * @since 2022/6/7
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {

    private String name;
    private int age;
    private String sex;
    private long phoneNumber;
}
