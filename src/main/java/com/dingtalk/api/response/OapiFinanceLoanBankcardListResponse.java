package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.bankcard.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceLoanBankcardListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6684894978497317797L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 银行卡查询结果
	 */
	@ApiField("result")
	private OpenBankcardQueryResult result;

	/** 
	 * true 成功，false 异常
	 */
	@ApiField("success")
	private Boolean success;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(OpenBankcardQueryResult result) {
		this.result = result;
	}
	public OpenBankcardQueryResult getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 银行卡模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenBankcardInfo extends TaobaoObject {
		private static final long serialVersionUID = 6393984962658733619L;
		/**
		 * 银行编码
		 */
		@ApiField("bank_code")
		private String bankCode;
		/**
		 * 银行名称
		 */
		@ApiField("bank_name")
		private String bankName;
		/**
		 * 银行卡id
		 */
		@ApiField("bankcard_id")
		private Long bankcardId;
		/**
		 * 银行预留手机号
		 */
		@ApiField("bankcard_mobile")
		private String bankcardMobile;
		/**
		 * 银行卡号
		 */
		@ApiField("bankcard_no")
		private String bankcardNo;
	
		public String getBankCode() {
			return this.bankCode;
		}
		public void setBankCode(String bankCode) {
			this.bankCode = bankCode;
		}
		public String getBankName() {
			return this.bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public Long getBankcardId() {
			return this.bankcardId;
		}
		public void setBankcardId(Long bankcardId) {
			this.bankcardId = bankcardId;
		}
		public String getBankcardMobile() {
			return this.bankcardMobile;
		}
		public void setBankcardMobile(String bankcardMobile) {
			this.bankcardMobile = bankcardMobile;
		}
		public String getBankcardNo() {
			return this.bankcardNo;
		}
		public void setBankcardNo(String bankcardNo) {
			this.bankcardNo = bankcardNo;
		}
	}
	
	/**
	 * 银行卡查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenBankcardQueryResult extends TaobaoObject {
		private static final long serialVersionUID = 8747167677796959446L;
		/**
		 * 银行卡模型
		 */
		@ApiListField("bankcard_list")
		@ApiField("open_bankcard_info")
		private List<OpenBankcardInfo> bankcardList;
	
		public List<OpenBankcardInfo> getBankcardList() {
			return this.bankcardList;
		}
		public void setBankcardList(List<OpenBankcardInfo> bankcardList) {
			this.bankcardList = bankcardList;
		}
	}
	


}
