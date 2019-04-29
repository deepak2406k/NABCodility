package com.codility.entity;

import com.codility.dto.Role;

@Entity
@Table(name = "USER")
public class User {

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column(name = "USER_NAME",nullable = false,length = 10)
  private String username;

  @Column(name = "PASSWORD", nullable = false, length = 8)
  private String password;

  @Column(name = "NAME", nullable = false, length = 15)
  private String name;

  @Column(name = "ADDITIONAL_INFO", nullable = true, length = 25)
  private String additionalInfo;

  @Column(name = "ROLE", nullable = true, length = 10)
  private Role role;



  public User() {
  }

  public User(String username, Char[] password, String name,Role role) {
    this.username = username;
    this.password = password;
    this.name = name;
    this.role = role;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}
