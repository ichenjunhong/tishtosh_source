package com.p683ss.android.p1103ad.splash.core.p1112a;

import android.content.Context;
import com.p683ss.android.p1103ad.splash.core.p1112a.C18565b.C18568c;

/* renamed from: com.ss.android.ad.splash.core.a.a */
public class C18564a extends C18565b {

    /* renamed from: c */
    private static volatile C18564a f51158c;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C18568c mo37875a() {
        return super.mo37875a();
    }

    private C18564a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static C18564a m44942a(Context context) {
        if (f51158c == null) {
            synchronized (C18564a.class) {
                if (f51158c == null) {
                    f51158c = new C18564a(context);
                }
            }
        }
        return f51158c;
    }
}
