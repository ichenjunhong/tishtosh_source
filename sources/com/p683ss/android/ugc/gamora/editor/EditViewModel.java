package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.infoSticker.C35579at;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43449bd;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45870a;
import com.p683ss.android.ugc.aweme.utils.C47807de;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import com.p683ss.android.ugc.gamora.jedi.C49558e;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52855s;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel */
public final class EditViewModel extends BaseJediViewModel<EditState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123231d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "veEditor", "getVeEditor()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "isSaveEffect", "isSaveEffect()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "showSetting", "getShowSetting()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "isSaveMultiEdit", "isSaveMultiEdit()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "isMultiEditPanelShow", "isMultiEditPanelShow()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "isSaveAudioRecord", "isSaveAudioRecord()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "isSaveSubtitle", "isSaveSubtitle()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "enableEditPagePrompt", "getEnableEditPagePrompt()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "filterInternalDefaultIntensityGetter", "getFilterInternalDefaultIntensityGetter()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditViewModel.class), "filterIntensityStore", "getFilterIntensityStore()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    public VideoPublishEditModel f123232e;

    /* renamed from: f */
    public C43449bd f123233f;

    /* renamed from: g */
    public C35579at f123234g;

    /* renamed from: h */
    private final C52668f f123235h = C52732g.m112285a(C49025p.f123259a);

    /* renamed from: i */
    private final C52668f f123236i = C52732g.m112285a(C49016g.f123251a);

    /* renamed from: j */
    private final C52668f f123237j = C52732g.m112285a(C49023n.f123258a);

    /* renamed from: k */
    private final C52668f f123238k = C52732g.m112285a(C49017h.f123252a);

    /* renamed from: l */
    private final C52668f f123239l = C52732g.m112285a(C49014e.f123249a);

    /* renamed from: m */
    private final C52668f f123240m = C52732g.m112285a(C49015f.f123250a);

    /* renamed from: n */
    private final C52668f f123241n = C52732g.m112285a(C49018i.f123253a);

    /* renamed from: o */
    private final C52668f f123242o = C52732g.m112285a(C49011b.f123246a);

    /* renamed from: p */
    private final C52668f f123243p = C52732g.m112285a(C49013d.f123248a);

    /* renamed from: q */
    private final C52668f f123244q = C52732g.m112285a(C49012c.f123247a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$a */
    static final class C49010a extends C52712l implements C52671b<EditState, EditState> {

        /* renamed from: a */
        final /* synthetic */ int f123245a;

        C49010a(int i) {
            this.f123245a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditState editState = (EditState) obj;
            C52711k.m112240b(editState, "$receiver");
            return EditState.copy$default(editState, null, null, new C49558e(this.f123245a), null, null, null, null, 123, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$b */
    static final class C49011b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C49011b f123246a = new C49011b();

        C49011b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C39629l.m88232a().mo58583n().mo83103a(C40790a.EditPagePrompt));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$c */
    static final class C49012c extends C52712l implements C52670a<C0198r<C31405ah>> {

        /* renamed from: a */
        public static final C49012c f123247a = new C49012c();

        C49012c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$d */
    static final class C49013d extends C52712l implements C52670a<C0198r<C31406ai>> {

        /* renamed from: a */
        public static final C49013d f123248a = new C49013d();

        C49013d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$e */
    static final class C49014e extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C49014e f123249a = new C49014e();

        C49014e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$f */
    static final class C49015f extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C49015f f123250a = new C49015f();

        C49015f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$g */
    static final class C49016g extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C49016g f123251a = new C49016g();

        C49016g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$h */
    static final class C49017h extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C49017h f123252a = new C49017h();

        C49017h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$i */
    static final class C49018i extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C49018i f123253a = new C49018i();

        C49018i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$j */
    static final class C49019j extends C52712l implements C52671b<EditState, EditState> {

        /* renamed from: a */
        public static final C49019j f123254a = new C49019j();

        C49019j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditState editState = (EditState) obj;
            C52711k.m112240b(editState, "$receiver");
            return EditState.copy$default(editState, null, new C49561h(), null, null, null, null, null, 125, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$k */
    static final class C49020k extends C52712l implements C52671b<EditState, EditState> {

        /* renamed from: a */
        public static final C49020k f123255a = new C49020k();

        C49020k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditState editState = (EditState) obj;
            C52711k.m112240b(editState, "$receiver");
            return EditState.copy$default(editState, new C49561h(), null, null, null, null, null, null, 126, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$l */
    public static final class C49021l extends C52712l implements C52671b<EditState, EditState> {

        /* renamed from: a */
        final /* synthetic */ int f123256a;

        public C49021l(int i) {
            this.f123256a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditState editState = (EditState) obj;
            C52711k.m112240b(editState, "$receiver");
            return EditState.copy$default(editState, null, null, null, null, Integer.valueOf(this.f123256a), null, null, 111, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$m */
    static final class C49022m extends C52712l implements C52671b<EditState, EditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123257a;

        C49022m(boolean z) {
            this.f123257a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditState editState = (EditState) obj;
            C52711k.m112240b(editState, "$receiver");
            return EditState.copy$default(editState, null, null, null, null, null, new C49556c(this.f123257a), null, 95, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$n */
    static final class C49023n extends C52712l implements C52670a<C0198r<C52855s<? extends Boolean, ? extends Boolean, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C49023n f123258a = new C49023n();

        C49023n() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$o */
    public static final class C49024o extends C52712l implements C52671b<EditState, EditState> {
        public static final C49024o INSTANCE = new C49024o();

        C49024o() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditState editState = (EditState) obj;
            C52711k.m112240b(editState, "$receiver");
            return EditState.copy$default(editState, null, null, null, null, null, null, new C49561h(), 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$p */
    static final class C49025p extends C52712l implements C52670a<C0198r<C20347c>> {

        /* renamed from: a */
        public static final C49025p f123259a = new C49025p();

        C49025p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: I */
    public final C0198r<C31406ai> mo97027I() {
        return (C0198r) this.f123243p.getValue();
    }

    /* renamed from: J */
    public final C0198r<C31405ah> mo97028J() {
        return (C0198r) this.f123244q.getValue();
    }

    /* renamed from: h */
    public final C0198r<C20347c> mo97038h() {
        return (C0198r) this.f123235h.getValue();
    }

    /* renamed from: i */
    public final C0198r<Boolean> mo97039i() {
        return (C0198r) this.f123236i.getValue();
    }

    /* renamed from: j */
    public final C0198r<C52855s<Boolean, Boolean, Boolean>> mo97040j() {
        return (C0198r) this.f123237j.getValue();
    }

    /* renamed from: l */
    public final C0198r<Boolean> mo97042l() {
        return (C0198r) this.f123238k.getValue();
    }

    /* renamed from: m */
    public final C0198r<Boolean> mo97043m() {
        return (C0198r) this.f123239l.getValue();
    }

    /* renamed from: n */
    public final C0198r<Boolean> mo97044n() {
        return (C0198r) this.f123240m.getValue();
    }

    /* renamed from: o */
    public final C0198r<Boolean> mo97045o() {
        return (C0198r) this.f123241n.getValue();
    }

    /* renamed from: p */
    public final boolean mo97046p() {
        return ((Boolean) this.f123242o.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final void mo97041k() {
        mo22530c(C49020k.f123255a);
    }

    /* renamed from: L */
    public final boolean mo97030L() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        return videoPublishEditModel.isMultiVideoEdit();
    }

    /* renamed from: e */
    public final VideoPublishEditModel mo97035e() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: f */
    public final C43449bd mo97036f() {
        C43449bd bdVar = this.f123233f;
        if (bdVar == null) {
            C52711k.m112237a("videoSizeProvider");
        }
        return bdVar;
    }

    /* renamed from: g */
    public final C35579at mo97037g() {
        C35579at atVar = this.f123234g;
        if (atVar == null) {
            C52711k.m112237a("stickerChallengeManager");
        }
        return atVar;
    }

    /* renamed from: q */
    public final boolean mo97047q() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        return videoPublishEditModel.isStatusVideoType();
    }

    /* renamed from: y */
    public final boolean mo97054y() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        return videoPublishEditModel.isStickPointMode;
    }

    /* renamed from: z */
    public final boolean mo97055z() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        return videoPublishEditModel.isReviewVideo();
    }

    /* renamed from: D */
    public static boolean m105818D() {
        if (C39629l.m88232a().mo58583n().mo83104b(C40790a.RecommentMusicByAIPolicy) == 0 || C45870a.m99714a()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m105819E() {
        return C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableInfoSticker);
    }

    /* renamed from: s */
    public static boolean m105822s() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableTextStickerInMain)) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final int mo97026H() {
        Object value = mo97038h().getValue();
        if (value == null) {
            C52711k.m112234a();
        }
        return ((C20347c) value).mo43071k();
    }

    /* renamed from: K */
    public final boolean mo97029K() {
        int H = mo97026H();
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (H > videoPublishEditModel.mCurMusicLength) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditState editState = new EditState(null, null, null, null, null, null, null, 127, null);
        return editState;
    }

    /* renamed from: r */
    public final boolean mo97048r() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (videoPublishEditModel.videoType == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo97049t() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (!C9431p.m18664a(videoPublishEditModel.getDuetFrom())) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo97051v() {
        if (!mo97049t() || !C39629l.m88232a().mo58583n().mo83103a(C40790a.StudioDuetChangeLayout)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean mo97052w() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (videoPublishEditModel.getStitchParams() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean mo97022B() {
        if (!mo97021A() || ((!mo97049t() || mo97051v()) && !mo97050u() && !mo97053x() && !mo97025G())) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean mo97023C() {
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableRecordConversion) || mo97048r() || mo97047q()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final boolean mo97024F() {
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSubtitleRecognition) || mo97053x() || mo97048r() || mo97047q() || mo97049t() || mo97050u() || mo97052w()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0.hasOriginalSound() != false) goto L_0x001c;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97025G() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.f123232e
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            boolean r0 = r0.isFastImport
            if (r0 != 0) goto L_0x001c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.f123232e
            if (r0 != 0) goto L_0x0016
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0016:
            boolean r0 = r0.hasOriginalSound()
            if (r0 == 0) goto L_0x003b
        L_0x001c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.f123232e
            if (r0 != 0) goto L_0x0025
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0025:
            boolean r0 = r0.isMuted
            if (r0 != 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.f123232e
            if (r0 != 0) goto L_0x0032
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0032:
            boolean r0 = r0.isReviewVideo()
            if (r0 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r0 = 0
            return r0
        L_0x003b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditViewModel.mo97025G():boolean");
    }

    /* renamed from: u */
    public final boolean mo97050u() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (videoPublishEditModel.getReactionParams() != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f123232e;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("publishEditModel");
            }
            if (!C9431p.m18664a(videoPublishEditModel2.getReactionParams().reactionFromId)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final boolean mo97053x() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (!videoPublishEditModel.isMvThemeVideoType()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f123232e;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("publishEditModel");
            }
            if (!videoPublishEditModel2.isCutSameVideoType()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    private final boolean m105820M() {
        VideoPublishEditModel videoPublishEditModel = this.f123232e;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("publishEditModel");
        }
        if (videoPublishEditModel.mOrigin == 0) {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean forbidVoiceChangeOnEditPage = b.getForbidVoiceChangeOnEditPage();
            C52711k.m112236a((Object) forbidVoiceChangeOnEditPage, "SettingsReader.get().forbidVoiceChangeOnEditPage");
            if (forbidVoiceChangeOnEditPage.booleanValue()) {
                return false;
            }
        } else if ((!mo97049t() || mo97051v()) && !mo97050u() && !mo97048r() && !mo97053x() && !mo97054y()) {
            return true;
        } else {
            IESSettingsProxy b2 = C32816h.m75716b();
            C52711k.m112236a((Object) b2, "SettingsReader.get()");
            Boolean forbidVoiceChangeOnEditPage2 = b2.getForbidVoiceChangeOnEditPage();
            C52711k.m112236a((Object) forbidVoiceChangeOnEditPage2, "SettingsReader.get().forbidVoiceChangeOnEditPage");
            if (forbidVoiceChangeOnEditPage2.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public final boolean mo97021A() {
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableVoiceConversion) || !m105820M() || mo97054y() || mo97047q() || mo97052w() || (((mo97049t() && !mo97051v()) || mo97050u() || mo97048r() || mo97053x() || mo97025G() || mo97054y()) && !mo97023C())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo97031a(int i) {
        mo22530c(new C49010a(i));
    }

    /* renamed from: a */
    public final void mo97032a(boolean z) {
        mo22530c(new C49022m(z));
    }

    /* renamed from: a */
    public final boolean mo97034a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int a = C47807de.m103443a(str, false);
        if (mo97049t() || mo97050u() || mo97054y() || mo97026H() >= a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo97033a(boolean z, boolean z2, boolean z3) {
        mo97040j().setValue(new C52855s(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
    }
}
