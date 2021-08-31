package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ddpaas.objectmeta.describe response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDdpaasObjectmetaDescribeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4526287345921571621L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 元数据信息
	 */
	@ApiField("result")
	private DObject result;


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

	public void setResult(DObject result) {
		this.result = result;
	}
	public DObject getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 选项列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Selectoptions extends TaobaoObject {
		private static final long serialVersionUID = 8472597355681432378L;
		/**
		 * 选项key
		 */
		@ApiField("key")
		private String key;
		/**
		 * 选项名
		 */
		@ApiField("value")
		private String value;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 引用的关联对象的字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Referencefields extends TaobaoObject {
		private static final long serialVersionUID = 4255791182496347615L;
		/**
		 * 引用的关联对象字段格式
		 */
		@ApiField("format")
		private String format;
		/**
		 * 引用的关联对象字段显示名
		 */
		@ApiField("label")
		private String label;
		/**
		 * 引用的关联对象的字段名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 引用的关联对象字段是否可空
		 */
		@ApiField("nillable")
		private Boolean nillable;
		/**
		 * 引用的关联对象的字段选项列表
		 */
		@ApiListField("select_options")
		@ApiField("selectoptions")
		private List<Selectoptions> selectOptions;
		/**
		 * 引用的关联对象字段类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 引用的关联对象字段单位
		 */
		@ApiField("unit")
		private String unit;
	
		public String getFormat() {
			return this.format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getNillable() {
			return this.nillable;
		}
		public void setNillable(Boolean nillable) {
			this.nillable = nillable;
		}
		public List<Selectoptions> getSelectOptions() {
			return this.selectOptions;
		}
		public void setSelectOptions(List<Selectoptions> selectOptions) {
			this.selectOptions = selectOptions;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 对MasterDetail类型有效：roll-up summary字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Rollupsummaryfields extends TaobaoObject {
		private static final long serialVersionUID = 6333638436128818672L;
		/**
		 * 汇总方法
		 */
		@ApiField("aggregator")
		private String aggregator;
		/**
		 * 需要汇总的明细内字段名
		 */
		@ApiField("name")
		private String name;
	
		public String getAggregator() {
			return this.aggregator;
		}
		public void setAggregator(String aggregator) {
			this.aggregator = aggregator;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Fields extends TaobaoObject {
		private static final long serialVersionUID = 2785982283411766197L;
		/**
		 * 是否自定义字段
		 */
		@ApiField("customized")
		private Boolean customized;
		/**
		 * 日期格式
		 */
		@ApiField("format")
		private String format;
		/**
		 * 字段展示名
		 */
		@ApiField("label")
		private String label;
		/**
		 * 字段名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否可空
		 */
		@ApiField("nillable")
		private Boolean nillable;
		/**
		 * 是否引用关联
		 */
		@ApiField("quote")
		private Boolean quote;
		/**
		 * 引用的关联对象的字段列表
		 */
		@ApiListField("reference_fields")
		@ApiField("referencefields")
		private List<Referencefields> referenceFields;
		/**
		 * 关联对象名称
		 */
		@ApiField("reference_to")
		private String referenceTo;
		/**
		 * 对MasterDetail类型有效：roll-up summary字段列表
		 */
		@ApiListField("roll_up_summary_fields")
		@ApiField("rollupsummaryfields")
		private List<Rollupsummaryfields> rollUpSummaryFields;
		/**
		 * 选项列表
		 */
		@ApiListField("select_options")
		@ApiField("selectoptions")
		private List<Selectoptions> selectOptions;
		/**
		 * 字段类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 日期单位金额单位
		 */
		@ApiField("unit")
		private String unit;
	
		public Boolean getCustomized() {
			return this.customized;
		}
		public void setCustomized(Boolean customized) {
			this.customized = customized;
		}
		public String getFormat() {
			return this.format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getNillable() {
			return this.nillable;
		}
		public void setNillable(Boolean nillable) {
			this.nillable = nillable;
		}
		public Boolean getQuote() {
			return this.quote;
		}
		public void setQuote(Boolean quote) {
			this.quote = quote;
		}
		public List<Referencefields> getReferenceFields() {
			return this.referenceFields;
		}
		public void setReferenceFields(List<Referencefields> referenceFields) {
			this.referenceFields = referenceFields;
		}
		public String getReferenceTo() {
			return this.referenceTo;
		}
		public void setReferenceTo(String referenceTo) {
			this.referenceTo = referenceTo;
		}
		public List<Rollupsummaryfields> getRollUpSummaryFields() {
			return this.rollUpSummaryFields;
		}
		public void setRollUpSummaryFields(List<Rollupsummaryfields> rollUpSummaryFields) {
			this.rollUpSummaryFields = rollUpSummaryFields;
		}
		public List<Selectoptions> getSelectOptions() {
			return this.selectOptions;
		}
		public void setSelectOptions(List<Selectoptions> selectOptions) {
			this.selectOptions = selectOptions;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 元数据信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DObject extends TaobaoObject {
		private static final long serialVersionUID = 6489259117175939467L;
		/**
		 * 字段列表
		 */
		@ApiListField("fields")
		@ApiField("fields")
		private List<Fields> fields;
	
		public List<Fields> getFields() {
			return this.fields;
		}
		public void setFields(List<Fields> fields) {
			this.fields = fields;
		}
	}
	


}
