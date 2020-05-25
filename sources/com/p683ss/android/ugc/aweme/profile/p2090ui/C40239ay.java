package com.p683ss.android.ugc.aweme.profile.p2090ui;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ay */
final /* synthetic */ class C40239ay implements Runnable {

    /* renamed from: a */
    private final I18nBaseUserProfileFragment f102771a;

    C40239ay(I18nBaseUserProfileFragment i18nBaseUserProfileFragment) {
        this.f102771a = i18nBaseUserProfileFragment;
    }

    public final void run() {
        I18nBaseUserProfileFragment i18nBaseUserProfileFragment = this.f102771a;
        if (i18nBaseUserProfileFragment.viewUserInfo != null) {
            i18nBaseUserProfileFragment.f102213as = (float) i18nBaseUserProfileFragment.viewUserInfo.getHeight();
        }
    }
}
