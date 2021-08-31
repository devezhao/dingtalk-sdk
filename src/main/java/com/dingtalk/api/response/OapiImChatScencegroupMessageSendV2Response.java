package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.message.send_v2 response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatScencegroupMessageSendV2Response extends TaobaoResponse {

	private static final long serialVersionUID = 1284612962786525892L;

	/** 
	 * 统一错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 开发消息ID
	 */
	@ApiField("open_msg_id")
	private String openMsgId;

	/** 
	 * 成功
	 */
	@ApiField("succ")
	private Boolean succ;


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

	public void setOpenMsgId(String openMsgId) {
		this.openMsgId = openMsgId;
	}
	public String getOpenMsgId( ) {
		return this.openMsgId;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}
	public Boolean getSucc( ) {
		return this.succ;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
