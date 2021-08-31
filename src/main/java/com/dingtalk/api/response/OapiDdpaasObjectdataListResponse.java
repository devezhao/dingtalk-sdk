package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ddpaas.objectdata.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDdpaasObjectdataListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5773617933216557771L;

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
	 * 查询结果列表
	 */
	@ApiListField("result")
	@ApiField("object_data_instance_vo")
	private List<ObjectDataInstanceVo> result;


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

	public void setResult(List<ObjectDataInstanceVo> result) {
		this.result = result;
	}
	public List<ObjectDataInstanceVo> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 数据权限信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DataPermissionVo extends TaobaoObject {
		private static final long serialVersionUID = 7829694898433946463L;
		/**
		 * 负责人用户ID列表
		 */
		@ApiListField("owner_userid_list")
		@ApiField("string")
		private List<String> ownerUseridList;
		/**
		 * 协同人用户ID列表
		 */
		@ApiListField("participant_userid_list")
		@ApiField("string")
		private List<String> participantUseridList;
	
		public List<String> getOwnerUseridList() {
			return this.ownerUseridList;
		}
		public void setOwnerUseridList(List<String> ownerUseridList) {
			this.ownerUseridList = ownerUseridList;
		}
		public List<String> getParticipantUseridList() {
			return this.participantUseridList;
		}
		public void setParticipantUseridList(List<String> participantUseridList) {
			this.participantUseridList = participantUseridList;
		}
	}
	
	/**
	 * 查询结果列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ObjectDataInstanceVo extends TaobaoObject {
		private static final long serialVersionUID = 2433381599833764428L;
		/**
		 * 创建记录的用户昵称
		 */
		@ApiField("creator_nick")
		private String creatorNick;
		/**
		 * 创建记录的用户ID
		 */
		@ApiField("creator_userid")
		private String creatorUserid;
		/**
		 * 数据内容
		 */
		@ApiField("data")
		private String data;
		/**
		 * 扩展数据内容
		 */
		@ApiField("extend_data")
		private String extendData;
		/**
		 * 记录创建时间
		 */
		@ApiField("gmt_create")
		private String gmtCreate;
		/**
		 * 记录修改时间
		 */
		@ApiField("gmt_modified")
		private String gmtModified;
		/**
		 * 数据ID
		 */
		@ApiField("instance_id")
		private String instanceId;
		/**
		 * 数据权限信息
		 */
		@ApiField("permission")
		private DataPermissionVo permission;
		/**
		 * 审批状态
		 */
		@ApiField("proc_inst_status")
		private String procInstStatus;
		/**
		 * 审批结果
		 */
		@ApiField("proc_out_result")
		private String procOutResult;
	
		public String getCreatorNick() {
			return this.creatorNick;
		}
		public void setCreatorNick(String creatorNick) {
			this.creatorNick = creatorNick;
		}
		public String getCreatorUserid() {
			return this.creatorUserid;
		}
		public void setCreatorUserid(String creatorUserid) {
			this.creatorUserid = creatorUserid;
		}
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public void setDataString(String data) {
			this.data = data;
		}
		
		public String getExtendData() {
			return this.extendData;
		}
		public void setExtendData(String extendData) {
			this.extendData = extendData;
		}
		public void setExtendDataString(String extendData) {
			this.extendData = extendData;
		}
		
		public String getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
		public DataPermissionVo getPermission() {
			return this.permission;
		}
		public void setPermission(DataPermissionVo permission) {
			this.permission = permission;
		}
		public String getProcInstStatus() {
			return this.procInstStatus;
		}
		public void setProcInstStatus(String procInstStatus) {
			this.procInstStatus = procInstStatus;
		}
		public String getProcOutResult() {
			return this.procOutResult;
		}
		public void setProcOutResult(String procOutResult) {
			this.procOutResult = procOutResult;
		}
	}
	


}
