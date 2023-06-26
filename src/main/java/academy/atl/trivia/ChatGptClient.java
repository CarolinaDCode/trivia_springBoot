package academy.atl.trivia;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGptClient {
    public String enviarPregunta(String comoEstas) {
        // Realizará una petición a la API de ChatGPT
        String respuestaDeChatGpt = "";
        try {
            // URL de la API de ChatGPT
            URL url = new URL("https://api.openai.com/v1/chat/completions");

            // Establecer la conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer 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");  // Reemplaza YOUR_API_KEY con tu clave de API

            // Cuerpo de la solicitud
            String requestBody = "{\"model\": \"gpt-3.5-turbo\", \"messages\": [{\"role\": \"system\", \"content\": \"Dame una pregunta para un juego de trivia que contenga la siguiente estrucuta category, question, answer, explanation, options\"}, {\"role\": \"user\", \"content\": \"Who won the world series in 2020?\"}]}";

            // Habilitar el envío y recepción de datos
            connection.setDoOutput(true);
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(requestBody.getBytes());
            outputStream.flush();
            outputStream.close();

            // Leer la respuesta de la API
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line);
            }
            bufferedReader.close();

            // Imprimir la respuesta
            respuestaDeChatGpt = response.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuestaDeChatGpt;
    }
}
