package vaulsys.cms.base;

import vaulsys.persistence.IEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by HP on 5/12/2017.
 */
@Entity
@Table(name = "CMS_PRODUCT_LIMIT")
public class CMSProductLimit implements IEntity<Long> {

    @Id
    private Long Id;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "channel_id")
    private String channelId;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "limit_type")
    private String limitType;

    @Column(name = "frequency_type")
    private String frequencyType;

    @Column(name = "amount")
    private String amount;

    @Column(name = "cycle_length")
    private String cycleLength;

    @Column(name = "cycle_length_type")
    private String cycleLengthType;

    @Column(name = "frequency_length")
    private String frequencyLength;

    @Column(name = "frequency_length_type")
    private String frequencyLengthType;

    @Column(name = "is_shared")
    private String isShared;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "EXTENDED_LIMIT")
    private String extendedLimit;

    @Column(name = "FRAUD_LIMIT_ENABLED")
    private String fraudLimitEnabled;

    @Column(name = "GEN_OTP")
    private String generateOTP;

    @Column(name = "THRESHOLD")
    private String threshold;

    @Column(name = "PROFILE_LIMIT_AMOUNT")
    private String profileLimitAmount;

    @Column(name = "FRM_RESP_CODE")
    private String fraudRespCode;

    @Column(name = "THRESHOLD_TYPE")
    private String thresholdType;

    @Column(name = "THRESHOLD_VALUE")
    private String thresholdValue;

    @Column(name = "PARENT_LIMIT_ID")
    private String parentLimitId;

    @Column(name = "LIMIT_CATEGORY")
    private String limitCategory;

    @Override
    public Long getId() {
        return Id;
    }

    @Override
    public void setId(Long id) {

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public String getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(String frequencyType) {
        this.frequencyType = frequencyType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCycleLength() {
        return cycleLength;
    }

    public void setCycleLength(String cycleLength) {
        this.cycleLength = cycleLength;
    }

    public String getCycleLengthType() {
        return cycleLengthType;
    }

    public void setCycleLengthType(String cycleLengthType) {
        this.cycleLengthType = cycleLengthType;
    }

    public String getFrequencyLength() {
        return frequencyLength;
    }

    public void setFrequencyLength(String frequencyLength) {
        this.frequencyLength = frequencyLength;
    }

    public String getFrequencyLengthType() {
        return frequencyLengthType;
    }

    public void setFrequencyLengthType(String frequencyLengthType) {
        this.frequencyLengthType = frequencyLengthType;
    }

    public String getIsShared() {
        return isShared;
    }

    public void setIsShared(String isShared) {
        this.isShared = isShared;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getExtendedLimit() {
        return extendedLimit;
    }

    public void setExtendedLimit(String extendedLimit) {
        this.extendedLimit = extendedLimit;
    }

    public String getFraudLimitEnabled() {
        return fraudLimitEnabled;
    }

    public void setFraudLimitEnabled(String fraudLimitEnabled) {
        this.fraudLimitEnabled = fraudLimitEnabled;
    }

    public String getGenerateOTP() {
        return generateOTP;
    }

    public void setGenerateOTP(String generateOTP) {
        this.generateOTP = generateOTP;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public String getProfileLimitAmount() {
        return profileLimitAmount;
    }

    public void setProfileLimitAmount(String profileLimitAmount) {
        this.profileLimitAmount = profileLimitAmount;
    }

    public String getFraudRespCode() {
        return fraudRespCode;
    }

    public void setFraudRespCode(String fraudRespCode) {
        this.fraudRespCode = fraudRespCode;
    }

    public String getThresholdType() {
        return thresholdType;
    }

    public void setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
    }

    public String getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(String thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    public String getParentLimitId() {
        return parentLimitId;
    }

    public void setParentLimitId(String parentLimitId) {
        this.parentLimitId = parentLimitId;
    }

    public String getLimitCategory() {
        return limitCategory;
    }

    public void setLimitCategory(String limitCategory) {
        this.limitCategory = limitCategory;
    }
}