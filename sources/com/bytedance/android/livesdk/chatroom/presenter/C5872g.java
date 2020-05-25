package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.event.C5166al;
import com.bytedance.android.livesdk.chatroom.event.C5167am;
import com.bytedance.android.livesdk.chatroom.presenter.C5807b.C5809a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.g */
final /* synthetic */ class C5872g implements C1710e {

    /* renamed from: a */
    private final C5807b f15374a;

    /* renamed from: b */
    private final C5166al f15375b;

    C5872g(C5807b bVar, C5166al alVar) {
        this.f15374a = bVar;
        this.f15375b = alVar;
    }

    public final void accept(Object obj) {
        C5807b bVar = this.f15374a;
        Throwable th = (Throwable) obj;
        C4495a.m10823a().mo10301a((Object) new C5167am(this.f15375b, false));
        bVar.f15257a = true;
        if (bVar.mo8518c() != null && (th instanceof Exception)) {
            ((C5809a) bVar.mo8518c()).mo11692a((Exception) th);
        }
    }
}
