package teamproject.aipro.domain.chat.dto.response.member.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import teamproject.aipro.domain.chat.dto.response.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member> findByuserid(String id);
}
