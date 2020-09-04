package com.sunforits.jiaocaizhengding;

import com.sunforits.jiaocaizhengding.entity.YongHu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JiaocaizhengdingApplicationTests {

    @Test
    void contextLoads() {
        YongHu yongHu = new YongHu();
        System.out.println(yongHu);
        System.out.println(yongHu == null);
    }

}
