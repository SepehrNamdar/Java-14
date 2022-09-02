package norouz;

public class HasftSin {

    public String ayaJoziAzAnAst(String sib) {
        String natije = "";
        switch (sib) {
            case "Sib" :
            case "Sir" :
            case "Serke" :
            case "Senjed" :
            case "Somagh" :
            case "Samanou" :
            case "Sabze" :
                natije = "Ejbari";
                break;
            case "Mahi" :
            case "Sekke" :
            case "Ayne" :
            case "Mive" :
            case "Shirini" :
            case "Saat" :
            case "Shame" :
                natije = "Ekhtiari";
                break;
            default:
                natije = "Jozi az Haft sin nist";
                break;
        }
        return natije;
    }

}
