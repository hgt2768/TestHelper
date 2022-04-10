package helper.account.dao;

import helper.account.dto.AccountDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AccountDAO {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    // 개별 조회
    public AccountDTO selectOne(String id) {
        AccountDTO dto = null;
        try {
            dto = sqlSessionTemplate.selectOne("mybatis.account.selectOne", id);
        } catch (Throwable t) {
            System.out.println("AccountDAO selectOne 실패");
            System.out.println(t);
        }
        return dto;
    }

    // 리스트 조회
    public List<AccountDTO> selectList(int startNum, int endNUm) {
        Map<String, Integer> map = new HashMap<>();
        map.put("startNum", startNum);
        map.put("endNum", endNUm);
        List<AccountDTO> list = new ArrayList<>();
        try {
            list = sqlSessionTemplate.selectList("mybatis.account.selectList", map);
        } catch (Throwable t) {
            System.out.println("AccountDAO selectList 실패");
            System.out.println(t);
        }
        return list;
    }

    // 전체 갯수 조회
    public int totalA(){
        int result = 0;
        try {
            result = sqlSessionTemplate.selectOne("mybatis.account.totalA");
        } catch (Throwable t) {
            System.out.println("AccountDAO totalA 실패");
            System.out.println(t);
        }
        return result;
    }

    // 회원추가
    public int insert(AccountDTO dto) {
        int result = 0;
        try {
            result = sqlSessionTemplate.insert("mybatis.account.insert");
        } catch (Throwable t) {
            System.out.println("AccountDAO insert 실패");
            System.out.println(t);
        }
        return result;
    }

    // 회원 삭제
    public int delete(String id) {
        int result = 0;
        try {
            result = sqlSessionTemplate.delete("mybatis.account.delete");
        } catch (Throwable t) {
            System.out.println("Account delete 실패");
            System.out.println(t);
        }
        return result;
    }

    // 회원 정보 수정
    public int modify(AccountDTO dto) {
        int result = 0;
        try {
            result = sqlSessionTemplate.update("mybatis.account.modify");
        } catch (Throwable t) {
            System.out.println("AccountDAO modify 실패");
            System.out.println(t);
        }
        return result;
    }
}
