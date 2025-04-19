/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
package Module_6.ComposerApp;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDAO {

    private List<Composer> composers;

    public MemComposerDAO() {
        composers = new ArrayList<>();
        composers.add(new Composer(1007, "Ludwig van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    public List<Composer> findAll() {
        return composers;
    }

    public Composer findBy(int id) {
        for (Composer composer : composers) {
            if (composer.getId() == id) {
                return composer;
            }
        }
        return new Composer(); 
    }

    public void insert(Composer composer) {
        composers.add(composer);
    }

}
