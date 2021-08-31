package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiAtsPluginDataDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.plugin.data.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.02
 */
public class OapiAtsPluginDataDeleteRequest extends BaseTaobaoRequest<OapiAtsPluginDataDeleteResponse> {
	
	

	/** 
	* 业务唯一标识，接入前请提前沟通
	 */
	private String bizCode;

	/** 
	* 推送头信息
	 */
	private String header;

	/** 
	* 外部业务唯一ID
	 */
	private String outId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public void setHeader(PushHeaderVO header) {
		this.header = new JSONWriter(false,false,true).write(header);
	}

	public String getHeader() {
		return this.header;
	}

	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getOutId() {
		return this.outId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.plugin.data.delete";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("header", this.header);
		txtParams.put("out_id", this.outId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsPluginDataDeleteResponse> getResponseClass() {
		return OapiAtsPluginDataDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(outId, "outId");
	}
	
	/**
	 * 推送头信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PushHeaderVO extends TaobaoObject {
		private static final long serialVersionUID = 2478777455373511867L;
		/**
		 * 插件唯一标识，接入前请提前沟通
		 */
		@ApiField("plugin_code")
		private String pluginCode;
		/**
		 * schema唯一标识，接入前请提前沟通
		 */
		@ApiField("schema_id")
		private String schemaId;
	
		public String getPluginCode() {
			return this.pluginCode;
		}
		public void setPluginCode(String pluginCode) {
			this.pluginCode = pluginCode;
		}
		public String getSchemaId() {
			return this.schemaId;
		}
		public void setSchemaId(String schemaId) {
			this.schemaId = schemaId;
		}
	}
	

}