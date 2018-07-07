package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.OpinionDAO;
import com.example.demo.dao.ProposalNormDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.entity.Opinion;
import com.example.demo.entity.ProposalNorm;
import com.example.demo.entity.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleApplicationTests {

	@Autowired
    private UserDAO userDao;

	@Autowired
	private ProposalNormDAO proposalNormDAO;

	@Autowired
	private OpinionDAO opinionDAO;

    @Test
    public void contextLoads() {
    	try {
			testUser();
			testProposalNorm();
			testOpinion();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    /**
     * @Title	testUser
     * @Description	测试用户信息操作
     * @throws Exception
     * @return	void
     */
    public void testUser() throws Exception {
    	System.err.println("**********************************************");
    	System.err.println("*****************正在进行用户信息操作*****************");
    	System.err.println("**********************************************");
    	System.err.println("*******************测试添加**********************");
    	User user = new User();
    	user.setName("测试用户");
    	user.setBirthDate("2018-01-01");
    	userDao.insert(user);
    	System.err.println("********************添加完成**********************");
    	System.err.println("*******************测试分页查询**********************");
    	User user2 = new User();
    	user2.setOffest(0);
    	user2.setLimit(3);
    	System.err.println("用户信息数据总条数:" + userDao.count(user2));
    	System.err.println("*******************只查询三条数据**********************");
    	List<User> users = userDao.query(user2);
    	System.err.println("**********************查询结果**********************");
    	System.err.println("*******************users.size():" + users.size() + "******************");
    	System.err.println(JSONObject.toJSONString(users));
    	System.err.println("*******************分页查询完成*********************");
    	System.err.println("*******************测试修改**********************");
    	users.get(users.size() - 1).setName("修改了查询到的最后一条数据");
    	userDao.update(users.get(users.size() - 1));
    	System.err.println("*******************修改完成,查询出来看看结果**********************");
    	List<User> users2 = userDao.query(user2);
    	System.err.println(JSONObject.toJSONString(users2));
    	System.err.println("*******************上面是结果,现在删除它**********************");
    	userDao.delete(users2.get(users2.size() - 1).getSerialNumber());
    	System.err.println("**********************删除完成**********************");
    	System.err.println("**********************************************");
    	System.err.println("******************用户信息操作已完成******************");
    	System.err.println("**********************************************");
    }

    /**
     * @Title	testProposalNorm
     * @Description	测试提案/规范信息操作
     * @throws Exception
     * @return	void
     */
    public void testProposalNorm() throws Exception {
    	System.err.println("**********************************************");
    	System.err.println("*****************正在进行提案/规范信息操作*****************");
    	System.err.println("**********************************************");
    	System.err.println("*******************测试添加**********************");
    	ProposalNorm proposalNorm = new ProposalNorm();
    	proposalNorm.setEssayName("测试提案/规范");
    	proposalNorm.setContent("内容啊啊啊啊啊啊啊啊啊啊啊啊");
    	proposalNormDAO.insert(proposalNorm);
    	System.err.println("********************添加完成**********************");
    	System.err.println("*******************测试分页查询**********************");
    	ProposalNorm proposalNorm2 = new ProposalNorm();
    	proposalNorm2.setOffest(0);
    	proposalNorm2.setLimit(3);
    	System.err.println("提案/规范信息数据总条数:" + proposalNormDAO.count(proposalNorm2));
    	System.err.println("*******************只查询三条数据**********************");
    	List<ProposalNorm> proposalNorms = proposalNormDAO.query(proposalNorm2);
    	System.err.println("**********************查询结果**********************");
    	System.err.println("*******************proposalNorms.size():" + proposalNorms.size() + "******************");
    	System.err.println(JSONObject.toJSONString(proposalNorms));
    	System.err.println("*******************分页查询完成*********************");
    	System.err.println("*******************测试修改**********************");
    	proposalNorms.get(proposalNorms.size() - 1).setContent("修改了查询到的最后一条数据");
    	proposalNormDAO.update(proposalNorms.get(proposalNorms.size() - 1));
    	System.err.println("*******************修改完成,查询出来看看结果**********************");
    	List<ProposalNorm> proposalNorms2 = proposalNormDAO.query(proposalNorm2);
    	System.err.println(JSONObject.toJSONString(proposalNorms2));
    	System.err.println("*******************上面是结果,现在删除它**********************");
    	proposalNormDAO.delete(proposalNorms2.get(proposalNorms2.size() - 1).getSerialNumber());
    	System.err.println("**********************删除完成**********************");
    	System.err.println("**********************************************");
    	System.err.println("******************提案/规范信息操作已完成******************");
    	System.err.println("**********************************************");
    }

    /**
     * @Title	testOpinion
     * @Description	测试附议信息
     * @throws Exception
     * @return	void
     */
    public void testOpinion() throws Exception {
    	System.err.println("**********************************************");
    	System.err.println("*****************正在进行附议信息操作*****************");
    	System.err.println("**********************************************");
    	System.err.println("*******************测试添加**********************");
    	Opinion opinion = new Opinion();
    	opinion.setContent("内容啊啊啊啊啊啊啊啊啊啊啊啊");
    	opinionDAO.insert(opinion);
    	System.err.println("********************添加完成**********************");
    	System.err.println("*******************测试分页查询**********************");
    	Opinion opinion2 = new Opinion();
    	opinion2.setOffest(0);
    	opinion2.setLimit(3);
    	System.err.println("附议信息数据总条数:" + opinionDAO.count(opinion2));
    	System.err.println("*******************只查询三条数据**********************");
    	List<Opinion> opinions = opinionDAO.query(opinion2);
    	System.err.println("**********************查询结果**********************");
    	System.err.println("*******************opinions.size():" + opinions.size() + "******************");
    	System.err.println(JSONObject.toJSONString(opinions));
    	System.err.println("*******************分页查询完成*********************");
    	System.err.println("*******************测试修改**********************");
    	opinions.get(opinions.size() - 1).setContent("修改了查询到的最后一条数据");
    	opinionDAO.update(opinions.get(opinions.size() - 1));
    	System.err.println("*******************修改完成,查询出来看看结果**********************");
    	List<Opinion> opinions2 = opinionDAO.query(opinion2);
    	System.err.println(JSONObject.toJSONString(opinions2));
    	System.err.println("*******************上面是结果,现在删除它**********************");
    	opinionDAO.delete(opinions2.get(opinions2.size() - 1).getSerialNumber());
    	System.err.println("**********************删除完成**********************");
    	System.err.println("**********************************************");
    	System.err.println("******************附议信息操作已完成******************");
    	System.err.println("**********************************************");
    }
}