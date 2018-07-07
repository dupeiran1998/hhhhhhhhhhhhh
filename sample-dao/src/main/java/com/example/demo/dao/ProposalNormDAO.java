package com.example.demo.dao;

import com.example.demo.entity.ProposalNorm;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @ClassName	ProposalNormDAO
 * @Description	用户信息DAO
 */
@Mapper
public interface ProposalNormDAO {

	/**
	 * @Title	query
	 * @Description	根据参数分页查询用户信息
	 * @param proposalNorm	proposalNorm中不为空的参数将被作为查询条件
	 * 			模糊查询(EssayName、NormName)
	 * @return	List<ProposalNorm>
	 */
	@Select(value =  "<script>" 
			+ "SELECT * FROM proposal_norm "
			+ " WHERE 1 = 1 "
				+ " <if test=\" SerialNumber != null \"> and SerialNumber = #{SerialNumber} </if> "
				+ " <if test=\" EssayName != null \"> and EssayName like concat('%', #{EssayName}, '%') </if> "
				+ " <if test=\" NormName != null \"> and NormName like concat('%', #{NormName}, '%') </if> "
				+ " <if test=\" Content != null \"> and Content = #{Content} </if> "
				+ " <if test=\" SerialNumberOfWriter != null \"> and SerialNumberOfWriter = #{SerialNumberOfWriter} </if> "
				+ " <if test=\" NameOfWriter != null \"> and NameOfWriter = #{NameOfWriter} </if> "
				+ " <if test=\" TimeOfUpdate != null \"> and TimeOfUpdate = #{TimeOfUpdate} </if> "
				+ " <if test=\" Type != null \"> and Type = #{Type} </if> "
				+ " <if test=\" Status != null \"> and Status = #{Status} </if> "
				+ " <if test=\" offest != null and limit != null \"> limit #{offest},#{limit} </if> "
			+ "</script>")
	List<ProposalNorm> query(ProposalNorm proposalNorm) throws Exception;

	/**
	 * @Title	count
	 * @Description	根据参数统计数据条数
	 * @param proposalNorm	proposalNorm中不为空的参数将被作为查询条件
	 * 			模糊查询(EssayName、NormName)
	 * @return	int
	 */
	@Select(value =  "<script>" 
			+ "SELECT COUNT(SerialNumber) FROM proposal_norm "
			+ " WHERE 1 = 1 "
				+ " <if test=\" SerialNumber != null \"> and SerialNumber = #{SerialNumber} </if> "
				+ " <if test=\" EssayName != null \"> and EssayName like concat('%', #{EssayName}, '%') </if> "
				+ " <if test=\" NormName != null \"> and NormName like concat('%', #{NormName}, '%') </if> "
				+ " <if test=\" Content != null \"> and Content = #{Content} </if> "
				+ " <if test=\" SerialNumberOfWriter != null \"> and SerialNumberOfWriter = #{SerialNumberOfWriter} </if> "
				+ " <if test=\" NameOfWriter != null \"> and NameOfWriter = #{NameOfWriter} </if> "
				+ " <if test=\" TimeOfUpdate != null \"> and TimeOfUpdate = #{TimeOfUpdate} </if> "
				+ " <if test=\" Type != null \"> and Type = #{Type} </if> "
				+ " <if test=\" Status != null \"> and Status = #{Status} </if> "
			+ "</script>")
	int count(ProposalNorm proposalNorm) throws Exception;

	/**
	 * @Title	insert
	 * @Description	根据参数动态插入数据
	 * @param proposalNorm	proposalNorm中不为空的参数将被作为值
	 * @return	int
	 */
	@Insert(value = "<script>" 
			+ "INSERT INTO proposal_norm "
			+ " <trim prefix=\"( \" suffix=\" )\" suffixOverrides=\",\"> "
				+ " <if test=\" SerialNumber != null \"> SerialNumber, </if> "
				+ " <if test=\" EssayName != null \"> EssayName, </if> "
				+ " <if test=\" NormName != null \"> NormName, </if> "
				+ " <if test=\" Content != null \"> Content, </if> "
				+ " <if test=\" SerialNumberOfWriter != null \"> SerialNumberOfWriter, </if> "
				+ " <if test=\" NameOfWriter != null \"> NameOfWriter, </if> "
				+ " <if test=\" TimeOfUpdate != null \"> TimeOfUpdate, </if> "
				+ " <if test=\" Type != null \"> Type, </if> "
				+ " <if test=\" Status != null \"> Status, </if> "
			+ " </trim> "
			+ " <trim prefix=\" values (\" suffix=\" ) \" suffixOverrides=\",\"> "
				+ " <if test=\" SerialNumber != null \"> #{SerialNumber}, </if> "
				+ " <if test=\" EssayName != null \"> #{EssayName}, </if> "
				+ " <if test=\" NormName != null \"> #{NormName}, </if> "
				+ " <if test=\" Content != null \"> #{Content}, </if> "
				+ " <if test=\" SerialNumberOfWriter != null \"> #{SerialNumberOfWriter}, </if> "
				+ " <if test=\" NameOfWriter != null \"> #{NameOfWriter}, </if> "
				+ " <if test=\" TimeOfUpdate != null \"> #{TimeOfUpdate}, </if> "
				+ " <if test=\" Type != null \"> #{Type}, </if> "
				+ " <if test=\" Status != null \"> #{Status}, </if> "
			+ " </trim> "
			+ "</script>")
	int insert(ProposalNorm proposalNorm) throws Exception ;

	/**
	 * @Title	update
	 * @Description	根据参数动态更新数据
	 * @param proposalNorm	proposalNorm中不为空的参数将被作为值
	 * 			SerialNumber 为必传
	 * @throws Exception
	 * @return	int
	 */
	@Update(value = "<script>"
			+ "UPDATE proposal_norm "
			+ " <set> "
//				+ " <if test=\" SerialNumber != null \"> SerialNumber = #{SerialNumber}, </if> "
				+ " <if test=\" EssayName != null \"> EssayName = #{EssayName}, </if> "
				+ " <if test=\" NormName != null \"> NormName = #{NormName}, </if> "
				+ " <if test=\" Content != null \"> Content = #{Content}, </if> "
				+ " <if test=\" SerialNumberOfWriter != null \"> SerialNumberOfWriter = #{SerialNumberOfWriter}, </if> "
				+ " <if test=\" NameOfWriter != null \"> NameOfWriter = #{NameOfWriter}, </if> "
				+ " <if test=\" TimeOfUpdate != null \"> TimeOfUpdate = #{TimeOfUpdate}, </if> "
				+ " <if test=\" Type != null \"> Type = #{Type}, </if> "
				+ " <if test=\" Status != null \"> Status = #{Status}, </if> "
			+ " </set> "
			+ " WHERE SerialNumber = #{SerialNumber} "
			+ "</script>")
	int update(ProposalNorm proposalNorm) throws Exception;

	/**
	 * @Title	delete
	 * @Description	根据SerialNumber删除数据
	 * @param SerialNumber
	 * @throws Exception
	 * @return	int
	 */
	@Delete(value = "DELETE from proposal_norm where SerialNumber = #{SerialNumber}")
	int delete(Integer SerialNumber) throws Exception;
}