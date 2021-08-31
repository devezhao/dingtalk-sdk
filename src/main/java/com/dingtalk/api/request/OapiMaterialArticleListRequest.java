package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMaterialArticleListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.article.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.06.28
 */
public class OapiMaterialArticleListRequest extends BaseTaobaoRequest<OapiMaterialArticleListResponse> {
	
	

	/** 
	* 每页条数
	 */
	private Long pageSize;

	/** 
	* 页码
	 */
	private Long pageStart;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageStart(Long pageStart) {
		this.pageStart = pageStart;
	}

	public Long getPageStart() {
		return this.pageStart;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.material.article.list";
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
		txtParams.put("page_size", this.pageSize);
		txtParams.put("page_start", this.pageStart);
		txtParams.put("unionid", this.unionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMaterialArticleListResponse> getResponseClass() {
		return OapiMaterialArticleListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkMaxValue(pageSize, 20L, "pageSize");
		RequestCheckUtils.checkNotEmpty(pageStart, "pageStart");
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
	}
	

}