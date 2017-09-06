package com.vvoosh.api.api.Post;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rossy on 05/09/2017.
 *
 *  "content": {
 "text": "sunshine"
 }
 */
public class content {
    @JsonProperty ("text")
    private String text;
    @JsonProperty ("text")
    public String getText() {
        return text;
    }
    @JsonProperty ("text")
    public void setText(String text) {
        this.text = text;
    }
}
