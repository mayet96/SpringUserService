package ru.id61890868.SpringUserService.view.response;

/**
 * Представление исключения
 */
public class ErrorView {

    /**
     * Сообщение исключения
     */
    public String error;

    /**
     * Передача текста исключения
     *
     * @param errorText - текс исключения
     */
    public ErrorView(String errorText) {
        error = errorText;
    }

    public ErrorView(){

    }

    @Override
    public String toString() {
        return "{\"error\":" + error + "}";
    }
}
