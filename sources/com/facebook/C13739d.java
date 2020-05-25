package com.facebook;

/* renamed from: com.facebook.d */
public enum C13739d {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    
    public final boolean canExtendToken;

    private C13739d(boolean z) {
        this.canExtendToken = z;
    }
}
