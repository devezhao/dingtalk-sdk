package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.hrm.employee.getdismissionlist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpHrmEmployeeGetdismissionlistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6534361534399154248L;

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
	 * 实际每条数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HrmApiDismissionModel extends TaobaoObject {
		private static final long serialVersionUID = 8644556149214261861L;
		/**
		 * 入职时间
		 */
		@ApiField("confirm_join_time")
		private Date confirmJoinTime;
		/**
		 * 部门名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 离职描述
		 */
		@ApiField("dismission_memo")
		private String dismissionMemo;
		/**
		 * 离职原因（1：家庭原因，2:个人原因，3：发展原因，4：合同到期不续签，5：协议解除，6：无法胜任工作，7：经济性裁员，8：严重违法违纪，9：其他）
		 */
		@ApiField("dismission_reason")
		private String dismissionReason;
		/**
		 * email
		 */
		@ApiField("email")
		private String email;
		/**
		 * 员工状态（-1:无状态，1:待入职，2:试用，3:正式，4:离职，5:待离职）
		 */
		@ApiField("employee_status")
		private String employeeStatus;
		/**
		 * 员工类型（0:无类型，1:全职，2:兼职，3:实习，4:劳务派遣，5:退休返聘，6:劳务外包）
		 */
		@ApiField("employee_type")
		private String employeeType;
		/**
		 * 离职时间
		 */
		@ApiField("last_work_date")
		private Date lastWorkDate;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 职位
		 */
		@ApiField("position")
		private String position;
		/**
		 * userId
		 */
		@ApiField("userid")
		private String userid;
	
		public Date getConfirmJoinTime() {
			return this.confirmJoinTime;
		}
		public void setConfirmJoinTime(Date confirmJoinTime) {
			this.confirmJoinTime = confirmJoinTime;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getDismissionMemo() {
			return this.dismissionMemo;
		}
		public void setDismissionMemo(String dismissionMemo) {
			this.dismissionMemo = dismissionMemo;
		}
		public String getDismissionReason() {
			return this.dismissionReason;
		}
		public void setDismissionReason(String dismissionReason) {
			this.dismissionReason = dismissionReason;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmployeeStatus() {
			return this.employeeStatus;
		}
		public void setEmployeeStatus(String employeeStatus) {
			this.employeeStatus = employeeStatus;
		}
		public String getEmployeeType() {
			return this.employeeType;
		}
		public void setEmployeeType(String employeeType) {
			this.employeeType = employeeType;
		}
		public Date getLastWorkDate() {
			return this.lastWorkDate;
		}
		public void setLastWorkDate(Date lastWorkDate) {
			this.lastWorkDate = lastWorkDate;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPosition() {
			return this.position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 分页数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HrmApiPage extends TaobaoObject {
		private static final long serialVersionUID = 1255989321864245139L;
		/**
		 * 当前页
		 */
		@ApiField("current")
		private Long current;
		/**
		 * 实际每条数据
		 */
		@ApiListField("data_list")
		@ApiField("hrm_api_dismission_model")
		private List<HrmApiDismissionModel> dataList;
		/**
		 * 每页最大数量，最大100
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 总数
		 */
		@ApiField("total")
		private Long total;
		/**
		 * 总页数
		 */
		@ApiField("total_page")
		private Long totalPage;
	
		public Long getCurrent() {
			return this.current;
		}
		public void setCurrent(Long current) {
			this.current = current;
		}
		public List<HrmApiDismissionModel> getDataList() {
			return this.dataList;
		}
		public void setDataList(List<HrmApiDismissionModel> dataList) {
			this.dataList = dataList;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
		public Long getTotalPage() {
			return this.totalPage;
		}
		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5639619661631116322L;
		/**
		 * 错误码
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 分页数据
		 */
		@ApiField("page")
		private HrmApiPage page;
		/**
		 * 是否成功
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
		public HrmApiPage getPage() {
			return this.page;
		}
		public void setPage(HrmApiPage page) {
			this.page = page;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
