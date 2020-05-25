package com.p683ss.android.ugc.aweme.notification.util;

/* renamed from: com.ss.android.ugc.aweme.notification.util.c */
public final class C38431c {

    /* renamed from: a */
    public static final C38431c f97820a = new C38431c();

    private C38431c() {
    }

    /* renamed from: a */
    public static String m85742a(int i) {
        if (i == 7) {
            return "follow";
        }
        if (i == 26) {
            return "mentions";
        }
        if (i == 36) {
            return "all";
        }
        switch (i) {
            case 2:
                return "comment";
            case 3:
                return "like";
            default:
                return "official";
        }
    }

    /* renamed from: b */
    public static String m85743b(int i) {
        switch (i) {
            case 1:
                return "today";
            case 2:
                return "yesterday";
            case 3:
                return "this_week";
            case 4:
                return "this_month";
            case 5:
                return "earlier";
            default:
                return "new";
        }
    }
}
