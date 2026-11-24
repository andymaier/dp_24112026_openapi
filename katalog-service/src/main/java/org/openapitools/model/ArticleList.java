package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Article;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ArticleList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T16:45:08.753148143+01:00[Europe/Berlin]", comments = "Generator version: 7.27.0")
public class ArticleList {

  private List<@Valid Article> articles = new ArrayList<>();

  public ArticleList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArticleList(List<@Valid Article> articles) {
    this.articles = articles;
  }

  public ArticleList articles(List<@Valid Article> articles) {
    this.articles = articles;
    return this;
  }

  public ArticleList addArticlesItem(Article articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<>();
    }
    this.articles.add(articlesItem);
    return this;
  }

  /**
   * Get articles
   * @return articles
   */
  @NotNull @Size(max = 1000) 
  @Schema(name = "articles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("articles")
  public List<@Valid Article> getArticles() {
    return articles;
  }

  @JsonProperty("articles")
  public void setArticles(List<@Valid Article> articles) {
    this.articles = articles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleList articleList = (ArticleList) o;
    return Objects.equals(this.articles, articleList.articles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleList {\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
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

