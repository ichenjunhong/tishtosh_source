package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5190j;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6435e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import java.util.Set;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.t */
public final class C5891t extends C10176b<C5893a> {

    /* renamed from: a */
    public String f15411a;

    /* renamed from: b */
    public boolean f15412b = true;

    /* renamed from: c */
    public boolean f15413c;

    /* renamed from: d */
    public Room f15414d;

    /* renamed from: e */
    public int f15415e = 0;

    /* renamed from: f */
    private C1689b f15416f = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.t$a */
    public interface C5893a extends C10175a {
        /* renamed from: a */
        void mo11787a();

        /* renamed from: a */
        void mo11788a(C7514m mVar);

        /* renamed from: a */
        void mo11789a(String str);

        /* renamed from: a */
        void mo11790a(boolean z);

        /* renamed from: b */
        void mo11791b();

        /* renamed from: c */
        void mo11792c();
    }

    /* renamed from: h */
    public final void mo11784h() {
        this.f15415e = 0;
    }

    /* renamed from: d */
    public static C7505d m12825d() {
        return GiftManager.inst().getFastGift();
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        if (this.f15416f != null) {
            this.f15416f.mo6180a();
        }
    }

    /* renamed from: b */
    public final boolean mo11780b() {
        if (m12825d() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final long mo11781e() {
        if (m12825d() == null) {
            return 0;
        }
        return m12825d().f20543d;
    }

    /* renamed from: f */
    public final int mo11782f() {
        if (m12825d() != null) {
            return m12825d().f20545f;
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean mo11783g() {
        if (m12825d() == null || !m12825d().f20546g) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m12826i() {
        boolean z;
        if (m12825d() != null) {
            Set set = (Set) C4525b.f12325U.mo10345a();
            if (set == null || !set.contains(String.valueOf(m12825d().f20543d))) {
                z = true;
            } else {
                z = false;
            }
            this.f15412b = z;
        }
    }

    public final void onEvent(C7713e eVar) {
        if (eVar != null && eVar.f21217a == 2) {
            mo11778a((Context) null);
        }
    }

    /* renamed from: a */
    private <T> void m12824a(Class<T> cls) {
        this.f15416f.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C5190j) {
                    C5891t.this.onEvent((C5190j) t);
                    return;
                }
                if (t instanceof C7713e) {
                    C5891t.this.onEvent((C7713e) t);
                }
            }
        }));
    }

    /* renamed from: a */
    public final void mo8520a(C5893a aVar) {
        super.mo8520a(aVar);
        if (this.f15416f != null) {
            this.f15416f.mo6180a();
        }
        m12824a(C5190j.class);
        m12824a(C7713e.class);
        C7505d fastGift = GiftManager.inst().getFastGift();
        if (fastGift != null && fastGift.f20543d > 0) {
            m12826i();
            if (mo8518c() != null) {
                ((C5893a) mo8518c()).mo11791b();
            }
        }
    }

    /* renamed from: a */
    public final void mo11778a(Context context) {
        if (!this.f15413c) {
            if (m12825d() == null) {
                this.f15413c = false;
                return;
            }
            C7505d d = m12825d();
            this.f15413c = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            C2201v a = ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).send(d.f20543d, this.f15414d.getId(), this.f15414d.getOwner().getId(), 1, 126).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
            C5894u uVar = new C5894u(this, d, uptimeMillis, context);
            a.mo6506a((C1710e<? super T>) uVar, (C1710e<? super Throwable>) new C5895v<Object>(this, d), (C1706a) new C5896w(this));
        }
    }

    public final void onEvent(C5190j jVar) {
        int i;
        C5893a aVar = (C5893a) mo8518c();
        if (jVar != null) {
            if (jVar.f13898a == null) {
                i = 8;
            } else {
                i = 0;
            }
            C6435e eVar = new C6435e(i);
            if (eVar.f17717a != 0 || !((C4193l) C4116c.m10249a(C4193l.class)).toolbarManagerHelper().mo9646b().mo12669a(C6605h.RECHARGE_GUIDE)) {
                ((C4193l) C4116c.m10249a(C4193l.class)).toolbarManagerHelper().mo9646b().mo12667a(C6605h.FAST_GIFT, (C6597a) eVar);
                if (aVar != null) {
                    aVar.mo11791b();
                }
            } else {
                return;
            }
        }
        if (jVar != null && jVar.f13898a != null && jVar.f13898a.f20543d > 0) {
            if (jVar.f13899b != 2 && jVar.f13899b != 1 && m12825d() != null && m12825d().equals(jVar.f13898a)) {
                return;
            }
            if (!GiftManager.inst().isTemporaryFastGiftPresent() || jVar.f13899b == 1) {
                m12826i();
                if (aVar != null) {
                    if (jVar.f13899b == 2 || jVar.f13899b == 1) {
                        aVar.mo11790a(jVar.f13900c);
                        return;
                    }
                    aVar.mo11791b();
                }
            }
        }
    }
}
