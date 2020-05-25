package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23521a;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p683ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.commnet.C43551a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43558a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p2196a.C43547a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.VESize;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.Collection;
import java.util.List;
import p001a.C0013i;
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
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.k */
public final class C49431k extends C12924i implements C49388cr, C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f124049i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49431k.class), "stickerController", "getStickerController()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/commnet/CommentStickerController;"))};

    /* renamed from: s */
    public static final C49432a f124050s = new C49432a(null);

    /* renamed from: j */
    public C49527v f124051j;

    /* renamed from: k */
    public EditViewModel f124052k;

    /* renamed from: l */
    public EditInfoStickerViewModel f124053l;

    /* renamed from: m */
    public EditTextStickerViewModel f124054m;

    /* renamed from: n */
    public EditVoteStickerViewModel f124055n;

    /* renamed from: o */
    public EditCommentStickerViewModel f124056o;

    /* renamed from: p */
    public ToolSafeHandler f124057p;

    /* renamed from: q */
    public FrameLayout f124058q;

    /* renamed from: r */
    public C23522b<View> f124059r;

    /* renamed from: t */
    private EditPoiStickerViewModel f124060t;

    /* renamed from: u */
    private EditStickerPanelViewModel f124061u;

    /* renamed from: v */
    private EditPreviewViewModel f124062v;

    /* renamed from: w */
    private VEVideoPublishEditViewModel f124063w;

    /* renamed from: x */
    private Runnable f124064x;

    /* renamed from: y */
    private final C52668f f124065y = C52732g.m112285a(C49442i.f124077a);

    /* renamed from: com.ss.android.ugc.gamora.editor.k$a */
    public static final class C49432a {
        private C49432a() {
        }

        public /* synthetic */ C49432a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.k$b */
    public static final class C49433b implements C43547a {

        /* renamed from: a */
        final /* synthetic */ C49431k f124066a;

        /* renamed from: a */
        public final void mo88685a() {
        }

        /* renamed from: b */
        public final void mo88688b() {
            if (this.f124066a.mo97345F().mo88730c()) {
                C49431k.m106618c(this.f124066a).mo97037g().mo73977a(this.f124066a.mo97345F().f110210a);
            }
        }

        C49433b(C49431k kVar) {
            this.f124066a = kVar;
        }

        /* renamed from: a */
        public final void mo88686a(View view) {
            C52711k.m112240b(view, "view");
            EditCommentStickerViewModel editCommentStickerViewModel = this.f124066a.f124056o;
            if (editCommentStickerViewModel == null) {
                C52711k.m112237a("editCommentStickerViewModel");
            }
            editCommentStickerViewModel.mo96796a(true);
            if (this.f124066a.f124059r != null) {
                C23522b<View> bVar = this.f124066a.f124059r;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                bVar.mo48682a(view);
            }
        }

        /* renamed from: a */
        public final void mo88687a(boolean z) {
            C49431k.m106616a(this.f124066a).mo96855e();
            C49431k.m106617b(this.f124066a).mo96977e();
            if (!z || this.f124066a.mo97322O()) {
                C49431k.m106618c(this.f124066a).mo97033a(false, true, false);
            } else {
                C49431k.m106618c(this.f124066a).mo97033a(true, true, true);
            }
        }

        /* renamed from: b */
        public final void mo88689b(boolean z) {
            if (z) {
                C49431k.m106616a(this.f124066a).mo96855e();
                EditVoteStickerViewModel editVoteStickerViewModel = this.f124066a.f124055n;
                if (editVoteStickerViewModel == null) {
                    C52711k.m112237a("editVoteStickerViewModel");
                }
                editVoteStickerViewModel.mo97078e();
                C49431k.m106617b(this.f124066a).mo96977e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.k$c */
    static final class C49434c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49431k f124067a;

        C49434c(C49431k kVar) {
            this.f124067a = kVar;
        }

        public final void run() {
            C49527v vVar = this.f124067a.f124051j;
            if (vVar == null) {
                C52711k.m112237a("gestureListenerManager");
            }
            vVar.mo97461g(this.f124067a.mo97345F().f110239p);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.k$d */
    static final class C49435d extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49431k f124068a;

        C49435d(C49431k kVar) {
            this.f124068a = kVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f124068a.mo97345F().mo88755m();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.k$e */
    static final class C49436e<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C49431k f124069a;

        C49436e(C49431k kVar) {
            this.f124069a = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                C43551a F = this.f124069a.mo97345F();
                C52711k.m112236a((Object) f, "it");
                F.mo88742a(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.k$f */
    static final class C49437f<T> implements C0199s<C20347c> {

        /* renamed from: a */
        final /* synthetic */ C49431k f124070a;

        C49437f(C49431k kVar) {
            this.f124070a = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C20347c cVar = (C20347c) obj;
            if (cVar != null) {
                this.f124070a.mo97345F().mo88744a(cVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.k$g */
    public static final class C49438g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49431k f124071a;

        /* renamed from: b */
        private int f124072b = -1;

        /* renamed from: c */
        private Runnable f124073c = new C49439a(this);

        /* renamed from: com.ss.android.ugc.gamora.editor.k$g$a */
        static final class C49439a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C49438g f124074a;

            C49439a(C49438g gVar) {
                this.f124074a = gVar;
            }

            public final void run() {
                if (VERSION.SDK_INT < 19) {
                    C49431k.m106619d(this.f124074a.f124071a).postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C49439a f124075a;

                        {
                            this.f124075a = r1;
                        }

                        public final void run() {
                            FrameLayout frameLayout = this.f124075a.f124074a.f124071a.f124058q;
                            if (frameLayout == null) {
                                C52711k.m112237a("parentLayout");
                            }
                            frameLayout.requestLayout();
                        }
                    }, 5000);
                }
            }
        }

        public final void run() {
            if (this.f124073c != null) {
                Runnable runnable = this.f124073c;
                if (runnable != null) {
                    runnable.run();
                }
                this.f124073c = null;
            }
            C49431k.m106619d(this.f124071a).postDelayed(this, 16);
            C20347c cVar = (C20347c) C49431k.m106618c(this.f124071a).mo97038h().getValue();
            if (cVar != null && this.f124071a.mo97345F().mo88735h()) {
                int l = cVar.mo43073l();
                if (l != this.f124072b) {
                    this.f124072b = l;
                    this.f124071a.mo97345F().mo88722a((long) l);
                }
            }
        }

        C49438g(C49431k kVar) {
            this.f124071a = kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.k$h */
    static final class C49441h<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49431k f124076a;

        C49441h(C49431k kVar) {
            this.f124076a = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            EditCommentStickerViewModel editCommentStickerViewModel = this.f124076a.f124056o;
            if (editCommentStickerViewModel == null) {
                C52711k.m112237a("editCommentStickerViewModel");
            }
            if (bool == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) bool, "it!!");
            editCommentStickerViewModel.mo96796a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.k$i */
    static final class C49442i extends C52712l implements C52670a<C43551a> {

        /* renamed from: a */
        public static final C49442i f124077a = new C49442i();

        C49442i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43551a();
        }
    }

    /* renamed from: F */
    public final C43551a mo97345F() {
        return (C43551a) this.f124065y.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo97328a(C49527v vVar) {
        C52711k.m112240b(vVar, "manager");
        this.f124051j = vVar;
    }

    /* renamed from: a */
    public final void mo97326a(CommentVideoModel commentVideoModel) {
        C52711k.m112240b(commentVideoModel, "struct");
        IEffectPlatformFactory createIEffectPlatformFactorybyMonsterPlugin = EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin();
        EffectPlatformBuilder context = new EffectPlatformBuilder().setContext(mo24473s());
        C52711k.m112236a((Object) context, "EffectPlatformBuilder().…ntext(applicationContext)");
        C48890g a = createIEffectPlatformFactorybyMonsterPlugin.createEffectConfigurationBuilder(context).mo96662a();
        C43551a F = mo97345F();
        EditViewModel editViewModel = this.f124052k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        F.mo88744a((C20347c) editViewModel.mo97038h().getValue());
        C43551a F2 = mo97345F();
        StringBuilder sb = new StringBuilder();
        C52711k.m112236a((Object) a, "effectConfiguration");
        File file = a.f122964j;
        C52711k.m112236a((Object) file, "effectConfiguration.effectDir");
        sb.append(file.getAbsolutePath());
        sb.append("/comment_sticker");
        F2.mo88726a(sb.toString());
        mo97345F().mo88724a(commentVideoModel, false);
        mo97345F().mo88729b();
    }

    /* renamed from: a */
    public final void mo97327a(C49391cu cuVar) {
        C52711k.m112240b(cuVar, "deleteComponent");
        mo97345F().f110229f = cuVar;
    }

    /* renamed from: a */
    public final void mo97330a(String str) {
        C52711k.m112240b(str, "stickerPath");
        mo97345F().mo88726a(str);
    }

    /* renamed from: a */
    public final void mo97329a(VESize vESize) {
        C52711k.m112240b(vESize, "size");
        mo97345F().f110238o = vESize;
    }

    /* renamed from: a */
    public final void mo97331a(boolean z) {
        mo97345F().f110228e = z;
    }

    /* renamed from: a */
    public final void mo97324a(C23521a<InteractStickerBaseView, InteractStickerBaseView> aVar) {
        C52711k.m112240b(aVar, "onChangeIndexToTopListener");
        mo97345F().f110246w = aVar;
    }

    /* renamed from: H */
    public final void mo97315H() {
        mo97345F().mo88732e();
    }

    /* renamed from: J */
    public final void mo97317J() {
        mo97345F().mo88753k();
    }

    /* renamed from: K */
    public final void mo97318K() {
        mo97345F().mo88755m();
    }

    /* renamed from: M */
    public final C43658m mo97320M() {
        return mo97345F();
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

    /* renamed from: I */
    public final InteractStickerStruct mo97316I() {
        return mo97345F().mo88731d();
    }

    /* renamed from: L */
    public final boolean mo97319L() {
        return mo97345F().mo88730c();
    }

    /* renamed from: N */
    public final String mo97321N() {
        String n = mo97345F().mo88756n();
        C52711k.m112236a((Object) n, "stickerController.stickerPath");
        return n;
    }

    /* renamed from: O */
    public final boolean mo97322O() {
        EditCommentStickerViewModel editCommentStickerViewModel = this.f124056o;
        if (editCommentStickerViewModel == null) {
            C52711k.m112237a("editCommentStickerViewModel");
        }
        return ((EditCommentStickerState) editCommentStickerViewModel.mo97464a(mo22626h())).getInTimeEditView();
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        ToolSafeHandler toolSafeHandler = this.f124057p;
        if (toolSafeHandler == null) {
            C52711k.m112237a("safeHandler");
        }
        if (toolSafeHandler != null) {
            Runnable runnable = this.f124064x;
            if (runnable == null) {
                C52711k.m112237a("mNonInfoStickerPlayingRefreshTask");
            }
            if (runnable != null) {
                ToolSafeHandler toolSafeHandler2 = this.f124057p;
                if (toolSafeHandler2 == null) {
                    C52711k.m112237a("safeHandler");
                }
                Runnable runnable2 = this.f124064x;
                if (runnable2 == null) {
                    C52711k.m112237a("mNonInfoStickerPlayingRefreshTask");
                }
                toolSafeHandler2.removeCallbacks(runnable2);
            }
        }
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        ToolSafeHandler toolSafeHandler = this.f124057p;
        if (toolSafeHandler == null) {
            C52711k.m112237a("safeHandler");
        }
        if (toolSafeHandler != null) {
            Runnable runnable = this.f124064x;
            if (runnable == null) {
                C52711k.m112237a("mNonInfoStickerPlayingRefreshTask");
            }
            if (runnable != null) {
                ToolSafeHandler toolSafeHandler2 = this.f124057p;
                if (toolSafeHandler2 == null) {
                    C52711k.m112237a("safeHandler");
                }
                Runnable runnable2 = this.f124064x;
                if (runnable2 == null) {
                    C52711k.m112237a("mNonInfoStickerPlayingRefreshTask");
                }
                toolSafeHandler2.postDelayed(runnable2, 200);
            }
        }
    }

    /* renamed from: G */
    public final void mo97314G() {
        boolean z;
        C43551a F = mo97345F();
        EditViewModel editViewModel = this.f124052k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        F.mo88744a((C20347c) editViewModel.mo97038h().getValue());
        EditViewModel editViewModel2 = this.f124052k;
        if (editViewModel2 == null) {
            C52711k.m112237a("editViewModel");
        }
        List a = C43577d.m95726a(editViewModel2.mo97035e().getMainBusinessContext(), 2, C43596f.TRACK_PAGE_EDIT);
        Collection collection = a;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            EditViewModel editViewModel3 = this.f124052k;
            if (editViewModel3 == null) {
                C52711k.m112237a("editViewModel");
            }
            if (editViewModel3.mo97035e().commentVideoModel != null) {
                C43551a F2 = mo97345F();
                InteractStickerStruct interactStickerStruct = (InteractStickerStruct) a.get(0);
                EditViewModel editViewModel4 = this.f124052k;
                if (editViewModel4 == null) {
                    C52711k.m112237a("editViewModel");
                }
                F2.mo88725a(interactStickerStruct, editViewModel4.mo97035e().commentVideoModel);
            }
        }
    }

    /* renamed from: a */
    public final void mo97325a(C23522b<View> bVar) {
        C52711k.m112240b(bVar, "onTimeClickListener");
        this.f124059r = bVar;
    }

    /* renamed from: b */
    public final void mo97333b(boolean z) {
        mo97345F().f110211b = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditInfoStickerViewModel m106616a(C49431k kVar) {
        EditInfoStickerViewModel editInfoStickerViewModel = kVar.f124053l;
        if (editInfoStickerViewModel == null) {
            C52711k.m112237a("editInfoStickerViewModel");
        }
        return editInfoStickerViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditTextStickerViewModel m106617b(C49431k kVar) {
        EditTextStickerViewModel editTextStickerViewModel = kVar.f124054m;
        if (editTextStickerViewModel == null) {
            C52711k.m112237a("editTextStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditViewModel m106618c(C49431k kVar) {
        EditViewModel editViewModel = kVar.f124052k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ ToolSafeHandler m106619d(C49431k kVar) {
        ToolSafeHandler toolSafeHandler = kVar.f124057p;
        if (toolSafeHandler == null) {
            C52711k.m112237a("safeHandler");
        }
        return toolSafeHandler;
    }

    /* renamed from: b */
    public final void mo97332b(String str) {
        C52711k.m112240b(str, "stickerId");
        mo97345F().f110210a = str;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f124063w = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditPoiStickerViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f124060t = (EditPoiStickerViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditInfoStickerViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f124053l = (EditInfoStickerViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditTextStickerViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                        this.f124054m = (EditTextStickerViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditStickerPanelViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…nelViewModel::class.java]");
                            this.f124061u = (EditStickerPanelViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(EditVoteStickerViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java]");
                                this.f124055n = (EditVoteStickerViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(EditPreviewViewModel.class);
                                    C52711k.m112236a((Object) a7, "JediViewModelProviders.o…iewViewModel::class.java]");
                                    this.f124062v = (EditPreviewViewModel) a7;
                                    Activity activity8 = this.f33840g_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C48927d.m105736a((FragmentActivity) activity8).mo96760a(EditCommentStickerViewModel.class);
                                        C52711k.m112236a((Object) a8, "JediViewModelProviders.o…kerViewModel::class.java]");
                                        this.f124056o = (EditCommentStickerViewModel) a8;
                                        EditCommentStickerViewModel editCommentStickerViewModel = this.f124056o;
                                        if (editCommentStickerViewModel == null) {
                                            C52711k.m112237a("editCommentStickerViewModel");
                                        }
                                        if (editCommentStickerViewModel != null) {
                                            mo49444c(editCommentStickerViewModel, C49443l.f124078a, new C11934u(), new C49435d(this));
                                        }
                                        EditCommentStickerViewModel editCommentStickerViewModel2 = this.f124056o;
                                        if (editCommentStickerViewModel2 == null) {
                                            C52711k.m112237a("editCommentStickerViewModel");
                                        }
                                        if (editCommentStickerViewModel2 != null) {
                                            C0198r f = editCommentStickerViewModel2.mo96798f();
                                            if (f != null) {
                                                f.observe(this, new C49436e(this));
                                            }
                                        }
                                        EditViewModel editViewModel = this.f124052k;
                                        if (editViewModel == null) {
                                            C52711k.m112237a("editViewModel");
                                        }
                                        C0184k kVar = this;
                                        editViewModel.mo97038h().observe(kVar, new C49437f(this));
                                        mo97345F().f110236m = new C49433b(this);
                                        mo97345F().f110245v = new C49434c(this);
                                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f124063w;
                                        if (vEVideoPublishEditViewModel == null) {
                                            C52711k.m112237a("publishEditViewModel");
                                        }
                                        vEVideoPublishEditViewModel.mo110473r().observe(kVar, new C49441h(this));
                                        EditCommentStickerViewModel editCommentStickerViewModel3 = this.f124056o;
                                        if (editCommentStickerViewModel3 == null) {
                                            C52711k.m112237a("editCommentStickerViewModel");
                                        }
                                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f124063w;
                                        if (vEVideoPublishEditViewModel2 == null) {
                                            C52711k.m112237a("publishEditViewModel");
                                        }
                                        C0198r<Boolean> r = vEVideoPublishEditViewModel2.mo110473r();
                                        C52711k.m112236a((Object) r, "publishEditViewModel.inTimeEditView");
                                        C52711k.m112240b(r, "liveData");
                                        editCommentStickerViewModel3.f123108e = r;
                                        Activity activity9 = this.f33840g_;
                                        if (activity9 != null) {
                                            this.f124057p = new ToolSafeHandler((FragmentActivity) activity9);
                                            this.f124064x = new C49438g(this);
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
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f124052k = (EditViewModel) a;
            mo97345F().f110240q = false;
            EditViewModel editViewModel = this.f124052k;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            C20347c cVar = (C20347c) editViewModel.mo97038h().getValue();
            if (cVar != null) {
                mo97345F().f110238o = cVar.mo43037b();
                mo97345F().mo88723a(this.f33840g_, null, frameLayout);
                C49527v vVar = this.f124051j;
                if (vVar == null) {
                    C52711k.m112237a("gestureListenerManager");
                }
                vVar.mo97456b((C46722b) mo97345F().f110239p);
            }
            this.f124058q = frameLayout;
            return new View(frameLayout.getContext());
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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
    public final C0013i<C43558a> mo97323a(String str, int i, int i2, int i3, int i4) {
        C52711k.m112240b(str, "draftDir");
        C0013i<C43558a> a = mo97345F().mo88720a(str, i, i2, i3, i4);
        C52711k.m112236a((Object) a, "stickerController.compil…idth, disVideoInitHeight)");
        return a;
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
