package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.ies.p672e.C10753b;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.aj */
final /* synthetic */ class C6448aj implements Runnable {

    /* renamed from: a */
    private final C6277c f17750a;

    /* renamed from: b */
    private final View f17751b;

    /* renamed from: c */
    private final C10753b f17752c;

    C6448aj(C6277c cVar, View view, C10753b bVar) {
        this.f17750a = cVar;
        this.f17751b = view;
        this.f17752c = bVar;
    }

    public final void run() {
        C6277c cVar = this.f17750a;
        View view = this.f17751b;
        C10753b bVar = this.f17752c;
        cVar.f16957a = (C8374c) ((C8374c) ((C8374c) ((C8374c) C8374c.m16598b(DecorationWrapperWidget.this.getContext()).mo14562a((int) R.layout.bxl)).mo14565a(false)).mo14569b(false)).mo14561a();
        cVar.f16957a.mo14566a(view, 1, 4, C3922z.m9899a(20.0f), C3922z.m9899a(-4.0f));
        if (cVar.f16958b != null && !cVar.f16958b.isDisposed()) {
            cVar.f16958b.dispose();
        }
        cVar.f16958b = C2201v.m6592a(3000, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C6449ak<Object>(cVar));
        if (bVar != null) {
            bVar.mo19445b("live.mt.sticker_donation.shown", Boolean.valueOf(true));
        }
    }
}
