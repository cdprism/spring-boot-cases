package org.shancm.jpa.demo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author shancm
 * @package org.shancm.spring.jpa.domain
 * @description:
 * @date 2019/1/14
 */
@Entity
@Data
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "user_name")
	private String userName;

//	private Integer age;

//	private Double salary;

//	@Column(name = "dept_no")
//	private Integer deptNo;
}
