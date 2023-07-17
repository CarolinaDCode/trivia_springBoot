package academy.atl.trivia;

import academy.atl.trivia.entities.Category;
import academy.atl.trivia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {

    @Autowired
    CategoryRepository categoryRepository;

    //PathVariable es para información de la URL
    @GetMapping("/busqueda-{id}")
    public Category buscarPorId(@PathVariable Long id){
        return categoryRepository.findById(id);
    }

    @GetMapping("/question/{categoria}")
    public Category getQuestion(@PathVariable String categoria){

        List<Category> resultado = new ArrayList<>();
        Category ejemplo = categoryRepository.findById(1L);
        resultado.add(ejemplo);
        return ejemplo;
    }
    @GetMapping("/categories")
    public Category[] getCategories(){

        Category cat0 = new Category();
        cat0.setName("Cultura");
        cat0.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales");

        Category cat1 = new Category();
        cat1.setName("Deportes");
        cat1.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos");

        Category cat2 = new Category();
        cat2.setName("Arte");
        cat2.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística");

        Category cat3 = new Category();
        cat3.setName("Cine");
        cat3.setDescription("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine");

        Category cat4 = new Category();
        cat4.setName("Historia");
        cat4.setDescription("Preguntas relacionadas con eventos históricos, personajes y períodos importantes");

        Category cat5 = new Category();
        cat5.setName("Ciencia");
        cat5.setDescription("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos");

        Category[] categorias = {cat0, cat1, cat2, cat3, cat4, cat5};

        /**
         * Categoria[] options = new Categoria[6];
         * categorias[0] = cat0
         * categorias[1] = cat1
         * .
         * .
         * .
         */
        return  categorias;

    }
}
