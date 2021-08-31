package com.dingtalk.api.request;

import java.util.List;
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
import com.dingtalk.api.response.OapiSmartdeviceBatcheventPostResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.batchevent.post request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.25
 */
public class OapiSmartdeviceBatcheventPostRequest extends BaseTaobaoRequest<OapiSmartdeviceBatcheventPostResponse> {
	
	

	/** 
	* 自动创建
	 */
	private String deviceEventVos;

	public void setDeviceEventVos(String deviceEventVos) {
		this.deviceEventVos = deviceEventVos;
	}

	public void setDeviceEventVos(List<DeviceEventVo> deviceEventVos) {
		this.deviceEventVos = new JSONWriter(false,false,true).write(deviceEventVos);
	}

	public String getDeviceEventVos() {
		return this.deviceEventVos;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.batchevent.post";
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
		txtParams.put("device_event_vos", this.deviceEventVos);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceBatcheventPostResponse> getResponseClass() {
		return OapiSmartdeviceBatcheventPostResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(deviceEventVos, 999, "deviceEventVos");
	}
	
	/**
	 * 自动创建
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceEventVo extends TaobaoObject {
		private static final long serialVersionUID = 2451475112194449723L;
		/**
		 * json格式的数据体
		 */
		@ApiField("data")
		private String data;
		/**
		 * 设备名称
		 */
		@ApiField("dn")
		private String dn;
		/**
		 * 产品key
		 */
		@ApiField("pk")
		private String pk;
		/**
		 * 事件对应的topic
		 */
		@ApiField("topic")
		private String topic;
	
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getDn() {
			return this.dn;
		}
		public void setDn(String dn) {
			this.dn = dn;
		}
		public String getPk() {
			return this.pk;
		}
		public void setPk(String pk) {
			this.pk = pk;
		}
		public String getTopic() {
			return this.topic;
		}
		public void setTopic(String topic) {
			this.topic = topic;
		}
	}
	

}