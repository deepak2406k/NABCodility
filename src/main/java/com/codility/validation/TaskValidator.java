package com.codility.validation;

import com.codility.dto.TaskRequest;
import org.apache.commons.lang.StringUtils;

public class TaskValidator {

  public static boolean validateTaskRequest(TaskRequest taskRequest) {
      if(!Objects.isNull(taskRequest) &&  !StringUtils.isBlank(taskRequest.getTitle())
         && !StringUtils.isBlank(taskRequest.getDetails()) &&  !StringUtils.isBlank(taskRequest.getDueDate())){
          return true;
      }
      return false;
  }

  public static boolean validateTaskCompletionRequest(TaskRequest taskRequest) {
    if(!Objects.isNull(taskRequest) &&  !StringUtils.isBlank(taskRequest.getTitle())
        && !StringUtils.isBlank(taskRequest.getDetails()) &&  !StringUtils.isBlank(taskRequest.getDueDate())){
      return true;
    }
    return false;
  }

}
