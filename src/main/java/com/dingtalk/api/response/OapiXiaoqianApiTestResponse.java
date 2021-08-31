package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoqian.api.test response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiXiaoqianApiTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2313888464748594619L;

	/** 
	 * code
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * msg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * success
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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
