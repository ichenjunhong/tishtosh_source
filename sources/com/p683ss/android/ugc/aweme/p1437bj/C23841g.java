package com.p683ss.android.ugc.aweme.p1437bj;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2767k;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.comment_sticker.C25465a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.photo.C38655c;
import com.p683ss.android.ugc.aweme.photo.C38692p;
import com.p683ss.android.ugc.aweme.photo.PhotoModule;
import com.p683ss.android.ugc.aweme.photo.PhotoModule.C38650a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43904f;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.tools.C46809ac;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49576a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49579d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j.C49606a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.bj.g */
public final class C23841g implements C49548a, C49576a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63502a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23841g.class), "photoModule", "getPhotoModule()Lcom/ss/android/ugc/aweme/photo/PhotoModule;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23841g.class), "photoScene", "getPhotoScene()Lcom/ss/android/ugc/aweme/servicimpl/PhotoBottomTabModule$PhotoScene;"))};

    /* renamed from: b */
    public ShortVideoContextViewModel f63503b;

    /* renamed from: c */
    public C45004a f63504c;

    /* renamed from: d */
    public C48923a f63505d;

    /* renamed from: e */
    public RecordStatusViewModel f63506e;

    /* renamed from: f */
    public final C23422a f63507f = new C23847e(this);

    /* renamed from: g */
    private C46809ac f63508g;

    /* renamed from: h */
    private final C52668f f63509h = C52732g.m112285a(new C23848f(this));

    /* renamed from: i */
    private final C52668f f63510i = C52732g.m112285a(new C23849g(this));

    /* renamed from: j */
    private final String f63511j;

    /* renamed from: k */
    private final String f63512k;

    /* renamed from: l */
    private final String f63513l;

    /* renamed from: m */
    private final boolean f63514m = false;

    /* renamed from: com.ss.android.ugc.aweme.bj.g$a */
    public final class C23842a extends C49604i {
        /* renamed from: F */
        public final String mo49446F() {
            return "PhotoScene";
        }

        /* renamed from: G */
        public final void mo49447G() {
        }

        /* renamed from: H */
        public final void mo49448H() {
        }

        /* renamed from: q */
        public final void mo24470q() {
            super.mo24470q();
            FragmentActivity b = C23841g.m58522a(C23841g.this).mo96751b();
            if (b != null) {
                ((C23441t) b).mo48606b(C23841g.this.f63507f);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
        }

        public C23842a() {
        }

        /* renamed from: e */
        public final void mo24448e(Bundle bundle) {
            super.mo24448e(bundle);
            FragmentActivity b = C23841g.m58522a(C23841g.this).mo96751b();
            if (b != null) {
                ((C23441t) b).mo48605a(C23841g.this.f63507f);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
        }

        /* renamed from: a */
        public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            C52711k.m112240b(layoutInflater, "inflater");
            C52711k.m112240b(viewGroup, "container");
            return new View(mo24476u());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bj.g$b */
    public static final class C23843b implements C49605j {

        /* renamed from: a */
        final /* synthetic */ C23841g f63516a;

        /* renamed from: b */
        final /* synthetic */ C48923a f63517b;

        C23843b(C23841g gVar, C48923a aVar) {
            this.f63516a = gVar;
            this.f63517b = aVar;
        }

        /* renamed from: b */
        public final boolean mo49420b(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            C23841g.m58523b(this.f63516a).mo86388b(false);
            return true;
        }

        /* renamed from: a */
        public final boolean mo49419a(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            this.f63517b.mo96757h().mo86555a("record");
            ApiCenter a = C2755a.m7851a(this.f63517b.mo96751b());
            ((C43859a) a.mo7339a(C43859a.class)).mo89400c(true);
            ((C49912d) a.mo7339a(C49912d.class)).mo97721a(false);
            C23841g.m58523b(this.f63516a).mo86388b(true);
            C23841g.m58524c(this.f63516a).mo91323a(0);
            ((C49860a) a.mo7339a(C49860a.class)).mo97685a(1, true);
            C39618d.f101162c.mo74150a(this.f63517b.mo96752c().f107132y, "photo_shoot");
            C23841g gVar = this.f63516a;
            C43214dh a2 = C43214dh.m94817a();
            C52711k.m112236a((Object) a2, "PublishManager.inst()");
            C43804f fVar = a2.f109289d;
            if (fVar != null) {
                C48923a aVar2 = gVar.f63505d;
                if (aVar2 == null) {
                    C52711k.m112237a("tabEnv");
                }
                C10691a.m21548c((Context) aVar2.mo96751b(), (int) R.string.gts).mo19066a();
                C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "11").mo47829a("task_id", fVar.f110924a).f61491a);
            }
            ((C49860a) a.mo7339a(C49860a.class)).mo97693c(false);
            RecordStatusViewModel recordStatusViewModel = this.f63516a.f63506e;
            if (recordStatusViewModel == null) {
                C52711k.m112237a("recordStatusViewModel");
            }
            recordStatusViewModel.mo92167l().setValue(Boolean.valueOf(false));
            C25465a aVar3 = (C25465a) a.mo7341b(C25465a.class);
            if (aVar3 != null) {
                aVar3.mo52059a(false);
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bj.g$c */
    static final class C23844c implements C38650a {

        /* renamed from: a */
        final /* synthetic */ C23841g f63518a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f63519b;

        /* renamed from: c */
        final /* synthetic */ C43904f f63520c;

        /* renamed from: d */
        final /* synthetic */ C52668f f63521d;

        /* renamed from: e */
        final /* synthetic */ C42451a f63522e;

        /* renamed from: com.ss.android.ugc.aweme.bj.g$c$a */
        public static final class C23845a implements C31406ai {

            /* renamed from: a */
            final /* synthetic */ C23844c f63523a;

            C23845a(C23844c cVar) {
                this.f63523a = cVar;
            }

            /* renamed from: a */
            public final float mo49450a(String str) {
                C52711k.m112240b(str, "filterPath");
                C44885g gVar = C23841g.m58522a(this.f63523a.f63518a).f123098n;
                if (gVar == null) {
                    C52711k.m112237a("videoRecorder");
                }
                return gVar.mo91030b(str);
            }
        }

        C23844c(C23841g gVar, ShortVideoContext shortVideoContext, C43904f fVar, C52668f fVar2, C42451a aVar) {
            this.f63518a = gVar;
            this.f63519b = shortVideoContext;
            this.f63520c = fVar;
            this.f63521d = fVar2;
            this.f63522e = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b9, code lost:
            if (r2 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x020a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x020f  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0212  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0267  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0281  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0299  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x02ca  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x02cf  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x02e8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49449a(java.lang.String r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.f63519b
                java.lang.String r2 = r2.f107131x
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.f63519b
                java.lang.String r2 = r2.f107132y
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "draft_id"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.f63519b
                int r2 = r2.f107022A
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.lang.String r1 = "camera"
                com.ss.android.ugc.aweme.bj.g r2 = r9.f63518a
                com.ss.android.ugc.aweme.shortvideo.ui.b.a r2 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58524c(r2)
                int r2 = r2.mo91315U()
                r3 = 1
                if (r2 != r3) goto L_0x0034
                java.lang.String r2 = "front"
                goto L_0x0036
            L_0x0034:
                java.lang.String r2 = "back"
            L_0x0036:
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "filter_name"
                com.ss.android.ugc.aweme.shortvideo.j.f r2 = r9.f63520c
                com.ss.android.ugc.aweme.shortvideo.j.a r2 = r2.mo89445c()
                com.ss.android.ugc.aweme.shortvideo.j.h r2 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r2
                java.lang.String r4 = "filterModule.filterFunc"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
                com.ss.android.ugc.aweme.filter.g r2 = r2.mo89440e()
                java.lang.String r4 = "filterModule.filterFunc.curFilter"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
                java.lang.String r2 = r2.f82326c
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "filter_id"
                com.ss.android.ugc.aweme.shortvideo.j.f r2 = r9.f63520c
                com.ss.android.ugc.aweme.shortvideo.j.a r2 = r2.mo89445c()
                com.ss.android.ugc.aweme.shortvideo.j.h r2 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r2
                java.lang.String r4 = "filterModule.filterFunc"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
                com.ss.android.ugc.aweme.filter.g r2 = r2.mo89440e()
                java.lang.String r4 = "filterModule.filterFunc.curFilter"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
                int r2 = r2.f82324a
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.lang.String r1 = "record_mode"
                java.lang.String r2 = "photo"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "prop_id"
                d.f r2 = r9.f63521d
                java.lang.Object r2 = r2.getValue()
                com.ss.android.ugc.gamora.recorder.sticker.a.n r2 = (com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n) r2
                if (r2 == 0) goto L_0x0099
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = r2.mo97798C()
                if (r2 == 0) goto L_0x0099
                long r4 = r2.getStickerId()
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                goto L_0x009b
            L_0x0099:
                java.lang.String r2 = ""
            L_0x009b:
                java.lang.String r2 = r2.toString()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "prop_index"
                d.f r2 = r9.f63521d
                java.lang.Object r2 = r2.getValue()
                com.ss.android.ugc.gamora.recorder.sticker.a.n r2 = (com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n) r2
                if (r2 == 0) goto L_0x00bb
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = r2.mo97798C()
                if (r2 == 0) goto L_0x00bb
                java.lang.String r2 = r2.getGradeKey()
                if (r2 != 0) goto L_0x00bd
            L_0x00bb:
                java.lang.String r2 = ""
            L_0x00bd:
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "smooth"
                com.ss.android.ugc.aweme.shortvideo.beauty.a r2 = r9.f63522e
                int r2 = r2.mo86584i()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.lang.String r1 = "eyes"
                com.ss.android.ugc.aweme.shortvideo.beauty.a r2 = r9.f63522e
                int r2 = r2.mo86585k()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.lang.String r1 = "shape"
                com.ss.android.ugc.aweme.shortvideo.beauty.a r2 = r9.f63522e
                int r2 = r2.mo86586l()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.lang.String r1 = "tanning"
                com.ss.android.ugc.aweme.shortvideo.beauty.a r2 = r9.f63522e
                int r2 = r2.mo86589o()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                com.ss.android.ugc.aweme.property.h r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
                com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableFilterIntensityJust
                com.ss.android.ugc.aweme.property.aa$a r2 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r2
                boolean r1 = r1.mo83103a(r2)
                r2 = 0
                if (r1 == 0) goto L_0x0166
                com.ss.android.ugc.aweme.bj.g r1 = r9.f63518a
                com.ss.android.ugc.gamora.a.a r1 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58522a(r1)
                java.lang.String r1 = r1.f123099o
                if (r1 != 0) goto L_0x010d
                java.lang.String r4 = "filterIntensityStoreTAG"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x010d:
                com.ss.android.ugc.aweme.filter.n r1 = com.p683ss.android.ugc.aweme.filter.C31475n.C31476a.m73313a(r1)
                com.ss.android.ugc.aweme.filter.ah r1 = (com.p683ss.android.ugc.aweme.filter.C31405ah) r1
                com.ss.android.ugc.aweme.shortvideo.j.f r4 = r9.f63520c
                com.ss.android.ugc.aweme.shortvideo.j.a r4 = r4.mo89445c()
                com.ss.android.ugc.aweme.shortvideo.j.h r4 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r4
                java.lang.String r5 = "filterModule.filterFunc"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                com.ss.android.ugc.aweme.filter.g r4 = r4.mo89440e()
                java.lang.String r5 = "filterBean"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                com.ss.android.ugc.aweme.bj.g$c$a r5 = new com.ss.android.ugc.aweme.bj.g$c$a
                r5.<init>(r9)
                com.ss.android.ugc.aweme.filter.ai r5 = (com.p683ss.android.ugc.aweme.filter.C31406ai) r5
                float r1 = com.p683ss.android.ugc.aweme.filter.C31460h.m73279a(r4, r1, r5)
                java.lang.String r5 = "filter_value"
                java.lang.Float r6 = java.lang.Float.valueOf(r1)
                r0.mo47828a(r5, r6)
                float r5 = r4.f82334k
                float r5 = r5 - r1
                float r1 = java.lang.Math.abs(r5)
                double r5 = (double) r1
                r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 < 0) goto L_0x0159
                float r1 = r4.f82334k
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x0157
                goto L_0x0159
            L_0x0157:
                r1 = 0
                goto L_0x015a
            L_0x0159:
                r1 = 1
            L_0x015a:
                java.lang.String r4 = "is_original_filter"
                if (r1 == 0) goto L_0x0161
                java.lang.String r1 = "1"
                goto L_0x0163
            L_0x0161:
                java.lang.String r1 = "0"
            L_0x0163:
                r0.mo47829a(r4, r1)
            L_0x0166:
                java.lang.String r1 = "record_video"
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r0)
                com.ss.android.ugc.aweme.bj.g r0 = r9.f63518a
                com.ss.android.ugc.gamora.a.a r0 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58522a(r0)
                com.ss.android.ugc.aweme.shortvideo.beauty.a r0 = r0.mo96757h()
                com.ss.android.ugc.aweme.tools.beauty.c.g r0 = r0.mo86562d()
                com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo r0 = r0.mo94112k()
                com.p683ss.android.ugc.aweme.beauty.C23778b.m58357d(r0)
                int r0 = com.p683ss.android.ugc.aweme.photo.C38681j.f98387a
                int r1 = com.p683ss.android.ugc.aweme.photo.C38681j.f98388b
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r9.f63519b
                java.lang.String r4 = r4.f107131x
                com.ss.android.ugc.aweme.photo.PhotoContext r10 = com.p683ss.android.ugc.aweme.photo.PhotoContext.fromCapture(r10, r0, r1, r4)
                com.ss.android.ugc.aweme.filter.repository.a.n r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.m88215d()
                java.lang.String r1 = "AVEnv.getFilterSources()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.shortvideo.j.f r1 = r9.f63520c
                com.ss.android.ugc.aweme.shortvideo.j.a r1 = r1.mo89445c()
                com.ss.android.ugc.aweme.shortvideo.j.h r1 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r1
                java.lang.String r4 = "filterModule.filterFunc"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
                com.ss.android.ugc.aweme.filter.g r1 = r1.mo89440e()
                int r0 = com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c.m73323a(r0, r1)
                r10.mFilterIndex = r0
                com.ss.android.ugc.aweme.shortvideo.j.f r0 = r9.f63520c
                com.ss.android.ugc.aweme.shortvideo.j.a r0 = r0.mo89445c()
                com.ss.android.ugc.aweme.shortvideo.j.h r0 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r0
                java.lang.String r1 = "filterModule.filterFunc"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.filter.g r0 = r0.mo89440e()
                java.lang.String r1 = "filterModule.filterFunc.curFilter"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                java.lang.String r0 = r0.f82325b
                r10.mFilterName = r0
                com.ss.android.ugc.aweme.shortvideo.j.f r0 = r9.f63520c
                com.ss.android.ugc.aweme.shortvideo.j.a r0 = r0.mo89445c()
                com.ss.android.ugc.aweme.shortvideo.j.h r0 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r0
                java.lang.String r1 = "filterModule.filterFunc"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.filter.g r0 = r0.mo89440e()
                java.lang.String r1 = "filterModule.filterFunc.curFilter"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                int r0 = r0.f82324a
                r10.mFilterId = r0
                com.ss.android.ugc.aweme.shortvideo.beauty.a r0 = r9.f63522e
                int r0 = r0.mo86586l()
                float r0 = (float) r0
                r10.mBigEyesRate = r0
                com.ss.android.ugc.aweme.shortvideo.beauty.a r0 = r9.f63522e
                int r0 = r0.mo86584i()
                float r0 = (float) r0
                r10.mSmoothSkinRate = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f63519b
                java.lang.String r0 = r0.f107132y
                r10.mShootWay = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f63519b
                int r0 = r0.f107022A
                r10.draftId = r0
                d.f r0 = r9.f63521d
                java.lang.Object r0 = r0.getValue()
                com.ss.android.ugc.gamora.recorder.sticker.a.n r0 = (com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n) r0
                if (r0 == 0) goto L_0x020f
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = r0.mo97798C()
                goto L_0x0210
            L_0x020f:
                r0 = 0
            L_0x0210:
                if (r0 == 0) goto L_0x0238
                long r4 = r0.getStickerId()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                r10.mStickers = r1
                com.ss.android.ugc.aweme.shortvideo.ui.aq r1 = r0.getStickerPoi()
                if (r1 == 0) goto L_0x0232
                com.ss.android.ugc.aweme.draft.model.e r1 = new com.ss.android.ugc.aweme.draft.model.e
                com.ss.android.ugc.aweme.shortvideo.ui.aq r4 = r0.getStickerPoi()
                java.lang.String r5 = "currentSticker.stickerPoi"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                r1.<init>(r4)
                r10.defaultSelectStickerPoi = r1
            L_0x0232:
                java.lang.String r0 = r0.getPropSource()
                r10.mPropSource = r0
            L_0x0238:
                com.ss.android.ugc.aweme.bj.g r0 = r9.f63518a
                com.ss.android.ugc.aweme.shortvideo.ui.b.a r0 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58524c(r0)
                int r0 = r0.mo91315U()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r10.mCamera = r0
                com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                java.lang.String r1 = "PublishManager.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = r0.f109287b
                r10.challenges = r0
                com.ss.android.ugc.aweme.bj.g r0 = r9.f63518a
                com.ss.android.ugc.aweme.shortvideo.ui.b.a r0 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58524c(r0)
                com.bytedance.als.f r0 = r0.mo91370q()
                java.lang.Object r0 = r0.mo7348a()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                if (r0 != 0) goto L_0x026b
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            L_0x026b:
                boolean r0 = r0.booleanValue()
                com.ss.android.ugc.aweme.bj.g r1 = r9.f63518a
                com.ss.android.ugc.aweme.shortvideo.ui.b.a r1 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58524c(r1)
                com.bytedance.als.f r1 = r1.mo91371r()
                java.lang.Object r1 = r1.mo7348a()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                if (r1 != 0) goto L_0x0285
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            L_0x0285:
                boolean r1 = r1.booleanValue()
                com.ss.android.ugc.aweme.bj.g r4 = r9.f63518a
                com.ss.android.ugc.aweme.shortvideo.ui.b.a r4 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58524c(r4)
                com.bytedance.als.f r4 = r4.mo91368o()
                java.lang.Object r4 = r4.mo7348a()
                if (r4 == 0) goto L_0x02c2
                com.ss.android.ugc.aweme.bj.g r4 = r9.f63518a
                com.ss.android.ugc.aweme.shortvideo.ui.b.a r4 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58524c(r4)
                com.bytedance.als.f r4 = r4.mo91368o()
                java.lang.Object r4 = r4.mo7348a()
                if (r4 != 0) goto L_0x02ac
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x02ac:
                d.n r4 = (p2628d.C52847n) r4
                java.lang.Object r4 = r4.getFirst()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                com.ss.android.vesdk.VECameraSettings$CAMERA_FACING_ID r5 = com.p683ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO
                int r5 = r5.ordinal()
                if (r4 != r5) goto L_0x02c2
                r4 = 1
                goto L_0x02c3
            L_0x02c2:
                r4 = 0
            L_0x02c3:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                if (r0 == 0) goto L_0x02cd
                r5.append(r3)
            L_0x02cd:
                if (r1 == 0) goto L_0x02e6
                r0 = r5
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x02da
                r0 = 1
                goto L_0x02db
            L_0x02da:
                r0 = 0
            L_0x02db:
                if (r0 == 0) goto L_0x02e2
                java.lang.String r0 = ","
                r5.append(r0)
            L_0x02e2:
                r0 = 2
                r5.append(r0)
            L_0x02e6:
                if (r4 == 0) goto L_0x02fd
                r0 = r5
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x02f2
                r2 = 1
            L_0x02f2:
                if (r2 == 0) goto L_0x02f9
                java.lang.String r0 = ","
                r5.append(r0)
            L_0x02f9:
                r0 = 3
                r5.append(r0)
            L_0x02fd:
                java.lang.String r0 = r5.toString()
                java.lang.String r1 = "result.toString()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r10.cameraLensInfo = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f63519b
                com.ss.android.ugc.aweme.tools.a.b r0 = com.p683ss.android.ugc.aweme.shortvideo.C44309n.m97061b(r0)
                com.ss.android.ugc.aweme.tools.a.a r1 = com.p683ss.android.ugc.aweme.shortvideo.C44309n.m97055a(r10)
                com.ss.android.ugc.aweme.tools.a.e r2 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.RECORD
                com.ss.android.ugc.aweme.tools.a.e r3 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.EDIT
                com.p683ss.android.ugc.aweme.tools.p2346a.C46806g.m101653a(r0, r1, r2, r3)
                com.ss.android.ugc.aweme.bj.g r0 = r9.f63518a
                com.ss.android.ugc.gamora.a.a r0 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58522a(r0)
                android.support.v4.app.FragmentActivity r0 = r0.mo96751b()
                android.content.Context r0 = (android.content.Context) r0
                com.p683ss.android.ugc.aweme.photo.edit.PhotoEditActivity.m86002a(r0, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1437bj.C23841g.C23844c.mo49449a(java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bj.g$d */
    static final class C23846d<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C23841g f63524a;

        C23846d(C23841g gVar) {
            this.f63524a = gVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            this.f63524a.mo49442b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bj.g$e */
    static final class C23847e implements C23422a {

        /* renamed from: a */
        final /* synthetic */ C23841g f63525a;

        C23847e(C23841g gVar) {
            this.f63525a = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
            if (((com.p683ss.android.ugc.aweme.sticker.types.game.C46562k) r3.f116816a.getValue()).mo93353d() != false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
            if (((com.p683ss.android.ugc.aweme.sticker.types.game.C46562k) r3.f116809b.getValue()).mo93353d() != false) goto L_0x0053;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onKeyDown(int r3, android.view.KeyEvent r4) {
            /*
                r2 = this;
                r4 = 0
                r0 = 25
                if (r3 == r0) goto L_0x0009
                r0 = 24
                if (r3 != r0) goto L_0x007c
            L_0x0009:
                com.ss.android.ugc.aweme.bj.g r3 = r2.f63525a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r3 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58523b(r3)
                boolean r3 = r3.mo86389b()
                if (r3 == 0) goto L_0x007c
                com.ss.android.ugc.aweme.bj.g r3 = r2.f63525a
                com.ss.android.ugc.gamora.a.a r3 = com.p683ss.android.ugc.aweme.p1437bj.C23841g.m58522a(r3)
                d.f r3 = r3.mo96756g()
                java.lang.Object r3 = r3.getValue()
                com.ss.android.ugc.gamora.recorder.sticker.a.n r3 = (com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n) r3
                if (r3 == 0) goto L_0x007c
                com.ss.android.ugc.aweme.sticker.presenter.f r3 = (com.p683ss.android.ugc.aweme.sticker.presenter.C46297f) r3
                java.lang.String r0 = "$this$isGameModeEnable"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                com.ss.android.ugc.aweme.sticker.d.d$b r0 = com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d.C45863b.INSTANCE
                d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
                com.ss.android.ugc.aweme.sticker.presenter.handler.k r3 = r3.mo92996a(r0)
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler
                r1 = 1
                if (r0 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler r3 = (com.p683ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler) r3
                d.f<com.ss.android.ugc.aweme.sticker.types.game.k> r0 = r3.f116816a
                boolean r0 = r0.isInitialized()
                if (r0 == 0) goto L_0x0055
                d.f<com.ss.android.ugc.aweme.sticker.types.game.k> r3 = r3.f116816a
                java.lang.Object r3 = r3.getValue()
                com.ss.android.ugc.aweme.sticker.types.game.k r3 = (com.p683ss.android.ugc.aweme.sticker.types.game.C46562k) r3
                boolean r3 = r3.mo93353d()
                if (r3 == 0) goto L_0x0055
            L_0x0053:
                r3 = 1
                goto L_0x0074
            L_0x0055:
                r3 = 0
                goto L_0x0074
            L_0x0057:
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler
                if (r0 == 0) goto L_0x0055
                com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler r3 = (com.p683ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler) r3
                d.f<com.ss.android.ugc.aweme.sticker.types.game.k> r0 = r3.f116809b
                boolean r0 = r0.isInitialized()
                if (r0 == 0) goto L_0x0055
                d.f<com.ss.android.ugc.aweme.sticker.types.game.k> r3 = r3.f116809b
                java.lang.Object r3 = r3.getValue()
                com.ss.android.ugc.aweme.sticker.types.game.k r3 = (com.p683ss.android.ugc.aweme.sticker.types.game.C46562k) r3
                boolean r3 = r3.mo93353d()
                if (r3 == 0) goto L_0x0055
                goto L_0x0053
            L_0x0074:
                if (r3 != 0) goto L_0x007c
                com.ss.android.ugc.aweme.bj.g r3 = r2.f63525a
                r3.mo49442b()
                return r1
            L_0x007c:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1437bj.C23841g.C23847e.onKeyDown(int, android.view.KeyEvent):boolean");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bj.g$f */
    static final class C23848f extends C52712l implements C52670a<PhotoModule> {

        /* renamed from: a */
        final /* synthetic */ C23841g f63526a;

        C23848f(C23841g gVar) {
            this.f63526a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C23841g gVar = this.f63526a;
            C48923a aVar = gVar.f63505d;
            if (aVar == null) {
                C52711k.m112237a("tabEnv");
            }
            ShortVideoContext c = aVar.mo96752c();
            C48923a aVar2 = gVar.f63505d;
            if (aVar2 == null) {
                C52711k.m112237a("tabEnv");
            }
            C43904f j = aVar2.mo96759j();
            C48923a aVar3 = gVar.f63505d;
            if (aVar3 == null) {
                C52711k.m112237a("tabEnv");
            }
            C52668f g = aVar3.mo96756g();
            C48923a aVar4 = gVar.f63505d;
            if (aVar4 == null) {
                C52711k.m112237a("tabEnv");
            }
            C42451a h = aVar4.mo96757h();
            C48923a aVar5 = gVar.f63505d;
            if (aVar5 == null) {
                C52711k.m112237a("tabEnv");
            }
            FragmentActivity b = aVar5.mo96751b();
            if (b != null) {
                AbsActivity absActivity = (AbsActivity) b;
                C48923a aVar6 = gVar.f63505d;
                if (aVar6 == null) {
                    C52711k.m112237a("tabEnv");
                }
                C20426a d = aVar6.mo96753d();
                C23844c cVar = new C23844c(gVar, c, j, g, h);
                return new PhotoModule(absActivity, d, cVar);
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.uikit.base.AbsActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bj.g$g */
    static final class C23849g extends C52712l implements C52670a<C23842a> {

        /* renamed from: a */
        final /* synthetic */ C23841g f63527a;

        C23849g(C23841g gVar) {
            this.f63527a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23842a();
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo49417a(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        this.f63505d = aVar;
        C0209x a = C0214z.m440a(aVar.mo96751b()).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ta…extViewModel::class.java)");
        this.f63503b = (ShortVideoContextViewModel) a;
        this.f63508g = aVar.f123086b;
        this.f63504c = aVar.mo96755f();
        C45004a aVar2 = this.f63504c;
        if (aVar2 == null) {
            C52711k.m112237a("cameraApiComponent");
        }
        aVar2.mo91348ah().mo7349a(aVar.mo96751b(), new C23846d(this));
        C0209x a2 = C0214z.m440a(aVar.mo96751b()).mo359a(RecordStatusViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f63506e = (RecordStatusViewModel) a2;
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    public final C0176h getLifecycle() {
        C48923a aVar = this.f63505d;
        if (aVar == null) {
            C52711k.m112237a("tabEnv");
        }
        C0176h lifecycle = aVar.mo96751b().getLifecycle();
        C52711k.m112236a((Object) lifecycle, "tabEnv.activity.lifecycle");
        return lifecycle;
    }

    /* renamed from: b */
    public final void mo49442b() {
        PhotoModule photoModule = (PhotoModule) this.f63509h.getValue();
        if (!photoModule.f98319g) {
            photoModule.f98319g = true;
            ((C38655c) photoModule.f98317e).f98326a = CompressFormat.PNG;
            String a = photoModule.f98317e.mo78585a();
            photoModule.f98318f = C45547d.m99208b(photoModule.f98314b, "");
            photoModule.f98318f.setIndeterminate(true);
            photoModule.f98315c.mo43283a(a, PhotoModule.f98313a[0], PhotoModule.f98313a[1], (C52671b<? super Integer, C52860x>) new C38692p<Object,C52860x>(photoModule, a));
        }
    }

    /* renamed from: a */
    public final C49604i mo49416a() {
        return (C23842a) this.f63510i.getValue();
    }

    /* renamed from: a */
    public static final /* synthetic */ C48923a m58522a(C23841g gVar) {
        C48923a aVar = gVar.f63505d;
        if (aVar == null) {
            C52711k.m112237a("tabEnv");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ShortVideoContextViewModel m58523b(C23841g gVar) {
        ShortVideoContextViewModel shortVideoContextViewModel = gVar.f63503b;
        if (shortVideoContextViewModel == null) {
            C52711k.m112237a("shortVideoContextViewModel");
        }
        return shortVideoContextViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ C45004a m58524c(C23841g gVar) {
        C45004a aVar = gVar.f63504c;
        if (aVar == null) {
            C52711k.m112237a("cameraApiComponent");
        }
        return aVar;
    }

    /* renamed from: b */
    public final C49579d mo49418b(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        C49579d dVar = new C49579d(this.f63511j, this.f63512k, this.f63513l, this.f63514m, new C23843b(this, aVar));
        return dVar;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    public C23841g(String str, String str2, String str3, boolean z) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(str3, "shootMode");
        this.f63511j = str;
        this.f63512k = str2;
        this.f63513l = str3;
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
