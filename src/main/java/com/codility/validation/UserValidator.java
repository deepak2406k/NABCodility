package com.codility.validation;

import com.codility.dto.Role;
import com.codility.exception.UserException;
import org.springframework.http.HttpStatus;

public class UserValidator {

  /**
   * User must be either manager or norname User
   * @param userRole
   * @return
   */
  public void validUser(final String userRole) {
    if(!Role.MANAGER.equals(userRole) || !Role.USER.equals(userRole)) {
      throw new UserException("Invalid User operation", HttpStatus.BAD_REQUEST);
    }
  }

  /**
   * User must be either manager or norname User
   * @param userRole
   * @return
   */
  public void validManager(final String userRole) {
    if(!Role.MANAGER.equals(userRole))){
      throw new UserException("Not Valid Manager", HttpStatus.BAD_REQUEST);
    }
  }

}
