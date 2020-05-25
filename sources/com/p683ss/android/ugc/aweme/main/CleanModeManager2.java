package com.p683ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.CleanModeManager2 */
public final class CleanModeManager2 extends C0209x {

    /* renamed from: d */
    public static final C36450a f93404d = new C36450a(null);

    /* renamed from: a */
    public final C23275b<Boolean> f93405a = new C23275b<>();

    /* renamed from: b */
    public long f93406b = 200;

    /* renamed from: c */
    public boolean f93407c;

    /* renamed from: com.ss.android.ugc.aweme.main.CleanModeManager2$a */
    public static final class C36450a {
        private C36450a() {
        }

        public /* synthetic */ C36450a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private final C23275b<Boolean> m82256a(FragmentActivity fragmentActivity) {
            return m82257b(fragmentActivity).f93405a;
        }

        /* renamed from: a */
        public final boolean mo75395a(Context context) {
            if (context instanceof FragmentActivity) {
                return m82257b((FragmentActivity) context).f93407c;
            }
            return false;
        }

        /* renamed from: b */
        private static CleanModeManager2 m82257b(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "context");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(CleanModeManager2.class);
            C52711k.m112236a((Object) a, "ViewModelProviders\n     …ModeManager2::class.java)");
            return (CleanModeManager2) a;
        }

        /* renamed from: b */
        public final boolean mo75396b(Context context) {
            if (!(context instanceof FragmentActivity)) {
                return false;
            }
            Boolean bool = (Boolean) m82256a((FragmentActivity) context).getValue();
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m82254a(Context context) {
        return f93404d.mo75395a(context);
    }

    /* renamed from: b */
    public static final boolean m82255b(Context context) {
        return f93404d.mo75396b(context);
    }
}
