package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Problem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T16:45:08.753148143+01:00[Europe/Berlin]", comments = "Generator version: 7.27.0")
public class Problem {

  private @Nullable URI type;

  private @Nullable String title;

  private @Nullable Integer status;

  private @Nullable String detail;

  private @Nullable String instance;

  public Problem type(@Nullable URI type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid @Size(max = 400) 
  @Schema(name = "type", example = "https://example.com/problems/not-found", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable URI getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable URI type) {
    this.type = type;
  }

  public Problem title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @Size(max = 200) 
  @Schema(name = "title", example = "Not Found", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public Problem status(@Nullable Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * minimum: 100
   * maximum: 599
   * @return status
   */
  @Min(value = 100) @Max(value = 599) 
  @Schema(name = "status", example = "404", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable Integer getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable Integer status) {
    this.status = status;
  }

  public Problem detail(@Nullable String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
   */
  @Size(max = 1000) 
  @Schema(name = "detail", example = "Artikel mit der Id 42 existiert nicht.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public @Nullable String getDetail() {
    return detail;
  }

  @JsonProperty("detail")
  public void setDetail(@Nullable String detail) {
    this.detail = detail;
  }

  public Problem instance(@Nullable String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   * @return instance
   */
  @Size(max = 400) 
  @Schema(name = "instance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance")
  public @Nullable String getInstance() {
    return instance;
  }

  @JsonProperty("instance")
  public void setInstance(@Nullable String instance) {
    this.instance = instance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.type, problem.type) &&
        Objects.equals(this.title, problem.title) &&
        Objects.equals(this.status, problem.status) &&
        Objects.equals(this.detail, problem.detail) &&
        Objects.equals(this.instance, problem.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

