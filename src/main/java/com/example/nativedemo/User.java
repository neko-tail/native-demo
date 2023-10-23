package com.example.nativedemo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xuqinwei
 * @date 2023-10-23 09:39
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
@TableName("t_user")
public class User {
    
    private Integer id;
    
    private String name;
}
