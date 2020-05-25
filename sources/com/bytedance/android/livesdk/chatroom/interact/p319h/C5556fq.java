package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.arch.lifecycle.C0199s;
import android.os.SystemClock;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import com.bytedance.android.livesdk.chatroom.interact.C5279am;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8697c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fq */
public final class C5556fq extends C5868cl<C5557a> implements C0199s<KVData>, OnMessageListener {

    /* renamed from: a */
    Room f14612a = ((Room) this.f14616e.get("data_room"));

    /* renamed from: b */
    boolean f14613b = ((Boolean) this.f14616e.get("data_is_anchor")).booleanValue();

    /* renamed from: c */
    LinkCrossRoomDataHolder f14614c = LinkCrossRoomDataHolder.m11103a();

    /* renamed from: d */
    boolean f14615d;

    /* renamed from: e */
    private DataCenter f14616e;

    /* renamed from: f */
    private boolean f14617f;

    /* renamed from: g */
    private C1690c f14618g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fq$a */
    public interface C5557a extends C6463ay {
        /* renamed from: a */
        void mo11468a();

        /* renamed from: a */
        void mo11469a(String str);

        /* renamed from: a */
        void mo11470a(boolean z);

        /* renamed from: c */
        void mo11471c();

        /* renamed from: d */
        void mo11472d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11465b(Throwable th) {
        mo11751c(th);
    }

    /* renamed from: a */
    public final void mo11461a(boolean z) {
        if (mo8518c() != null) {
            C8056g c = new C8056g().mo14212c("initiative");
            if (this.f14612a.getId() == this.f14614c.f12612c) {
                c.mo14209b(this.f14612a.getOwner().getId());
                c.mo14211c(this.f14614c.f12614e);
            } else {
                c.mo14209b(this.f14614c.f12614e);
                c.mo14211c(this.f14612a.getOwner().getId());
            }
            if (this.f14613b && this.f14614c.get("data_pk_state") == C4632d.PK) {
                if (LinkCrossRoomDataHolder.m11103a().f12619j > 0 && LinkCrossRoomDataHolder.m11103a().f12627r == 0) {
                    c.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                }
                C8049c a = C8049c.m15979a();
                String str = "livesdk_pk_end";
                Object[] objArr = new Object[3];
                objArr[0] = c.mo14212c(z ? "disconnect" : "time_out").mo14208a(z ? String.valueOf((System.currentTimeMillis() - this.f14614c.f12633x) / 1000) : "120");
                objArr[1] = this.f14614c.mo10411b();
                objArr[2] = Room.class;
                a.mo14203a(str, objArr);
            }
            ((C4002ac) ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).finish(this.f14614c.f12612c, this.f14614c.f12627r, z ? 1 : 0, this.f14614c.f12628s).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5574gg(this, SystemClock.uptimeMillis(), z), new C5560ft(this, z));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11462a(boolean z, Throwable th) throws Exception {
        mo11751c(th);
        C5278al.m11940b(th);
        if (!z) {
            m12426b(true);
        }
    }

    /* renamed from: g */
    private void m12427g() {
        if (this.f14618g != null) {
            this.f14618g.dispose();
            this.f14618g = null;
        }
        if (this.f14613b) {
            mo11461a(false);
        } else {
            m12426b(true);
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        if (this.f15367t != null) {
            this.f15367t.removeMessageListener(this);
        }
        if (this.f14618g != null) {
            this.f14618g.dispose();
            this.f14618g = null;
        }
        this.f14614c.removeObserver(this);
        super.mo8247a();
    }

    /* renamed from: d */
    public final void mo11466d() {
        if (mo8518c() != null) {
            ((C4002ac) ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).battleReject(this.f14614c.f12612c).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5570gc(this), new C5571gd(this));
        }
    }

    /* renamed from: e */
    public final void mo11467e() {
        if (mo8518c() != null) {
            ((C4002ac) ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).openBattle(this.f14614c.f12612c, this.f14614c.f12619j, this.f14614c.f12627r, this.f14614c.f12620k).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5572ge(this, SystemClock.uptimeMillis()), new C5573gf(this));
        }
    }

    /* renamed from: b */
    public final void mo11463b() {
        if (mo8518c() != null) {
            C4632d dVar = (C4632d) LinkCrossRoomDataHolder.m11103a().get("data_pk_state");
            if (!this.f14615d && dVar == C4632d.PENAL) {
                this.f14614c.f12631v = true;
                this.f14614c.f12627r = 0;
                this.f14615d = true;
                this.f14617f = true;
                ((C4002ac) ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).battleInvite(this.f14614c.f12612c).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5568ga(this), new C5569gb(this));
            }
        }
    }

    public C5556fq(DataCenter dataCenter) {
        this.f14616e = dataCenter;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -227699054 && key.equals("cmd_pk_finish")) {
                c = 0;
            }
            if (c == 0) {
                m12427g();
            }
        }
    }

    /* renamed from: b */
    private void m12426b(boolean z) {
        if (mo8518c() != null) {
            ((C4002ac) ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).battleStats(this.f14614c.f12612c, this.f14612a.getOwner().getId()).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5561fu(this, SystemClock.uptimeMillis(), z), new C5562fv(this, z));
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5557a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE.getIntType(), this);
        }
        this.f14614c.lambda$put$1$DataCenter("data_pk_anchor_score", Integer.valueOf(0)).lambda$put$1$DataCenter("data_pk_guest_score", Integer.valueOf(0)).observeForever("cmd_pk_finish", this);
        if (!this.f14613b || this.f14614c.f12618i) {
            if (!this.f14613b && this.f14614c.f12612c > 0 && this.f14614c.f12619j > 0) {
                this.f14614c.lambda$put$1$DataCenter("cmd_log_link", "Entered_Pk_Halfway");
                m12426b(false);
            }
            return;
        }
        mo11467e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11455a(long j) {
        C5279am.m11943a();
        if (this.f14614c.f12619j > 0 && this.f14614c.f12621l > 0 && mo8518c() != null) {
            this.f14614c.lambda$put$1$DataCenter("data_pk_state", C4632d.PK);
            this.f14614c.lambda$put$1$DataCenter("data_pk_result", C4631c.UNFINISHED);
            long j2 = (this.f14614c.f12621l - j) + ((long) (this.f14614c.f12619j * 1000));
            int i = (int) j2;
            int i2 = i / 1000;
            int i3 = i % 1000;
            StringBuilder sb = new StringBuilder("startTimeDown :");
            sb.append(j2);
            this.f14614c.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
            if (j2 < 0) {
                if (this.f14618g != null) {
                    this.f14618g.dispose();
                    this.f14618g = null;
                }
                if (((long) (this.f14614c.f12629t * 1000)) + j2 > 0) {
                    mo11464b(((long) (this.f14614c.f12629t * 1000)) + j2);
                } else {
                    this.f14614c.lambda$put$1$DataCenter("data_pk_state", C4632d.FINISHED);
                }
            } else {
                if (this.f14618g != null) {
                    this.f14618g.dispose();
                    this.f14618g = null;
                }
                ((C5557a) mo8518c()).mo11470a(this.f14613b);
                int i4 = i2 + 1;
                this.f14614c.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(i4));
                this.f14618g = C4585b.m11017a(0, 1, TimeUnit.SECONDS).mo6527b((long) i4).mo6539d((long) i3, TimeUnit.MILLISECONDS).mo6541d((C1711f<? super T, ? extends R>) new C5558fr<Object,Object>(i2)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5559fs<Object>(this), (C1710e<? super Throwable>) new C5566fz<Object>(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11458a(Long l) throws Exception {
        if (mo8518c() != null) {
            this.f14614c.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(l.intValue()));
            if (l.longValue() <= 0) {
                m12427g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11464b(long j) {
        if (mo8518c() != null) {
            this.f14614c.f12635z = System.currentTimeMillis();
            int intValue = ((Integer) this.f14614c.get("data_pk_anchor_score")).intValue();
            int intValue2 = ((Integer) this.f14614c.get("data_pk_guest_score")).intValue();
            if (intValue > intValue2) {
                this.f14614c.lambda$put$1$DataCenter("data_pk_result", C4631c.LEFT_WON);
            } else if (intValue < intValue2) {
                this.f14614c.lambda$put$1$DataCenter("data_pk_result", C4631c.RIGHT_WON);
            } else {
                this.f14614c.lambda$put$1$DataCenter("data_pk_result", C4631c.EVEN);
            }
            this.f14614c.lambda$put$1$DataCenter("data_pk_state", C4632d.PENAL);
            if (j <= 0) {
                this.f14614c.lambda$put$1$DataCenter("data_pk_state", C4632d.FINISHED);
            }
            int i = (int) (j / 1000);
            int i2 = (int) (j % 1000);
            if (this.f14618g != null) {
                this.f14618g.dispose();
                this.f14618g = null;
            }
            this.f14618g = C4585b.m11017a(0, 1, TimeUnit.SECONDS).mo6527b((long) (i + 1)).mo6539d((long) i2, TimeUnit.MILLISECONDS).mo6541d((C1711f<? super T, ? extends R>) new C5563fw<Object,Object>(i)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5564fx<Object>(this), (C1710e<? super Throwable>) new C5565fy<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11459a(Throwable th) {
        HashMap hashMap = new HashMap();
        C8056g gVar = new C8056g();
        if (th == null) {
            hashMap.put("invitee_status", "0");
        } else if (!(th instanceof C2949a)) {
            hashMap.put("invitee_status", "2");
        } else if (((C2949a) th).getErrorCode() == 31002) {
            hashMap.put("invitee_status", "1");
        } else {
            hashMap.put("invitee_status", "2");
        }
        C8049c.m15979a().mo14202a("connection_invite", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other").mo14213a("live_detail"), gVar.mo14209b(this.f14612a.getOwner().getId()).mo14211c(this.f14614c.f12614e).mo14210b((String) C4525b.f12352aU.mo10345a()).mo14205a(((Integer) C4525b.f12346aO.mo10345a()).intValue()).mo14206a(this.f14614c.f12616g), this.f14614c.mo10411b(), Room.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.p683ss.ugc.live.sdk.message.data.IMessage r13) {
        /*
            r12 = this;
            com.bytedance.ies.a.a r0 = r12.mo8518c()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r13 instanceof com.bytedance.android.livesdk.message.model.C7829bd
            r1 = 1
            if (r0 == 0) goto L_0x005d
            com.bytedance.android.livesdk.message.model.bd r13 = (com.bytedance.android.livesdk.message.model.C7829bd) r13
            long r2 = r13.f21572j
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r12.f14614c
            long r2 = r13.f21572j
            r0.f12612c = r2
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r12.f14616e
            java.lang.String r2 = "data_interact_debug_info"
            com.bytedance.android.livesdk.chatroom.event.t r3 = new com.bytedance.android.livesdk.chatroom.event.t
            java.lang.String r4 = ""
            r3.<init>(r1, r4)
            r0.lambda$put$1$DataCenter(r2, r3)
        L_0x002a:
            int r0 = r13.f21563a
            switch(r0) {
                case 202: goto L_0x0055;
                case 203: goto L_0x003a;
                case 204: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x005c
        L_0x0030:
            com.bytedance.ies.a.a r13 = r12.mo8518c()
            com.bytedance.android.livesdk.chatroom.interact.h.fq$a r13 = (com.bytedance.android.livesdk.chatroom.interact.p319h.C5556fq.C5557a) r13
            r13.mo11471c()
            goto L_0x005c
        L_0x003a:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r13 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            java.lang.String r0 = "data_pk_state"
            java.lang.Object r13 = r13.get(r0)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r13 = (com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d) r13
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d.PENAL
            if (r13 != r0) goto L_0x005c
            com.bytedance.ies.a.a r13 = r12.mo8518c()
            com.bytedance.android.livesdk.chatroom.interact.h.fq$a r13 = (com.bytedance.android.livesdk.chatroom.interact.p319h.C5556fq.C5557a) r13
            r13.mo11468a()
            goto L_0x0294
        L_0x0055:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.c> r13 = r13.f21581s
            r12.mo11460a(r13)
            goto L_0x0294
        L_0x005c:
            return
        L_0x005d:
            boolean r0 = r13 instanceof com.bytedance.android.livesdk.message.model.C7825ba
            if (r0 == 0) goto L_0x0294
            com.bytedance.android.livesdk.message.model.ba r13 = (com.bytedance.android.livesdk.message.model.C7825ba) r13
            com.bytedance.ies.a.a r0 = r12.mo8518c()
            if (r0 == 0) goto L_0x0294
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            java.lang.String r2 = "data_pk_state"
            java.lang.Object r0 = r0.get(r2)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r0 = (com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d) r0
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            com.bytedance.android.livesdkapi.depend.model.live.e r3 = r13.f21539a
            long r3 = r3.f23832d
            r2.f12621l = r3
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            com.bytedance.android.livesdkapi.depend.model.live.e r3 = r13.f21539a
            int r3 = r3.f23830b
            r2.f12619j = r3
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            com.bytedance.android.livesdkapi.depend.model.live.e r3 = r13.f21539a
            java.lang.String r3 = r3.f23831c
            r2.f12620k = r3
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            com.bytedance.android.livesdkapi.depend.model.live.e r3 = r13.f21539a
            long r3 = r3.f23833e
            r2.f12613d = r3
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            com.bytedance.android.livesdkapi.depend.model.live.e r3 = r13.f21539a
            long r3 = r3.f23834f
            int r3 = (int) r3
            r2.f12627r = r3
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            java.lang.String r3 = "cmd_log_link"
            java.lang.String r4 = "another game"
            r2.lambda$put$1$DataCenter(r3, r4)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            java.lang.String r3 = "data_pk_anchor_score"
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.lambda$put$1$DataCenter(r3, r5)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            java.lang.String r3 = "data_pk_guest_score"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.lambda$put$1$DataCenter(r3, r5)
            boolean r2 = r12.f14613b
            if (r2 != 0) goto L_0x00c6
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r2 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d.PENAL
            if (r0 != r2) goto L_0x00d3
        L_0x00c6:
            com.bytedance.ies.a.a r2 = r12.mo8518c()
            com.bytedance.android.livesdk.chatroom.interact.h.fq$a r2 = (com.bytedance.android.livesdk.chatroom.interact.p319h.C5556fq.C5557a) r2
            com.bytedance.android.livesdkapi.depend.model.live.e r3 = r13.f21539a
            java.lang.String r3 = r3.f23831c
            r2.mo11469a(r3)
        L_0x00d3:
            boolean r2 = r12.f14613b
            if (r2 != 0) goto L_0x00e6
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r12.f14614c
            int r2 = r2.f12619j
            if (r2 == 0) goto L_0x00e6
            com.bytedance.ies.a.a r2 = r12.mo8518c()
            com.bytedance.android.livesdk.chatroom.interact.h.fq$a r2 = (com.bytedance.android.livesdk.chatroom.interact.p319h.C5556fq.C5557a) r2
            r2.mo11472d()
        L_0x00e6:
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r12.f14616e
            java.lang.String r3 = "cmd_pk_state_change"
            com.bytedance.android.livesdk.chatroom.event.s r5 = new com.bytedance.android.livesdk.chatroom.event.s
            r6 = 5
            r5.<init>(r6)
            r2.lambda$put$1$DataCenter(r3, r5)
            long r2 = r13.timestamp
            r12.mo11455a(r2)
            boolean r13 = r12.f14613b
            r2 = 4
            r3 = 3
            r5 = 2
            if (r13 == 0) goto L_0x0175
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.String r6 = "is_oncemore"
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r7 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d.PENAL
            if (r0 != r7) goto L_0x010d
            java.lang.String r7 = "oncemore"
            goto L_0x010f
        L_0x010d:
            java.lang.String r7 = "not_oncemore"
        L_0x010f:
            r13.put(r6, r7)
            com.bytedance.android.livesdk.o.c r6 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r7 = "pk_start"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.bytedance.android.livesdk.o.c.j r9 = new com.bytedance.android.livesdk.o.c.j
            r9.<init>()
            java.lang.String r10 = "live_take"
            com.bytedance.android.livesdk.o.c.j r9 = r9.mo14214b(r10)
            java.lang.String r10 = "live_detail"
            com.bytedance.android.livesdk.o.c.j r9 = r9.mo14213a(r10)
            r8[r4] = r9
            com.bytedance.android.livesdk.o.c.g r9 = new com.bytedance.android.livesdk.o.c.g
            r9.<init>()
            boolean r10 = r12.f14617f
            if (r10 == 0) goto L_0x0141
            com.bytedance.android.livesdkapi.depend.model.live.Room r10 = r12.f14612a
            com.bytedance.android.live.base.model.user.User r10 = r10.getOwner()
            long r10 = r10.getId()
            goto L_0x0145
        L_0x0141:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r10 = r12.f14614c
            long r10 = r10.f12614e
        L_0x0145:
            com.bytedance.android.livesdk.o.c.g r9 = r9.mo14211c(r10)
            boolean r10 = r12.f14617f
            if (r10 == 0) goto L_0x0152
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r10 = r12.f14614c
            long r10 = r10.f12614e
            goto L_0x015c
        L_0x0152:
            com.bytedance.android.livesdkapi.depend.model.live.Room r10 = r12.f14612a
            com.bytedance.android.live.base.model.user.User r10 = r10.getOwner()
            long r10 = r10.getId()
        L_0x015c:
            com.bytedance.android.livesdk.o.c.g r9 = r9.mo14209b(r10)
            r8[r1] = r9
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r9 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            com.bytedance.android.livesdk.o.c.f r9 = r9.mo10411b()
            r8[r5] = r9
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r9 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r8[r3] = r9
            r6.mo14202a(r7, r13, r8)
            r12.f14617f = r4
        L_0x0175:
            boolean r13 = r12.f14613b
            if (r13 != 0) goto L_0x01bd
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r13 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d.PENAL
            if (r0 != r13) goto L_0x01bd
            com.bytedance.android.livesdk.o.c.g r13 = new com.bytedance.android.livesdk.o.c.g
            r13.<init>()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r6 = r12.f14614c
            int r6 = r6.f12627r
            if (r6 != 0) goto L_0x018f
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r6 = r12.f14614c
            long r6 = r6.f12616g
            r13.mo14206a(r6)
        L_0x018f:
            com.bytedance.android.livesdk.o.c r6 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r7 = "pk_transform"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.bytedance.android.livesdk.o.c.j r9 = new com.bytedance.android.livesdk.o.c.j
            r9.<init>()
            java.lang.String r10 = "live_function"
            com.bytedance.android.livesdk.o.c.j r9 = r9.mo14214b(r10)
            java.lang.String r10 = "live_detail"
            com.bytedance.android.livesdk.o.c.j r9 = r9.mo14213a(r10)
            r8[r4] = r9
            r8[r1] = r13
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r13 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            com.bytedance.android.livesdk.o.c.f r13 = r13.mo10411b()
            r8[r5] = r13
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r13 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r8[r3] = r13
            r6.mo14203a(r7, r8)
        L_0x01bd:
            boolean r13 = r12.f14613b
            if (r13 == 0) goto L_0x0294
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r13 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d.PENAL
            if (r0 != r13) goto L_0x0294
            com.bytedance.android.livesdk.o.c.g r13 = new com.bytedance.android.livesdk.o.c.g
            r13.<init>()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r12.f14614c
            int r0 = r0.f12627r
            if (r0 != 0) goto L_0x01d7
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r12.f14614c
            long r6 = r0.f12616g
            r13.mo14206a(r6)
        L_0x01d7:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r12.f14614c
            r0.f12631v = r1
            com.bytedance.android.livesdk.o.c r0 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r6 = "connection_success"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.bytedance.android.livesdk.o.c.j r7 = new com.bytedance.android.livesdk.o.c.j
            r7.<init>()
            java.lang.String r8 = "live_detail"
            com.bytedance.android.livesdk.o.c.j r7 = r7.mo14213a(r8)
            java.lang.String r8 = "other"
            com.bytedance.android.livesdk.o.c.j r7 = r7.mo14218f(r8)
            java.lang.String r8 = "live"
            com.bytedance.android.livesdk.o.c.j r7 = r7.mo14214b(r8)
            r2[r4] = r7
            boolean r7 = r12.f14617f
            if (r7 == 0) goto L_0x020b
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r12.f14612a
            com.bytedance.android.live.base.model.user.User r7 = r7.getOwner()
            long r7 = r7.getId()
            goto L_0x020f
        L_0x020b:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r7 = r12.f14614c
            long r7 = r7.f12614e
        L_0x020f:
            com.bytedance.android.livesdk.o.c.g r7 = r13.mo14211c(r7)
            r2[r1] = r7
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r7 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            com.bytedance.android.livesdk.o.c.f r7 = r7.mo10411b()
            r2[r5] = r7
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r7 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r2[r3] = r7
            r0.mo14203a(r6, r2)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r12.f14612a
            long r6 = r0.getId()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r12.f14614c
            long r8 = r0.f12612c
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0249
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r12.f14612a
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            long r6 = r0.getId()
            r13.mo14209b(r6)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r12.f14614c
            long r6 = r0.f12614e
            r13.mo14211c(r6)
            goto L_0x025d
        L_0x0249:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r12.f14614c
            long r6 = r0.f12614e
            r13.mo14209b(r6)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r12.f14612a
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            long r6 = r0.getId()
            r13.mo14211c(r6)
        L_0x025d:
            com.bytedance.android.livesdk.o.c r0 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r2 = "punish_end"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = "disconnect"
            com.bytedance.android.livesdk.o.c.g r13 = r13.mo14212c(r6)
            long r6 = java.lang.System.currentTimeMillis()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r8 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            long r8 = r8.f12635z
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.bytedance.android.livesdk.o.c.g r13 = r13.mo14208a(r6)
            r3[r4] = r13
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r13 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            com.bytedance.android.livesdk.o.c.f r13 = r13.mo10411b()
            r3[r1] = r13
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r13 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r3[r5] = r13
            r0.mo14203a(r2, r3)
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p319h.C5556fq.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T extends C8697c> void mo11460a(List<T> list) {
        if (list != null && mo8518c() != null) {
            int i = 0;
            int i2 = 0;
            for (T t : list) {
                if (t.f23824a == this.f14612a.getOwner().getId()) {
                    i = t.f23825b;
                } else if (t.f23824a == this.f14614c.f12614e) {
                    i2 = t.f23825b;
                }
            }
            if (!((Integer) this.f14614c.get("data_pk_anchor_score", Integer.valueOf(0))).equals(Integer.valueOf(i))) {
                this.f14614c.lambda$put$1$DataCenter("data_pk_anchor_score", Integer.valueOf(i));
            }
            if (!((Integer) this.f14614c.get("data_pk_guest_score", Integer.valueOf(0))).equals(Integer.valueOf(i2))) {
                this.f14614c.lambda$put$1$DataCenter("data_pk_guest_score", Integer.valueOf(i2));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11456a(long j, boolean z, C4177d dVar) throws Exception {
        C5278al.m11939b(SystemClock.uptimeMillis() - j);
        if (!z) {
            m12426b(true);
        } else {
            this.f14614c.lambda$put$1$DataCenter("data_pk_result", C4631c.RIGHT_WON).lambda$put$1$DataCenter("cmd_stop_interact", Boolean.valueOf(false));
        }
    }
}
