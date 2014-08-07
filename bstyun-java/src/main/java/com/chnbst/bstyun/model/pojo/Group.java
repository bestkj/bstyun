package com.chnbst.bstyun.model.pojo;

import com.chnbst.bstyun.core.model.IPOJO;

public class Group implements IPOJO{
	private int groupId;
	private String groupName;
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
}
