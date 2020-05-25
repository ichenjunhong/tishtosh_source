package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifpanel;

import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29361p;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29288d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33475a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33519b;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.b */
public final class C33588b extends C33475a<C33519b, C29288d> {

    /* renamed from: d */
    public C29361p f87053d;

    /* renamed from: e */
    private C33581a f87054e;

    /* renamed from: d */
    public final int mo70885d() {
        return R.layout.bfq;
    }

    /* renamed from: e */
    public final void mo70886e() {
        super.mo70886e();
        C33581a aVar = this.f87054e;
        if (aVar != null) {
            C33589c cVar = aVar.f87041c;
            if (cVar == null) {
                C52711k.m112237a("adapter");
            }
            cVar.mo54785f();
        }
    }

    /* renamed from: a */
    public final void mo71036a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "context");
        m76976b(fragmentActivity).mo71033a(true);
    }

    /* renamed from: b */
    private final C33581a m76976b(FragmentActivity fragmentActivity) {
        if (this.f87054e == null) {
            View view = this.f86752c;
            if (view != null) {
                this.f87054e = new C33581a(fragmentActivity, (ViewGroup) view, this.f87053d);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        C33581a aVar = this.f87054e;
        if (aVar == null) {
            C52711k.m112234a();
        }
        return aVar;
    }

    public C33588b(C33519b bVar, ViewGroup viewGroup, C29361p pVar) {
        C52711k.m112240b(bVar, "inputView");
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(pVar, "inputViewBridge");
        super(bVar, null, viewGroup);
        this.f87053d = pVar;
    }
}
