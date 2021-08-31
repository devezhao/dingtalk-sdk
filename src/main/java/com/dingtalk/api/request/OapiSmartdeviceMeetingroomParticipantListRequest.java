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

import com.dingtalk.api.response.OapiSmartdeviceMeetingroomParticipantListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.meetingroom.participant.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.20
 */
public class OapiSmartdeviceMeetingroomParticipantListRequest extends BaseTaobaoRequest<OapiSmartdeviceMeetingroomParticipantListResponse> {
	
	

	/** 
	* 会议室预订id
	 */
	private String bookid;

	/** 
	* 分页游标
	 */
	private String cursor;

	/** 
	* 最大200(含)
	 */
	private Long size;

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookid() {
		return this.bookid;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.meetingroom.participant.list";
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
		txtParams.put("bookid", this.bookid);
		txtParams.put("cursor", this.cursor);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceMeetingroomParticipantListResponse> getResponseClass() {
		return OapiSmartdeviceMeetingroomParticipantListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bookid, "bookid");
		RequestCheckUtils.checkNotEmpty(size, "size");
	}
	

}