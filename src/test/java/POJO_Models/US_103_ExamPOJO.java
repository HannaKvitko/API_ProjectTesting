package POJO_Models;

import java.util.List;

public class US_103_ExamPOJO {
    private String id;
    private String name;
    private String[] translateName = {};
    private String school;
    private US_103_GradeLevel gradeLevel;
    private String academicPeriod;
    private boolean active;
    private String description;
    private String note;
    private String agreementText;
    private boolean sendSMS;
    private String sms;
    private boolean sendEmailEnabled;
    private US_103_EmailMessage emailMessage;
    private String registrationStartDate;
    private String registrationEndDate;
    private boolean paid;
    private int price;
    private String bankAccount;
    private boolean sendEmailToRegistrar;
    private String[] registrarEmails = {};
    private boolean showDescFirst;
    private boolean showNoteFirst;
    private boolean noteEnabled;
    private boolean descEnabled;
    private boolean agreementEnabled;
    private String[] documents = {};

    public String getId() {
        return id;
    }

    public US_103_EmailMessage getEmailMessage() {
        return emailMessage;
    }

    public void setEmailMessage(US_103_EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String[] getTranslateName() {
        return translateName;
    }

    public void setTranslateName(String[] translateName) {
        this.translateName = translateName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public US_103_GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(US_103_GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }


    public String getAcademicPeriod() {
        return academicPeriod;
    }

    public void setAcademicPeriod(String academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAgreementText() {
        return agreementText;
    }

    public void setAgreementText(String agreementText) {
        this.agreementText = agreementText;
    }

    public boolean isSendSMS() {
        return sendSMS;
    }

    public void setSendSMS(boolean sendSMS) {
        this.sendSMS = sendSMS;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public boolean isSendEmailEnabled() {
        return sendEmailEnabled;
    }

    public void setSendEmailEnabled(boolean sendEmailEnabled) {
        this.sendEmailEnabled = sendEmailEnabled;
    }


    public String getRegistrationStartDate() {
        return registrationStartDate;
    }

    public void setRegistrationStartDate(String registrationStartDate) {
        this.registrationStartDate = registrationStartDate;
    }

    public String getRegistrationEndDate() {
        return registrationEndDate;
    }

    public void setRegistrationEndDate(String registrationEndDate) {
        this.registrationEndDate = registrationEndDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean isSendEmailToRegistrar() {
        return sendEmailToRegistrar;
    }

    public void setSendEmailToRegistrar(boolean sendEmailToRegistrar) {
        this.sendEmailToRegistrar = sendEmailToRegistrar;
    }


    public boolean isShowDescFirst() {
        return showDescFirst;
    }

    public void setShowDescFirst(boolean showDescFirst) {
        this.showDescFirst = showDescFirst;
    }

    public boolean isShowNoteFirst() {
        return showNoteFirst;
    }

    public void setShowNoteFirst(boolean showNoteFirst) {
        this.showNoteFirst = showNoteFirst;
    }

    public boolean isNoteEnabled() {
        return noteEnabled;
    }

    public void setNoteEnabled(boolean noteEnabled) {
        this.noteEnabled = noteEnabled;
    }

    public boolean isDescEnabled() {
        return descEnabled;
    }

    public void setDescEnabled(boolean descEnabled) {
        this.descEnabled = descEnabled;
    }

    public boolean isAgreementEnabled() {
        return agreementEnabled;
    }

    public void setAgreementEnabled(boolean agreementEnabled) {
        this.agreementEnabled = agreementEnabled;
    }

    public String[] getRegistrarEmails() {
        return registrarEmails;
    }

    public void setRegistrarEmails(String[] registrarEmails) {
        this.registrarEmails = registrarEmails;
    }

    public String[] getDocuments() {
        return documents;
    }

    public void setDocuments(String[] documents) {
        this.documents = documents;
    }
}
