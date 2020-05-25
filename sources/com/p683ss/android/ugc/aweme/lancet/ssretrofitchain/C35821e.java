package com.p683ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35818c.C35819a;
import com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35823f.C35824a;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.e */
public final class C35821e extends C35818c {

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a */
    static final class C35822a<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C35823f f91995a;

        C35822a(C35823f fVar) {
            this.f91995a = fVar;
        }

        public final /* synthetic */ Object call() {
            Context context;
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                context = topActivity;
            } else {
                context = C11010c.m22280a();
            }
            C10691a.m21551c(context, this.f91995a.f91996a.f91999b).mo19066a();
            return null;
        }
    }

    public C35821e(C35818c cVar) {
        C52711k.m112240b(cVar, "next");
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C35819a mo74476a(C35823f fVar, C12686c cVar, C12799u<?> uVar) {
        String str;
        if (fVar != null) {
            C35824a aVar = fVar.f91996a;
            if (aVar != null && aVar.f91998a == 3003001) {
                C35824a aVar2 = fVar.f91996a;
                if (aVar2 != null) {
                    str = aVar2.f91999b;
                } else {
                    str = null;
                }
                if (C24678b.m60182a(str)) {
                    C0013i.m18a((Callable<TResult>) new C35822a<TResult>(fVar), C0013i.f25b);
                }
            }
        }
        C35819a aVar3 = C35817b.f91989a;
        C52711k.m112236a((Object) aVar3, "ChainManager.IGNORE_RESULT");
        return aVar3;
    }
}
