package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.graphics.PointF;
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
import com.p683ss.android.ugc.aweme.comment_sticker.view.CommentStickerView;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43487a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43501am;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43509at;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43510b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43535i;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43535i.C43543a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43535i.C43545c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C43593d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2341c.C46669a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52855s;
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

/* renamed from: com.ss.android.ugc.gamora.editor.aa */
public final class C49067aa extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f123313i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49067aa.class), "stickerHelper", "getStickerHelper()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/InfoStickerHelper;"))};

    /* renamed from: t */
    public static final C49068a f123314t = new C49068a(null);

    /* renamed from: j */
    public C49527v f123315j;

    /* renamed from: k */
    public VEVideoPublishEditViewModel f123316k;

    /* renamed from: l */
    public EditViewModel f123317l;

    /* renamed from: m */
    public FrameLayout f123318m;

    /* renamed from: n */
    public EditPoiStickerViewModel f123319n;

    /* renamed from: o */
    public EditVoteStickerViewModel f123320o;

    /* renamed from: p */
    public EditCommentStickerViewModel f123321p;

    /* renamed from: q */
    public EditTextStickerViewModel f123322q;

    /* renamed from: r */
    public EditLyricStickerViewModel f123323r;

    /* renamed from: s */
    public EditDonationStickerViewModel f123324s;

    /* renamed from: u */
    private EditPreviewViewModel f123325u;

    /* renamed from: v */
    private EditInfoStickerViewModel f123326v;

    /* renamed from: w */
    private final C52668f f123327w = C52732g.m112285a(C49077j.f123336a);

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$a */
    public static final class C49068a {
        private C49068a() {
        }

        public /* synthetic */ C49068a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$b */
    public static final class C49069b implements C43510b {

        /* renamed from: a */
        final /* synthetic */ C49067aa f123328a;

        C49069b(C49067aa aaVar) {
            this.f123328a = aaVar;
        }

        /* renamed from: b */
        public final void mo88528b(StickerItemModel stickerItemModel) {
            C52711k.m112240b(stickerItemModel, "item");
            this.f123328a.mo97095F().f110170m.infoStickerModel.removeSticker(stickerItemModel);
            C49067aa.m105889a(this.f123328a).mo97037g().mo73977a(stickerItemModel.stickerId);
        }

        /* renamed from: a */
        public final void mo88527a(StickerItemModel stickerItemModel) {
            C52711k.m112240b(stickerItemModel, "item");
            if (this.f123328a.mo97095F().f110170m.infoStickerModel == null) {
                this.f123328a.mo97095F().f110170m.infoStickerModel = new InfoStickerModel(this.f123328a.mo97095F().f110170m.draftDir());
            }
            StringBuilder sb = new StringBuilder("add infoSticker ");
            sb.append(stickerItemModel.f91605id);
            C50203g.m108363d(sb.toString());
            this.f123328a.mo97095F().f110170m.infoStickerModel.addSticker(stickerItemModel);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$c */
    public static final class C49070c implements C43545c {

        /* renamed from: a */
        final /* synthetic */ C49067aa f123329a;

        /* renamed from: a */
        public final int mo88666a(C43501am amVar, boolean z, boolean z2) {
            C52711k.m112240b(amVar, "item");
            return 0;
        }

        C49070c(C49067aa aaVar) {
            this.f123329a = aaVar;
        }

        /* renamed from: a */
        public final Float mo88668a(float f) {
            return Float.valueOf(f);
        }

        /* renamed from: a */
        public final PointF mo88667a(C43501am amVar, float f, float f2) {
            C52711k.m112240b(amVar, "item");
            return new PointF();
        }

        /* renamed from: a */
        public final void mo88669a(C43501am amVar, int i, int i2, boolean z, boolean z2, C43549b bVar) {
            C52711k.m112240b(amVar, "item");
            C0198r r = C49067aa.m105890b(this.f123329a).mo110473r();
            C52711k.m112236a((Object) r, "mPublishEditViewModel.inTimeEditView");
            if (!C52711k.m112239a((Object) (Boolean) r.getValue(), (Object) Boolean.valueOf(true))) {
                C0198r s = C49067aa.m105890b(this.f123329a).mo110474s();
                C52711k.m112236a((Object) s, "mPublishEditViewModel.inPinEditView");
                if (!C52711k.m112239a((Object) (Boolean) s.getValue(), (Object) Boolean.valueOf(true))) {
                    if (z) {
                        EditLyricStickerViewModel editLyricStickerViewModel = this.f123329a.f123323r;
                        if (editLyricStickerViewModel == null) {
                            C52711k.m112237a("lyricStickerViewModel");
                        }
                        if (C52711k.m112239a((Object) (Boolean) editLyricStickerViewModel.mo96879f().getValue(), (Object) Boolean.valueOf(true))) {
                            C49067aa.m105889a(this.f123329a).mo97033a(false, true, false);
                            return;
                        } else {
                            C49067aa.m105889a(this.f123329a).mo97033a(true, true, true);
                            return;
                        }
                    } else {
                        C49067aa.m105889a(this.f123329a).mo97033a(false, true, false);
                        this.f123329a.mo97095F().mo88659h();
                        C49067aa.m105891c(this.f123329a).mo96910e();
                        C49067aa.m105892d(this.f123329a).mo97078e();
                        C49067aa.m105893e(this.f123329a).mo96977e();
                        C49067aa.m105894f(this.f123329a).mo96797e();
                        C49067aa.m105895g(this.f123329a).mo88798f();
                        return;
                    }
                }
            }
            if (this.f123329a.mo97095F().f110133B != null) {
                this.f123329a.mo97096G();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$d */
    public static final class C49071d implements C43543a {

        /* renamed from: a */
        final /* synthetic */ C49067aa f123330a;

        C49071d(C49067aa aaVar) {
            this.f123330a = aaVar;
        }

        /* renamed from: a */
        public final void mo88679a(boolean z) {
            C49067aa.m105891c(this.f123330a).mo96909a(C49067aa.m105888a(!z));
            C49067aa.m105892d(this.f123330a).mo97077a(C49067aa.m105888a(!z));
            C49067aa.m105892d(this.f123330a).mo22530c(new C49029a(!z));
            C49067aa.m105893e(this.f123330a).mo96976a(C49067aa.m105888a(!z), false);
            C49067aa.m105894f(this.f123330a).mo96795a(C49067aa.m105888a(!z));
            C49067aa.m105895g(this.f123330a).mo88795a(C49067aa.m105888a(!z));
            if (z) {
                C43487a aVar = this.f123330a.mo97095F().f110133B;
                if (!(aVar instanceof C46757l)) {
                    aVar = null;
                }
                C46757l lVar = (C46757l) aVar;
                if (lVar != null) {
                    lVar.mo93890b(C49067aa.m105888a(true), false);
                }
                C43487a aVar2 = this.f123330a.mo97095F().f110133B;
                if (!(aVar2 instanceof CommentStickerView)) {
                    aVar2 = null;
                }
                CommentStickerView commentStickerView = (CommentStickerView) aVar2;
                if (commentStickerView != null) {
                    commentStickerView.mo52066a(C49067aa.m105888a(true), false);
                }
                C43487a aVar3 = this.f123330a.mo97095F().f110133B;
                if (!(aVar3 instanceof C43593d)) {
                    aVar3 = null;
                }
                C43593d dVar = (C43593d) aVar3;
                if (dVar != null) {
                    dVar.mo88775a(C49067aa.m105888a(true), false);
                }
            }
        }

        /* renamed from: b */
        public final void mo88680b(boolean z) {
            C49067aa.m105891c(this.f123330a).mo96909a(C49067aa.m105888a(z));
            C49067aa.m105892d(this.f123330a).mo97077a(C49067aa.m105888a(z));
            C49067aa.m105893e(this.f123330a).mo96976a(C49067aa.m105888a(z), false);
            C49067aa.m105894f(this.f123330a).mo96795a(C49067aa.m105888a(z));
            C49067aa.m105895g(this.f123330a).mo88795a(C49067aa.m105888a(z));
            if (!z) {
                C43487a aVar = this.f123330a.mo97095F().f110133B;
                if (!(aVar instanceof C46757l)) {
                    aVar = null;
                }
                C46757l lVar = (C46757l) aVar;
                if (lVar != null) {
                    lVar.mo93890b(C49067aa.m105888a(true), false);
                }
                C43487a aVar2 = this.f123330a.mo97095F().f110133B;
                if (!(aVar2 instanceof CommentStickerView)) {
                    aVar2 = null;
                }
                CommentStickerView commentStickerView = (CommentStickerView) aVar2;
                if (commentStickerView != null) {
                    commentStickerView.mo52066a(C49067aa.m105888a(true), false);
                }
                C43487a aVar3 = this.f123330a.mo97095F().f110133B;
                if (!(aVar3 instanceof C43593d)) {
                    aVar3 = null;
                }
                C43593d dVar = (C43593d) aVar3;
                if (dVar != null) {
                    dVar.mo88775a(C49067aa.m105888a(true), false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$e */
    static final class C49072e implements C46669a {

        /* renamed from: a */
        final /* synthetic */ C49067aa f123331a;

        C49072e(C49067aa aaVar) {
            this.f123331a = aaVar;
        }

        /* renamed from: a */
        public final void mo93592a(boolean z) {
            C49067aa.m105891c(this.f123331a).mo96910e();
            C49067aa.m105892d(this.f123331a).mo97078e();
            C49067aa.m105893e(this.f123331a).mo96977e();
            C49067aa.m105894f(this.f123331a).mo96797e();
            C49067aa.m105895g(this.f123331a).mo88798f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$f */
    static final class C49073f extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49067aa f123332a;

        C49073f(C49067aa aaVar) {
            this.f123332a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f123332a.mo97095F().mo88659h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$g */
    static final class C49074g extends C52712l implements C52682m<C49548a, C52847n<? extends Integer, ? extends Integer>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49067aa f123333a;

        C49074g(C49067aa aaVar) {
            this.f123333a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52847n nVar = (C52847n) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(nVar, "it");
            this.f123333a.mo97095F().mo88633a(nVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$h */
    static final class C49075h extends C52712l implements C52682m<C49548a, C52847n<? extends Float, ? extends Long>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49067aa f123334a;

        C49075h(C49067aa aaVar) {
            this.f123334a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52847n nVar = (C52847n) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(nVar, "it");
            InfoStickerEditView infoStickerEditView = this.f123334a.mo97095F().f110161d;
            C52711k.m112236a((Object) infoStickerEditView, "stickerHelper.mInfoStickerEditView");
            C49142as.m106091a(infoStickerEditView, ((Number) nVar.getFirst()).floatValue(), ((Number) nVar.getSecond()).longValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$i */
    static final class C49076i extends C52712l implements C52682m<C49548a, C52855s<? extends Float, ? extends Float, ? extends Float>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49067aa f123335a;

        C49076i(C49067aa aaVar) {
            this.f123335a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52855s sVar = (C52855s) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(sVar, "it");
            InfoStickerEditView infoStickerEditView = this.f123335a.mo97095F().f110161d;
            C52711k.m112236a((Object) infoStickerEditView, "stickerHelper.mInfoStickerEditView");
            C49142as.m106090a(infoStickerEditView, ((Number) sVar.getFirst()).floatValue(), ((Number) sVar.getSecond()).floatValue(), ((Number) sVar.getThird()).floatValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aa$j */
    static final class C49077j extends C52712l implements C52670a<C43535i> {

        /* renamed from: a */
        public static final C49077j f123336a = new C49077j();

        C49077j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43535i();
        }
    }

    /* renamed from: a */
    public static float m105888a(boolean z) {
        return z ? 1.0f : 0.3137255f;
    }

    /* renamed from: F */
    public final C43535i mo97095F() {
        return (C43535i) this.f123327w.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo97101a(C49527v vVar) {
        C52711k.m112240b(vVar, "<set-?>");
        this.f123315j = vVar;
    }

    /* renamed from: a */
    public final void mo97100a(C49391cu cuVar) {
        mo97095F().f110174q = cuVar;
    }

    /* renamed from: a */
    public final void mo97099a(C43509at<?> atVar) {
        mo97095F().mo88644b((C43509at) atVar);
    }

    /* renamed from: a */
    public final void mo97098a(C43487a aVar, boolean z) {
        mo97095F().mo88627a(aVar, z);
    }

    /* renamed from: a */
    public final boolean mo97103a(boolean z, boolean z2) {
        return mo97095F().mo88640a(z, z2);
    }

    /* renamed from: a */
    public final void mo97102a(String str, String str2, String str3, int i) {
        mo97095F().mo88634a(str, str2, str3, i);
    }

    /* renamed from: G */
    public final void mo97096G() {
        mo97095F().mo88658g();
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
        mo97095F().mo88664m();
    }

    /* renamed from: a */
    public final void mo97097a(FrameLayout frameLayout) {
        C52711k.m112240b(frameLayout, "<set-?>");
        this.f123318m = frameLayout;
    }

    /* renamed from: b */
    public final void mo97104b(C43509at<?> atVar) {
        mo97095F().mo88628a((C43509at) atVar);
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoPublishEditViewModel m105890b(C49067aa aaVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = aaVar.f123316k;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("mPublishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditPoiStickerViewModel m105891c(C49067aa aaVar) {
        EditPoiStickerViewModel editPoiStickerViewModel = aaVar.f123319n;
        if (editPoiStickerViewModel == null) {
            C52711k.m112237a("poiStickerViewModel");
        }
        return editPoiStickerViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditVoteStickerViewModel m105892d(C49067aa aaVar) {
        EditVoteStickerViewModel editVoteStickerViewModel = aaVar.f123320o;
        if (editVoteStickerViewModel == null) {
            C52711k.m112237a("voteStickerViewModel");
        }
        return editVoteStickerViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ EditTextStickerViewModel m105893e(C49067aa aaVar) {
        EditTextStickerViewModel editTextStickerViewModel = aaVar.f123322q;
        if (editTextStickerViewModel == null) {
            C52711k.m112237a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ EditCommentStickerViewModel m105894f(C49067aa aaVar) {
        EditCommentStickerViewModel editCommentStickerViewModel = aaVar.f123321p;
        if (editCommentStickerViewModel == null) {
            C52711k.m112237a("commentStickerViewModel");
        }
        return editCommentStickerViewModel;
    }

    /* renamed from: g */
    public static final /* synthetic */ EditDonationStickerViewModel m105895g(C49067aa aaVar) {
        EditDonationStickerViewModel editDonationStickerViewModel = aaVar.f123324s;
        if (editDonationStickerViewModel == null) {
            C52711k.m112237a("donationStickerViewModel");
        }
        return editDonationStickerViewModel;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m105889a(C49067aa aaVar) {
        EditViewModel editViewModel = aaVar.f123317l;
        if (editViewModel == null) {
            C52711k.m112237a("mEditViewModel");
        }
        return editViewModel;
    }

    /* renamed from: d */
    public final void mo97106d(int i) {
        mo97095F().mo88652d(i);
    }

    /* renamed from: b */
    public final void mo97105b(boolean z) {
        mo97095F().mo88636a(z);
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…ditViewModel::class.java)");
            this.f123316k = (VEVideoPublishEditViewModel) a;
            JediViewModel a2 = C48927d.m105736a(fragmentActivity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f123317l = (EditViewModel) a2;
            JediViewModel a3 = C48927d.m105736a(fragmentActivity).mo96760a(EditPreviewViewModel.class);
            C52711k.m112236a((Object) a3, "JediViewModelProviders.o…iewViewModel::class.java)");
            this.f123325u = (EditPreviewViewModel) a3;
            JediViewModel a4 = C48927d.m105736a(fragmentActivity).mo96760a(EditInfoStickerViewModel.class);
            C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java)");
            this.f123326v = (EditInfoStickerViewModel) a4;
            JediViewModel a5 = C48927d.m105736a(fragmentActivity).mo96760a(EditPoiStickerViewModel.class);
            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123319n = (EditPoiStickerViewModel) a5;
            JediViewModel a6 = C48927d.m105736a(fragmentActivity).mo96760a(EditVoteStickerViewModel.class);
            C52711k.m112236a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123320o = (EditVoteStickerViewModel) a6;
            JediViewModel a7 = C48927d.m105736a(fragmentActivity).mo96760a(EditTextStickerViewModel.class);
            C52711k.m112236a((Object) a7, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123322q = (EditTextStickerViewModel) a7;
            JediViewModel a8 = C48927d.m105736a(fragmentActivity).mo96760a(EditLyricStickerViewModel.class);
            C52711k.m112236a((Object) a8, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123323r = (EditLyricStickerViewModel) a8;
            JediViewModel a9 = C48927d.m105736a(fragmentActivity).mo96760a(EditCommentStickerViewModel.class);
            C52711k.m112236a((Object) a9, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123321p = (EditCommentStickerViewModel) a9;
            JediViewModel a10 = C48927d.m105736a(fragmentActivity).mo96760a(EditDonationStickerViewModel.class);
            C52711k.m112236a((Object) a10, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123324s = (EditDonationStickerViewModel) a10;
            C43535i F = mo97095F();
            EditViewModel editViewModel = this.f123317l;
            if (editViewModel == null) {
                C52711k.m112237a("mEditViewModel");
            }
            Object value = editViewModel.mo97038h().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            C20347c cVar = (C20347c) value;
            EditViewModel editViewModel2 = this.f123317l;
            if (editViewModel2 == null) {
                C52711k.m112237a("mEditViewModel");
            }
            F.mo88625a(cVar, editViewModel2.mo97035e());
            C43535i F2 = mo97095F();
            Object a11 = C39630m.m88234a().mo58623u().mo74243e().mo74245a();
            C52711k.m112236a(a11, "DmtCameraClient.getAPI()…InfoStickerMaxCount.get()");
            F2.mo88619a(((Number) a11).intValue());
            C43535i F3 = mo97095F();
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                FragmentActivity fragmentActivity2 = (FragmentActivity) activity2;
                View view = this.f33834b;
                VideoPublishEditModel videoPublishEditModel = mo97095F().f110170m;
                C52711k.m112236a((Object) videoPublishEditModel, "stickerHelper.model");
                List mediaModelList = videoPublishEditModel.getMediaModelList();
                EditViewModel editViewModel3 = this.f123317l;
                if (editViewModel3 == null) {
                    C52711k.m112237a("mEditViewModel");
                }
                F3.mo88622a(fragmentActivity2, view, mediaModelList, editViewModel3.mo97048r());
                C43535i F4 = mo97095F();
                FrameLayout frameLayout = this.f123318m;
                if (frameLayout == null) {
                    C52711k.m112237a("borderLineLayout");
                }
                F4.mo88624a(frameLayout);
                C43535i F5 = mo97095F();
                EditPreviewViewModel editPreviewViewModel = this.f123325u;
                if (editPreviewViewModel == null) {
                    C52711k.m112237a("mPreviewViewModel");
                }
                F5.f110176s = editPreviewViewModel.mo96925f();
                C43535i F6 = mo97095F();
                EditPreviewViewModel editPreviewViewModel2 = this.f123325u;
                if (editPreviewViewModel2 == null) {
                    C52711k.m112237a("mPreviewViewModel");
                }
                F6.f110175r = editPreviewViewModel2.mo96926g();
                InfoStickerViewModel infoStickerViewModel = mo97095F().f110168k;
                C52711k.m112236a((Object) infoStickerViewModel, "stickerHelper.viewModel");
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123316k;
                if (vEVideoPublishEditViewModel == null) {
                    C52711k.m112237a("mPublishEditViewModel");
                }
                infoStickerViewModel.f109961c = vEVideoPublishEditViewModel.mo110473r();
                InfoStickerViewModel infoStickerViewModel2 = mo97095F().f110168k;
                C52711k.m112236a((Object) infoStickerViewModel2, "stickerHelper.viewModel");
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f123316k;
                if (vEVideoPublishEditViewModel2 == null) {
                    C52711k.m112237a("mPublishEditViewModel");
                }
                infoStickerViewModel2.f109962d = vEVideoPublishEditViewModel2.mo110474s();
                InfoStickerViewModel infoStickerViewModel3 = mo97095F().f110168k;
                C52711k.m112236a((Object) infoStickerViewModel3, "stickerHelper.viewModel");
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = this.f123316k;
                if (vEVideoPublishEditViewModel3 == null) {
                    C52711k.m112237a("mPublishEditViewModel");
                }
                infoStickerViewModel3.f109959a = vEVideoPublishEditViewModel3.mo110466k();
                InfoStickerViewModel infoStickerViewModel4 = mo97095F().f110168k;
                C52711k.m112236a((Object) infoStickerViewModel4, "stickerHelper.viewModel");
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel4 = this.f123316k;
                if (vEVideoPublishEditViewModel4 == null) {
                    C52711k.m112237a("mPublishEditViewModel");
                }
                infoStickerViewModel4.f109960b = vEVideoPublishEditViewModel4.mo110462g();
                EditInfoStickerViewModel editInfoStickerViewModel = this.f123326v;
                if (editInfoStickerViewModel == null) {
                    C52711k.m112237a("mEditInfoStickerViewModel");
                }
                mo49444c(editInfoStickerViewModel, C49078ab.f123337a, new C11934u(), new C49073f(this));
                EditInfoStickerViewModel editInfoStickerViewModel2 = this.f123326v;
                if (editInfoStickerViewModel2 == null) {
                    C52711k.m112237a("mEditInfoStickerViewModel");
                }
                mo49444c(editInfoStickerViewModel2, C49079ac.f123338a, new C11934u(), new C49074g(this));
                EditInfoStickerViewModel editInfoStickerViewModel3 = this.f123326v;
                if (editInfoStickerViewModel3 == null) {
                    C52711k.m112237a("mEditInfoStickerViewModel");
                }
                mo49444c(editInfoStickerViewModel3, C49080ad.f123339a, new C11934u(), new C49075h(this));
                EditInfoStickerViewModel editInfoStickerViewModel4 = this.f123326v;
                if (editInfoStickerViewModel4 == null) {
                    C52711k.m112237a("mEditInfoStickerViewModel");
                }
                mo49444c(editInfoStickerViewModel4, C49081ae.f123340a, new C11934u(), new C49076i(this));
                mo97095F().mo88630a((C43510b) new C49069b(this));
                mo97095F().f110183z = new C49070c(this);
                mo97095F().f110132A = new C49071d(this);
                mo97095F().mo88632a((C46669a) new C49072e(this));
                C49527v vVar = this.f123315j;
                if (vVar == null) {
                    C52711k.m112237a("gestureListenerManager");
                }
                InfoStickerEditView infoStickerEditView = mo97095F().f110161d;
                C52711k.m112236a((Object) infoStickerEditView, "stickerHelper.mInfoStickerEditView");
                vVar.mo97458d((C46722b) infoStickerEditView.getGestureListener());
                if (mo97095F().f110170m.mIsFromDraft && mo97095F().f110170m.hasInfoStickers()) {
                    C50203g.m108363d("restore info stickers");
                    mo97095F().mo88626a(mo97095F().f110170m.infoStickerModel);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.a4_, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…ticker, container, false)");
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
