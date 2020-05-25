package com.p683ss.android.ugc.gamora.recorder.p2478l;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2442f;
import com.airbnb.lottie.C2473i;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2767k;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p2345t.C46769b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43221do;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout.C44926a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout.C45582a;
import com.p683ss.android.ugc.aweme.tools.C47067l;
import com.p683ss.android.ugc.aweme.tools.C47323n;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52847n;
import p2628d.C52855s;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.l.c */
public final class C49869c extends C12924i implements C49548a {

    /* renamed from: w */
    public static final C49870a f124976w = new C49870a(null);

    /* renamed from: A */
    private final C2763g<C52847n<List<TimeSpeedModelExtension>, Long>> f124977A;

    /* renamed from: B */
    private final C2763g<C52855s<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f124978B;

    /* renamed from: C */
    private final C2763g<Integer> f124979C;

    /* renamed from: D */
    private final C2763g<RetakeVideoContext> f124980D;

    /* renamed from: E */
    private final C2763g<C52847n<List<TimeSpeedModelExtension>, Long>> f124981E;

    /* renamed from: F */
    private final C2763g<C52855s<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f124982F;

    /* renamed from: G */
    private final C2763g<Boolean> f124983G;

    /* renamed from: H */
    private final C2763g<Boolean> f124984H;

    /* renamed from: I */
    private final C2763g<Boolean> f124985I;

    /* renamed from: J */
    private final C2763g<ScaleGestureDetector> f124986J;

    /* renamed from: K */
    private final C2763g<C44926a> f124987K;

    /* renamed from: i */
    public ProgressSegmentView f124988i;

    /* renamed from: j */
    public View f124989j;

    /* renamed from: k */
    public RecordLayout f124990k;

    /* renamed from: l */
    View f124991l;

    /* renamed from: m */
    protected ImageView f124992m;

    /* renamed from: n */
    public int f124993n = C23728o.m58241a(40.0d);

    /* renamed from: o */
    Dialog f124994o;

    /* renamed from: p */
    public AnimationImageView f124995p;

    /* renamed from: q */
    public FrameLayout f124996q;

    /* renamed from: r */
    public FrameLayout f124997r;

    /* renamed from: s */
    boolean f124998s = true;

    /* renamed from: t */
    C45582a f124999t = C45582a.DEFAULT;

    /* renamed from: u */
    public final C45004a f125000u;

    /* renamed from: v */
    public final ShortVideoContext f125001v;

    /* renamed from: x */
    private ImageView f125002x;

    /* renamed from: y */
    private boolean f125003y = true;

    /* renamed from: z */
    private final C2763g<Long> f125004z;

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$a */
    public static final class C49870a {
        private C49870a() {
        }

        public /* synthetic */ C49870a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$b */
    public static final class C49871b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C49869c f125005a;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C49871b(C49869c cVar) {
            this.f125005a = cVar;
        }

        public final void onAnimationCancel(Animator animator) {
            C49869c.m107624a(this.f125005a).setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            C49869c.m107624a(this.f125005a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$c */
    static final class C49872c implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C49869c f125006a;

        C49872c(C49869c cVar) {
            this.f125006a = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C49869c cVar = this.f125006a;
            if (cVar.f124995p != null) {
                AnimationImageView animationImageView = cVar.f124995p;
                if (animationImageView == null) {
                    C52711k.m112237a("colorSchemeLottieView");
                }
                animationImageView.mo6661f();
            }
            C49869c.m107624a(this.f125006a).setVisibility(8);
            if (C49869c.m107625b(this.f125006a).getMode() == 3) {
                FrameLayout frameLayout = this.f125006a.f124997r;
                if (frameLayout == null) {
                    C52711k.m112237a("colorSchemeBackground");
                }
                frameLayout.setVisibility(8);
            }
            C49869c.m107625b(this.f125006a).performClick();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$d */
    static final class C49873d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49869c f125007a;

        C49873d(C49869c cVar) {
            this.f125007a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C0176h lifecycle = this.f125007a.mo22626h().getLifecycle();
            C52711k.m112236a((Object) lifecycle, "lifecycleOwner.lifecycle");
            if (lifecycle.mo323a() != C0178b.DESTROYED) {
                C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f125007a.f125001v.f107131x).mo47829a("shoot_way", this.f125007a.f125001v.f107132y).mo47826a("draft_id", this.f125007a.f125001v.f107022A);
                if (this.f125007a.f125001v.f107122o) {
                    a.mo47829a("action_type", "reshoot");
                }
                C26890h.m65011a("delete_clip", a.f61491a);
                this.f125007a.f125000u.mo91386a(new C47067l());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$e */
    static final class C49874e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49869c f125008a;

        C49874e(C49869c cVar) {
            this.f125008a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C0176h lifecycle = this.f125008a.mo22626h().getLifecycle();
            C52711k.m112236a((Object) lifecycle, "lifecycleOwner.lifecycle");
            if (lifecycle.mo323a() != C0178b.DESTROYED) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$f */
    static final class C49875f<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125009a;

        C49875f(C49869c cVar) {
            this.f125009a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            LayoutParams layoutParams = C49869c.m107628e(this.f125009a).getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                Activity activity = this.f125009a.f33840g_;
                if (activity == null) {
                    C52711k.m112234a();
                }
                marginLayoutParams.topMargin = C43303dy.m94972c(activity) + this.f125009a.mo24478w().getDimensionPixelSize(R.dimen.m0);
                C49869c.m107628e(this.f125009a).setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$g */
    static final class C49876g<T> implements C2767k<C52847n<? extends List<? extends TimeSpeedModelExtension>, ? extends Long>> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125010a;

        C49876g(C49869c cVar) {
            this.f125010a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                C49869c.m107628e(this.f125010a).mo91888a((List) nVar.getFirst(), ((Number) nVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$h */
    static final class C49877h<T> implements C2767k<C52855s<? extends List<? extends TimeSpeedModelExtension>, ? extends Long, ? extends TimeSpeedModelExtension>> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125011a;

        C49877h(C49869c cVar) {
            this.f125011a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52855s sVar = (C52855s) obj;
            if (sVar != null) {
                C49869c.m107628e(this.f125011a).mo91889a((List) sVar.getFirst(), ((Number) sVar.getSecond()).longValue(), (TimeSpeedModelExtension) sVar.getThird());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$i */
    static final class C49878i<T> implements C2767k<Long> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125012a;

        C49878i(C49869c cVar) {
            this.f125012a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            ProgressSegmentView e = C49869c.m107628e(this.f125012a);
            C52711k.m112236a((Object) l, "it");
            e.setMaxDuration(l.longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$j */
    static final class C49879j<T> implements C2767k<RetakeVideoContext> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125013a;

        C49879j(C49869c cVar) {
            this.f125013a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                C49869c.m107628e(this.f125013a).mo91887a(retakeVideoContext);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$k */
    static final class C49880k<T> implements C2767k<C52847n<? extends List<? extends TimeSpeedModelExtension>, ? extends Long>> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125014a;

        C49880k(C49869c cVar) {
            this.f125014a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                C49869c.m107628e(this.f125014a).mo91891b((List) nVar.getFirst(), ((Number) nVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$l */
    static final class C49881l<T> implements C2767k<C52855s<? extends List<? extends TimeSpeedModelExtension>, ? extends Long, ? extends TimeSpeedModelExtension>> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125015a;

        C49881l(C49869c cVar) {
            this.f125015a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52855s sVar = (C52855s) obj;
            if (sVar != null) {
                C49869c.m107628e(this.f125015a);
                ProgressSegmentView.m99240b((List) sVar.getFirst(), ((Number) sVar.getSecond()).longValue(), (TimeSpeedModelExtension) sVar.getThird());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$m */
    static final class C49882m<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125016a;

        C49882m(C49869c cVar) {
            this.f125016a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                C49869c.m107628e(this.f125016a).mo91886a();
                return;
            }
            ProgressSegmentView e = C49869c.m107628e(this.f125016a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            e.mo91890a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$n */
    static final class C49883n<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125017a;

        C49883n(C49869c cVar) {
            this.f125017a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e = C49869c.m107628e(this.f125017a);
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            e.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$o */
    static final class C49884o<T> implements C2473i<C2408e> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125018a;

        C49884o(C49869c cVar) {
            this.f125018a = cVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6703a(Object obj) {
            C49869c.m107624a(this.f125018a).setComposition((C2408e) obj);
            C49869c cVar = this.f125018a;
            C49869c cVar2 = cVar;
            if (!(cVar2.f124995p == null || cVar2.f124997r == null || cVar2.f124990k == null)) {
                AnimationImageView animationImageView = cVar.f124995p;
                if (animationImageView == null) {
                    C52711k.m112237a("colorSchemeLottieView");
                }
                animationImageView.mo6652a((AnimatorListener) new C49871b(cVar));
                AnimationImageView animationImageView2 = cVar.f124995p;
                if (animationImageView2 == null) {
                    C52711k.m112237a("colorSchemeLottieView");
                }
                animationImageView2.setOnTouchListener(new C49872c(cVar));
            }
            this.f125018a.mo97700F();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$p */
    static final class C49885p<T> implements C2473i<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125019a;

        C49885p(C49869c cVar) {
            this.f125019a = cVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6703a(Object obj) {
            Throwable th = (Throwable) obj;
            C49869c.m107624a(this.f125019a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$q */
    static final class C49886q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49869c f125020a;

        C49886q(C49869c cVar) {
            this.f125020a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f125020a.f125000u.mo91349ai();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$r */
    static final class C49887r<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125021a;

        C49887r(C49869c cVar) {
            this.f125021a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                i = C23728o.m58241a(33.0d) + this.f125021a.f124993n;
            } else {
                i = this.f125021a.f124993n;
            }
            LayoutParams layoutParams = C49869c.m107625b(this.f125021a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = i;
                C49869c.m107625b(this.f125021a).setLayoutParams(layoutParams2);
                LayoutParams layoutParams3 = C49869c.m107626c(this.f125021a).getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.bottomMargin = i;
                    C49869c.m107626c(this.f125021a).setLayoutParams(layoutParams4);
                    LayoutParams layoutParams5 = C49869c.m107627d(this.f125021a).getLayoutParams();
                    if (layoutParams5 != null) {
                        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                        layoutParams6.bottomMargin = i;
                        C49869c.m107627d(this.f125021a).setLayoutParams(layoutParams6);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$s */
    static final class C49888s<T> implements C2767k<ScaleGestureDetector> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125022a;

        C49888s(C49869c cVar) {
            this.f125022a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                C49869c.m107625b(this.f125022a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$t */
    static final class C49889t<T> implements C2767k<C44926a> {

        /* renamed from: a */
        final /* synthetic */ C49869c f125023a;

        C49889t(C49869c cVar) {
            this.f125023a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C44926a aVar = (C44926a) obj;
            if (aVar != null) {
                C49869c.m107625b(this.f125023a).setOnGestureListener(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$u */
    static final class C49890u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49869c f125024a;

        C49890u(C49869c cVar) {
            this.f125024a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C49869c cVar = this.f125024a;
            C52711k.m112236a((Object) view, "it");
            if (cVar.f124994o != null) {
                Dialog dialog = cVar.f124994o;
                if (dialog == null) {
                    C52711k.m112234a();
                }
                if (dialog.isShowing()) {
                    return;
                }
            }
            C10643a aVar = new C10643a(cVar.f33840g_);
            aVar.mo18902b(cVar.mo24478w().getString(R.string.aof));
            aVar.mo18893a(cVar.mo24478w().getString(R.string.ao2), (OnClickListener) new C49873d(cVar)).mo18903b(cVar.mo24478w().getString(R.string.wf), (OnClickListener) new C49874e(cVar));
            cVar.f124994o = aVar.mo18897a().mo18882b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$v */
    public static final class C49891v extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C49869c f125025a;

        C49891v(C49869c cVar) {
            this.f125025a = cVar;
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            C52711k.m112240b(view, "v");
            if (!this.f125025a.f125001v.f107122o || this.f125025a.f125001v.mo86372m() >= this.f125025a.f125001v.mo86377r()) {
                if (this.f125025a.f125001v.f107122o) {
                    C26890h.m65011a("back_to_video_trim", C43682b.m95953c().mo47826a("videoSegment", this.f125025a.f125001v.mo86375p().size()).f61491a);
                }
                this.f125025a.f125001v.f107094at = System.currentTimeMillis();
                this.f125025a.f125000u.mo91335a(new C47351z());
                this.f125025a.f125000u.mo91329a(new C47323n("click_next"));
                C45380af a = C45380af.m98935a();
                C52711k.m112236a((Object) a, "MemoryUtil.getInstance()");
                C45380af a2 = C45380af.m98935a();
                C52711k.m112236a((Object) a2, "MemoryUtil.getInstance()");
                C45380af a3 = C45380af.m98935a();
                C52711k.m112236a((Object) a3, "MemoryUtil.getInstance()");
                C45380af a4 = C45380af.m98935a();
                C52711k.m112236a((Object) a4, "MemoryUtil.getInstance()");
                C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47829a("creation_id", this.f125025a.f125001v.f107131x).mo47829a("enter_from", this.f125025a.f125001v.f107133z).mo47827a("dalvikPss", a.f114754d).mo47827a("nativePss", a2.f114755e).mo47827a("otherPss", a3.f114757g).mo47827a("totalPss", a4.f114756f).f61491a);
                C46769b.m101573a();
                return;
            }
            C10691a.m21548c((Context) this.f125025a.f33840g_, (int) R.string.gap).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$w */
    static final class C49892w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49869c f125026a;

        C49892w(C49869c cVar) {
            this.f125026a = cVar;
        }

        public final void run() {
            C49869c.m107627d(this.f125026a).setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo97701a(boolean z) {
        ImageView imageView = this.f124992m;
        if (imageView == null) {
            C52711k.m112237a("goNextButton");
        }
        imageView.setSelected(z);
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

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        RecordLayout recordLayout = this.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout.mo91903c();
    }

    /* renamed from: B */
    public final void mo24458B() {
        super.mo24458B();
        if (this.f124994o != null) {
            Dialog dialog = this.f124994o;
            if (dialog == null) {
                C52711k.m112234a();
            }
            if (dialog.isShowing()) {
                Dialog dialog2 = this.f124994o;
                if (dialog2 == null) {
                    C52711k.m112234a();
                }
                C49893d.m107654a(dialog2);
            }
        }
    }

    /* renamed from: F */
    public final void mo97700F() {
        if (this.f124995p != null) {
            AnimationImageView animationImageView = this.f124995p;
            if (animationImageView == null) {
                C52711k.m112237a("colorSchemeLottieView");
            }
            animationImageView.setVisibility(0);
            AnimationImageView animationImageView2 = this.f124995p;
            if (animationImageView2 == null) {
                C52711k.m112237a("colorSchemeLottieView");
            }
            animationImageView2.mo6654b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AnimationImageView m107624a(C49869c cVar) {
        AnimationImageView animationImageView = cVar.f124995p;
        if (animationImageView == null) {
            C52711k.m112237a("colorSchemeLottieView");
        }
        return animationImageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecordLayout m107625b(C49869c cVar) {
        RecordLayout recordLayout = cVar.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        return recordLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m107626c(C49869c cVar) {
        View view = cVar.f124989j;
        if (view == null) {
            C52711k.m112237a("nextGroupContainer");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ FrameLayout m107627d(C49869c cVar) {
        FrameLayout frameLayout = cVar.f124996q;
        if (frameLayout == null) {
            C52711k.m112237a("colorSchemeLayout");
        }
        return frameLayout;
    }

    /* renamed from: e */
    public static final /* synthetic */ ProgressSegmentView m107628e(C49869c cVar) {
        ProgressSegmentView progressSegmentView = cVar.f124988i;
        if (progressSegmentView == null) {
            C52711k.m112237a("progressSegmentView");
        }
        return progressSegmentView;
    }

    /* renamed from: d */
    public final void mo97702d(int i) {
        ImageView imageView = this.f124992m;
        if (imageView == null) {
            C52711k.m112237a("goNextButton");
        }
        imageView.setVisibility(i);
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        C45582a aVar;
        super.mo24448e(bundle);
        View j_ = mo24467j_(R.id.c6c);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.progress_segment_view)");
        this.f124988i = (ProgressSegmentView) j_;
        C2763g<Boolean> gVar = this.f124984H;
        if (gVar != null) {
            gVar.mo7352a(this, new C49875f(this));
        }
        C0184k kVar = this;
        this.f124977A.mo7352a(kVar, new C49876g(this));
        this.f124978B.mo7352a(kVar, new C49877h(this));
        this.f125004z.mo7352a(kVar, new C49878i(this));
        this.f124980D.mo7352a(kVar, new C49879j(this));
        this.f124981E.mo7352a(kVar, new C49880k(this));
        this.f124982F.mo7352a(kVar, new C49881l(this));
        this.f124979C.mo7352a(kVar, new C49882m(this));
        this.f124983G.mo7352a(kVar, new C49883n(this));
        View j_2 = mo24467j_(R.id.c9_);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.rdl_record)");
        this.f124990k = (RecordLayout) j_2;
        View j_3 = mo24467j_(R.id.e2l);
        C52711k.m112236a((Object) j_3, "requireViewById(R.id.color_scheme_layout)");
        this.f124996q = (FrameLayout) j_3;
        View j_4 = mo24467j_(R.id.e2m);
        C52711k.m112236a((Object) j_4, "requireViewById(R.id.color_scheme_lottie)");
        this.f124995p = (AnimationImageView) j_4;
        View j_5 = mo24467j_(R.id.e2j);
        C52711k.m112236a((Object) j_5, "requireViewById(R.id.color_scheme_background)");
        this.f124997r = (FrameLayout) j_5;
        View j_6 = mo24467j_(R.id.e2k);
        C52711k.m112236a((Object) j_6, "requireViewById(R.id.color_scheme_icon)");
        this.f125002x = (ImageView) j_6;
        RecordLayout recordLayout = this.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        FrameLayout frameLayout = this.f124997r;
        if (frameLayout == null) {
            C52711k.m112237a("colorSchemeBackground");
        }
        recordLayout.setColorSchemeBackground(frameLayout);
        RecordLayout recordLayout2 = this.f124990k;
        if (recordLayout2 == null) {
            C52711k.m112237a("recordLayout");
        }
        ImageView imageView = this.f125002x;
        if (imageView == null) {
            C52711k.m112237a("colorSchemeIcon");
        }
        recordLayout2.setColorSchemeIcon(imageView);
        FrameLayout frameLayout2 = this.f124996q;
        if (frameLayout2 == null) {
            C52711k.m112237a("colorSchemeLayout");
        }
        frameLayout2.bringToFront();
        switch (C39629l.m88232a().mo58583n().mo83104b(C40790a.RecordLayoutColorScheme)) {
            case 1:
                aVar = C45582a.PLAN_A;
                break;
            case 2:
                aVar = C45582a.PLAN_B;
                break;
            case 3:
                aVar = C45582a.PLAN_C;
                break;
            default:
                aVar = C45582a.DEFAULT;
                break;
        }
        this.f124999t = aVar;
        if (this.f124999t == C45582a.PLAN_B) {
            this.f125003y = C50201e.m108355a(this.f125001v.mo86375p());
            if (this.f125003y) {
                this.f125003y = false;
                if (this.f124995p != null) {
                    C2442f.m7143c(this.f33840g_, "white_circle_color_light.json").mo6869a((C2473i<T>) new C49884o<T>(this)).mo6874c(new C49885p(this));
                }
            }
        }
        View j_7 = mo24467j_(R.id.en3);
        C52711k.m112236a((Object) j_7, "requireViewById(R.id.next_group_container)");
        this.f124989j = j_7;
        RecordLayout recordLayout3 = this.f124990k;
        if (recordLayout3 == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout3.setActivity(this.f33840g_);
        FragmentActivity a = C12932b.m25976a(this);
        C45004a aVar2 = this.f125000u;
        RecordLayout recordLayout4 = this.f124990k;
        if (recordLayout4 == null) {
            C52711k.m112237a("recordLayout");
        }
        new C43221do(a, aVar2, recordLayout4, new C49886q(this));
        C2763g<Boolean> gVar2 = this.f124985I;
        if (gVar2 != null) {
            gVar2.mo7352a(kVar, new C49887r(this));
        }
        C2763g<ScaleGestureDetector> gVar3 = this.f124986J;
        if (gVar3 != null) {
            gVar3.mo7352a(kVar, new C49888s(this));
        }
        C2763g<C44926a> gVar4 = this.f124987K;
        if (gVar4 != null) {
            gVar4.mo7352a(kVar, new C49889t(this));
        }
        View j_8 = mo24467j_(R.id.azv);
        C52711k.m112236a((Object) j_8, "requireViewById(R.id.iv_deleteLast)");
        this.f124991l = j_8;
        View j_9 = mo24467j_(R.id.ol);
        C52711k.m112236a((Object) j_9, "requireViewById(R.id.btn_next)");
        this.f124992m = (ImageView) j_9;
        View view = this.f124991l;
        if (view == null) {
            C52711k.m112237a("deleteLast");
        }
        view.setOnClickListener(new C49890u(this));
        ImageView imageView2 = this.f124992m;
        if (imageView2 == null) {
            C52711k.m112237a("goNextButton");
        }
        imageView2.setOnClickListener(new C49891v(this));
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
        View inflate = layoutInflater.inflate(R.layout.brf, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…ogress, container, false)");
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

    public C49869c(C45004a aVar, ShortVideoContext shortVideoContext, C2763g<Long> gVar, C2763g<C52847n<List<TimeSpeedModelExtension>, Long>> gVar2, C2763g<C52855s<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> gVar3, C2763g<Integer> gVar4, C2763g<RetakeVideoContext> gVar5, C2763g<C52847n<List<TimeSpeedModelExtension>, Long>> gVar6, C2763g<C52855s<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> gVar7, C2763g<Boolean> gVar8, C2763g<Boolean> gVar9, C2763g<Boolean> gVar10, C2763g<ScaleGestureDetector> gVar11, C2763g<C44926a> gVar12) {
        C52711k.m112240b(aVar, "cameraApiComponent");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        C52711k.m112240b(gVar, "progressMaxDuration");
        C52711k.m112240b(gVar2, "progressClipAnchors");
        C52711k.m112240b(gVar3, "progressClipWithStitch");
        C52711k.m112240b(gVar4, "retakeState");
        C52711k.m112240b(gVar5, "retakeVideoContext");
        C52711k.m112240b(gVar6, "retakeProgressClipAnchors");
        C52711k.m112240b(gVar7, "retakeProgressClipWithStitch");
        C52711k.m112240b(gVar8, "progressSegmentVisible");
        this.f125000u = aVar;
        this.f125001v = shortVideoContext;
        this.f125004z = gVar;
        this.f124977A = gVar2;
        this.f124978B = gVar3;
        this.f124979C = gVar4;
        this.f124980D = gVar5;
        this.f124981E = gVar6;
        this.f124982F = gVar7;
        this.f124983G = gVar8;
        this.f124984H = gVar9;
        this.f124985I = gVar10;
        this.f124986J = gVar11;
        this.f124987K = gVar12;
    }
}
