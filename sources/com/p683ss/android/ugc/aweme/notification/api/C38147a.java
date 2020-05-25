package com.p683ss.android.ugc.aweme.notification.api;

import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.notification.api.a */
public enum C38147a {
    T_USE_T_OLD_STYLE(1),
    T_USE_M_OLD_STYLE(2),
    T_USE_T_NEW_STYLE(3),
    M_USE_M_OLD_STYLE(4),
    M_USE_T_NEW_STYLE(5);
    
    public static final C38148a Companion = null;

    /* renamed from: b */
    private final int f97155b;

    /* renamed from: com.ss.android.ugc.aweme.notification.api.a$a */
    public static final class C38148a {
        private C38148a() {
        }

        public /* synthetic */ C38148a(C52707g gVar) {
            this();
        }
    }

    public final int getStyle() {
        return this.f97155b;
    }

    public static final int getNoticeStyle() {
        C38147a aVar;
        if (MTNotificationTabMergeExperiment.m85062b()) {
            aVar = T_USE_T_OLD_STYLE;
        } else {
            aVar = T_USE_M_OLD_STYLE;
        }
        return aVar.getStyle();
    }

    static {
        Companion = new C38148a(null);
    }

    private C38147a(int i) {
        this.f97155b = i;
    }
}
