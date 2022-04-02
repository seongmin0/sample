package itc.hoseo.sample.repo;

import itc.hoseo.sample.domain.Member;

import java.util.List;

public interface MemberRepository {
    List<Member> findAll();
    Member save(Member m);
}
