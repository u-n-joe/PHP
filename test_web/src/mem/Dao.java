package mem;

import java.util.ArrayList;

public interface Dao {
	void insert(Member m);
	Member select(String id);  // select으로 아이디와 비밀번호가 있는지 유무를 판단한다.
	ArrayList<Member> selectAll();
	void update(Member m);
	void delete(String id);
}

