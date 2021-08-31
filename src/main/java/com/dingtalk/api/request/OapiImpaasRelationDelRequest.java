package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiImpaasRelationDelResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.relation.del request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasRelationDelRequest extends BaseTaobaoRequest<OapiImpaasRelationDelResponse> {
	
	

	/** 
	* 关系
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(DelRelationReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.relation.del";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasRelationDelResponse> getResponseClass() {
		return OapiImpaasRelationDelResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 关系
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DelRelationReq extends TaobaoObject {
		private static final long serialVersionUID = 7176937445813186638L;
		/**
		 * 接受者的im的openid
		 */
		@ApiField("dst_im_openid")
		private String dstImOpenid;
		/**
		 * 是否双向关系
		 */
		@ApiField("is_double_way")
		private Boolean isDoubleWay;
		/**
		 * 发送者的im的openid
		 */
		@ApiField("src_im_openid")
		private String srcImOpenid;
	
		public String getDstImOpenid() {
			return this.dstImOpenid;
		}
		public void setDstImOpenid(String dstImOpenid) {
			this.dstImOpenid = dstImOpenid;
		}
		public Boolean getIsDoubleWay() {
			return this.isDoubleWay;
		}
		public void setIsDoubleWay(Boolean isDoubleWay) {
			this.isDoubleWay = isDoubleWay;
		}
		public String getSrcImOpenid() {
			return this.srcImOpenid;
		}
		public void setSrcImOpenid(String srcImOpenid) {
			this.srcImOpenid = srcImOpenid;
		}
	}
	

}