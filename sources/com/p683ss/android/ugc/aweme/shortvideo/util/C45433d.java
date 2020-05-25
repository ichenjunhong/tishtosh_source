package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.d */
final /* synthetic */ class C45433d implements Callable {

    /* renamed from: a */
    private final Context f114818a;

    /* renamed from: b */
    private final String f114819b;

    /* renamed from: c */
    private final String f114820c;

    /* renamed from: d */
    private final String f114821d;

    C45433d(Context context, String str, String str2, String str3) {
        this.f114818a = context;
        this.f114819b = str;
        this.f114820c = str2;
        this.f114821d = str3;
    }

    public final Object call() {
        return C45412b.m98981a(this.f114818a, this.f114819b, this.f114820c, this.f114821d);
    }
}
