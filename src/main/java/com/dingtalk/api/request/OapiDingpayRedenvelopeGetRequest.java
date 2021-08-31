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

import com.dingtalk.api.response.OapiDingpayRedenvelopeGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.redenvelope.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.20
 */
public class OapiDingpayRedenvelopeGetRequest extends BaseTaobaoRequest<OapiDingpayRedenvelopeGetResponse> {
	
	

	/** 
	* 企业订单号
	 */
	private String corpBizNo;

	public void setCorpBizNo(String corpBizNo) {
		this.corpBizNo = corpBizNo;
	}

	public String getCorpBizNo() {
		return this.corpBizNo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.redenvelope.get";
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
		txtParams.put("corp_biz_no", this.corpBizNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayRedenvelopeGetResponse> getResponseClass() {
		return OapiDingpayRedenvelopeGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpBizNo, "corpBizNo");
	}
	

}