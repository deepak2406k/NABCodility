package com.codility.controller;


import com.codility.dto.TaskRequest;
import com.codility.service.TaskService;
import com.codility.validation.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

  private final String SUCCESS_MESSAGE = "Success";

  @Autowired
  private TaskService taskService;

  @Autowired
  private UserValidator userValidator;

  /**
   * This method create task
   * @param userRole - Only Manager are allowed to create task
   */
  @PostMapping(value = "/v1/task/create")
  public void createTask(
      @RequestHeader(name = "User-Role") String userRole,
      @RequestBody @Valid TaskRequest taskRequest) {
    userValidator.validManager(userRole);
    taskService.createTask(taskRequest);
  }

  /**
   * This method update task details
   *
   * @param userRole - Only Manager are allowed to update task
   */
  @PutMapping(value = "/v1/task/update")
  public void updateTask(
      @RequestHeader(name = "User-Role") String userRole,
      @RequestBody @Valid TaskRequest taskRequest) {
    userValidator.validManager(userRole);
    taskService.updateTask(taskRequest);
  }

  /**
   * This method complete task
   *
   * @param userRole - Only Manager are allowed to update task
   */
  @PutMapping(value = "/v1/task/completeTask")
  public void completeTask(
      @RequestHeader(name = "User-Role") String userRole,
      @RequestBody @Valid TaskRequest taskRequest) {
    userValidator.validManager(userRole);
    taskService.completeTask(taskRequest);
  }

  /**
   * This method find All task
   *
   * @param userRole - Only Manager are allowed to find tasK
   */
  @GetMapping(value = "/v1/task/findAllTask")
  public void findAllTask(
      @RequestHeader(name = "User-Role") String userRole) {
    userValidator.validManager(userRole);
    taskService.finAllTask();
  }

  /**
   * This method fina Outstanding task
   *
   * @param userRole - Only User/Manager are allowed fina Outstanding task
   */
  @GetMapping(value = "/v1/task/findOutstandingTask")
  public void findOutstandingTask(
      @RequestHeader(name = "User-Role") String userRole) {
    userValidator.validUser(userRole);
    taskService.finAllOutstandingTask();
  }

}
