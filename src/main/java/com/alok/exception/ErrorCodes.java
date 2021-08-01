public class ErrorCodes {

    public static final String ERR_40000_ALREADY_EXISTS = "ERR_40000_ALREADY_EXISTS";
    public static final String ERR_40001_MANDATORY = "ERR_40001_MANDATORY";
    public static final String ERR_40002_WRONG_ITEM = "ERR_40002_WRONG_ITEM";
    public static final String ERR_40003_WRONG_CHAR = "ERR_40003_WRONG_CHAR";
    public static final String ERR_40004_WRONG_DATE_FORMAT = "ERR_40004_WRONG_DATE_FORMAT";
    public static final String ERR_40005_OUT_OF_RANGE = "ERR_40005_OUT_OF_RANGE";
    public static final String ERR_40006_MAX_LENGTH = "ERR_40006_MAX_LENGTH";
    public static final String ERR_40006_MIN_LENGTH = "ERR_40006_MIN_LENGTH";
    public static final String ERR_40007_NOT_INTEGER = "ERR_40007_NOT_INTEGER";
    public static final String ERR_40008_WRONG_VALUE = "ERR_40008_WRONG_VALUE";
    public static final String ERR_40009_DUPLICITY = "ERR_40009_DUPLICITY";
    public static final String ERR_5000_NOT_ALLOWED = "ERR_5000_NOT_ALLOWED";
    public static final String ERR_40010_NOT_FOUND = "ERR_40010_NOT_FOUND";
    public static final String  ERR_40011_NOT_SUPPORTED  ="ERR_40011_NOT_SUPPORTED";
    public static final String  ERR_40012_LIMIT_EXCEEDED ="ERR_40012_LIMIT_EXCEEDED";
    public static final String ERR_1000_INVALID_OFFER= "ERR_1000_INVALID_OFFER";
    public static final String ERR_500_INTERNAL_SERVER = "ERR_500_INTERNAL_SERVER_ERROR";


    public static final String ALREADY_EXISTS = "Record already exists";
    public static final String MANDATORY = "Mandatory field is empty or null";
    public static final String WRONG_ITEM = "Not a value from list";
    public static final String WRONG_CHAR = "Not allowed character";
    public static final String WRONG_DATE_FORMAT = "Wrong date format";
    public static final String OUT_OF_RANGE = "Value is out of range";
    public static final String MAX_LENGTH = "Too long";
    public static final String MIN_LENGTH = "Too short";
    public static final String NOT_INTEGER = "Whole positive number is expected";
    public static final String WRONG_VALUE = "Value doesn't match conditions";
    public static final String DUPLICITY = "Duplicity with existing and active user";
    public static final String NOT_ALLOWED = "Not Allowed";
    public static final String OTP_EXPIRED = "OTP Expired";
    public static final String EMAIL_VERIFICATION_REQ = "Please verify the email first.";
    public static final String WRONG_OTP = "Invalid OTP, Please enter correct OTP.";
    public static final String NOT_FOUND = "Not found";
    public static final String INVALID_PHONE_NUMBER = "Invalid phone number";
    public static final String WRONG_FILTERS = "Invalid / Wrong Filters";
    public static final String PAYMENT_BAD_REQUEST = "There was an error processing request";
    public static final String EMAIL_NOT_DEFINE = "Email for sending is not defined";
    public static final String PROFILE_NOT_FOUND = "Profile not found";
    public static final String DOCUMENT_UPLOAD_FAILED = "Document upload failed";
    public static final String DOCUMENT_DOWNLOAD_FAILED = "Document download failed";

    public static final String APPLICATION_NOT_FOUND = "Application Not Found";
    public static final String CONTACT_NOT_FOUND = "Contact Not Found";
    public static final String YES_NO_ALLOWED = "Only YES or NO options are allowed";
    public static final String COMMODITY_SCAN_UID_ALLOWED = "Only COMMODITY and SCAN_UID values are allowed";
    public static final String BANK_ACCOUNT_STATUS = "Only SELECTED and DIFFERENT values are allowed";
    public static final String AADHAAR_DATA_STATUS = "Only CORRECT, TRY and REJECTED values are allowed";
    public static final String AADHAAR_VERIFICATION = "Only IRIS, OTP and FINGERPRINT values are allowed";
    public static final String CONTACT_DOCUMENT_NOT_FOUND = "Contact Number or Document Not Found";
    public static final String AADHAAR_PROFILE_NOT_FOUND = "Aadhaar profile Not Found";
    public static final String UID_TOKEN_NOT_FOUND = "UID token is null or Empty";

    public static final String CONTRACT_CODE_NOT_FOUND = "Contract Number Not Found";
    public static final String CLIENT_DOCUMENT_NOT_FOUND = "No Document is required to be uploaded";
    private ErrorCodes() {
    }
}
