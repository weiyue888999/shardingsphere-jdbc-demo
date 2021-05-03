package io.weiyue.mapper;

import io.weiyue.entity.Dict;

import java.util.List;

public interface DictMapper {

    List<Dict> getByType(String type);

    Integer insertDist(Dict dict);

    Integer deleteById(Long id);
}
