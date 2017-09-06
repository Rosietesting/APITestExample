package com.vvoosh.api.api.Post;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by rossy on 05/09/2017.
 *  "privacyLevel": "value",
 *   "title": "value",

 */
public class PostBody {
    @JsonProperty ("jsonBody")
    private jsonBody jsonBody;
    @JsonProperty ("verbSummaries")
    private List<Object> verbSummaries;
    @JsonProperty("interestIds")
    private List<Integer> interestIds;
    @JsonProperty("hashTags")
    private List<Object> hashTags = null;
    @JsonProperty("privacyLevel")
    private String privacyLevel;
    @JsonProperty("title")
    private String title;
    @JsonProperty ("author")
    private author author;
    @JsonProperty("places")
    private List<Object> places = null;
    @JsonProperty("privacyLevel")
    public String getPrivacyLevel() {
        return privacyLevel;
    }
    @JsonProperty("privacyLevel")
    public void setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
    }
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonProperty ("jsonBody")
    public jsonBody getJsonBody() {
        return jsonBody;
    }
    @JsonProperty ("jsonBody")
    public void setJsonBody(jsonBody jsonBody) {
        this.jsonBody = jsonBody;
    }
    @JsonProperty ("author")
    public author getAuthor() {
        return author;
    }
    @JsonProperty ("author")
    public void setAuthor(author author) {
        this.author = author;
    }
    @JsonProperty("interestIds")
    public List<Integer> getInterestIds() {
        return interestIds;
    }
    @JsonProperty("interestIds")
    public void setInterestIds(List<Integer> interestIds) {
        this.interestIds = interestIds;
    }
    @JsonProperty("verbSummaries")
    public List<Object> getVerbSummaries() {
        return verbSummaries;
    }
    @JsonProperty("verbSummaries")
    public void setVerbSummaries(List<Object> verbSummaries) {
        this.verbSummaries = verbSummaries;
    }
    @JsonProperty("hashTags")
    public List<Object> getHashTags() {
        return hashTags;
    }
    @JsonProperty("hashTags")
    public void setHashTags(List<Object> hashTags) {
        this.hashTags = hashTags;
    }
    @JsonProperty("places")
    public List<Object> getPlaces() {
        return places;
    }
    @JsonProperty("places")
    public void setPlaces(List<Object> places) {
        this.places = places;
    }
}
