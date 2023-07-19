package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Tasks;

public class TaskValidator {
    // バリデーションを実行する
    public static List<String> validate(Tasks m) {
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(m.getContent());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        return errors;
    }

    // タイトルの必須入力チェック
    private static String validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タスクを入力してください。";
        }

        return "";
    }
}
