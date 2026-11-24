package org.openapitools.api;

import org.openapitools.model.Article;
import org.openapitools.model.ArticleList;
import org.springframework.lang.Nullable;
import org.openapitools.model.PatchArticle;
import org.openapitools.model.Problem;
import org.openapitools.model.SimpleArticle;
import java.net.URI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T16:45:08.753148143+01:00[Europe/Berlin]", comments = "Generator version: 7.27.0")
@Controller
@RequestMapping("${openapi.katalog.base-path:}")
public class ArticlesApiController implements ArticlesApi {

    private final NativeWebRequest request;

    @Autowired
    public ArticlesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
