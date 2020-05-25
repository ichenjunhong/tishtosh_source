package com.bytedance.android.livesdk.p279af;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.p815p.p816a.C12527a;
import com.bytedance.p815p.p816a.C12527a.C12529a;
import com.bytedance.p815p.p816a.C12527a.C12531c;
import com.bytedance.p815p.p816a.C12546c;
import com.bytedance.p815p.p816a.p819c.C12548b;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.bytedance.android.livesdk.af.t */
public final class C4610t {

    /* renamed from: a */
    public static WeakReference<C8548h> f12585a;

    /* renamed from: a */
    private static C12531c m11069a(Context context) {
        f12585a = new WeakReference<>(new C8552a(context, 2).mo15001b());
        return new C12531c() {
            /* renamed from: a */
            public final void mo10402a() {
                Dialog dialog = (Dialog) C4610t.f12585a.get();
                if (dialog != null) {
                    dialog.show();
                }
            }

            /* renamed from: b */
            public final void mo10403b() {
                Dialog dialog = (Dialog) C4610t.f12585a.get();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }

            /* renamed from: c */
            public final boolean mo10404c() {
                Dialog dialog = (Dialog) C4610t.f12585a.get();
                if (dialog != null) {
                    return dialog.isShowing();
                }
                return false;
            }
        };
    }

    /* renamed from: c */
    private static void m11072c(Context context, C4550a aVar) {
        C12546c.m25173a(m11073d(context, aVar));
    }

    /* renamed from: b */
    public static boolean m11071b(Context context, C4550a aVar) {
        if (m11070a(context, aVar)) {
            return m11074e(context, aVar);
        }
        m11072c(context, aVar);
        return false;
    }

    /* renamed from: a */
    public static boolean m11070a(Context context, C4550a aVar) {
        new StringBuilder("Checking dynamic feature(s) ").append(Arrays.toString(aVar.appBundles));
        if (aVar.gateClosed() || aVar.previouslyInstalled(context)) {
            return true;
        }
        boolean b = C12546c.m25174b(m11073d(context, aVar));
        if (b) {
            aVar.cacheInstalledStatus(context);
        }
        return b;
    }

    /* renamed from: d */
    private static C12527a m11073d(Context context, C4550a aVar) {
        C12529a aVar2 = new C12529a();
        for (String a : aVar.appBundles) {
            aVar2.mo23581a(a);
        }
        aVar2.mo23579a(context);
        aVar2.mo23578a(2);
        aVar2.mo23580a(m11069a(context));
        return aVar2.mo23582a();
    }

    /* renamed from: e */
    private static boolean m11074e(Context context, C4550a aVar) {
        if (aVar.gateClosed()) {
            return true;
        }
        String[] strArr = aVar.soNames;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                ((C12548b) C12546c.f32933a.mo23583a(2)).mo23590a(context, strArr[i]);
                i++;
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }
}
