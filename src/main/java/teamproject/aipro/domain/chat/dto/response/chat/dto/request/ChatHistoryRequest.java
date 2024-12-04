package teamproject.aipro.domain.chat.dto.response.chat.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatHistoryRequest {
	private String userId;
	private String question;
	private String response;

}
