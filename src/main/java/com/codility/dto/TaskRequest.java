package com.codility.dto;

public class TaskRequest {

  @NotNull
  @NotBlank
  @Size(min = 8, max = 15)
  @Pattern(regexp = "[0-9].+")
  private String Title;

  @NotNull
  @NotBlank
  @Size(min = 8, max = 25)
  private String Details;

  @NotNull
  private Date dueDate;

  private Date completionDate;


  public String getTitle() {
    return Title;
  }

  public void setTitle(String title) {
    Title = title;
  }

  public String getDetails() {
    return Details;
  }

  public void setDetails(String details) {
    Details = details;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public Date getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(Date completionDate) {
    this.completionDate = completionDate;
  }
}
