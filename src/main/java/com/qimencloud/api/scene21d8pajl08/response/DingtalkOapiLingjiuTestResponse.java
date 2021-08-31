package com.qimencloud.api.scene21d8pajl08.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API(QimenCloud): dingtalk.oapi.lingjiu.test response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DingtalkOapiLingjiuTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6789216151195775636L;

	/** 
	 * aaa
	 */
	@ApiField("access_token")
	private String accessToken;


	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}
	


}
