
    public enum StudyProfile{
        MEDICINE("Медицина"),
        Informatica ("Информатика"),
        History("История"),
        Engineering ("Инженерный"),
        Philology("Филологический");

       private final String profileName;

        StudyProfile (String profileName){
            this.profileName = profileName;

        }
        public String getProfileName(){
            return this.profileName;
        }


    }

