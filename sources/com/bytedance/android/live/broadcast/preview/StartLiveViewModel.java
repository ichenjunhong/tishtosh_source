package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.os.Message;
import com.bytedance.android.live.base.model.p188b.C2964a;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.model.C3453b;
import com.bytedance.android.live.broadcast.model.C3458e;
import com.bytedance.android.live.broadcast.preview.p219a.C3495a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.network.response.C4178e;
import com.bytedance.android.livesdk.chatroom.model.C5728aq;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.HashMap;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class StartLiveViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f9925a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "liveParamsListener", "getLiveParamsListener()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "roomCreateInfo", "getRoomCreateInfo()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "locationChoose", "getLocationChoose()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "titleMaxCount", "getTitleMaxCount()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "liveMode", "getLiveMode()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "cameraType", "getCameraType()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "currentGame", "getCurrentGame()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "titleType", "getTitleType()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "title", "getTitle()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "cover", "getCover()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "roomTag", "getRoomTag()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "isCommodity", "isCommodity()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "douPlus", "getDouPlus()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "verifyParams", "getVerifyParams()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "startLiveStatus", "getStartLiveStatus()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "room", "getRoom()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveViewModel.class), "banUserInfoResult", "getBanUserInfoResult()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: h */
    public static final C3471a f9926h = new C3471a(null);

    /* renamed from: b */
    public C1690c f9927b;

    /* renamed from: c */
    public C1690c f9928c;

    /* renamed from: d */
    public final C52668f f9929d = C52732g.m112285a(C3479i.f9955a);

    /* renamed from: e */
    public final C52668f f9930e = C52732g.m112285a(C3492v.f9968a);

    /* renamed from: f */
    public C3495a f9931f;

    /* renamed from: g */
    public C3495a f9932g;

    /* renamed from: i */
    private final C52668f f9933i = C52732g.m112285a(C3481k.f9957a);

    /* renamed from: j */
    private final C52668f f9934j = C52732g.m112285a(C3486p.f9962a);

    /* renamed from: k */
    private final C52668f f9935k = C52732g.m112285a(C3482l.f9958a);

    /* renamed from: l */
    private final C52668f f9936l = C52732g.m112285a(C3490t.f9966a);

    /* renamed from: m */
    private final C52668f f9937m = C52732g.m112285a(C3480j.f9956a);

    /* renamed from: n */
    private final C52668f f9938n = C52732g.m112285a(C3473c.f9949a);

    /* renamed from: o */
    private final C52668f f9939o = C52732g.m112285a(C3477g.f9953a);

    /* renamed from: p */
    private final C52668f f9940p = C52732g.m112285a(C3491u.f9967a);

    /* renamed from: q */
    private final C52668f f9941q = C52732g.m112285a(C3489s.f9965a);

    /* renamed from: r */
    private final C52668f f9942r = C52732g.m112285a(C3474d.f9950a);

    /* renamed from: s */
    private final C52668f f9943s = C52732g.m112285a(C3487q.f9963a);

    /* renamed from: t */
    private final C52668f f9944t = C52732g.m112285a(C3478h.f9954a);

    /* renamed from: u */
    private final C52668f f9945u = C52732g.m112285a(C3488r.f9964a);

    /* renamed from: v */
    private final C52668f f9946v = C52732g.m112285a(C3485o.f9961a);

    /* renamed from: w */
    private final C52668f f9947w = C52732g.m112285a(C3472b.f9948a);

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$a */
    public static final class C3471a {
        private C3471a() {
        }

        public /* synthetic */ C3471a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static Message m9309a(int i, Object obj) {
            Message message = new Message();
            message.what = i;
            message.obj = obj;
            return message;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$b */
    static final class C3472b extends C52712l implements C52670a<C0198r<C4177d<C3453b>>> {

        /* renamed from: a */
        public static final C3472b f9948a = new C3472b();

        C3472b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$c */
    static final class C3473c extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        public static final C3473c f9949a = new C3473c();

        C3473c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0198r rVar = new C0198r();
            rVar.setValue(Integer.valueOf(1));
            return rVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$d */
    static final class C3474d extends C52712l implements C52670a<C0198r<String>> {

        /* renamed from: a */
        public static final C3474d f9950a = new C3474d();

        C3474d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$e */
    public static final class C3475e<T> implements C1710e<C4178e<Room>> {

        /* renamed from: a */
        final /* synthetic */ StartLiveViewModel f9951a;

        public C3475e(StartLiveViewModel startLiveViewModel) {
            this.f9951a = startLiveViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f9951a.mo8884l().setValue(C3471a.m9309a(3, ((C4178e) obj).f11376b));
            C3495a aVar = this.f9951a.f9932g;
            if (aVar != null) {
                aVar.mo8888a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$f */
    public static final class C3476f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ StartLiveViewModel f9952a;

        public C3476f(StartLiveViewModel startLiveViewModel) {
            this.f9952a = startLiveViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f9952a.mo8884l().setValue(C3471a.m9309a(4, (Throwable) obj));
            C3495a aVar = this.f9952a.f9932g;
            if (aVar != null) {
                aVar.mo8888a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$g */
    static final class C3477g extends C52712l implements C52670a<C0198r<Game>> {

        /* renamed from: a */
        public static final C3477g f9953a = new C3477g();

        C3477g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$h */
    static final class C3478h extends C52712l implements C52670a<C0198r<C2964a>> {

        /* renamed from: a */
        public static final C3478h f9954a = new C3478h();

        C3478h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0198r rVar = new C0198r();
            rVar.setValue(C2964a.defaultOne());
            return rVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$i */
    static final class C3479i extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C3479i f9955a = new C3479i();

        C3479i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0198r rVar = new C0198r();
            rVar.setValue(Boolean.valueOf(false));
            return rVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$j */
    static final class C3480j extends C52712l implements C52670a<C0198r<C8710m>> {

        /* renamed from: a */
        public static final C3480j f9956a = new C3480j();

        C3480j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0198r rVar = new C0198r();
            rVar.setValue(C8710m.VIDEO);
            return rVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$k */
    static final class C3481k extends C52712l implements C52670a<C0198r<C8681d>> {

        /* renamed from: a */
        public static final C3481k f9957a = new C3481k();

        C3481k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$l */
    static final class C3482l extends C52712l implements C52670a<NextLiveData<Boolean>> {

        /* renamed from: a */
        public static final C3482l f9958a = new C3482l();

        C3482l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            NextLiveData nextLiveData = new NextLiveData();
            nextLiveData.setValue(Boolean.valueOf(false));
            return nextLiveData;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$m */
    public static final class C3483m<T> implements C1710e<C4177d<C3453b>> {

        /* renamed from: a */
        final /* synthetic */ StartLiveViewModel f9959a;

        public C3483m(StartLiveViewModel startLiveViewModel) {
            this.f9959a = startLiveViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f9959a.mo8886n().postValue((C4177d) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$n */
    public static final class C3484n<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C3484n f9960a = new C3484n();

        C3484n() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112236a((Object) th, "it");
            C3831a.m9706a(6, "StartLiveViewModel", th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$o */
    static final class C3485o extends C52712l implements C52670a<C0198r<Room>> {

        /* renamed from: a */
        public static final C3485o f9961a = new C3485o();

        C3485o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$p */
    static final class C3486p extends C52712l implements C52670a<NextLiveData<C3458e>> {

        /* renamed from: a */
        public static final C3486p f9962a = new C3486p();

        C3486p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            NextLiveData nextLiveData = new NextLiveData();
            nextLiveData.setValue(new C3458e());
            return nextLiveData;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$q */
    static final class C3487q extends C52712l implements C52670a<C0198r<C5728aq>> {

        /* renamed from: a */
        public static final C3487q f9963a = new C3487q();

        C3487q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0198r rVar = new C0198r();
            rVar.setValue(new C5728aq());
            return rVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$r */
    static final class C3488r extends C52712l implements C52670a<C0198r<Message>> {

        /* renamed from: a */
        public static final C3488r f9964a = new C3488r();

        C3488r() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$s */
    static final class C3489s extends C52712l implements C52670a<C0198r<String>> {

        /* renamed from: a */
        public static final C3489s f9965a = new C3489s();

        C3489s() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0198r rVar = new C0198r();
            rVar.setValue("");
            return rVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$t */
    static final class C3490t extends C52712l implements C52670a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C3490t f9966a = new C3490t();

        C3490t() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            NextLiveData nextLiveData = new NextLiveData();
            nextLiveData.setValue(Integer.valueOf(20));
            return nextLiveData;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$u */
    static final class C3491u extends C52712l implements C52670a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C3491u f9967a = new C3491u();

        C3491u() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            NextLiveData nextLiveData = new NextLiveData();
            nextLiveData.setValue(Integer.valueOf(0));
            return nextLiveData;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$v */
    static final class C3492v extends C52712l implements C52670a<C0198r<HashMap<String, String>>> {

        /* renamed from: a */
        public static final C3492v f9968a = new C3492v();

        C3492v() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0198r rVar = new C0198r();
            rVar.setValue(new HashMap());
            return rVar;
        }
    }

    /* renamed from: a */
    public final NextLiveData<C3458e> mo8873a() {
        return (NextLiveData) this.f9934j.getValue();
    }

    /* renamed from: b */
    public final NextLiveData<Boolean> mo8874b() {
        return (NextLiveData) this.f9935k.getValue();
    }

    /* renamed from: c */
    public final NextLiveData<Integer> mo8875c() {
        return (NextLiveData) this.f9936l.getValue();
    }

    /* renamed from: d */
    public final C0198r<C8710m> mo8876d() {
        return (C0198r) this.f9937m.getValue();
    }

    /* renamed from: e */
    public final C0198r<Integer> mo8877e() {
        return (C0198r) this.f9938n.getValue();
    }

    /* renamed from: f */
    public final C0198r<Game> mo8878f() {
        return (C0198r) this.f9939o.getValue();
    }

    /* renamed from: g */
    public final NextLiveData<Integer> mo8879g() {
        return (NextLiveData) this.f9940p.getValue();
    }

    /* renamed from: h */
    public final C0198r<String> mo8880h() {
        return (C0198r) this.f9941q.getValue();
    }

    /* renamed from: i */
    public final C0198r<String> mo8881i() {
        return (C0198r) this.f9942r.getValue();
    }

    /* renamed from: j */
    public final C0198r<C5728aq> mo8882j() {
        return (C0198r) this.f9943s.getValue();
    }

    /* renamed from: k */
    public final C0198r<C2964a> mo8883k() {
        return (C0198r) this.f9944t.getValue();
    }

    /* renamed from: l */
    public final C0198r<Message> mo8884l() {
        return (C0198r) this.f9945u.getValue();
    }

    /* renamed from: m */
    public final C0198r<Room> mo8885m() {
        return (C0198r) this.f9946v.getValue();
    }

    /* renamed from: n */
    public final C0198r<C4177d<C3453b>> mo8886n() {
        return (C0198r) this.f9947w.getValue();
    }

    public final void onCleared() {
        super.onCleared();
        C1690c cVar = this.f9928c;
        if (cVar != null && !cVar.isDisposed()) {
            C1690c cVar2 = this.f9928c;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
        this.f9928c = null;
        C1690c cVar3 = this.f9927b;
        if (cVar3 != null && !cVar3.isDisposed()) {
            C1690c cVar4 = this.f9927b;
            if (cVar4 != null) {
                cVar4.dispose();
            }
        }
        this.f9927b = null;
    }
}
