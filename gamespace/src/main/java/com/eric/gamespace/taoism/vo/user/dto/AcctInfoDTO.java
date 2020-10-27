package com.eric.gamespace.taoism.vo.user.dto;

import org.springframework.beans.BeanUtils;

import com.eric.gamespace.taoism.common.enums.AcctStatus;
import com.eric.gamespace.taoism.common.enums.AcctType;
import com.eric.gamespace.taoism.entity.TaoismAcctInfo;
import com.eric.gamespace.taoism.vo.user.AcctInfoVo;

/**
 * 账户信息数据转换类
 * @author eric
 *
 */
public class AcctInfoDTO {

	public static AcctInfoVo AcctInfoP2V (TaoismAcctInfo po) {
		AcctInfoVo vo = new AcctInfoVo();
		BeanUtils.copyProperties(po, vo);
		//将部分字段转换成展示层使用的字符串
		vo.setAcctStatusDesc(AcctStatus.getStatusDesc(po.getAcctStatus()));
		vo.setAcctType(AcctType.getTypeDesc(po.getAcctType()));
		return vo;
	}
	
}
