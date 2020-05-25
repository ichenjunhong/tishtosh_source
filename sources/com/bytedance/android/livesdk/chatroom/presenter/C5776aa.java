package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.C5899y.C5901a;
import com.bytedance.android.livesdk.gift.C7647s;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.aa */
public final /* synthetic */ class C5776aa implements C1710e {

    /* renamed from: a */
    private final C5899y f15223a;

    /* renamed from: b */
    private final long f15224b;

    public C5776aa(C5899y yVar, long j) {
        this.f15223a = yVar;
        this.f15224b = j;
    }

    public final void accept(Object obj) {
        C5899y yVar = this.f15223a;
        long j = this.f15224b;
        Throwable th = (Throwable) obj;
        if (yVar.mo8518c() != null) {
            ((C5901a) yVar.mo8518c()).mo11800b(th);
        }
        C7647s.m15649a(j, yVar.f15432b.getId(), th);
    }
}
