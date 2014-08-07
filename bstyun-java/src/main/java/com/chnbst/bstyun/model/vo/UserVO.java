package com.chnbst.bstyun.model.vo;

import com.chnbst.bstyun.core.model.IVO;
import com.chnbst.bstyun.model.pojo.User;

public class UserVO extends User implements IVO {
	private String groupName;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
}
