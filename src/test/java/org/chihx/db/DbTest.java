package org.chihx.db;

import lombok.extern.slf4j.Slf4j;
import org.chihx.ShardingJDBCApplication;
import org.chihx.mapper.ProductOrderMapper;
import org.chihx.model.ProductOrderDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

/**
 * @author Faker
 * @implNote DbTest
 * @since 2023-12-23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJDBCApplication.class)
@Slf4j
public class DbTest {

    @Resource
    private ProductOrderMapper productOrderMapper;

    @Test
    public void saveJdbcTest() {
        for (int i = 0; i < 10; i++) {
            ProductOrderDO productOrder = new ProductOrderDO();
            productOrder.setCreateTime(new Date());
            productOrder.setNickname("二当家i=" + i);
            productOrder.setOutTradeNo(UUID.randomUUID().toString().substring(0, 32));
            productOrder.setPayAmount(100.00);
            productOrder.setState("PAY");
            productOrder.setUserId(Long.valueOf(i + ""));
            productOrderMapper.insert(productOrder);
        }
    }

}
