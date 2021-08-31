package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.contacts.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceLoanContactsListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8119224255794947317L;

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
	 * 查询返回数据模型
	 */
	@ApiField("result")
	private OpenContactInfoQueryResult result;

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

	public void setResult(OpenContactInfoQueryResult result) {
		this.result = result;
	}
	public OpenContactInfoQueryResult getResult( ) {
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
	 * 联系人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenContactInfo extends TaobaoObject {
		private static final long serialVersionUID = 3741868616651875157L;
		/**
		 * 联系人id
		 */
		@ApiField("contact_id")
		private Long contactId;
		/**
		 * 联系人职业
		 */
		@ApiField("user_category")
		private String userCategory;
		/**
		 * 联系人关系
		 */
		@ApiField("user_mobile")
		private String userMobile;
		/**
		 * 联系人姓名
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 联系人关系
		 */
		@ApiField("user_relation")
		private String userRelation;
	
		public Long getContactId() {
			return this.contactId;
		}
		public void setContactId(Long contactId) {
			this.contactId = contactId;
		}
		public String getUserCategory() {
			return this.userCategory;
		}
		public void setUserCategory(String userCategory) {
			this.userCategory = userCategory;
		}
		public String getUserMobile() {
			return this.userMobile;
		}
		public void setUserMobile(String userMobile) {
			this.userMobile = userMobile;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserRelation() {
			return this.userRelation;
		}
		public void setUserRelation(String userRelation) {
			this.userRelation = userRelation;
		}
	}
	
	/**
	 * 查询返回数据模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenContactInfoQueryResult extends TaobaoObject {
		private static final long serialVersionUID = 3895295968881683983L;
		/**
		 * 联系人列表
		 */
		@ApiListField("contact_info_list")
		@ApiField("open_contact_info")
		private List<OpenContactInfo> contactInfoList;
	
		public List<OpenContactInfo> getContactInfoList() {
			return this.contactInfoList;
		}
		public void setContactInfoList(List<OpenContactInfo> contactInfoList) {
			this.contactInfoList = contactInfoList;
		}
	}
	


}
