package com.bytedance.android.livesdk.admin.p275c;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.admin.api.AdminApi2;
import com.bytedance.android.livesdk.admin.p277e.C4546a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.admin.c.a */
public final class C4533a {

    /* renamed from: a */
    C4546a f12469a;

    /* renamed from: b */
    private AdminApi2 f12470b = ((AdminApi2) C4514j.m10883j().mo10321b().mo9550a(AdminApi2.class));

    public C4533a(C4546a aVar) {
        this.f12469a = aVar;
    }

    /* renamed from: a */
    public final void mo10355a(long j) {
        this.f12470b.fetchAdministrators(j, TTLiveSDKContext.getHostService().mo10315h().mo14522a(j), TTLiveSDKContext.getHostService().mo10315h().mo14521a().getSecUid()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C4536d<Object>(this), (C1710e<? super Throwable>) new C4537e<Object>(this));
    }

    /* renamed from: a */
    public final void mo10356a(boolean z, long j, long j2, long j3) {
        int i;
        AdminApi2 adminApi2 = this.f12470b;
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        adminApi2.updateAdmin(i, j, j2, j3).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C4534b<Object>(this, j, z), (C1710e<? super Throwable>) new C4535c<Object>(this, z));
    }
}
