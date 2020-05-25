package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.VoteApi;
import com.bytedance.android.livesdk.chatroom.model.C5733av;
import com.bytedance.android.livesdk.chatroom.model.C5734aw;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7812aq;
import com.bytedance.android.livesdk.message.model.C7813ar;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9414h;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cf */
public final class C5860cf extends C5868cl<C5861a> implements OnMessageListener {

    /* renamed from: a */
    public int f15345a;

    /* renamed from: b */
    public C5733av f15346b;

    /* renamed from: c */
    private Room f15347c;

    /* renamed from: d */
    private long f15348d;

    /* renamed from: e */
    private long f15349e;

    /* renamed from: f */
    private long f15350f;

    /* renamed from: g */
    private long f15351g;

    /* renamed from: h */
    private C1690c f15352h;

    /* renamed from: i */
    private C1690c f15353i;

    /* renamed from: j */
    private boolean f15354j;

    /* renamed from: k */
    private boolean f15355k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cf$a */
    public interface C5861a extends C6463ay {
        /* renamed from: a */
        void mo11741a();

        /* renamed from: a */
        void mo11742a(long j);

        /* renamed from: a */
        void mo11743a(long j, long j2);

        /* renamed from: a */
        void mo11744a(C5733av avVar, long j, boolean z);

        /* renamed from: a */
        void mo11745a(IMessage iMessage);

        /* renamed from: b */
        void mo11746b(long j);

        /* renamed from: b */
        void mo11747b(long j, long j2);

        /* renamed from: c */
        void mo11748c(long j);
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
    }

    /* renamed from: b */
    private void m12755b() {
        ((C5861a) mo8518c()).mo11744a(this.f15346b, this.f15350f, this.f15355k);
    }

    /* renamed from: e */
    private void m12758e() {
        ((C5861a) mo8518c()).mo11748c((long) ((int) (this.f15350f / 1)));
    }

    /* renamed from: d */
    private void m12757d() {
        boolean z;
        if (this.f15351g != 0) {
            this.f15350f -= (System.currentTimeMillis() - this.f15351g) / 1000;
            this.f15351g = 0;
        }
        ((C5861a) mo8518c()).mo11742a(this.f15350f);
        if (this.f15350f >= 9) {
            z = true;
        } else {
            z = false;
        }
        this.f15352h = ((C4002ac) C4585b.m11020a(1, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9405a((C1710e<? super T>) new C5864ci<Object>(this, z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11740b(Long l) throws Exception {
        mo11735a(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11737a(Long l) throws Exception {
        mo11735a(0);
    }

    /* renamed from: b */
    private void m12756b(long j) {
        ((C5861a) mo8518c()).mo11747b(this.f15348d, this.f15349e);
        this.f15353i = ((C4002ac) C2201v.m6592a(10, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9405a((C1710e<? super T>) new C5865cj<Object>(this));
    }

    /* renamed from: a */
    public final void mo8520a(C5861a aVar) {
        super.mo8520a(aVar);
        this.f15354j = ((Boolean) this.f15366s.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.GIFT_VOTE_MESSAGE.getIntType(), this);
        }
        this.f15347c = (Room) this.f15366s.get("data_room", null);
        m12754a(false);
    }

    /* renamed from: a */
    private void m12754a(boolean z) {
        String str;
        VoteApi voteApi = (VoteApi) C4514j.m10883j().mo10321b().mo9550a(VoteApi.class);
        String idStr = this.f15347c.getIdStr();
        if (this.f15346b == null) {
            str = "0";
        } else {
            str = String.valueOf(this.f15346b.f15089a);
        }
        ((C4002ac) voteApi.listVote(idStr, str).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5862cg(this, z), C4064k.m10187b());
    }

    /* renamed from: a */
    private void m12753a(long j) {
        long j2 = this.f15346b.f15091c - (j / 1000);
        if (!this.f15354j) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
            C8049c.m15979a().mo14202a("livesdk_audiencepollicon_show", hashMap, Room.class, C8059j.class);
        }
        if (j2 >= 5) {
            this.f15350f = j2;
            this.f15351g = System.currentTimeMillis();
            ((C4002ac) C2201v.m6592a(500, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9405a((C1710e<? super T>) new C5863ch<Object>(this));
        } else if (j2 > 0) {
            this.f15350f = j2;
            mo11735a(2);
        } else {
            if (j2 + 10 > 0) {
                if (!this.f15354j) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("remaining_time", "0");
                    hashMap2.put("is_halt", "0");
                    hashMap2.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
                    C8049c.m15979a().mo14202a("livesdk_audienceendpoll_check", hashMap2, Room.class, C8059j.class);
                } else {
                    C8049c.m15979a().mo14203a("livesdk_anchorendpoll_check", Room.class, C8059j.class);
                }
                mo11735a(4);
            }
        }
    }

    /* renamed from: a */
    public final void mo11735a(int i) {
        this.f15345a = i;
        if (this.f15366s != null) {
            this.f15366s.lambda$put$1$DataCenter("data_vote_state", Integer.valueOf(i));
            switch (i) {
                case 0:
                    this.f15346b = null;
                    this.f15350f = 0;
                    this.f15348d = 0;
                    this.f15349e = 0;
                    if (this.f15352h != null && !this.f15352h.isDisposed()) {
                        this.f15352h.dispose();
                    }
                    if (this.f15353i != null && !this.f15353i.isDisposed()) {
                        this.f15353i.dispose();
                    }
                    ((C5861a) mo8518c()).mo11741a();
                    return;
                case 1:
                    m12755b();
                    return;
                case 2:
                    m12757d();
                    return;
                case 3:
                    m12758e();
                    return;
                case 4:
                    m12756b(10);
                    break;
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (mo8518c() != null && (iMessage instanceof C7812aq)) {
            C7812aq aqVar = (C7812aq) iMessage;
            if (mo8518c() != null && aqVar.f21510c != null && aqVar.f21510c.size() >= 2) {
                ((C5861a) mo8518c()).mo11745a((IMessage) aqVar);
                switch ((int) aqVar.f21508a) {
                    case 1:
                        if (this.f15345a == 0) {
                            this.f15346b = new C5733av();
                            this.f15346b.f15089a = aqVar.f21509b;
                            this.f15346b.f15091c = aqVar.f21511d;
                            this.f15346b.f15090b = aqVar.f21510c;
                            this.f15348d = ((C7813ar) this.f15346b.f15090b.get(0)).f21513b;
                            this.f15349e = ((C7813ar) this.f15346b.f15090b.get(1)).f21513b;
                            this.f15355k = true;
                            m12753a(aqVar.timestamp);
                            return;
                        } else if (this.f15345a == 4) {
                            mo11735a(0);
                            this.f15346b = new C5733av();
                            this.f15346b.f15089a = aqVar.f21509b;
                            this.f15346b.f15091c = aqVar.f21511d;
                            this.f15346b.f15090b = aqVar.f21510c;
                            this.f15348d = ((C7813ar) this.f15346b.f15090b.get(0)).f21513b;
                            this.f15349e = ((C7813ar) this.f15346b.f15090b.get(1)).f21513b;
                            this.f15355k = true;
                            m12753a(aqVar.timestamp);
                            return;
                        } else if (this.f15346b != null && aqVar.f21509b == this.f15346b.f15089a) {
                            this.f15348d = ((C7813ar) aqVar.f21510c.get(0)).f21513b;
                            this.f15349e = ((C7813ar) aqVar.f21510c.get(1)).f21513b;
                            return;
                        }
                    case 2:
                        if (!(this.f15345a == 0 || this.f15346b == null || this.f15346b.f15089a != aqVar.f21509b)) {
                            this.f15348d = (long) ((int) ((C7813ar) aqVar.f21510c.get(0)).f21513b);
                            this.f15349e = ((C7813ar) aqVar.f21510c.get(1)).f21513b;
                            if (this.f15352h != null && !this.f15352h.isDisposed()) {
                                this.f15352h.dispose();
                            }
                            if (!this.f15354j) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("remaining_time", String.valueOf(this.f15346b.f15091c - (aqVar.timestamp / 1000)));
                                hashMap.put("is_halt", "1");
                                hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
                                C8049c.m15979a().mo14202a("livesdk_audienceendpoll_check", hashMap, Room.class, C8059j.class);
                            }
                            mo11735a(4);
                            break;
                        }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11738a(boolean z, C4177d dVar) throws Exception {
        if (mo8518c() != null) {
            if (dVar == null || dVar.data == null || C9414h.m18630a(((C5734aw) dVar.data).f15092a)) {
                if (z && this.f15346b != null) {
                    mo11735a(4);
                }
                return;
            }
            this.f15346b = (C5733av) ((C5734aw) dVar.data).f15092a.get(0);
            if (!(this.f15346b == null || this.f15346b.f15090b == null || this.f15346b.f15090b.size() <= 1)) {
                List<C7813ar> list = this.f15346b.f15090b;
                this.f15348d = (long) ((int) ((C7813ar) list.get(0)).f21513b);
                this.f15349e = (long) ((int) ((C7813ar) list.get(1)).f21513b);
                if (z) {
                    mo11735a(4);
                } else {
                    this.f15355k = false;
                    m12753a(dVar.extra.now);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11739a(boolean z, Long l) throws Exception {
        this.f15350f--;
        if (this.f15350f <= 0) {
            if (this.f15352h != null && !this.f15352h.isDisposed()) {
                this.f15352h.dispose();
            }
            if (!this.f15354j) {
                HashMap hashMap = new HashMap();
                hashMap.put("remaining_time", "0");
                hashMap.put("is_halt", "0");
                hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
                C8049c.m15979a().mo14202a("livesdk_audienceendpoll_check", hashMap, Room.class, C8059j.class);
            } else {
                C8049c.m15979a().mo14203a("livesdk_anchorendpoll_check", Room.class, C8059j.class);
            }
            ((C5861a) mo8518c()).mo11747b(this.f15348d, this.f15349e);
            m12754a(true);
        } else if (this.f15350f > 9 || !z) {
            ((C5861a) mo8518c()).mo11746b(this.f15350f);
            ((C5861a) mo8518c()).mo11743a(this.f15348d, this.f15349e);
        } else {
            if (this.f15345a != 3) {
                mo11735a(3);
            }
            ((C5861a) mo8518c()).mo11743a(this.f15348d, this.f15349e);
        }
    }
}
