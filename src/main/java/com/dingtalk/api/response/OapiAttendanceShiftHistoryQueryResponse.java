package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.history.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceShiftHistoryQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1567144899184589758L;

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
	 * 班次
	 */
	@ApiField("result")
	private TopShiftVo result;

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

	public void setResult(TopShiftVo result) {
		this.result = result;
	}
	public TopShiftVo getResult( ) {
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
	 * 班次设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopShiftSettingVo extends TaobaoObject {
		private static final long serialVersionUID = 3216318235933694166L;
		/**
		 * 该班次对应的出勤天数
		 */
		@ApiField("attend_days")
		private String attendDays;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 班次变更时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 删除标记
		 */
		@ApiField("is_deleted")
		private String isDeleted;
		/**
		 * 班次id
		 */
		@ApiField("shift_id")
		private Long shiftId;
		/**
		 * 工作时长，单位分钟，-1表示关闭该功能
		 */
		@ApiField("work_time_minutes")
		private Long workTimeMinutes;
	
		public String getAttendDays() {
			return this.attendDays;
		}
		public void setAttendDays(String attendDays) {
			this.attendDays = attendDays;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getIsDeleted() {
			return this.isDeleted;
		}
		public void setIsDeleted(String isDeleted) {
			this.isDeleted = isDeleted;
		}
		public Long getShiftId() {
			return this.shiftId;
		}
		public void setShiftId(Long shiftId) {
			this.shiftId = shiftId;
		}
		public Long getWorkTimeMinutes() {
			return this.workTimeMinutes;
		}
		public void setWorkTimeMinutes(Long workTimeMinutes) {
			this.workTimeMinutes = workTimeMinutes;
		}
	}
	
	/**
	 * 卡点
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopPunchVo extends TaobaoObject {
		private static final long serialVersionUID = 7189383924151184467L;
		/**
		 * 是否跨天
		 */
		@ApiField("across")
		private Long across;
		/**
		 * 允许的最早提前打卡时间，分钟为单位
		 */
		@ApiField("begin_min")
		private Long beginMin;
		/**
		 * 打卡时间
		 */
		@ApiField("check_time")
		private Date checkTime;
		/**
		 * 打卡类型
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 允许的最晚延后打卡时间，分钟为单位
		 */
		@ApiField("end_min")
		private Long endMin;
		/**
		 * 是否免打卡
		 */
		@ApiField("free_check")
		private Boolean freeCheck;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 允许早退迟到的时长
		 */
		@ApiField("permit_minutes")
		private Long permitMinutes;
	
		public Long getAcross() {
			return this.across;
		}
		public void setAcross(Long across) {
			this.across = across;
		}
		public Long getBeginMin() {
			return this.beginMin;
		}
		public void setBeginMin(Long beginMin) {
			this.beginMin = beginMin;
		}
		public Date getCheckTime() {
			return this.checkTime;
		}
		public void setCheckTime(Date checkTime) {
			this.checkTime = checkTime;
		}
		public String getCheckType() {
			return this.checkType;
		}
		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}
		public Long getEndMin() {
			return this.endMin;
		}
		public void setEndMin(Long endMin) {
			this.endMin = endMin;
		}
		public Boolean getFreeCheck() {
			return this.freeCheck;
		}
		public void setFreeCheck(Boolean freeCheck) {
			this.freeCheck = freeCheck;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getPermitMinutes() {
			return this.permitMinutes;
		}
		public void setPermitMinutes(Long permitMinutes) {
			this.permitMinutes = permitMinutes;
		}
	}
	
	/**
	 * 休息段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopRestVo extends TaobaoObject {
		private static final long serialVersionUID = 7127867734362365351L;
		/**
		 * 是否跨天
		 */
		@ApiField("across")
		private Long across;
		/**
		 * 休息时间
		 */
		@ApiField("check_time")
		private Date checkTime;
		/**
		 * 休息类型
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
	
		public Long getAcross() {
			return this.across;
		}
		public void setAcross(Long across) {
			this.across = across;
		}
		public Date getCheckTime() {
			return this.checkTime;
		}
		public void setCheckTime(Date checkTime) {
			this.checkTime = checkTime;
		}
		public String getCheckType() {
			return this.checkType;
		}
		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	}
	
	/**
	 * 卡段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopSectionVo extends TaobaoObject {
		private static final long serialVersionUID = 3786638264655399116L;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 卡点
		 */
		@ApiListField("punches")
		@ApiField("top_punch_vo")
		private List<TopPunchVo> punches;
		/**
		 * 休息段
		 */
		@ApiListField("rests")
		@ApiField("top_rest_vo")
		private List<TopRestVo> rests;
		/**
		 * 工作时长，单位分钟
		 */
		@ApiField("work_time_minutes")
		private Long workTimeMinutes;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public List<TopPunchVo> getPunches() {
			return this.punches;
		}
		public void setPunches(List<TopPunchVo> punches) {
			this.punches = punches;
		}
		public List<TopRestVo> getRests() {
			return this.rests;
		}
		public void setRests(List<TopRestVo> rests) {
			this.rests = rests;
		}
		public Long getWorkTimeMinutes() {
			return this.workTimeMinutes;
		}
		public void setWorkTimeMinutes(Long workTimeMinutes) {
			this.workTimeMinutes = workTimeMinutes;
		}
	}
	
	/**
	 * 班次
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopShiftVo extends TaobaoObject {
		private static final long serialVersionUID = 6562582617366948954L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 卡段
		 */
		@ApiListField("sections")
		@ApiField("top_section_vo")
		private List<TopSectionVo> sections;
		/**
		 * 班组id
		 */
		@ApiField("shift_group_id")
		private Long shiftGroupId;
		/**
		 * 班次组名称
		 */
		@ApiField("shift_group_name")
		private String shiftGroupName;
		/**
		 * 班次设置
		 */
		@ApiField("shift_setting")
		private TopShiftSettingVo shiftSetting;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<TopSectionVo> getSections() {
			return this.sections;
		}
		public void setSections(List<TopSectionVo> sections) {
			this.sections = sections;
		}
		public Long getShiftGroupId() {
			return this.shiftGroupId;
		}
		public void setShiftGroupId(Long shiftGroupId) {
			this.shiftGroupId = shiftGroupId;
		}
		public String getShiftGroupName() {
			return this.shiftGroupName;
		}
		public void setShiftGroupName(String shiftGroupName) {
			this.shiftGroupName = shiftGroupName;
		}
		public TopShiftSettingVo getShiftSetting() {
			return this.shiftSetting;
		}
		public void setShiftSetting(TopShiftSettingVo shiftSetting) {
			this.shiftSetting = shiftSetting;
		}
	}
	


}
