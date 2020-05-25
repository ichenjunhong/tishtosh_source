package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.app.Activity;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.scene.C12924i;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44190b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44199d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44203h;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2214a.C44187a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout.C44206a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.p2262a.C45593a;
import com.ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h */
public final class C44215h extends C12924i implements C44209c {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f111980i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44215h.class), "gestureLayout", "getGestureLayout()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/gesturelayout/GestureLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44215h.class), "draeww", "getDraeww()Lcom/facebook/drawee/view/SimpleDraweeView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44215h.class), "deleteImg", "getDeleteImg()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44215h.class), "slideLayout", "getSlideLayout()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/preview/SlidePreviewLayout;"))};

    /* renamed from: k */
    public static final C44216a f111981k = new C44216a(null);

    /* renamed from: j */
    public final C44208b f111982j;

    /* renamed from: l */
    private final C52668f f111983l = C52732g.m112285a(new C44221f(this));

    /* renamed from: m */
    private final C52668f f111984m = C52732g.m112285a(new C44218c(this));

    /* renamed from: n */
    private final C52668f f111985n = C52732g.m112285a(new C44217b(this));

    /* renamed from: o */
    private final C52668f f111986o = C52732g.m112285a(new C44225j(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$a */
    public static final class C44216a {
        private C44216a() {
        }

        public /* synthetic */ C44216a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$b */
    static final class C44217b extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C44215h f111987a;

        C44217b(C44215h hVar) {
            this.f111987a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f111987a.mo24467j_(R.id.a46);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$c */
    static final class C44218c extends C52712l implements C52670a<SimpleDraweeView> {

        /* renamed from: a */
        final /* synthetic */ C44215h f111988a;

        C44218c(C44215h hVar) {
            this.f111988a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SimpleDraweeView) this.f111988a.mo24467j_(R.id.evy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$d */
    static final class C44219d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44215h f111989a;

        C44219d(C44215h hVar) {
            this.f111989a = hVar;
        }

        public final void run() {
            this.f111989a.f111982j.mo90126a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$e */
    public static final class C44220e extends C44203h {

        /* renamed from: b */
        final /* synthetic */ View f111990b;

        /* renamed from: c */
        public final View mo90115c(Object obj) {
            return this.f111990b;
        }

        C44220e(View view) {
            this.f111990b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$f */
    static final class C44221f extends C52712l implements C52670a<GestureLayout> {

        /* renamed from: a */
        final /* synthetic */ C44215h f111991a;

        C44221f(C44215h hVar) {
            this.f111991a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (GestureLayout) this.f111991a.mo24467j_(R.id.e_c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$g */
    public static final class C44222g implements C44206a {

        /* renamed from: a */
        final /* synthetic */ C44215h f111992a;

        C44222g(C44215h hVar) {
            this.f111992a = hVar;
        }

        /* renamed from: a */
        public final void mo90125a(boolean z) {
            this.f111992a.mo90141a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$h */
    public static final class C44223h implements C44199d {

        /* renamed from: a */
        final /* synthetic */ C44215h f111993a;

        /* renamed from: a */
        public final void mo90108a() {
            this.f111993a.mo90141a(true);
        }

        /* renamed from: b */
        public final void mo90110b() {
            this.f111993a.mo90141a(true);
        }

        C44223h(C44215h hVar) {
            this.f111993a = hVar;
        }

        /* renamed from: a */
        public final void mo90109a(float f) {
            C44208b bVar = this.f111993a.f111982j;
            if (bVar != null) {
                bVar.mo90127a(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$i */
    public static final class C44224i extends C44203h {

        /* renamed from: b */
        final /* synthetic */ View f111994b;

        /* renamed from: c */
        public final View mo90115c(Object obj) {
            return this.f111994b;
        }

        C44224i(View view) {
            this.f111994b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$j */
    static final class C44225j extends C52712l implements C52670a<SlidePreviewLayout> {

        /* renamed from: a */
        final /* synthetic */ C44215h f111995a;

        C44225j(C44215h hVar) {
            this.f111995a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SlidePreviewLayout) this.f111995a.mo24467j_(R.id.cp_);
        }
    }

    /* renamed from: c */
    private final GestureLayout m96871c() {
        return (GestureLayout) this.f111983l.getValue();
    }

    /* renamed from: d */
    private final SimpleDraweeView m96872d() {
        return (SimpleDraweeView) this.f111984m.getValue();
    }

    /* renamed from: a */
    public final void mo90130a() {
        mo90141a(true);
    }

    /* renamed from: f */
    private static C44187a m96873f() {
        C44187a aVar = new C44187a();
        aVar.f111948f = 220;
        aVar.f111949g = 220;
        aVar.f111950h = 220;
        aVar.f111951i = 220;
        aVar.mo90097a(new C45593a((PointF) C44263o.m96945a().getFirst(), (PointF) C44263o.m96945a().getSecond()));
        aVar.mo90098b(new C45593a((PointF) C44263o.m96945a().getFirst(), (PointF) C44263o.m96945a().getSecond()));
        aVar.mo90099c(new C45593a((PointF) C44263o.m96945a().getFirst(), (PointF) C44263o.m96945a().getSecond()));
        aVar.mo90100d(new C45593a((PointF) C44263o.m96945a().getFirst(), (PointF) C44263o.m96945a().getSecond()));
        return aVar;
    }

    public C44215h(C44208b bVar) {
        this.f111982j = bVar;
    }

    /* renamed from: a */
    public final void mo90141a(boolean z) {
        C44208b bVar = this.f111982j;
        if (bVar != null) {
            View c = bVar.mo90128c();
            if (!(c == null || c == null)) {
                C44220e eVar = new C44220e(c);
                m96871c().mo90047a(eVar.mo90113a(null), null, eVar.mo90114b(null), 0.0f, new C44190b(), m96873f(), new C44219d(this));
                return;
            }
        }
        C44208b bVar2 = this.f111982j;
        if (bVar2 != null) {
            bVar2.mo90126a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r10) {
        /*
            r9 = this;
            super.mo24448e(r10)
            d.f r10 = r9.f111986o
            java.lang.Object r10 = r10.getValue()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout r10 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout) r10
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$g r0 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$g
            r0.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout$a r0 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout.C44206a) r0
            r10.setCallback(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$h r10 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$h
            r10.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout r0 = r9.m96871c()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r1 = r9.f111982j
            r2 = 0
            if (r1 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r1 = r1.cf_()
            if (r1 == 0) goto L_0x002c
            int r1 = r1.f95390i
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r3 = r9.f111982j
            if (r3 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r3 = r3.cf_()
            if (r3 == 0) goto L_0x003a
            int r3 = r3.f95391j
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r0.mo90045a(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.d r10 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44199d) r10
            r0.setCallback(r10)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r10 = r9.f111982j
            r0 = 0
            if (r10 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r10 = r10.cf_()
            if (r10 == 0) goto L_0x0051
            java.lang.String r10 = r10.f95383b
            goto L_0x0052
        L_0x0051:
            r10 = r0
        L_0x0052:
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0060
            int r1 = r1.length()
            if (r1 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r1 = 0
            goto L_0x0061
        L_0x0060:
            r1 = 1
        L_0x0061:
            if (r1 != 0) goto L_0x008c
            java.io.File r1 = new java.io.File
            r1.<init>(r10)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x006f
            goto L_0x008c
        L_0x006f:
            com.facebook.drawee.view.SimpleDraweeView r1 = r9.m96872d()
            r1.setVisibility(r2)
            com.facebook.drawee.view.SimpleDraweeView r1 = r9.m96872d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "file://"
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.p683ss.android.ugc.tools.p2504a.C50181a.m108292a(r1, r10)
            goto L_0x00a7
        L_0x008c:
            d.f r10 = r9.f111985n
            java.lang.Object r10 = r10.getValue()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r10.setVisibility(r2)
            android.app.Activity r10 = r9.mo24477v()
            android.content.Context r10 = (android.content.Context) r10
            r1 = 2132547324(0x7f1c16fc, float:2.074789E38)
            com.bytedance.ies.dmt.ui.d.a r10 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r10, r1)
            r10.mo19066a()
        L_0x00a7:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r10 = r9.f111982j
            if (r10 == 0) goto L_0x00d4
            android.view.View r10 = r10.mo90128c()
            if (r10 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$i r1 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.h$i
            r1.<init>(r10)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout r2 = r9.m96871c()
            android.graphics.Rect r3 = r1.mo90113a(r0)
            r4 = 0
            android.graphics.Rect r5 = r1.mo90114b(r0)
            r6 = 0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b r10 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b
            r10.<init>()
            r7 = r10
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.f r7 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44201f) r7
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a r8 = m96873f()
            r2.mo90046a(r3, r4, r5, r6, r7, r8)
            return
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44215h.mo24448e(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        Activity v = mo24477v();
        C52711k.m112236a((Object) v, "requireActivity()");
        View inflate = v.getLayoutInflater().inflate(R.layout.bm_, viewGroup, false);
        C52711k.m112236a((Object) inflate, "requireActivity().layout…_scene, container, false)");
        return inflate;
    }
}
