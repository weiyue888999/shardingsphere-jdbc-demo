package io.weiyue.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private String name;

	private String age;
}