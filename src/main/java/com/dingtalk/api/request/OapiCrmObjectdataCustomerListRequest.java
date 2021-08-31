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

import com.dingtalk.api.response.OapiCrmObjectdataCustomerListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.customer.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.28
 */
public class OapiCrmObjectdataCustomerListRequest extends BaseTaobaoRequest<OapiCrmObjectdataCustomerListResponse> {
	
	

	/** 
	* 操作人用户ID
	 */
	private String currentOperatorUserid;

	/** 
	* 数据ID列表
	 */
	private String dataIdList;

	public void setCurrentOperatorUserid(String currentOperatorUserid) {
		this.currentOperatorUserid = currentOperatorUserid;
	}

	public String getCurrentOperatorUserid() {
		return this.currentOperatorUserid;
	}

	public void setDataIdList(String dataIdList) {
		this.dataIdList = dataIdList;
	}

	public String getDataIdList() {
		return this.dataIdList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.objectdata.customer.list";
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
		txtParams.put("current_operator_userid", this.currentOperatorUserid);
		txtParams.put("data_id_list", this.dataIdList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmObjectdataCustomerListResponse> getResponseClass() {
		return OapiCrmObjectdataCustomerListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dataIdList, "dataIdList");
		RequestCheckUtils.checkMaxListSize(dataIdList, 100, "dataIdList");
	}
	

}