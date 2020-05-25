package com.p683ss.android.ugc.gamora.recorder.filter.p2470a;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2766j;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.beauty.C23777a;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.C31475n;
import com.p683ss.android.ugc.aweme.filter.C31475n.C31476a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39564aq;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43872b;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43878g;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43897a;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43904f;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44878a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44880c;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.tools.beauty.C46821b;
import com.p683ss.android.ugc.aweme.tools.foundation.C47060a;
import com.p683ss.android.ugc.aweme.tools.foundation.C47061b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47951r;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.gamora.recorder.filter.p2472c.C49717b;
import dmt.p2652av.video.C52884a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c */
public final class C49685c extends C2764h<C49683a> implements C12356a, C43904f, C43906h {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124617a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "beautyApiComponent", "getBeautyApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/beauty/BeautyApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "mCameraApiComponent", "getMCameraApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/CameraApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "cameraFilterStrategy", "getCameraFilterStrategy()Lcom/ss/android/ugc/aweme/shortvideo/config/CameraFilterStrategy;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "mDisableFilter", "getMDisableFilter()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "shortVideoContextViewModel", "getShortVideoContextViewModel()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "onFilterChange", "getOnFilterChange()Lcom/ss/android/ugc/gamora/recorder/filter/filter_core/FilterLogicComponent$onFilterChange$2$1;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "filterSwipeApi", "getFilterSwipeApi()Lcom/ss/android/ugc/gamora/recorder/filter/filter_swipe/FilterSwipeApi;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "mVideoRecorder", "getMVideoRecorder()Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "mFilterIntensityStore", "getMFilterIntensityStore()Lcom/ss/android/ugc/aweme/filter/FilterIntensityStore;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49685c.class), "apiComponent", "getApiComponent()Lcom/ss/android/ugc/gamora/recorder/filter/filter_core/FilterApiComponent;"))};

    /* renamed from: b */
    public boolean f124618b;

    /* renamed from: c */
    public C31459g f124619c;

    /* renamed from: d */
    public final C2765i<C49684b> f124620d = new C2765i<>();

    /* renamed from: e */
    public final C2766j<C31459g> f124621e = new C2766j<>(null);

    /* renamed from: f */
    public final AppCompatActivity f124622f;

    /* renamed from: g */
    private final C52668f f124623g = C52732g.m112285a(new C49690c(this));

    /* renamed from: h */
    private final C52668f f124624h = C52732g.m112285a(new C49695h(this));

    /* renamed from: i */
    private final C52668f f124625i = C52732g.m112285a(C49691d.f124646a);

    /* renamed from: j */
    private final C52668f f124626j = C52732g.m112285a(C49696i.f124652a);

    /* renamed from: k */
    private final C52668f f124627k = C52732g.m112285a(new C49704o(this));

    /* renamed from: l */
    private C31459g f124628l;

    /* renamed from: m */
    private final C52668f f124629m = C52732g.m112285a(new C49700m(this));

    /* renamed from: n */
    private C31459g f124630n;

    /* renamed from: o */
    private final C52668f f124631o = C52732g.m112285a(new C49692e(this));

    /* renamed from: p */
    private final C52668f f124632p = C52732g.m112285a(new C49698k(this));

    /* renamed from: q */
    private final C52668f f124633q = C52732g.m112285a(C49697j.f124653a);

    /* renamed from: r */
    private final C52668f f124634r = C52732g.m112285a(new C49687b(this));

    /* renamed from: s */
    private final C12361b f124635s;

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$a */
    static final class C49686a<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124636a;

        C49686a(C49685c cVar) {
            this.f124636a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue() && !C23780d.m58365a() && !this.f124636a.f124618b) {
                this.f124636a.mo97587n().mo97595b(this.f124636a.mo89440e());
                this.f124636a.mo97592r();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$b */
    static final class C49687b extends C52712l implements C52670a<C496881> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124637a;

        C49687b(C49685c cVar) {
            this.f124637a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Object(this) {

                /* renamed from: a */
                public final C2766j<C31459g> f124638a;

                /* renamed from: b */
                public final C2765i<C49684b> f124639b;

                /* renamed from: c */
                final /* synthetic */ C49687b f124640c;

                /* renamed from: d */
                private final /* synthetic */ C49685c f124641d;

                /* renamed from: e */
                private final /* synthetic */ C49685c f124642e;

                /* renamed from: f */
                private final /* synthetic */ C44880c f124643f;

                /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$b$1$a */
                static final class C49689a extends C52712l implements C52670a<C52860x> {

                    /* renamed from: a */
                    final /* synthetic */ C496881 f124644a;

                    C49689a(C496881 r1) {
                        this.f124644a = r1;
                        super(0);
                    }

                    public final /* synthetic */ Object invoke() {
                        this.f124644a.f124640c.f124637a.mo97579a(this.f124644a.f124640c.f124637a.f124619c, (String) null);
                        return C52860x.f131107a;
                    }
                }

                /* renamed from: a */
                public final void mo89460a(float f) {
                    this.f124642e.mo89460a(f);
                }

                /* renamed from: a */
                public final void mo89461a(float f, float f2) {
                    this.f124642e.mo89461a(f, f2);
                }

                /* renamed from: a */
                public final void mo90996a(int i) {
                    this.f124643f.mo90996a(i);
                }

                /* renamed from: a */
                public final void mo89438a(C31459g gVar) {
                    this.f124642e.mo89438a(gVar);
                }

                /* renamed from: a */
                public final void mo89439a(C31459g gVar, boolean z) {
                    this.f124642e.mo89439a(gVar, z);
                }

                /* renamed from: a */
                public final void mo90997a(List<C31459g> list) {
                    this.f124643f.mo90997a(list);
                }

                /* renamed from: a */
                public final void mo90998a(List<C31459g> list, int i) {
                    this.f124643f.mo90998a(list, i);
                }

                /* renamed from: d */
                public final LiveData<Boolean> mo89459d() {
                    return this.f124641d.mo89459d();
                }

                /* renamed from: e */
                public final C31459g mo89440e() {
                    return this.f124642e.mo89440e();
                }

                /* renamed from: f */
                public final void mo89441f() {
                    this.f124642e.mo89441f();
                }

                /* renamed from: a */
                public final void mo97571a(boolean z) {
                    this.f124640c.f124637a.mo97585l().setValue(Boolean.valueOf(z));
                    if (z) {
                        this.f124640c.f124637a.mo97590p().mo91005a("");
                        this.f124640c.f124637a.mo97580b(null);
                        C52711k.m112240b(C47060a.f118841a, "$this$cancelFilter");
                        C47060a.m102182a("use_filter", "");
                    }
                    this.f124640c.f124637a.f124618b = z;
                    C39629l.m88232a().mo58574e().mo83116a(C40796a.DisableFilter, z);
                }

                /* renamed from: b */
                public final /* bridge */ /* synthetic */ C2763g mo97572b() {
                    return this.f124638a;
                }

                /* renamed from: g */
                public final /* bridge */ /* synthetic */ C2762f mo97574g() {
                    return this.f124639b;
                }

                /* renamed from: h */
                public final C52670a<C52860x> mo97575h() {
                    return new C49689a<>(this);
                }

                /* renamed from: a */
                public final C31405ah mo97568a() {
                    return this.f124640c.f124637a.mo97591q();
                }

                /* renamed from: c */
                public final /* synthetic */ C43897a mo89445c() {
                    return this.f124641d.mo89445c();
                }

                {
                    this.f124640c = r2;
                    this.f124641d = r2.f124637a;
                    this.f124642e = r2.f124637a;
                    this.f124643f = r2.f124637a.mo97588o().mo97604c();
                    this.f124638a = r2.f124637a.f124621e;
                    this.f124639b = r2.f124637a.f124620d;
                }

                /* renamed from: b */
                public final void mo97573b(float f) {
                    C497011 n = this.f124640c.f124637a.mo97587n();
                    C31501n d = C39618d.m88215d();
                    C52711k.m112236a((Object) d, "AVEnv.getFilterSources()");
                    int a = C31487c.m73323a(d, n.f124657a.f124656a.mo89440e());
                    if (a < 0) {
                        a = 0;
                    }
                    n.f124657a.f124656a.mo97583i().mo91324a(new C44878a(a), f, n.f124657a.f124656a.mo97591q());
                }

                /* renamed from: a */
                public final void mo97569a(C31459g gVar, int i) {
                    C52711k.m112240b(gVar, "filterBean");
                    C49685c cVar = this.f124640c.f124637a;
                    if (!C23777a.m58349b() || !gVar.mo64357a().contains(C31483a.f82385b)) {
                        cVar.mo97590p().mo91028a(gVar.f82332i, C31460h.m73278a(gVar, i, (C31406ai) new C49703n(cVar)));
                        cVar.mo97591q().mo64305a(gVar, i);
                    }
                }

                /* renamed from: a */
                public final void mo97570a(C31459g gVar, String str) {
                    C52711k.m112240b(gVar, "filterBean");
                    C49685c cVar = this.f124640c.f124637a;
                    if (!C52711k.m112239a((Object) gVar, (Object) cVar.f124619c)) {
                        cVar.mo97581b(gVar, true);
                        cVar.mo97579a(cVar.f124619c, str);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$c */
    static final class C49690c extends C52712l implements C52670a<C42451a> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124645a;

        C49690c(C49685c cVar) {
            this.f124645a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C42451a) this.f124645a.mo23370j().mo23373a(C42451a.class, (String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$d */
    static final class C49691d extends C52712l implements C52670a<C43872b> {

        /* renamed from: a */
        public static final C49691d f124646a = new C49691d();

        C49691d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C43878g.m96385a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$e */
    static final class C49692e extends C52712l implements C52670a<C49717b> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124647a;

        C49692e(C49685c cVar) {
            this.f124647a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C49717b) this.f124647a.mo23370j().mo23372a(C49717b.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$f */
    public static final class C49693f implements C0199s<List<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124648a;

        /* renamed from: b */
        final /* synthetic */ int f124649b;

        public final /* synthetic */ void onChanged(Object obj) {
            Object obj2;
            boolean z;
            List list = (List) obj;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((C31459g) obj2).f82324a == this.f124649b) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                if (((C31459g) obj2) != null) {
                    C31459g a = C39618d.f101144H.mo58584o().mo64333c().mo64344a(this.f124649b);
                    if (a != null) {
                        this.f124648a.mo89445c().mo89439a(a, false);
                        C39618d.m88215d().mo64418a().removeObserver(this);
                    }
                }
            }
        }

        C49693f(C49685c cVar, int i) {
            this.f124648a = cVar;
            this.f124649b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$g */
    static final class C49694g<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124650a;

        C49694g(C49685c cVar) {
            this.f124650a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (C23780d.m58365a()) {
                this.f124650a.mo97582h().bL_();
                return;
            }
            if (!this.f124650a.f124618b) {
                C31459g a = C39618d.f101144H.mo58584o().mo64333c().mo64344a(this.f124650a.mo97584k().mo89423a(this.f124650a.mo97583i().mo91315U()));
                if (a != null) {
                    this.f124650a.mo97581b(a, true);
                    C49717b o = this.f124650a.mo97588o();
                    C31459g gVar = this.f124650a.f124619c;
                    if (gVar == null) {
                        C52711k.m112234a();
                    }
                    o.mo97601a(gVar);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$h */
    static final class C49695h extends C52712l implements C52670a<C45004a> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124651a;

        C49695h(C49685c cVar) {
            this.f124651a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C45004a) this.f124651a.mo23370j().mo23373a(C45004a.class, (String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$i */
    static final class C49696i extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C49696i f124652a = new C49696i();

        C49696i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0198r rVar = new C0198r();
            rVar.setValue(Boolean.valueOf(C39629l.m88232a().mo58574e().mo83117a(C40796a.DisableFilter)));
            return rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$j */
    static final class C49697j extends C52712l implements C52670a<C31475n> {

        /* renamed from: a */
        public static final C49697j f124653a = new C49697j();

        C49697j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C31476a.m73313a("VideoRecordNewActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$k */
    static final class C49698k extends C52712l implements C52670a<C44885g> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124654a;

        C49698k(C49685c cVar) {
            this.f124654a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((C45004a) this.f124654a.mo23370j().mo23373a(C45004a.class, (String) null)).mo91305K();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$l */
    public static final class C49699l implements C31406ai {

        /* renamed from: a */
        final /* synthetic */ C49685c f124655a;

        C49699l(C49685c cVar) {
            this.f124655a = cVar;
        }

        /* renamed from: a */
        public final float mo49450a(String str) {
            C52711k.m112240b(str, "filterPath");
            return this.f124655a.mo97590p().mo91030b(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$m */
    static final class C49700m extends C52712l implements C52670a<C497011> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124656a;

        C49700m(C49685c cVar) {
            this.f124656a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Object(this) {

                /* renamed from: a */
                final /* synthetic */ C49700m f124657a;

                /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$m$1$a */
                public static final class C49702a implements C31406ai {

                    /* renamed from: a */
                    final /* synthetic */ C497011 f124658a;

                    C49702a(C497011 r1) {
                        this.f124658a = r1;
                    }

                    /* renamed from: a */
                    public final float mo49450a(String str) {
                        C52711k.m112240b(str, "filterPath");
                        return this.f124658a.f124657a.f124656a.mo97590p().mo91030b(str);
                    }
                }

                {
                    this.f124657a = r1;
                }

                /* renamed from: a */
                private final void m107301a(int i) {
                    this.f124657a.f124656a.mo97584k().mo89425a(this.f124657a.f124656a.mo97583i().mo91315U(), i);
                    this.f124657a.f124656a.mo97582h().mo86554a(new C46821b("EFFECT_ID_TYPE_FILTER", 2), true);
                }

                /* renamed from: a */
                public final void mo97594a(C31459g gVar) {
                    C52711k.m112240b(gVar, "currentFilter");
                    ShortVideoContextViewModel m = this.f124657a.f124656a.mo97586m();
                    C52711k.m112236a((Object) m, "shortVideoContextViewModel");
                    if (m.f107134a != null) {
                        Context context = this.f124657a.f124656a.f124622f;
                        StringBuilder sb = new StringBuilder();
                        sb.append(String.valueOf(gVar.f82324a));
                        C47951r.m103761a(context, sb.toString(), 3);
                        ShortVideoContextViewModel m2 = this.f124657a.f124656a.mo97586m();
                        C52711k.m112236a((Object) m2, "shortVideoContextViewModel");
                        if (!m2.mo86391c()) {
                            ShortVideoContextViewModel m3 = this.f124657a.f124656a.mo97586m();
                            C52711k.m112236a((Object) m3, "shortVideoContextViewModel");
                            m3.f107134a.f107082ah.add(gVar.f82326c);
                            ShortVideoContextViewModel m4 = this.f124657a.f124656a.mo97586m();
                            C52711k.m112236a((Object) m4, "shortVideoContextViewModel");
                            m4.f107134a.f107083ai.add(String.valueOf(gVar.f82324a));
                        }
                        if (!C23780d.m58365a()) {
                            m107301a(gVar.f82324a);
                        } else if (gVar.f82336m) {
                            m107301a(this.f124657a.f124656a.mo89440e().f82324a);
                            this.f124657a.f124656a.mo97582h().mo86562d().mo94101d().add(new ComposerInfo("EFFECT_ID_TYPE_FILTER", "", ""));
                        } else {
                            gVar.f82336m = true;
                        }
                        C39564aq aqVar = C39618d.f101180u;
                        C31501n d = C39618d.m88215d();
                        C52711k.m112236a((Object) d, "AVEnv.getFilterSources()");
                        aqVar.mo74206a(gVar, C31487c.m73323a(d, gVar));
                        this.f124657a.f124656a.onEventLastUsedFilterByCurrentFilter(gVar);
                    }
                }

                /* renamed from: b */
                public final void mo97595b(C31459g gVar) {
                    float f;
                    C52711k.m112240b(gVar, "filter");
                    ShortVideoContextViewModel m = this.f124657a.f124656a.mo97586m();
                    C52711k.m112236a((Object) m, "shortVideoContextViewModel");
                    if (m.f107134a != null) {
                        C47060a aVar = C47060a.f118841a;
                        String str = gVar.f82325b;
                        C52711k.m112236a((Object) str, "filter.name");
                        C47061b.m102183a(aVar, str);
                        if (!C23777a.m58349b() || !gVar.mo64357a().contains(C31483a.f82385b)) {
                            float a = C31460h.m73279a(gVar, (C31405ah) this.f124657a.f124656a.mo97591q(), (C31406ai) new C49702a(this));
                            C45004a i = this.f124657a.f124656a.mo97583i();
                            String str2 = gVar.f82332i;
                            C52711k.m112236a((Object) str2, "filter.filterFolder");
                            i.mo91337a(str2, a);
                            ShortVideoContextViewModel m2 = this.f124657a.f124656a.mo97586m();
                            C52711k.m112236a((Object) m2, "shortVideoContextViewModel");
                            ShortVideoContext shortVideoContext = m2.f107134a;
                            C31501n d = C39618d.m88215d();
                            C52711k.m112236a((Object) d, "AVEnv.getFilterSources()");
                            shortVideoContext.f107073aY = C31487c.m73323a(d, gVar);
                            ShortVideoContextViewModel m3 = this.f124657a.f124656a.mo97586m();
                            C52711k.m112236a((Object) m3, "shortVideoContextViewModel");
                            m3.f107134a.f107074aZ = a;
                        } else {
                            this.f124657a.f124656a.mo97583i().mo91336a("");
                        }
                        ShortVideoContextViewModel m4 = this.f124657a.f124656a.mo97586m();
                        C52711k.m112236a((Object) m4, "shortVideoContextViewModel");
                        if (m4.f107134a.f107128u) {
                            C31501n d2 = C39618d.m88215d();
                            C52711k.m112236a((Object) d2, "AVEnv.getFilterSources()");
                            if (C31487c.m73323a(d2, gVar) == 0) {
                                f = 0.35f;
                            } else {
                                f = 0.0f;
                            }
                            this.f124657a.f124656a.mo97590p().mo91031b(f);
                        }
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$n */
    public static final class C49703n implements C31406ai {

        /* renamed from: a */
        final /* synthetic */ C49685c f124659a;

        C49703n(C49685c cVar) {
            this.f124659a = cVar;
        }

        /* renamed from: a */
        public final float mo49450a(String str) {
            C52711k.m112240b(str, "filterPath");
            return this.f124659a.mo97590p().mo91030b(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.c$o */
    static final class C49704o extends C52712l implements C52670a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ C49685c f124660a;

        C49704o(C49685c cVar) {
            this.f124660a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f124660a.f124622f).mo359a(ShortVideoContextViewModel.class);
        }
    }

    /* renamed from: b */
    private static String m107256b(C31459g gVar, String str) {
        if (str == null) {
            if (gVar != null) {
                return "click";
            }
            str = "";
        }
        return str;
    }

    /* renamed from: h */
    public final C42451a mo97582h() {
        return (C42451a) this.f124623g.getValue();
    }

    /* renamed from: i */
    public final C45004a mo97583i() {
        return (C45004a) this.f124624h.getValue();
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124635s;
    }

    /* renamed from: k */
    public final C43872b mo97584k() {
        return (C43872b) this.f124625i.getValue();
    }

    /* renamed from: l */
    public final C0198r<Boolean> mo97585l() {
        return (C0198r) this.f124626j.getValue();
    }

    /* renamed from: m */
    public final ShortVideoContextViewModel mo97586m() {
        return (ShortVideoContextViewModel) this.f124627k.getValue();
    }

    /* renamed from: n */
    public final C497011 mo97587n() {
        return (C497011) this.f124629m.getValue();
    }

    /* renamed from: o */
    public final C49717b mo97588o() {
        return (C49717b) this.f124631o.getValue();
    }

    /* renamed from: p */
    public final C44885g mo97590p() {
        return (C44885g) this.f124632p.getValue();
    }

    /* renamed from: q */
    public final C31475n mo97591q() {
        return (C31475n) this.f124633q.getValue();
    }

    /* renamed from: s */
    public final C43906h mo89445c() {
        return this;
    }

    /* renamed from: d */
    public final LiveData<Boolean> mo89459d() {
        return mo97585l();
    }

    /* renamed from: r */
    public final void mo97592r() {
        this.f124621e.mo7345a(this.f124619c);
    }

    /* renamed from: a */
    public final /* synthetic */ C2759d mo7353a() {
        return (C49683a) this.f124634r.getValue();
    }

    /* renamed from: e */
    public final C31459g mo89440e() {
        C31459g gVar = this.f124619c;
        if (gVar != null) {
            C31459g b = mo97588o().mo97603b(gVar);
            if (b != null) {
                return b;
            }
        }
        return C39629l.m88232a().mo58584o().mo64333c().mo64348c();
    }

    /* renamed from: f */
    public final void mo89441f() {
        C31459g gVar = this.f124619c;
        if (gVar != null) {
            mo97587n().mo97595b(gVar);
            for (C31459g gVar2 : C39629l.m88232a().mo58584o().mo64333c().mo64347b()) {
                if (C52711k.m112239a((Object) gVar2, (Object) gVar)) {
                    gVar2.f82336m = true;
                }
            }
        }
    }

    public final void bO_() {
        super.bO_();
        int a = mo97584k().mo89423a(mo97583i().mo91315U());
        if (a == -1) {
            C39618d.f101151O.mo83116a(C40796a.DisableFilter, true);
        }
        C39618d.m88215d().mo64418a().observe(this.f124622f, new C49693f(this, a));
        mo97583i().mo91364k().mo7349a(this, new C49694g(this));
        C0209x a2 = C0214z.m440a((FragmentActivity) this.f124622f).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ((ShortVideoContextViewModel) a2).mo86398g().observe(this.f124622f, new C49686a(this));
    }

    /* renamed from: a */
    public final void mo89460a(float f) {
        mo97588o().mo97600a(f);
    }

    /* renamed from: b */
    public final void mo97580b(C31459g gVar) {
        Integer num;
        this.f124619c = gVar;
        String str = "sticker_id";
        if (gVar != null) {
            num = Integer.valueOf(gVar.f82324a);
        } else {
            num = null;
        }
        C52884a.m112519a(1, str, num);
    }

    /* renamed from: a */
    public final void mo89438a(C31459g gVar) {
        C52711k.m112240b(gVar, "filter");
        if (!this.f124618b) {
            mo97581b(gVar, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r5.f82324a < mo89440e().f82324a) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c.m73323a(r5, r4.f124630n) < com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c.m73323a(r5, r4.f124619c)) goto L_0x0034;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m107255a(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.filter.g r5 = r4.f124630n
            if (r5 != 0) goto L_0x000b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000b:
            int r5 = r5.f82324a
            com.ss.android.ugc.aweme.filter.g r2 = r4.mo89440e()
            int r2 = r2.f82324a
            if (r5 >= r2) goto L_0x0035
            goto L_0x0034
        L_0x0016:
            com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.filter.c.a r5 = r5.mo58584o()
            com.ss.android.ugc.aweme.filter.repository.a.l r5 = r5.mo64334d()
            com.ss.android.ugc.aweme.filter.repository.a.n r5 = r5.mo64415e()
            com.ss.android.ugc.aweme.filter.g r2 = r4.f124630n
            int r2 = com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c.m73323a(r5, r2)
            com.ss.android.ugc.aweme.filter.g r3 = r4.f124619c
            int r5 = com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c.m73323a(r5, r3)
            if (r2 >= r5) goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            com.bytedance.als.i<com.ss.android.ugc.gamora.recorder.filter.a.b> r5 = r4.f124620d
            com.ss.android.ugc.gamora.recorder.filter.a.b r1 = new com.ss.android.ugc.gamora.recorder.filter.a.b
            com.ss.android.ugc.aweme.filter.g r2 = r4.f124630n
            com.ss.android.ugc.aweme.filter.g r3 = r4.f124619c
            r1.<init>(r2, r3, r0)
            r5.mo7350a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49685c.m107255a(boolean):void");
    }

    public final void onEventLastUsedFilterByCurrentFilter(C31459g gVar) {
        Object obj;
        String str;
        if (this.f124628l != null) {
            ShortVideoContextViewModel m = mo97586m();
            C52711k.m112236a((Object) m, "shortVideoContextViewModel");
            ShortVideoContextViewModel m2 = mo97586m();
            C52711k.m112236a((Object) m2, "shortVideoContextViewModel");
            ShortVideoContextViewModel m3 = mo97586m();
            C52711k.m112236a((Object) m3, "shortVideoContextViewModel");
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "video_shoot_page").mo47829a("creation_id", m.f107134a.f107131x).mo47829a("shoot_way", m2.f107134a.f107132y).mo47826a("draft_id", m3.f107134a.f107022A);
            String str2 = "filter_id";
            C31459g gVar2 = this.f124628l;
            Float f = null;
            if (gVar2 != null) {
                obj = Integer.valueOf(gVar2.f82324a);
            } else {
                obj = null;
            }
            C23089d a2 = a.mo47828a(str2, obj);
            String str3 = "filter_name";
            C31459g gVar3 = this.f124628l;
            if (gVar3 != null) {
                str = gVar3.f82325b;
            } else {
                str = null;
            }
            C23089d a3 = a2.mo47829a(str3, str);
            String str4 = "value";
            C31459g gVar4 = this.f124628l;
            if (gVar4 != null) {
                f = Float.valueOf(C31460h.m73279a(gVar4, (C31405ah) mo97591q(), (C31406ai) new C49699l(this)));
            }
            Map<String, String> map = a3.mo47828a(str4, (Object) f).f61491a;
            C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
            C26890h.m65011a("adjust_filter_complete", map);
        }
        this.f124628l = gVar;
    }

    /* renamed from: a */
    public final void mo89461a(float f, float f2) {
        mo97588o().mo97602a(this.f124619c, f, f2);
    }

    /* renamed from: b */
    public final void mo97581b(C31459g gVar, boolean z) {
        mo97580b(gVar);
        if (z) {
            if (this.f124630n != null && (!C52711k.m112239a((Object) this.f124630n, (Object) this.f124619c))) {
                m107255a(mo97588o().mo97605d());
            }
            this.f124630n = this.f124619c;
        }
        if (!mo97588o().mo97605d()) {
            mo97587n().mo97595b(gVar);
        }
        mo97587n().mo97594a(gVar);
        mo97592r();
    }

    public C49685c(C12361b bVar, AppCompatActivity appCompatActivity) {
        C52711k.m112240b(bVar, "diContainer");
        C52711k.m112240b(appCompatActivity, "activity");
        this.f124635s = bVar;
        this.f124622f = appCompatActivity;
    }

    /* renamed from: a */
    public final void mo97579a(C31459g gVar, String str) {
        String str2;
        C31501n e = C39629l.m88232a().mo58584o().mo64334d().mo64415e();
        C31459g gVar2 = this.f124619c;
        if (gVar2 == null) {
            C52711k.m112234a();
        }
        EffectCategoryResponse b = C31487c.m73327b(e, gVar2);
        if (b == null) {
            str2 = "";
        } else {
            str2 = b.getName();
        }
        ShortVideoContextViewModel m = mo97586m();
        C52711k.m112236a((Object) m, "shortVideoContextViewModel");
        ShortVideoContext shortVideoContext = m.f107134a;
        C47702b bVar = C47702b.f120193a;
        String str3 = "select_filter";
        C42438az a = C42438az.m93209a().mo86526a("creation_id", shortVideoContext.f107131x).mo86526a("shoot_way", shortVideoContext.f107132y).mo86523a("draft_id", shortVideoContext.f107022A).mo86526a("enter_method", m107256b(gVar, str)).mo86526a("enter_from", "video_shoot_page");
        String str4 = "filter_name";
        C31459g gVar3 = this.f124619c;
        if (gVar3 == null) {
            C52711k.m112234a();
        }
        C42438az a2 = a.mo86526a(str4, gVar3.f82326c);
        String str5 = "filter_id";
        C31459g gVar4 = this.f124619c;
        if (gVar4 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) shortVideoContext, "shortVideoContext");
        bVar.mo94984a(str3, a2.mo86523a(str5, gVar4.f82324a).mo86526a("tab_name", str2).mo86526a("content_source", shortVideoContext.mo86370k().getContentSource()).mo86526a("content_type", shortVideoContext.mo86370k().getContentType()).mo86526a("enter_from", "video_shoot_page").f107329a);
    }

    /* renamed from: a */
    public final void mo89439a(C31459g gVar, boolean z) {
        C52711k.m112240b(gVar, "filter");
        if (!this.f124618b && !mo97588o().mo97605d()) {
            mo97581b(gVar, z);
        }
    }
}
