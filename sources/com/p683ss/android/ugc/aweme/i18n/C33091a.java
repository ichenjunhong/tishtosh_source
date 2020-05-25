package com.p683ss.android.ugc.aweme.i18n;

import android.os.Looper;
import com.p683ss.android.ugc.aweme.base.C23569o;
import java.lang.Thread.UncaughtExceptionHandler;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.i18n.a */
public final class C33091a implements UncaughtExceptionHandler {

    /* renamed from: a */
    private UncaughtExceptionHandler f85909a;

    /* renamed from: b */
    private long f85910b = Looper.getMainLooper().getThread().getId();

    /* renamed from: a */
    public static void m76063a() {
        Thread.setDefaultUncaughtExceptionHandler(new C33091a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    private C33091a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f85909a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (!(th instanceof IllegalStateException) || thread == null || thread.getId() == this.f85910b || th.getMessage() == null || !"Results have already been set".equals(th.getMessage().trim())) {
            if (this.f85909a != null) {
                this.f85909a.uncaughtException(thread, th);
            }
            return;
        }
        C23569o.m57779a("gms_crash_results_have_already_been_set", (JSONObject) null);
    }
}
