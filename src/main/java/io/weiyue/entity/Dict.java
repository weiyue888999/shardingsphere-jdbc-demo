package io.weiyue.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Dict {

    private Long id;
    private String typeName;
    private String name;
    private String value;
}
