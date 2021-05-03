package io.weiyue.mapper;

import io.weiyue.entity.Dict;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class DictSrpingTest extends SpringBaseTest{

    @Resource
    private DictMapper dictMapper;

    @Test
    public void testInsert_student(){

        Dict dict = new Dict();
        dict.setId(1L);
        dict.setTypeName("user_type");
        dict.setName("student");
        dict.setValue("1");
        int cnt = this.dictMapper.insertDist(dict);
        System.out.println(cnt);
    }

    @Test
    public void testInsert_teacher(){

        Dict dict = new Dict();
        dict.setId(2L);
        dict.setTypeName("user_type");
        dict.setName("teacher");
        dict.setValue("2");
        int cnt = this.dictMapper.insertDist(dict);
        System.out.println(cnt);
    }

    @Test
    public void testQueryByType(){

        List<Dict> dictList = this.dictMapper.getByType("user_type");
        dictList.forEach(dict -> System.out.println(dict));
    }
}
