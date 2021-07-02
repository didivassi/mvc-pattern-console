package academy.mindswap.user.utils;

public class Messages {

    public static final String INPUT_USERNAME="Input username:";
    public static final String INPUT_PASSWORD="Input password:";
    public static final String WELCOME="Welcome to restricted area: ";

    public static final String MENU_LAYOUT = """
            1. List Users
            2. Change username
            3. Change email
            4. Change password
            5. Delete account
            """;
    public static final String NOT_VALID_OPTION="You must input a number between %d and %d";
    public static final String LISTING_USERS="Listing available users";
    public static final String CHANGE_SUCCESS="%s changed with success\n";
    public static final String CHANGE_FAILURE="%s could not be changed\n";
    public static final String GOODBYE="Goodbye. Thanks for user our app";
}
