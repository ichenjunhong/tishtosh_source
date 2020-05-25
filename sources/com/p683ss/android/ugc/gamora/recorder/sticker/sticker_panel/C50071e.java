package com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.group.C12896b;
import com.bytedance.ui_component.C13362b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.p2486a.C50066b;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.e */
public final class C50071e extends C13362b<RecordStickerPanelViewModel> implements C12356a {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f125418d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50071e.class), "stickerPanelScene", "getStickerPanelScene()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_panel/IStickerPanelScene;"))};

    /* renamed from: e */
    private final AppCompatActivity f125419e = ((AppCompatActivity) mo23370j().mo23373a(AppCompatActivity.class, (String) null));

    /* renamed from: f */
    private final C50048n f125420f = ((C50048n) mo23370j().mo23373a(C50048n.class, (String) null));

    /* renamed from: g */
    private final ShortVideoContext f125421g = ((ShortVideoContext) mo23370j().mo23373a(ShortVideoContext.class, (String) null));

    /* renamed from: h */
    private final C52668f f125422h = C52732g.m112285a(new C50075d(this));

    /* renamed from: i */
    private final C52670a<RecordStickerPanelViewModel> f125423i = C50076e.f125431a;

    /* renamed from: j */
    private final C12361b f125424j;

    /* renamed from: k */
    private final C12896b f125425k;

    /* renamed from: l */
    private final int f125426l;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.e$a */
    static final class C50072a<T> implements C2767k<Effect> {

        /* renamed from: a */
        final /* synthetic */ C50071e f125427a;

        C50072a(C50071e eVar) {
            this.f125427a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f125427a.mo97848q().mo97841a((Effect) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.e$b */
    static final class C50073b<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C50071e f125428a;

        C50073b(C50071e eVar) {
            this.f125428a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            this.f125428a.mo97848q().ct_();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.e$c */
    static final class C50074c<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C50071e f125429a;

        C50074c(C50071e eVar) {
            this.f125429a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            RecordStickerPanelViewModel recordStickerPanelViewModel = (RecordStickerPanelViewModel) this.f125429a.mo24975l();
            C52711k.m112236a((Object) bool, "show");
            recordStickerPanelViewModel.mo97832a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.e$d */
    static final class C50075d extends C52712l implements C52670a<C50068b> {

        /* renamed from: a */
        final /* synthetic */ C50071e f125430a;

        C50075d(C50071e eVar) {
            this.f125430a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C50069c cVar = (C50069c) this.f125430a.mo23370j().mo23375b(C50069c.class, (String) null);
            if (cVar == null) {
                cVar = new C50066b(this.f125430a.mo23370j());
            }
            return cVar.mo97846a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.e$e */
    static final class C50076e extends C52712l implements C52670a<RecordStickerPanelViewModel> {

        /* renamed from: a */
        public static final C50076e f125431a = new C50076e();

        C50076e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new RecordStickerPanelViewModel();
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f125424j;
    }

    /* renamed from: k */
    public final C12896b mo24974k() {
        return this.f125425k;
    }

    /* renamed from: m */
    public final C52670a<RecordStickerPanelViewModel> mo24976m() {
        return this.f125423i;
    }

    /* renamed from: q */
    public final C50068b mo97848q() {
        return (C50068b) this.f125422h.getValue();
    }

    /* renamed from: p */
    public final void mo24979p() {
        mo97848q().cs_();
    }

    public final void bO_() {
        super.bO_();
        mo24974k().mo24389a(this.f125426l, mo97848q().mo97840a(), "RecordStickerPanelScene");
        C0184k kVar = this;
        this.f125420f.mo97818r().mo7349a(kVar, new C50072a(this));
        this.f125420f.mo97819s().mo7349a(kVar, new C50073b(this));
        this.f125420f.mo97817q().mo7349a(kVar, new C50074c(this));
        mo97848q().mo97842a(this.f125420f);
    }

    /* renamed from: o */
    public final void mo24978o() {
        boolean z;
        if (VERSION.SDK_INT >= 18) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C50275d.m108538b((Context) this.f125419e, (int) R.string.cq1).mo98174a();
            return;
        }
        C47702b.f120193a.mo94984a("click_prop_entrance", C23089d.m56640a().mo47829a("creation_id", this.f125421g.f107131x).mo47829a("shoot_way", this.f125421g.f107132y).mo47826a("draft_id", this.f125421g.f107022A).mo47829a("enter_from", "video_shoot_page").mo47829a("content_type", this.f125421g.mo86370k().getContentType()).mo47829a("content_source", this.f125421g.mo86370k().getContentSource()).f61491a);
        mo97848q().cr_();
    }

    public C50071e(C12361b bVar, C12896b bVar2, int i) {
        C52711k.m112240b(bVar, "diContainer");
        C52711k.m112240b(bVar2, "parentScene");
        this.f125424j = bVar;
        this.f125425k = bVar2;
        this.f125426l = i;
    }
}
