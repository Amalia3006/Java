import java.time.LocalDate;

public class Application extends Project {

   public enum  Language {JAVA, PHP, C };
   private Language applicationLanguage;

    /**
     *
     * @param applicationName this will be the current application name which will be assigned as the name of the project (inheritated from Project class)
     * @param applicationDeadline this will be the current application deadline which will be assigned as the deadline of the project (inheritated from Project class)
     * @param language this is the programming language in which the app will be developped
     */
   Application(String applicationName, LocalDate applicationDeadline, Language language){
       this.projectName=applicationName;
       this.projectDeadline=applicationDeadline;
       applicationLanguage=language;
   }

    /**
     * 
     * @return returns the programming language of the app
     */
    public Language getLanguage() {
        return applicationLanguage;
    }

    /**
     *
     * @param language sets the programming language of the app
     */
    public void setLanguage(Language language) {

       this.applicationLanguage = language;
    }

    /**
     *
     * @return the object formatted as a string to be displayed
     */
    @Override
    public String toString() {
        return "Application{" +
                "lan=" + getLanguage() +
                ", name='" + projectName + '\'' +
                ", deadline=" + projectDeadline +
                '}';
    }
}


