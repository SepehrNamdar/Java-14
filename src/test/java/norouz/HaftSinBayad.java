package norouz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HaftSinBayad {

    @Test
    void taiin_konad_kodam_shey_jozi_az_an_ast() {
        assertHaftSinAshya("Sib", "Ejbari");
        assertHaftSinAshya("Sir", "Ejbari");
        assertHaftSinAshya("Sabze", "Ejbari");
        assertHaftSinAshya("Senjed", "Ejbari");
        assertHaftSinAshya("Somagh", "Ejbari");
        assertHaftSinAshya("Samanou", "Ejbari");

        assertHaftSinAshya("Mahi", "Ekhtiari");
        assertHaftSinAshya("Sekke", "Ekhtiari");
        assertHaftSinAshya("Ayne", "Ekhtiari");
        assertHaftSinAshya("Mive", "Ekhtiari");
        assertHaftSinAshya("Shirini", "Ekhtiari");
        assertHaftSinAshya("Saat", "Ekhtiari");
        assertHaftSinAshya("Shame", "Ekhtiari");

        assertHaftSinAshya("Har chizi", "Jozi az Haft sin nist");
    }

    private void assertHaftSinAshya(String shey, String natije) {
        // Given
        final HasftSin hasftSin = new HasftSin();

        // When
        String result = hasftSin.ayaJoziAzAnAst(shey);

        // Then
        assertThat(result).isEqualTo(natije);
    }

}
