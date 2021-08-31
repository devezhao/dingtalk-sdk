package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiHireGuideBeginnertaskFinishResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hire.guide.beginnertask.finish request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.11
 */
public class OapiHireGuideBeginnertaskFinishRequest extends BaseTaobaoRequest<OapiHireGuideBeginnertaskFinishResponse> {
	
	

	/** 
	* 任务编码
	 */
	private String taskCode;

	/** 
	* 任务类型：0表示基础任务，1表示高阶任务
	 */
	private Long taskType;

	/** 
	* 员工标识
	 */
	private String userid;

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskCode() {
		return this.taskCode;
	}

	public void setTaskType(Long taskType) {
		this.taskType = taskType;
	}

	public Long getTaskType() {
		return this.taskType;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.hire.guide.beginnertask.finish";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("task_code", this.taskCode);
		txtParams.put("task_type", this.taskType);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHireGuideBeginnertaskFinishResponse> getResponseClass() {
		return OapiHireGuideBeginnertaskFinishResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(taskCode, "taskCode");
		RequestCheckUtils.checkNotEmpty(taskType, "taskType");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}