package co.com.konex.automation.test.exceptions;


import net.serenitybdd.model.exceptions.SerenityManagedException;

public class ApplicationException extends SerenityManagedException {

    public static final String MESSAGE_FAILED_LISTCARDSCUSTOMER= "Failed to show data";
    public static final String MESSAGE_FAILED_GET_INFORMATION= "Can not get to information";
    public static final String MESSAGE_FAILED_LOGIN= "Fail trying to logging in the application";

    public ApplicationException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}

