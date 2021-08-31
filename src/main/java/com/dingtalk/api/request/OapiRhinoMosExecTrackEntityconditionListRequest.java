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
import com.dingtalk.api.response.OapiRhinoMosExecTrackEntityconditionListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.track.entitycondition.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.20
 */
public class OapiRhinoMosExecTrackEntityconditionListRequest extends BaseTaobaoRequest<OapiRhinoMosExecTrackEntityconditionListResponse> {
	
	

	/** 
	* 入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(ListTrackRecordWithTrackIdsReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.track.entitycondition.list";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecTrackEntityconditionListResponse> getResponseClass() {
		return OapiRhinoMosExecTrackEntityconditionListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 分页
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Page extends TaobaoObject {
		private static final long serialVersionUID = 3689632126835335264L;
		/**
		 * 每页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 起始位置
		 */
		@ApiField("start")
		private Long start;
	
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getStart() {
			return this.start;
		}
		public void setStart(Long start) {
			this.start = start;
		}
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ListTrackRecordWithTrackIdsReq extends TaobaoObject {
		private static final long serialVersionUID = 8346359992768286734L;
		/**
		 * 实体ID列表
		 */
		@ApiListField("entity_ids")
		@ApiField("number")
		private List<Long> entityIds;
		/**
		 * 实体类型
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * 分页
		 */
		@ApiField("page")
		private Page page;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 追踪类型
		 */
		@ApiListField("track_types")
		@ApiField("string")
		private List<String> trackTypes;
		/**
		 * 预留参数
		 */
		@ApiField("userid")
		private String userid;
	
		public List<Long> getEntityIds() {
			return this.entityIds;
		}
		public void setEntityIds(List<Long> entityIds) {
			this.entityIds = entityIds;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
		public Page getPage() {
			return this.page;
		}
		public void setPage(Page page) {
			this.page = page;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public List<String> getTrackTypes() {
			return this.trackTypes;
		}
		public void setTrackTypes(List<String> trackTypes) {
			this.trackTypes = trackTypes;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}