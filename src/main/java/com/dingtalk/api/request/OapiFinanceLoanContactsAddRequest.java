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

import com.dingtalk.api.response.OapiFinanceLoanContactsAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.contacts.add request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.18
 */
public class OapiFinanceLoanContactsAddRequest extends BaseTaobaoRequest<OapiFinanceLoanContactsAddResponse> {
	
	

	/** 
	* 联系人手机号
	 */
	private String contactMobile;

	/** 
	* 钉钉客户唯一身份标识
	 */
	private String idCardNo;

	/** 
	* 联系人职业
	 */
	private String userCategory;

	/** 
	* 手机号
	 */
	private String userMobile;

	/** 
	* 联系人姓名
	 */
	private String userName;

	/** 
	* 联系人关系：配偶、父母、子女、朋友、同事、同学、其他家庭联系人、其他血亲、其他姻亲
	 */
	private String userRelation;

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	public String getUserCategory() {
		return this.userCategory;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserRelation(String userRelation) {
		this.userRelation = userRelation;
	}

	public String getUserRelation() {
		return this.userRelation;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.loan.contacts.add";
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
		txtParams.put("contact_mobile", this.contactMobile);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("user_category", this.userCategory);
		txtParams.put("user_mobile", this.userMobile);
		txtParams.put("user_name", this.userName);
		txtParams.put("user_relation", this.userRelation);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceLoanContactsAddResponse> getResponseClass() {
		return OapiFinanceLoanContactsAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(contactMobile, "contactMobile");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(userCategory, "userCategory");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
		RequestCheckUtils.checkNotEmpty(userName, "userName");
		RequestCheckUtils.checkNotEmpty(userRelation, "userRelation");
	}
	

}