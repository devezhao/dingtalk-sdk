package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.ccoservice.servicegroup.addmember response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CcoserviceServicegroupAddmemberResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6616743535276544697L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private AddMembersResponseModel result;


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

	public void setResult(AddMembersResponseModel result) {
		this.result = result;
	}
	public AddMembersResponseModel getResult( ) {
		return this.result;
	}

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AddMembersResponseModel extends TaobaoObject {
		private static final long serialVersionUID = 1295111676882982259L;
		/**
		 * dingtalkId
		 */
		@ApiField("dingtalk_id")
		private String dingtalkId;
	
		public String getDingtalkId() {
			return this.dingtalkId;
		}
		public void setDingtalkId(String dingtalkId) {
			this.dingtalkId = dingtalkId;
		}
	}
	


}
