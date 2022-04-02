package itc.hoseo.sample.repo.imp;

import itc.hoseo.sample.domain.Member;
import itc.hoseo.sample.repo.MemberRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class HashMapMemberRepository implements MemberRepository {
    private HashMap<String, Member> map = new HashMap<>();

    public List<Member> findAll() {
        return map.values().stream().collect(Collectors.toList());
    }

    @Override
    public Member save(Member m) {
        return map.put(m.getName(), m);
    }

}
