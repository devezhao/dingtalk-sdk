package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.user.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduUserListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7323973455978189135L;

	/** 
	 * 错误码，只有当success为false时才有效
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息，只有当success为false时才有效
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果值
	 */
	@ApiField("result")
	private Result result;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 人员身份列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduUserDetail extends TaobaoObject {
		private static final long serialVersionUID = 6179871913953858965L;
		/**
		 * 班级id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 人员各个身份属性
		 */
		@ApiField("feature")
		private String feature;
		/**
		 * 在班级中的监护人名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 角色
		 */
		@ApiField("role")
		private String role;
		/**
		 * unionid
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * 人员id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getFeature() {
			return this.feature;
		}
		public void setFeature(String feature) {
			this.feature = feature;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRole() {
			return this.role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 结果值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 2477521817878633151L;
		/**
		 * 人员身份列表
		 */
		@ApiListField("details")
		@ApiField("open_edu_user_detail")
		private List<OpenEduUserDetail> details;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
	
		public List<OpenEduUserDetail> getDetails() {
			return this.details;
		}
		public void setDetails(List<OpenEduUserDetail> details) {
			this.details = details;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
	}
	


}
