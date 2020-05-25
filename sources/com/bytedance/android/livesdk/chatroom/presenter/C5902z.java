package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.presenter.C5899y.C5901a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p376f.C7449a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.z */
public final /* synthetic */ class C5902z implements C1710e {

    /* renamed from: a */
    private final C5899y f15439a;

    /* renamed from: b */
    private final long f15440b;

    /* renamed from: c */
    private final long f15441c;

    /* renamed from: d */
    private final String f15442d;

    public C5902z(C5899y yVar, long j, long j2, String str) {
        this.f15439a = yVar;
        this.f15440b = j;
        this.f15441c = j2;
        this.f15442d = str;
    }

    public final void accept(Object obj) {
        C5899y yVar = this.f15439a;
        long j = this.f15440b;
        long j2 = this.f15441c;
        String str = this.f15442d;
        C4177d dVar = (C4177d) obj;
        C7647s.m15648a(j, yVar.f15432b.getId(), SystemClock.uptimeMillis() - j2);
        if (yVar.mo8518c() != null) {
            C7514m mVar = (C7514m) dVar.data;
            if (mVar != null) {
                mVar.f20632x = str;
                ((C5901a) yVar.mo8518c()).mo11795a((C7514m) dVar.data);
                return;
            }
            ((C5901a) yVar.mo8518c()).mo11800b(new C7449a());
        }
    }
}
