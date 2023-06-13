import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    @FXML
    private Label questionLabel;

    @FXML
    private Button option1Button;

    @FXML
    private Button option2Button;

    @FXML
    private Button option3Button;

    @FXML
    private Button option4Button;

    @FXML
    private Label pointsLabel;

    // Variables para la pregunta y opciones de respuesta
    private String currentQuestion;
    private String correctAnswer;
    private List<String> answerOptions;
    private int points;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        points = 0;
        updatePointsLabel();
        generateQuestion();
    }

    private void generateQuestion() {
        // Genera una pregunta y opciones de respuesta aleatorias
        int num1 = (int) (Math.random() * 10) + 1;
        int num2 = (int) (Math.random() * 10) + 1;
        int answer = num1 + num2;

        currentQuestion = num1 + " + " + num2 + " = ?";
        correctAnswer = Integer.toString(answer);

        // Genera tres respuestas incorrectas
        answerOptions = new ArrayList<>();
        answerOptions.add(Integer.toString(answer - (int) (Math.random() * 5) + 1));
        answerOptions.add(Integer.toString(answer + (int) (Math.random() * 5) + 1));
        answerOptions.add(Integer.toString(answer - (int) (Math.random() * 5) + 1));

        // Agrega la respuesta correcta a las opciones
        answerOptions.add(correctAnswer);

        // Mezcla las opciones de respuesta
        Random random = new Random();
        for (int i = answerOptions.size() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = answerOptions.get(index);
            answerOptions.set(index, answerOptions.get(i));
            answerOptions.set(i, temp);
        }

        // Asigna las opciones de respuesta a los botones
        option1Button.setText(answerOptions.get(0));
        option2Button.setText(answerOptions.get(1));
        option3Button.setText(answerOptions.get(2));
        option4Button.setText(answerOptions.get(3));

        // Muestra la pregunta en la etiqueta
        questionLabel.setText(currentQuestion);
    }

    @FXML
    private void handleOption1Button() {
        checkAnswer(option1Button.getText());
    }

    @FXML
    private void handleOption2Button() {
        checkAnswer(option2Button.getText());
    }

    @FXML
    private void handleOption3Button() {
        checkAnswer(option3Button.getText());
    }

    @FXML
    private void handleOption4Button() {
        checkAnswer(option4Button.getText());
    }

    private void checkAnswer(String selectedAnswer) {
        if (selectedAnswer.equals(correctAnswer)) {
            // Respuesta correcta, suma 100 puntos
            points += 100;
            updatePointsLabel();
        } else {
            // Respuesta incorrecta, muestra un mensaje o realiza alguna acción
        }

        generateQuestion();
    }

    private void updatePointsLabel() {
        pointsLabel.setText(Integer.toString(points));
    }
}