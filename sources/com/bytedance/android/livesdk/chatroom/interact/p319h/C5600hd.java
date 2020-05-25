package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5324m.C5325a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5324m.C5326b;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.p330f.C6772g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.hd */
public final class C5600hd extends C5325a {

    /* renamed from: b */
    private Room f14688b;

    /* renamed from: c */
    private long f14689c;

    /* renamed from: d */
    private String f14690d;

    /* renamed from: e */
    private C5696e f14691e;

    /* renamed from: f */
    private long f14692f;

    /* renamed from: b */
    public final Room mo11211b() {
        return this.f14688b;
    }

    /* renamed from: c */
    public final long mo11212c() {
        return this.f14689c;
    }

    /* renamed from: d */
    public final String mo11213d() {
        return this.f14690d;
    }

    /* renamed from: f */
    public final void mo11492f() {
        super.mo11492f();
    }

    /* renamed from: g */
    public final C5696e mo11216g() {
        return this.f14691e;
    }

    /* renamed from: a */
    public final User mo11207a() {
        if (this.f14691e != null) {
            return this.f14691e.f14953d;
        }
        return null;
    }

    /* renamed from: d_ */
    public final boolean mo11214d_() {
        if (this.f14691e == null || this.f14691e.f14956g != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo11215e() {
        if (this.f14689c == 0 || this.f14689c != TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m12489h() {
        if (this.f18546a != null) {
            if (this.f14691e == null) {
                ((C5326b) this.f18546a).setVisibility(false);
                return;
            }
            ((C5326b) this.f18546a).setVisibility(true);
            if (this.f14691e.f14953d != null) {
                ((C5326b) this.f18546a).mo11219a(this.f14691e.f14953d);
            }
            mo11209a(this.f14691e.f14951b);
            if (this.f14691e.f14958i > 0) {
                ((C5326b) this.f18546a).mo11217a(this.f14691e.f14959j, mo11215e());
            }
            ((C5326b) this.f18546a).mo11221b(mo11215e());
        }
    }

    /* renamed from: a */
    public final void mo11208a(int i) {
        boolean z;
        if (this.f14691e != null) {
            this.f14691e.f14950a = i;
        }
        if (this.f18546a != null) {
            C5326b bVar = (C5326b) this.f18546a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo11220a(z);
        }
    }

    /* renamed from: a */
    public final void mo11209a(long j) {
        if (j >= this.f14692f) {
            this.f14692f = j;
            if (this.f18546a != null) {
                ((C5326b) this.f18546a).mo11218a(this.f14692f);
            }
            if (mo11215e()) {
                C4639e.m11122a().mo10422a(this.f14692f);
            }
        }
    }

    /* renamed from: a */
    public final void mo11210a(C5696e eVar) {
        if (this.f14691e != null) {
            C5696e eVar2 = this.f14691e;
            if (eVar != null && eVar2.f14953d.getId() == eVar.f14953d.getId()) {
                if (eVar.f14951b > eVar2.f14951b) {
                    eVar2.f14951b = eVar.f14951b;
                }
                eVar2.f14952c = eVar.f14952c;
                eVar2.f14953d = eVar.f14953d;
                if (eVar.f14954e > eVar2.f14954e) {
                    eVar2.f14954e = eVar.f14954e;
                }
                eVar2.f14955f = eVar.f14955f;
                eVar2.f14956g = eVar.f14956g;
                eVar2.f14957h = eVar.f14957h;
                eVar2.f14958i = eVar.f14958i;
            }
        } else {
            this.f14691e = eVar;
        }
        if (this.f14691e != null) {
            this.f14690d = this.f14691e.mo11637a();
            if (this.f14691e.f14953d != null) {
                this.f14689c = this.f14691e.f14953d.getId();
            }
        }
        m12489h();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11490a(C6772g gVar) {
        super.mo11490a((C5326b) gVar);
        m12489h();
    }

    public C5600hd(Room room, long j, String str, C5696e eVar) {
        this.f14688b = room;
        this.f14689c = j;
        this.f14690d = str;
        this.f14691e = eVar;
        if (this.f14691e != null) {
            this.f14690d = this.f14691e.mo11637a();
            if (this.f14691e.f14953d != null) {
                this.f14689c = this.f14691e.f14953d.getId();
            }
        }
    }
}
