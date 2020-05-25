package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.api.C4992b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.data.C5360e;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.model.p323a.p324a.C5691a;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.video.rtc.interact.model.Config.Vendor;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1681ae;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.eg */
public final class C5511eg extends C5868cl<C5513b> {

    /* renamed from: a */
    boolean f14542a;

    /* renamed from: b */
    boolean f14543b;

    /* renamed from: c */
    boolean f14544c;

    /* renamed from: d */
    boolean f14545d;

    /* renamed from: e */
    boolean f14546e;

    /* renamed from: f */
    boolean f14547f;

    /* renamed from: g */
    public boolean f14548g;

    /* renamed from: h */
    public boolean f14549h;

    /* renamed from: i */
    public boolean f14550i;

    /* renamed from: j */
    public boolean f14551j;

    /* renamed from: k */
    public Room f14552k;

    /* renamed from: l */
    long f14553l;

    /* renamed from: m */
    long f14554m;

    /* renamed from: n */
    public C5512a f14555n;

    /* renamed from: o */
    public DataCenter f14556o;

    /* renamed from: p */
    private boolean f14557p;

    /* renamed from: q */
    private C0199s<KVData> f14558q = new C5514eh(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.eg$a */
    public interface C5512a {
        /* renamed from: a */
        void mo11425a(long j);

        /* renamed from: a */
        void mo11426a(long j, Throwable th);

        /* renamed from: a */
        void mo11427a(Throwable th);

        /* renamed from: b */
        void mo11428b();

        /* renamed from: b */
        void mo11429b(long j);

        /* renamed from: c */
        void mo11430c();

        /* renamed from: d */
        void mo11431d();

        /* renamed from: e */
        void mo11432e();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.eg$b */
    public interface C5513b extends C6463ay {
        /* renamed from: a */
        void mo11063a();

        /* renamed from: a */
        void mo11064a(long j);

        /* renamed from: a */
        void mo11066a(List<C5696e> list);

        /* renamed from: d */
        void mo11071d();

        /* renamed from: e */
        void mo11073e();
    }

    /* renamed from: h */
    public static Vendor m12351h() {
        return C5360e.m12169a();
    }

    /* renamed from: g */
    public final boolean mo11421g() {
        if (this.f14552k.getStreamUrlExtraSafely().f23982l > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g_ */
    public final void mo11422g_() {
        this.f14549h = false;
        this.f14550i = false;
        mo11420e();
    }

    /* renamed from: i */
    public final String mo11423i() {
        return this.f14552k.getStreamUrl().mo15381a();
    }

    /* renamed from: j */
    public final String mo11424j() {
        return String.valueOf(this.f14552k.getId());
    }

    /* renamed from: b */
    public final void mo11415b() {
        if (!this.f14542a) {
            this.f14542a = true;
            ((C4005af) C4992b.m11476a((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class), this.f14552k.getId(), 4).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5522ep(this), new C5523eq(this));
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        if (2 == ((Integer) C4639e.m11122a().f12651b).intValue() || 1 == ((Integer) C4639e.m11122a().f12651b).intValue()) {
            ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14552k.getId()).mo6152a(C5515ei.f14560a, (C1710e<? super Throwable>) new C5521eo<Object>(this));
        }
        this.f14556o.removeObserver("cmd_interact_state_change", this.f14558q);
        super.mo8247a();
    }

    /* renamed from: d */
    public final void mo11419d() {
        if (mo8518c() != null && !this.f14546e && !this.f14548g) {
            if (!this.f14557p) {
                this.f14546e = true;
                ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).joinChannelV1(this.f14552k.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5528ev(this), new C5516ej(this));
            } else if (!this.f14550i) {
                this.f14556o.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(7));
                this.f14548g = true;
                ((C5513b) mo8518c()).mo11071d();
            } else {
                if (this.f14555n != null) {
                    this.f14555n.mo11428b();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11420e() {
        if (mo8518c() != null && !this.f14547f && !this.f14549h && !this.f14545d) {
            if (this.f14550i) {
                this.f14549h = true;
                ((C5513b) mo8518c()).mo11073e();
            } else if (this.f14557p) {
                this.f14547f = true;
                ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14552k.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5517ek(this), new C5518el(this));
            } else {
                this.f14545d = true;
                ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).finishV1(this.f14552k.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5519em(this), new C5520en(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11412a(C4177d dVar) throws Exception {
        this.f14547f = false;
        this.f14557p = false;
        mo11420e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11417b(C4177d dVar) throws Exception {
        this.f14546e = false;
        this.f14557p = true;
        mo11419d();
    }

    /* renamed from: a */
    public final void mo8520a(C5513b bVar) {
        super.mo8520a(bVar);
        this.f14556o.observeForever("cmd_interact_state_change", this.f14558q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo11418c(C4177d dVar) throws Exception {
        this.f14543b = false;
        if (this.f14555n != null) {
            C5691a aVar = (C5691a) dVar.data;
            if (aVar != null) {
                C4638d a = C4638d.m11114a();
                String str = aVar.f14928h;
                int i = aVar.f14927g;
                a.f12669l.put(a.mo10421c(str, i), Integer.valueOf(i));
            }
            ((C5513b) mo8518c()).mo11064a(this.f14553l);
            this.f14555n.mo11425a(this.f14553l);
            this.f14553l = 0;
            C8059j jVar = new C8059j();
            if (!TextUtils.isEmpty("")) {
                jVar.mo14213a("live_take_detail");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("guest_connection_type", "video");
            C8049c.m15979a().mo14202a("guest_connection_agree", hashMap, jVar, Room.class);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11414a(KVData kVData) {
        if (!(kVData == null || kVData.getData() == null || ((C5202u) kVData.getData()).f13919a != 0 || mo8518c() == null)) {
            mo11415b();
        }
    }

    public C5511eg(Room room, DataCenter dataCenter) {
        this.f14552k = room;
        this.f14556o = dataCenter;
    }

    /* renamed from: a */
    public final void mo11411a(long j, String str) {
        if (!this.f14543b) {
            this.f14553l = j;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).permit(this.f14552k.getId(), j, str).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5524er(this), new C5525es(this));
        }
    }

    /* renamed from: b */
    public final void mo11416b(long j, String str) {
        if (!this.f14544c) {
            this.f14554m = j;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).kickOut(this.f14552k.getId(), this.f14554m, str).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5526et(this), new C5527eu(this));
        }
    }
}
