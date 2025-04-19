/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
package Module_6.ComposerApp;

import java.util.List;

public interface GenericDAO <E,K>{
    List<E> findAll();
    E findBy(K Key);
    void insert(E entity);

}
