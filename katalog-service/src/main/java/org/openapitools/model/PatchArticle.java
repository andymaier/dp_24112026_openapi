package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PatchArticle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T16:45:08.753148143+01:00[Europe/Berlin]", comments = "Generator version: 7.27.0")
public class PatchArticle {

  private @Nullable String name;

  private @Nullable Float preis;

  public PatchArticle name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Artikelname
   * @return name
   */
  @Size(max = 50) 
  @Schema(name = "name", example = "Stellschrauben", description = "Artikelname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public PatchArticle preis(@Nullable Float preis) {
    this.preis = preis;
    return this;
  }

  /**
   * Preis des Artikels
   * minimum: 0
   * @return preis
   */
  @DecimalMin(value = "0") 
  @Schema(name = "preis", example = "0.99", description = "Preis des Artikels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preis")
  public @Nullable Float getPreis() {
    return preis;
  }

  @JsonProperty("preis")
  public void setPreis(@Nullable Float preis) {
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
    PatchArticle patchArticle = (PatchArticle) o;
    return Objects.equals(this.name, patchArticle.name) &&
        Objects.equals(this.preis, patchArticle.preis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, preis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchArticle {\n");
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

