package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.view.KeyEvent;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ap */
public final class C47675ap {

    /* renamed from: com.ss.android.ugc.aweme.utils.ap$a */
    public static final class C47676a implements C50207b {

        /* renamed from: a */
        final /* synthetic */ C23441t f120156a;

        /* renamed from: b */
        private final C23441t f120157b;

        /* renamed from: c */
        private final Map<Object, Object> f120158c = new LinkedHashMap();

        /* renamed from: com.ss.android.ugc.aweme.utils.ap$a$a */
        static final class C47677a implements C23422a {

            /* renamed from: a */
            final /* synthetic */ C50206a f120159a;

            C47677a(C50206a aVar) {
                this.f120159a = aVar;
            }

            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return this.f120159a.mo58985a(i, keyEvent);
            }
        }

        C47676a(C23441t tVar) {
            this.f120156a = tVar;
            this.f120157b = tVar;
        }

        /* renamed from: a */
        public final void mo94977a(C50206a aVar) {
            C52711k.m112240b(aVar, "listener");
            if (!this.f120158c.containsKey(aVar)) {
                this.f120158c.put(aVar, new C47677a(aVar));
            }
            C23441t tVar = this.f120157b;
            Object obj = this.f120158c.get(aVar);
            if (obj != null) {
                tVar.mo48605a((C23422a) obj);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ActivityOnKeyDownListener");
        }

        /* renamed from: b */
        public final void mo94978b(C50206a aVar) {
            C52711k.m112240b(aVar, "listener");
            if (this.f120158c.containsKey(aVar)) {
                C23441t tVar = this.f120157b;
                Object remove = this.f120158c.remove(aVar);
                if (remove != null) {
                    tVar.mo48606b((C23422a) remove);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ActivityOnKeyDownListener");
            }
        }
    }

    /* renamed from: a */
    public static final C50207b m103188a(C23441t tVar) {
        C52711k.m112240b(tVar, "registry");
        return new C47676a(tVar);
    }

    /* renamed from: a */
    public static final C50207b m103187a(Activity activity) {
        Activity activity2;
        C52711k.m112240b(activity, "$this$asListenableRegistry");
        if (!(activity instanceof C23441t)) {
            activity2 = null;
        } else {
            activity2 = activity;
        }
        if (((C23441t) activity2) != null) {
            return m103188a((C23441t) activity);
        }
        return null;
    }
}
