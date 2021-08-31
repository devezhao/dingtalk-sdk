package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiProcessSaveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.save request
 * 
 * @author top auto create
 * @since 1.0, 2021.07.07
 */
public class OapiProcessSaveRequest extends BaseTaobaoRequest<OapiProcessSaveResponse> {
	
	

	/** 
	* 入参
	 */
	private String saveProcessRequest;

	public void setSaveProcessRequest(String saveProcessRequest) {
		this.saveProcessRequest = saveProcessRequest;
	}

	public void setSaveProcessRequest(SaveProcessRequest saveProcessRequest) {
		this.saveProcessRequest = new JSONWriter(false,false,true).write(saveProcessRequest);
	}

	public String getSaveProcessRequest() {
		return this.saveProcessRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.save";
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
		txtParams.put("saveProcessRequest", this.saveProcessRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessSaveResponse> getResponseClass() {
		return OapiProcessSaveResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 需要计算总和的明细组件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentStatVo extends TaobaoObject {
		private static final long serialVersionUID = 3467129836776817963L;
		/**
		 * 组件id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 组件名称
		 */
		@ApiField("label")
		private String label;
		/**
		 * 单元
		 */
		@ApiField("unit")
		private String unit;
		/**
		 * 统计总和是否大写
		 */
		@ApiField("upper")
		private Boolean upper;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public Boolean getUpper() {
			return this.upper;
		}
		public void setUpper(Boolean upper) {
			this.upper = upper;
		}
	}
	
	/**
	 * 表单属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentPropVo extends TaobaoObject {
		private static final long serialVersionUID = 6839893864313372431L;
		/**
		 * 增加明细动作名称
		 */
		@ApiField("action_name")
		private String actionName;
		/**
		 * 套件别名
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 套件类型
		 */
		@ApiField("biz_type")
		private String bizType;
		/**
		 * 内部联系人choice，1表示多选，0表示单选
		 */
		@ApiField("choice")
		private Long choice;
		/**
		 * 说明文字
		 */
		@ApiField("content")
		private String content;
		/**
		 * 是否自动计算时长
		 */
		@ApiField("duration")
		private Boolean duration;
		/**
		 * 时间格式
		 */
		@ApiField("format")
		private String format;
		/**
		 * 暂不需要
		 */
		@ApiField("formula")
		private String formula;
		/**
		 * 表单id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 表单名称
		 */
		@ApiField("label")
		private String label;
		/**
		 * 说明文案的链接地址
		 */
		@ApiField("link")
		private String link;
		/**
		 * 是否参与打印(1表示不打印, 0表示打印)
		 */
		@ApiField("not_print")
		private String notPrint;
		/**
		 * 是否需要大写 默认是需要; 1:不需要大写, 空或者0:需要大写
		 */
		@ApiField("not_upper")
		private String notUpper;
		/**
		 * 单选框或者多选框的选项
		 */
		@ApiListField("options")
		@ApiField("string")
		private List<String> options;
		/**
		 * 占位提示（仅输入类组件）
		 */
		@ApiField("placeholder")
		private String placeholder;
		/**
		 * 是否必填
		 */
		@ApiField("required")
		private Boolean required;
		/**
		 * 需要计算总和的明细组件
		 */
		@ApiListField("stat_field")
		@ApiField("form_component_stat_vo")
		private List<FormComponentStatVo> statField;
		/**
		 * 数字组件日期区间组件单位属性
		 */
		@ApiField("unit")
		private String unit;
	
		public String getActionName() {
			return this.actionName;
		}
		public void setActionName(String actionName) {
			this.actionName = actionName;
		}
		public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public Long getChoice() {
			return this.choice;
		}
		public void setChoice(Long choice) {
			this.choice = choice;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Boolean getDuration() {
			return this.duration;
		}
		public void setDuration(Boolean duration) {
			this.duration = duration;
		}
		public String getFormat() {
			return this.format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public String getFormula() {
			return this.formula;
		}
		public void setFormula(String formula) {
			this.formula = formula;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getLink() {
			return this.link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		public String getNotPrint() {
			return this.notPrint;
		}
		public void setNotPrint(String notPrint) {
			this.notPrint = notPrint;
		}
		public String getNotUpper() {
			return this.notUpper;
		}
		public void setNotUpper(String notUpper) {
			this.notUpper = notUpper;
		}
		public List<String> getOptions() {
			return this.options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public String getPlaceholder() {
			return this.placeholder;
		}
		public void setPlaceholder(String placeholder) {
			this.placeholder = placeholder;
		}
		public Boolean getRequired() {
			return this.required;
		}
		public void setRequired(Boolean required) {
			this.required = required;
		}
		public List<FormComponentStatVo> getStatField() {
			return this.statField;
		}
		public void setStatField(List<FormComponentStatVo> statField) {
			this.statField = statField;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 子表单属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentPropVo2 extends TaobaoObject {
		private static final long serialVersionUID = 8818684896428171851L;
		/**
		 * 控件别名
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 控件类型
		 */
		@ApiField("biz_type")
		private String bizType;
		/**
		 * 内部联系人choice，1表示多选，0表示单选
		 */
		@ApiField("choice")
		private Long choice;
		/**
		 * 自定义控件渲染类型
		 */
		@ApiField("common_biz_type")
		private String commonBizType;
		/**
		 * 说明文字
		 */
		@ApiField("content")
		private String content;
		/**
		 * 是否自动计算时长
		 */
		@ApiField("duration")
		private Boolean duration;
		/**
		 * 时间格式
		 */
		@ApiField("format")
		private String format;
		/**
		 * 暂不需要
		 */
		@ApiField("formula")
		private String formula;
		/**
		 * 表单id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 表单名称
		 */
		@ApiField("label")
		private String label;
		/**
		 * 说明文案的链接地址
		 */
		@ApiField("link")
		private String link;
		/**
		 * 是否参与打印(1表示不打印, 0表示打印)
		 */
		@ApiField("not_print")
		private String notPrint;
		/**
		 * 是否需要大写 默认是需要; 1:不需要大写, 空或者0:需要大写
		 */
		@ApiField("not_upper")
		private String notUpper;
		/**
		 * 单选框或者多选框的选项
		 */
		@ApiListField("options")
		@ApiField("string")
		private List<String> options;
		/**
		 * 占位提示（仅输入类组件）
		 */
		@ApiField("placeholder")
		private String placeholder;
		/**
		 * 是否必填
		 */
		@ApiField("required")
		private Boolean required;
		/**
		 * 明细展示方式：表格 table、列表list
		 */
		@ApiField("table_view_mode")
		private String tableViewMode;
		/**
		 * 数字组件日期区间组件单位属性
		 */
		@ApiField("unit")
		private String unit;
	
		public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public Long getChoice() {
			return this.choice;
		}
		public void setChoice(Long choice) {
			this.choice = choice;
		}
		public String getCommonBizType() {
			return this.commonBizType;
		}
		public void setCommonBizType(String commonBizType) {
			this.commonBizType = commonBizType;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Boolean getDuration() {
			return this.duration;
		}
		public void setDuration(Boolean duration) {
			this.duration = duration;
		}
		public String getFormat() {
			return this.format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public String getFormula() {
			return this.formula;
		}
		public void setFormula(String formula) {
			this.formula = formula;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getLink() {
			return this.link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		public String getNotPrint() {
			return this.notPrint;
		}
		public void setNotPrint(String notPrint) {
			this.notPrint = notPrint;
		}
		public String getNotUpper() {
			return this.notUpper;
		}
		public void setNotUpper(String notUpper) {
			this.notUpper = notUpper;
		}
		public List<String> getOptions() {
			return this.options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public String getPlaceholder() {
			return this.placeholder;
		}
		public void setPlaceholder(String placeholder) {
			this.placeholder = placeholder;
		}
		public Boolean getRequired() {
			return this.required;
		}
		public void setRequired(Boolean required) {
			this.required = required;
		}
		public String getTableViewMode() {
			return this.tableViewMode;
		}
		public void setTableViewMode(String tableViewMode) {
			this.tableViewMode = tableViewMode;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 控件属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentPropVo3 extends TaobaoObject {
		private static final long serialVersionUID = 3445918788158613983L;
		/**
		 * 控件别名
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 内部联系人choice，1表示多选，0表示单选
		 */
		@ApiField("choice")
		private Long choice;
		/**
		 * 是否自动计算时长
		 */
		@ApiField("duration")
		private Boolean duration;
		/**
		 * 时间格式
		 */
		@ApiField("format")
		private String format;
		/**
		 * 计算公式
		 */
		@ApiField("formula")
		private String formula;
		/**
		 * 控件id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 控件名称
		 */
		@ApiField("label")
		private String label;
		/**
		 * 是否参与打印(1表示不打印, 0表示打印)
		 */
		@ApiField("not_print")
		private String notPrint;
		/**
		 * 是否需要大写 默认是需要; 1:不需要大写, 空或者0:需要大写
		 */
		@ApiField("not_upper")
		private String notUpper;
		/**
		 * 选项
		 */
		@ApiListField("options")
		@ApiField("string")
		private List<String> options;
		/**
		 * 占位提示（仅输入类组件）
		 */
		@ApiField("placeholder")
		private String placeholder;
		/**
		 * 是否必填
		 */
		@ApiField("required")
		private Boolean required;
		/**
		 * 数字组件日期区间组件单位属性
		 */
		@ApiField("unit")
		private String unit;
	
		public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public Long getChoice() {
			return this.choice;
		}
		public void setChoice(Long choice) {
			this.choice = choice;
		}
		public Boolean getDuration() {
			return this.duration;
		}
		public void setDuration(Boolean duration) {
			this.duration = duration;
		}
		public String getFormat() {
			return this.format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public String getFormula() {
			return this.formula;
		}
		public void setFormula(String formula) {
			this.formula = formula;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getNotPrint() {
			return this.notPrint;
		}
		public void setNotPrint(String notPrint) {
			this.notPrint = notPrint;
		}
		public String getNotUpper() {
			return this.notUpper;
		}
		public void setNotUpper(String notUpper) {
			this.notUpper = notUpper;
		}
		public List<String> getOptions() {
			return this.options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public String getPlaceholder() {
			return this.placeholder;
		}
		public void setPlaceholder(String placeholder) {
			this.placeholder = placeholder;
		}
		public Boolean getRequired() {
			return this.required;
		}
		public void setRequired(Boolean required) {
			this.required = required;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 子控件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentVo3 extends TaobaoObject {
		private static final long serialVersionUID = 1162431385783914861L;
		/**
		 * 控件类型
		 */
		@ApiField("component_name")
		private String componentName;
		/**
		 * 控件属性
		 */
		@ApiField("props")
		private FormComponentPropVo3 props;
	
		public String getComponentName() {
			return this.componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public FormComponentPropVo3 getProps() {
			return this.props;
		}
		public void setProps(FormComponentPropVo3 props) {
			this.props = props;
		}
	}
	
	/**
	 * 子表单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentVo2 extends TaobaoObject {
		private static final long serialVersionUID = 2143457528131564345L;
		/**
		 * 子控件
		 */
		@ApiListField("children")
		@ApiField("form_component_vo3")
		private List<FormComponentVo3> children;
		/**
		 * 控件类型
		 */
		@ApiField("component_name")
		private String componentName;
		/**
		 * 子表单属性
		 */
		@ApiField("props")
		private FormComponentPropVo2 props;
	
		public List<FormComponentVo3> getChildren() {
			return this.children;
		}
		public void setChildren(List<FormComponentVo3> children) {
			this.children = children;
		}
		public String getComponentName() {
			return this.componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public FormComponentPropVo2 getProps() {
			return this.props;
		}
		public void setProps(FormComponentPropVo2 props) {
			this.props = props;
		}
	}
	
	/**
	 * 表单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentVo extends TaobaoObject {
		private static final long serialVersionUID = 6792839977966126596L;
		/**
		 * 子表单列表
		 */
		@ApiListField("children")
		@ApiField("form_component_vo2")
		private List<FormComponentVo2> children;
		/**
		 * 控件类型
		 */
		@ApiField("component_name")
		private String componentName;
		/**
		 * 表单属性
		 */
		@ApiField("props")
		private FormComponentPropVo props;
	
		public List<FormComponentVo2> getChildren() {
			return this.children;
		}
		public void setChildren(List<FormComponentVo2> children) {
			this.children = children;
		}
		public String getComponentName() {
			return this.componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public FormComponentPropVo getProps() {
			return this.props;
		}
		public void setProps(FormComponentPropVo props) {
			this.props = props;
		}
	}
	
	/**
	 * 模板配置属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessConfig extends TaobaoObject {
		private static final long serialVersionUID = 8376993542231479795L;
		/**
		 * 是否在审批后台禁用删除操作
		 */
		@ApiField("disable_delete_process")
		private Boolean disableDeleteProcess;
		/**
		 * 是否允许表单在审批管理后台可编辑。true表示不可以
		 */
		@ApiField("disable_form_edit")
		private Boolean disableFormEdit;
		/**
		 * 是否在审批首页工作台屏蔽模板
		 */
		@ApiField("disable_homepage")
		private Boolean disableHomepage;
		/**
		 * 是否在审批详情页禁用再次提交操作
		 */
		@ApiField("disable_resubmit")
		private Boolean disableResubmit;
		/**
		 * 是否在审批后台禁用停用操作
		 */
		@ApiField("disable_stop_process_button")
		private Boolean disableStopProcessButton;
		/**
		 * 假流程模板编辑url
		 */
		@ApiField("fake_template_edit_url")
		private String fakeTemplateEditUrl;
		/**
		 * 设置模板是否隐藏，true表示隐藏
		 */
		@ApiField("hidden")
		private Boolean hidden;
		/**
		 * 审批模板编辑跳转页。当fake_mode为true时，此参数失效。
		 */
		@ApiField("template_edit_url")
		private String templateEditUrl;
	
		public Boolean getDisableDeleteProcess() {
			return this.disableDeleteProcess;
		}
		public void setDisableDeleteProcess(Boolean disableDeleteProcess) {
			this.disableDeleteProcess = disableDeleteProcess;
		}
		public Boolean getDisableFormEdit() {
			return this.disableFormEdit;
		}
		public void setDisableFormEdit(Boolean disableFormEdit) {
			this.disableFormEdit = disableFormEdit;
		}
		public Boolean getDisableHomepage() {
			return this.disableHomepage;
		}
		public void setDisableHomepage(Boolean disableHomepage) {
			this.disableHomepage = disableHomepage;
		}
		public Boolean getDisableResubmit() {
			return this.disableResubmit;
		}
		public void setDisableResubmit(Boolean disableResubmit) {
			this.disableResubmit = disableResubmit;
		}
		public Boolean getDisableStopProcessButton() {
			return this.disableStopProcessButton;
		}
		public void setDisableStopProcessButton(Boolean disableStopProcessButton) {
			this.disableStopProcessButton = disableStopProcessButton;
		}
		public String getFakeTemplateEditUrl() {
			return this.fakeTemplateEditUrl;
		}
		public void setFakeTemplateEditUrl(String fakeTemplateEditUrl) {
			this.fakeTemplateEditUrl = fakeTemplateEditUrl;
		}
		public Boolean getHidden() {
			return this.hidden;
		}
		public void setHidden(Boolean hidden) {
			this.hidden = hidden;
		}
		public String getTemplateEditUrl() {
			return this.templateEditUrl;
		}
		public void setTemplateEditUrl(String templateEditUrl) {
			this.templateEditUrl = templateEditUrl;
		}
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SaveProcessRequest extends TaobaoObject {
		private static final long serialVersionUID = 4592766147835193249L;
		/**
		 * 企业应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 发起审批移动端链接
		 */
		@ApiField("create_instance_mobile_url")
		private String createInstanceMobileUrl;
		/**
		 * 发起审批pc链接
		 */
		@ApiField("create_instance_pc_url")
		private String createInstancePcUrl;
		/**
		 * 审批模板描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 分组id
		 */
		@ApiField("dir_id")
		private String dirId;
		/**
		 * 废弃，请使用process_config.disable_form_edit字段
		 */
		@ApiField("disable_form_edit")
		private Boolean disableFormEdit;
		/**
		 * true
		 */
		@ApiField("disable_stop_process_button")
		private Boolean disableStopProcessButton;
		/**
		 * true表示不带流程的模板
		 */
		@ApiField("fake_mode")
		private Boolean fakeMode;
		/**
		 * 表单列表
		 */
		@ApiListField("form_component_list")
		@ApiField("form_component_vo")
		private List<FormComponentVo> formComponentList;
		/**
		 * 废弃，请使用process_config.hidden字段
		 */
		@ApiField("hidden")
		private Boolean hidden;
		/**
		 * icon
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 审批模板名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 原分组id
		 */
		@ApiField("origin_dir_id")
		private String originDirId;
		/**
		 * 审批模板唯一码
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 模板配置属性
		 */
		@ApiField("process_config")
		private ProcessConfig processConfig;
		/**
		 * 废弃，请使用process_config.template_edit_url字段
		 */
		@ApiField("template_edit_url")
		private String templateEditUrl;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getCreateInstanceMobileUrl() {
			return this.createInstanceMobileUrl;
		}
		public void setCreateInstanceMobileUrl(String createInstanceMobileUrl) {
			this.createInstanceMobileUrl = createInstanceMobileUrl;
		}
		public String getCreateInstancePcUrl() {
			return this.createInstancePcUrl;
		}
		public void setCreateInstancePcUrl(String createInstancePcUrl) {
			this.createInstancePcUrl = createInstancePcUrl;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getDirId() {
			return this.dirId;
		}
		public void setDirId(String dirId) {
			this.dirId = dirId;
		}
		public Boolean getDisableFormEdit() {
			return this.disableFormEdit;
		}
		public void setDisableFormEdit(Boolean disableFormEdit) {
			this.disableFormEdit = disableFormEdit;
		}
		public Boolean getDisableStopProcessButton() {
			return this.disableStopProcessButton;
		}
		public void setDisableStopProcessButton(Boolean disableStopProcessButton) {
			this.disableStopProcessButton = disableStopProcessButton;
		}
		public Boolean getFakeMode() {
			return this.fakeMode;
		}
		public void setFakeMode(Boolean fakeMode) {
			this.fakeMode = fakeMode;
		}
		public List<FormComponentVo> getFormComponentList() {
			return this.formComponentList;
		}
		public void setFormComponentList(List<FormComponentVo> formComponentList) {
			this.formComponentList = formComponentList;
		}
		public Boolean getHidden() {
			return this.hidden;
		}
		public void setHidden(Boolean hidden) {
			this.hidden = hidden;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOriginDirId() {
			return this.originDirId;
		}
		public void setOriginDirId(String originDirId) {
			this.originDirId = originDirId;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public ProcessConfig getProcessConfig() {
			return this.processConfig;
		}
		public void setProcessConfig(ProcessConfig processConfig) {
			this.processConfig = processConfig;
		}
		public String getTemplateEditUrl() {
			return this.templateEditUrl;
		}
		public void setTemplateEditUrl(String templateEditUrl) {
			this.templateEditUrl = templateEditUrl;
		}
	}
	

}