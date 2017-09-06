package com.vvoosh.api.api.Registration;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by rossy on 05/09/2017.
 */
public class Registration {

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("confirmPassword")
    private String confirmPassword;
    @JsonProperty("inviteCode")
    private String inviteCode;
    @JsonProperty("genderId")
    private Integer genderId;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("googlePlaceId")
    private String googlePlaceId;
    @JsonProperty("locationFormatted")
    private String locationFormatted;
    @JsonProperty("latitude")
    private Integer latitude;
    @JsonProperty("longitude")
    private Integer longitude;
    @JsonProperty("termsAndConditions")
    private Boolean termsAndConditions;
    @JsonProperty("personalDetailsPrivacyLevel")
    private String personalDetailsPrivacyLevel;
    @JsonProperty("contactInformationPrivacyLevel")
    private String contactInformationPrivacyLevel;
    @JsonProperty("aboutMePrivacyLevel")
    private String aboutMePrivacyLevel;
    @JsonProperty("friendListPrivacyLevel")
    private String friendListPrivacyLevel;
    @JsonProperty("interestListPrivacyLevel")
    private String interestListPrivacyLevel;
    @JsonProperty("allMediaPrivacyLevel")
    private String allMediaPrivacyLevel;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("twitterHandle")
    private String twitterHandle;
    @JsonProperty("aboutMe")
    private String aboutMe;
    @JsonProperty("relationshipStatus")
    private Integer relationshipStatus;
    @JsonProperty("canUseEventAdmin")
    private Boolean canUseEventAdmin;
    @JsonProperty("backgroundImageUri")
    private String backgroundImageUri;
    @JsonProperty("resetDefaultProfileImage")
    private Boolean resetDefaultProfileImage;
    @JsonProperty("resetDefaultHeroImage")
    private Boolean resetDefaultHeroImage;
    @JsonProperty("captcha")
    private String captcha;
    @JsonProperty("languages")
    private List<String> languages = null;
    @JsonProperty("skills")
    private List<String> skills = null;
    @JsonProperty("languagesPrivacyLevel")
    private String languagesPrivacyLevel;
    @JsonProperty("skillsPrivacyLevel")
    private String skillsPrivacyLevel;
    @JsonProperty("emailsFriendRequestEnabled")
    private Boolean emailsFriendRequestEnabled;
    @JsonProperty("emailsFriendRequestAcceptedEnabled")
    private Boolean emailsFriendRequestAcceptedEnabled;
    @JsonProperty("emailsEventInviteEnabled")
    private Boolean emailsEventInviteEnabled;
    @JsonProperty("emailsEventEndedEnabled")
    private Boolean emailsEventEndedEnabled;
    @JsonProperty("email")
    private String email;

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("confirmPassword")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    @JsonProperty("confirmPassword")
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @JsonProperty("inviteCode")
    public String getInviteCode() {
        return inviteCode;
    }

    @JsonProperty("inviteCode")
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    @JsonProperty("genderId")
    public Integer getGenderId() {
        return genderId;
    }

    @JsonProperty("genderId")
    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("googlePlaceId")
    public String getGooglePlaceId() {
        return googlePlaceId;
    }

    @JsonProperty("googlePlaceId")
    public void setGooglePlaceId(String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
    }

    @JsonProperty("locationFormatted")
    public String getLocationFormatted() {
        return locationFormatted;
    }

    @JsonProperty("locationFormatted")
    public void setLocationFormatted(String locationFormatted) {
        this.locationFormatted = locationFormatted;
    }

    @JsonProperty("latitude")
    public Integer getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Integer getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("termsAndConditions")
    public Boolean getTermsAndConditions() {
        return termsAndConditions;
    }

    @JsonProperty("termsAndConditions")
    public void setTermsAndConditions(Boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    @JsonProperty("personalDetailsPrivacyLevel")
    public String getPersonalDetailsPrivacyLevel() {
        return personalDetailsPrivacyLevel;
    }

    @JsonProperty("personalDetailsPrivacyLevel")
    public void setPersonalDetailsPrivacyLevel(String personalDetailsPrivacyLevel) {
        this.personalDetailsPrivacyLevel = personalDetailsPrivacyLevel;
    }

    @JsonProperty("contactInformationPrivacyLevel")
    public String getContactInformationPrivacyLevel() {
        return contactInformationPrivacyLevel;
    }

    @JsonProperty("contactInformationPrivacyLevel")
    public void setContactInformationPrivacyLevel(String contactInformationPrivacyLevel) {
        this.contactInformationPrivacyLevel = contactInformationPrivacyLevel;
    }

    @JsonProperty("aboutMePrivacyLevel")
    public String getAboutMePrivacyLevel() {
        return aboutMePrivacyLevel;
    }

    @JsonProperty("aboutMePrivacyLevel")
    public void setAboutMePrivacyLevel(String aboutMePrivacyLevel) {
        this.aboutMePrivacyLevel = aboutMePrivacyLevel;
    }

    @JsonProperty("friendListPrivacyLevel")
    public String getFriendListPrivacyLevel() {
        return friendListPrivacyLevel;
    }

    @JsonProperty("friendListPrivacyLevel")
    public void setFriendListPrivacyLevel(String friendListPrivacyLevel) {
        this.friendListPrivacyLevel = friendListPrivacyLevel;
    }

    @JsonProperty("interestListPrivacyLevel")
    public String getInterestListPrivacyLevel() {
        return interestListPrivacyLevel;
    }

    @JsonProperty("interestListPrivacyLevel")
    public void setInterestListPrivacyLevel(String interestListPrivacyLevel) {
        this.interestListPrivacyLevel = interestListPrivacyLevel;
    }

    @JsonProperty("allMediaPrivacyLevel")
    public String getAllMediaPrivacyLevel() {
        return allMediaPrivacyLevel;
    }

    @JsonProperty("allMediaPrivacyLevel")
    public void setAllMediaPrivacyLevel(String allMediaPrivacyLevel) {
        this.allMediaPrivacyLevel = allMediaPrivacyLevel;
    }

    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @JsonProperty("twitterHandle")
    public String getTwitterHandle() {
        return twitterHandle;
    }

    @JsonProperty("twitterHandle")
    public void setTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }

    @JsonProperty("aboutMe")
    public String getAboutMe() {
        return aboutMe;
    }

    @JsonProperty("aboutMe")
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    @JsonProperty("relationshipStatus")
    public Integer getRelationshipStatus() {
        return relationshipStatus;
    }

    @JsonProperty("relationshipStatus")
    public void setRelationshipStatus(Integer relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    @JsonProperty("canUseEventAdmin")
    public Boolean getCanUseEventAdmin() {
        return canUseEventAdmin;
    }

    @JsonProperty("canUseEventAdmin")
    public void setCanUseEventAdmin(Boolean canUseEventAdmin) {
        this.canUseEventAdmin = canUseEventAdmin;
    }

    @JsonProperty("backgroundImageUri")
    public String getBackgroundImageUri() {
        return backgroundImageUri;
    }

    @JsonProperty("backgroundImageUri")
    public void setBackgroundImageUri(String backgroundImageUri) {
        this.backgroundImageUri = backgroundImageUri;
    }

    @JsonProperty("resetDefaultProfileImage")
    public Boolean getResetDefaultProfileImage() {
        return resetDefaultProfileImage;
    }

    @JsonProperty("resetDefaultProfileImage")
    public void setResetDefaultProfileImage(Boolean resetDefaultProfileImage) {
        this.resetDefaultProfileImage = resetDefaultProfileImage;
    }

    @JsonProperty("resetDefaultHeroImage")
    public Boolean getResetDefaultHeroImage() {
        return resetDefaultHeroImage;
    }

    @JsonProperty("resetDefaultHeroImage")
    public void setResetDefaultHeroImage(Boolean resetDefaultHeroImage) {
        this.resetDefaultHeroImage = resetDefaultHeroImage;
    }

    @JsonProperty("captcha")
    public String getCaptcha() {
        return captcha;
    }

    @JsonProperty("captcha")
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    @JsonProperty("languages")
    public List<String> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @JsonProperty("skills")
    public List<String> getSkills() {
        return skills;
    }

    @JsonProperty("skills")
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @JsonProperty("languagesPrivacyLevel")
    public String getLanguagesPrivacyLevel() {
        return languagesPrivacyLevel;
    }

    @JsonProperty("languagesPrivacyLevel")
    public void setLanguagesPrivacyLevel(String languagesPrivacyLevel) {
        this.languagesPrivacyLevel = languagesPrivacyLevel;
    }

    @JsonProperty("skillsPrivacyLevel")
    public String getSkillsPrivacyLevel() {
        return skillsPrivacyLevel;
    }

    @JsonProperty("skillsPrivacyLevel")
    public void setSkillsPrivacyLevel(String skillsPrivacyLevel) {
        this.skillsPrivacyLevel = skillsPrivacyLevel;
    }

    @JsonProperty("emailsFriendRequestEnabled")
    public Boolean getEmailsFriendRequestEnabled() {
        return emailsFriendRequestEnabled;
    }

    @JsonProperty("emailsFriendRequestEnabled")
    public void setEmailsFriendRequestEnabled(Boolean emailsFriendRequestEnabled) {
        this.emailsFriendRequestEnabled = emailsFriendRequestEnabled;
    }

    @JsonProperty("emailsFriendRequestAcceptedEnabled")
    public Boolean getEmailsFriendRequestAcceptedEnabled() {
        return emailsFriendRequestAcceptedEnabled;
    }

    @JsonProperty("emailsFriendRequestAcceptedEnabled")
    public void setEmailsFriendRequestAcceptedEnabled(Boolean emailsFriendRequestAcceptedEnabled) {
        this.emailsFriendRequestAcceptedEnabled = emailsFriendRequestAcceptedEnabled;
    }

    @JsonProperty("emailsEventInviteEnabled")
    public Boolean getEmailsEventInviteEnabled() {
        return emailsEventInviteEnabled;
    }

    @JsonProperty("emailsEventInviteEnabled")
    public void setEmailsEventInviteEnabled(Boolean emailsEventInviteEnabled) {
        this.emailsEventInviteEnabled = emailsEventInviteEnabled;
    }

    @JsonProperty("emailsEventEndedEnabled")
    public Boolean getEmailsEventEndedEnabled() {
        return emailsEventEndedEnabled;
    }

    @JsonProperty("emailsEventEndedEnabled")
    public void setEmailsEventEndedEnabled(Boolean emailsEventEndedEnabled) {
        this.emailsEventEndedEnabled = emailsEventEndedEnabled;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }


}
