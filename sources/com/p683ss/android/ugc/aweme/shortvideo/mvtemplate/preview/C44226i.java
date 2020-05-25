package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.navigation.C12961g;
import com.bytedance.scene.p837a.p838a.C12833c;
import com.bytedance.scene.p840b.C12858e.C12860a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.i */
public final class C44226i extends C12896b implements C44208b {

    /* renamed from: k */
    public static C44210d f111996k;

    /* renamed from: l */
    public static final C44227a f111997l = new C44227a(null);

    /* renamed from: m */
    private ViewGroup f111998m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.i$a */
    public static final class C44227a {
        private C44227a() {
        }

        public /* synthetic */ C44227a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m96890a(C44210d dVar) {
            C52711k.m112240b(dVar, "callback");
            C44226i.f111996k = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.i$b */
    static final class C44228b implements C12961g {

        /* renamed from: a */
        final /* synthetic */ C44226i f111999a;

        /* renamed from: b */
        final /* synthetic */ MyMediaModel f112000b;

        C44228b(C44226i iVar, MyMediaModel myMediaModel) {
            this.f111999a = iVar;
            this.f112000b = myMediaModel;
        }

        /* renamed from: a */
        public final boolean mo24532a() {
            C12924i iVar;
            if (this.f112000b.mo76676c()) {
                iVar = this.f111999a.mo24388a("OriginPreviewVideoScene");
            } else {
                iVar = this.f111999a.mo24388a("OriginPreviewImageScene");
            }
            if (!(iVar instanceof C44209c)) {
                iVar = null;
            }
            C44209c cVar = (C44209c) iVar;
            if (cVar != null) {
                cVar.mo90130a();
            }
            return true;
        }
    }

    /* renamed from: c */
    public final View mo86790c() {
        C44210d dVar = f111996k;
        if (dVar != null) {
            return dVar.mo89943b();
        }
        return null;
    }

    public final MyMediaModel cf_() {
        C44210d dVar = f111996k;
        if (dVar != null) {
            return dVar.mo89942a();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo90126a() {
        C12942d dVar = this.f33837e;
        if (dVar != null) {
            C12860a aVar = new C12860a();
            aVar.mo24321a(new C12833c());
            dVar.mo24520a(aVar.mo24322a());
        }
    }

    /* renamed from: a */
    public final void mo90127a(float f) {
        int max = Math.max(0, (int) (f * 255.0f));
        ViewGroup viewGroup = this.f111998m;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(Color.argb(max, 0, 0, 0));
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        this.f111998m = (ViewGroup) mo24467j_(R.id.cfl);
        C44210d dVar = f111996k;
        if (dVar != null) {
            MyMediaModel a = dVar.mo89942a();
            if (a != null) {
                if (a.mo76676c()) {
                    mo24389a((int) R.id.cfl, (C12924i) new C44229j(this), "OriginPreviewVideoScene");
                } else {
                    mo24389a((int) R.id.cfl, (C12924i) new C44215h(this), "OriginPreviewImageScene");
                }
                mo24479x().mo24517a((C0184k) this, (C12961g) new C44228b(this, a));
            }
        }
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        Activity v = mo24477v();
        C52711k.m112236a((Object) v, "requireActivity()");
        View inflate = v.getLayoutInflater().inflate(R.layout.brb, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
