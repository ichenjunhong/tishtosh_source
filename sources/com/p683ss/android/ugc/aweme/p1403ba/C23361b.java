package com.p683ss.android.ugc.aweme.p1403ba;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.ba.b */
public class C23361b {

    /* renamed from: a */
    static final C23365c f62373a;

    /* renamed from: com.ss.android.ugc.aweme.ba.b$a */
    static class C23362a implements C23365c {

        /* renamed from: a */
        final Handler f62374a = new Handler(Looper.getMainLooper());

        C23362a() {
        }

        /* renamed from: a */
        public final void mo48416a(Activity activity, final String[] strArr, final C23364b bVar) {
            this.f62374a.post(new Runnable() {
                public final void run() {
                    if (bVar != null) {
                        int[] iArr = new int[strArr.length];
                        Arrays.fill(iArr, 0);
                        bVar.mo40906a(strArr, iArr);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.b$b */
    public interface C23364b {
        /* renamed from: a */
        void mo40906a(String[] strArr, int[] iArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.b$c */
    interface C23365c {
        /* renamed from: a */
        void mo48416a(Activity activity, String[] strArr, C23364b bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.b$d */
    static class C23366d implements C23365c {
        C23366d() {
        }

        /* renamed from: a */
        public final void mo48416a(Activity activity, String[] strArr, C23364b bVar) {
            if (((C23360a) activity.getFragmentManager().findFragmentByTag("permissions")) == null) {
                C23360a aVar = new C23360a();
                Bundle bundle = new Bundle();
                bundle.putStringArray("permissions", strArr);
                aVar.setArguments(bundle);
                aVar.f62372a = bVar;
                activity.getFragmentManager().beginTransaction().add(aVar, "permissions").commitAllowingStateLoss();
            }
        }
    }

    static {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f62373a = new C23366d();
        } else {
            f62373a = new C23362a();
        }
    }

    /* renamed from: a */
    public static void m57419a(Activity activity, String[] strArr, C23364b bVar) {
        f62373a.mo48416a(activity, strArr, bVar);
    }
}
