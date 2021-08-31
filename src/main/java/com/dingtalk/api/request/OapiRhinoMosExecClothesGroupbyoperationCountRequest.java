package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiRhinoMosExecClothesGroupbyoperationCountResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.groupbyoperation.count request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.07
 */
public class OapiRhinoMosExecClothesGroupbyoperationCountRequest extends BaseTaobaoRequest<OapiRhinoMosExecClothesGroupbyoperationCountResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(ClothesGroupByOperationCondition request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.clothes.groupbyoperation.count";
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

	public Class<OapiRhinoMosExecClothesGroupbyoperationCountResponse> getResponseClass() {
		return OapiRhinoMosExecClothesGroupbyoperationCountResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClothesGroupByOperationCondition extends TaobaoObject {
		private static final long serialVersionUID = 6185617262321537166L;
		/**
		 * 工序生效条件(ACTIVEINACTIVE)
		 */
		@ApiField("active_condition")
		private String activeCondition;
		/**
		 * 衣服生产状态列表
		 */
		@ApiListField("clothes_status_list")
		@ApiField("string")
		private List<String> clothesStatusList;
		/**
		 * 订单ID
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 工序执行状态
		 */
		@ApiListField("perform_status_list")
		@ApiField("string")
		private List<String> performStatusList;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * userid
		 */
		@ApiField("userid")
		private String userid;
	
		public String getActiveCondition() {
			return this.activeCondition;
		}
		public void setActiveCondition(String activeCondition) {
			this.activeCondition = activeCondition;
		}
		public List<String> getClothesStatusList() {
			return this.clothesStatusList;
		}
		public void setClothesStatusList(List<String> clothesStatusList) {
			this.clothesStatusList = clothesStatusList;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public List<String> getPerformStatusList() {
			return this.performStatusList;
		}
		public void setPerformStatusList(List<String> performStatusList) {
			this.performStatusList = performStatusList;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}