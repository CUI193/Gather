package com.youngball.Gather.service;

import java.util.List;

import com.youngball.Gather.domain.Page;
import com.youngball.Gather.domain.Question;
import com.youngball.Gather.domain.Survey;
import com.youngball.Gather.domain.User;

public interface SurveyService {

	/**
	 * 新建调查
	 * @param user
	 * @return
	 */
	public Survey addSurvey(User user);

	/**
	 * 查询指定用户的调查集合
	 * @param user
	 * @return
	 */
	public List<Survey> findSurveysByUid(User user);

	/**
	 * 按照id查询调查
	 * @param sid
	 * @return
	 */
	public Survey getSurvey(Integer sid);
	
	public Survey getSurveyWithChildren(Integer sid);

	/**
	 * 更新调查
	 * @param model
	 */
	public void updateSurvey(Survey model);

	/**
	 * 保存,更新页面
	 * @param model
	 */
	public void saveOrUpdatePage(Page model);

	/**
	 * 编辑页面标题 
	 * @return
	 */
	public Page getPage(Integer pid);

	/**
	 * 保存更新问题
	 * @param model
	 */
	public void saveOrUpdateQuestion(Question model);

	/**
	 * 删除问题
	 * @param qid
	 */
	public void deleteQuestion(Integer qid);

	/**
	 * 编辑问题
	 * @param qid
	 * @return
	 */
	public Question getQuestion(Integer qid);

	/**
	 * 删除页面
	 * @param pid
	 */
	public void deletePage(Integer pid);

}
