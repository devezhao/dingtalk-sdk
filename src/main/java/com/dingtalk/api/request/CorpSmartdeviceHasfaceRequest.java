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

import com.dingtalk.api.response.CorpSmartdeviceHasfaceResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.smartdevice.hasface request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.17
 */
public class CorpSmartdeviceHasfaceRequest extends BaseTaobaoRequest<CorpSmartdeviceHasfaceResponse> {
	
	

	/** 
	* 查询用userid列表
	 */
	private String useridList;

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.smartdevice.hasface";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpSmartdeviceHasfaceResponse> getResponseClass() {
		return CorpSmartdeviceHasfaceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(useridList, "useridList");
		RequestCheckUtils.checkMaxListSize(useridList, 100, "useridList");
	}
	

}