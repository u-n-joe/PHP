package com.example.demo.mem;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired//의존성 자동 주입
	private MemberDao dao;
	
	public void addMember(Member m) {
		dao.insert(m);
	}
	public Member getMember(String id) {
		return dao.select(id);
	}

	public void editMember(Member m) {
		dao.update(m);
	}
	public void delMember(String id) {
		dao.delete(id);
	}
	public boolean login(String id, String pwd) {
		boolean flag = false;
		Member m = getMember(id);
		if (m != null && pwd.equals(m.getPwd())) {
			flag = true;
		}
		return flag;
	}
}
