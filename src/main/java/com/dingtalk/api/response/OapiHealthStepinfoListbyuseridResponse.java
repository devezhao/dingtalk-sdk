package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.health.stepinfo.listbyuserid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiHealthStepinfoListbyuseridResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8489416851436532919L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 步数列表
	 */
	@ApiListField("stepinfo_list")
	@ApiField("basic_step_info_vo")
	private List<BasicStepInfoVo> stepinfoList;


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

	public void setStepinfoList(List<BasicStepInfoVo> stepinfoList) {
		this.stepinfoList = stepinfoList;
	}
	public List<BasicStepInfoVo> getStepinfoList( ) {
		return this.stepinfoList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 步数列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BasicStepInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 2254525797485976476L;
		/**
		 * 统计的时间
		 */
		@ApiField("stat_date")
		private Long statDate;
		/**
		 * 步数
		 */
		@ApiField("step_count")
		private Long stepCount;
		/**
		 * 员工userid
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getStatDate() {
			return this.statDate;
		}
		public void setStatDate(Long statDate) {
			this.statDate = statDate;
		}
		public Long getStepCount() {
			return this.stepCount;
		}
		public void setStepCount(Long stepCount) {
			this.stepCount = stepCount;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
