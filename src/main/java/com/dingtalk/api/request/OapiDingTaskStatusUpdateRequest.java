package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingTaskStatusUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ding.task.status.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiDingTaskStatusUpdateRequest extends BaseTaobaoRequest<OapiDingTaskStatusUpdateResponse> {
	
	

	/** 
	* 操作人id
	 */
	private String operatorUserid;

	/** 
	* 任务ID
	 */
	private String taskId;

	/** 
	* 任务状态:1-未完成;2-完成
	 */
	private Long taskStatus;

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskStatus(Long taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Long getTaskStatus() {
		return this.taskStatus;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ding.task.status.update";
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
		txtParams.put("operator_userid", this.operatorUserid);
		txtParams.put("task_id", this.taskId);
		txtParams.put("task_status", this.taskStatus);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingTaskStatusUpdateResponse> getResponseClass() {
		return OapiDingTaskStatusUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}