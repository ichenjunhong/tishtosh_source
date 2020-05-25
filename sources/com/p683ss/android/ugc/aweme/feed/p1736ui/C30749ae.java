package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1382aq.C23245o;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ae */
final /* synthetic */ class C30749ae implements Callable {

    /* renamed from: a */
    private final C31143x f80577a;

    /* renamed from: b */
    private final String f80578b;

    C30749ae(C31143x xVar, String str) {
        this.f80577a = xVar;
        this.f80578b = str;
    }

    public final Object call() {
        C31143x xVar = this.f80577a;
        String str = this.f80578b;
        C23245o b = new C23245o("enter_homepage_follow").mo48115a("open_app").mo48116b("open_app");
        if (!TextUtils.isEmpty(str)) {
            b.mo48117c(str);
        }
        if (!(xVar.f81528n == null || xVar.f81528n.mo60519ak() == null)) {
            b.mo48118e(xVar.f81528n.mo60519ak());
        }
        b.mo48076e();
        return null;
    }
}
