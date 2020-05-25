package com.p683ss.android.ugc.aweme.feed.preload;

import com.p683ss.android.ugc.p2454f.C48920f;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.c */
final /* synthetic */ class C30677c implements Callable {

    /* renamed from: a */
    private final C48920f[] f80287a;

    /* renamed from: b */
    private final String f80288b;

    /* renamed from: c */
    private final int f80289c;

    /* renamed from: d */
    private final String f80290d;

    /* renamed from: e */
    private final int f80291e;

    C30677c(C48920f[] fVarArr, String str, int i, String str2, int i2) {
        this.f80287a = fVarArr;
        this.f80288b = str;
        this.f80289c = i;
        this.f80290d = str2;
        this.f80291e = i2;
    }

    public final Object call() {
        return C30675a.m71951a(this.f80287a, this.f80288b, this.f80289c, this.f80290d, this.f80291e);
    }
}
