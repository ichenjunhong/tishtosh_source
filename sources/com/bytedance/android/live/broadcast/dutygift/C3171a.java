package com.bytedance.android.live.broadcast.dutygift;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p194a.C3034a.C3035a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.a */
public final class C3171a extends C3177f {

    /* renamed from: com.bytedance.android.live.broadcast.dutygift.a$a */
    public interface C3172a extends C3035a, C6463ay {
        /* renamed from: c */
        void mo8503c(DutyGiftInfo dutyGiftInfo);

        /* renamed from: d */
        void mo8504d(DutyGiftInfo dutyGiftInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C3172a mo8518c() {
        return (C3172a) super.mo8518c();
    }

    /* renamed from: b */
    public final void mo8517b() {
        if (this.f9222a != null && this.f9222a.getOwner() != null) {
            C3395f.m9156f().mo8742c().mo9023f().dutyGiftRequest(this.f9222a.getId(), this.f9222a.getOwner().getId(), 2, false).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3173b<Object>(this), (C1710e<? super Throwable>) new C3174c<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8512a(C4177d dVar) throws Exception {
        mo8518c().mo8503c((DutyGiftInfo) dVar.data);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8513a(Throwable th) throws Exception {
        mo8518c().mo8503c(null);
    }

    /* renamed from: a */
    public final void mo8514a(boolean z) {
        if (this.f9222a != null && this.f9222a.getOwner() != null) {
            C3395f.m9156f().mo8742c().mo9023f().dutyGiftRequest(this.f9222a.getId(), this.f9222a.getOwner().getId(), 3, z).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3175d<Object>(this, z), (C1710e<? super Throwable>) new C3176e<Object>(this, z));
        }
    }

    public C3171a(Room room, DataCenter dataCenter) {
        super(room, dataCenter);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8515a(boolean z, C4177d dVar) throws Exception {
        if (!z) {
            mo8518c().mo8504d((DutyGiftInfo) dVar.data);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8516a(boolean z, Throwable th) throws Exception {
        if (!z) {
            mo8518c().mo8504d(null);
        }
    }
}
