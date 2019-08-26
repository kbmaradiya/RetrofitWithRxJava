
package com.example.mit.retrofitwithrxjava.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("subscription_type")
    @Expose
    private String subscriptionType;
    @SerializedName("subscription_span")
    @Expose
    private String subscriptionSpan;
    @SerializedName("basic_app_id")
    @Expose
    private String basicAppId;
    @SerializedName("premium_app_id")
    @Expose
    private String premiumAppId;
    @SerializedName("annual_basic_app_id")
    @Expose
    private String annualBasicAppId;
    @SerializedName("annual_premium_app_id")
    @Expose
    private String annualPremiumAppId;
    @SerializedName("is_default")
    @Expose
    private String isDefault;
    @SerializedName("breed")
    @Expose
    private String breed;
    @SerializedName("weight_unit")
    @Expose
    private String weightUnit;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("chest_circumference")
    @Expose
    private String chestCircumference;
    @SerializedName("thigh_circumference")
    @Expose
    private String thighCircumference;
    @SerializedName("abdomen_circumference")
    @Expose
    private String abdomenCircumference;
    @SerializedName("triceps_circumference")
    @Expose
    private String tricepsCircumference;
    @SerializedName("neck_circumference")
    @Expose
    private String neckCircumference;
    @SerializedName("circumference_unit")
    @Expose
    private String circumferenceUnit;
    @SerializedName("start_workout_date")
    @Expose
    private String startWorkoutDate;
    @SerializedName("measurement_notification_date")
    @Expose
    private String measurementNotificationDate;
    @SerializedName("expired")
    @Expose
    private String expired;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("updated")
    @Expose
    private String updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public String getSubscriptionSpan() {
        return subscriptionSpan;
    }

    public void setSubscriptionSpan(String subscriptionSpan) {
        this.subscriptionSpan = subscriptionSpan;
    }

    public String getBasicAppId() {
        return basicAppId;
    }

    public void setBasicAppId(String basicAppId) {
        this.basicAppId = basicAppId;
    }

    public String getPremiumAppId() {
        return premiumAppId;
    }

    public void setPremiumAppId(String premiumAppId) {
        this.premiumAppId = premiumAppId;
    }

    public String getAnnualBasicAppId() {
        return annualBasicAppId;
    }

    public void setAnnualBasicAppId(String annualBasicAppId) {
        this.annualBasicAppId = annualBasicAppId;
    }

    public String getAnnualPremiumAppId() {
        return annualPremiumAppId;
    }

    public void setAnnualPremiumAppId(String annualPremiumAppId) {
        this.annualPremiumAppId = annualPremiumAppId;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getChestCircumference() {
        return chestCircumference;
    }

    public void setChestCircumference(String chestCircumference) {
        this.chestCircumference = chestCircumference;
    }

    public String getThighCircumference() {
        return thighCircumference;
    }

    public void setThighCircumference(String thighCircumference) {
        this.thighCircumference = thighCircumference;
    }

    public String getAbdomenCircumference() {
        return abdomenCircumference;
    }

    public void setAbdomenCircumference(String abdomenCircumference) {
        this.abdomenCircumference = abdomenCircumference;
    }

    public String getTricepsCircumference() {
        return tricepsCircumference;
    }

    public void setTricepsCircumference(String tricepsCircumference) {
        this.tricepsCircumference = tricepsCircumference;
    }

    public String getNeckCircumference() {
        return neckCircumference;
    }

    public void setNeckCircumference(String neckCircumference) {
        this.neckCircumference = neckCircumference;
    }

    public String getCircumferenceUnit() {
        return circumferenceUnit;
    }

    public void setCircumferenceUnit(String circumferenceUnit) {
        this.circumferenceUnit = circumferenceUnit;
    }

    public String getStartWorkoutDate() {
        return startWorkoutDate;
    }

    public void setStartWorkoutDate(String startWorkoutDate) {
        this.startWorkoutDate = startWorkoutDate;
    }

    public String getMeasurementNotificationDate() {
        return measurementNotificationDate;
    }

    public void setMeasurementNotificationDate(String measurementNotificationDate) {
        this.measurementNotificationDate = measurementNotificationDate;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

}
