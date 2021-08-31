package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.message.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatScencegroupMessageQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7428884299785179734L;

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
	 * 消息
	 */
	@ApiField("im_message")
	private OpenGroupMessageDto imMessage;

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

	public void setImMessage(OpenGroupMessageDto imMessage) {
		this.imMessage = imMessage;
	}
	public OpenGroupMessageDto getImMessage( ) {
		return this.imMessage;
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
	
	/**
	 * 消息的at人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGroupMessageAtUserDto extends TaobaoObject {
		private static final long serialVersionUID = 1854741779973912137L;
		/**
		 * unionId（如果没有userId则提供unionId)
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * userId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGroupMessageDto extends TaobaoObject {
		private static final long serialVersionUID = 5538795471986243489L;
		/**
		 * 消息的at人信息
		 */
		@ApiListField("at_users")
		@ApiField("open_group_message_at_user_dto")
		private List<OpenGroupMessageAtUserDto> atUsers;
	
		public List<OpenGroupMessageAtUserDto> getAtUsers() {
			return this.atUsers;
		}
		public void setAtUsers(List<OpenGroupMessageAtUserDto> atUsers) {
			this.atUsers = atUsers;
		}
	}
	


}
