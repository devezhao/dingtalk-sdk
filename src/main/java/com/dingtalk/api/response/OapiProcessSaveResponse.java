package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.save response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessSaveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5517531358681344793L;

	/** 
	 * 0
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 成功
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ProcessTopVo result;


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

	public void setResult(ProcessTopVo result) {
		this.result = result;
	}
	public ProcessTopVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessTopVo extends TaobaoObject {
		private static final long serialVersionUID = 2319216114995241217L;
		/**
		 * 审批模板唯一码
		 */
		@ApiField("process_code")
		private String processCode;
	
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	


}
