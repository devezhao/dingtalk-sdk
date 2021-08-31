package com.qimencloud.api.scenen95wrxpkif.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API(QimenCloud): cilai.dingtalk.test response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CilaiDingtalkTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8383238473489474541L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private String errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}
	


}
