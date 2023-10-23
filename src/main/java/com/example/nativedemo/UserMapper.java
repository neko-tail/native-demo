package com.example.nativedemo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xuqinwei
 * @date 2023-10-23 09:45
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
