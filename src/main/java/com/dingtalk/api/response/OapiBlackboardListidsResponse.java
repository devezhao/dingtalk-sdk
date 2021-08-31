package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.listids response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiBlackboardListidsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3272796453726193695L;

	/** 
	 * 请求失败的错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 请求失败的错误原因
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * success为true时，返回公告id列表。否则值为空
	 */
	@ApiListField("result")
	@ApiField("string")
	private List<String> result;

	/** 
	 * 本次调用是否成功，该值为false时，根据errcode和errMsg排查失败原因
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

	public void setResult(List<String> result) {
		this.result = result;
	}
	public List<String> getResult( ) {
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
	


}
