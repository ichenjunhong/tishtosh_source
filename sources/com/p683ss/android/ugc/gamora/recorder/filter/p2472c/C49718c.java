package com.p683ss.android.ugc.gamora.recorder.filter.p2472c;

import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31478p.C31479a;
import com.p683ss.android.ugc.aweme.filter.CircleViewPager;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43902e;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43902e.C43903a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44880c;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.c */
public final class C49718c extends C2764h<C49717b> implements C12356a, C44880c, C49717b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124689a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49718c.class), "mVideoRecorder", "getMVideoRecorder()Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49718c.class), "filterApiComponent", "getFilterApiComponent()Lcom/ss/android/ugc/gamora/recorder/filter/filter_core/FilterApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49718c.class), "filterSwitcher", "getFilterSwitcher()Lcom/ss/android/ugc/aweme/shortvideo/filter/IFilterSwitcher;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49718c.class), "filterSwitcherCallback", "getFilterSwitcherCallback()Lcom/ss/android/ugc/aweme/shortvideo/filter/IFilterSwitcher$FilterSwitcherCallback;"))};

    /* renamed from: b */
    public final FragmentActivity f124690b = ((FragmentActivity) mo23370j().mo23373a(FragmentActivity.class, (String) null));

    /* renamed from: c */
    public final C49718c f124691c = this;

    /* renamed from: d */
    public boolean f124692d = true;

    /* renamed from: e */
    boolean f124693e = true;

    /* renamed from: f */
    public final C17432q<JSONObject> f124694f;

    /* renamed from: g */
    private final C52668f f124695g = C52732g.m112285a(new C49724d(this));

    /* renamed from: h */
    private final C52668f f124696h = C52732g.m112285a(new C49719a(this));

    /* renamed from: i */
    private final C52668f f124697i = C52732g.m112285a(new C49720b(this));

    /* renamed from: j */
    private final C52668f f124698j = C52732g.m112285a(new C49722c(this));

    /* renamed from: k */
    private final C12361b f124699k;

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.c$a */
    static final class C49719a extends C52712l implements C52670a<C49683a> {

        /* renamed from: a */
        final /* synthetic */ C49718c f124700a;

        C49719a(C49718c cVar) {
            this.f124700a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C49683a) this.f124700a.mo23370j().mo23373a(C49683a.class, (String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.c$b */
    static final class C49720b extends C52712l implements C52670a<C49709a> {

        /* renamed from: a */
        final /* synthetic */ C49718c f124701a;

        C49720b(C49718c cVar) {
            this.f124701a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49709a aVar = new C49709a(this.f124701a.f124690b, this.f124701a, this.f124701a.f124694f, new C31479a(this) {

                /* renamed from: a */
                final /* synthetic */ C49720b f124702a;

                /* renamed from: b */
                private CircleViewPager f124703b;

                /* renamed from: a */
                public final CircleViewPager mo64373a() {
                    if (this.f124703b == null) {
                        this.f124703b = new CircleViewPager(this.f124702a.f124701a.f124690b);
                    }
                    return this.f124703b;
                }

                {
                    this.f124702a = r1;
                }
            }, C39629l.m88232a().mo58584o().mo64334d().mo64415e());
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.c$c */
    static final class C49722c extends C52712l implements C52670a<C497231> {

        /* renamed from: a */
        final /* synthetic */ C49718c f124704a;

        C49722c(C49718c cVar) {
            this.f124704a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43903a(this) {

                /* renamed from: a */
                final /* synthetic */ C49722c f124705a;

                {
                    this.f124705a = r1;
                }

                /* renamed from: a */
                public final void mo89457a(C31459g gVar, boolean z) {
                    boolean z2;
                    float f;
                    C52711k.m112240b(gVar, "selectedFilter");
                    C49718c cVar = this.f124705a.f124704a;
                    if (cVar.f124693e || !cVar.f124692d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        this.f124705a.f124704a.mo97607i().mo97570a(gVar, "slide");
                    } else {
                        this.f124705a.f124704a.mo97607i().mo89439a(gVar, false);
                    }
                    if (z) {
                        C44885g h = this.f124705a.f124704a.mo97606h();
                        String str = gVar.f82332i;
                        if (-1.0f == gVar.f82334k) {
                            if (gVar.f82332i != null) {
                                f = this.f124705a.f124704a.mo97606h().mo91030b(gVar.f82332i);
                            } else {
                                f = 0.8f;
                            }
                            gVar.f82334k = f;
                            if (-1.0f == gVar.f82334k) {
                                StringBuilder sb = new StringBuilder("[FilterBean.setInternalDefaultIntensity] filterFolder:");
                                sb.append(gVar.f82332i);
                                sb.append(" internalDefaultIntensity == -1");
                                C50203g.m108361b(sb.toString());
                            }
                        }
                        h.mo91028a(str, gVar.f82334k);
                    }
                    this.f124705a.f124704a.f124692d = false;
                }

                /* renamed from: a */
                public final void mo89458a(List<? extends C31459g> list, boolean z, float f) {
                    C52711k.m112240b(list, "filters");
                    int a = C52575l.m112114a(list, this.f124705a.f124704a.mo97607i().mo89440e());
                    if (a < 0) {
                        a = 0;
                    }
                    if (z) {
                        this.f124705a.f124704a.mo97606h().mo91027a(a, list, f);
                    } else {
                        this.f124705a.f124704a.mo97607i().mo97573b(f);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.c$d */
    static final class C49724d extends C52712l implements C52670a<C44885g> {

        /* renamed from: a */
        final /* synthetic */ C49718c f124706a;

        C49724d(C49718c cVar) {
            this.f124706a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((C45004a) this.f124706a.mo23370j().mo23373a(C45004a.class, (String) null)).mo91305K();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.c.c$e */
    static final class C49725e<T> implements C2767k<C31459g> {

        /* renamed from: a */
        final /* synthetic */ C49718c f124707a;

        C49725e(C49718c cVar) {
            this.f124707a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C31459g gVar = (C31459g) obj;
            if (!this.f124707a.mo97605d()) {
                int a = C31487c.m73323a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar);
                boolean z = false;
                if (a < 0) {
                    a = 0;
                }
                C49718c cVar = this.f124707a;
                if (a == 0) {
                    z = true;
                }
                cVar.f124693e = z;
                cVar.mo97608k().mo89448a(a);
            }
        }
    }

    /* renamed from: c */
    public final C44880c mo97604c() {
        return this;
    }

    /* renamed from: h */
    public final C44885g mo97606h() {
        return (C44885g) this.f124695g.getValue();
    }

    /* renamed from: i */
    public final C49683a mo97607i() {
        return (C49683a) this.f124696h.getValue();
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124699k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final C43902e mo97608k() {
        return (C43902e) this.f124697i.getValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124691c;
    }

    public final void bN_() {
        super.bN_();
        mo97608k().mo89455b();
    }

    /* renamed from: d */
    public final boolean mo97605d() {
        return mo97608k().mo89454a();
    }

    public final void bO_() {
        super.bO_();
        mo97607i().mo97572b().mo7352a(this, new C49725e(this));
        mo97608k().mo89451a((C43903a) this.f124698j.getValue());
    }

    /* renamed from: a */
    public final void mo97600a(float f) {
        mo97608k().mo89447a(f);
    }

    /* renamed from: b */
    public final C31459g mo97603b(C31459g gVar) {
        C52711k.m112240b(gVar, "filter");
        return mo97608k().mo89446a(gVar);
    }

    /* renamed from: a */
    public final void mo90996a(int i) {
        mo97608k().mo89456b(i);
    }

    /* renamed from: a */
    public final void mo97601a(C31459g gVar) {
        C52711k.m112240b(gVar, "filter");
        if (!mo97608k().mo89454a()) {
            mo97608k().mo89449a(gVar, (Integer) null);
        }
    }

    /* renamed from: a */
    public final void mo90997a(List<C31459g> list) {
        C43902e k = mo97608k();
        if (list == null) {
            C52711k.m112234a();
        }
        k.mo89452a(list);
    }

    public C49718c(C12361b bVar, C17432q<JSONObject> qVar) {
        C52711k.m112240b(bVar, "diContainer");
        C52711k.m112240b(qVar, "log");
        this.f124699k = bVar;
        this.f124694f = qVar;
    }

    /* renamed from: a */
    public final void mo90998a(List<C31459g> list, int i) {
        C43902e k = mo97608k();
        if (list == null) {
            C52711k.m112234a();
        }
        k.mo89453a(list, i);
    }

    /* renamed from: a */
    public final void mo97602a(C31459g gVar, float f, float f2) {
        C43902e k = mo97608k();
        Window window = this.f124690b.getWindow();
        C52711k.m112236a((Object) window, "activity.window");
        View decorView = window.getDecorView();
        C52711k.m112236a((Object) decorView, "activity.window.decorView");
        k.mo89450a(gVar, null, f, f2, decorView.getWidth());
    }
}
