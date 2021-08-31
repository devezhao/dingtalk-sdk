package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.custom.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappCustomDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7538729416499388957L;

	/** 
	 * 错误码文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 错误码
	 */
	@ApiField("errocde")
	private Long errocde;


	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setErrocde(Long errocde) {
		this.errocde = errocde;
	}
	public Long getErrocde( ) {
		return this.errocde;
	}

	
	


}
