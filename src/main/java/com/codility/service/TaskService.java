package com.codility.service;

import com.codility.dto.TaskRequest;
import com.codility.validation.TaskValidator;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.codility.entity.Task;

@Service
public class TaskService {

  private final Logger log = new Logger(TaskService.class);

  @Autowired
  private RequestPaymentRepository requestPaymentRepository;

  public void createTask(final TaskRequest taskRequest) {
    if (TaskValidator.validateTaskRequest(taskRequest)) {
      log.info("Create Task : " + taskRequest.toString());
      requestPaymentRepository.save(populateTask(taskRequest));
    }
  }
  public void updateTask(final TaskRequest taskRequest) {
    if (TaskValidator.validateTaskRequest(taskRequest)) {
      log.info("update Task : " + taskRequest.toString());
      requestPaymentRepository.save(populateTask(taskRequest));
    }
  }

  public void completeTask(final TaskRequest taskRequest) {
    if (TaskValidator.validateTaskCompletionRequest(taskRequest)) {
      log.info("completeTask Task : " + taskRequest.toString());
      requestPaymentRepository.save(populateTask(taskRequest));
    }
  }

  public void finAllOutstandingTask() {
      log.info("finAllOutstandingTask will find all record for which task is incomplete ");
      requestPaymentRepository.finAllOutstandingTask();
  }

  public void finAllTask() {
      log.info("finAllTask will find all tasks  which includes complte & in-complete tasks ");
      requestPaymentRepository.findAll();
  }

  private Task populateTask(TaskRequest taskRequest) {
    final Task task = new Task(taskRequest.getTitle(),taskRequest.getDetails(),taskRequest.getDueDate());
    task.setCompletionDate(taskRequest.setCompletionDate());
    return task;
  }

}
