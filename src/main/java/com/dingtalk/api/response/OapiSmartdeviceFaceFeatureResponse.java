package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.face.feature response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceFaceFeatureResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2475184269269329116L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 父对象
	 */
	@ApiListField("result")
	@ApiField("dido_feature_vo")
	private List<DidoFeatureVo> result;


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

	public void setResult(List<DidoFeatureVo> result) {
		this.result = result;
	}
	public List<DidoFeatureVo> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 父对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DidoFeatureVo extends TaobaoObject {
		private static final long serialVersionUID = 8518329938439998759L;
		/**
		 * 特征值
		 */
		@ApiField("feature_info")
		private String featureInfo;
		/**
		 * 用户ID
		 */
		@ApiField("userid")
		private String userid;
	
		public String getFeatureInfo() {
			return this.featureInfo;
		}
		public void setFeatureInfo(String featureInfo) {
			this.featureInfo = featureInfo;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
