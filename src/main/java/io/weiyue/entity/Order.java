package io.weiyue.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Order {

    private static final long serialVersionUID = 1L;

    private long id;

    private Long uid;

    private Long pid;
}
