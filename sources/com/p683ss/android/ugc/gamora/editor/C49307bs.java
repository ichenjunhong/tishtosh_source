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
import android.view.View;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.p683ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p683ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2341c.C46669a;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2341c.C46670b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46678b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2344b.C46745a;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001a.C0013i;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
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
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.gamora.editor.bs */
public final class C49307bs extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f123820i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49307bs.class), "stickerController", "getStickerController()Lcom/ss/android/ugc/aweme/story/shootvideo/textfont/TextStickerController;"))};

    /* renamed from: r */
    public static final C49308a f123821r = new C49308a(null);

    /* renamed from: j */
    public C49527v f123822j;

    /* renamed from: k */
    public TextStickerInputLayout f123823k;

    /* renamed from: l */
    public EditViewModel f123824l;

    /* renamed from: m */
    public EditPoiStickerViewModel f123825m;

    /* renamed from: n */
    public EditInfoStickerViewModel f123826n;

    /* renamed from: o */
    public ToolSafeHandler f123827o;

    /* renamed from: p */
    public FrameLayout f123828p;

    /* renamed from: q */
    View f123829q;

    /* renamed from: s */
    private VEVideoPublishEditViewModel f123830s;

    /* renamed from: t */
    private VideoPublishEditModel f123831t;

    /* renamed from: u */
    private EditVoteStickerViewModel f123832u;

    /* renamed from: v */
    private EditTextStickerViewModel f123833v;

    /* renamed from: w */
    private Runnable f123834w;

    /* renamed from: x */
    private final C52668f f123835x = C52732g.m112285a(C49319j.f123849a);

    /* renamed from: y */
    private boolean f123836y;

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$a */
    public static final class C49308a {
        private C49308a() {
        }

        public /* synthetic */ C49308a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$b */
    public static final class C49309b implements C46670b {

        /* renamed from: a */
        final /* synthetic */ C49307bs f123837a;

        /* renamed from: a */
        public final void mo93593a() {
            C49307bs.m106358a(this.f123837a).mo97033a(false, false, false);
            this.f123837a.mo97275a(false);
        }

        public final void dismiss() {
            C49307bs.m106358a(this.f123837a).mo97033a(true, false, true);
            this.f123837a.mo97266H();
        }

        C49309b(C49307bs bsVar) {
            this.f123837a = bsVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$c */
    static final class C49310c implements C46669a {

        /* renamed from: a */
        final /* synthetic */ C49307bs f123838a;

        C49310c(C49307bs bsVar) {
            this.f123838a = bsVar;
        }

        /* renamed from: a */
        public final void mo93592a(boolean z) {
            EditInfoStickerViewModel editInfoStickerViewModel = this.f123838a.f123826n;
            if (editInfoStickerViewModel == null) {
                C52711k.m112237a("infoStickerViewModel");
            }
            editInfoStickerViewModel.mo96855e();
            EditPoiStickerViewModel editPoiStickerViewModel = this.f123838a.f123825m;
            if (editPoiStickerViewModel == null) {
                C52711k.m112237a("poiStickerViewModel");
            }
            editPoiStickerViewModel.mo96910e();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$d */
    public static final class C49311d implements C46745a {

        /* renamed from: a */
        final /* synthetic */ C49307bs f123839a;

        C49311d(C49307bs bsVar) {
            this.f123839a = bsVar;
        }

        /* renamed from: a */
        public final void mo90861a(String str) {
            C52711k.m112240b(str, "alignStr");
            C26890h.m65011a("select_text_paragraph", this.f123839a.mo97267I().mo47829a("paragraph_style", str).f61491a);
        }

        /* renamed from: a */
        public final void mo90858a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(i));
            C26890h.m65011a("select_text_color", this.f123839a.mo97267I().mo47829a("color", sb.toString()).mo47826a("is_subtitle", 0).f61491a);
        }

        /* renamed from: b */
        public final void mo90862b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            C26890h.m65011a("select_text_style", this.f123839a.mo97267I().mo47829a("text_style", sb.toString()).mo47826a("is_subtitle", 0).f61491a);
        }

        /* renamed from: a */
        public final void mo90859a(C46678b bVar) {
            C52711k.m112240b(bVar, "type");
            C26890h.m65011a("select_text_font", this.f123839a.mo97267I().mo47829a("font", bVar.f117744b).mo47826a("is_subtitle", 0).f61491a);
        }

        /* renamed from: a */
        public final void mo90860a(TextStickerTextWrap textStickerTextWrap) {
            boolean z;
            C52711k.m112240b(textStickerTextWrap, "wrap");
            String str = (String) textStickerTextWrap.getStrPair().getFirst();
            if (str != null) {
                if (C52830p.m112447b(str).toString().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !((Collection) textStickerTextWrap.getStrPair().getSecond()).isEmpty();
                C23089d I = this.f123839a.mo97267I();
                if (z) {
                    I.mo47829a("text_added", "1");
                    if (z2) {
                        I.mo47829a("anchor_added", "1");
                        I.mo47829a("anchor_type", "wiki");
                    }
                }
                C26890h.m65011a("text_complete", I.f61491a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$e */
    static final class C49312e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49307bs f123840a;

        C49312e(C49307bs bsVar) {
            this.f123840a = bsVar;
        }

        public final void run() {
            C49527v vVar = this.f123840a.f123822j;
            if (vVar == null) {
                C52711k.m112237a("gestureListenerManager");
            }
            vVar.mo97460f(this.f123840a.mo97264F().f117790k);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$f */
    static final class C49313f extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49307bs f123841a;

        C49313f(C49307bs bsVar) {
            this.f123841a = bsVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f123841a.mo97269K();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$g */
    static final class C49314g<T> implements C0199s<C52847n<? extends Float, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C49307bs f123842a;

        C49314g(C49307bs bsVar) {
            this.f123842a = bsVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                this.f123842a.mo97264F().mo93644a(((Number) nVar.getFirst()).floatValue(), ((Boolean) nVar.getSecond()).booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$h */
    public static final class C49315h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49307bs f123843a;

        /* renamed from: b */
        private int f123844b = -1;

        /* renamed from: c */
        private Runnable f123845c = new C49316a(this);

        /* renamed from: com.ss.android.ugc.gamora.editor.bs$h$a */
        static final class C49316a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C49315h f123846a;

            C49316a(C49315h hVar) {
                this.f123846a = hVar;
            }

            public final void run() {
                if (VERSION.SDK_INT < 19) {
                    C49307bs.m106359b(this.f123846a.f123843a).postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C49316a f123847a;

                        {
                            this.f123847a = r1;
                        }

                        public final void run() {
                            FrameLayout frameLayout = this.f123847a.f123846a.f123843a.f123828p;
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
            if (this.f123845c != null) {
                Runnable runnable = this.f123845c;
                if (runnable != null) {
                    runnable.run();
                }
                this.f123845c = null;
            }
            C49307bs.m106359b(this.f123843a).postDelayed(this, 16);
            C20347c cVar = (C20347c) C49307bs.m106358a(this.f123843a).mo97038h().getValue();
            if (cVar != null && this.f123843a.mo97268J()) {
                int l = cVar.mo43073l();
                if (l != this.f123844b) {
                    this.f123844b = l;
                    this.f123843a.mo97264F().mo93645a((long) l);
                }
            }
        }

        C49315h(C49307bs bsVar) {
            this.f123843a = bsVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$i */
    static final class C49318i<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49307bs f123848a;

        C49318i(C49307bs bsVar) {
            this.f123848a = bsVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            TextStickerViewModel i = this.f123848a.mo97264F().mo93666i();
            if (bool == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) bool, "it!!");
            i.mo93612a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bs$j */
    static final class C49319j extends C52712l implements C52670a<C46688i> {

        /* renamed from: a */
        public static final C49319j f123849a = new C49319j();

        C49319j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46688i();
        }
    }

    /* renamed from: F */
    public final C46688i mo97264F() {
        return (C46688i) this.f123835x.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo97275a(boolean z) {
        View view = this.f123829q;
        if (view != null && view.getVisibility() == 0) {
            View view2 = this.f123829q;
            if (view2 != null) {
                view2.setVisibility(8);
            }
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

    /* renamed from: J */
    public final boolean mo97268J() {
        return mo97264F().mo93665h();
    }

    /* renamed from: K */
    public final boolean mo97269K() {
        return mo97264F().mo93660d();
    }

    /* renamed from: L */
    public final List<C46757l> mo97270L() {
        List<C46757l> j = mo97264F().mo93667j();
        C52711k.m112236a((Object) j, "stickerController.textStickerList");
        return j;
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        if (this.f123824l == null) {
            C52711k.m112237a("editViewModel");
        }
        if (EditViewModel.m105822s()) {
            ToolSafeHandler toolSafeHandler = this.f123827o;
            if (toolSafeHandler == null) {
                C52711k.m112237a("safeHandler");
            }
            Runnable runnable = this.f123834w;
            if (runnable == null) {
                C52711k.m112237a("mNonInfoStickerPlayingRefreshTask");
            }
            toolSafeHandler.removeCallbacks(runnable);
        }
    }

    /* renamed from: H */
    public final void mo97266H() {
        if (!mo97264F().mo93665h()) {
            View view = this.f123829q;
            if (view != null && view.getVisibility() == 8) {
                View view2 = this.f123829q;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                return;
            }
        }
        View view3 = this.f123829q;
        if (view3 != null && view3.getVisibility() == 0) {
            View view4 = this.f123829q;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        mo97264F().mo93664g();
        if (this.f123824l == null) {
            C52711k.m112237a("editViewModel");
        }
        if (EditViewModel.m105822s()) {
            ToolSafeHandler toolSafeHandler = this.f123827o;
            if (toolSafeHandler == null) {
                C52711k.m112237a("safeHandler");
            }
            Runnable runnable = this.f123834w;
            if (runnable == null) {
                C52711k.m112237a("mNonInfoStickerPlayingRefreshTask");
            }
            toolSafeHandler.post(runnable);
        }
    }

    /* renamed from: I */
    public final C23089d mo97267I() {
        C23089d a = C23089d.m56640a();
        String str = "creation_id";
        VideoPublishEditModel videoPublishEditModel = this.f123831t;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        C23089d a2 = a.mo47829a(str, videoPublishEditModel.creationId);
        String str2 = "shoot_way";
        VideoPublishEditModel videoPublishEditModel2 = this.f123831t;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("publishEditModel");
        }
        C23089d a3 = a2.mo47829a(str2, videoPublishEditModel2.mShootWay);
        String str3 = "content_type";
        VideoPublishEditModel videoPublishEditModel3 = this.f123831t;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("publishEditModel");
        }
        C23089d a4 = a3.mo47829a(str3, C43434az.m95202a(videoPublishEditModel3));
        String str4 = "content_source";
        VideoPublishEditModel videoPublishEditModel4 = this.f123831t;
        if (videoPublishEditModel4 == null) {
            C52711k.m112237a("publishEditModel");
        }
        C23089d a5 = a4.mo47829a(str4, C43434az.m95207b(videoPublishEditModel4)).mo47829a("enter_from", "video_edit_page");
        C52711k.m112236a((Object) a5, "EventMapBuilder.newBuild…ob.Label.VIDEO_EDIT_PAGE)");
        return a5;
    }

    /* renamed from: M */
    public final String mo97271M() {
        StringBuilder sb = new StringBuilder();
        List L = mo97270L();
        int size = L.size();
        for (int i = 0; i < size; i++) {
            ((C46757l) L.get(i)).mo93926h();
            TextStickerData data = ((C46757l) L.get(i)).getData();
            if (data != null) {
                String[] textStrAry = data.getTextStrAry();
                if (textStrAry != null) {
                    for (String append : textStrAry) {
                        sb.append(append);
                    }
                }
            }
            if (i != L.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: N */
    public final List<InteractStickerStruct> mo97272N() {
        boolean z;
        if (!this.f123836y) {
            return C52575l.m112097a();
        }
        VideoPublishEditModel videoPublishEditModel = this.f123831t;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null) {
            List<StickerItemModel> list = infoStickerModel.stickers;
            if (list != null) {
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    list = null;
                }
                if (list != null) {
                    List<InteractStickerStruct> a = mo97264F().mo93642a(list);
                    C52711k.m112236a((Object) a, "stickerController.getInteractStickerStructList(it)");
                    return a;
                }
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: G */
    public final void mo97265G() {
        boolean z = !mo97268J();
        boolean z2 = false;
        VideoPublishEditModel videoPublishEditModel = this.f123831t;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null) {
            List<StickerItemModel> list = infoStickerModel.stickers;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    StickerItemModel stickerItemModel = (StickerItemModel) it.next();
                    if (stickerItemModel.type == 2) {
                        if (z) {
                            if (!z2) {
                                EditViewModel editViewModel = this.f123824l;
                                if (editViewModel == null) {
                                    C52711k.m112237a("editViewModel");
                                }
                                Object value = editViewModel.mo97038h().getValue();
                                if (value == null) {
                                    C52711k.m112234a();
                                }
                                mo97274a((C20347c) value);
                                z2 = true;
                            }
                            TextStickerData textStickerData = (TextStickerData) C39629l.m88232a().mo58566D().mo34884a(stickerItemModel.extra, TextStickerData.class);
                            if (C46717e.m101405b(textStickerData.getTextStrAry()) && !textStickerData.getTextWrap().isValid()) {
                                textStickerData.setTextWrap(C46717e.m101395a(textStickerData.getTextStrAry()));
                            }
                            if (textStickerData != null) {
                                mo97264F().mo93650a(textStickerData, true);
                            }
                        }
                        it.remove();
                    }
                }
            }
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f123831t;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (!videoPublishEditModel2.mIsFromDraft) {
            VideoPublishEditModel videoPublishEditModel3 = this.f123831t;
            if (videoPublishEditModel3 == null) {
                C52711k.m112237a("publishEditModel");
            }
            StatusCreateVideoData statusCreateVideoData = videoPublishEditModel3.statusCreateVideoData;
            if (statusCreateVideoData != null) {
                statusCreateVideoData.setTemplateText(mo97271M());
            }
        }
    }

    /* renamed from: a */
    public final void mo97274a(C20347c cVar) {
        mo97264F().mo93647a(cVar);
    }

    /* renamed from: b */
    public final void mo97276b(boolean z) {
        mo97264F().mo93655a(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m106358a(C49307bs bsVar) {
        EditViewModel editViewModel = bsVar.f123824l;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ ToolSafeHandler m106359b(C49307bs bsVar) {
        ToolSafeHandler toolSafeHandler = bsVar.f123827o;
        if (toolSafeHandler == null) {
            C52711k.m112237a("safeHandler");
        }
        return toolSafeHandler;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f123830s = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditTextStickerViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f123833v = (EditTextStickerViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditPoiStickerViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f123825m = (EditPoiStickerViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditVoteStickerViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                        this.f123832u = (EditVoteStickerViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditInfoStickerViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
                            this.f123826n = (EditInfoStickerViewModel) a5;
                            mo97265G();
                            EditTextStickerViewModel editTextStickerViewModel = this.f123833v;
                            if (editTextStickerViewModel == null) {
                                C52711k.m112237a("textStickerViewModel");
                            }
                            mo49444c(editTextStickerViewModel, C49320bt.f123850a, new C11934u(), new C49313f(this));
                            EditTextStickerViewModel editTextStickerViewModel2 = this.f123833v;
                            if (editTextStickerViewModel2 == null) {
                                C52711k.m112237a("textStickerViewModel");
                            }
                            C0184k kVar = this;
                            editTextStickerViewModel2.mo96978f().observe(kVar, new C49314g(this));
                            mo97264F().mo93649a((C46670b) new C49309b(this));
                            mo97264F().f117787h = new C49310c(this);
                            mo97264F().mo93652a((C46745a) new C49311d(this));
                            mo97264F().f117803x = new C49312e(this);
                            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123830s;
                            if (vEVideoPublishEditViewModel == null) {
                                C52711k.m112237a("publishEditViewModel");
                            }
                            vEVideoPublishEditViewModel.mo110473r().observe(kVar, new C49318i(this));
                            TextStickerViewModel i = mo97264F().mo93666i();
                            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f123830s;
                            if (vEVideoPublishEditViewModel2 == null) {
                                C52711k.m112237a("publishEditViewModel");
                            }
                            C0198r<Boolean> r = vEVideoPublishEditViewModel2.mo110473r();
                            C52711k.m112236a((Object) r, "publishEditViewModel.inTimeEditView");
                            C52711k.m112240b(r, "liveData");
                            i.f117741d = r;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                this.f123827o = new ToolSafeHandler((FragmentActivity) activity6);
                                this.f123834w = new C49315h(this);
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
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo24387a(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r8 = "inflater"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r8)
            java.lang.String r6 = "container"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r6)
            android.app.Activity r6 = r5.f33840g_
            if (r6 == 0) goto L_0x0127
            android.support.v4.app.FragmentActivity r6 = (android.support.p030v4.app.FragmentActivity) r6
            com.ss.android.ugc.gamora.b.c r6 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r6)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditViewModel> r8 = com.p683ss.android.ugc.gamora.editor.EditViewModel.class
            com.bytedance.jedi.arch.JediViewModel r6 = r6.mo96760a(r8)
            java.lang.String r8 = "JediViewModelProviders.o…ditViewModel::class.java]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            com.ss.android.ugc.gamora.editor.EditViewModel r6 = (com.p683ss.android.ugc.gamora.editor.EditViewModel) r6
            r5.f123824l = r6
            com.ss.android.ugc.gamora.editor.EditViewModel r6 = r5.f123824l
            if (r6 != 0) goto L_0x002c
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x002c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r6.mo97035e()
            r5.f123831t = r6
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r5.f123828p = r7
            android.widget.FrameLayout r6 = r5.f123828p
            if (r6 != 0) goto L_0x003f
            java.lang.String r8 = "parentLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x003f:
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r8 = r5.mo97264F()
            android.app.Activity r0 = r5.f33840g_
            if (r0 == 0) goto L_0x011f
            android.support.v7.app.AppCompatActivity r0 = (android.support.p043v7.app.AppCompatActivity) r0
            r8.f117780a = r0
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r8 = r5.mo97264F()
            r0 = 1
            r8.f117797r = r0
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r8 = r5.mo97264F()
            r8.f117782c = r6
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r8 = r5.mo97264F()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L_0x0117
            android.view.View r6 = (android.view.View) r6
            r8.f117783d = r6
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r6 = r5.mo97264F()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r5.f123831t
            if (r8 != 0) goto L_0x0073
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0073:
            r6.mo93648a(r8)
            com.ss.android.ugc.gamora.editor.v r6 = r5.f123822j
            if (r6 != 0) goto L_0x007f
            java.lang.String r8 = "gestureListenerManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x007f:
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r8 = r5.mo97264F()
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i$b r8 = r8.f117790k
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b r8 = (com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b) r8
            r6.mo97457c(r8)
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r6 = r5.mo97264F()
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r8 = r5.f123823k
            if (r8 != 0) goto L_0x0097
            java.lang.String r1 = "textStickerInputLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0097:
            r6.mo93651a(r8)
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r6 = r5.mo97264F()
            r6.mo93662e()
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r6 = r5.mo97264F()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r5.f123831t
            if (r8 != 0) goto L_0x00ae
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00ae:
            java.lang.String r8 = r8.mShootWay
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f123831t
            if (r1 != 0) goto L_0x00b9
            java.lang.String r2 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00b9:
            java.lang.String r1 = r1.creationId
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r5.f123824l
            if (r2 != 0) goto L_0x00c4
            java.lang.String r3 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00c4:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r2.f123232e
            if (r3 != 0) goto L_0x00cd
            java.lang.String r4 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00cd:
            boolean r3 = r3.mFromCut
            if (r3 != 0) goto L_0x00e1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r2.f123232e
            if (r2 != 0) goto L_0x00da
            java.lang.String r3 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00da:
            boolean r2 = r2.mFromMultiCut
            if (r2 == 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r2 = 0
            goto L_0x00e2
        L_0x00e1:
            r2 = 1
        L_0x00e2:
            com.ss.android.ugc.gamora.editor.EditViewModel r3 = r5.f123824l
            if (r3 != 0) goto L_0x00eb
            java.lang.String r4 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00eb:
            boolean r3 = r3.mo97048r()
            r6.mo93654a(r8, r1, r2, r3)
            com.ss.android.ugc.aweme.story.shootvideo.textfont.i r6 = r5.mo97264F()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r5.f123831t
            if (r8 != 0) goto L_0x00ff
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00ff:
            android.app.Activity r1 = r5.f33840g_
            android.content.Context r1 = (android.content.Context) r1
            r2 = 0
            android.graphics.Rect r8 = r8.getLiveWaterMarkRect(r1, r2)
            r6.mo93646a(r8)
            r5.f123836y = r0
            android.view.View r6 = new android.view.View
            android.content.Context r7 = r7.getContext()
            r6.<init>(r7)
            return r6
        L_0x0117:
            d.u r6 = new d.u
            java.lang.String r7 = "null cannot be cast to non-null type android.view.View"
            r6.<init>(r7)
            throw r6
        L_0x011f:
            d.u r6 = new d.u
            java.lang.String r7 = "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity"
            r6.<init>(r7)
            throw r6
        L_0x0127:
            d.u r6 = new d.u
            java.lang.String r7 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49307bs.mo24387a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
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
    public final C0013i<List<TextStickerCompileResult>> mo97273a(String str, int i, int i2, int i3, int i4) {
        C52711k.m112240b(str, "draftDir");
        C0013i<List<TextStickerCompileResult>> a = mo97264F().mo93641a(str, i, i2, i3, i4);
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
