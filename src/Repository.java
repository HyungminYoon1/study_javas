import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {

    static int quizId =0;
    private final Map<Integer, Quiz> quizStorage = new HashMap<>();
    private final ArrayList<String> userResponsesStorage = new ArrayList<>();


    private void saveUserResponse(String answer) {
        userResponsesStorage.add(answer);
    }

    private void addQuiz(Quiz quiz){
        quizStorage.put(++quizId, quiz);
    }

    private void addExampleQuizs(Quiz quiz){
        Quiz ExampleQuiz1st = new Quiz("1. Python에서 변수를 선언하는 방법은? (점수: 10점)", "1) var name 2) name = value 3) set name 4) name == value", "2", 10);
        Quiz ExampleQuiz2nd = new Quiz("2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)", "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다", "1", 15);
        Quiz ExampleQuiz3rd = new Quiz("3. Python에서 조건문을 작성하는 방법은? (점수: 10점)", "1) if-else, 2) for-in, 3) while, 4) def", "1", 10);
        Quiz ExampleQuiz4th = new Quiz("4. Python에서 함수를 정의하는 방법은? (점수: 5점)", "1) class, 2) def, 3) import, 4) return", "2", 5);
        addQuiz(ExampleQuiz1st);
        addQuiz(ExampleQuiz2nd);
        addQuiz(ExampleQuiz3rd);
        addQuiz(ExampleQuiz4th);
    }

    private Quiz getQuiz(int id){
        return quizStorage.get(id);
    }

    private Map<Integer, Quiz> getAllQuizMap(){
        return quizStorage;
    }

    private List<Quiz> getQuizList() {
        List<Quiz> quizList= new ArrayList<>();
        for(Integer key : getAllQuizMap().keySet() )  {
            quizList.add(getQuiz(key));
        }
        return quizList;
    }

}
