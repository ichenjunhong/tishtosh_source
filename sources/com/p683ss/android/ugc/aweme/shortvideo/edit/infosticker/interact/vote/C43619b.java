package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.JediViewModel;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43560c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b */
public final class C43619b extends C43560c {

    /* renamed from: A */
    private final String f110491A = "poll_sticker_id";

    /* renamed from: B */
    private final String f110492B = "poll_sticker_tab_id";

    /* renamed from: C */
    private final String f110493C = "pi_start";

    /* renamed from: D */
    private final String f110494D = "pi_end";

    /* renamed from: E */
    private final String f110495E;

    /* renamed from: F */
    private final int f110496F;

    /* renamed from: G */
    private final int f110497G;

    /* renamed from: H */
    private final int f110498H;

    /* renamed from: I */
    private final int f110499I;

    /* renamed from: a */
    VoteStruct f110500a;

    /* renamed from: b */
    public String f110501b;

    /* renamed from: x */
    public String f110502x;

    /* renamed from: y */
    public VotingStickerLayout f110503y;

    /* renamed from: z */
    public boolean f110504z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$a */
    static final class C43620a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43619b f110505a;

        C43620a(C43619b bVar) {
            this.f110505a = bVar;
        }

        public final void run() {
            this.f110505a.f110234k.mo88875f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$b */
    public static final class C43621b extends C52712l implements C52671b<VotingStickerView, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43619b f110506a;

        public C43621b(C43619b bVar) {
            this.f110506a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            VoteStruct voteStruct;
            VotingStickerView votingStickerView = (VotingStickerView) obj;
            this.f110506a.mo88735h();
            C43619b bVar = this.f110506a;
            if (bVar.f110234k == null) {
                bVar.mo88727a(false);
            }
            if (bVar.f110234k instanceof C43628c) {
                if (votingStickerView != null) {
                    voteStruct = votingStickerView.getVoteStruct();
                } else {
                    voteStruct = null;
                }
                bVar.f110500a = voteStruct;
                if (votingStickerView != null) {
                    votingStickerView.mo88956b();
                }
                InteractStickerBaseView interactStickerBaseView = bVar.f110234k;
                if (interactStickerBaseView != null) {
                    ((C43628c) interactStickerBaseView).mo88979a(votingStickerView);
                    bVar.f110234k.post(new C43620a(bVar));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
                }
            }
            if (this.f110506a.f110234k != null && (this.f110506a.f110234k instanceof C43628c)) {
                this.f110506a.f110234k.post(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C43621b f110507a;

                    {
                        this.f110507a = r1;
                    }

                    public final void run() {
                        this.f110507a.f110506a.f110234k.mo88876g();
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$c */
    public static final class C43623c extends C52712l implements C52671b<VotingStickerView, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43619b f110508a;

        /* renamed from: b */
        final /* synthetic */ VotingStickerLayout f110509b;

        public C43623c(C43619b bVar, VotingStickerLayout votingStickerLayout) {
            this.f110508a = bVar;
            this.f110509b = votingStickerLayout;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            VotingStickerView votingStickerView = (VotingStickerView) obj;
            if (this.f110508a.f110234k == null || !(this.f110508a.f110234k instanceof C43628c)) {
                VotingStickerLayout votingStickerLayout = this.f110508a.f110503y;
                if (votingStickerLayout != null) {
                    votingStickerLayout.mo88939a();
                }
            } else {
                InteractStickerBaseView interactStickerBaseView = this.f110508a.f110234k;
                if (interactStickerBaseView != null) {
                    float b = ((C43628c) interactStickerBaseView).mo88981b(votingStickerView);
                    VotingStickerLayout votingStickerLayout2 = this.f110509b;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.f110459g.f110489e += b;
                    }
                    VotingStickerLayout votingStickerLayout3 = this.f110508a.f110503y;
                    if (votingStickerLayout3 != null) {
                        votingStickerLayout3.mo88939a();
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$d */
    static final class C43624d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43619b f110510a;

        /* renamed from: b */
        final /* synthetic */ C52727e f110511b;

        /* renamed from: c */
        final /* synthetic */ C52727e f110512c;

        C43624d(C43619b bVar, C52727e eVar, C52727e eVar2) {
            this.f110510a = bVar;
            this.f110511b = eVar;
            this.f110512c = eVar2;
        }

        public final void run() {
            VotingStickerLayout votingStickerLayout = this.f110510a.f110503y;
            if (votingStickerLayout != null) {
                votingStickerLayout.mo88941a((VotingStickerView) this.f110511b.element, (C43618a) this.f110512c.element);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$e */
    static final class C43625e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43619b f110513a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f110514b;

        C43625e(C43619b bVar, InteractStickerStruct interactStickerStruct) {
            this.f110513a = bVar;
            this.f110514b = interactStickerStruct;
        }

        public final void run() {
            C43619b.super.mo88746a(this.f110514b);
            InteractStickerBaseView interactStickerBaseView = this.f110513a.f110234k;
            C52711k.m112236a((Object) interactStickerBaseView, "mStickerView");
            interactStickerBaseView.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$f */
    public static final class C43626f extends C17956a<HashMap<String, String>> {
        C43626f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$g */
    static final class C43627g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43619b f110515a;

        C43627g(C43619b bVar) {
            this.f110515a = bVar;
        }

        public final void run() {
            VotingStickerLayout votingStickerLayout = this.f110515a.f110503y;
            if (votingStickerLayout != null) {
                C43618a aVar = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
                votingStickerLayout.mo88941a(null, aVar);
            }
        }
    }

    /* renamed from: g */
    public final int mo88734g() {
        return R.string.ali;
    }

    /* renamed from: c */
    public final boolean mo88730c() {
        if (this.f110500a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final String m95876q() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f110493C);
        sb.append(UUID.randomUUID().toString());
        sb.append(this.f110494D);
        return sb.toString();
    }

    public C43619b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f110493C);
        sb.append("(.*?)");
        sb.append(this.f110494D);
        this.f110495E = sb.toString();
        this.f110496F = 160;
        this.f110497G = 170;
        this.f110498H = 190;
        this.f110499I = 24;
    }

    /* renamed from: p */
    private final void m95875p() {
        this.f110504z = true;
        Context context = this.f110242s;
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity != null) {
            JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            ((EditViewModel) a).mo97033a(false, false, false);
        }
    }

    /* renamed from: b */
    public final void mo88729b() {
        if (this.f110500a != null) {
            mo88973o();
            return;
        }
        m95875p();
        VotingStickerLayout votingStickerLayout = this.f110503y;
        if (votingStickerLayout != null) {
            FrameLayout frameLayout = this.f110227d;
            C52711k.m112236a((Object) frameLayout, "mStickerParentLayout");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f110227d;
            C52711k.m112236a((Object) frameLayout2, "mStickerParentLayout");
            votingStickerLayout.mo88940a(height, (float) frameLayout2.getTop());
        }
        VotingStickerLayout votingStickerLayout2 = this.f110503y;
        if (votingStickerLayout2 != null) {
            votingStickerLayout2.post(new C43627g(this));
        }
    }

    /* renamed from: d */
    public final InteractStickerStruct mo88731d() {
        InteractStickerStruct a = super.mo88741a(3);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.f110491A, this.f110501b);
        hashMap.put(this.f110492B, this.f110502x);
        a.setAttr(C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(hashMap));
        a.setVoteStruct(this.f110500a);
        a.setIndex(1);
        return a;
    }

    /* renamed from: h */
    public final void mo88735h() {
        this.f110504z = false;
        Context context = this.f110242s;
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity != null) {
            JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            EditViewModel editViewModel = (EditViewModel) a;
            editViewModel.mo97033a(true, false, true);
            VideoPublishEditModel e = editViewModel.mo97035e();
            C52711k.m112240b(e, "model");
            C26890h.m65011a("poll_edit_complete", C23089d.m56640a().mo47829a("creation_id", e.creationId).mo47829a("shoot_way", e.mShootWay).mo47829a("content_type", C43434az.m95202a(e)).mo47829a("content_source", C43434az.m95207b(e)).mo47829a("enter_from", "video_edit_page").mo47829a("prop_id", this.f110501b).f61491a);
        }
    }

    /* renamed from: o */
    public final void mo88973o() {
        m95875p();
        VotingStickerLayout votingStickerLayout = this.f110503y;
        if (votingStickerLayout != null) {
            FrameLayout frameLayout = this.f110227d;
            C52711k.m112236a((Object) frameLayout, "mStickerParentLayout");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f110227d;
            C52711k.m112236a((Object) frameLayout2, "mStickerParentLayout");
            votingStickerLayout.mo88940a(height, (float) frameLayout2.getTop());
        }
        mo88755m();
        if (this.f110234k instanceof C43628c) {
            C52727e eVar = new C52727e();
            InteractStickerBaseView interactStickerBaseView = this.f110234k;
            if (interactStickerBaseView != null) {
                eVar.element = ((C43628c) interactStickerBaseView).getBaseView();
                InteractStickerBaseView interactStickerBaseView2 = this.f110234k;
                if (interactStickerBaseView2 != null) {
                    ((C43628c) interactStickerBaseView2).mo88712c();
                    C52727e eVar2 = new C52727e();
                    C43618a aVar = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
                    eVar2.element = aVar;
                    ((C43618a) eVar2.element).f110490f = ((VotingStickerView) eVar.element).getLastTouchedIndex();
                    C43618a aVar2 = (C43618a) eVar2.element;
                    InteractStickerBaseView interactStickerBaseView3 = this.f110234k;
                    C52711k.m112236a((Object) interactStickerBaseView3, "mStickerView");
                    aVar2.f110487c = C43560c.m95657b(interactStickerBaseView3.getRotateAngle());
                    C43618a aVar3 = (C43618a) eVar2.element;
                    InteractStickerBaseView interactStickerBaseView4 = this.f110234k;
                    C52711k.m112236a((Object) interactStickerBaseView4, "mStickerView");
                    View contentView = interactStickerBaseView4.getContentView();
                    C52711k.m112236a((Object) contentView, "mStickerView.contentView");
                    aVar3.f110485a = contentView.getScaleX();
                    C43618a aVar4 = (C43618a) eVar2.element;
                    InteractStickerBaseView interactStickerBaseView5 = this.f110234k;
                    C52711k.m112236a((Object) interactStickerBaseView5, "mStickerView");
                    View contentView2 = interactStickerBaseView5.getContentView();
                    C52711k.m112236a((Object) contentView2, "mStickerView.contentView");
                    aVar4.f110486b = contentView2.getScaleY();
                    C43618a aVar5 = (C43618a) eVar2.element;
                    InteractStickerBaseView interactStickerBaseView6 = this.f110234k;
                    C52711k.m112236a((Object) interactStickerBaseView6, "mStickerView");
                    View contentView3 = interactStickerBaseView6.getContentView();
                    C52711k.m112236a((Object) contentView3, "mStickerView.contentView");
                    float x = contentView3.getX();
                    FrameLayout frameLayout3 = this.f110227d;
                    C52711k.m112236a((Object) frameLayout3, "mStickerParentLayout");
                    aVar5.f110488d = x + frameLayout3.getX();
                    C43618a aVar6 = (C43618a) eVar2.element;
                    InteractStickerBaseView interactStickerBaseView7 = this.f110234k;
                    C52711k.m112236a((Object) interactStickerBaseView7, "mStickerView");
                    View contentView4 = interactStickerBaseView7.getContentView();
                    C52711k.m112236a((Object) contentView4, "mStickerView.contentView");
                    float y = contentView4.getY();
                    FrameLayout frameLayout4 = this.f110227d;
                    C52711k.m112236a((Object) frameLayout4, "mStickerParentLayout");
                    aVar6.f110489e = y + frameLayout4.getY();
                    VotingStickerLayout votingStickerLayout2 = this.f110503y;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.post(new C43624d(this, eVar, eVar2));
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
            }
        }
    }

    /* renamed from: a */
    public final InteractStickerBaseView mo88721a(Context context) {
        C52711k.m112240b(context, "context");
        C43628c cVar = new C43628c(context);
        cVar.setLockMode(true);
        cVar.setLayoutParams(new LayoutParams(-1, -1));
        return cVar;
    }

    /* renamed from: a */
    public final boolean mo88728a(InteractStickerBaseView interactStickerBaseView) {
        C52711k.m112240b(interactStickerBaseView, "view");
        if (interactStickerBaseView instanceof C43628c) {
            super.mo88728a(interactStickerBaseView);
            this.f110500a = null;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88744a(C20347c cVar) {
        super.mo88744a(cVar);
        if (cVar != null) {
            float f = (float) cVar.mo43037b().height;
            FrameLayout frameLayout = this.f110227d;
            C52711k.m112236a((Object) frameLayout, "mStickerParentLayout");
            if (f > C9432q.m18687b(frameLayout.getContext(), (float) (this.f110498H + this.f110499I))) {
                VotingStickerLayout votingStickerLayout = this.f110503y;
                if (votingStickerLayout != null) {
                    votingStickerLayout.setMaxLine(3);
                }
            } else {
                FrameLayout frameLayout2 = this.f110227d;
                C52711k.m112236a((Object) frameLayout2, "mStickerParentLayout");
                if (f > C9432q.m18687b(frameLayout2.getContext(), (float) (this.f110497G + this.f110499I))) {
                    VotingStickerLayout votingStickerLayout2 = this.f110503y;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.setMaxLine(2);
                    }
                } else {
                    FrameLayout frameLayout3 = this.f110227d;
                    C52711k.m112236a((Object) frameLayout3, "mStickerParentLayout");
                    if (f > C9432q.m18687b(frameLayout3.getContext(), (float) (this.f110496F + this.f110499I))) {
                        VotingStickerLayout votingStickerLayout3 = this.f110503y;
                        if (votingStickerLayout3 != null) {
                            votingStickerLayout3.setMaxLine(1);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo88746a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f110500a = interactStickerStruct.getVoteStruct();
            mo88727a(true);
            InteractStickerBaseView interactStickerBaseView = this.f110234k;
            if (interactStickerBaseView != null) {
                ((C43628c) interactStickerBaseView).mo88980a(this.f110500a);
                InteractStickerBaseView interactStickerBaseView2 = this.f110234k;
                C52711k.m112236a((Object) interactStickerBaseView2, "mStickerView");
                interactStickerBaseView2.setVisibility(4);
                HashMap hashMap = (HashMap) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34885a(interactStickerStruct.getAttr(), new C43626f().f49843c);
                this.f110501b = (String) hashMap.get(this.f110491A);
                if (hashMap.containsKey(this.f110492B)) {
                    this.f110502x = (String) hashMap.get(this.f110492B);
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
            }
        }
        if (this.f110234k != null) {
            this.f110234k.postDelayed(new C43625e(this, interactStickerStruct), 300);
        }
    }

    /* renamed from: a */
    public final void mo88726a(String str) {
        C52711k.m112240b(str, "stickerPath");
        if (!C9431p.m18664a(str)) {
            CharSequence charSequence = str;
            if (!C52830p.m112456b(charSequence, (CharSequence) this.f110493C, false, 2, (Object) null) || !C52830p.m112456b(charSequence, (CharSequence) this.f110494D, false, 2, (Object) null)) {
                String str2 = File.separator;
                C52711k.m112236a((Object) str2, "File.separator");
                if (C52830p.m112413c(str, str2, false, 2, null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(m95876q());
                    super.mo88726a(sb.toString());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(m95876q());
                super.mo88726a(sb2.toString());
            } else {
                super.mo88726a(new C52820l(this.f110495E).replace(charSequence, m95876q()));
            }
        }
    }
}
