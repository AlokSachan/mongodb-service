import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocessableEntityException extends RuntimeException {

    private final ErrorDetailsTO errorDetailsTO;

    public UnprocessableEntityException(String message, List<ErrorDetails> issueListTO) {
        super(message);
        final ErrorDetailsTO tos = new ErrorDetailsTO();
        tos.setIssues(issueListTO);
        this.errorDetailsTO = tos;
    }

    public ErrorDetailsTO getErrorDetailsTO() {
        return errorDetailsTO;
    }
}
