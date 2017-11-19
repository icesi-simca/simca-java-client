/*
 * API SIMCA
 * SIMCA API Client
 *
 * OpenAPI spec version: 1.0.4
 * Contact: pdgsimca@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UsersDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-18T23:27:07.769-05:00")
public class UsersDTO {
  @SerializedName("users")
  private List<UserDTO> users = null;

  public UsersDTO users(List<UserDTO> users) {
    this.users = users;
    return this;
  }

  public UsersDTO addUsersItem(UserDTO usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UserDTO>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users
   * @return users
  **/
  @ApiModelProperty(value = "List of users")
  public List<UserDTO> getUsers() {
    return users;
  }

  public void setUsers(List<UserDTO> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersDTO usersDTO = (UsersDTO) o;
    return Objects.equals(this.users, usersDTO.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersDTO {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
