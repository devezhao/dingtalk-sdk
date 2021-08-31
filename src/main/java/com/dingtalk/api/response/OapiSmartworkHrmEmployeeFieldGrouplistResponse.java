package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.field.grouplist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeFieldGrouplistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5127776641762521324L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果集
	 */
	@ApiListField("result")
	@ApiField("group_meta_info")
	private List<GroupMetaInfo> result;

	/** 
	 * 成功标记
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

	public void setResult(List<GroupMetaInfo> result) {
		this.result = result;
	}
	public List<GroupMetaInfo> getResult( ) {
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
	 * 组里面的字段集合
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FieldMetaInfo extends TaobaoObject {
		private static final long serialVersionUID = 6113241269317715542L;
		/**
		 * 字段code
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段描述
		 */
		@ApiField("field_name")
		private String fieldName;
		/**
		 * 字段类型
		 */
		@ApiField("field_type")
		private String fieldType;
		/**
		 * 选择字段值
		 */
		@ApiField("option_text")
		private String optionText;
	
		public String getFieldCode() {
			return this.fieldCode;
		}
		public void setFieldCode(String fieldCode) {
			this.fieldCode = fieldCode;
		}
		public String getFieldName() {
			return this.fieldName;
		}
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		public String getFieldType() {
			return this.fieldType;
		}
		public void setFieldType(String fieldType) {
			this.fieldType = fieldType;
		}
		public String getOptionText() {
			return this.optionText;
		}
		public void setOptionText(String optionText) {
			this.optionText = optionText;
		}
	}
	
	/**
	 * 结果集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMetaInfo extends TaobaoObject {
		private static final long serialVersionUID = 5132744882826828526L;
		/**
		 * 组里面的字段集合
		 */
		@ApiListField("field_list")
		@ApiField("field_meta_info")
		private List<FieldMetaInfo> fieldList;
		/**
		 * 字段组ID
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 是否支持明细
		 */
		@ApiField("has_detail")
		private Boolean hasDetail;
	
		public List<FieldMetaInfo> getFieldList() {
			return this.fieldList;
		}
		public void setFieldList(List<FieldMetaInfo> fieldList) {
			this.fieldList = fieldList;
		}
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public Boolean getHasDetail() {
			return this.hasDetail;
		}
		public void setHasDetail(Boolean hasDetail) {
			this.hasDetail = hasDetail;
		}
	}
	


}
