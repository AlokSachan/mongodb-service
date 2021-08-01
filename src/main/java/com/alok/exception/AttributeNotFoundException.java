import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

public class AttributeNotFoundException extends RuntimeException {

    private final HttpStatus httpStatus;
    private ErrorDetailsTO errorDetailsTO;

    public AttributeNotFoundException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public AttributeNotFoundException(String message, HttpStatus httpStatus, ErrorDetailsTO errorDetailsTO) {
        this(message, httpStatus);
        this.errorDetailsTO = errorDetailsTO;
    }

    public AttributeNotFoundException(String message, HttpStatus httpStatus, List<ErrorDetails> issueListTO) {
        this(message, httpStatus);
        this.errorDetailsTO = new ErrorDetailsTO();
        this.errorDetailsTO.setIssues(issueListTO);
    }

    public ErrorDetailsTO getErrorDetailsTO() {
        return errorDetailsTO;
    }

    public List<ErrorDetails> getIssues() {
        return errorDetailsTO != null ? errorDetailsTO.getIssues() : Collections.emptyList();
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
