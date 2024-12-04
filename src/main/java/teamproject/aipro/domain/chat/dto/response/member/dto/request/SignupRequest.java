package teamproject.aipro.domain.chat.dto.response.member.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
	private String userid;
	private String password;
	private String username;
}
