package com.example.demo.dao;

import com.example.demo.entity.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @ClassName	UserDAO
 * @Description	用户信息DAO
 */
@Mapper
public interface UserDAO {

	/**
	 * @Title	query
	 * @Description	根据参数分页查询用户信息
	 * @param user	user中不为空的参数将被作为查询条件
	 * 			模糊查询(Name、TelNumber)
	 * @return	List<User>
	 */
	@Select(value =  "<script>" 
			+ "SELECT * FROM user "
			+ " WHERE 1 = 1 "
				+ " <if test=\" SerialNumber != null \"> and SerialNumber = #{SerialNumber} </if> "
				+ " <if test=\" Name != null \"> and Name like concat('%', #{Name}, '%') </if> "
				+ " <if test=\" Sex != null \"> and Sex = #{Sex} </if> "
				+ " <if test=\" BirthDate != null \"> and BirthDate = #{BirthDate} </if> "
				+ " <if test=\" TelNumber != null \"> and TelNumber like concat('%', #{TelNumber}, '%') </if> "
				+ " <if test=\" IndustryBranch != null \"> and IndustryBranch = #{IndustryBranch} </if> "
				+ " <if test=\" SpecialCommittee != null \"> and SpecialCommittee = #{SpecialCommittee} </if> "
				+ " <if test=\" SpecialIdentity != null \"> and SpecialIdentity = #{SpecialIdentity} </if> "
				+ " <if test=\" NameOfRecommending != null \"> and NameOfRecommending = #{NameOfRecommending} </if> "
				+ " <if test=\" TypeOfRecommending != null \"> and TypeOfRecommending = #{TypeOfRecommending} </if> "
				+ " <if test=\" Content != null \"> and Content = #{Content} </if> "
				+ " <if test=\" Mail != null \"> and Mail = #{Mail} </if> "
				+ " <if test=\" Address != null \"> and Address = #{Address} </if> "
				+ " <if test=\" NameOfWechat != null \"> and NameOfWechat = #{NameOfWechat} </if> "
				+ " <if test=\" Status != null \"> and Status = #{Status} </if> "
				+ " <if test=\" Account != null \"> and Account = #{Account} </if> "
				+ " <if test=\" Password != null \"> and Password = #{Password} </if> "
				+ " <if test=\" Type != null \"> and Type = #{Type} </if> "
				+ " <if test=\" Company != null \"> and Company = #{Company} </if> "
				+ " <if test=\" Title != null \"> and Title = #{Title} </if> "
				+ " <if test=\" Job != null \"> and Job = #{Job} </if> "
				+ " <if test=\" offest != null and limit != null \"> limit #{offest},#{limit} </if> "
			+ "</script>")
	List<User> query(User user) throws Exception;

	/**
	 * @Title	count
	 * @Description	根据参数统计数据条数
	 * @param user	user中不为空的参数将被作为查询条件
	 * 			模糊查询(Name、TelNumber)
	 * @return	int
	 */
	@Select(value =  "<script>" 
			+ "SELECT COUNT(SerialNumber) FROM user "
			+ " WHERE 1 = 1 "
				+ " <if test=\" SerialNumber != null \"> and SerialNumber = #{SerialNumber} </if> "
				+ " <if test=\" Name != null \"> and Name like concat('%', #{Name}, '%') </if> "
				+ " <if test=\" Sex != null \"> and Sex = #{Sex} </if> "
				+ " <if test=\" BirthDate != null \"> and BirthDate = #{BirthDate} </if> "
				+ " <if test=\" TelNumber != null \"> and TelNumber like concat('%', #{TelNumber}, '%') </if> "
				+ " <if test=\" IndustryBranch != null \"> and IndustryBranch = #{IndustryBranch} </if> "
				+ " <if test=\" SpecialCommittee != null \"> and SpecialCommittee = #{SpecialCommittee} </if> "
				+ " <if test=\" SpecialIdentity != null \"> and SpecialIdentity = #{SpecialIdentity} </if> "
				+ " <if test=\" NameOfRecommending != null \"> and NameOfRecommending = #{NameOfRecommending} </if> "
				+ " <if test=\" TypeOfRecommending != null \"> and TypeOfRecommending = #{TypeOfRecommending} </if> "
				+ " <if test=\" Content != null \"> and Content = #{Content} </if> "
				+ " <if test=\" Mail != null \"> and Mail = #{Mail} </if> "
				+ " <if test=\" Address != null \"> and Address = #{Address} </if> "
				+ " <if test=\" NameOfWechat != null \"> and NameOfWechat = #{NameOfWechat} </if> "
				+ " <if test=\" Status != null \"> and Status = #{Status} </if> "
				+ " <if test=\" Account != null \"> and Account = #{Account} </if> "
				+ " <if test=\" Password != null \"> and Password = #{Password} </if> "
				+ " <if test=\" Type != null \"> and Type = #{Type} </if> "
				+ " <if test=\" Company != null \"> and Company = #{Company} </if> "
				+ " <if test=\" Title != null \"> and Title = #{Title} </if> "
				+ " <if test=\" Job != null \"> and Job = #{Job} </if> "
			+ "</script>")
	int count(User user) throws Exception;

	/**
	 * @Title	insert
	 * @Description	根据参数动态插入数据
	 * @param user	user中不为空的参数将被作为值
	 * @return	int
	 */
	@Insert(value = "<script>" 
			+ "INSERT INTO user "
			+ " <trim prefix=\"( \" suffix=\" )\" suffixOverrides=\",\"> "
				+ " <if test=\" SerialNumber != null \"> SerialNumber, </if> "
				+ " <if test=\" Name != null \"> Name, </if> "
				+ " <if test=\" Sex != null \"> Sex, </if> "
				+ " <if test=\" BirthDate != null \"> BirthDate, </if> "
				+ " <if test=\" TelNumber != null \"> TelNumber, </if> "
				+ " <if test=\" IndustryBranch != null \"> IndustryBranch, </if> "
				+ " <if test=\" SpecialCommittee != null \"> SpecialCommittee, </if> "
				+ " <if test=\" SpecialIdentity != null \"> SpecialIdentity, </if> "
				+ " <if test=\" NameOfRecommending != null \"> NameOfRecommending, </if> "
				+ " <if test=\" TypeOfRecommending != null \"> TypeOfRecommending, </if> "
				+ " <if test=\" Content != null \"> Content, </if> "
				+ " <if test=\" Mail != null \"> Mail, </if> "
				+ " <if test=\" Address != null \"> Address, </if> "
				+ " <if test=\" NameOfWechat != null \"> NameOfWechat, </if> "
				+ " <if test=\" Status != null \"> Status, </if> "
				+ " <if test=\" Account != null \"> Account, </if> "
				+ " <if test=\" Password != null \"> Password, </if> "
				+ " <if test=\" Type != null \"> Type, </if> "
				+ " <if test=\" Company != null \"> Company, </if> "
				+ " <if test=\" Title != null \"> Title, </if> "
				+ " <if test=\" Job != null \"> Job, </if> "
			+ " </trim> "
			+ " <trim prefix=\" values (\" suffix=\" ) \" suffixOverrides=\",\"> "
				+ " <if test=\" SerialNumber != null \"> #{SerialNumber}, </if> "
				+ " <if test=\" Name != null \"> #{Name}, </if> "
				+ " <if test=\" Sex != null \"> #{Sex}, </if> "
				+ " <if test=\" BirthDate != null \"> #{BirthDate}, </if> "
				+ " <if test=\" TelNumber != null \"> #{TelNumber}, </if> "
				+ " <if test=\" IndustryBranch != null \"> #{IndustryBranch}, </if> "
				+ " <if test=\" SpecialCommittee != null \"> #{SpecialCommittee}, </if> "
				+ " <if test=\" SpecialIdentity != null \"> #{SpecialIdentity}, </if> "
				+ " <if test=\" NameOfRecommending != null \"> #{NameOfRecommending}, </if> "
				+ " <if test=\" TypeOfRecommending != null \"> #{TypeOfRecommending}, </if> "
				+ " <if test=\" Content != null \"> #{Content}, </if> "
				+ " <if test=\" Mail != null \"> #{Mail}, </if> "
				+ " <if test=\" Address != null \"> #{Address}, </if> "
				+ " <if test=\" NameOfWechat != null \"> #{NameOfWechat}, </if> "
				+ " <if test=\" Status != null \"> #{Status}, </if> "
				+ " <if test=\" Account != null \"> #{Account}, </if> "
				+ " <if test=\" Password != null \"> #{Password}, </if> "
				+ " <if test=\" Type != null \"> #{Type}, </if> "
				+ " <if test=\" Company != null \"> #{Company}, </if> "
				+ " <if test=\" Title != null \"> #{Title}, </if> "
				+ " <if test=\" Job != null \"> #{Job}, </if> "
			+ " </trim> "
			+ "</script>")
	int insert(User user) throws Exception ;

	/**
	 * @Title	update
	 * @Description	根据参数动态更新数据
	 * @param user	user中不为空的参数将被作为值
	 * 			SerialNumber 为必传
	 * @throws Exception
	 * @return	int
	 */
	@Update(value = "<script>"
			+ "UPDATE user "
			+ " <set> "
//				+ " <if test=\" SerialNumber != null \"> SerialNumber = #{SerialNumber}, </if> "
				+ " <if test=\" Name != null \"> Name = #{Name}, </if> "
				+ " <if test=\" Sex != null \"> Sex = #{Sex}, </if> "
				+ " <if test=\" BirthDate != null \"> BirthDate = #{BirthDate}, </if> "
				+ " <if test=\" TelNumber != null \"> TelNumber = #{TelNumber}, </if> "
				+ " <if test=\" IndustryBranch != null \"> IndustryBranch = #{IndustryBranch}, </if> "
				+ " <if test=\" SpecialCommittee != null \"> SpecialCommittee = #{SpecialCommittee}, </if> "
				+ " <if test=\" SpecialIdentity != null \"> SpecialIdentity = #{SpecialIdentity}, </if> "
				+ " <if test=\" NameOfRecommending != null \"> NameOfRecommending = #{NameOfRecommending}, </if> "
				+ " <if test=\" TypeOfRecommending != null \"> TypeOfRecommending = #{TypeOfRecommending}, </if> "
				+ " <if test=\" Content != null \"> Content = #{Content}, </if> "
				+ " <if test=\" Mail != null \"> Mail = #{Mail}, </if> "
				+ " <if test=\" Address != null \"> Address = #{Address}, </if> "
				+ " <if test=\" NameOfWechat != null \"> NameOfWechat = #{NameOfWechat}, </if> "
				+ " <if test=\" Status != null \"> Status = #{Status}, </if> "
				+ " <if test=\" Account != null \"> Account = #{Account}, </if> "
				+ " <if test=\" Password != null \"> Password = #{Password}, </if> "
				+ " <if test=\" Type != null \"> Type = #{Type}, </if> "
				+ " <if test=\" Company != null \"> Company = #{Company}, </if> "
				+ " <if test=\" Title != null \"> Title = #{Title}, </if> "
				+ " <if test=\" Job != null \"> Job = #{Job}, </if> "
			+ " </set> "
			+ " WHERE SerialNumber = #{SerialNumber} "
			+ "</script>")
	int update(User user) throws Exception;

	/**
	 * @Title	delete
	 * @Description	根据SerialNumber删除数据
	 * @param SerialNumber
	 * @throws Exception
	 * @return	int
	 */
	@Delete(value = "DELETE from user where SerialNumber = #{SerialNumber}")
	int delete(Integer SerialNumber) throws Exception;
}