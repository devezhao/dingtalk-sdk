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
import com.dingtalk.api.response.OapiSmartdeviceAtmachineGetByUseridResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.atmachine.get_by_userid request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.09
 */
public class OapiSmartdeviceAtmachineGetByUseridRequest extends BaseTaobaoRequest<OapiSmartdeviceAtmachineGetByUseridResponse> {
	
	

	/** 
	* 查询智能考勤机列表参数模型
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(UserMachineInfoRequestVo param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.atmachine.get_by_userid";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceAtmachineGetByUseridResponse> getResponseClass() {
		return OapiSmartdeviceAtmachineGetByUseridResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 查询智能考勤机列表参数模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserMachineInfoRequestVo extends TaobaoObject {
		private static final long serialVersionUID = 5567486699555441432L;
		/**
		 * 偏移值
		 */
		@ApiField("offset")
		private Long offset;
		/**
		 * 每页大小
		 */
		@ApiField("size")
		private Long size;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getOffset() {
			return this.offset;
		}
		public void setOffset(Long offset) {
			this.offset = offset;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}