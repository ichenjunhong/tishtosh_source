package com.p683ss.android.ugc.aweme.main;

/* renamed from: com.ss.android.ugc.aweme.main.eh */
public abstract /* synthetic */ class C36640eh {
    /* renamed from: a */
    public static String m82544a(String str) {
        try {
            return m82543a(Integer.valueOf(str));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m82543a(Integer num) {
        String str = "";
        switch (num.intValue()) {
            case 0:
                return "HOME";
            case 1:
                return "DISCOVER";
            case 2:
                return "PUBLISH";
            case 3:
                return "NOTIFICATION";
            case 4:
                return "USER";
            case 5:
                return "DISCOVER";
            default:
                return str;
        }
    }
}
