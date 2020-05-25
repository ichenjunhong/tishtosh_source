package android.support.p030v4.app;

import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.view.View;

/* renamed from: android.support.v4.app.a */
public final class C0607a {

    /* renamed from: android.support.v4.app.a$a */
    public interface C0609a {
        /* renamed from: a */
        void mo2102a(View view, C1008c cVar);
    }

    /* renamed from: a */
    public static void m1637a(View view, final C0609a aVar) {
        if (view != null) {
            C1056u.m3031a(view, (C1002a) new C1002a() {
                /* renamed from: a */
                public final void mo1119a(View view, C1008c cVar) {
                    super.mo1119a(view, cVar);
                    if (aVar != null) {
                        aVar.mo2102a(view, cVar);
                    }
                }
            });
        }
    }
}
