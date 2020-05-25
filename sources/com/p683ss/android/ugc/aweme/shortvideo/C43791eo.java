package com.p683ss.android.ugc.aweme.shortvideo;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.asve.recorder.C20420b;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44455e;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44456f;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2223a.C44442a;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2223a.C44446d;
import com.p683ss.android.ugc.aweme.tools.C47323n;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.tools.C47349x;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eo */
public final class C43791eo {

    /* renamed from: a */
    final AppCompatActivity f110885a;

    /* renamed from: b */
    final C45017b f110886b;

    /* renamed from: c */
    final ShortVideoContext f110887c;

    /* renamed from: d */
    private final ASCameraView f110888d;

    public final void onEvent(C47349x xVar) {
        if (this.f110887c.mo86372m() >= this.f110887c.mo86377r()) {
            this.f110886b.mo91329a(new C47323n("record_full"));
            return;
        }
        if (!this.f110887c.f107118k.mo86460g().exists()) {
            this.f110887c.f107118k.mo86460g().mkdirs();
        }
        this.f110886b.mo91309O().mo94318a(C43792ep.f110889a);
        if (this.f110887c.mo86366g() && this.f110886b.mo91304J() != null) {
            C44442a J = this.f110886b.mo91304J();
            if (J.f112432e != null) {
                J.f112432e.cancel();
            }
            J.f112432e = ValueAnimator.ofFloat(new float[]{0.66f, 1.0f}).setDuration(150);
            J.f112432e.addUpdateListener(new C44446d(J));
            J.f112432e.start();
        }
        if (this.f110887c.f107095au != 1) {
            this.f110888d.mo43630a(this.f110887c.mo86371l(), this.f110887c.mo86373n(), this.f110887c.mo86372m());
        }
        this.f110888d.setVideoQuality(C40797m.m90251f());
        boolean z = false;
        ((ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f110885a).mo359a(ShortVideoContextViewModel.class)).mo86393d(false);
        ASCameraView aSCameraView = this.f110888d;
        if (this.f110887c.f107127t == 1) {
            z = true;
        }
        C47339t tVar = xVar.f119499a;
        C43793eq eqVar = new C43793eq(this, xVar);
        Context context = aSCameraView.getContext();
        if ((context instanceof VideoRecordNewActivity) && ((ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) (VideoRecordNewActivity) context).mo359a(ShortVideoContextViewModel.class)).f107134a.f107095au == 1) {
            aSCameraView.mo43629a((C52671b<? super Integer, C52860x>) new C44456f<Object,C52860x>(aSCameraView));
        }
        float d = C40797m.m90249d();
        int b = C39618d.f101151O.mo83118b(C40796a.RecordBitrateMode);
        double value = (double) tVar.value();
        boolean z2 = !z;
        int a = C44455e.m97280a();
        C52711k.m112240b(eqVar, "callback");
        C20420b bVar = aSCameraView.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43257e().mo43287a(value, z2, d, b, a, false, eqVar);
    }

    public C43791eo(AppCompatActivity appCompatActivity, ASCameraView aSCameraView, C45017b bVar, ShortVideoContext shortVideoContext) {
        this.f110885a = appCompatActivity;
        this.f110888d = aSCameraView;
        this.f110886b = bVar;
        this.f110887c = shortVideoContext;
    }
}
