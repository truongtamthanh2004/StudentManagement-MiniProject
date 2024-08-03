package vn.titv.spring.demo.handle;

public class ErrorResponse {
    private int status;
    private String message;
    private Long timeStamp;

    public ErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
        this.timeStamp = System.currentTimeMillis();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
