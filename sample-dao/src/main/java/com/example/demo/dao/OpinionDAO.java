package com.example.demo.dao;

import com.example.demo.entity.Opinion;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @ClassName	OpinionDAO
 * @Description	附议信息DAO
 */
@Mapper
public interface OpinionDAO {

	/**
	 * @Title	query
	 * @Description	根据参数分页查询附议信息
	 * @param opinion	opinion中不为空的参数将被作为查询条件
	 * @return	List<Opinion>
	 */
	@Select(value =  "<script>" 
			+ "SELECT * FROM opinion "
			+ " WHERE 1 = 1 "
				+  " <if test=\" SerialNumber != null \"> and SerialNumber = #{SerialNumber} </if> "
				+  " <if test=\" ProposalOfSerialNumber != null \"> and ProposalOfSerialNumber = #{ProposalOfSerialNumber} </if> "
				+  " <if test=\" UserOfSerialNumber != null \"> and UserOfSerialNumber = #{UserOfSerialNumber} </if> "
				+  " <if test=\" UserOfName != null \"> and UserOfName = #{UserOfName} </if> "
				+  " <if test=\" Content != null \"> and Content = #{Content} </if> "
				+  " <if test=\" Position != null \"> and Position = #{Position} </if> "
				+  " <if test=\" offest != null and limit != null \"> limit #{offest},#{limit} </if> "
			+ "</script>")
	List<Opinion> query(Opinion opinion) throws Exception;

	/**
	 * @Title	count
	 * @Description	根据参数统计数据条数
	 * @param opinion	opinion中不为空的参数将被作为查询条件
	 * @return	int
	 */
	@Select(value =  "<script>" 
			+ "SELECT COUNT(SerialNumber) FROM opinion "
			+ " WHERE 1 = 1 "
			+  " <if test=\" SerialNumber != null \"> and SerialNumber = #{SerialNumber} </if> "
			+  " <if test=\" ProposalOfSerialNumber != null \"> and ProposalOfSerialNumber = #{ProposalOfSerialNumber} </if> "
			+  " <if test=\" UserOfSerialNumber != null \"> and UserOfSerialNumber = #{UserOfSerialNumber} </if> "
			+  " <if test=\" UserOfName != null \"> and UserOfName = #{UserOfName} </if> "
			+  " <if test=\" Content != null \"> and Content = #{Content} </if> "
			+  " <if test=\" Position != null \"> and Position = #{Position} </if> "
			+ "</script>")
	int count(Opinion opinion) throws Exception;

	/**
	 * @Title	insert
	 * @Description	根据参数动态插入数据
	 * @param opinion	opinion中不为空的参数将被作为值
	 * @return	int
	 */
	@Insert(value = "<script>" 
			+ "INSERT INTO opinion "
			+ " <trim prefix=\"( \" suffix=\" )\" suffixOverrides=\",\"> "
				+ " <if test=\" SerialNumber != null \">  SerialNumber , </if> "
				+ " <if test=\" ProposalOfSerialNumber != null \">  ProposalOfSerialNumber , </if> "
				+ " <if test=\" UserOfSerialNumber != null \">  UserOfSerialNumber , </if> "
				+ " <if test=\" UserOfName != null \">  UserOfName , </if> "
				+ " <if test=\" Content != null \">  Content , </if> "
				+ " <if test=\" Position != null \">  Position , </if> "
			+ " </trim> "
			+ " <trim prefix=\" values (\" suffix=\" ) \" suffixOverrides=\",\"> "
				+ " <if test=\" SerialNumber != null \"> #{SerialNumber}, </if> "
				+ " <if test=\" ProposalOfSerialNumber != null \"> #{ProposalOfSerialNumber}, </if> "
				+ " <if test=\" UserOfSerialNumber != null \"> #{UserOfSerialNumber}, </if> "
				+ " <if test=\" UserOfName != null \"> #{UserOfName}, </if> "
				+ " <if test=\" Content != null \"> #{Content}, </if> "
				+ " <if test=\" Position != null \"> #{Position}, </if> "
			+ " </trim> "
			+ "</script>")
	int insert(Opinion opinion) throws Exception ;

	/**
	 * @Title	update
	 * @Description	根据参数动态更新数据
	 * @param opinion	opinion中不为空的参数将被作为值
	 * 			SerialNumber 为必传
	 * @throws Exception
	 * @return	int
	 */
	@Update(value = "<script>"
			+ "UPDATE opinion "
			+ " <set> "
			  + " <if test=\" SerialNumber != null \"> SerialNumber = #{SerialNumber}, </if> "
			  + " <if test=\" ProposalOfSerialNumber != null \"> ProposalOfSerialNumber = #{ProposalOfSerialNumber}, </if> "
			  + " <if test=\" UserOfSerialNumber != null \"> UserOfSerialNumber = #{UserOfSerialNumber}, </if> "
			  + " <if test=\" UserOfName != null \"> UserOfName = #{UserOfName}, </if> "
			  + " <if test=\" Content != null \"> Content = #{Content}, </if> "
			  + " <if test=\" Position != null \"> Position = #{Position}, </if> "
			+ " </set> "
			+ " WHERE SerialNumber = #{SerialNumber} "
			+ "</script>")
	int update(Opinion opinion) throws Exception;

	/**
	 * @Title	delete
	 * @Description	根据SerialNumber删除数据
	 * @param SerialNumber
	 * @throws Exception
	 * @return	int
	 */
	@Delete(value = "DELETE from opinion where SerialNumber = #{SerialNumber}")
	int delete(Integer SerialNumber) throws Exception;
}