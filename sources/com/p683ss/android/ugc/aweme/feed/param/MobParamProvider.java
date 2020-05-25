package com.p683ss.android.ugc.aweme.feed.param;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.p1382aq.C23242l;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.param.MobParamProvider */
public final class MobParamProvider extends C0209x {

    /* renamed from: b */
    public static final C30667a f80147b = new C30667a(null);

    /* renamed from: a */
    public HashMap<String, String> f80148a = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.param.MobParamProvider$a */
    public static final class C30667a {
        private C30667a() {
        }

        public /* synthetic */ C30667a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C23242l mo62989a(Context context) {
            C52711k.m112240b(context, "context");
            return new C23242l(m71944b(context).f80148a);
        }

        /* renamed from: b */
        public static MobParamProvider m71944b(Context context) {
            C52711k.m112240b(context, "context");
            Activity a = C23729p.m58248a(context);
            if (a != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) a).mo359a(MobParamProvider.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…aramProvider::class.java)");
                return (MobParamProvider) a2;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public static final C23242l m71943a(Context context) {
        return f80147b.mo62989a(context);
    }
}
