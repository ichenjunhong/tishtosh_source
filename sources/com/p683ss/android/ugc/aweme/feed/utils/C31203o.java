package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.o */
public final class C31203o {

    /* renamed from: a */
    public static final C31203o f81643a = new C31203o();

    private C31203o() {
    }

    /* renamed from: b */
    public static void m72861b(String str) {
        if (C30224d.m70967b()) {
            C32458a.m75141a(3, "FeedPlayerLogger", str);
        }
    }

    /* renamed from: a */
    public static final void m72859a(String str) {
        C52711k.m112240b(str, "source");
        StringBuilder sb = new StringBuilder("pause, source ");
        sb.append(str);
        m72861b(sb.toString());
    }

    /* renamed from: b */
    public static final void m72862b(String str, String str2) {
        C52711k.m112240b(str2, "source");
        StringBuilder sb = new StringBuilder("play ");
        sb.append(str);
        sb.append(" source ");
        sb.append(str2);
        m72861b(sb.toString());
    }

    /* renamed from: c */
    public static final void m72863c(String str, String str2) {
        C52711k.m112240b(str, "source");
        StringBuilder sb = new StringBuilder("PlayerController.");
        sb.append(str);
        sb.append(" result is ");
        sb.append(str2);
        m72861b(sb.toString());
    }

    /* renamed from: d */
    public static final void m72864d(String str, String str2) {
        C52711k.m112240b(str, "source");
        StringBuilder sb = new StringBuilder("PlayerManager.");
        sb.append(str);
        sb.append(" result is ");
        sb.append(str2);
        m72861b(sb.toString());
    }

    /* renamed from: a */
    public static final void m72860a(String str, String str2) {
        C52711k.m112240b(str2, "source");
        StringBuilder sb = new StringBuilder("showCover ");
        sb.append(str);
        sb.append(", source ");
        sb.append(str2);
        m72861b(sb.toString());
    }
}
