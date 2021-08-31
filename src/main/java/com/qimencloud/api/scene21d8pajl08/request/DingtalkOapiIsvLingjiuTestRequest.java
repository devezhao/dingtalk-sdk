package com.qimencloud.api.scene21d8pajl08.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.Constants;


import com.qimencloud.api.scene21d8pajl08.response.DingtalkOapiIsvLingjiuTestResponse;

/**
 * TOP API(QimenCloud): dingtalk.oapi.isv.lingjiu.test request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.04
 */
public class DingtalkOapiIsvLingjiuTestRequest extends BaseTaobaoRequest<DingtalkOapiIsvLingjiuTestResponse> {
     
     

     public String getApiMethodName() {
        return "dingtalk.oapi.isv.lingjiu.test";
     }

     private String topContentType ;

     public String getTopContentType() {
        return topContentType;
     }

     public void setTopContentType(String topContentType) {
         this.topContentType = topContentType;
     }

     private String topResponseType = Constants.RESPONSE_TYPE_QIMEN;

     public String getTopResponseType() {
        return topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

    private String topApiVersion = "2.0";

     public String getTopApiVersion() {
        return this.topApiVersion;
     }

     public void setTopApiVersion(String topApiVersion) {
        this.topApiVersion = topApiVersion;
     }

     private String topApiFormat ;

     public String getTopApiFormat() {
     	return this.topApiFormat;
     }

     public void setTopApiFormat(String topApiFormat) {
     	this.topApiFormat = topApiFormat;
     }
     
     public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
     
     public Class<DingtalkOapiIsvLingjiuTestResponse> getResponseClass() {
		return DingtalkOapiIsvLingjiuTestResponse.class;
	}

     public void check() throws ApiRuleException {
     }
     


}