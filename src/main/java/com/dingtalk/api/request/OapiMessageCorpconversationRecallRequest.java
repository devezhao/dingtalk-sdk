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

import com.dingtalk.api.response.OapiMessageCorpconversationRecallResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.corpconversation.recall request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiMessageCorpconversationRecallRequest extends BaseTaobaoRequest<OapiMessageCorpconversationRecallResponse> {
	
	

	/** 
	* 发送工作通知的微应用agentId
	 */
	private Long agentId;

	/** 
	* 发送工作通知返回的taskId
	 */
	private Long msgTaskId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setMsgTaskId(Long msgTaskId) {
		this.msgTaskId = msgTaskId;
	}

	public Long getMsgTaskId() {
		return this.msgTaskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.corpconversation.recall";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("msg_task_id", this.msgTaskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageCorpconversationRecallResponse> getResponseClass() {
		return OapiMessageCorpconversationRecallResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(msgTaskId, "msgTaskId");
	}
	

}