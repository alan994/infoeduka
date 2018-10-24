package hr.alanjagar.infoeduka.backend.model;

public class PersonalInfo {
    private String displayName;
    private String imageUrl;

    private boolean blockedPassword;
    private boolean blockedFull;
    private boolean blockedMoney;
    private double debt;

    private String language;

    private String newsCategory;

    private String yearOfStudy;
    private String group;
    private String semester;

    public PersonalInfo() {
    }

    public PersonalInfo(String displayName, String imageUrl, boolean blockedPassword, boolean blockedFull, boolean blockedMoney, double debt, String language, String newsCategory, String yearOfStudy, String group, String semester) {
        this.displayName = displayName;
        this.imageUrl = imageUrl;
        this.blockedPassword = blockedPassword;
        this.blockedFull = blockedFull;
        this.blockedMoney = blockedMoney;
        this.debt = debt;
        this.language = language;
        this.newsCategory = newsCategory;
        this.yearOfStudy = yearOfStudy;
        this.group = group;
        this.semester = semester;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isBlockedPassword() {
        return blockedPassword;
    }

    public void setBlockedPassword(boolean blockedPassword) {
        this.blockedPassword = blockedPassword;
    }

    public boolean isBlockedFull() {
        return blockedFull;
    }

    public void setBlockedFull(boolean blockedFull) {
        this.blockedFull = blockedFull;
    }

    public boolean isBlockedMoney() {
        return blockedMoney;
    }

    public void setBlockedMoney(boolean blockedMoney) {
        this.blockedMoney = blockedMoney;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNewsCategory() {
        return newsCategory;
    }

    public void setNewsCategory(String newsCategory) {
        this.newsCategory = newsCategory;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
