package org.lanmei.seckill.dao.mapper;

import java.util.List;

import org.lanmei.seckill.dao.model.Seckill;
import org.springframework.stereotype.Repository;

@Repository
public interface SeckillMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer seckillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill
	 * @mbg.generated
	 */
	int insert(Seckill record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill
	 * @mbg.generated
	 */
	Seckill selectByPrimaryKey(Integer seckillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill
	 * @mbg.generated
	 */
	List<Seckill> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Seckill record);
}