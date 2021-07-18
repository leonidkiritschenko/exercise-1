package com.leonid.exercise1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "userId",
        "title",
        "body"
})
@Data
public class Post {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("userId")
    private Long userId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

}
