package academy.atl.trivia.repository;

import academy.atl.trivia.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 * Lo que va hacer esta clase, es conectarse a nuestra base de datos
 * a la tabla category.
 * Este tipo de clases debe de tener una estructura definida:
 * Debe tener estas 2 anotaciones:
 * Repository y Transactional, porque con estas anotaciones le indica al
 * Framework de que se va conectar a la base de datos.
 */
@Repository
@Transactional
public class CategoryRepository {

    /**
     * entityManager o conexionBaseDeDatos: Este Objeto vendría a ser como la conexión con la base de datos
     * Con ese objeto es con el que vas hacer cualquier consulta con la base de datos
     * Solo que ya trae algunas funcionalidad como la funcionalidad find()
     * Utilizada para buscar por un id
     * PersistenceContext: carga el tipo de objeto de entity manager.
     */
    @PersistenceContext
    EntityManager conexionBaseDeDatos;

    /**
     * Función que nos permite buscar categoria por el id
     * y retorna un objeto con el id name y descripcion del objeto Category
     */
    public Category findById(Long id){
        return conexionBaseDeDatos.find(Category.class, id);
    }

}
