
    public enum StudyProfile{
        MEDICINE("��������"),
        Informatica ("�����������"),
        History("�������"),
        Engineering ("����������"),
        Philology("��������������");

       private final String profileName;

        StudyProfile (String profileName){
            this.profileName = profileName;

        }
        public String getProfileName(){
            return this.profileName;
        }


    }

