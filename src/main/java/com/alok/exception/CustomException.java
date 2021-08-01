    
public class CustomException extends RuntimeException {

    private final HttpStatus httpStatus;
    private final ErrorDetailsTO errorDetailsTO;

    public CustomException(String message, HttpStatus httpStatus, ErrorDetailsTO errorDetailsTO) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorDetailsTO = errorDetailsTO;
    }

    public CustomException(String message, HttpStatus httpStatus, List<ErrorDetails> issueListTO) {
        super(message);
        final ErrorDetailsTO tos = new ErrorDetailsTO();
        tos.setIssues(issueListTO);
        this.errorDetailsTO = tos;
        this.httpStatus = httpStatus;
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
