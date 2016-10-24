package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.utils.HttpClientUtils;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * 充值卡历史记录测试
 * Created by TaoRan on 2016/10/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest
public class CardHistoryControllerTest {
    //充值卡明细测试
    @Test
    public void testRechargeDetail() {
        Map<String, Object> map = new HashedMap();
        map.put("companyId", "a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("operateTime", "");
        String message = HttpClientUtils.testUrl("/card/rechargeDetail", map);
        System.out.println(message);

    }
}
