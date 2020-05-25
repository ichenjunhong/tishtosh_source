package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.a */
public final class C5387a extends C10176b<C5388a> {

    /* renamed from: a */
    public final C1689b f14342a = new C1689b();

    /* renamed from: b */
    public boolean f14343b;

    /* renamed from: c */
    boolean f14344c;

    /* renamed from: d */
    boolean f14345d;

    /* renamed from: e */
    public Room f14346e;

    /* renamed from: f */
    private boolean f14347f;

    /* renamed from: g */
    private C5630a f14348g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.a$a */
    public interface C5388a extends C10175a {
        /* renamed from: a */
        void mo11295a();

        /* renamed from: a */
        void mo11296a(Throwable th);

        /* renamed from: b */
        void mo11297b();

        /* renamed from: b */
        void mo11298b(Throwable th);

        /* renamed from: c */
        void mo11299c();

        /* renamed from: c */
        void mo11300c(Throwable th);
    }

    /* renamed from: a */
    public final void mo8247a() {
        this.f14342a.mo6180a();
        super.mo8247a();
    }

    /* renamed from: b */
    public final int mo11293b() {
        C5696e b = this.f14348g.mo11521b(TTLiveSDKContext.getHostService().mo10315h().mo14529b(), C4638d.m11114a().f12665h);
        if (b != null) {
            return b.f14961l;
        }
        return -1;
    }

    /* renamed from: a */
    static void m12189a(Throwable th) {
        C3831a.m9706a(6, "AudioGuestManagerPresenter", th.getStackTrace());
    }

    /* renamed from: a */
    public final boolean mo11292a(boolean z) {
        C5696e b = this.f14348g.mo11521b(TTLiveSDKContext.getHostService().mo10315h().mo14529b(), C4638d.m11114a().f12665h);
        if (this.f14347f || !z) {
            return true;
        }
        if (b == null || b.f14961l == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo11291a(long j) {
        if (!this.f14344c) {
            this.f14344c = true;
            this.f14342a.mo6181a(((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).silence(this.f14346e.getId(), j).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5415b<Object>(this), (C1710e<? super Throwable>) new C5443c<Object>(this)));
        }
    }

    /* renamed from: b */
    public final void mo11294b(long j) {
        if (!this.f14345d) {
            this.f14345d = true;
            this.f14342a.mo6181a(((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).unSilence(this.f14346e.getId(), j).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5476d<Object>(this), (C1710e<? super Throwable>) new C5503e<Object>(this)));
        }
    }

    public C5387a(Room room, boolean z, C5630a aVar) {
        this.f14346e = room;
        this.f14347f = z;
        this.f14348g = aVar;
    }
}
