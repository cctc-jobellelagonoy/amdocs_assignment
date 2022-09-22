package com.training.assignment8.Task2;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Member> members;
	
	public Library() {
		members = new ArrayList<>();
		members.add(new Member("Initial Member", "PH"));
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public List findByAddress(String address) {
		return (List) members.stream().filter(member -> member.getAddress().equals(address)).toList();
	}
	
	public List getMembers() {
		return members;
	}
	
}
