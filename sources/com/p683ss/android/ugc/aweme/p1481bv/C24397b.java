package com.p683ss.android.ugc.aweme.p1481bv;

import android.content.Context;
import android.view.View;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.asve.recorder.camera.p1246a.C20455b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.C43774ee;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42501a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43244d;
import com.p683ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p683ss.android.ugc.aweme.shortvideo.transition.C44894b;
import com.p683ss.android.ugc.aweme.tools.C46807aa;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.aweme.tools.C47347v;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49745b;
import com.p683ss.android.ugc.gamora.recorder.p2464a.C49568a;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49940a;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b.C49972a;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49951e;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bv.b */
public final class C24397b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f64757a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "reverseCameraModel", "getReverseCameraModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "speedModel", "getSpeedModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "mBeautyModel", "getMBeautyModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "filterModel", "getFilterModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "beautyModel", "getBeautyModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "countdownModel", "getCountdownModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "microphoneModel", "getMicrophoneModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "wideCameraModel", "getWideCameraModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "cutMusicModel", "getCutMusicModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "moreFunctionModel", "getMoreFunctionModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "switchDurationModel", "getSwitchDurationModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "flashModel", "getFlashModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "shakeFreeModel", "getShakeFreeModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24397b.class), "duetLayoutModel", "getDuetLayoutModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;"))};

    /* renamed from: b */
    final C52668f f64758b = C52732g.m112285a(new C24424v(this));

    /* renamed from: c */
    final C52668f f64759c = C52732g.m112285a(new C24405e(this));

    /* renamed from: d */
    final C52668f f64760d = C52732g.m112285a(new C24398a(this));

    /* renamed from: e */
    final C52668f f64761e = C52732g.m112285a(new C24426x(this));

    /* renamed from: f */
    public final C48923a f64762f;

    /* renamed from: g */
    public final C12361b f64763g;

    /* renamed from: h */
    final boolean f64764h;

    /* renamed from: i */
    private final C52668f f64765i = C52732g.m112285a(new C24427y(this));

    /* renamed from: j */
    private final C52668f f64766j = C52732g.m112285a(new C24399aa(this));

    /* renamed from: k */
    private final C52668f f64767k = C52732g.m112285a(new C24402b(this));

    /* renamed from: l */
    private final C52668f f64768l = C52732g.m112285a(new C24425w(this));

    /* renamed from: m */
    private final C52668f f64769m = C52732g.m112285a(new C24401ac(this));

    /* renamed from: n */
    private final C52668f f64770n = C52732g.m112285a(new C24403c(this));

    /* renamed from: o */
    private final C52668f f64771o = C52732g.m112285a(new C24400ab(this));

    /* renamed from: p */
    private final C52668f f64772p = C52732g.m112285a(new C24406f(this));

    /* renamed from: q */
    private final C52668f f64773q = C52732g.m112285a(new C24428z(this));

    /* renamed from: r */
    private final C52668f f64774r = C52732g.m112285a(new C24404d(this));

    /* renamed from: com.ss.android.ugc.aweme.bv.b$a */
    static final class C24398a extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64775a;

        C24398a(C24397b bVar) {
            this.f64775a = bVar;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
            r5 = com.ss.android.ugc.trill.R.string.hl0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
            r5 = com.ss.android.ugc.trill.R.string.b2n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) "JP", (java.lang.Object) r0) == false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.bv.b r0 = r9.f64775a
                boolean r1 = com.p683ss.android.ugc.aweme.beauty.C23780d.m58365a()
                if (r1 == 0) goto L_0x0018
                com.ss.android.ugc.aweme.property.h r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
                com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MVPBeautyNewIcon
                com.ss.android.ugc.aweme.property.aa$a r2 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r2
                boolean r1 = r1.mo83103a(r2)
                if (r1 == 0) goto L_0x0018
                r1 = 2131953163(0x7f13060b, float:1.954279E38)
                goto L_0x001b
            L_0x0018:
                r1 = 2131953621(0x7f1307d5, float:1.9543718E38)
            L_0x001b:
                com.ss.android.ugc.gamora.recorder.p.b r2 = new com.ss.android.ugc.gamora.recorder.p.b
                r3 = 4
                com.ss.android.ugc.aweme.bv.b$g r4 = new com.ss.android.ugc.aweme.bv.b$g
                r4.<init>(r0)
                com.ss.android.ugc.gamora.recorder.p.a r4 = (com.p683ss.android.ugc.gamora.recorder.p2482p.C49940a) r4
                boolean r0 = r0.f64764h
                r5 = 2132549552(0x7f1c1fb0, float:2.075241E38)
                r6 = 2132549551(0x7f1c1faf, float:2.0752408E38)
                r7 = 2132544681(0x7f1c0ca9, float:2.074253E38)
                if (r0 == 0) goto L_0x008c
                com.ss.android.ugc.aweme.s r0 = com.p683ss.android.ugc.aweme.C27982s.f73409b
                com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.h r0 = r0.mo58583n()
                com.ss.android.ugc.aweme.property.h$a r8 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioBeautyButtonTitleStrategy
                com.ss.android.ugc.aweme.property.aa$a r8 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r8
                int r0 = r0.mo83104b(r8)
                switch(r0) {
                    case 1: goto L_0x006f;
                    case 2: goto L_0x006b;
                    case 3: goto L_0x008d;
                    default: goto L_0x0047;
                }
            L_0x0047:
                com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.in.v r0 = r0.mo58590u()
                java.lang.String r0 = r0.mo74214a()
                java.lang.String r8 = "CameraClient.getAPI().locationService.region"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r8)
                if (r0 == 0) goto L_0x0084
                java.lang.String r0 = r0.toUpperCase()
                java.lang.String r8 = "(this as java.lang.String).toUpperCase()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r8)
                java.util.ArrayList<java.lang.String> r8 = com.p683ss.android.ugc.aweme.C27982s.f73408a
                boolean r8 = r8.contains(r0)
                if (r8 == 0) goto L_0x0073
            L_0x006b:
                r5 = 2132549551(0x7f1c1faf, float:2.0752408E38)
                goto L_0x008d
            L_0x006f:
                r5 = 2132544681(0x7f1c0ca9, float:2.074253E38)
                goto L_0x008d
            L_0x0073:
                java.lang.String r6 = "BR"
                boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
                if (r6 != 0) goto L_0x008d
                java.lang.String r6 = "JP"
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
                if (r0 == 0) goto L_0x006f
                goto L_0x008d
            L_0x0084:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x008c:
                r5 = -1
            L_0x008d:
                r2.<init>(r3, r1, r4, r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1481bv.C24397b.C24398a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$aa */
    static final class C24399aa extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64776a;

        C24399aa(C24397b bVar) {
            this.f64776a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            int i2;
            C24397b bVar = this.f64776a;
            boolean a = C39618d.f101151O.mo83117a(C40796a.SpeedPanelOpen);
            if (a) {
                i = R.drawable.aki;
            } else {
                i = R.drawable.akh;
            }
            C49940a sVar = new C24421s(bVar);
            if (!bVar.f64764h) {
                i2 = -1;
            } else if (a) {
                i2 = R.string.dli;
            } else {
                i2 = R.string.dlh;
            }
            return new C49971b(1, i, sVar, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$ab */
    static final class C24400ab extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64777a;

        C24400ab(C24397b bVar) {
            this.f64777a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            int i2;
            C24397b bVar = this.f64777a;
            if (bVar.f64762f.mo96752c().f107089ao) {
                i = R.drawable.akp;
            } else {
                i = R.drawable.ako;
            }
            C49940a tVar = new C24422t(bVar);
            if (bVar.f64764h) {
                i2 = R.string.aub;
            } else {
                i2 = -1;
            }
            return new C49971b(10, i, tVar, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$ac */
    static final class C24401ac extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64778a;

        C24401ac(C24397b bVar) {
            this.f64778a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            int i2;
            C24397b bVar = this.f64778a;
            if (bVar.f64762f.mo96755f().mo91320Z()) {
                i = R.drawable.aju;
            } else {
                i = R.drawable.ajt;
            }
            C49940a uVar = new C24423u(bVar);
            if (bVar.f64764h) {
                i2 = R.string.ffd;
            } else {
                i2 = -1;
            }
            return new C49971b(8, i, uVar, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$b */
    static final class C24402b extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64779a;

        C24402b(C24397b bVar) {
            this.f64779a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            int i2;
            C24397b bVar = this.f64779a;
            if (((C39666o) C26888e.m65000a(bVar.f64762f.mo96751b(), C39666o.class)).mo48463e(3) == 3) {
                i = R.drawable.akr;
            } else {
                i = R.drawable.akq;
            }
            C49940a hVar = new C24408h(bVar);
            if (bVar.f64764h) {
                i2 = R.string.aj4;
            } else {
                i2 = -1;
            }
            return new C49971b(5, i, hVar, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$c */
    static final class C24403c extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64780a;

        C24403c(C24397b bVar) {
            this.f64780a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            C24397b bVar = this.f64780a;
            C49940a iVar = new C24409i(bVar);
            if (bVar.f64764h) {
                i = R.string.ani;
            } else {
                i = -1;
            }
            return new C49971b(9, R.drawable.ajz, iVar, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$d */
    static final class C24404d extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64781a;

        C24404d(C24397b bVar) {
            this.f64781a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            C24397b bVar = this.f64781a;
            C49940a jVar = new C24410j(bVar);
            if (bVar.f64764h) {
                i = R.string.g_x;
            } else {
                i = -1;
            }
            return new C49971b(6, R.drawable.d1c, jVar, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$e */
    static final class C24405e extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64782a;

        C24405e(C24397b bVar) {
            this.f64782a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            C24397b bVar = this.f64782a;
            C49940a kVar = new C24411k(bVar);
            if (bVar.f64764h) {
                i = R.string.b2m;
            } else {
                i = -1;
            }
            return new C49971b(3, R.drawable.adw, kVar, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$f */
    static final class C24406f extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64783a;

        C24406f(C24397b bVar) {
            this.f64783a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            C24397b bVar = this.f64783a;
            C49940a lVar = new C24412l(bVar);
            if (bVar.f64764h) {
                i = R.string.b3s;
            } else {
                i = -1;
            }
            return new C49971b(11, R.drawable.ak9, lVar, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$g */
    public static final class C24407g implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64784a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24407g(C24397b bVar) {
            this.f64784a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            C49568a aVar = (C49568a) C2755a.m7851a(this.f64784a.f64762f.mo96751b()).mo7339a(C49568a.class);
            aVar.mo97479a(!aVar.mo97480b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$h */
    public static final class C24408h implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64785a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24408h(C24397b bVar) {
            this.f64785a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            C26890h.m65011a("count_down", C23089d.m56640a().mo47829a("creation_id", this.f64785a.f64762f.mo96752c().f107131x).mo47829a("shoot_way", this.f64785a.f64762f.mo96752c().f107132y).mo47826a("draft_id", this.f64785a.f64762f.mo96752c().f107022A).mo47829a("enter_from", "video_shoot_page").f61491a);
            ((C42501a) this.f64785a.f64763g.mo23372a(C42501a.class)).mo86707a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$i */
    public static final class C24409i implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64786a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24409i(C24397b bVar) {
            this.f64786a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            IRecordingOperationPanel a = this.f64786a.f64762f.mo96750a();
            if (a != null) {
                ((C42562ct) a).mo86791d().mo86534a(new C47336q(0));
                ((C49850a) this.f64786a.f64763g.mo23372a(C49850a.class)).mo97681b(true);
                C26890h.onEvent(MobClick.obtain().setEventName("music_edit").setLabelName("shoot_page").setJsonObject((JSONObject) this.f64786a.f64762f.mo96758i().get()));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.PlanC");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$j */
    public static final class C24410j implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64787a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24410j(C24397b bVar) {
            this.f64787a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            ((C43244d) this.f64787a.f64763g.mo23372a(C43244d.class)).mo87913a(true);
            C26890h.m65011a("click_layout_entrance", C23089d.m56640a().mo47829a("creation_id", this.f64787a.f64762f.mo96752c().f107131x).mo47829a("shoot_way", this.f64787a.f64762f.mo96752c().f107132y).mo47829a("enter_from", "video_shoot_page").mo47829a("content_type", this.f64787a.f64762f.mo96752c().mo86370k().getContentType()).mo47829a("content_source", this.f64787a.f64762f.mo96752c().mo86370k().getContentSource()).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$k */
    public static final class C24411k implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64788a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24411k(C24397b bVar) {
            this.f64788a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            ((C49745b) C2755a.m7851a(this.f64788a.f64762f.mo96751b()).mo7339a(C49745b.class)).mo97629a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$l */
    public static final class C24412l implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64789a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24412l(C24397b bVar) {
            this.f64789a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            String str;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            int X = this.f64789a.f64762f.mo96755f().mo91318X();
            this.f64789a.f64762f.mo96755f().mo91323a(X);
            bVar.f125194g = true;
            bVar.f125189b = CameraModule.f112399i.get(X);
            String str2 = "light";
            C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f64789a.f64762f.mo96752c().f107131x).mo47829a("shoot_way", this.f64789a.f64762f.mo96752c().f107132y).mo47826a("draft_id", this.f64789a.f64762f.mo96752c().f107022A);
            String str3 = "to_status";
            if (X == 0) {
                str = "off";
            } else {
                str = "on";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$m */
    public static final class C24413m implements C49940a {

        /* renamed from: a */
        public boolean f64790a;

        /* renamed from: b */
        final /* synthetic */ C24397b f64791b;

        /* renamed from: c */
        final /* synthetic */ boolean f64792c;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24413m(C24397b bVar, boolean z) {
            this.f64791b = bVar;
            this.f64792c = z;
            this.f64790a = z;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            int i;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            this.f64790a = !this.f64790a;
            ((C42451a) this.f64791b.f64763g.mo23372a(C42451a.class)).mo86559b(this.f64790a);
            if (this.f64790a) {
                i = R.drawable.ajx;
            } else {
                i = R.drawable.ajw;
            }
            bVar.f125189b = i;
            ((C49951e) this.f64791b.f64763g.mo23372a(C49951e.class)).mo97757a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$n */
    public static final class C24414n implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64793a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24414n(C24397b bVar) {
            this.f64793a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            int i;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            if (bVar.f125191d) {
                if (this.f64793a.f64762f.mo96752c().f107040S) {
                    i = 1;
                } else {
                    i = 2;
                }
                this.f64793a.f64762f.mo96755f().mo91333a(new C47347v(i));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$o */
    public static final class C24415o implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64794a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24415o(C24397b bVar) {
            this.f64794a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            ((C49951e) C2755a.m7851a(this.f64794a.f64762f.mo96751b()).mo7339a(C49951e.class)).mo97759a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$p */
    static final class C24416p implements C49972a {

        /* renamed from: a */
        public static final C24416p f64795a = new C24416p();

        C24416p() {
        }

        /* renamed from: a */
        public final void mo50183a(final View view) {
            view.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new Runnable() {
                public final void run() {
                    View view = view;
                    C52711k.m112236a((Object) view, "targetView");
                    view.setRotation(0.0f);
                    View view2 = view;
                    C52711k.m112236a((Object) view2, "targetView");
                    view2.setEnabled(false);
                }
            }).withEndAction(new Runnable() {
                public final void run() {
                    View view = view;
                    C52711k.m112236a((Object) view, "targetView");
                    view.setRotation(0.0f);
                    View view2 = view;
                    C52711k.m112236a((Object) view2, "targetView");
                    view2.setEnabled(true);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$q */
    public static final class C24419q implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64798a;

        C24419q(C24397b bVar) {
            this.f64798a = bVar;
        }

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            if (bVar.f125197j) {
                C10691a.m21551c((Context) this.f64798a.f64762f.mo96751b(), this.f64798a.f64762f.mo96751b().getResources().getString(R.string.d51)).mo19066a();
            }
            return false;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            if (!C44894b.f113619a) {
                this.f64798a.f64762f.mo96755f().mo91355b(false);
                this.f64798a.f64762f.mo96755f().mo91357c(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$r */
    public static final class C24420r implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64799a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24420r(C24397b bVar) {
            this.f64799a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            String str;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            if (!C44894b.f113619a) {
                boolean z = !C20455b.m50914a(this.f64799a.f64762f.mo96751b(), C39618d.f101151O.mo83118b(C40796a.ShakeFreeWhiteList));
                this.f64799a.f64762f.mo96755f().mo91361e(z);
                String str2 = "click_anti_shake";
                C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f64799a.f64762f.mo96752c().f107131x).mo47829a("shoot_way", this.f64799a.f64762f.mo96752c().f107132y).mo47829a("enter_from", "video_shoot_page");
                String str3 = "to_status";
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).mo47826a("draft_id", this.f64799a.f64762f.mo96752c().f107022A).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$s */
    public static final class C24421s implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64800a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model1");
            return false;
        }

        C24421s(C24397b bVar) {
            this.f64800a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            String str;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model1");
            ((C49912d) this.f64800a.f64763g.mo23372a(C49912d.class)).mo97721a(!C39618d.f101151O.mo83117a(C40796a.SpeedPanelOpen));
            C26890h.onEvent(MobClick.obtain().setEventName("speed_edit").setLabelName("shoot_page").setJsonObject((JSONObject) this.f64800a.f64762f.mo96758i().get()));
            String str2 = "edit_speed";
            C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f64800a.f64762f.mo96752c().f107131x).mo47829a("shoot_way", this.f64800a.f64762f.mo96752c().f107132y).mo47826a("draft_id", this.f64800a.f64762f.mo96752c().f107022A);
            String str3 = "to_status";
            if (C39618d.f101151O.mo83117a(C40796a.SpeedPanelOpen)) {
                str = "show";
            } else {
                str = "hide";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$t */
    public static final class C24422t implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64801a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24422t(C24397b bVar) {
            this.f64801a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            this.f64801a.f64762f.mo96755f().mo91327a(new C46807aa(this.f64801a.f64762f.mo96752c().f107089ao, this.f64801a.f64762f.mo96752c().f107088an));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$u */
    public static final class C24423u implements C49940a {

        /* renamed from: a */
        final /* synthetic */ C24397b f64802a;

        /* renamed from: a */
        public final boolean mo50182a(C49971b bVar) {
            C52711k.m112240b(bVar, "model");
            return false;
        }

        C24423u(C24397b bVar) {
            this.f64802a = bVar;
        }

        /* renamed from: a */
        public final void mo50181a(View view, C49971b bVar) {
            String str;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bVar, "model");
            if (!C44894b.f113619a) {
                boolean Z = this.f64802a.f64762f.mo96755f().mo91320Z();
                this.f64802a.f64762f.mo96755f().mo91341aa();
                String str2 = "wide_angle";
                C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f64802a.f64762f.mo96752c().f107131x).mo47829a("shoot_way", this.f64802a.f64762f.mo96752c().f107132y).mo47829a("enter_from", "video_shoot_page");
                String str3 = "to_status";
                if (Z) {
                    str = "off";
                } else {
                    str = "on";
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$v */
    static final class C24424v extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64803a;

        C24424v(C24397b bVar) {
            this.f64803a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            int i2;
            C24397b bVar = this.f64803a;
            boolean a = C43774ee.m96217a().mo86509a();
            if (a) {
                i = R.drawable.ajx;
            } else {
                i = R.drawable.ajw;
            }
            C49940a mVar = new C24413m(bVar, a);
            if (bVar.f64764h) {
                i2 = R.string.qy;
            } else {
                i2 = -1;
            }
            return new C49971b(2, i, mVar, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$w */
    static final class C24425w extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64804a;

        C24425w(C24397b bVar) {
            this.f64804a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            boolean z;
            int i2;
            int i3;
            C24397b bVar = this.f64804a;
            int b = C39618d.f101151O.mo83118b(C40796a.DefaultMicrophoneState);
            boolean z2 = false;
            if (C43236a.m94873a(bVar.f64762f.mo96752c())) {
                b = 0;
            }
            if (bVar.f64762f.mo96752c().mo86362d()) {
                if (bVar.f64762f.mo96752c().f107119l.size() <= 0) {
                    z2 = true;
                }
                if (bVar.f64762f.mo96752c().f107040S) {
                    i = 2;
                } else {
                    i = 1;
                }
                z = z2;
            } else {
                z = true;
            }
            if (!z) {
                if (i == 1) {
                    i2 = R.drawable.d4_;
                } else {
                    i2 = R.drawable.d49;
                }
            } else if (i == 1) {
                i2 = R.drawable.akd;
            } else {
                i2 = R.drawable.akc;
            }
            C49940a nVar = new C24414n(bVar);
            if (bVar.f64764h) {
                i3 = R.string.c69;
            } else {
                i3 = -1;
            }
            C49971b bVar2 = new C49971b(7, i2, nVar, i3, z);
            return bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$x */
    static final class C24426x extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64805a;

        C24426x(C24397b bVar) {
            this.f64805a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            C24397b bVar = this.f64805a;
            C49940a oVar = new C24415o(bVar);
            if (bVar.f64764h) {
                i = R.string.c7h;
            } else {
                i = -1;
            }
            return new C49971b(13, R.drawable.ake, oVar, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$y */
    static final class C24427y extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64806a;

        C24427y(C24397b bVar) {
            this.f64806a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            C24397b bVar = this.f64806a;
            C49940a qVar = new C24419q(bVar);
            if (bVar.f64764h) {
                i = R.string.d8u;
            } else {
                i = -1;
            }
            C49971b bVar2 = new C49971b(0, R.drawable.aka, qVar, i);
            bVar2.f125196i = C24416p.f64795a;
            return bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.b$z */
    static final class C24428z extends C52712l implements C52670a<C49971b> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64807a;

        C24428z(C24397b bVar) {
            this.f64807a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            int i2;
            C24397b bVar = this.f64807a;
            if (C20455b.m50914a(bVar.f64762f.mo96751b(), C39618d.f101151O.mo83118b(C40796a.ShakeFreeWhiteList))) {
                i = R.drawable.akk;
            } else {
                i = R.drawable.akj;
            }
            C49940a rVar = new C24420r(bVar);
            if (bVar.f64764h) {
                i2 = R.string.dhc;
            } else {
                i2 = -1;
            }
            return new C49971b(12, i, rVar, i2);
        }
    }

    /* renamed from: a */
    public final C49971b mo50171a() {
        return (C49971b) this.f64765i.getValue();
    }

    /* renamed from: b */
    public final C49971b mo50172b() {
        return (C49971b) this.f64766j.getValue();
    }

    /* renamed from: c */
    public final C49971b mo50173c() {
        return (C49971b) this.f64767k.getValue();
    }

    /* renamed from: d */
    public final C49971b mo50174d() {
        return (C49971b) this.f64768l.getValue();
    }

    /* renamed from: e */
    public final C49971b mo50175e() {
        return (C49971b) this.f64769m.getValue();
    }

    /* renamed from: f */
    public final C49971b mo50176f() {
        return (C49971b) this.f64770n.getValue();
    }

    /* renamed from: g */
    public final C49971b mo50177g() {
        return (C49971b) this.f64771o.getValue();
    }

    /* renamed from: h */
    public final C49971b mo50178h() {
        return (C49971b) this.f64772p.getValue();
    }

    /* renamed from: i */
    public final C49971b mo50179i() {
        return (C49971b) this.f64773q.getValue();
    }

    /* renamed from: j */
    public final C49971b mo50180j() {
        return (C49971b) this.f64774r.getValue();
    }

    public C24397b(C48923a aVar, C12361b bVar, boolean z) {
        C52711k.m112240b(aVar, "recordEnv");
        C52711k.m112240b(bVar, "diContainer");
        this.f64762f = aVar;
        this.f64763g = bVar;
        this.f64764h = z;
    }
}
