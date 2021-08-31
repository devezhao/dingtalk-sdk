package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.sendmock response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpMessageCorpconversationSendmockResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8399751537465796222L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private String result;


	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	
	


}
