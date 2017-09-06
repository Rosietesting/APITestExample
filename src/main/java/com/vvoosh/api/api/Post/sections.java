package com.vvoosh.api.api.Post;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rossy on 05/09/2017.
 *
 *  "sections": [{
 *  "type": "text",
 }]
 *
 */
public class sections {
    @JsonProperty("type")
    private String type;
    @JsonProperty ("content")
    private content content;

    @JsonProperty("type")
    public String getType() {
        return type;
    }
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }
    @JsonProperty ("content")
    public content getContent() {
        return content;
    }
    @JsonProperty ("content")
    public void setContent(content content) {
        this.content = content;
    }
}
