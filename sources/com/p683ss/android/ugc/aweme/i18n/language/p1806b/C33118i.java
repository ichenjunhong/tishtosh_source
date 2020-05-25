package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.i */
final /* synthetic */ class C33118i implements Callable {

    /* renamed from: a */
    private final C33115h f85957a;

    /* renamed from: b */
    private final Context f85958b;

    /* renamed from: c */
    private final String[] f85959c;

    C33118i(C33115h hVar, Context context, String[] strArr) {
        this.f85957a = hVar;
        this.f85958b = context;
        this.f85959c = strArr;
    }

    public final Object call() {
        C33115h hVar = this.f85957a;
        Context context = this.f85958b;
        String[] strArr = this.f85959c;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        if (hVar.f85953e == null) {
            hVar.f85953e = new C33107a(context, strArr);
        }
        if (!hVar.f85953e.isShowing()) {
            hVar.f85953e.show();
        }
        hVar.f85949a = false;
        return null;
    }
}
