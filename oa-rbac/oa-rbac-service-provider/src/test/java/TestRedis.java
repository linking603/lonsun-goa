import cn.lonsun.service.api.DepartmentService;
import cn.lonsun.util.httpclient.HttpClientUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

public class TestRedis {
    @Test
    public void testSpringJedisSingle() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
        Jedis jedis = pool.getResource();
        //jedis.set("key1","1");
        Long i=jedis.incr("key1");
        String string = jedis.get("key1");
        System.out.println(string);
        jedis.close();
        pool.close();
       /* Map<String, String> param = new HashMap<>();
        param.put("pageIndex", "1");
        param.put("pageSize", "10");
        HttpClientUtil.doPost("http://localhost:8081/department/getDepartmentPaginationResult", param);
        param.clear();
        param.put("departmentId", "30196719");
        HttpClientUtil.doPost("http://localhost:8081/department/getDepartmentByDepartmentId", param);
        HttpClientUtil.doPost("http://localhost:8081/department/getDepartmentByDepartmentId", param);*/
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        DepartmentService pool = (DepartmentService) applicationContext.getBean("departmentService");
        pool.getDepartmentPaginationResult(null);
        System.out.println("");*/
    }

}
