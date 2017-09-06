package com.vvoosh.api.api.Post;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by rossy on 05/09/2017.
 *
 *  "jsonBody": {
 *  "sections": [{
 *  "type": "text",
 *  "content": {
 *  "text": "sunshine"
 }
 }]
 }


 */
public class jsonBody {
    @JsonProperty ("sections")
    private List<sections> sections=null;


    @JsonProperty ("sections")
    public List<sections> getsections() {
        return sections;
    }

    @JsonProperty ("sections")
    public void setsections(List<sections> sections) {
        this.sections = sections;


    }
}
