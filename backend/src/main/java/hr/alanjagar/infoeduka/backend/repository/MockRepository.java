package hr.alanjagar.infoeduka.backend.repository;

import hr.alanjagar.infoeduka.backend.model.PersonalInfo;

public class MockRepository implements Repository {

    @Override
    public PersonalInfo getPersonalInfo(){
        PersonalInfo personalInfo = new PersonalInfo();

        personalInfo.setDisplayName("Alan Jagar");
        personalInfo.setBlockedFull(false);
        personalInfo.setBlockedMoney(false);
        personalInfo.setBlockedPassword(false);
        personalInfo.setDebt(0);
        personalInfo.setGroup("2DP1");
        personalInfo.setImageUrl("https://student.racunarstvo.hr/pretinac/img/studenti/img_754.jpg");
        personalInfo.setLanguage("hr");
        personalInfo.setNewsCategory("Diplomski studij");
        personalInfo.setSemester("Zimski");
        personalInfo.setYearOfStudy("2.");

        return personalInfo;
    }

}
