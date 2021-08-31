package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.role.getrolegroup response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpRoleGetrolegroupResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8318849973359898731L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 角色列表信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRole extends TaobaoObject {
		private static final long serialVersionUID = 6725341273176578136L;
		/**
		 * 角色id
		 */
		@ApiField("role_id")
		private Long roleId;
		/**
		 * 角色名
		 */
		@ApiField("role_name")
		private String roleName;
	
		public Long getRoleId() {
			return this.roleId;
		}
		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}
		public String getRoleName() {
			return this.roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
	}
	
	/**
	 * 角色组信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRoleGroup extends TaobaoObject {
		private static final long serialVersionUID = 7593831715773586915L;
		/**
		 * 角色组名
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 角色列表信息
		 */
		@ApiListField("roles")
		@ApiField("open_role")
		private List<OpenRole> roles;
	
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public List<OpenRole> getRoles() {
			return this.roles;
		}
		public void setRoles(List<OpenRole> roles) {
			this.roles = roles;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5492289448929853965L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 角色组信息
		 */
		@ApiField("role_group")
		private OpenRoleGroup roleGroup;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public OpenRoleGroup getRoleGroup() {
			return this.roleGroup;
		}
		public void setRoleGroup(OpenRoleGroup roleGroup) {
			this.roleGroup = roleGroup;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
