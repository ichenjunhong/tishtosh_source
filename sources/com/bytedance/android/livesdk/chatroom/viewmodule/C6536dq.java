package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dq */
final /* synthetic */ class C6536dq implements C1710e {

    /* renamed from: a */
    private final C6323a f17860a;

    /* renamed from: b */
    private final View f17861b;

    C6536dq(C6323a aVar, View view) {
        this.f17860a = aVar;
        this.f17861b = view;
    }

    public final void accept(Object obj) {
        C6323a aVar = this.f17860a;
        View view = this.f17861b;
        Long l = (Long) obj;
        C4525b.f12362ae.mo10346a(Boolean.valueOf(false));
        aVar.f17313a = (C8374c) ((C8374c) ((C8374c) ((C8374c) C8374c.m16598b(LiveShareWidget.this.getContext()).mo14562a((int) R.layout.ara)).mo14571c(C3922z.m9899a(38.0f))).mo14572c(true)).mo14582a(new C6538ds(aVar, view)).mo14561a();
        aVar.f17313a.mo14566a(view, 1, 4, C3922z.m9899a(16.0f), C3922z.m9899a(-4.0f));
        LiveShareWidget.this.f17307a.mo6181a(C2201v.m6592a(3, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6539dt<Object>(aVar), (C1710e<? super Throwable>) new C6540du<Object>(aVar)));
    }
}
