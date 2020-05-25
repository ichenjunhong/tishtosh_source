package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Bundle;
import android.os.Handler;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5264e;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5265f;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5265f.C5266a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5315j.C5316a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5315j.C5317b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c.C5383a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5384d;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5409au;
import com.bytedance.android.livesdk.chatroom.interact.p320i.C5620a.C5622a;
import com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout;
import com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.C5679b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.s */
public final class C5347s extends C5317b implements C5266a, C5622a {

    /* renamed from: e */
    public int f14238e;

    /* renamed from: f */
    public PkInviteUserListRefreshLayout f14239f;

    /* renamed from: g */
    public TextView f14240g;

    /* renamed from: h */
    public View f14241h;

    /* renamed from: i */
    public Boolean f14242i;

    /* renamed from: j */
    public Boolean f14243j;

    /* renamed from: k */
    private RecyclerView f14244k;

    /* renamed from: l */
    private C1322a<C1352v> f14245l;

    /* renamed from: m */
    private DataCenter f14246m;

    /* renamed from: n */
    private boolean f14247n;

    /* renamed from: o */
    private View f14248o;

    /* renamed from: p */
    private View f14249p;

    /* renamed from: q */
    private int f14250q;

    /* renamed from: c */
    public final float mo11150c() {
        return 432.0f;
    }

    /* renamed from: b */
    public final String mo11149b() {
        return getString(R.string.els);
    }

    /* renamed from: d */
    public final View mo11151d() {
        if (this.f14238e == 1) {
            return this.f14146a.mo11095b();
        }
        return null;
    }

    public final void onResume() {
        super.onResume();
        C5316a aVar = (C5316a) this.f14148c;
        int i = 2;
        if (this.f14238e == 2) {
            i = 1;
        }
        aVar.mo11191a(i);
    }

    /* renamed from: e */
    public final View mo11152e() {
        if (this.f14238e == 1) {
            return null;
        }
        if (!this.f14247n) {
            return super.mo11152e();
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aq0, (ViewGroup) getView(), false);
        inflate.setOnClickListener(new C5350t(this));
        return inflate;
    }

    /* renamed from: a */
    public final void mo11116a(int i) {
        if (this.f14245l != null) {
            this.f14245l.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11262a(View view) {
        this.f14146a.mo11094a(C5351u.m12157a(this.f14146a));
    }

    /* renamed from: a */
    public final void mo11194a(C5384d dVar) {
        if (this.f10828D) {
            if (this.f14146a.mo11097c() != null) {
                long id = this.f14146a.mo11097c().getId();
                if (dVar.f14339d != null) {
                    dVar.f14339d.get(Long.valueOf(id));
                }
            }
            if (dVar == null || (C9414h.m18630a(dVar.f14336a) && C9414h.m18630a(dVar.f14337b))) {
                this.f14244k.setVisibility(8);
            } else {
                C5265f fVar = (C5265f) this.f14245l;
                List<Room> list = dVar.f14336a;
                List<Room> list2 = dVar.f14337b;
                fVar.f14096a = list;
                fVar.f14097b = list2;
                if (!C9414h.m18630a(fVar.f14096a)) {
                    fVar.f14098c = fVar.f14096a.size();
                }
                if (!C9414h.m18630a(fVar.f14097b)) {
                    fVar.f14099d = fVar.f14097b.size();
                }
                this.f14245l.notifyDataSetChanged();
            }
            this.f14239f.setVisibility(0);
            this.f14248o.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo11197a(Throwable th) {
        if (this.f10828D) {
            C4602l.m11046a(getContext(), th);
        }
    }

    /* renamed from: a */
    public static C5347s m12140a(C5323b bVar, int i, DataCenter dataCenter) {
        return m12141a(bVar, i, dataCenter, false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f14249p = layoutInflater.inflate(R.layout.akg, viewGroup, false);
        this.f14244k = (RecyclerView) this.f14249p.findViewById(R.id.caf);
        this.f14239f = (PkInviteUserListRefreshLayout) this.f14249p.findViewById(R.id.by6);
        this.f14240g = (TextView) this.f14249p.findViewById(R.id.dek);
        this.f14241h = this.f14249p.findViewById(R.id.by5);
        this.f14248o = this.f14249p.findViewById(R.id.c3y);
        this.f14242i = Boolean.valueOf(true);
        this.f14243j = Boolean.valueOf(false);
        this.f14239f.setOnRefreshListener(new C5679b() {
            /* renamed from: c */
            public final void mo11265c() {
                C5347s.this.f14242i = Boolean.valueOf(true);
            }

            /* renamed from: a */
            public final void mo11263a() {
                if (C5347s.this.f14242i.booleanValue()) {
                    C5347s.this.f14241h.setVisibility(0);
                    C5347s.this.f14240g.setVisibility(8);
                    C5347s.this.f14242i = Boolean.valueOf(false);
                }
            }

            /* renamed from: b */
            public final void mo11264b() {
                int i = 1;
                C5347s.this.f14243j = Boolean.valueOf(true);
                C5316a aVar = (C5316a) C5347s.this.f14148c;
                if (C5347s.this.f14238e != 2) {
                    i = 2;
                }
                aVar.mo11191a(i);
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        if (C5347s.this.f14243j.booleanValue()) {
                            C5347s.this.f14239f.f14881p.run();
                            C5347s.this.f14243j = Boolean.valueOf(false);
                        }
                    }
                }, 6000);
            }
        });
        this.f14244k.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f14250q = ((Integer) LiveSettingKeys.PK_RECOMMEND_AND_LINEKMIC_OPTMIZE.mo9431a()).intValue();
        if ((this.f14238e == 1 && (this.f14250q == 2 || this.f14250q == 3)) || (this.f14238e == 2 && (this.f14250q == 1 || this.f14250q == 3))) {
            this.f14245l = new C5264e(getContext(), this, this, this.f14238e);
            this.f14239f.setmIsDisable(false);
        } else {
            this.f14248o.setVisibility(8);
            this.f14245l = new C5265f(getContext(), this);
            this.f14239f.setmIsDisable(true);
        }
        this.f14244k.setAdapter(this.f14245l);
        return this.f14249p;
    }

    /* renamed from: a */
    public final void mo11195a(Room room, C5382c cVar, int i) {
        String str;
        if (this.f10828D) {
            this.f14149d.f12627r = 0;
            C5323b bVar = this.f14146a;
            C5323b bVar2 = this.f14146a;
            if (this.f14238e == 1) {
                str = (String) C4525b.f12352aU.mo10345a();
            } else {
                str = getString(R.string.ee3);
            }
            bVar.mo11094a(C5332e.m12080a(bVar2, 0, str, room.getOwner(), this.f14149d.f12612c, room.getId(), this.f14246m));
            m12142b(room, null, cVar, i);
        }
    }

    /* renamed from: a */
    public static C5347s m12141a(C5323b bVar, int i, DataCenter dataCenter, boolean z) {
        C5347s sVar = new C5347s();
        sVar.f14148c = new C5409au(sVar);
        sVar.f14146a = bVar;
        sVar.f14238e = i;
        sVar.f14246m = dataCenter;
        sVar.f14247n = z;
        return sVar;
    }

    /* renamed from: b */
    private void m12142b(Room room, Throwable th, C5382c cVar, int i) {
        String str;
        HashMap hashMap = new HashMap();
        C8056g gVar = new C8056g();
        if (th == null) {
            hashMap.put("invitee_status", "0");
        } else {
            if ((th instanceof C2949a) && ((C2949a) th).getErrorCode() == 31002) {
                hashMap.put("invitee_status", "1");
            }
            hashMap.put("invitee_status", "2");
        }
        if (!(room == null || room.getOwner() == null)) {
            gVar.mo14211c(room.getOwner().getId());
        }
        hashMap.put("is_oncemore", "0");
        hashMap.put("pk_time", String.valueOf(C4525b.f12346aO.mo10345a()));
        if (cVar != null) {
            if (cVar.f14332b == C5383a.Distance.ordinal()) {
                str = "distance";
            } else if (cVar.f14332b == C5383a.DistanceCity.ordinal()) {
                str = "city";
            } else {
                str = "money";
            }
            hashMap.put("inviter_level", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, cVar.f14331a);
            hashMap.put("anchor_info", new C17971f().mo34889b(hashMap2));
        }
        C8049c.m15979a().mo14202a("connection_invite", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other").mo14213a("live_detail"), gVar.mo14209b(this.f14146a.mo11097c().getOwner().getId()).mo14210b((String) C4525b.f12352aU.mo10345a()).mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
    }

    /* renamed from: a */
    public final void mo11196a(Room room, Throwable th, C5382c cVar, int i) {
        if (this.f10828D) {
            C4602l.m11046a(getContext(), th);
            m12142b(room, th, cVar, i);
        }
    }

    /* renamed from: a */
    public final void mo11117a(Room room, int i, int i2, C5382c cVar, int i3) {
        if (this.f14146a.mo11097c() != null) {
            LinkCrossRoomDataHolder.m11103a().f12616g = (long) i2;
            TTLiveSDKContext.getHostService().mo10309b();
            if (this.f14238e == 2) {
                ((C5316a) this.f14148c).mo11192a(room, this.f14146a.mo11097c().getId(), cVar, i2, i3);
                return;
            }
            ((C5316a) this.f14148c).mo11193a(room, this.f14146a.mo11097c().getId(), (String) C4525b.f12352aU.mo10345a(), ((Integer) C4525b.f12346aO.mo10345a()).intValue(), i2, cVar, i3);
        }
    }
}
