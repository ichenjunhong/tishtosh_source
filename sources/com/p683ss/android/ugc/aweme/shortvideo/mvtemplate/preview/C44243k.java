package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.scene.group.C12919g;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44190b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44199d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44203h;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2214a.C44187a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.p2262a.C45593a;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.io.File;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.k */
public final class C44243k extends C12919g implements C44212f {

    /* renamed from: o */
    static final /* synthetic */ C52767h[] f112023o = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44243k.class), "draweeView", "getDraweeView()Lcom/facebook/drawee/view/SimpleDraweeView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44243k.class), "gestureLayout", "getGestureLayout()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/gesturelayout/GestureLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44243k.class), "deleteImg", "getDeleteImg()Landroid/widget/ImageView;"))};

    /* renamed from: p */
    public C44211e f112024p;

    /* renamed from: q */
    private int f112025q = -1;

    /* renamed from: r */
    private MyMediaModel f112026r;

    /* renamed from: s */
    private final C52668f f112027s = C52732g.m112285a(new C44245b(this));

    /* renamed from: t */
    private final C52668f f112028t = C52732g.m112285a(new C44248e(this));

    /* renamed from: u */
    private final C52668f f112029u = C52732g.m112285a(new C44244a(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.k$a */
    static final class C44244a extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C44243k f112030a;

        C44244a(C44243k kVar) {
            this.f112030a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f112030a.mo24467j_(R.id.eby);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.k$b */
    static final class C44245b extends C52712l implements C52670a<SimpleDraweeView> {

        /* renamed from: a */
        final /* synthetic */ C44243k f112031a;

        C44245b(C44243k kVar) {
            this.f112031a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SimpleDraweeView) this.f112031a.mo24467j_(R.id.e69);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.k$c */
    static final class C44246c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44243k f112032a;

        C44246c(C44243k kVar) {
            this.f112032a = kVar;
        }

        public final void run() {
            C44211e eVar = this.f112032a.f112024p;
            if (eVar != null) {
                eVar.mo90134c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.k$d */
    public static final class C44247d extends C44203h {

        /* renamed from: b */
        final /* synthetic */ View f112033b;

        /* renamed from: c */
        public final View mo90115c(Object obj) {
            return this.f112033b;
        }

        C44247d(View view) {
            this.f112033b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.k$e */
    static final class C44248e extends C52712l implements C52670a<GestureLayout> {

        /* renamed from: a */
        final /* synthetic */ C44243k f112034a;

        C44248e(C44243k kVar) {
            this.f112034a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (GestureLayout) this.f112034a.mo24467j_(R.id.e_c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.k$f */
    public static final class C44249f implements C44199d {

        /* renamed from: a */
        final /* synthetic */ C44243k f112035a;

        /* renamed from: a */
        public final void mo90108a() {
            this.f112035a.mo90150b(true);
        }

        /* renamed from: b */
        public final void mo90110b() {
            this.f112035a.mo90150b(true);
        }

        C44249f(C44243k kVar) {
            this.f112035a = kVar;
        }

        /* renamed from: a */
        public final void mo90109a(float f) {
            C44211e eVar = this.f112035a.f112024p;
            if (eVar != null) {
                eVar.mo90131a(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.k$g */
    public static final class C44250g extends C44203h {

        /* renamed from: b */
        final /* synthetic */ View f112036b;

        /* renamed from: c */
        public final View mo90115c(Object obj) {
            return this.f112036b;
        }

        C44250g(View view) {
            this.f112036b = view;
        }
    }

    /* renamed from: f */
    private final SimpleDraweeView m96912f() {
        return (SimpleDraweeView) this.f112027s.getValue();
    }

    /* renamed from: h */
    private final GestureLayout m96913h() {
        return (GestureLayout) this.f112028t.getValue();
    }

    /* renamed from: a */
    public final void mo90136a() {
    }

    public final void cg_() {
    }

    /* renamed from: d */
    public final ImageView mo90151d() {
        return (ImageView) this.f112029u.getValue();
    }

    /* renamed from: c */
    public final void mo86790c() {
        mo90150b(true);
    }

    /* renamed from: i */
    private static C44187a m96914i() {
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

    /* renamed from: a */
    public final void mo90138a(MyMediaModel myMediaModel) {
        this.f112026r = myMediaModel;
    }

    /* renamed from: c */
    private final void m96911c(boolean z) {
        if (z) {
            C44211e eVar = this.f112024p;
            if (eVar != null) {
                View ch_ = eVar.ch_();
                if (ch_ != null) {
                    C44250g gVar = new C44250g(ch_);
                    m96913h().mo90046a(gVar.mo90113a(null), null, gVar.mo90114b(null), 0.0f, new C44190b(), m96914i());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo90150b(boolean z) {
        C44211e eVar = this.f112024p;
        if (eVar != null) {
            View ch_ = eVar.ch_();
            if (!(ch_ == null || ch_ == null)) {
                C44247d dVar = new C44247d(ch_);
                m96913h().mo90047a(dVar.mo90113a(null), null, dVar.mo90114b(null), 0.0f, new C44190b(), m96914i(), new C44246c(this));
                return;
            }
        }
        C44211e eVar2 = this.f112024p;
        if (eVar2 != null) {
            eVar2.mo90134c();
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        int i;
        int i2;
        String str;
        boolean z;
        super.mo24448e(bundle);
        C44249f fVar = new C44249f(this);
        GestureLayout h = m96913h();
        MyMediaModel myMediaModel = this.f112026r;
        if (myMediaModel != null) {
            i = myMediaModel.f95390i;
        } else {
            i = 0;
        }
        MyMediaModel myMediaModel2 = this.f112026r;
        if (myMediaModel2 != null) {
            i2 = myMediaModel2.f95391j;
        } else {
            i2 = 0;
        }
        h.mo90045a(i, i2);
        h.setCallback(fVar);
        MyMediaModel myMediaModel3 = this.f112026r;
        if (myMediaModel3 != null) {
            str = myMediaModel3.f95383b;
        } else {
            str = null;
        }
        m96912f().setVisibility(8);
        mo90151d().setVisibility(8);
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !new File(str).exists()) {
            mo90151d().setVisibility(0);
        } else {
            m96912f().setVisibility(0);
            SimpleDraweeView f = m96912f();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            C50181a.m108292a(f, sb.toString());
        }
        C44211e eVar = this.f112024p;
        if (eVar == null || !eVar.mo90133a()) {
            m96911c(false);
        } else {
            C44211e eVar2 = this.f112024p;
            if (eVar2 != null) {
                eVar2.mo90132a(false);
            }
            m96911c(true);
        }
        mo24446I().mo324a(new PreviewImageScene$onActivityCreated$1(this));
    }

    /* renamed from: a */
    public final void mo90137a(int i, C44211e eVar) {
        C52711k.m112240b(eVar, "controller");
        this.f112025q = i;
        this.f112024p = eVar;
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.brc, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
