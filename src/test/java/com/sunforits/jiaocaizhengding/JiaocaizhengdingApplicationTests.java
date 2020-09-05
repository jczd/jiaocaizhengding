package com.sunforits.jiaocaizhengding;

import com.sunforits.jiaocaizhengding.entity.YongHu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class JiaocaizhengdingApplicationTests {

    @Test
    void contextLoads() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
    }

}
