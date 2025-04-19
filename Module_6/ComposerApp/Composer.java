/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
package Module_6.ComposerApp;

public class Composer {

        // Private data fields
        private int id;          
        private String name;     
        private String genre;    
    
        // No-argument constructor
        public Composer() {
            this.id = 0;
            this.name = "";
            this.genre = "";
        }
    
        // Argument constructor
        public Composer(int id, String name, String genre) {
            this.id = id;
            this.name = name;
            this.genre = genre;
        }
    
        // Accessor methods
        public int getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        public String getGenre() {
            return genre;
        }

        @Override
        public String toString() {
            return "  Id: " + id + "\n  Name: " + name + "\n  Genre: " + genre+"\n";
        }

}
