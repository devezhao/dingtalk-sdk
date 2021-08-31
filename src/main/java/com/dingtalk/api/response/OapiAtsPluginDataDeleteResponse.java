package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.plugin.data.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsPluginDataDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3656373434126984369L;

	/** 
	 * 返回值
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7828353414336823764L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误信息
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 数据ID，为空表示不存在
		 */
		@ApiField("result")
		private String result;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
			this.result = result;
		}
	}
	


}
