package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Article
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T16:45:08.753148143+01:00[Europe/Berlin]", comments = "Generator version: 7.27.0")
public class Article {

  private UUID id;

  private String name;

  private Float preis;

  public Article() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Article(UUID id, String name, Float preis) {
    this.id = id;
    this.name = name;
    this.preis = preis;
  }

  public Article id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(UUID id) {
    this.id = id;
  }

  public Article name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Artikelname
   * @return name
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "name", example = "Stellschrauben", description = "Artikelname", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public Article preis(Float preis) {
    this.preis = preis;
    return this;
  }

  /**
   * Preis des Artikels
   * minimum: 0
   * @return preis
   */
  @NotNull @DecimalMin(value = "0") 
  @Schema(name = "preis", example = "0.99", description = "Preis des Artikels", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preis")
  public Float getPreis() {
    return preis;
  }

  @JsonProperty("preis")
  public void setPreis(Float preis) {
    this.preis = preis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this.id, article.id) &&
        Objects.equals(this.name, article.name) &&
        Objects.equals(this.preis, article.preis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, preis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preis: ").append(toIndentedString(preis)).append("\n");
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

