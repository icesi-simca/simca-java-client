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
import io.swagger.client.model.PollutantDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PollutantsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-19T00:57:09.000-05:00")
public class PollutantsDTO {
  @SerializedName("pollutants")
  private List<PollutantDTO> pollutants = null;

  public PollutantsDTO pollutants(List<PollutantDTO> pollutants) {
    this.pollutants = pollutants;
    return this;
  }

  public PollutantsDTO addPollutantsItem(PollutantDTO pollutantsItem) {
    if (this.pollutants == null) {
      this.pollutants = new ArrayList<PollutantDTO>();
    }
    this.pollutants.add(pollutantsItem);
    return this;
  }

   /**
   * List of pollutants
   * @return pollutants
  **/
  @ApiModelProperty(value = "List of pollutants")
  public List<PollutantDTO> getPollutants() {
    return pollutants;
  }

  public void setPollutants(List<PollutantDTO> pollutants) {
    this.pollutants = pollutants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollutantsDTO pollutantsDTO = (PollutantsDTO) o;
    return Objects.equals(this.pollutants, pollutantsDTO.pollutants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pollutants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollutantsDTO {\n");
    
    sb.append("    pollutants: ").append(toIndentedString(pollutants)).append("\n");
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

