package com.p683ss.android.ugc.gamora.recorder.p2479m;

import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2767k;
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
import com.bytedance.scene.C12924i;
import com.bytedance.scene.ktx.C12932b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.RecordZoomValueTextView;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import com.ss.android.ugc.trill.R;
import java.text.DecimalFormat;
import p064c.p065a.p069b.C1690c;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.m.b */
public final class C49899b extends C12924i implements C49548a {

    /* renamed from: j */
    public static final C49900a f125046j = new C49900a(null);

    /* renamed from: i */
    public RecordZoomValueTextView f125047i;

    /* renamed from: k */
    private final C2762f<C52847n<Integer, Float>> f125048k;

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$a */
    public static final class C49900a {
        private C49900a() {
        }

        public /* synthetic */ C49900a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$b */
    static final class C49901b<T> implements C2767k<C52847n<? extends Integer, ? extends Float>> {

        /* renamed from: a */
        final /* synthetic */ C49899b f125049a;

        C49901b(C49899b bVar) {
            this.f125049a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final C52847n nVar = (C52847n) obj;
            C49899b.m107675a(this.f125049a).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C49901b f125050a;

                {
                    this.f125050a = r1;
                }

                public final void run() {
                    RecordZoomValueTextView a = C49899b.m107675a(this.f125050a.f125049a);
                    int intValue = ((Number) nVar.getFirst()).intValue();
                    float floatValue = ((Number) nVar.getSecond()).floatValue();
                    a.removeCallbacks(a.f113688c);
                    a.postDelayed(a.f113688c, (long) (a.f113690e * 1000));
                    if (intValue == CAMERA_FACING_ID.FACING_FRONT.ordinal() || intValue == CAMERA_FACING_ID.FACING_BACK.ordinal()) {
                        a.f113687b.setText("主摄");
                    } else if (intValue != CAMERA_FACING_ID.FACING_WIDE_ANGLE.ordinal() && intValue == CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()) {
                        a.f113687b.setText("长焦");
                    }
                    if (floatValue != a.f113689d) {
                        a.f113689d = floatValue;
                        if (a.getAlpha() == 0.0f) {
                            a.animate().alpha(1.0f).setDuration(300).start();
                        }
                        if (a.f113691f == 6) {
                            if (floatValue > 1.0f) {
                                DecimalFormat decimalFormat = new DecimalFormat("0.0");
                                TextView textView = a.f113686a;
                                StringBuilder sb = new StringBuilder();
                                sb.append(decimalFormat.format((double) floatValue));
                                sb.append("x");
                                textView.setText(sb.toString());
                            } else if (intValue == CAMERA_FACING_ID.FACING_WIDE_ANGLE.ordinal()) {
                                a.f113686a.setText("");
                                a.f113687b.setText("");
                            } else {
                                a.f113686a.setText("1x");
                                a.f113687b.setText("主摄");
                            }
                        }
                    }
                }
            });
        }
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

    public C49899b(C2762f<C52847n<Integer, Float>> fVar) {
        C52711k.m112240b(fVar, "satCameraState");
        this.f125048k = fVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordZoomValueTextView m107675a(C49899b bVar) {
        RecordZoomValueTextView recordZoomValueTextView = bVar.f125047i;
        if (recordZoomValueTextView == null) {
            C52711k.m112237a("zoomValueTextView");
        }
        return recordZoomValueTextView;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        View j_ = mo24467j_(R.id.erl);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.record_zoom_value_text)");
        this.f125047i = (RecordZoomValueTextView) j_;
        this.f125048k.mo7349a(C12932b.m25979b(this), new C49901b(this));
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.byf, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
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

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
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
