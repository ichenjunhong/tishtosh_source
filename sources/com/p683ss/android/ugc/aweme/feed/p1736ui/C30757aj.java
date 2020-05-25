package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.main.C36664i;
import com.p683ss.android.ugc.aweme.p1382aq.C23245o;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.aj */
final /* synthetic */ class C30757aj implements Callable {

    /* renamed from: a */
    private final C30753ai f80597a;

    C30757aj(C30753ai aiVar) {
        this.f80597a = aiVar;
    }

    public final Object call() {
        C30753ai aiVar = this.f80597a;
        C23245o b = new C23245o("enter_homepage_hot").mo48115a("open_app").mo48116b("open_app");
        Fragment fragment = aiVar.f80582s;
        if (fragment instanceof C36664i) {
            b.mo48117c(((C36664i) fragment).mo75508h());
        }
        if (!(aiVar.f80590m == null || aiVar.f80590m.mo60519ak() == null)) {
            b.mo48118e(aiVar.f80590m.mo60519ak());
        }
        b.mo48076e();
        return null;
    }
}
