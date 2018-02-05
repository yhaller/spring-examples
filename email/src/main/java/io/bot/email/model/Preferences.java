package io.bot.email.model;

public class Preferences {

    private String email;
    private String password;
    private Protocol protocol;
    private Vendor vendor;
    private SetupState setupState;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public SetupState getSetupState() {
        return setupState;
    }

    public void setSetupState(SetupState setupState) {
        this.setupState = setupState;
    }
}
