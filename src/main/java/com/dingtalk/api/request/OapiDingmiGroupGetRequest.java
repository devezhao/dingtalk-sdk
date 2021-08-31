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

import com.dingtalk.api.response.OapiDingmiGroupGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.group.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.24
 */
public class OapiDingmiGroupGetRequest extends BaseTaobaoRequest<OapiDingmiGroupGetResponse> {
	
	

	/** 
	* 会话ID
	 */
	private String conversationId;

	/** 
	* ?期(YYYYMMDD格式)
	 */
	private String date;

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getConversationId() {
		return this.conversationId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingmi.group.get";
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
		txtParams.put("conversation_id", this.conversationId);
		txtParams.put("date", this.date);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingmiGroupGetResponse> getResponseClass() {
		return OapiDingmiGroupGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(conversationId, "conversationId");
		RequestCheckUtils.checkNotEmpty(date, "date");
	}
	

}