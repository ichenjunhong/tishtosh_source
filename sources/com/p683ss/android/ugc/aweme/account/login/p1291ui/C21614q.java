package com.p683ss.android.ugc.aweme.account.login.p1291ui;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.q */
final /* synthetic */ class C21614q implements Runnable {

    /* renamed from: a */
    private final LoginButton f58602a;

    C21614q(LoginButton loginButton) {
        this.f58602a = loginButton;
    }

    public final void run() {
        LoginButton loginButton = this.f58602a;
        if (loginButton.f58383c) {
            loginButton.mo45745b();
            return;
        }
        loginButton.animate().cancel();
        loginButton.animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
        loginButton.setBackgroundResource(loginButton.f58382b);
    }
}
