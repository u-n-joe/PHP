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

	@Override  // 2. �Ʒ� login�Լ����� �ɹ��� ������ Ȯ���ϱ� ���ؼ� ȣ����. ��, �ɹ� ������ ã�� �Լ��̴�.
	public Member getMember(String id) {
		// TODO Auto-generated method stub
		return dao.select(id); // DAOŬ������ �̵�
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

	@Override  // 1. Login���� �Լ� ȣ���ؼ� ����ڰ� �Է��� ���̵�� �н����带 �ĺ��Ѵ�. ������ flag�� true �ƴϸ� false return
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Member m = getMember(id);  // getMember(id) �Լ��� ȣ���Ѵ�
		if (m != null && pwd.equals(m.getPwd())) {
			flag = true;
		}
		return flag;
	}

}
