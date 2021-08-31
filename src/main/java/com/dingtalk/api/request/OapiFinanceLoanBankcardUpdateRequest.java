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

import com.dingtalk.api.response.OapiFinanceLoanBankcardUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.bankcard.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.18
 */
public class OapiFinanceLoanBankcardUpdateRequest extends BaseTaobaoRequest<OapiFinanceLoanBankcardUpdateResponse> {
	
	

	/** 
	* 银行编码
	 */
	private String bankCode;

	/** 
	* 银行名称
	 */
	private String bankName;

	/** 
	* 银行卡id
	 */
	private Long bankcardId;

	/** 
	* 银行预留手机号
	 */
	private String bankcardMobile;

	/** 
	* 银行卡号
	 */
	private String bankcardNo;

	/** 
	* 钉钉客户唯一身份标识
	 */
	private String idCardNo;

	/** 
	* 手机号
	 */
	private String userMobile;

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankcardId(Long bankcardId) {
		this.bankcardId = bankcardId;
	}

	public Long getBankcardId() {
		return this.bankcardId;
	}

	public void setBankcardMobile(String bankcardMobile) {
		this.bankcardMobile = bankcardMobile;
	}

	public String getBankcardMobile() {
		return this.bankcardMobile;
	}

	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	public String getBankcardNo() {
		return this.bankcardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.loan.bankcard.update";
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
		txtParams.put("bank_code", this.bankCode);
		txtParams.put("bank_name", this.bankName);
		txtParams.put("bankcard_id", this.bankcardId);
		txtParams.put("bankcard_mobile", this.bankcardMobile);
		txtParams.put("bankcard_no", this.bankcardNo);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("user_mobile", this.userMobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceLoanBankcardUpdateResponse> getResponseClass() {
		return OapiFinanceLoanBankcardUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bankCode, "bankCode");
		RequestCheckUtils.checkNotEmpty(bankName, "bankName");
		RequestCheckUtils.checkNotEmpty(bankcardId, "bankcardId");
		RequestCheckUtils.checkNotEmpty(bankcardMobile, "bankcardMobile");
		RequestCheckUtils.checkNotEmpty(bankcardNo, "bankcardNo");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
	}
	

}