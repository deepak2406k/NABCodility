package com.codility.entity;

@Entity
@Table(name = "TASK")
public class Task {

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "TITLE",nullable = false,length = 15)
  private String Title;

  @Column(name = "DETAILS",nullable = false,length = 25)
  private String Details;

  @Column(name = "DUE_DATE",nullable = false,length = 10)
  private Date dueDate;

  @Column(name = "COMPLETION_DATE",nullable = false,length = 10)
  private Date completionDate;

  public Task() {
  }

  public Task(String title, String details, Date dueDate) {
    Title = title;
    Details = details;
    this.dueDate = dueDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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
