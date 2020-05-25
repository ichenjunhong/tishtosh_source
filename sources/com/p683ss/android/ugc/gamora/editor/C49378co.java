package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p2196a.C43547a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C43619b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.VESize;
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

/* renamed from: com.ss.android.ugc.gamora.editor.co */
public final class C49378co extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f123945i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49378co.class), "stickerController", "getStickerController()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VoteStickerController;"))};

    /* renamed from: s */
    public static final C49379a f123946s = new C49379a(null);

    /* renamed from: j */
    public C49527v f123947j;

    /* renamed from: k */
    public VotingStickerLayout f123948k;

    /* renamed from: l */
    public EditViewModel f123949l;

    /* renamed from: m */
    VideoPublishEditModel f123950m;

    /* renamed from: n */
    public EditPoiStickerViewModel f123951n;

    /* renamed from: o */
    public EditTextStickerViewModel f123952o;

    /* renamed from: p */
    public EditInfoStickerViewModel f123953p;

    /* renamed from: q */
    public EditCommentStickerViewModel f123954q;

    /* renamed from: r */
    public EditDonationStickerViewModel f123955r;

    /* renamed from: t */
    private EditVoteStickerViewModel f123956t;

    /* renamed from: u */
    private final C52668f f123957u = C52732g.m112285a(C49385g.f123963a);

    /* renamed from: com.ss.android.ugc.gamora.editor.co$a */
    public static final class C49379a {
        private C49379a() {
        }

        public /* synthetic */ C49379a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.co$b */
    public static final class C49380b implements C43547a {

        /* renamed from: a */
        final /* synthetic */ C49378co f123958a;

        /* renamed from: a */
        public final void mo88686a(View view) {
            C52711k.m112240b(view, "view");
        }

        /* renamed from: b */
        public final void mo88688b() {
            if (this.f123958a.mo97306J()) {
                C49378co.m106481b(this.f123958a).mo97037g().mo73977a(this.f123958a.mo97308L());
            }
        }

        /* renamed from: a */
        public final void mo88685a() {
            C49378co.m106481b(this.f123958a).mo97032a(false);
            this.f123958a.mo97302F().mo88973o();
            C49378co coVar = this.f123958a;
            String str = "poll_edit";
            C23089d a = C23089d.m56640a();
            String str2 = "creation_id";
            VideoPublishEditModel videoPublishEditModel = coVar.f123950m;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("publishEditModel");
            }
            C23089d a2 = a.mo47829a(str2, videoPublishEditModel.creationId);
            String str3 = "shoot_way";
            VideoPublishEditModel videoPublishEditModel2 = coVar.f123950m;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("publishEditModel");
            }
            C23089d a3 = a2.mo47829a(str3, videoPublishEditModel2.mShootWay);
            String str4 = "content_type";
            VideoPublishEditModel videoPublishEditModel3 = coVar.f123950m;
            if (videoPublishEditModel3 == null) {
                C52711k.m112237a("publishEditModel");
            }
            C23089d a4 = a3.mo47829a(str4, C43434az.m95202a(videoPublishEditModel3));
            String str5 = "content_source";
            VideoPublishEditModel videoPublishEditModel4 = coVar.f123950m;
            if (videoPublishEditModel4 == null) {
                C52711k.m112237a("publishEditModel");
            }
            C26890h.m65011a(str, a4.mo47829a(str5, C43434az.m95207b(videoPublishEditModel4)).mo47829a("enter_from", "video_edit_page").mo47829a("prop_id", coVar.mo97308L()).f61491a);
        }

        C49380b(C49378co coVar) {
            this.f123958a = coVar;
        }

        /* renamed from: a */
        public final void mo88687a(boolean z) {
            C49378co.m106480a(this.f123958a).mo96855e();
            if (z) {
                C49378co.m106481b(this.f123958a).mo97033a(true, true, true);
            } else {
                C49378co.m106481b(this.f123958a).mo97033a(false, true, false);
            }
        }

        /* renamed from: b */
        public final void mo88689b(boolean z) {
            if (z) {
                C49378co.m106480a(this.f123958a).mo96855e();
                EditPoiStickerViewModel editPoiStickerViewModel = this.f123958a.f123951n;
                if (editPoiStickerViewModel == null) {
                    C52711k.m112237a("poiStickerViewModel");
                }
                editPoiStickerViewModel.mo96910e();
                EditTextStickerViewModel editTextStickerViewModel = this.f123958a.f123952o;
                if (editTextStickerViewModel == null) {
                    C52711k.m112237a("textStickerViewModel");
                }
                editTextStickerViewModel.mo96977e();
                EditCommentStickerViewModel editCommentStickerViewModel = this.f123958a.f123954q;
                if (editCommentStickerViewModel == null) {
                    C52711k.m112237a("commentStickerViewModel");
                }
                editCommentStickerViewModel.mo96797e();
                EditDonationStickerViewModel editDonationStickerViewModel = this.f123958a.f123955r;
                if (editDonationStickerViewModel == null) {
                    C52711k.m112237a("donationStickerViewModel");
                }
                editDonationStickerViewModel.mo88798f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.co$c */
    static final class C49381c extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49378co f123959a;

        C49381c(C49378co coVar) {
            this.f123959a = coVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f123959a.mo97305I();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.co$d */
    static final class C49382d<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C49378co f123960a;

        C49382d(C49378co coVar) {
            this.f123960a = coVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                C43619b F = this.f123960a.mo97302F();
                C52711k.m112236a((Object) f, "it");
                F.mo88742a(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.co$e */
    static final class C49383e extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49378co f123961a;

        C49383e(C49378co coVar) {
            this.f123961a = coVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f123961a.mo97312a(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.co$f */
    static final class C49384f<T> implements C0199s<C20347c> {

        /* renamed from: a */
        final /* synthetic */ C49378co f123962a;

        C49384f(C49378co coVar) {
            this.f123962a = coVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C20347c cVar = (C20347c) obj;
            if (cVar != null) {
                this.f123962a.mo97302F().mo88744a(cVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.co$g */
    static final class C49385g extends C52712l implements C52670a<C43619b> {

        /* renamed from: a */
        public static final C49385g f123963a = new C49385g();

        C49385g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43619b();
        }
    }

    /* renamed from: F */
    public final C43619b mo97302F() {
        return (C43619b) this.f123957u.getValue();
    }

    /* renamed from: a */
    public final void mo97310a(VESize vESize) {
        C52711k.m112240b(vESize, "size");
        mo97302F().f110238o = vESize;
    }

    /* renamed from: a */
    public final void mo97312a(boolean z) {
        mo97302F().f110228e = z;
    }

    /* renamed from: G */
    public final void mo97303G() {
        mo97302F().mo88732e();
    }

    /* renamed from: I */
    public final void mo97305I() {
        mo97302F().mo88755m();
    }

    /* renamed from: K */
    public final void mo97307K() {
        mo97302F().mo88729b();
    }

    /* renamed from: L */
    public final String mo97308L() {
        return mo97302F().f110501b;
    }

    /* renamed from: M */
    public final boolean mo97309M() {
        return mo97302F().f110504z;
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

    /* renamed from: H */
    public final InteractStickerStruct mo97304H() {
        return mo97302F().mo88731d();
    }

    /* renamed from: J */
    public final boolean mo97306J() {
        return mo97302F().mo88730c();
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        C43619b F = mo97302F();
        VotingStickerLayout votingStickerLayout = F.f110503y;
        if (votingStickerLayout != null) {
            votingStickerLayout.f110468p = F.f110504z;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [d.f.a.a<d.x>, d.f.a.a] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24469p() {
        /*
            r4 = this;
            super.mo24469p()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r0 = r4.mo97302F()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r0 = r0.f110503y
            if (r0 == 0) goto L_0x0036
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x002d
            android.widget.FrameLayout r1 = r0.f110454b
            if (r1 != 0) goto L_0x001a
            java.lang.String r2 = "root"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x001a:
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            d.f.a.a<d.x> r2 = r0.f110455c
            if (r2 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f r3 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f
            r3.<init>(r2)
            r2 = r3
        L_0x0028:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            r1.removeOnGlobalLayoutListener(r2)
        L_0x002d:
            android.animation.Animator r0 = r0.f110469q
            if (r0 == 0) goto L_0x0035
            r0.cancel()
            goto L_0x0036
        L_0x0035:
            return
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49378co.mo24469p():void");
    }

    /* renamed from: a */
    public final void mo97311a(String str) {
        mo97302F().f110501b = str;
    }

    /* renamed from: b */
    public final void mo97313b(String str) {
        mo97302F().f110502x = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditInfoStickerViewModel m106480a(C49378co coVar) {
        EditInfoStickerViewModel editInfoStickerViewModel = coVar.f123953p;
        if (editInfoStickerViewModel == null) {
            C52711k.m112237a("infoStickerViewModel");
        }
        return editInfoStickerViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditViewModel m106481b(C49378co coVar) {
        EditViewModel editViewModel = coVar.f123949l;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditVoteStickerViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123956t = (EditVoteStickerViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditTextStickerViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f123952o = (EditTextStickerViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditPoiStickerViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f123951n = (EditPoiStickerViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditInfoStickerViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                        this.f123953p = (EditInfoStickerViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditCommentStickerViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
                            this.f123954q = (EditCommentStickerViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(EditDonationStickerViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java]");
                                this.f123955r = (EditDonationStickerViewModel) a6;
                                EditVoteStickerViewModel editVoteStickerViewModel = this.f123956t;
                                if (editVoteStickerViewModel == null) {
                                    C52711k.m112237a("voteStickerViewModel");
                                }
                                mo49444c(editVoteStickerViewModel, C49386cp.f123964a, new C11934u(), new C49381c(this));
                                EditVoteStickerViewModel editVoteStickerViewModel2 = this.f123956t;
                                if (editVoteStickerViewModel2 == null) {
                                    C52711k.m112237a("voteStickerViewModel");
                                }
                                C0184k kVar = this;
                                editVoteStickerViewModel2.mo97079f().observe(kVar, new C49382d(this));
                                EditVoteStickerViewModel editVoteStickerViewModel3 = this.f123956t;
                                if (editVoteStickerViewModel3 == null) {
                                    C52711k.m112237a("voteStickerViewModel");
                                }
                                mo49443b(editVoteStickerViewModel3, C49387cq.f123965a, new C11934u(), new C49383e(this));
                                EditViewModel editViewModel = this.f123949l;
                                if (editViewModel == null) {
                                    C52711k.m112237a("editViewModel");
                                }
                                editViewModel.mo97038h().observe(kVar, new C49384f(this));
                                mo97302F().f110236m = new C49380b(this);
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

    /* JADX WARNING: type inference failed for: r2v7, types: [d.f.a.a<d.x>, d.f.a.a] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo24387a(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r7 = "inflater"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
            java.lang.String r5 = "container"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r5)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            android.app.Activity r5 = r4.f33840g_
            if (r5 == 0) goto L_0x0129
            android.support.v4.app.FragmentActivity r5 = (android.support.p030v4.app.FragmentActivity) r5
            com.ss.android.ugc.gamora.b.c r5 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r5)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditViewModel> r7 = com.p683ss.android.ugc.gamora.editor.EditViewModel.class
            com.bytedance.jedi.arch.JediViewModel r5 = r5.mo96760a(r7)
            java.lang.String r7 = "JediViewModelProviders.o…ditViewModel::class.java]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            com.ss.android.ugc.gamora.editor.EditViewModel r5 = (com.p683ss.android.ugc.gamora.editor.EditViewModel) r5
            r4.f123949l = r5
            com.ss.android.ugc.gamora.editor.EditViewModel r5 = r4.f123949l
            if (r5 != 0) goto L_0x002e
            java.lang.String r7 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x002e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r5.mo97035e()
            r4.f123950m = r5
            com.ss.android.ugc.gamora.editor.EditViewModel r5 = r4.f123949l
            if (r5 != 0) goto L_0x003d
            java.lang.String r7 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x003d:
            android.arch.lifecycle.r r5 = r5.mo97038h()
            java.lang.Object r5 = r5.getValue()
            com.ss.android.ugc.asve.c.c r5 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r5
            r7 = 0
            if (r5 == 0) goto L_0x0070
            com.ss.android.vesdk.VESize r5 = r5.mo43037b()
            r4.mo97310a(r5)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r5 = r4.mo97302F()
            android.app.Activity r0 = r4.f33840g_
            android.content.Context r0 = (android.content.Context) r0
            r5.mo88750b(r0, r7, r6)
            com.ss.android.ugc.gamora.editor.v r5 = r4.f123947j
            if (r5 != 0) goto L_0x0065
            java.lang.String r0 = "gestureListenerManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0065:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r0 = r4.mo97302F()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.c$a r0 = r0.f110239p
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b r0 = (com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b) r0
            r5.mo97455a(r0)
        L_0x0070:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r5 = r4.mo97302F()
            android.app.Activity r0 = r4.f33840g_
            if (r0 != 0) goto L_0x007b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007b:
            java.lang.String r1 = "activity!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r1 = r4.f123948k
            if (r1 != 0) goto L_0x0089
            java.lang.String r2 = "votingStickerLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0089:
            java.lang.String r2 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.lang.String r2 = "votingStickerLayout"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            r5.f110503y = r1
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r2 = r5.f110503y
            if (r2 == 0) goto L_0x00ca
            java.lang.String r3 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r3)
            java.lang.String r3 = "activity.findViewById(android.R.id.content)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.f110454b = r0
            android.widget.FrameLayout r0 = r2.f110454b
            if (r0 != 0) goto L_0x00b7
            java.lang.String r3 = "root"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00b7:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            d.f.a.a<d.x> r2 = r2.f110455c
            if (r2 == 0) goto L_0x00c5
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f r3 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f
            r3.<init>(r2)
            r2 = r3
        L_0x00c5:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            r0.addOnGlobalLayoutListener(r2)
        L_0x00ca:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r0 = r5.f110503y
            if (r0 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$b r2 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$b
            r2.<init>(r5)
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            r0.setOnCompleteListener(r2)
        L_0x00d8:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r0 = r5.f110503y
            if (r0 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$c r2 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$c
            r2.<init>(r5, r1)
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            r0.setBeforeChangeListener(r2)
        L_0x00e6:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r5 = r4.mo97302F()
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r4.f123949l
            if (r0 != 0) goto L_0x00f3
            java.lang.String r1 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00f3:
            android.arch.lifecycle.r r0 = r0.mo97038h()
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.asve.c.c r0 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r0
            r5.mo88744a(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r5 = r4.mo97302F()
            r0 = 0
            r5.f110240q = r0
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r5 = r4.mo97302F()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.f123950m
            if (r0 != 0) goto L_0x0114
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0114:
            android.app.Activity r1 = r4.f33840g_
            android.content.Context r1 = (android.content.Context) r1
            android.graphics.Rect r7 = r0.getLiveWaterMarkRect(r1, r7)
            r5.mo88743a(r7)
            android.view.View r5 = new android.view.View
            android.content.Context r6 = r6.getContext()
            r5.<init>(r6)
            return r5
        L_0x0129:
            d.u r5 = new d.u
            java.lang.String r6 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49378co.mo24387a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
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
