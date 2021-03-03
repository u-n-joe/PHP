package mem;

import java.util.ArrayList;

public class ServiceImpl implements Service {
	private Dao dao;

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addMember(Member m) {
		// TODO Auto-generated method stub
		dao.insert(m);
	}

	@Override  // 2. 아래 login함수에서 맴버의 정보를 확인하기 위해서 호출함. 즉, 맴버 정보를 찾는 함수이다.
	public Member getMember(String id) {
		// TODO Auto-generated method stub
		return dao.select(id); // DAO클래스로 이동
	}

	@Override
	public ArrayList<Member> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void editMember(Member m) {
		// TODO Auto-generated method stub
		dao.update(m);
	}

	@Override
	public void delMember(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override  // 1. Login에서 함수 호출해서 사용자가 입력한 아이디와 패스워드를 식별한다. 맞으면 flag로 true 아니면 false return
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Member m = getMember(id);  // getMember(id) 함수를 호출한다
		if (m != null && pwd.equals(m.getPwd())) {
			flag = true;
		}
		return flag;
	}

}
