package mem;

import java.util.ArrayList;

public interface Dao {
	void insert(Member m);
	Member select(String id);  // select���� ���̵�� ��й�ȣ�� �ִ��� ������ �Ǵ��Ѵ�.
	ArrayList<Member> selectAll();
	void update(Member m);
	void delete(String id);
}

