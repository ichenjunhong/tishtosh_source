package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.b */
public abstract class C5060b {

    /* renamed from: a */
    final C5061a f13539a;

    /* renamed from: b */
    public boolean f13540b;

    /* renamed from: c */
    public Room f13541c;

    /* renamed from: d */
    private C1690c f13542d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.b$a */
    public interface C5061a {
        /* renamed from: a */
        void mo10936a(int i, String str);

        /* renamed from: a */
        void mo10937a(Room room);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C2201v<C4177d<Room>> mo10935c();

    /* renamed from: b */
    public final void mo10934b() {
        this.f13540b = false;
        if (this.f13542d != null && !this.f13542d.isDisposed()) {
            this.f13542d.dispose();
        }
    }

    /* renamed from: a */
    public final void mo10932a() {
        if (!this.f13540b) {
            this.f13540b = true;
            this.f13542d = mo10935c().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5062c<Object>(this), (C1710e<? super Throwable>) new C5063d<Object>(this));
        }
    }

    C5060b(C5061a aVar) {
        this.f13539a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10933a(int i, String str) {
        this.f13540b = false;
        this.f13539a.mo10936a(i, str);
    }
}
