package com.p683ss.android.ugc.gamora.editor.sticker.donation;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
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
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C43587a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C43588b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C43588b.C43590b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C43592c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView.C43580a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerState;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p2196a.C43547a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46723c;
import com.p683ss.android.ugc.gamora.editor.C49389cs;
import com.p683ss.android.ugc.gamora.editor.C49391cu;
import com.p683ss.android.ugc.gamora.editor.C49527v;
import com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditPoiStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditPreviewViewModel;
import com.p683ss.android.ugc.gamora.editor.EditStickerPanelViewModel;
import com.p683ss.android.ugc.gamora.editor.EditTextStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.editor.EditVoteStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.VESize;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001a.C0011g;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c */
public final class C49483c extends C12924i implements C49511h, C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f124172i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49483c.class), "stickerController", "getStickerController()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/donation/DonationStickerController;"))};

    /* renamed from: v */
    public static final C49484a f124173v = new C49484a(null);

    /* renamed from: j */
    public C49527v f124174j;

    /* renamed from: k */
    public EditViewModel f124175k;

    /* renamed from: l */
    public EditInfoStickerViewModel f124176l;

    /* renamed from: m */
    public EditTextStickerViewModel f124177m;

    /* renamed from: n */
    public EditStickerPanelViewModel f124178n;

    /* renamed from: o */
    public EditVoteStickerViewModel f124179o;

    /* renamed from: p */
    public EditDonationStickerViewModel f124180p;

    /* renamed from: q */
    EditPreviewViewModel f124181q;

    /* renamed from: r */
    public ToolSafeHandler f124182r;

    /* renamed from: s */
    public C23522b<View> f124183s;

    /* renamed from: t */
    public FrameLayout f124184t;

    /* renamed from: u */
    public C49389cs f124185u;

    /* renamed from: w */
    private EditPoiStickerViewModel f124186w;

    /* renamed from: x */
    private VEVideoPublishEditViewModel f124187x;

    /* renamed from: y */
    private Runnable f124188y;

    /* renamed from: z */
    private final C52668f f124189z = C52732g.m112285a(C49496k.f124204a);

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$a */
    public static final class C49484a {
        private C49484a() {
        }

        public /* synthetic */ C49484a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$b */
    static final class C49485b<TTaskResult, TContinuationResult> implements C0011g<C43587a, Void> {

        /* renamed from: a */
        final /* synthetic */ C49483c f124190a;

        /* renamed from: b */
        final /* synthetic */ C20347c f124191b;

        C49485b(C49483c cVar, C20347c cVar2) {
            this.f124190a = cVar;
            this.f124191b = cVar2;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            int i;
            int i2;
            C52711k.m112236a((Object) iVar, "task");
            C43587a aVar = (C43587a) iVar.mo34e();
            if (aVar != null) {
                C43592c cVar = aVar.f110306a;
                String b = C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(cVar.f110315a);
                C20347c cVar2 = this.f124191b;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                int k = cVar2.mo43071k();
                if (cVar.f110318d != 0) {
                    int i3 = cVar.f110317c;
                    i = cVar.f110318d;
                    i2 = i3;
                } else {
                    i = k;
                    i2 = 0;
                }
                String str = this.f124190a.mo97394F().f110309b;
                if (str == null) {
                    str = "";
                }
                StickerItemModel stickerItemModel = new StickerItemModel(str, aVar.stickerPath, b, aVar.index, false, i2, i, 7);
                stickerItemModel.isImageStickerLayer = true;
                C49389cs csVar = this.f124190a.f124185u;
                if (csVar == null) {
                    C52711k.m112237a("compileCallback");
                }
                csVar.mo97180a(stickerItemModel);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$c */
    public static final class C49486c implements C43547a {

        /* renamed from: a */
        final /* synthetic */ C49483c f124192a;

        /* renamed from: a */
        public final void mo88685a() {
            C49483c cVar = this.f124192a;
            Activity activity = this.f124192a.f33840g_;
            if (activity != null) {
                C0654k supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                C52711k.m112236a((Object) supportFragmentManager, "(activity as FragmentAct…y).supportFragmentManager");
                cVar.mo97405a(supportFragmentManager);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        /* renamed from: b */
        public final void mo88688b() {
            C49483c.m106735d(this.f124192a).mo97037g().mo73977a(this.f124192a.mo97394F().f110309b);
        }

        C49486c(C49483c cVar) {
            this.f124192a = cVar;
        }

        /* renamed from: a */
        public final void mo88686a(View view) {
            C52711k.m112240b(view, "view");
            C49483c.m106732a(this.f124192a).mo88796a(true);
            if (this.f124192a.f124183s != null) {
                C23522b<View> bVar = this.f124192a.f124183s;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                bVar.mo48682a(view);
            }
        }

        /* renamed from: b */
        public final void mo88689b(boolean z) {
            if (z) {
                C49483c.m106733b(this.f124192a).mo96855e();
                EditVoteStickerViewModel editVoteStickerViewModel = this.f124192a.f124179o;
                if (editVoteStickerViewModel == null) {
                    C52711k.m112237a("editVoteStickerViewModel");
                }
                editVoteStickerViewModel.mo97078e();
                C49483c.m106734c(this.f124192a).mo96977e();
            }
        }

        /* renamed from: a */
        public final void mo88687a(boolean z) {
            C49483c.m106733b(this.f124192a).mo96855e();
            C49483c.m106734c(this.f124192a).mo96977e();
            if (!z || this.f124192a.mo97403O()) {
                C49483c.m106735d(this.f124192a).mo97033a(false, true, false);
            } else {
                C49483c.m106735d(this.f124192a).mo97033a(true, true, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$d */
    static final class C49487d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49483c f124193a;

        C49487d(C49483c cVar) {
            this.f124193a = cVar;
        }

        public final void run() {
            C49527v vVar = this.f124193a.f124174j;
            if (vVar == null) {
                C52711k.m112237a("gestureListenerManager");
            }
            vVar.mo97461g(this.f124193a.mo97394F().f110239p);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$e */
    static final class C49488e<T> implements C0199s<C20347c> {

        /* renamed from: a */
        final /* synthetic */ C49483c f124194a;

        C49488e(C49483c cVar) {
            this.f124194a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C20347c cVar = (C20347c) obj;
            if (cVar != null) {
                this.f124194a.mo97394F().mo88744a(cVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$f */
    static final class C49489f extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49483c f124195a;

        C49489f(C49483c cVar) {
            this.f124195a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f124195a.mo97394F().mo88755m();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$g */
    static final class C49490g<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C49483c f124196a;

        C49490g(C49483c cVar) {
            this.f124196a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                C43588b F = this.f124196a.mo97394F();
                C52711k.m112236a((Object) f, "it");
                F.mo88742a(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$h */
    static final class C49491h<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49483c f124197a;

        C49491h(C49483c cVar) {
            this.f124197a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            EditDonationStickerViewModel a = C49483c.m106732a(this.f124197a);
            if (bool == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) bool, "it!!");
            a.mo88796a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$i */
    public static final class C49492i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49483c f124198a;

        /* renamed from: b */
        private int f124199b = -1;

        /* renamed from: c */
        private Runnable f124200c = new C49493a(this);

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$i$a */
        static final class C49493a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C49492i f124201a;

            C49493a(C49492i iVar) {
                this.f124201a = iVar;
            }

            public final void run() {
                if (VERSION.SDK_INT < 19) {
                    C49483c.m106736e(this.f124201a.f124198a).postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C49493a f124202a;

                        {
                            this.f124202a = r1;
                        }

                        public final void run() {
                            FrameLayout frameLayout = this.f124202a.f124201a.f124198a.f124184t;
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
            if (this.f124200c != null) {
                Runnable runnable = this.f124200c;
                if (runnable != null) {
                    runnable.run();
                }
                this.f124200c = null;
            }
            C49483c.m106736e(this.f124198a).postDelayed(this, 16);
            C20347c cVar = (C20347c) C49483c.m106735d(this.f124198a).mo97038h().getValue();
            if (cVar != null && this.f124198a.mo97395G()) {
                int l = cVar.mo43073l();
                if (l != this.f124199b) {
                    this.f124199b = l;
                    C43588b F = this.f124198a.mo97394F();
                    long j = (long) l;
                    InteractStickerBaseView interactStickerBaseView = F.f110234k;
                    if (!(interactStickerBaseView instanceof DonationStickerInteractView)) {
                        interactStickerBaseView = null;
                    }
                    DonationStickerInteractView donationStickerInteractView = (DonationStickerInteractView) interactStickerBaseView;
                    if (donationStickerInteractView != null) {
                        donationStickerInteractView.setPlayPosition(j);
                    }
                    if (F.f110310x) {
                        InteractStickerBaseView interactStickerBaseView2 = F.f110234k;
                        if (!(interactStickerBaseView2 instanceof DonationStickerInteractView)) {
                            interactStickerBaseView2 = null;
                        }
                        DonationStickerInteractView donationStickerInteractView2 = (DonationStickerInteractView) interactStickerBaseView2;
                        if (donationStickerInteractView2 != null) {
                            donationStickerInteractView2.mo88712c();
                        }
                    } else {
                        InteractStickerBaseView interactStickerBaseView3 = F.f110234k;
                        if (!(interactStickerBaseView3 instanceof DonationStickerInteractView)) {
                            interactStickerBaseView3 = null;
                        }
                        DonationStickerInteractView donationStickerInteractView3 = (DonationStickerInteractView) interactStickerBaseView3;
                        if (donationStickerInteractView3 != null && donationStickerInteractView3.f110284a.mo88777b()) {
                            donationStickerInteractView3.post(new C43580a(donationStickerInteractView3));
                        }
                    }
                }
            }
        }

        C49492i(C49483c cVar) {
            this.f124198a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$j */
    public static final class C49495j implements C49512i {

        /* renamed from: a */
        final /* synthetic */ C49483c f124203a;

        /* renamed from: a */
        public final void mo97422a() {
            C49483c cVar = this.f124203a;
            EditPreviewViewModel editPreviewViewModel = cVar.f124181q;
            if (editPreviewViewModel == null) {
                C52711k.m112237a("editPreviewViewModel");
            }
            editPreviewViewModel.mo96923a(true);
            EditViewModel editViewModel = cVar.f124175k;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            C20347c cVar2 = (C20347c) editViewModel.mo97038h().getValue();
            if (cVar2 != null) {
                cVar2.mo43087s();
            }
        }

        /* renamed from: b */
        public final void mo97424b() {
            C49483c cVar = this.f124203a;
            EditPreviewViewModel editPreviewViewModel = cVar.f124181q;
            if (editPreviewViewModel == null) {
                C52711k.m112237a("editPreviewViewModel");
            }
            editPreviewViewModel.mo96923a(false);
            EditViewModel editViewModel = cVar.f124175k;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            C20347c cVar2 = (C20347c) editViewModel.mo97038h().getValue();
            if (cVar2 != null) {
                cVar2.mo43085r();
            }
        }

        C49495j(C49483c cVar) {
            this.f124203a = cVar;
        }

        /* renamed from: a */
        public final void mo97423a(C49481b bVar) {
            C52711k.m112240b(bVar, "org");
            EditStickerPanelViewModel editStickerPanelViewModel = this.f124203a.f124178n;
            if (editStickerPanelViewModel == null) {
                C52711k.m112237a("editStickerPanelViewModel");
            }
            editStickerPanelViewModel.mo96953a(false);
            if (this.f124203a.mo97395G()) {
                C43588b F = this.f124203a.mo97394F();
                C52711k.m112240b(bVar, "org");
                C43592c cVar = F.f110308a;
                if (cVar != null) {
                    cVar.f110315a = bVar;
                }
                InteractStickerBaseView interactStickerBaseView = F.f110234k;
                if (!(interactStickerBaseView instanceof DonationStickerInteractView)) {
                    interactStickerBaseView = null;
                }
                DonationStickerInteractView donationStickerInteractView = (DonationStickerInteractView) interactStickerBaseView;
                if (donationStickerInteractView != null) {
                    C52711k.m112240b(bVar, "org");
                    donationStickerInteractView.f110284a.mo88776a(bVar);
                }
            } else {
                C49483c cVar2 = this.f124203a;
                C43592c cVar3 = new C43592c(bVar, null, 0, 0, 14, null);
                C43588b F2 = cVar2.mo97394F();
                EditViewModel editViewModel = cVar2.f124175k;
                if (editViewModel == null) {
                    C52711k.m112237a("editViewModel");
                }
                F2.mo88744a((C20347c) editViewModel.mo97038h().getValue());
                cVar2.mo97394F().mo88799a(cVar3, true, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$k */
    static final class C49496k extends C52712l implements C52670a<C43588b> {

        /* renamed from: a */
        public static final C49496k f124204a = new C49496k();

        C49496k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43588b();
        }
    }

    /* renamed from: F */
    public final C43588b mo97394F() {
        return (C43588b) this.f124189z.getValue();
    }

    /* renamed from: a */
    public final void mo97410a(C49527v vVar) {
        C52711k.m112240b(vVar, "manager");
        this.f124174j = vVar;
    }

    /* renamed from: a */
    public final void mo97409a(C49391cu cuVar) {
        C52711k.m112240b(cuVar, "deleteComponent");
        mo97394F().f110229f = cuVar;
    }

    /* renamed from: a */
    public final void mo97412a(String str) {
        C52711k.m112240b(str, "stickerPath");
        mo97394F().mo88726a(str);
    }

    /* renamed from: a */
    public final void mo97411a(VESize vESize) {
        C52711k.m112240b(vESize, "size");
        mo97394F().f110238o = vESize;
    }

    /* renamed from: a */
    public final void mo97413a(boolean z) {
        mo97394F().f110228e = z;
    }

    /* renamed from: a */
    public final void mo97406a(C23521a<InteractStickerBaseView, InteractStickerBaseView> aVar) {
        C52711k.m112240b(aVar, "onChangeIndexToTopListener");
        mo97394F().f110246w = aVar;
    }

    /* renamed from: a */
    public final void mo97408a(C49389cs csVar) {
        C52711k.m112240b(csVar, "callback");
        this.f124185u = csVar;
    }

    /* renamed from: a */
    public final boolean mo97414a(View view) {
        C52711k.m112240b(view, "view");
        return view instanceof DonationStickerView;
    }

    /* renamed from: a */
    public final void mo97405a(C0654k kVar) {
        C52711k.m112240b(kVar, "fragmentManager");
        EditViewModel editViewModel = this.f124175k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        String str = editViewModel.mo97035e().mShootWay;
        EditViewModel editViewModel2 = this.f124175k;
        if (editViewModel2 == null) {
            C52711k.m112237a("editViewModel");
        }
        String str2 = editViewModel2.mo97035e().creationId;
        EditViewModel editViewModel3 = this.f124175k;
        if (editViewModel3 == null) {
            C52711k.m112237a("editViewModel");
        }
        String b = C43434az.m95207b(editViewModel3.mo97035e());
        EditViewModel editViewModel4 = this.f124175k;
        if (editViewModel4 == null) {
            C52711k.m112237a("editViewModel");
        }
        C49479b bVar = new C49479b(str, str2, b, C43434az.m95202a(editViewModel4.mo97035e()));
        C52711k.m112240b(kVar, "fragmentManager");
        C52711k.m112240b(bVar, "mobParams");
        Fragment a = kVar.mo2224a("EditSelectDonationOrganizationDialogFragment");
        if (!(a instanceof C49498e)) {
            a = null;
        }
        C49498e eVar = (C49498e) a;
        if (eVar == null) {
            eVar = new C49498e();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("mob_params", bVar);
        eVar.setArguments(bundle);
        if (!eVar.isAdded()) {
            kVar.mo2225a().mo2178a((Fragment) eVar, "EditSelectDonationOrganizationDialogFragment").mo2195c();
        }
        eVar.f124208b = new C49495j(this);
    }

    /* renamed from: K */
    public final void mo97399K() {
        mo97394F().mo88732e();
    }

    /* renamed from: L */
    public final void mo97400L() {
        mo97394F().mo88753k();
    }

    /* renamed from: M */
    public final void mo97401M() {
        mo97394F().mo88755m();
    }

    /* renamed from: N */
    public final C43658m mo97402N() {
        return mo97394F();
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

    /* renamed from: G */
    public final boolean mo97395G() {
        if (mo97394F().f110234k != null) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final InteractStickerStruct mo97396H() {
        return mo97394F().mo88731d();
    }

    /* renamed from: I */
    public final boolean mo97397I() {
        return mo97394F().mo88730c();
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        ToolSafeHandler toolSafeHandler = this.f124182r;
        if (toolSafeHandler == null) {
            C52711k.m112237a("safeHandler");
        }
        Runnable runnable = this.f124188y;
        if (runnable == null) {
            C52711k.m112237a("mNonInfoStickerPlayingRefreshTask");
        }
        toolSafeHandler.removeCallbacks(runnable);
    }

    /* renamed from: O */
    public final boolean mo97403O() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.f124180p;
        if (editDonationStickerViewModel == null) {
            C52711k.m112237a("donationStickerViewModel");
        }
        return ((EditDonationStickerState) editDonationStickerViewModel.mo97464a(mo22626h())).getInTimeEditView();
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        ToolSafeHandler toolSafeHandler = this.f124182r;
        if (toolSafeHandler == null) {
            C52711k.m112237a("safeHandler");
        }
        Runnable runnable = this.f124188y;
        if (runnable == null) {
            C52711k.m112237a("mNonInfoStickerPlayingRefreshTask");
        }
        toolSafeHandler.postDelayed(runnable, 200);
    }

    /* renamed from: J */
    public final void mo97398J() {
        boolean z;
        C43588b F = mo97394F();
        EditViewModel editViewModel = this.f124175k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        F.mo88744a((C20347c) editViewModel.mo97038h().getValue());
        C43592c cVar = new C43592c(null, null, 0, 0, 15, null);
        EditViewModel editViewModel2 = this.f124175k;
        if (editViewModel2 == null) {
            C52711k.m112237a("editViewModel");
        }
        List a = C43577d.m95726a(editViewModel2.mo97035e().getMainBusinessContext(), 4, C43596f.TRACK_PAGE_EDIT);
        EditViewModel editViewModel3 = this.f124175k;
        if (editViewModel3 == null) {
            C52711k.m112237a("editViewModel");
        }
        InfoStickerModel infoStickerModel = editViewModel3.mo97035e().infoStickerModel;
        if (infoStickerModel != null) {
            List<StickerItemModel> list = infoStickerModel.stickers;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    StickerItemModel stickerItemModel = (StickerItemModel) it.next();
                    if (stickerItemModel.type == 7) {
                        cVar.f110315a = (C49481b) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34884a(stickerItemModel.extra, C49481b.class);
                        cVar.f110317c = stickerItemModel.startTime;
                        cVar.f110318d = stickerItemModel.endTime;
                        mo97394F().mo88726a(stickerItemModel.path);
                        mo97394F().f110309b = stickerItemModel.stickerId;
                        it.remove();
                    }
                }
            }
        }
        Collection collection = a;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && cVar.f110315a != null) {
            cVar.f110316b = (InteractStickerStruct) a.get(0);
            mo97394F().mo88799a(cVar, false, true);
            mo97394F().mo88746a((InteractStickerStruct) a.get(0));
        }
    }

    /* renamed from: P */
    public final C0013i<Void> mo97404P() {
        if (mo97397I()) {
            String n = mo97394F().mo88756n();
            EditViewModel editViewModel = this.f124175k;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            C20347c cVar = (C20347c) editViewModel.mo97038h().getValue();
            C52711k.m112236a((Object) n, "draftDir");
            C49389cs csVar = this.f124185u;
            if (csVar == null) {
                C52711k.m112237a("compileCallback");
            }
            int a = csVar.mo97188af().mo88379a();
            C49389cs csVar2 = this.f124185u;
            if (csVar2 == null) {
                C52711k.m112237a("compileCallback");
            }
            int b = csVar2.mo97188af().mo88380b();
            if (cVar == null) {
                C52711k.m112234a();
            }
            int i = cVar.mo43037b().width;
            int i2 = cVar.mo43037b().height;
            C52711k.m112240b(n, "draftDir");
            C43588b F = mo97394F();
            C52711k.m112240b(n, "draftDir");
            C0013i c = F.mo88749b(n, a, b, i, i2).mo29c(new C43590b(F));
            C52711k.m112236a((Object) c, "stickerTask.onSuccess {\n…      else null\n        }");
            C0013i<Void> c2 = c.mo30c(new C49485b(this, cVar), C0013i.f25b);
            C52711k.m112236a((Object) c2, "compile(draftDir, compil… Task.UI_THREAD_EXECUTOR)");
            return c2;
        }
        C0013i<Void> a2 = C0013i.m14a(null);
        C52711k.m112236a((Object) a2, "Task.forResult(null)");
        return a2;
    }

    /* renamed from: a */
    public final void mo97407a(C23522b<View> bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f124183s = bVar;
    }

    /* renamed from: b */
    public final boolean mo97417b(View view) {
        C52711k.m112240b(view, "view");
        return view instanceof DonationStickerInteractView;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditDonationStickerViewModel m106732a(C49483c cVar) {
        EditDonationStickerViewModel editDonationStickerViewModel = cVar.f124180p;
        if (editDonationStickerViewModel == null) {
            C52711k.m112237a("donationStickerViewModel");
        }
        return editDonationStickerViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditInfoStickerViewModel m106733b(C49483c cVar) {
        EditInfoStickerViewModel editInfoStickerViewModel = cVar.f124176l;
        if (editInfoStickerViewModel == null) {
            C52711k.m112237a("editInfoStickerViewModel");
        }
        return editInfoStickerViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditTextStickerViewModel m106734c(C49483c cVar) {
        EditTextStickerViewModel editTextStickerViewModel = cVar.f124177m;
        if (editTextStickerViewModel == null) {
            C52711k.m112237a("editTextStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditViewModel m106735d(C49483c cVar) {
        EditViewModel editViewModel = cVar.f124175k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ ToolSafeHandler m106736e(C49483c cVar) {
        ToolSafeHandler toolSafeHandler = cVar.f124182r;
        if (toolSafeHandler == null) {
            C52711k.m112237a("safeHandler");
        }
        return toolSafeHandler;
    }

    /* renamed from: b */
    public final void mo97415b(String str) {
        C52711k.m112240b(str, "stickerId");
        mo97394F().f110309b = str;
    }

    /* renamed from: b */
    public final void mo97416b(boolean z) {
        C43588b F = mo97394F();
        F.f110310x = z;
        if (F.f110310x) {
            InteractStickerBaseView interactStickerBaseView = F.f110234k;
            if (!(interactStickerBaseView instanceof DonationStickerInteractView)) {
                interactStickerBaseView = null;
            }
            DonationStickerInteractView donationStickerInteractView = (DonationStickerInteractView) interactStickerBaseView;
            if (donationStickerInteractView != null) {
                donationStickerInteractView.mo88712c();
            }
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f124187x = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditPoiStickerViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f124186w = (EditPoiStickerViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditInfoStickerViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f124176l = (EditInfoStickerViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditTextStickerViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                        this.f124177m = (EditTextStickerViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditStickerPanelViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…nelViewModel::class.java]");
                            this.f124178n = (EditStickerPanelViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(EditVoteStickerViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java]");
                                this.f124179o = (EditVoteStickerViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(EditDonationStickerViewModel.class);
                                    C52711k.m112236a((Object) a7, "JediViewModelProviders.o…kerViewModel::class.java]");
                                    this.f124180p = (EditDonationStickerViewModel) a7;
                                    Activity activity8 = this.f33840g_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C48927d.m105736a((FragmentActivity) activity8).mo96760a(EditPreviewViewModel.class);
                                        C52711k.m112236a((Object) a8, "JediViewModelProviders.o…iewViewModel::class.java]");
                                        this.f124181q = (EditPreviewViewModel) a8;
                                        EditViewModel editViewModel = this.f124175k;
                                        if (editViewModel == null) {
                                            C52711k.m112237a("editViewModel");
                                        }
                                        C0184k kVar = this;
                                        editViewModel.mo97038h().observe(kVar, new C49488e(this));
                                        EditDonationStickerViewModel editDonationStickerViewModel = this.f124180p;
                                        if (editDonationStickerViewModel == null) {
                                            C52711k.m112237a("donationStickerViewModel");
                                        }
                                        mo49444c(editDonationStickerViewModel, C49497d.f124205a, new C11934u(), new C49489f(this));
                                        EditDonationStickerViewModel editDonationStickerViewModel2 = this.f124180p;
                                        if (editDonationStickerViewModel2 == null) {
                                            C52711k.m112237a("donationStickerViewModel");
                                        }
                                        editDonationStickerViewModel2.mo88797e().observe(kVar, new C49490g(this));
                                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f124187x;
                                        if (vEVideoPublishEditViewModel == null) {
                                            C52711k.m112237a("publishEditViewModel");
                                        }
                                        vEVideoPublishEditViewModel.mo110473r().observe(kVar, new C49491h(this));
                                        EditDonationStickerViewModel editDonationStickerViewModel3 = this.f124180p;
                                        if (editDonationStickerViewModel3 == null) {
                                            C52711k.m112237a("donationStickerViewModel");
                                        }
                                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f124187x;
                                        if (vEVideoPublishEditViewModel2 == null) {
                                            C52711k.m112237a("publishEditViewModel");
                                        }
                                        C0198r<Boolean> r = vEVideoPublishEditViewModel2.mo110473r();
                                        C52711k.m112236a((Object) r, "publishEditViewModel.inTimeEditView");
                                        C52711k.m112240b(r, "liveData");
                                        editDonationStickerViewModel3.f110301e = r;
                                        mo97394F().f110236m = new C49486c(this);
                                        mo97394F().f110245v = new C49487d(this);
                                        Activity activity9 = this.f33840g_;
                                        if (activity9 != null) {
                                            this.f124182r = new ToolSafeHandler((FragmentActivity) activity9);
                                            this.f124188y = new C49492i(this);
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
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
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
            this.f124175k = (EditViewModel) a;
            mo97394F().f110240q = false;
            EditViewModel editViewModel = this.f124175k;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            C20347c cVar = (C20347c) editViewModel.mo97038h().getValue();
            if (cVar != null) {
                mo97394F().f110238o = cVar.mo43037b();
                mo97394F().mo88723a((Context) this.f33840g_, (C46723c) null, frameLayout);
                C49527v vVar = this.f124174j;
                if (vVar == null) {
                    C52711k.m112237a("gestureListenerManager");
                }
                vVar.mo97456b((C46722b) mo97394F().f110239p);
            }
            this.f124184t = frameLayout;
            return new View(layoutInflater.getContext());
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
