package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.devicemember.removeall response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceDevicememberRemoveallResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8187422461916993469L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 本次操作结果
	 */
	@ApiField("result")
	private Boolean result;


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

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
