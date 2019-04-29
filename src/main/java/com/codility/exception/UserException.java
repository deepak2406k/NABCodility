package com.codility.exception;

import org.springframework.http.HttpStatus;

public class UserException extends RuntimeException {
  public UserException(String message) {
    super(message);
  }
  private HttpStatus httpStatus;
  public UserException(String message,HttpStatus httpStatus) {
    super(message);
    this.httpStatus = httpStatus;
  }
  public HttpStatus getHttpStatus() {
    return httpStatus;
  }
}
