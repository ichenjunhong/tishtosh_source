package com.p683ss.android.ugc.aweme.services;

/* renamed from: com.ss.android.ugc.aweme.services.EmailRevisionUtils */
public final class EmailRevisionUtils {
    public static final EmailRevisionUtils INSTANCE = new EmailRevisionUtils();

    private EmailRevisionUtils() {
    }

    public final boolean isBindEmailNewStyle() {
        return EmailRevisionUtilsKt.getValue(1);
    }

    public final boolean isChangeEmailNewStyle() {
        return EmailRevisionUtilsKt.getValue(0);
    }
}
