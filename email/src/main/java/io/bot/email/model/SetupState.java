package io.bot.email.model;

public enum SetupState {
    FIRST_USER_SETUP, SELECT_EMAIL_VENDOR, SELECT_EMAIL_PROTOCOL, ENTERING_EMAIL, ENTERING_PASSWORD,
    CHANGE_VENDOR, CHANGE_PROTOCOL,
    SETUP_FINISHED
}
