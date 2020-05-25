package com.p683ss.android.ugc.aweme.feedback;

import com.bytedance.apm.C8936b;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.ugc.aweme.video.C48016e;

/* renamed from: com.ss.android.ugc.aweme.feedback.i */
public final class C31280i {

    /* renamed from: a */
    private static final String f82006a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C48016e.m103950d());
        sb.append("/feedback_log");
        f82006a = sb.toString();
    }

    /* renamed from: a */
    public static String m73008a() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        C8936b.m17653a(C18778a.f51915b.f51932d, currentTimeMillis - 10800, currentTimeMillis, "ActiveUpload", C31281j.f82007a);
        return null;
    }
}
