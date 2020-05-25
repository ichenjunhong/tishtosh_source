package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.LuckyBoxApi;
import com.bytedance.android.livesdk.chatroom.event.C5163ai;
import com.bytedance.android.livesdk.chatroom.model.C5770y;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p279af.p280a.C4551a;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8325b.C8327b;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bf */
public final class C5821bf extends C5868cl<C5824b> implements OnMessageListener {

    /* renamed from: f */
    private static final C5823a f15273f = new C5823a() {
        /* renamed from: a */
        public final void mo11710a(C8686a aVar) {
        }

        /* renamed from: a */
        public final void mo11711a(Throwable th) {
        }
    };

    /* renamed from: a */
    public Room f15274a;

    /* renamed from: b */
    boolean f15275b;

    /* renamed from: c */
    String f15276c;

    /* renamed from: d */
    public boolean f15277d;

    /* renamed from: e */
    public C5823a f15278e;

    /* renamed from: g */
    private final int f15279g = ((Integer) C6718b.f18305B.mo9431a()).intValue();

    /* renamed from: h */
    private Map<Long, C5825c> f15280h = new HashMap();

    /* renamed from: i */
    private List<C7833bh> f15281i = new ArrayList();

    /* renamed from: j */
    private List<C7833bh> f15282j = new ArrayList();

    /* renamed from: k */
    private boolean f15283k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bf$a */
    public interface C5823a {
        /* renamed from: a */
        void mo11710a(C8686a aVar);

        /* renamed from: a */
        void mo11711a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bf$b */
    public interface C5824b extends C6463ay {
        /* renamed from: a */
        void mo11712a();

        /* renamed from: a */
        void mo11713a(C5825c cVar);

        /* renamed from: a */
        void mo11714a(C7833bh bhVar);

        /* renamed from: c */
        void mo11715c();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bf$c */
    public static class C5825c {

        /* renamed from: a */
        public C7833bh f15284a;

        /* renamed from: b */
        public C2201v<Integer> f15285b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h_ */
    public final String mo11708h_() {
        return "MagicBoxPresenter";
    }

    /* renamed from: b */
    public final int mo11703b() {
        return this.f15282j.size() + this.f15281i.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C5823a mo11707e() {
        if (this.f15278e == null) {
            return f15273f;
        }
        return this.f15278e;
    }

    /* renamed from: a */
    public final void mo8247a() {
        this.f15280h.clear();
        this.f15281i.clear();
        this.f15282j.clear();
        this.f15278e = null;
        this.f15277d = false;
        this.f15283k = false;
        super.mo8247a();
    }

    /* renamed from: d */
    public final C5825c mo11706d() {
        if (this.f15281i.size() > 0) {
            return (C5825c) this.f15280h.get(Long.valueOf(((C7833bh) this.f15281i.get(0)).f21607b));
        }
        if (this.f15282j.size() > 0) {
            return (C5825c) this.f15280h.get(Long.valueOf(((C7833bh) this.f15282j.get(0)).f21607b));
        }
        return null;
    }

    /* renamed from: a */
    public static long m12695a(C7833bh bhVar) {
        return (bhVar.f21608c + ((long) (bhVar.f21609d * 1000))) - C4551a.m10939a();
    }

    /* renamed from: b */
    public final int mo11704b(long j) {
        if (this.f15280h.containsKey(Long.valueOf(j))) {
            return mo11703b() - 1;
        }
        return mo11703b();
    }

    /* renamed from: c */
    private void m12696c(C7833bh bhVar) {
        ((C4002ac) C2201v.m6592a((long) this.f15279g, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5828bi(this, bhVar), new C5829bj(this));
    }

    /* renamed from: a */
    public final C2201v<C4177d<C5770y>> mo11699a(C5825c cVar) {
        return ((C4585b) ((LuckyBoxApi) C4514j.m10883j().mo10321b().mo9550a(LuckyBoxApi.class)).fetchRushedList(cVar.f15284a.f21607b, this.f15274a.getId(), cVar.f15284a.f21610e).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10389a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11705b(C7833bh bhVar) {
        this.f15280h.remove(Long.valueOf(bhVar.f21607b));
        this.f15282j.remove(bhVar);
        this.f15281i.remove(bhVar);
        ((C5824b) mo8518c()).mo11715c();
    }

    public final void onEvent(C5163ai aiVar) {
        switch (aiVar.f13842a) {
            case 0:
                ((C5824b) mo8518c()).mo11712a();
                return;
            case 1:
                C7833bh bhVar = (C7833bh) aiVar.f13843b;
                C5825c cVar = (C5825c) this.f15280h.get(Long.valueOf(bhVar.f21607b));
                if (cVar == null) {
                    C5825c cVar2 = new C5825c();
                    cVar2.f15284a = bhVar;
                    ((C5824b) mo8518c()).mo11713a(cVar2);
                    break;
                } else {
                    ((C5824b) mo8518c()).mo11713a(cVar);
                    return;
                }
        }
    }

    /* renamed from: a */
    public final void mo11700a(long j) {
        if (!this.f15277d) {
            this.f15277d = true;
            ((C4002ac) TTLiveSDKContext.getHostService().mo10315h().mo14517a(((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8326a) C8334f.m16517a().mo14503a(j)).mo14504a(this.f15274a.getRequestId())).mo14507b("live_detail")).mo14508c("")).mo14506b(0)).mo14509d(CustomActionPushReceiver.f104061f)).mo14510c()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5834bo(this), new C5835bp(this));
            if (C4600j.m11040b(this.f15366s) && j == this.f15274a.author().getId()) {
                C4116c.m10249a(C8612a.class);
                C4600j.m11041c(this.f15366s);
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        C7833bh bhVar = (C7833bh) iMessage;
        if (!bhVar.f21627v && this.f15280h.get(Long.valueOf(bhVar.f21607b)) == null) {
            if (bhVar.f21614i && !bhVar.f21628w) {
                ((C5824b) mo8518c()).mo11714a(bhVar);
            }
            C5825c cVar = new C5825c();
            cVar.f15284a = bhVar;
            if (bhVar.f21609d <= 0 || m12695a(bhVar) <= 0) {
                if (bhVar.f21613h > 0) {
                    this.f15281i.add(0, bhVar);
                } else {
                    this.f15281i.add(bhVar);
                }
                m12696c(bhVar);
            } else {
                if (bhVar.f21613h > 0) {
                    this.f15282j.add(0, bhVar);
                } else {
                    boolean z = true;
                    int size = this.f15282j.size() - 1;
                    while (true) {
                        if (size < 0) {
                            z = false;
                            break;
                        }
                        if (m12695a(bhVar) >= m12695a((C7833bh) this.f15282j.get(size))) {
                            this.f15282j.add(size + 1, bhVar);
                            break;
                        }
                        size--;
                    }
                    if (!z) {
                        this.f15282j.add(0, bhVar);
                    }
                }
                long a = m12695a(bhVar);
                int i = (int) (a / 1000);
                cVar.f15285b = ((C4585b) C4585b.m11017a(0, 1, TimeUnit.SECONDS).mo6539d(a % 1000, TimeUnit.MILLISECONDS).mo6527b((long) (i + 1)).mo6541d((C1711f<? super T, ? extends R>) new C5827bh<Object,Object>(i)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10389a();
                ((C4002ac) cVar.f15285b.mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5832bm(this, bhVar, cVar), new C5833bn(this));
            }
            this.f15280h.put(Long.valueOf(bhVar.f21607b), cVar);
            ((C5824b) mo8518c()).mo11715c();
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5824b bVar) {
        super.mo8520a(bVar);
        this.f15274a = (Room) this.f15366s.get("data_room");
        this.f15275b = ((Boolean) this.f15366s.get("data_is_anchor")).booleanValue();
        this.f15276c = (String) this.f15366s.get("data_enter_source");
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LUCKY_BOX.getIntType(), this);
        }
        ((C4002ac) C4495a.m10823a().mo10300a(C5163ai.class).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9405a((C1710e<? super T>) new C5826bg<Object>(this));
        if (!this.f15275b) {
            ((C4002ac) ((LuckyBoxApi) C4514j.m10883j().mo10321b().mo9550a(LuckyBoxApi.class)).fetchCurrentList(this.f15274a.getId()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5830bk(this), new C5831bl(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11702a(C7833bh bhVar, C5825c cVar, Integer num) throws Exception {
        if (num.intValue() == 0) {
            bhVar.f21627v = true;
            cVar.f15285b = null;
            if (bhVar.baseMessage == null) {
                long id = this.f15274a.getId();
                C8845b bVar = new C8845b();
                bVar.f24130a = System.currentTimeMillis();
                bVar.f24132c = id;
                bVar.f24133d = -1;
                bVar.f24136g = true;
                bhVar.baseMessage = bVar;
            }
            if (this.f15367t != null) {
                this.f15367t.insertMessage(bhVar, true);
            }
            this.f15282j.remove(bhVar);
            if (this.f15280h.get(Long.valueOf(bhVar.f21607b)) != null) {
                this.f15281i.add(0, bhVar);
                ((C5824b) mo8518c()).mo11715c();
                m12696c(bhVar);
            }
        }
    }
}
