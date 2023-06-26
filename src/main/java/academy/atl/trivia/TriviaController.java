package academy.atl.trivia;

import academy.atl.trivia.entities.Categoria;
import academy.atl.trivia.entities.Pregunta;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public String getQuestion(@PathVariable String categoria){
        ChatGptClient chatGpt = new ChatGptClient();
        String respuestaJson = chatGpt.enviarPregunta("Estoy armando una trivia, necesito que me des una pregunta de " + categoria + " con la siguiente estructura de JSON. La respuesta correcta de la pregunta no siempre tiene que ser la primera, debe de variar.\n" +
                "\n" +
                "{\n" +
                "    \"category\": \"aca va el nombre de la categoria\",\n" +
                "    \"question\": \"aca va la pregunta\",\n" +
                "    \"options\":[\n" +
                "\t       \"aca va la opcion 1\",\n" +
                "\t       \"aca va la opcion 2\",\n" +
                "\t       \"aca va la opcion 3\",\n" +
                "    ],\n" +
                "    \"answer\": \"Aquí va la respuesta correcta en caso de ser la tercera es el numero 2 ó en caso de ser la segunda es el 1 ó  en caso de ser la primera es el 0\",\n" +
                "    \"explanation\": \"Aca tienes que poner una explicación dciendo porque es la respuesta correcta\"\n" +
                "}");
        return respuestaJson;
        /**
         * Convertirá la rpta que devuelva chat gpt al objeto Pregunto,(tomará la estructura que tiene definida nuestra clase Pregunta).
         */
        /**
         * ObjectMapper convertidor = new ObjectMapper();
         * Pregunta preg = convertidor.convertValue(respuestaJson, Pregunta.class);
         * return preg;
         */
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
