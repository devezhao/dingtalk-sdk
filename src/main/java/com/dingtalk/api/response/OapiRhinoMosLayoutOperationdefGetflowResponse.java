package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.layout.operationdef.getflow response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosLayoutOperationdefGetflowResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8496689846389748447L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 工序定义图
	 */
	@ApiField("result")
	private OperationDefFlowDto result;


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

	public void setResult(OperationDefFlowDto result) {
		this.result = result;
	}
	public OperationDefFlowDto getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 工序执行器分配
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationExecutorAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 3433799673494898226L;
		/**
		 * 工序执行器ID
		 */
		@ApiField("executor_id")
		private String executorId;
		/**
		 * 排序值
		 */
		@ApiField("order_num")
		private Long orderNum;
	
		public String getExecutorId() {
			return this.executorId;
		}
		public void setExecutorId(String executorId) {
			this.executorId = executorId;
		}
		public Long getOrderNum() {
			return this.orderNum;
		}
		public void setOrderNum(Long orderNum) {
			this.orderNum = orderNum;
		}
	}
	
	/**
	 * 设备分配列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 3885869554193593664L;
		/**
		 * 设备ID
		 */
		@ApiField("device_id")
		private Long deviceId;
		/**
		 * 设备模型ID
		 */
		@ApiField("device_model_id")
		private String deviceModelId;
		/**
		 * 设备模型名称
		 */
		@ApiField("device_model_name")
		private String deviceModelName;
		/**
		 * 设备模型版本
		 */
		@ApiField("device_model_version")
		private String deviceModelVersion;
	
		public Long getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(Long deviceId) {
			this.deviceId = deviceId;
		}
		public String getDeviceModelId() {
			return this.deviceModelId;
		}
		public void setDeviceModelId(String deviceModelId) {
			this.deviceModelId = deviceModelId;
		}
		public String getDeviceModelName() {
			return this.deviceModelName;
		}
		public void setDeviceModelName(String deviceModelName) {
			this.deviceModelName = deviceModelName;
		}
		public String getDeviceModelVersion() {
			return this.deviceModelVersion;
		}
		public void setDeviceModelVersion(String deviceModelVersion) {
			this.deviceModelVersion = deviceModelVersion;
		}
	}
	
	/**
	 * 人员分配列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkerAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 5195495549827377344L;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 工号
		 */
		@ApiField("work_no")
		private String workNo;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getWorkNo() {
			return this.workNo;
		}
		public void setWorkNo(String workNo) {
			this.workNo = workNo;
		}
	}
	
	/**
	 * 站位分配
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkstationAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 2235989419177521971L;
		/**
		 * 站位编码
		 */
		@ApiField("workstation_code")
		private String workstationCode;
	
		public String getWorkstationCode() {
			return this.workstationCode;
		}
		public void setWorkstationCode(String workstationCode) {
			this.workstationCode = workstationCode;
		}
	}
	
	/**
	 * 分配单元列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkUnitDto extends TaobaoObject {
		private static final long serialVersionUID = 1513433557459372722L;
		/**
		 * 设备分配列表
		 */
		@ApiListField("device_assigns")
		@ApiField("device_assign_dto")
		private List<DeviceAssignDto> deviceAssigns;
		/**
		 * 扩展属性
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 人员分配列表
		 */
		@ApiListField("worker_assigns")
		@ApiField("worker_assign_dto")
		private List<WorkerAssignDto> workerAssigns;
		/**
		 * 站位分配
		 */
		@ApiListField("workstation_assigns")
		@ApiField("workstation_assign_dto")
		private List<WorkstationAssignDto> workstationAssigns;
	
		public List<DeviceAssignDto> getDeviceAssigns() {
			return this.deviceAssigns;
		}
		public void setDeviceAssigns(List<DeviceAssignDto> deviceAssigns) {
			this.deviceAssigns = deviceAssigns;
		}
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public List<WorkerAssignDto> getWorkerAssigns() {
			return this.workerAssigns;
		}
		public void setWorkerAssigns(List<WorkerAssignDto> workerAssigns) {
			this.workerAssigns = workerAssigns;
		}
		public List<WorkstationAssignDto> getWorkstationAssigns() {
			return this.workstationAssigns;
		}
		public void setWorkstationAssigns(List<WorkstationAssignDto> workstationAssigns) {
			this.workstationAssigns = workstationAssigns;
		}
	}
	
	/**
	 * 工序定义列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationDefDto extends TaobaoObject {
		private static final long serialVersionUID = 3233942729333788788L;
		/**
		 * 适用尺码
		 */
		@ApiField("applicable_size_code")
		private String applicableSizeCode;
		/**
		 * 是否需要调度
		 */
		@ApiField("auto_schedule")
		private Boolean autoSchedule;
		/**
		 * 业务编码
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 业务来源
		 */
		@ApiField("biz_source")
		private String bizSource;
		/**
		 * 进入条件：ANY_MATCHALL_MATCH
		 */
		@ApiField("enter_condition")
		private String enterCondition;
		/**
		 * 执行系统
		 */
		@ApiField("exec_system")
		private String execSystem;
		/**
		 * PaaSflowID（只用于返回，保存会自增）
		 */
		@ApiField("flow_id")
		private Long flowId;
		/**
		 * 工序版本
		 */
		@ApiField("flow_version")
		private Long flowVersion;
		/**
		 * 工序名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 后续工序外部ID列表
		 */
		@ApiListField("next_operation_external_ids")
		@ApiField("string")
		private List<String> nextOperationExternalIds;
		/**
		 * 后续工序唯一ID列表
		 */
		@ApiListField("next_operation_uids")
		@ApiField("number")
		private List<Long> nextOperationUids;
		/**
		 * 工序执行器分配
		 */
		@ApiListField("operation_executor_assigns")
		@ApiField("operation_executor_assign_dto")
		private List<OperationExecutorAssignDto> operationExecutorAssigns;
		/**
		 * 工序外部ID
		 */
		@ApiField("operation_external_id")
		private String operationExternalId;
		/**
		 * 工序类型：ASSISTQUALITY_INSPECTTECHNOLOGY
		 */
		@ApiField("operation_type")
		private String operationType;
		/**
		 * 工序唯一ID
		 */
		@ApiField("operation_uid")
		private Long operationUid;
		/**
		 * 工序能力类型：SJPPTR等
		 */
		@ApiField("process_type_code")
		private String processTypeCode;
		/**
		 * 工段CODE：F-SLC..
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 工段名称：缝制-碎料裁床..
		 */
		@ApiField("section_name")
		private String sectionName;
		/**
		 * 是否跳过(不生产)
		 */
		@ApiField("skip")
		private Boolean skip;
		/**
		 * 标准工时秒
		 */
		@ApiField("std_cost")
		private String stdCost;
		/**
		 * 分配单元列表
		 */
		@ApiListField("work_units")
		@ApiField("work_unit_dto")
		private List<WorkUnitDto> workUnits;
	
		public String getApplicableSizeCode() {
			return this.applicableSizeCode;
		}
		public void setApplicableSizeCode(String applicableSizeCode) {
			this.applicableSizeCode = applicableSizeCode;
		}
		public Boolean getAutoSchedule() {
			return this.autoSchedule;
		}
		public void setAutoSchedule(Boolean autoSchedule) {
			this.autoSchedule = autoSchedule;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getBizSource() {
			return this.bizSource;
		}
		public void setBizSource(String bizSource) {
			this.bizSource = bizSource;
		}
		public String getEnterCondition() {
			return this.enterCondition;
		}
		public void setEnterCondition(String enterCondition) {
			this.enterCondition = enterCondition;
		}
		public String getExecSystem() {
			return this.execSystem;
		}
		public void setExecSystem(String execSystem) {
			this.execSystem = execSystem;
		}
		public Long getFlowId() {
			return this.flowId;
		}
		public void setFlowId(Long flowId) {
			this.flowId = flowId;
		}
		public Long getFlowVersion() {
			return this.flowVersion;
		}
		public void setFlowVersion(Long flowVersion) {
			this.flowVersion = flowVersion;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getNextOperationExternalIds() {
			return this.nextOperationExternalIds;
		}
		public void setNextOperationExternalIds(List<String> nextOperationExternalIds) {
			this.nextOperationExternalIds = nextOperationExternalIds;
		}
		public List<Long> getNextOperationUids() {
			return this.nextOperationUids;
		}
		public void setNextOperationUids(List<Long> nextOperationUids) {
			this.nextOperationUids = nextOperationUids;
		}
		public List<OperationExecutorAssignDto> getOperationExecutorAssigns() {
			return this.operationExecutorAssigns;
		}
		public void setOperationExecutorAssigns(List<OperationExecutorAssignDto> operationExecutorAssigns) {
			this.operationExecutorAssigns = operationExecutorAssigns;
		}
		public String getOperationExternalId() {
			return this.operationExternalId;
		}
		public void setOperationExternalId(String operationExternalId) {
			this.operationExternalId = operationExternalId;
		}
		public String getOperationType() {
			return this.operationType;
		}
		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}
		public Long getOperationUid() {
			return this.operationUid;
		}
		public void setOperationUid(Long operationUid) {
			this.operationUid = operationUid;
		}
		public String getProcessTypeCode() {
			return this.processTypeCode;
		}
		public void setProcessTypeCode(String processTypeCode) {
			this.processTypeCode = processTypeCode;
		}
		public String getSectionCode() {
			return this.sectionCode;
		}
		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}
		public String getSectionName() {
			return this.sectionName;
		}
		public void setSectionName(String sectionName) {
			this.sectionName = sectionName;
		}
		public Boolean getSkip() {
			return this.skip;
		}
		public void setSkip(Boolean skip) {
			this.skip = skip;
		}
		public String getStdCost() {
			return this.stdCost;
		}
		public void setStdCost(String stdCost) {
			this.stdCost = stdCost;
		}
		public List<WorkUnitDto> getWorkUnits() {
			return this.workUnits;
		}
		public void setWorkUnits(List<WorkUnitDto> workUnits) {
			this.workUnits = workUnits;
		}
	}
	
	/**
	 * 工序定义图
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationDefFlowDto extends TaobaoObject {
		private static final long serialVersionUID = 8238574823886565368L;
		/**
		 * 是否激活最大版本
		 */
		@ApiField("active")
		private Boolean active;
		/**
		 * 工序定义版本
		 */
		@ApiField("flow_version")
		private Long flowVersion;
		/**
		 * 工序定义列表
		 */
		@ApiListField("operation_defs")
		@ApiField("operation_def_dto")
		private List<OperationDefDto> operationDefs;
		/**
		 * 订单ID
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 来源系统
		 */
		@ApiField("source")
		private String source;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public Boolean getActive() {
			return this.active;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		public Long getFlowVersion() {
			return this.flowVersion;
		}
		public void setFlowVersion(Long flowVersion) {
			this.flowVersion = flowVersion;
		}
		public List<OperationDefDto> getOperationDefs() {
			return this.operationDefs;
		}
		public void setOperationDefs(List<OperationDefDto> operationDefs) {
			this.operationDefs = operationDefs;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
