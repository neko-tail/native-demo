package com.example.nativedemo;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NativeDemoApplicationTests {
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    void contextLoads() {
        clearData();
        Long count = userMapper.selectCount(Wrappers.emptyWrapper());
        assert count == 0;
    }
    
    private void clearData() {
        userMapper.delete(Wrappers.emptyWrapper());
    }
    
}
