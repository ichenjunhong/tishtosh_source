package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.CheckableImageButton;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
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
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43065m;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.LivePublishModel;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48925b;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52724b;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d */
public final class C42880d extends C48925b implements C49548a {

    /* renamed from: w */
    public static final C42881a f108360w = new C42881a(null);

    /* renamed from: i */
    public C42820ax f108361i;

    /* renamed from: j */
    public VECutVideoPresenter f108362j;

    /* renamed from: k */
    public C42873bn f108363k;

    /* renamed from: l */
    TextView f108364l;

    /* renamed from: m */
    public ImageView f108365m;

    /* renamed from: n */
    public CheckableImageButton f108366n;

    /* renamed from: o */
    public ImageView f108367o;

    /* renamed from: p */
    public CutVideoBottomBarViewModel f108368p;

    /* renamed from: q */
    public CutVideoViewModel f108369q;

    /* renamed from: r */
    VideoEditViewModel f108370r;

    /* renamed from: s */
    public CutVideoListViewModel f108371s;

    /* renamed from: t */
    public CutVideoSpeedViewModel f108372t;

    /* renamed from: u */
    public CutMultiVideoViewModel f108373u;

    /* renamed from: v */
    CutVideoEditViewModel f108374v;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$a */
    public static final class C42881a {
        private C42881a() {
        }

        public /* synthetic */ C42881a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$b */
    static final class C42882b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42880d f108375a;

        C42882b(C42880d dVar) {
            this.f108375a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42880d dVar = this.f108375a;
            C52670a r0 = new C52670a<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C42882b f108376a;

                {
                    this.f108376a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    C42880d.m94100d(this.f108376a.f108375a).mo22530c(C42693b.f108006a);
                    return C52860x.f131107a;
                }
            };
            Activity activity = dVar.f33840g_;
            if (activity != null) {
                new C10643a(activity).mo18899b((int) R.string.aok).mo18900b((int) R.string.c8b, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.ao2, (DialogInterface.OnClickListener) new C42898q(r0)).mo18897a().mo18882b().show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$c */
    static final class C42884c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42880d f108377a;

        C42884c(C42880d dVar) {
            this.f108377a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            boolean isChecked = C42880d.m94097a(this.f108377a).isChecked();
            C42880d.m94097a(this.f108377a).toggle();
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f108377a.f108368p;
            if (cutVideoBottomBarViewModel == null) {
                C52711k.m112237a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.mo87017b(!isChecked);
            if (C42880d.m94101e(this.f108377a).mo87178g()) {
                C42880d.m94100d(this.f108377a).mo22530c(new C42703l(!isChecked));
            } else if (!isChecked) {
                CutVideoSpeedViewModel f = C42880d.m94102f(this.f108377a);
                C42873bn bnVar = this.f108377a.f108363k;
                if (bnVar == null) {
                    C52711k.m112237a("previewEditCallback");
                }
                C47339t a = C42652k.m93581a(bnVar.mo87245R().getCurrentSpeed());
                C52711k.m112236a((Object) a, "MVConfig.fromValue(previ…oEditView().currentSpeed)");
                f.mo87126a(a);
                C42880d.m94102f(this.f108377a).mo87128b(true);
            } else {
                C42880d.m94102f(this.f108377a).mo87128b(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$d */
    static final class C42885d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42880d f108378a;

        C42885d(C42880d dVar) {
            this.f108378a = dVar;
        }

        public final void onClick(View view) {
            int i;
            int i2;
            C43065m mVar;
            C43065m mVar2;
            C43065m mVar3;
            Integer num;
            View view2 = view;
            ClickInstrumentation.onClick(view);
            C42652k.m93582a();
            CutVideoViewModel e = C42880d.m94101e(this.f108378a);
            C43065m mVar4 = null;
            if (e.mo87184m()) {
                C42734ad adVar = e.f108052d;
                if (adVar == null) {
                    C52711k.m112237a("cutVideoModel");
                }
                LivePublishModel livePublishModel = adVar.f108076s;
                if (livePublishModel != null) {
                    C42734ad adVar2 = e.f108052d;
                    if (adVar2 == null) {
                        C52711k.m112237a("cutVideoModel");
                    }
                    LivePublishModel livePublishModel2 = adVar2.f108076s;
                    if (livePublishModel2 != null) {
                        Integer rotate = livePublishModel2.getRotate();
                        if (rotate != null) {
                            num = Integer.valueOf((rotate.intValue() + 90) % 360);
                            livePublishModel.setRotate(num);
                        }
                    }
                    num = null;
                    livePublishModel.setRotate(num);
                }
            }
            C42880d dVar = this.f108378a;
            C52711k.m112236a((Object) view2, "it");
            C52711k.m112240b(view2, "view");
            C42873bn bnVar = dVar.f108363k;
            if (bnVar == null) {
                C52711k.m112237a("previewEditCallback");
            }
            int currentRotate = bnVar.mo87245R().getCurrentRotate();
            C52724b bVar = new C52724b();
            bVar.element = 0.0f;
            CutVideoEditViewModel cutVideoEditViewModel = dVar.f108374v;
            if (cutVideoEditViewModel == null) {
                C52711k.m112237a("cutVideoEditViewModel");
            }
            if (cutVideoEditViewModel.f107992e == 0) {
                VideoEditViewModel videoEditViewModel = dVar.f108370r;
                if (videoEditViewModel == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                List l = videoEditViewModel.mo87634l();
                CutVideoListViewModel cutVideoListViewModel = dVar.f108371s;
                if (cutVideoListViewModel == null) {
                    C52711k.m112237a("cutVideoListViewModel");
                }
                i2 = ((VideoSegment) l.get(cutVideoListViewModel.f108002f)).f107908g;
                VideoEditViewModel videoEditViewModel2 = dVar.f108370r;
                if (videoEditViewModel2 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                List l2 = videoEditViewModel2.mo87634l();
                CutVideoListViewModel cutVideoListViewModel2 = dVar.f108371s;
                if (cutVideoListViewModel2 == null) {
                    C52711k.m112237a("cutVideoListViewModel");
                }
                i = ((VideoSegment) l2.get(cutVideoListViewModel2.f108002f)).f107909h;
            } else {
                C42873bn bnVar2 = dVar.f108363k;
                if (bnVar2 == null) {
                    C52711k.m112237a("previewEditCallback");
                }
                i2 = bnVar2.mo87242O();
                C42873bn bnVar3 = dVar.f108363k;
                if (bnVar3 == null) {
                    C52711k.m112237a("previewEditCallback");
                }
                i = bnVar3.mo87243P();
            }
            C42873bn bnVar4 = dVar.f108363k;
            if (bnVar4 == null) {
                C52711k.m112237a("previewEditCallback");
            }
            float f = 1.0f;
            if (bnVar4.mo87245R().getCurrentRotate() % NormalGiftView.ALPHA_180 == 0) {
                bVar.element = 1.0f;
                f = (((float) i2) * 1.0f) / ((float) i);
            } else {
                bVar.element = (((float) i2) * 1.0f) / ((float) i);
            }
            VideoEditViewModel videoEditViewModel3 = dVar.f108370r;
            if (videoEditViewModel3 == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            List l3 = videoEditViewModel3.mo87634l();
            CutVideoListViewModel cutVideoListViewModel3 = dVar.f108371s;
            if (cutVideoListViewModel3 == null) {
                C52711k.m112237a("cutVideoListViewModel");
            }
            ((VideoSegment) l3.get(cutVideoListViewModel3.f108002f)).f107913l = f;
            VideoEditViewModel videoEditViewModel4 = dVar.f108370r;
            if (videoEditViewModel4 == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            List l4 = videoEditViewModel4.mo87634l();
            CutVideoListViewModel cutVideoListViewModel4 = dVar.f108371s;
            if (cutVideoListViewModel4 == null) {
                C52711k.m112237a("cutVideoListViewModel");
            }
            ((VideoSegment) l4.get(cutVideoListViewModel4.f108002f)).f107914m = f;
            C52724b bVar2 = new C52724b();
            bVar2.element = f - bVar.element;
            C52725c cVar = new C52725c();
            cVar.element = currentRotate % 360;
            C52725c cVar2 = new C52725c();
            cVar2.element = 0;
            C52725c cVar3 = new C52725c();
            cVar3.element = 0;
            CutVideoViewModel cutVideoViewModel = dVar.f108369q;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo87178g()) {
                C42820ax axVar = dVar.f108361i;
                if (axVar != null) {
                    mVar = axVar.mo87271g();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    bVar2.element = 0.0f;
                    C42820ax axVar2 = dVar.f108361i;
                    if (axVar2 != null) {
                        mVar2 = axVar2.mo87271g();
                    } else {
                        mVar2 = null;
                    }
                    if (mVar2 == null) {
                        C52711k.m112234a();
                    }
                    bVar.element = mVar2.f108708a;
                    C42820ax axVar3 = dVar.f108361i;
                    if (axVar3 != null) {
                        mVar3 = axVar3.mo87271g();
                    } else {
                        mVar3 = null;
                    }
                    if (mVar3 == null) {
                        C52711k.m112234a();
                    }
                    cVar2.element = mVar3.f108710c;
                    C42820ax axVar4 = dVar.f108361i;
                    if (axVar4 != null) {
                        mVar4 = axVar4.mo87271g();
                    }
                    if (mVar4 == null) {
                        C52711k.m112234a();
                    }
                    cVar3.element = mVar4.f108711d;
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            C42880d dVar2 = dVar;
            C52725c cVar4 = cVar;
            C52724b bVar3 = bVar;
            C52724b bVar4 = bVar2;
            C52725c cVar5 = cVar2;
            C52725c cVar6 = cVar3;
            ValueAnimator valueAnimator = ofFloat;
            View view3 = view;
            C42896o oVar = new C42896o(dVar2, cVar4, bVar3, bVar4, cVar5, cVar6, view3);
            valueAnimator.addUpdateListener(oVar);
            C42897p pVar = new C42897p(dVar2, cVar4, bVar3, bVar4, cVar5, cVar6, view3);
            valueAnimator.addListener(pVar);
            valueAnimator.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$e */
    static final class C42886e extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108379a;

        C42886e(C42880d dVar) {
            this.f108379a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            ImageView c = C42880d.m94099c(this.f108379a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$f */
    static final class C42887f extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108380a;

        C42887f(C42880d dVar) {
            this.f108380a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42880d.m94097a(this.f108380a).setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$g */
    static final class C42888g extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108381a;

        C42888g(C42880d dVar) {
            this.f108381a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42880d.m94098b(this.f108381a).setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$h */
    static final class C42889h extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108382a;

        C42889h(C42880d dVar) {
            this.f108382a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42880d.m94099c(this.f108382a).setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$i */
    static final class C42890i<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108383a;

        C42890i(C42880d dVar) {
            this.f108383a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                View view = this.f108383a.f33834b;
                C52711k.m112236a((Object) view, "view");
                C52711k.m112236a((Object) f, "it");
                view.setAlpha(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$j */
    static final class C42891j<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108384a;

        C42891j(C42880d dVar) {
            this.f108384a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f108384a.f33834b;
                C52711k.m112236a((Object) view, "view");
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$k */
    static final class C42892k extends C52712l implements C52682m<C49548a, Float, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108385a;

        C42892k(C42880d dVar) {
            this.f108385a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            float floatValue = ((Number) obj2).floatValue();
            C52711k.m112240b(aVar, "$receiver");
            C42880d dVar = this.f108385a;
            TextView textView = dVar.f108364l;
            if (textView == null) {
                C52711k.m112237a("tvTime");
            }
            C43155d dVar2 = C43155d.f109102e;
            Activity v = dVar.mo24477v();
            C52711k.m112236a((Object) v, "requireActivity()");
            C42873bn bnVar = dVar.f108363k;
            if (bnVar == null) {
                C52711k.m112237a("previewEditCallback");
            }
            textView.setText(dVar2.mo87727a(v, floatValue, bnVar.mo87245R().mo87519d()));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$l */
    static final class C42893l extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108386a;

        C42893l(C42880d dVar) {
            this.f108386a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            CheckableImageButton a = C42880d.m94097a(this.f108386a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$m */
    static final class C42894m extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108387a;

        C42894m(C42880d dVar) {
            this.f108387a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42880d.m94097a(this.f108387a).setChecked(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$n */
    static final class C42895n extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42880d f108388a;

        C42895n(C42880d dVar) {
            this.f108388a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            ImageView b = C42880d.m94098b(this.f108388a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$o */
    static final class C42896o implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C42880d f108389a;

        /* renamed from: b */
        final /* synthetic */ C52725c f108390b;

        /* renamed from: c */
        final /* synthetic */ C52724b f108391c;

        /* renamed from: d */
        final /* synthetic */ C52724b f108392d;

        /* renamed from: e */
        final /* synthetic */ C52725c f108393e;

        /* renamed from: f */
        final /* synthetic */ C52725c f108394f;

        /* renamed from: g */
        final /* synthetic */ View f108395g;

        C42896o(C42880d dVar, C52725c cVar, C52724b bVar, C52724b bVar2, C52725c cVar2, C52725c cVar3, View view) {
            this.f108389a = dVar;
            this.f108390b = cVar;
            this.f108391c = bVar;
            this.f108392d = bVar2;
            this.f108393e = cVar2;
            this.f108394f = cVar3;
            this.f108395g = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "animation");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VECutVideoPresenter vECutVideoPresenter = this.f108389a.f108362j;
            if (vECutVideoPresenter == null) {
                C52711k.m112237a("presenter");
            }
            VECutVideoPresenter.m93492a(vECutVideoPresenter, C42880d.m94100d(this.f108389a).f108002f, (90.0f * animatedFraction) + ((float) this.f108390b.element), false, (this.f108392d.element * animatedFraction) + this.f108391c.element, this.f108391c.element + (this.f108392d.element * animatedFraction), this.f108393e.element, this.f108394f.element, 4, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$p */
    public static final class C42897p extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C42880d f108396a;

        /* renamed from: b */
        final /* synthetic */ C52725c f108397b;

        /* renamed from: c */
        final /* synthetic */ C52724b f108398c;

        /* renamed from: d */
        final /* synthetic */ C52724b f108399d;

        /* renamed from: e */
        final /* synthetic */ C52725c f108400e;

        /* renamed from: f */
        final /* synthetic */ C52725c f108401f;

        /* renamed from: g */
        final /* synthetic */ View f108402g;

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f108402g.setEnabled(true);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f108402g.setEnabled(false);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f108402g.setEnabled(true);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f108396a.f108373u;
            if (cutMultiVideoViewModel == null) {
                C52711k.m112237a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo86802b();
        }

        C42897p(C42880d dVar, C52725c cVar, C52724b bVar, C52724b bVar2, C52725c cVar2, C52725c cVar3, View view) {
            this.f108396a = dVar;
            this.f108397b = cVar;
            this.f108398c = bVar;
            this.f108399d = bVar2;
            this.f108400e = cVar2;
            this.f108401f = cVar3;
            this.f108402g = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$q */
    static final class C42898q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f108403a;

        C42898q(C52670a aVar) {
            this.f108403a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f108403a.invoke();
        }
    }

    /* renamed from: a */
    public final void mo87335a(C42873bn bnVar) {
        C52711k.m112240b(bnVar, "<set-?>");
        this.f108363k = bnVar;
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        View j_ = mo24467j_(R.id.d6f);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.tvTime)");
        this.f108364l = (TextView) j_;
        View j_2 = mo24467j_(R.id.axo);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.ivRotate)");
        this.f108365m = (ImageView) j_2;
        View j_3 = mo24467j_(R.id.axq);
        C52711k.m112236a((Object) j_3, "requireViewById(R.id.ivSpeed)");
        this.f108366n = (CheckableImageButton) j_3;
        View j_4 = mo24467j_(R.id.axl);
        C52711k.m112236a((Object) j_4, "requireViewById(R.id.ivDelete)");
        this.f108367o = (ImageView) j_4;
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

    /* renamed from: a */
    public final void mo87334a(VECutVideoPresenter vECutVideoPresenter) {
        C52711k.m112240b(vECutVideoPresenter, "<set-?>");
        this.f108362j = vECutVideoPresenter;
    }

    /* renamed from: a */
    public static final /* synthetic */ CheckableImageButton m94097a(C42880d dVar) {
        CheckableImageButton checkableImageButton = dVar.f108366n;
        if (checkableImageButton == null) {
            C52711k.m112237a("ivSpeed");
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m94098b(C42880d dVar) {
        ImageView imageView = dVar.f108365m;
        if (imageView == null) {
            C52711k.m112237a("ivRotate");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m94099c(C42880d dVar) {
        ImageView imageView = dVar.f108367o;
        if (imageView == null) {
            C52711k.m112237a("ivDelete");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutVideoListViewModel m94100d(C42880d dVar) {
        CutVideoListViewModel cutVideoListViewModel = dVar.f108371s;
        if (cutVideoListViewModel == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoViewModel m94101e(C42880d dVar) {
        CutVideoViewModel cutVideoViewModel = dVar.f108369q;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ CutVideoSpeedViewModel m94102f(C42880d dVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = dVar.f108372t;
        if (cutVideoSpeedViewModel == null) {
            C52711k.m112237a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoBottomBarViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…BarViewModel::class.java)");
            this.f108368p = (CutVideoBottomBarViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(CutVideoViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…deoViewModel::class.java)");
                this.f108369q = (CutVideoViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    C0209x a3 = C0214z.m440a((FragmentActivity) activity3).mo359a(VideoEditViewModel.class);
                    C52711k.m112236a((Object) a3, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                    this.f108370r = (VideoEditViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(CutVideoListViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…istViewModel::class.java)");
                        this.f108371s = (CutVideoListViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(CutVideoSpeedViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…eedViewModel::class.java)");
                            this.f108372t = (CutVideoSpeedViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                C0209x a6 = C0214z.m440a((FragmentActivity) activity6).mo359a(CutMultiVideoViewModel.class);
                                C52711k.m112236a((Object) a6, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                                this.f108373u = (CutMultiVideoViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(CutVideoEditViewModel.class);
                                    C52711k.m112236a((Object) a7, "JediViewModelProviders.o…ditViewModel::class.java)");
                                    this.f108374v = (CutVideoEditViewModel) a7;
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f108368p;
                                    if (cutVideoBottomBarViewModel == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    mo49443b(cutVideoBottomBarViewModel, C42899e.f108404a, new C11934u(), new C42892k(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.f108368p;
                                    if (cutVideoBottomBarViewModel2 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    mo49443b(cutVideoBottomBarViewModel2, C42903i.f108408a, new C11934u(), new C42893l(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.f108368p;
                                    if (cutVideoBottomBarViewModel3 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    mo49443b(cutVideoBottomBarViewModel3, C42904j.f108409a, new C11934u(), new C42894m(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.f108368p;
                                    if (cutVideoBottomBarViewModel4 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    mo49443b(cutVideoBottomBarViewModel4, C42905k.f108410a, new C11934u(), new C42895n(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel5 = this.f108368p;
                                    if (cutVideoBottomBarViewModel5 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    mo49443b(cutVideoBottomBarViewModel5, C42906l.f108411a, new C11934u(), new C42886e(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel6 = this.f108368p;
                                    if (cutVideoBottomBarViewModel6 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    mo49443b(cutVideoBottomBarViewModel6, C42900f.f108405a, new C11934u(), new C42887f(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel7 = this.f108368p;
                                    if (cutVideoBottomBarViewModel7 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    mo49443b(cutVideoBottomBarViewModel7, C42901g.f108406a, new C11934u(), new C42888g(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel8 = this.f108368p;
                                    if (cutVideoBottomBarViewModel8 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    mo49443b(cutVideoBottomBarViewModel8, C42902h.f108407a, new C11934u(), new C42889h(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel9 = this.f108368p;
                                    if (cutVideoBottomBarViewModel9 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    C0184k kVar = this;
                                    cutVideoBottomBarViewModel9.mo87020e().observe(kVar, new C42890i(this));
                                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel10 = this.f108368p;
                                    if (cutVideoBottomBarViewModel10 == null) {
                                        C52711k.m112237a("bottomBarViewModel");
                                    }
                                    cutVideoBottomBarViewModel10.mo87022f().observe(kVar, new C42891j(this));
                                    CutVideoViewModel cutVideoViewModel = this.f108369q;
                                    if (cutVideoViewModel == null) {
                                        C52711k.m112237a("cutVideoViewModel");
                                    }
                                    if (!cutVideoViewModel.mo87178g()) {
                                        ImageView imageView = this.f108365m;
                                        if (imageView == null) {
                                            C52711k.m112237a("ivRotate");
                                        }
                                        boolean z = false;
                                        imageView.setVisibility(0);
                                        VideoEditViewModel videoEditViewModel = this.f108370r;
                                        if (videoEditViewModel == null) {
                                            C52711k.m112237a("videoEditViewModel");
                                        }
                                        if (videoEditViewModel.mo87637o()) {
                                            VideoEditViewModel videoEditViewModel2 = this.f108370r;
                                            if (videoEditViewModel2 == null) {
                                                C52711k.m112237a("videoEditViewModel");
                                            }
                                            VideoSegment videoSegment = (VideoSegment) videoEditViewModel2.mo87634l().get(0);
                                            CutVideoBottomBarViewModel cutVideoBottomBarViewModel11 = this.f108368p;
                                            if (cutVideoBottomBarViewModel11 == null) {
                                                C52711k.m112237a("bottomBarViewModel");
                                            }
                                            CutVideoViewModel cutVideoViewModel2 = this.f108369q;
                                            if (cutVideoViewModel2 == null) {
                                                C52711k.m112237a("cutVideoViewModel");
                                            }
                                            if (cutVideoViewModel2.mo87179h()) {
                                                VECutVideoPresenter vECutVideoPresenter = this.f108362j;
                                                if (vECutVideoPresenter == null) {
                                                    C52711k.m112237a("presenter");
                                                }
                                                if (vECutVideoPresenter.mo86818a(videoSegment)) {
                                                    z = true;
                                                }
                                            }
                                            cutVideoBottomBarViewModel11.mo87015a(z);
                                        }
                                    }
                                    ImageView imageView2 = this.f108367o;
                                    if (imageView2 == null) {
                                        C52711k.m112237a("ivDelete");
                                    }
                                    imageView2.setOnClickListener(new C42882b(this));
                                    CheckableImageButton checkableImageButton = this.f108366n;
                                    if (checkableImageButton == null) {
                                        C52711k.m112237a("ivSpeed");
                                    }
                                    checkableImageButton.setOnClickListener(new C42884c(this));
                                    ImageView imageView3 = this.f108365m;
                                    if (imageView3 == null) {
                                        C52711k.m112237a("ivRotate");
                                    }
                                    imageView3.setOnClickListener(new C42885d(this));
                                    return;
                                }
                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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
        View inflate = layoutInflater.inflate(R.layout.bqq, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…om_bar, container, false)");
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
