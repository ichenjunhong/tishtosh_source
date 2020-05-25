package com.p683ss.android.ugc.gamora.recorder.p2474h;

import android.arch.lifecycle.C0184k;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2766j;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.defult.C43869b;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout.C44926a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.h.b */
public final class C49823b extends C2764h<C49822a> implements C12356a, C49822a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124865a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49823b.class), "defaultView", "getDefaultView()Lcom/ss/android/ugc/aweme/shortvideo/gesture/defult/IDefaultView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49823b.class), "gesturePresenter", "getGesturePresenter()Lcom/ss/android/ugc/aweme/shortvideo/gesture/defult/DefaultGesturePresenter;"))};

    /* renamed from: b */
    public final C49822a f124866b = this;

    /* renamed from: c */
    public final C45004a f124867c = ((C45004a) mo23370j().mo23373a(C45004a.class, (String) null));

    /* renamed from: d */
    public final C49683a f124868d = ((C49683a) mo23370j().mo23373a(C49683a.class, (String) null));

    /* renamed from: e */
    final C52668f f124869e = C52732g.m112285a(new C49824a(this));

    /* renamed from: f */
    public final C2766j<C44926a> f124870f = new C2766j<>(null);

    /* renamed from: g */
    public final C2766j<ScaleGestureDetector> f124871g = new C2766j<>(null);

    /* renamed from: h */
    public final C12896b f124872h;

    /* renamed from: i */
    private final C50048n f124873i = ((C50048n) mo23370j().mo23373a(C50048n.class, (String) null));

    /* renamed from: j */
    private final C52668f f124874j = C52732g.m112285a(new C49826b(this));

    /* renamed from: k */
    private final C12361b f124875k;

    /* renamed from: l */
    private final int f124876l = R.id.akh;

    /* renamed from: com.ss.android.ugc.gamora.recorder.h.b$a */
    static final class C49824a extends C52712l implements C52670a<C498251> {

        /* renamed from: a */
        final /* synthetic */ C49823b f124877a;

        C49824a(C49823b bVar) {
            this.f124877a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43869b(this) {

                /* renamed from: a */
                public final C49860a f124878a;

                /* renamed from: b */
                final /* synthetic */ C49824a f124879b;

                /* renamed from: a */
                public final boolean mo88992a(ScaleGestureDetector scaleGestureDetector) {
                    return true;
                }

                /* renamed from: b */
                public final boolean mo88387b(float f) {
                    return false;
                }

                /* renamed from: a */
                public final void mo88383a() {
                    C49577b bVar = (C49577b) this.f124879b.f124877a.mo23370j().mo23374b(C49577b.class);
                    if (bVar != null && bVar.mo97491o()) {
                        return;
                    }
                    if (C52711k.m112239a((Object) (Boolean) this.f124879b.f124877a.f124867c.mo91365l().mo7348a(), (Object) Boolean.valueOf(false))) {
                        C45407ay.m98968a("switchFrontRearCamera not allow");
                        return;
                    }
                    this.f124879b.f124877a.f124867c.mo91355b(false);
                    this.f124879b.f124877a.f124867c.mo91357c(true);
                }

                /* renamed from: a */
                public final void mo88384a(float f) {
                    ((C43906h) this.f124879b.f124877a.f124868d.mo89445c()).mo89460a(f);
                }

                {
                    this.f124879b = r3;
                    this.f124878a = (C49860a) r3.f124877a.mo23370j().mo23375b(C49860a.class, (String) null);
                }

                /* renamed from: c */
                public final void mo88388c(float f) {
                    this.f124879b.f124877a.f124867c.mo91342ab();
                    C49860a aVar = this.f124878a;
                    if (aVar != null) {
                        aVar.mo97689b(0);
                    }
                }

                /* renamed from: a */
                public final void mo88386a(MotionEvent motionEvent) {
                    C52711k.m112240b(motionEvent, "e");
                    if (this.f124879b.f124877a.mo97671h().mo43638d()) {
                        this.f124879b.f124877a.f124867c.mo91322a(motionEvent.getX(), motionEvent.getY());
                    }
                }

                /* renamed from: b */
                public final boolean mo88993b(ScaleGestureDetector scaleGestureDetector) {
                    C52711k.m112240b(scaleGestureDetector, "scaleGestureDetector");
                    if (!this.f124879b.f124877a.mo97671h().mo43638d()) {
                        return false;
                    }
                    C49860a aVar = this.f124878a;
                    if (aVar == null || aVar.mo97691c() != 1) {
                        return this.f124879b.f124877a.f124867c.mo91339a(scaleGestureDetector);
                    }
                    return true;
                }

                /* renamed from: a */
                public final void mo88385a(float f, float f2) {
                    ((C43906h) this.f124879b.f124877a.f124868d.mo89445c()).mo89461a(f, f2);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.h.b$b */
    static final class C49826b extends C52712l implements C52670a<DefaultGesturePresenter> {

        /* renamed from: a */
        final /* synthetic */ C49823b f124880a;

        C49826b(C49823b bVar) {
            this.f124880a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DefaultGesturePresenter(this.f124880a.f124872h, (C43869b) this.f124880a.f124869e.getValue(), null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.h.b$c */
    static final class C49827c<T> implements C2767k<C43866a> {

        /* renamed from: a */
        final /* synthetic */ C49823b f124881a;

        C49827c(C49823b bVar) {
            this.f124881a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C43866a aVar = (C43866a) obj;
            if (aVar != null) {
                this.f124881a.mo97672i().mo89421a(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.h.b$d */
    static final class C49828d<T> implements C2767k<C43866a> {

        /* renamed from: a */
        final /* synthetic */ C49823b f124882a;

        C49828d(C49823b bVar) {
            this.f124882a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124882a.mo97672i().mo89421a((C43866a) obj);
        }
    }

    /* renamed from: i */
    public final DefaultGesturePresenter mo97672i() {
        return (DefaultGesturePresenter) this.f124874j.getValue();
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124875k;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124866b;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2763g mo97669c() {
        return this.f124871g;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2763g mo97670d() {
        return this.f124870f;
    }

    /* renamed from: h */
    public final ASCameraView mo97671h() {
        return this.f124867c.mo91307M();
    }

    public final void bO_() {
        super.bO_();
        View j_ = this.f124872h.mo24467j_(this.f124876l);
        C52711k.m112236a((Object) j_, "parentScene.requireViewB…eLayout>(gestureLayoutId)");
        VideoRecordGestureLayout videoRecordGestureLayout = (VideoRecordGestureLayout) j_;
        mo97672i().mo89420a((View) videoRecordGestureLayout);
        this.f124870f.mo7345a(videoRecordGestureLayout.getOnGestureListener());
        this.f124871g.mo7345a(videoRecordGestureLayout.getScaleGestureDetector());
        C0184k kVar = this;
        this.f124867c.mo91301G().mo7352a(kVar, new C49827c(this));
        this.f124873i.mo97823w().mo97828c().mo7349a(kVar, new C49828d(this));
    }

    /* renamed from: a */
    public final void mo97667a(C43866a aVar) {
        C52711k.m112240b(aVar, "listener");
        mo97672i().mo89421a(aVar);
    }

    /* renamed from: a */
    public final void mo97668a(C43866a aVar, int i) {
        C52711k.m112240b(aVar, "listener");
        mo97672i().mo89419a(4, aVar);
    }

    public C49823b(C12896b bVar, C12361b bVar2, int i) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f124872h = bVar;
        this.f124875k = bVar2;
    }
}
