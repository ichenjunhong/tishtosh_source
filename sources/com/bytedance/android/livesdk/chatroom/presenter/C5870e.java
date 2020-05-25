package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.event.C5167am;
import com.bytedance.android.livesdk.chatroom.event.C5168an;
import com.bytedance.android.livesdk.chatroom.presenter.C5807b.C5809a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.e */
final /* synthetic */ class C5870e implements C1710e {

    /* renamed from: a */
    private final C5807b f15370a;

    /* renamed from: b */
    private final C5168an f15371b;

    C5870e(C5807b bVar, C5168an anVar) {
        this.f15370a = bVar;
        this.f15371b = anVar;
    }

    public final void accept(Object obj) {
        C5807b bVar = this.f15370a;
        Throwable th = (Throwable) obj;
        C4495a.m10823a().mo10301a((Object) new C5167am(this.f15371b, false));
        bVar.f15258b = true;
        if (bVar.mo8518c() != null && (th instanceof Exception)) {
            ((C5809a) bVar.mo8518c()).mo11694b((Exception) th);
        }
    }
}
