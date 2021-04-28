package io.weiyue.mapper;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations =
        {
                "classpath*:spring-mybatis.xml",
                "classpath*:spring-shardingsphere.xml"
        }
)
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
public class SpringBaseTest {

    @Before
    public void before(){

    }
}
