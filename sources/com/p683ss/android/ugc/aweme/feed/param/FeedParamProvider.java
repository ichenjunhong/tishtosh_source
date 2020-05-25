package com.p683ss.android.ugc.aweme.feed.param;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.param.FeedParamProvider */
public final class FeedParamProvider extends C0209x {

    /* renamed from: b */
    public static final C30666a f80145b = new C30666a(null);

    /* renamed from: a */
    public C30669b f80146a;

    /* renamed from: com.ss.android.ugc.aweme.feed.param.FeedParamProvider$a */
    public static final class C30666a {
        private C30666a() {
        }

        public /* synthetic */ C30666a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C30669b m71942a(Context context) {
            C52711k.m112240b(context, "context");
            Activity a = C23729p.m58248a(context);
            if (a != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) a).mo359a(FeedParamProvider.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…aramProvider::class.java)");
                C30669b bVar = ((FeedParamProvider) a2).f80146a;
                if (bVar == null) {
                    return new C30669b();
                }
                return bVar;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public static final C30669b m71941a(Context context) {
        return C30666a.m71942a(context);
    }
}
