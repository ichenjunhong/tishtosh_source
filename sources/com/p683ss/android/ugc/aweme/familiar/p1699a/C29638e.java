package com.p683ss.android.ugc.aweme.familiar.p1699a;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.services.C41713b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import p064c.p065a.p094l.C2180b;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.familiar.a.e */
public final class C29638e implements C41683a, C41692a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f77490a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29638e.class), "mPushSettingChangePresenter", "getMPushSettingChangePresenter()Lcom/ss/android/ugc/aweme/common/BasePresenter;"))};

    /* renamed from: b */
    public static final C29638e f77491b = new C29638e();

    /* renamed from: c */
    private static C2180b<String> f77492c;

    /* renamed from: d */
    private static final Queue<String> f77493d = new ArrayBlockingQueue(10);

    /* renamed from: e */
    private static final ArrayList<String> f77494e = C52575l.m112103d("digg_push", "comment_push", "follow_push", "mention_push", "im_push");

    /* renamed from: f */
    private static C41686c f77495f;

    /* renamed from: g */
    private static final C52668f f77496g = C52732g.m112285a(C29639a.f77497a);

    /* renamed from: com.ss.android.ugc.aweme.familiar.a.e$a */
    static final class C29639a extends C52712l implements C52670a<C26851b<C26832a<BaseResponse>, C41692a>> {

        /* renamed from: a */
        public static final C29639a f77497a = new C29639a();

        C29639a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26851b providePrivateSettingChangePresenter = C41713b.f105569a.providePrivateSettingChangePresenter();
            providePrivateSettingChangePresenter.mo54800a(C29638e.f77491b);
            return providePrivateSettingChangePresenter;
        }
    }

    private C29638e() {
    }

    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    /* renamed from: g */
    public final void mo55287g() {
        m69684b();
    }

    /* renamed from: l */
    public final void mo55288l() {
        m69684b();
    }

    /* renamed from: b */
    private static void m69684b() {
        boolean z;
        Collection collection = f77493d;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2180b<String> bVar = f77492c;
            if (bVar != null) {
                bVar.onComplete();
            }
        } else {
            String str = (String) f77493d.poll();
            C2180b<String> bVar2 = f77492c;
            if (bVar2 != null) {
                bVar2.onNext(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo47082a(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
        f77495f = cVar;
    }
}
