package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiEnterpriseSubareaTotaldataStatResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.enterprise.subarea.totaldata.stat request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.10
 */
public class OapiEnterpriseSubareaTotaldataStatRequest extends BaseTaobaoRequest<OapiEnterpriseSubareaTotaldataStatResponse> {
	
	

	/** 
	* 企业ID
	 */
	private String corpId;

	/** 
	* 排序
	 */
	private String orderBy;

	/** 
	* 分页查询条数，最多30条
	 */
	private Long pageSize;

	/** 
	* 分页起始点
	 */
	private Long pageStart;

	/** 
	* act_ratio_1d_001	所辖区域活跃率; act_usr_cnt_1d_001	活跃用户数最近1天; active_mbr_cnt_std_001	历史截至当日激活会员数; active_mbr_ratio	所辖区域用户的激活率; city_lat	所属城市维度; city_lng	所属城市经度; county_lat	区县纬度; county_lng	区县经度; mbr_cnt_std_063	历史截至当日企业会员数; online_org_cnt	所辖区域在线组织数	; org_online_ratio	所辖区域组织覆盖率	; real_org_cnt	所辖区域实际组织数	; send_message_cnt_1d	发送消息数量; send_message_user_cnt_1d	发送消息人数;
	 */
	private String returnFields;

	/** 
	* 查询时间
	 */
	private String statDate;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public void setOrderBy(OrderBy orderBy) {
		this.orderBy = new JSONWriter(false,false,true).write(orderBy);
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageStart(Long pageStart) {
		this.pageStart = pageStart;
	}

	public Long getPageStart() {
		return this.pageStart;
	}

	public void setReturnFields(String returnFields) {
		this.returnFields = returnFields;
	}

	public String getReturnFields() {
		return this.returnFields;
	}

	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}

	public String getStatDate() {
		return this.statDate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.enterprise.subarea.totaldata.stat";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("page_start", this.pageStart);
		txtParams.put("return_fields", this.returnFields);
		txtParams.put("stat_date", this.statDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEnterpriseSubareaTotaldataStatResponse> getResponseClass() {
		return OapiEnterpriseSubareaTotaldataStatResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpId, "corpId");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(pageStart, "pageStart");
		RequestCheckUtils.checkNotEmpty(returnFields, "returnFields");
		RequestCheckUtils.checkMaxListSize(returnFields, 50, "returnFields");
		RequestCheckUtils.checkNotEmpty(statDate, "statDate");
	}
	
	/**
	 * 排序
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderBy extends TaobaoObject {
		private static final long serialVersionUID = 4867713963478625421L;
		/**
		 * 排查的key
		 */
		@ApiField("field")
		private String field;
		/**
		 * 升序或者降序
		 */
		@ApiField("order")
		private String order;
	
		public String getField() {
			return this.field;
		}
		public void setField(String field) {
			this.field = field;
		}
		public String getOrder() {
			return this.order;
		}
		public void setOrder(String order) {
			this.order = order;
		}
	}
	

}