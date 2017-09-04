package com.vvoosh.payloads.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rossy on 31/08/2017.
 */
public class PostPayload {
    @JsonProperty
    private String title;
    @JsonProperty
    private String privacyLevel;
    @JsonProperty
    private String text;



    private PostPayload(String title, String privacyLevel,String text){
        this.title=title;
        this.privacyLevel=privacyLevel;
        this.text=text;
    }


    public static class postPayloadBuilder{
        private String title;
        private String privacyLevel;
        private String text;


        public postPayloadBuilder setTitle(String title){
            this.title=title;
            return this;
        }
        public postPayloadBuilder setPrivacyLevel(String privacyLevel){
            this.privacyLevel=privacyLevel;
            return this;
        }
        public postPayloadBuilder setText(String text){
            this.text=text;
            return this;
        }
        public PostPayload build(){
            return new PostPayload(title,privacyLevel,text);
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrivacyLevel() {
        return privacyLevel;
    }

    public void setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



}

