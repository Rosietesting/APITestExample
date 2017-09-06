package com.vvoosh.api.api.Post;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rossy on 05/09/2017.
 *
 *  "author": {
 "id": value
 },
 */
public class author {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }
}
