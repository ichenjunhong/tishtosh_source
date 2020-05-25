package com.p683ss.android.ugc.aweme.services.performance;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.services.performance.ICrashReportService */
public interface ICrashReportService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.performance.ICrashReportService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void report(int i);

    HashMap<String, String> retrieveUserData(Context context);
}
