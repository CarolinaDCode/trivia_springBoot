package academy.atl.trivia;

import academy.atl.trivia.entities.Categoria;
import academy.atl.trivia.entities.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {
    /**
    @GetMapping("/question")
    public String getQuestionPrueba(){
        return "{\n" +
                "  \"category\": \"Cultura\",\n" +
                "  \"question\": \"¿Qué ingredintes se necesitan para hacer una michelada?\",\n" +
                "  \"options\": [\"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante\", \"Cerveza, lima/limón y limon\", \"Cerveza, sal, tabasco y lima/limón\"],\n" +
                "  \"answer\": 0,\n" +
                "  \"explanation\": \"La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.\"\n" +
                "}";
    }*/

    @GetMapping("/question/{categoria}")
    public Pregunta getQuestion(@PathVariable String categoria){
        Pregunta preg = new Pregunta();
        if (categoria.equalsIgnoreCase("Deportes")) {
            preg.setCategory("Deportes");
            preg.setQuestion( categoria + ": Qué ingredintes se necesitan para hacer una michelada en México?");
            preg.setAnswer(0);
            preg.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

            String[] options = new String[3];
            options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
            options[1] = "Cerveza, lima/limón y limon";
            options[2] = "Cerveza, sal, tabasco y lima/limón";
            preg.setOptions(options);
        }

        if (categoria.equalsIgnoreCase("Historia")) {
            preg.setCategory("Historia");
            preg.setQuestion(categoria + ": Qué ingredintes se necesitan para hacer una michelada en México?");
            preg.setAnswer(0);
            preg.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

            String[] options = new String[3];
            options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
            options[1] = "Cerveza, lima/limón y limon";
            options[2] = "Cerveza, sal, tabasco y lima/limón";
            preg.setOptions(options);
        }

        if (categoria.equalsIgnoreCase("Cine")) {
            preg.setCategory("Cine");
            preg.setQuestion(categoria + ": Qué ingredintes se necesitan para hacer una michelada en México?");
            preg.setAnswer(0);
            preg.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

            String[] options = new String[3];
            options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
            options[1] = "Cerveza, lima/limón y limon";
            options[2] = "Cerveza, sal, tabasco y lima/limón";
            preg.setOptions(options);
        }

        if (categoria.equalsIgnoreCase("Historia")) {
            preg.setCategory("Historia");
            preg.setQuestion(categoria + ": Qué ingredintes se necesitan para hacer una michelada en México?");
            preg.setAnswer(0);
            preg.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

            String[] options = new String[3];
            options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
            options[1] = "Cerveza, lima/limón y limon";
            options[2] = "Cerveza, sal, tabasco y lima/limón";
            preg.setOptions(options);
        }

        if (categoria.equalsIgnoreCase("Ciencia")) {
            preg.setCategory("Ciencia");
            preg.setQuestion(categoria + ": Qué ingredintes se necesitan para hacer una michelada en México?");
            preg.setAnswer(0);
            preg.setExplanation(categoria + "La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

            String[] options = new String[3];
            options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
            options[1] = "Cerveza, lima/limón y limon";
            options[2] = "Cerveza, sal, tabasco y lima/limón";
            preg.setOptions(options);
        }

        if (categoria.equalsIgnoreCase("Arte")) {
            preg.setCategory("Arte");
            preg.setQuestion(categoria + ": Qué ingredintes se necesitan para hacer una michelada en México?");
            preg.setAnswer(0);
            preg.setExplanation(categoria + "La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

            String[] options = new String[3];
            options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
            options[1] = "Cerveza, lima/limón y limon";
            options[2] = "Cerveza, sal, tabasco y lima/limón";
            preg.setOptions(options);
        }

        if (categoria.equalsIgnoreCase("Cultura")) {
            preg.setCategory("Cultura");
            preg.setQuestion(categoria + ": Qué ingredintes se necesitan para hacer una michelada en México?");
            preg.setAnswer(0);
            preg.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

            String[] options = new String[3];
            options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
            options[1] = "Cerveza, lima/limón y limon";
            options[2] = "Cerveza, sal, tabasco y lima/limón";
            preg.setOptions(options);

        }
        /**
         *List<String> options = new ArrayList();
         *options.add("Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante");
         *options.add("Cerveza, lima/limón y limon");
         *options.add("Cerveza, sal, tabasco y lima/limón");
         *preg.setOptions(options);
         */
        return preg;
    }
    @GetMapping("/categories")
    public Categoria[] getCategories(){

        Categoria cat0 = new Categoria();
        cat0.setCategory("Cultura");
        cat0.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales");

        Categoria cat1 = new Categoria();
        cat1.setCategory("Deportes");
        cat1.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos");

        Categoria cat2 = new Categoria();
        cat2.setCategory("Arte");
        cat2.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística");

        Categoria cat3 = new Categoria();
        cat3.setCategory("Cine");
        cat3.setDescription("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine");

        Categoria cat4 = new Categoria();
        cat4.setCategory("Historia");
        cat4.setDescription("Preguntas relacionadas con eventos históricos, personajes y períodos importantes");

        Categoria cat5 = new Categoria();
        cat5.setCategory("Ciencia");
        cat5.setDescription("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos");

        Categoria[] categorias = {cat0, cat1, cat2, cat3, cat4, cat5};

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
