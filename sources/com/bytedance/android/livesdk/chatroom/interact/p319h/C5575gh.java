package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4633e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4634f;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.interact.data.C5353a;
import com.bytedance.android.livesdk.chatroom.model.C5745d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5693c;
import com.bytedance.android.livesdk.chatroom.p306bl.C5006c;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7825ba;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdk.message.model.C7866cg;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.gh */
public final class C5575gh extends C5868cl<C5576a> implements C0199s<KVData>, OnMessageListener {

    /* renamed from: c */
    private static final int[][] f14643c = {new int[]{120, 10}, new int[]{300, 25}, new int[]{600, 50}, new int[]{900, 75}};

    /* renamed from: a */
    boolean f14644a;

    /* renamed from: b */
    C1690c f14645b;

    /* renamed from: d */
    private boolean f14646d;

    /* renamed from: e */
    private Room f14647e;

    /* renamed from: f */
    private int f14648f = Integer.MAX_VALUE;

    /* renamed from: g */
    private int f14649g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f14650h;

    /* renamed from: i */
    private LinkCrossRoomDataHolder f14651i;

    /* renamed from: j */
    private C1690c f14652j;

    /* renamed from: k */
    private C1690c f14653k;

    /* renamed from: l */
    private C1690c f14654l;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.gh$a */
    public interface C5576a extends C6463ay {
        /* renamed from: a */
        void mo11481a(int i);

        /* renamed from: a */
        void mo11482a(int i, int i2);

        /* renamed from: b */
        void mo11483b(int i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11477a(Throwable th) {
        mo11751c(th);
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        m12456h();
        this.f14651i.removeObserver(this);
    }

    /* renamed from: e */
    private boolean m12454e() {
        if (m12455g() >= this.f14651i.f12610E.f12646e - this.f14651i.f12610E.f12645d) {
            m12453d();
        }
        if (m12455g() >= this.f14651i.f12610E.f12646e - this.f14651i.f12610E.f12645d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private int m12455g() {
        int intValue = ((Integer) this.f14651i.get("data_pk_anchor_score", Integer.valueOf(0))).intValue();
        int intValue2 = ((Integer) this.f14651i.get("data_pk_guest_score", Integer.valueOf(0))).intValue();
        if (this.f14651i.f12610E.f12643b) {
            return (intValue - intValue2) - this.f14651i.f12610E.f12645d;
        }
        return (intValue2 - intValue) - this.f14651i.f12610E.f12645d;
    }

    /* renamed from: h */
    private void m12456h() {
        if (this.f14652j != null) {
            this.f14652j.dispose();
        }
        if (this.f14645b != null) {
            this.f14645b.dispose();
        }
        if (this.f14653k != null) {
            this.f14653k.dispose();
        }
        if (this.f14654l != null) {
            this.f14654l.dispose();
        }
    }

    /* renamed from: d */
    private void m12453d() {
        if (mo8518c() != null && !this.f14644a) {
            this.f14644a = true;
            if (this.f14653k != null) {
                this.f14653k.dispose();
                this.f14653k = null;
            }
            ((C4002ac) ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).finishMode(1, this.f14651i.f12612c).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5591gw(this), new C5579gk(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11478b() {
        if (mo8518c() != null) {
            if (this.f14650h <= 5) {
                if (this.f14654l != null) {
                    this.f14654l.dispose();
                    this.f14654l = null;
                }
                this.f14654l = ((C4002ac) C2201v.m6592a(1, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5580gl(this), new C5581gm(this));
                this.f14650h++;
                return;
            }
            this.f14644a = false;
            mo11473a((C5353a) null);
            if (this.f14654l != null) {
                this.f14654l.dispose();
            }
        }
    }

    public C5575gh(DataCenter dataCenter) {
        this.f14646d = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
        this.f14647e = (Room) dataCenter.get("data_room");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11475a(Long l) throws Exception {
        this.f14644a = false;
        m12453d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11479b(Long l) throws Exception {
        if (mo8518c() != null) {
            ((C5576a) mo8518c()).mo11483b(l.intValue());
            if (l.longValue() <= 0) {
                m12453d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo11480c(Long l) throws Exception {
        if (mo8518c() != null) {
            ((C5576a) mo8518c()).mo11481a(l.intValue());
            if (l.longValue() <= 0) {
                m12452c(this.f14651i.f12610E.f12642a);
                this.f14652j.dispose();
                this.f14652j = null;
            }
        }
    }

    /* renamed from: a */
    private boolean m12450a(int i) {
        if (((C4632d) this.f14651i.get("data_pk_state")) != C4632d.PK || i <= this.f14651i.f12610E.f12644c + 5 + 5) {
            return false;
        }
        ((C4002ac) ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).startMode(1, this.f14651i.f12612c).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(C5582gn.f14660a, new C5583go(this));
        return true;
    }

    /* renamed from: a */
    private void m12449a(long j) {
        if (mo8518c() != null) {
            if (this.f15367t != null) {
                this.f15367t.removeMessageListener(C8629a.LINK_MIC.getIntType(), this);
            }
            this.f14648f += this.f14649g + this.f14651i.f12610E.f12644c + 5;
            if (this.f14648f + this.f14651i.f12610E.f12644c + 5 >= this.f14651i.f12619j || this.f14651i.f12610E.f12648g >= 3) {
                this.f14648f = Integer.MAX_VALUE;
            }
            this.f14651i.f12610E.f12649h = false;
            this.f14651i.lambda$put$1$DataCenter("data_pk_battle_mode", Integer.valueOf(1));
            m12451b(j);
            if (this.f14646d) {
                C8049c.m15979a().mo14203a("start_backdoor", new C8059j().mo14213a("live_detail").mo14214b("live_function"), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            }
        }
    }

    /* renamed from: b */
    private void m12451b(long j) {
        if (mo8518c() != null) {
            long j2 = this.f14651i.f12610E.f12642a - j;
            int i = ((int) j2) / 1000;
            int i2 = (int) (j2 % 1000);
            this.f14651i.lambda$put$1$DataCenter("data_pk_steal_tower_state", C4633e.READY);
            int i3 = i + 1;
            ((C5576a) mo8518c()).mo11481a(i3);
            ((C5576a) mo8518c()).mo11482a(1, 1);
            if (j2 <= 0) {
                if (this.f14652j != null) {
                    this.f14652j.dispose();
                    this.f14652j = null;
                }
                if (this.f14645b != null) {
                    this.f14645b.dispose();
                    this.f14645b = null;
                }
                m12452c(j);
                return;
            }
            if (this.f14652j != null) {
                this.f14652j.dispose();
                this.f14652j = null;
            }
            if (this.f14645b != null) {
                this.f14645b.dispose();
                this.f14645b = null;
            }
            this.f14652j = ((C4002ac) C4585b.m11017a(0, 1, TimeUnit.SECONDS).mo6527b((long) i3).mo6539d((long) i2, TimeUnit.MILLISECONDS).mo6541d((C1711f<? super T, ? extends R>) new C5577gi<Object,Object>(i)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5578gj(this), new C5584gp(this));
            int i4 = ((i * 1000) / 50) + 1;
            this.f14645b = C4585b.m11017a(0, 50, TimeUnit.MILLISECONDS).mo6527b((long) i4).mo6513a((C1673aa<? super T, ? extends R>) ((C5576a) mo8518c()).getAutoUnbindTransformer()).mo6541d((C1711f<? super T, ? extends R>) new C5585gq<Object,Object>(i4)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5586gr<Object>(this), (C1710e<? super Throwable>) new C5587gs<Object>(this));
        }
    }

    /* renamed from: c */
    private void m12452c(long j) {
        if (mo8518c() != null) {
            long j2 = (this.f14651i.f12610E.f12642a - j) + ((long) (this.f14651i.f12610E.f12644c * 1000));
            int i = ((int) j2) / 1000;
            int i2 = (int) (j2 % 1000);
            this.f14651i.lambda$put$1$DataCenter("data_pk_steal_tower_state", C4633e.IN_PROCESS);
            int i3 = i + 1;
            ((C5576a) mo8518c()).mo11483b(i3);
            if (!m12454e()) {
                this.f14651i.observeForever("data_pk_anchor_score", this, true).observeForever("data_pk_guest_score", this, true);
                if (j2 < 0) {
                    if (this.f14653k != null) {
                        this.f14653k.dispose();
                        this.f14653k = null;
                    }
                    m12453d();
                    return;
                }
                if (this.f14653k != null) {
                    this.f14653k.dispose();
                    this.f14653k = null;
                }
                this.f14653k = ((C4002ac) C4585b.m11017a(0, 1, TimeUnit.SECONDS).mo6527b((long) i3).mo6539d((long) i2, TimeUnit.MILLISECONDS).mo6541d((C1711f<? super T, ? extends R>) new C5588gt<Object,Object>(i)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5589gu(this), new C5590gv(this));
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        boolean z = true;
        if (iMessage instanceof C5693c) {
            C5693c cVar = (C5693c) iMessage;
            if (cVar.f14935a == 1 && cVar.f14936b != null) {
                C4634f fVar = this.f14651i.f12610E;
                if (this.f14647e.getOwner().getId() != cVar.f14936b.f14943f) {
                    z = false;
                }
                fVar.f12643b = z;
                this.f14651i.f12610E.f12646e = cVar.f14936b.f14942e;
                this.f14651i.f12610E.f12645d = cVar.f14936b.f14941d;
                this.f14651i.f12610E.f12648g = cVar.f14936b.f14947j;
                this.f14651i.f12610E.f12644c = cVar.f14936b.f14940c;
                this.f14651i.f12610E.f12642a = cVar.f14936b.f14938a;
                m12449a(cVar.timestamp);
            }
        } else if (iMessage instanceof C7825ba) {
            C7825ba baVar = (C7825ba) iMessage;
            if (!(baVar.f21540b == null || baVar.f21540b.f23812a != 1 || baVar.f21540b.f23813b == null)) {
                this.f14648f = baVar.f21540b.f23813b.f23822i;
            }
        } else {
            if ((iMessage instanceof C7829bd) && ((C7829bd) iMessage).f21563a == 202) {
                m12450a(((Integer) this.f14651i.get("data_pk_time_left")).intValue());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11473a(C5353a aVar) {
        boolean z;
        this.f14651i.lambda$put$1$DataCenter("data_pk_steal_tower_state", C4633e.ENDED).removeObserver("data_pk_anchor_score", this).removeObserver("data_pk_guest_score", this);
        m12456h();
        if (mo8518c() == null || aVar == null || aVar.f14259a == null || aVar.f14259a.f23813b == null || aVar.f14260b == null) {
            this.f14651i.f12610E.f12647f = false;
            this.f14651i.f12610E.f12649h = true;
            this.f14651i.lambda$put$1$DataCenter("data_pk_battle_mode", Integer.valueOf(0));
            return;
        }
        C4634f fVar = this.f14651i.f12610E;
        if (aVar.f14259a.f23813b.f23821h != 0) {
            z = true;
        } else {
            z = false;
        }
        fVar.f12647f = z;
        this.f14651i.lambda$put$1$DataCenter("data_pk_steal_tower_score", Integer.valueOf(m12455g())).lambda$put$1$DataCenter("data_pk_battle_mode", Integer.valueOf(0));
        if (this.f14651i.f12610E.f12647f) {
            this.f14651i.lambda$put$1$DataCenter("cmd_pk_finish", new C5745d());
        }
        if (this.f14646d && this.f14651i.f12610E.f12647f) {
            C8049c.m15979a().mo14203a("backdoor_success", new C8059j().mo14213a("live_detail").mo14214b("live_function"), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            switch (key.hashCode()) {
                case -1692693464:
                    if (key.equals("data_pk_current_room_interact_info")) {
                        c = 0;
                        break;
                    }
                    break;
                case -717118025:
                    if (key.equals("data_pk_anchor_score")) {
                        c = 1;
                        break;
                    }
                    break;
                case -471511460:
                    if (key.equals("data_pk_guest_score")) {
                        c = 2;
                        break;
                    }
                    break;
                case 208701290:
                    if (key.equals("data_pk_time_left")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C4177d dVar = (C4177d) kVData.getData();
                    C8722v vVar = (C8722v) dVar.data;
                    if (vVar.f23959e != null && vVar.f23959e.f23812a == 1 && vVar.f23959e.f23813b != null && vVar.f23959e.f23813b.f23814a > 0 && !vVar.f23959e.f23813b.f23820g) {
                        m12449a(dVar.extra.now);
                    }
                    return;
                case 1:
                    if (mo8518c() != null) {
                        this.f14651i.lambda$put$1$DataCenter("data_pk_steal_tower_score", Integer.valueOf(m12455g()));
                        m12454e();
                    }
                    return;
                case 2:
                    if (mo8518c() != null) {
                        this.f14651i.lambda$put$1$DataCenter("data_pk_steal_tower_score", Integer.valueOf(m12455g()));
                        m12454e();
                    }
                    return;
                case 3:
                    if (this.f14651i.f12619j - ((Integer) kVData.getData()).intValue() == this.f14648f && m12450a(((Integer) kVData.getData()).intValue()) && this.f15367t != null) {
                        this.f15367t.addMessageListener(C8629a.LINK_MIC.getIntType(), this);
                        return;
                    }
                case 4:
                    if (kVData.getData().equals(C4632d.PENAL) && this.f15367t != null) {
                        this.f15367t.removeMessageListener(C8629a.LINK_MIC.getIntType(), this);
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5576a aVar) {
        int[][] iArr;
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.BATTLE_MODE.getIntType(), this);
        }
        this.f14651i = LinkCrossRoomDataHolder.m11103a();
        this.f14651i.lambda$put$1$DataCenter("data_pk_steal_tower_state", C4633e.DISABLED);
        if (this.f14651i != LinkCrossRoomDataHolder.f12605a) {
            this.f14651i.observeForever("data_pk_current_room_interact_info", this).observeForever("data_pk_state", this);
        }
        if (this.f14646d) {
            this.f14651i.observeForever("data_pk_time_left", this);
        }
        for (int[] iArr2 : f14643c) {
            if (iArr2[0] == this.f14651i.f12619j) {
                this.f14649g = iArr2[1];
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo11476a(String str) {
        String str2;
        long id = this.f14647e.getId();
        String str3 = "";
        String str4 = "#FF8533";
        if (this.f14646d) {
            str2 = "cmd_pk_mvp_show_list";
        } else {
            str2 = "5";
        }
        C7866cg a = C5006c.m11495a(id, null, str3, 3, str, str4, str2, "");
        a.f21778l = R.drawable.bxo;
        if (this.f15367t != null) {
            this.f15367t.insertMessage(a, true);
        }
    }
}
