package com.p683ss.android.ugc.aweme.services.performance;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.services.performance.IAVPerformance */
public interface IAVPerformance {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.performance.IAVPerformance$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void end(String str, String str2);

    void enter(Context context, String str);

    void leave(Context context, String str);

    void pause(Context context, String str, String str2, String str3);

    void start(String str, String str2);

    void step(String str, String str2);
}
