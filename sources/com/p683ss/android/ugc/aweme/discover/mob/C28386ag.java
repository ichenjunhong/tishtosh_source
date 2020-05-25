package com.p683ss.android.ugc.aweme.discover.mob;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.ag */
public final class C28386ag {

    /* renamed from: a */
    public static final C28387a f74547a = new C28387a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.ag$a */
    public static final class C28387a {
        private C28387a() {
        }

        public /* synthetic */ C28387a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C27797ad m67363a(View view) {
            C52711k.m112240b(view, "view");
            C27797ad adVar = (C27797ad) C28385af.f74546a.mo48394b(view);
            if (adVar == null) {
                Context context = view.getContext();
                if (context instanceof FragmentActivity) {
                    C28385af afVar = C28385af.f74546a;
                    Window window = ((FragmentActivity) context).getWindow();
                    C52711k.m112236a((Object) window, "context.window");
                    adVar = (C27797ad) afVar.mo48394b(window.getDecorView());
                }
            }
            if (adVar == null) {
                return new C27797ad(true);
            }
            return adVar;
        }

        /* renamed from: a */
        public static void m67364a(View view, C27797ad adVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(adVar, "param");
            C28385af.f74546a.mo48392a(view, adVar);
        }
    }
}
