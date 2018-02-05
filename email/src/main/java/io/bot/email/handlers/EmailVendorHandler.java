package io.bot.email.handlers;

import io.bot.email.model.Preferences;
import io.bot.email.model.SetupState;
import org.telegram.telegrambots.api.objects.Update;

public class EmailVendorHandler extends AbstractHandler {
    @Override
    boolean accept(Update update, Preferences preferences) {
        return update.hasCallbackQuery()
                && preferences.getSetupState().equals(SetupState.SELECT_EMAIL_VENDOR);
    }

    @Override
    void handle(Update update) {

    }
}
