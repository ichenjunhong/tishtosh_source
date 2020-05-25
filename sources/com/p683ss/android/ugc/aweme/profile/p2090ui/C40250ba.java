package com.p683ss.android.ugc.aweme.profile.p2090ui;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ba */
final /* synthetic */ class C40250ba implements Runnable {

    /* renamed from: a */
    private final I18nBaseUserProfileFragment f102790a;

    C40250ba(I18nBaseUserProfileFragment i18nBaseUserProfileFragment) {
        this.f102790a = i18nBaseUserProfileFragment;
    }

    public final void run() {
        I18nBaseUserProfileFragment i18nBaseUserProfileFragment = this.f102790a;
        if (i18nBaseUserProfileFragment.viewUserInfo != null) {
            i18nBaseUserProfileFragment.f102213as = (float) i18nBaseUserProfileFragment.viewUserInfo.getHeight();
        }
    }
}
