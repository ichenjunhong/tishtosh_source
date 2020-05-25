package com.p683ss.android.ugc.aweme.shortvideo.countdown;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtRadioButton;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14041b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p929d.C13745c;
import com.p683ss.android.ugc.aweme.anim.C22679a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32465c;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView;
import com.p683ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView.C45591a;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.p2504a.C50181a.C50185b;
import com.ss.android.ugc.trill.R;
import java.text.DecimalFormat;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f */
public final class C42512f extends C12924i implements C11872h {

    /* renamed from: z */
    public static final C42513a f107520z = new C42513a(null);

    /* renamed from: A */
    private SafeHandler f107521A;

    /* renamed from: B */
    private View f107522B;

    /* renamed from: i */
    public VolumeTapsView f107523i;

    /* renamed from: j */
    public C42538k f107524j;

    /* renamed from: k */
    public C42539l f107525k;

    /* renamed from: l */
    public TextView f107526l;

    /* renamed from: m */
    public TextView f107527m;

    /* renamed from: n */
    public TextView f107528n;

    /* renamed from: o */
    public TextView f107529o;

    /* renamed from: p */
    public final CountdownViewModel f107530p;

    /* renamed from: q */
    public boolean f107531q;

    /* renamed from: r */
    public int f107532r;

    /* renamed from: s */
    public ViewGroup f107533s;

    /* renamed from: t */
    public TextView f107534t;

    /* renamed from: u */
    public RadioGroup f107535u;

    /* renamed from: v */
    public DmtRadioButton f107536v;

    /* renamed from: w */
    public DmtRadioButton f107537w;

    /* renamed from: x */
    public C32465c f107538x;

    /* renamed from: y */
    public C42514b f107539y;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$a */
    public static final class C42513a {
        private C42513a() {
        }

        public /* synthetic */ C42513a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m93408a(float f) {
            String format = new DecimalFormat("0.0").format(Float.valueOf(f));
            C52711k.m112236a((Object) format, "DecimalFormat(\"0.0\").format(this)");
            return format;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$b */
    public interface C42514b {
        /* renamed from: a */
        void mo86738a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$c */
    static final class C42515c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42512f f107540a;

        C42515c(C42512f fVar) {
            this.f107540a = fVar;
        }

        public final void run() {
            ViewGroup viewGroup = this.f107540a.f107533s;
            if (viewGroup == null) {
                C52711k.m112237a("countDownTitleView");
            }
            int measuredWidth = viewGroup.getMeasuredWidth();
            TextView textView = this.f107540a.f107534t;
            if (textView == null) {
                C52711k.m112237a("countDownTitleTextView");
            }
            int measuredWidth2 = textView.getMeasuredWidth();
            RadioGroup radioGroup = this.f107540a.f107535u;
            if (radioGroup == null) {
                C52711k.m112237a("countDownSwitchView");
            }
            if (((float) measuredWidth) < ((float) (measuredWidth2 + radioGroup.getMeasuredWidth())) + C9432q.m18687b((Context) this.f107540a.f33840g_, 8.0f)) {
                C42512f fVar = this.f107540a;
                DmtRadioButton dmtRadioButton = this.f107540a.f107536v;
                if (dmtRadioButton == null) {
                    C52711k.m112237a("countDownShortView");
                }
                fVar.mo86736a(dmtRadioButton);
                C42512f fVar2 = this.f107540a;
                DmtRadioButton dmtRadioButton2 = this.f107540a.f107537w;
                if (dmtRadioButton2 == null) {
                    C52711k.m112237a("countDownLongView");
                }
                fVar2.mo86736a(dmtRadioButton2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$d */
    static final class C42516d extends C52712l implements C52671b<CountdownState, CountdownState> {

        /* renamed from: a */
        public static final C42516d f107541a = new C42516d();

        C42516d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CountdownState countdownState = (CountdownState) obj;
            C52711k.m112240b(countdownState, "$receiver");
            return countdownState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$e */
    static final class C42517e implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C42512f f107542a;

        C42517e(C42512f fVar) {
            this.f107542a = fVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.c90) {
                if (this.f107542a.f107532r != 3) {
                    this.f107542a.mo86737d(3);
                }
            } else if (i == R.id.c8z && this.f107542a.f107532r != 10) {
                this.f107542a.mo86737d(10);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$f */
    static final class C42518f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42512f f107543a;

        C42518f(C42512f fVar) {
            this.f107543a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity activity = this.f107543a.f33840g_;
            if (activity != null) {
                C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(ShortVideoContextViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
                C26890h.m65011a("count_down_start", C23089d.m56640a().mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("shoot_way", shortVideoContext.f107132y).mo47826a("draft_id", shortVideoContext.f107022A).mo47829a("countdown_type", this.f107543a.mo86733F()).f61491a);
                if (this.f107543a.f107524j != null) {
                    this.f107543a.mo22552a(this.f107543a.f107530p, new C52671b<CountdownState, Boolean>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C42518f f107544a;

                        {
                            this.f107544a = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            final CountdownState countdownState = (CountdownState) obj;
                            C52711k.m112240b(countdownState, "state");
                            TextView textView = this.f107544a.f107543a.f107529o;
                            if (textView == null) {
                                C52711k.m112237a("record");
                            }
                            return Boolean.valueOf(textView.post(new Runnable(this) {

                                /* renamed from: a */
                                final /* synthetic */ C425191 f107545a;

                                {
                                    this.f107545a = r1;
                                }

                                public final void run() {
                                    C42538k kVar = this.f107545a.f107544a.f107543a.f107524j;
                                    if (kVar != null) {
                                        kVar.mo86755a(C42512f.m93384a(this.f107545a.f107544a.f107543a).getStopPosition() - ((int) countdownState.getStartTime()), this.f107545a.f107544a.f107543a.f107532r);
                                    }
                                    this.f107545a.f107544a.f107543a.f107531q = true;
                                    C42512f fVar = this.f107545a.f107544a.f107543a;
                                    C12924i iVar = fVar.f33835c;
                                    if (!(iVar instanceof C12896b)) {
                                        iVar = null;
                                    }
                                    C12896b bVar = (C12896b) iVar;
                                    if (bVar != null) {
                                        bVar.mo24399b((C12924i) fVar);
                                    }
                                }
                            }));
                        }
                    });
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$g */
    static final class C42521g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42512f f107547a;

        C42521g(C42512f fVar) {
            this.f107547a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42539l lVar = this.f107547a.f107525k;
            if (lVar != null) {
                lVar.mo86757a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$h */
    static final class C42522h extends C52712l implements C52682m<C11866f, CountdownState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42512f f107548a;

        C42522h(C42512f fVar) {
            this.f107548a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            CountdownState countdownState = (CountdownState) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(countdownState, "state");
            C42512f.m93384a(this.f107548a).mo91964a((int) countdownState.getStartTime(), (int) (countdownState.getStartTime() + countdownState.getMaxDuration()));
            C42512f.m93384a(this.f107548a).mo91965a(countdownState.getWaveInfo(), C39618d.f101168i.mo80578b(countdownState.getMusicPath()));
            C42512f.m93384a(this.f107548a).setTotalTime(countdownState.getTotalTime());
            C42512f.m93384a(this.f107548a).setPastPosition((int) (Math.max(0, countdownState.getSdkRecordTime()) + countdownState.getStartTime()));
            C42512f.m93384a(this.f107548a).setStopPosition((int) (Math.max(0, countdownState.getMaxDuration()) + countdownState.getStartTime()));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$i */
    static final class C42523i extends C52712l implements C52682m<C11866f, UrlModel, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42512f f107549a;

        C42523i(C42512f fVar) {
            this.f107549a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            UrlModel urlModel = (UrlModel) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C50181a.m108297a(urlModel, (C50185b) new C50185b(this) {

                /* renamed from: a */
                final /* synthetic */ C42523i f107550a;

                /* renamed from: a */
                public final void mo86745a(Exception exc) {
                    C52711k.m112240b(exc, "e");
                }

                {
                    this.f107550a = r1;
                }

                /* renamed from: a */
                public final void mo86744a(C13745c<C13715a<C14042c>> cVar) {
                    C52711k.m112240b(cVar, "dataSource");
                    if (cVar.mo25672b()) {
                        C13715a aVar = (C13715a) cVar.mo25674d();
                        Bitmap bitmap = null;
                        if (aVar != null && (aVar.mo25630a() instanceof C14041b)) {
                            Object a = aVar.mo25630a();
                            if (a != null) {
                                bitmap = ((C14041b) a).mo26257d();
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
                            }
                        }
                        try {
                            C42512f.m93384a(this.f107550a.f107549a).setWavForm(bitmap);
                        } finally {
                            C13715a.m27752c(aVar);
                        }
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$j */
    public static final class C42525j implements C45591a {

        /* renamed from: a */
        final /* synthetic */ C42512f f107551a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$j$a */
        static final class C42526a extends C52712l implements C52671b<CountdownState, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C42525j f107552a;

            /* renamed from: b */
            final /* synthetic */ int f107553b;

            C42526a(C42525j jVar, int i) {
                this.f107552a = jVar;
                this.f107553b = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                CountdownState countdownState = (CountdownState) obj;
                C52711k.m112240b(countdownState, "state");
                this.f107552a.f107551a.mo86735a((long) this.f107553b, countdownState.getStartTime(), countdownState.getMaxDuration());
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$j$b */
        static final class C42527b extends C52712l implements C52671b<CountdownState, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C42525j f107554a;

            /* renamed from: b */
            final /* synthetic */ int f107555b;

            /* renamed from: c */
            final /* synthetic */ int f107556c;

            C42527b(C42525j jVar, int i, int i2) {
                this.f107554a = jVar;
                this.f107555b = i;
                this.f107556c = i2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                CountdownState countdownState = (CountdownState) obj;
                C52711k.m112240b(countdownState, "state");
                C42538k kVar = this.f107554a.f107551a.f107524j;
                if (kVar != null) {
                    kVar.mo86756a(countdownState.getMusicPath(), this.f107555b, this.f107556c);
                }
                this.f107554a.f107551a.mo86735a((long) this.f107556c, countdownState.getStartTime(), countdownState.getMaxDuration());
                return C52860x.f131107a;
            }
        }

        C42525j(C42512f fVar) {
            this.f107551a = fVar;
        }

        /* renamed from: a */
        public final void mo86746a(int i) {
            this.f107551a.mo22552a(this.f107551a.f107530p, new C42526a(this, i));
        }

        /* renamed from: a */
        public final void mo86747a(int i, int i2) {
            this.f107551a.mo22552a(this.f107551a.f107530p, new C42527b(this, i, i2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$k */
    static final class C42528k extends C52712l implements C52682m<C11866f, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42512f f107557a;

        C42528k(C42512f fVar) {
            this.f107557a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            long longValue = ((Number) obj2).longValue();
            C52711k.m112240b(fVar, "$receiver");
            TextView b = C42512f.m93385b(this.f107557a);
            StringBuilder sb = new StringBuilder();
            sb.append(longValue / 1000);
            sb.append('s');
            b.setText(sb.toString());
            TextView c = C42512f.m93386c(this.f107557a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C42513a.m93408a(((float) longValue) / 1000.0f));
            sb2.append('s');
            c.setText(sb2.toString());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$l */
    public static final class C42529l implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C42512f f107558a;

        /* renamed from: b */
        final /* synthetic */ View f107559b;

        /* renamed from: c */
        final /* synthetic */ View f107560c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$l$a */
        static final class C42530a extends C52712l implements C52671b<CountdownState, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C42529l f107561a;

            C42530a(C42529l lVar) {
                this.f107561a = lVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                CountdownState countdownState = (CountdownState) obj;
                C52711k.m112240b(countdownState, "state");
                this.f107561a.f107558a.mo86735a((long) C42512f.m93384a(this.f107561a.f107558a).getStopPosition(), countdownState.getStartTime(), countdownState.getMaxDuration());
                this.f107561a.f107559b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f107561a);
                C42538k kVar = this.f107561a.f107558a.f107524j;
                if (kVar == null) {
                    return null;
                }
                kVar.mo86756a(countdownState.getMusicPath(), (int) (countdownState.getStartTime() + countdownState.getSdkRecordTime()), (int) (countdownState.getStartTime() + countdownState.getMaxDuration()));
                return C52860x.f131107a;
            }
        }

        public final void onGlobalLayout() {
            this.f107558a.mo22552a(this.f107558a.f107530p, new C42530a(this));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f107560c, "translationY", new float[]{(float) this.f107560c.getMeasuredHeight(), 0.0f});
            ofFloat.setInterpolator(new C22679a());
            ofFloat.setDuration(490);
            ofFloat.start();
        }

        C42529l(C42512f fVar, View view, View view2) {
            this.f107558a = fVar;
            this.f107559b = view;
            this.f107560c = view2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$m */
    static final class C42531m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42512f f107562a;

        /* renamed from: b */
        final /* synthetic */ int f107563b;

        C42531m(C42512f fVar, int i) {
            this.f107562a = fVar;
            this.f107563b = i;
        }

        public final /* synthetic */ void run() {
            if (this.f107562a.f107538x == null) {
                Activity activity = this.f107562a.f33840g_;
                if (activity != null) {
                    C52711k.m112236a((Object) activity, "activity ?: return@showToast");
                    this.f107562a.f107538x = new C32465c(activity);
                } else {
                    return;
                }
            }
            C32465c cVar = this.f107562a.f107538x;
            if (cVar != null) {
                C42512f fVar = this.f107562a;
                Object[] objArr = new Object[1];
                int i = 3;
                if (this.f107563b != 3) {
                    i = 10;
                }
                objArr[0] = Integer.valueOf(i);
                cVar.mo65737a(fVar.mo24462a((int) R.string.aj2, objArr));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$n */
    static final class C42532n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42512f f107564a;

        /* renamed from: b */
        final /* synthetic */ long f107565b;

        /* renamed from: c */
        final /* synthetic */ long f107566c;

        /* renamed from: d */
        final /* synthetic */ long f107567d;

        C42532n(C42512f fVar, long j, long j2, long j3) {
            this.f107564a = fVar;
            this.f107565b = j;
            this.f107566c = j2;
            this.f107567d = j3;
        }

        public final void run() {
            C42512f fVar = this.f107564a;
            long j = this.f107565b;
            long j2 = this.f107566c;
            long j3 = this.f107567d;
            float f = ((float) (j - j2)) * 1.0f;
            VolumeTapsView volumeTapsView = fVar.f107523i;
            if (volumeTapsView == null) {
                C52711k.m112237a("volumeTapsView");
            }
            float max = Math.max(0.0f, (f * ((float) volumeTapsView.getMeasuredWidth())) / ((float) j3));
            TextView c = C42512f.m93386c(this.f107564a);
            StringBuilder sb = new StringBuilder();
            sb.append(C42513a.m93408a(((float) (this.f107565b - this.f107566c)) / 1000.0f));
            sb.append('s');
            c.setText(sb.toString());
            C42512f.m93386c(this.f107564a).setTranslationX((max / ((float) C42512f.m93384a(this.f107564a).getMeasuredWidth())) * ((float) (C42512f.m93384a(this.f107564a).getMeasuredWidth() - C42512f.m93386c(this.f107564a).getMeasuredWidth())));
            C42512f.m93385b(this.f107564a).setAlpha(this.f107564a.mo86734a(max));
            TextView textView = this.f107564a.f107526l;
            if (textView == null) {
                C52711k.m112237a("startTextView");
            }
            textView.setAlpha(this.f107564a.mo86734a(((float) C42512f.m93384a(this.f107564a).getMeasuredWidth()) - max));
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo86735a(long j, long j2, long j3) {
        SafeHandler safeHandler = this.f107521A;
        if (safeHandler == null) {
            C52711k.m112237a("safeHandler");
        }
        C42532n nVar = new C42532n(this, j, j2, j3);
        safeHandler.post(nVar);
    }

    /* renamed from: a */
    public final void mo86736a(DmtRadioButton dmtRadioButton) {
        LayoutParams layoutParams = dmtRadioButton.getLayoutParams();
        if (!(layoutParams instanceof RadioGroup.LayoutParams)) {
            layoutParams = null;
        }
        RadioGroup.LayoutParams layoutParams2 = (RadioGroup.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.width = (int) C9432q.m18687b((Context) this.f33840g_, 32.0f);
            dmtRadioButton.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C11873a.m24226a(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C11873a.m24228b(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C11873a.m24231e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C11873a.m24229c(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C11873a.m24230d(this);
    }

    /* renamed from: B */
    public final void mo24458B() {
        super.mo24458B();
        C32465c cVar = this.f107538x;
        if (cVar != null) {
            cVar.mo65742d();
        }
    }

    /* renamed from: F */
    public final String mo86733F() {
        if (this.f107532r == 3) {
            return "3s";
        }
        return "10s";
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        C42538k kVar = this.f107524j;
        if (kVar != null) {
            kVar.mo86754a();
        }
        C42539l lVar = this.f107525k;
        if (lVar != null) {
            lVar.mo86758a(this.f107531q);
        }
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        ViewGroup viewGroup = this.f107533s;
        if (viewGroup == null) {
            C52711k.m112237a("countDownTitleView");
        }
        viewGroup.post(new C42515c(this));
    }

    public C42512f(CountdownState countdownState) {
        C52711k.m112240b(countdownState, "initState");
        this.f107530p = new CountdownViewModel(countdownState);
    }

    /* renamed from: a */
    public static final /* synthetic */ VolumeTapsView m93384a(C42512f fVar) {
        VolumeTapsView volumeTapsView = fVar.f107523i;
        if (volumeTapsView == null) {
            C52711k.m112237a("volumeTapsView");
        }
        return volumeTapsView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m93385b(C42512f fVar) {
        TextView textView = fVar.f107527m;
        if (textView == null) {
            C52711k.m112237a("endTextView");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m93386c(C42512f fVar) {
        TextView textView = fVar.f107528n;
        if (textView == null) {
            C52711k.m112237a("anchorTextView");
        }
        return textView;
    }

    /* renamed from: a */
    public final float mo86734a(float f) {
        VolumeTapsView volumeTapsView = this.f107523i;
        if (volumeTapsView == null) {
            C52711k.m112237a("volumeTapsView");
        }
        float measuredWidth = ((float) volumeTapsView.getMeasuredWidth()) - f;
        TextView textView = this.f107527m;
        if (textView == null) {
            C52711k.m112237a("endTextView");
        }
        return Math.min(1.0f, (measuredWidth - ((float) textView.getMeasuredWidth())) / 100.0f);
    }

    /* renamed from: d */
    public final void mo86737d(int i) {
        Activity activity = this.f33840g_;
        if (activity != null) {
            C52711k.m112236a((Object) activity, "activity ?: return");
            this.f107532r = i;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                C0209x a = C0214z.m440a((FragmentActivity) activity2).mo359a(ShortVideoContextViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
                C26890h.m65011a("select_countdown_type", C23089d.m56640a().mo47829a("enter_from", "video_shoot_page").mo47829a("shoot_way", shortVideoContext.f107132y).mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("content_type", "video").mo47829a("to_status", mo86733F()).f61491a);
                SafeHandler safeHandler = this.f107521A;
                if (safeHandler == null) {
                    C52711k.m112237a("safeHandler");
                }
                safeHandler.post(new C42531m(this, i));
                ((C39666o) C26888e.m65000a(activity, C39666o.class)).mo48461d(i);
                C42514b bVar = this.f107539y;
                if (bVar != null) {
                    bVar.mo86738a(i);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        this.f107521A = new SafeHandler(this);
        this.f107530p.mo22526a((C52671b<? super S, ? extends S>) C42516d.f107541a);
        View inflate = layoutInflater.inflate(R.layout.pm, viewGroup, false);
        C52711k.m112236a((Object) inflate, "contentView");
        inflate.setMinimumWidth(100000);
        View findViewById = inflate.findViewById(R.id.dsn);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.volume_taps_view)");
        this.f107523i = (VolumeTapsView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cz8);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.text_start)");
        this.f107526l = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.cyn);
        C52711k.m112236a((Object) findViewById3, "contentView.findViewById(R.id.text_end)");
        this.f107527m = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.cz0);
        C52711k.m112236a((Object) findViewById4, "contentView.findViewById(R.id.text_progress)");
        this.f107528n = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.csb);
        C52711k.m112236a((Object) findViewById5, "contentView.findViewById(R.id.start_record)");
        this.f107529o = (TextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.d19);
        C52711k.m112236a((Object) findViewById6, "contentView.findViewById(R.id.title_countDown)");
        this.f107533s = (ViewGroup) findViewById6;
        View findViewById7 = inflate.findViewById(R.id.cyj);
        C52711k.m112236a((Object) findViewById7, "contentView.findViewById(R.id.text_countdown)");
        this.f107534t = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(R.id.a15);
        C52711k.m112236a((Object) findViewById8, "contentView.findViewById(R.id.count_down_panel)");
        this.f107522B = findViewById8;
        View findViewById9 = inflate.findViewById(R.id.cc1);
        C52711k.m112236a((Object) findViewById9, "contentView.findViewById(R.id.rg_countdown_switch)");
        this.f107535u = (RadioGroup) findViewById9;
        View findViewById10 = inflate.findViewById(R.id.c90);
        C52711k.m112236a((Object) findViewById10, "contentView.findViewById(R.id.rb_countdown_3)");
        this.f107536v = (DmtRadioButton) findViewById10;
        View findViewById11 = inflate.findViewById(R.id.c8z);
        C52711k.m112236a((Object) findViewById11, "contentView.findViewById(R.id.rb_countdown_10)");
        this.f107537w = (DmtRadioButton) findViewById11;
        DmtRadioButton dmtRadioButton = this.f107536v;
        if (dmtRadioButton == null) {
            C52711k.m112237a("countDownShortView");
        }
        TextPaint paint = dmtRadioButton.getPaint();
        C52711k.m112236a((Object) paint, "countDownShortView.paint");
        paint.setFakeBoldText(true);
        DmtRadioButton dmtRadioButton2 = this.f107537w;
        if (dmtRadioButton2 == null) {
            C52711k.m112237a("countDownLongView");
        }
        TextPaint paint2 = dmtRadioButton2.getPaint();
        C52711k.m112236a((Object) paint2, "countDownLongView.paint");
        paint2.setFakeBoldText(true);
        if (C47918gj.m103682a(this.f33840g_)) {
            DmtRadioButton dmtRadioButton3 = this.f107536v;
            if (dmtRadioButton3 == null) {
                C52711k.m112237a("countDownShortView");
            }
            dmtRadioButton3.setBackgroundResource(R.drawable.dx);
            DmtRadioButton dmtRadioButton4 = this.f107537w;
            if (dmtRadioButton4 == null) {
                C52711k.m112237a("countDownLongView");
            }
            dmtRadioButton4.setBackgroundResource(R.drawable.du);
        }
        RadioGroup radioGroup = this.f107535u;
        if (radioGroup == null) {
            C52711k.m112237a("countDownSwitchView");
        }
        radioGroup.setOnCheckedChangeListener(new C42517e(this));
        this.f107532r = ((C39666o) C26888e.m65000a(this.f33840g_, C39666o.class)).mo48463e(3);
        if (this.f107532r == 3) {
            DmtRadioButton dmtRadioButton5 = this.f107536v;
            if (dmtRadioButton5 == null) {
                C52711k.m112237a("countDownShortView");
            }
            dmtRadioButton5.setChecked(true);
        } else {
            DmtRadioButton dmtRadioButton6 = this.f107537w;
            if (dmtRadioButton6 == null) {
                C52711k.m112237a("countDownLongView");
            }
            dmtRadioButton6.setChecked(true);
        }
        TextView textView = this.f107529o;
        if (textView == null) {
            C52711k.m112237a("record");
        }
        textView.setOnClickListener(new C42518f(this));
        inflate.findViewById(R.id.a16).setOnClickListener(new C42521g(this));
        View view = this.f107522B;
        if (view == null) {
            C52711k.m112237a("countdownPanel");
        }
        mo22546a(this.f107530p, C11896i.m24255a(), new C42522h(this));
        mo22547a(this.f107530p, C42533g.f107568a, C11896i.m24255a(), new C42523i(this));
        VolumeTapsView volumeTapsView = this.f107523i;
        if (volumeTapsView == null) {
            C52711k.m112237a("volumeTapsView");
        }
        volumeTapsView.setOnProgressChangeListener(new C42525j(this));
        TextView textView2 = this.f107526l;
        if (textView2 == null) {
            C52711k.m112237a("startTextView");
        }
        textView2.setText("0s");
        mo22547a(this.f107530p, C42534h.f107569a, C11896i.m24255a(), new C42528k(this));
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new C42529l(this, inflate, view));
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24221a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11873a.m24223a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11873a.m24222a((C11872h) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11873a.m24224a((C11872h) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
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
        return C11873a.m24225a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
