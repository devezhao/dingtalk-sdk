package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
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
import com.dingtalk.api.response.OapiV2UserUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.10
 */
public class OapiV2UserUpdateRequest extends BaseTaobaoRequest<OapiV2UserUpdateResponse> {
	
	

	/** 
	* 所属部门id列表
	 */
	private String deptIdList;

	/** 
	* 员工在对应的部门中的排序。
	 */
	private String deptOrderList;

	/** 
	* 员工在对应的部门中的职位。
	 */
	private String deptTitleList;

	/** 
	* 员工邮箱，长度最大50个字符。企业内必须唯一，不可重复。
	 */
	private String email;

	/** 
	* 扩展属性，长度最大2000个字符。可以设置多种属性（手机上最多显示10个扩展属性，具体显示哪些属性，请到OA管理后台->设置->通讯录信息设置和OA管理后台->设置->手机端显示信息设置）。 该字段的值支持链接类型填写，同时链接支持变量通配符自动替换，目前支持通配符有：userid，corpid。示例： [工位地址](http:www.dingtalk.com?userid=#userid#&corpid=#corpid#)
	 */
	private String extension;

	/** 
	* 是否号码隐藏。隐藏手机号后，手机号在个人资料页隐藏，但仍可对其发DING、发起钉钉免费商务电话。
	 */
	private Boolean hideMobile;

	/** 
	* 入职时间，Unix时间戳，单位ms。
	 */
	private Long hiredDate;

	/** 
	* 重置专属帐号密码
	 */
	private String initPassword;

	/** 
	* 员工工号，长度最大50个字符。
	 */
	private String jobNumber;

	/** 
	* 语言
	 */
	private String language;

	/** 
	* 手机号码，企业内必须唯一，不可重复。如果是国际号码，请使用+xx-xxxxxx的格式
	 */
	private String mobile;

	/** 
	* 员工名称，长度最大80个字符。
	 */
	private String name;

	/** 
	* 员工的企业邮箱，长度最大100个字符。员工的企业邮箱已开通，才能增加此字段。
	 */
	private String orgEmail;

	/** 
	* 备注，长度最大2000个字符。
	 */
	private String remark;

	/** 
	* 是否高管模式。开启后，手机号码对所有员工隐藏。普通员工无法对其发DING、发起钉钉免费商务电话。高管之间不受影响。
	 */
	private Boolean seniorMode;

	/** 
	* 分机号，长度最大50个字符。企业内必须唯一，不可重复
	 */
	private String telephone;

	/** 
	* 职位，长度最大200个字符。
	 */
	private String title;

	/** 
	* 员工id，长度最大64个字符。员工在当前企业内的唯一标识。如果不传，服务器将自动生成一个userid。创建后不可修改，企业内必须唯一。
	 */
	private String userid;

	/** 
	* 办公地点，长度最大100个字符。
	 */
	private String workPlace;

	public void setDeptIdList(String deptIdList) {
		this.deptIdList = deptIdList;
	}

	public String getDeptIdList() {
		return this.deptIdList;
	}

	public void setDeptOrderList(String deptOrderList) {
		this.deptOrderList = deptOrderList;
	}

	public void setDeptOrderList(List<DeptOrder> deptOrderList) {
		this.deptOrderList = new JSONWriter(false,false,true).write(deptOrderList);
	}

	public String getDeptOrderList() {
		return this.deptOrderList;
	}

	public void setDeptTitleList(String deptTitleList) {
		this.deptTitleList = deptTitleList;
	}

	public void setDeptTitleList(List<DeptTitle> deptTitleList) {
		this.deptTitleList = new JSONWriter(false,false,true).write(deptTitleList);
	}

	public String getDeptTitleList() {
		return this.deptTitleList;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setExtensionString(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setHideMobile(Boolean hideMobile) {
		this.hideMobile = hideMobile;
	}

	public Boolean getHideMobile() {
		return this.hideMobile;
	}

	public void setHiredDate(Long hiredDate) {
		this.hiredDate = hiredDate;
	}

	public Long getHiredDate() {
		return this.hiredDate;
	}

	public void setInitPassword(String initPassword) {
		this.initPassword = initPassword;
	}

	public String getInitPassword() {
		return this.initPassword;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getJobNumber() {
		return this.jobNumber;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public String getOrgEmail() {
		return this.orgEmail;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setSeniorMode(Boolean seniorMode) {
		this.seniorMode = seniorMode;
	}

	public Boolean getSeniorMode() {
		return this.seniorMode;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getWorkPlace() {
		return this.workPlace;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.v2.user.update";
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
		txtParams.put("dept_id_list", this.deptIdList);
		txtParams.put("dept_order_list", this.deptOrderList);
		txtParams.put("dept_title_list", this.deptTitleList);
		txtParams.put("email", this.email);
		txtParams.put("extension", this.extension);
		txtParams.put("hide_mobile", this.hideMobile);
		txtParams.put("hired_date", this.hiredDate);
		txtParams.put("init_password", this.initPassword);
		txtParams.put("job_number", this.jobNumber);
		txtParams.put("language", this.language);
		txtParams.put("mobile", this.mobile);
		txtParams.put("name", this.name);
		txtParams.put("org_email", this.orgEmail);
		txtParams.put("remark", this.remark);
		txtParams.put("senior_mode", this.seniorMode);
		txtParams.put("telephone", this.telephone);
		txtParams.put("title", this.title);
		txtParams.put("userid", this.userid);
		txtParams.put("work_place", this.workPlace);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiV2UserUpdateResponse> getResponseClass() {
		return OapiV2UserUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(deptIdList, 300, "deptIdList");
		RequestCheckUtils.checkObjectMaxListSize(deptOrderList, 100, "deptOrderList");
		RequestCheckUtils.checkObjectMaxListSize(deptTitleList, 100, "deptTitleList");
		RequestCheckUtils.checkMaxLength(email, 50, "email");
		RequestCheckUtils.checkMinValue(hiredDate, 1L, "hiredDate");
		RequestCheckUtils.checkMaxLength(jobNumber, 50, "jobNumber");
		RequestCheckUtils.checkMaxLength(language, 6, "language");
		RequestCheckUtils.checkMaxLength(name, 80, "name");
		RequestCheckUtils.checkMaxLength(orgEmail, 100, "orgEmail");
		RequestCheckUtils.checkMaxLength(remark, 2000, "remark");
		RequestCheckUtils.checkMaxLength(telephone, 50, "telephone");
		RequestCheckUtils.checkMaxLength(title, 200, "title");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
		RequestCheckUtils.checkMaxLength(userid, 64, "userid");
		RequestCheckUtils.checkMaxLength(workPlace, 100, "workPlace");
	}
	
	/**
	 * 员工在对应的部门中的排序。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptOrder extends TaobaoObject {
		private static final long serialVersionUID = 2873277636884235423L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 员工在部门中的排序。
		 */
		@ApiField("order")
		private Long order;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public Long getOrder() {
			return this.order;
		}
		public void setOrder(Long order) {
			this.order = order;
		}
	}
	
	/**
	 * 员工在对应的部门中的职位。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptTitle extends TaobaoObject {
		private static final long serialVersionUID = 5435415662377825651L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 员工在部门中的职位。
		 */
		@ApiField("title")
		private String title;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}