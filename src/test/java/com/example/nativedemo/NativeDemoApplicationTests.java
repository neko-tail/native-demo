package com.example.nativedemo;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.toolkit.SqlRunner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

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
    
    @Test
    void testGroupConcat() {
        clearData();
        
        String testNameString = "aaa,bbb,ccc";
        String[] testNames = testNameString.split(",");
        for (int i = 0; i < testNames.length; i++) {
            userMapper.insert(new User(i, testNames[i]));
        }
        
        String nameString = (String) SqlRunner.db().selectObj("select group_concat(`name`) from t_user order by id");
        String[] names = nameString.split(",");
        Arrays.sort(names);
        Arrays.sort(testNames);
        assert Arrays.equals(testNames, names);
        
        clearData();
    }
    
    private void clearData() {
        userMapper.delete(Wrappers.emptyWrapper());
    }
    
}
