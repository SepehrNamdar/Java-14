package norouz;

public class HasftSin {

    public String ayaJoziAzAnAst(String sib) {
        return switch (sib) {
            case "Sib", "Sir", "Serke", "Senjed", "Somagh", "Samanou", "Sabze" -> "Ejbari";
            case "Mahi", "Sekke", "Ayne", "Mive", "Shirini", "Saat", "Shame" -> {
                // Some code
                System.out.println("Momken ast bazi ashya faramosh shode bashad");
                // Some Code
                yield "Ekhtiari";
            }
            default -> "Jozi az Haft sin nist";
        };
    }

}
