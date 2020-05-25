package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.text.TextUtils;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.LivePublishModel;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel */
public final class CutVideoViewModel extends BaseJediViewModel<CutVideoState> {

    /* renamed from: d */
    public C42734ad f108052d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel$a */
    static final class C42728a extends C52712l implements C52671b<CutVideoState, CutVideoState> {

        /* renamed from: a */
        public static final C42728a f108053a = new C42728a();

        C42728a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoState cutVideoState = (CutVideoState) obj;
            C52711k.m112240b(cutVideoState, "$receiver");
            return CutVideoState.copy$default(cutVideoState, null, new C49561h(), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel$b */
    static final class C42729b extends C52712l implements C52671b<CutVideoState, CutVideoState> {

        /* renamed from: a */
        public static final C42729b f108054a = new C42729b();

        C42729b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoState cutVideoState = (CutVideoState) obj;
            C52711k.m112240b(cutVideoState, "$receiver");
            return CutVideoState.copy$default(cutVideoState, new C49561h(), null, 2, null);
        }
    }

    /* renamed from: e */
    public final void mo87176e() {
        mo22530c(C42729b.f108054a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new CutVideoState(null, null, 3, null);
    }

    /* renamed from: f */
    public final C42734ad mo87177f() {
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        return adVar;
    }

    /* renamed from: o */
    public final boolean mo87186o() {
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        return adVar.f108077t;
    }

    /* renamed from: p */
    public final boolean mo87187p() {
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        return adVar.f108078u;
    }

    /* renamed from: g */
    public final boolean mo87178g() {
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        if (adVar.f108058a.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo87179h() {
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        if (!adVar.f108060c) {
            C42734ad adVar2 = this.f108052d;
            if (adVar2 == null) {
                C52711k.m112237a("cutVideoModel");
            }
            if (!adVar2.f108072o) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo87180i() {
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        if (adVar.f108067j || mo87181j()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo87182k() {
        String str = "system_upload";
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        if (C52711k.m112239a((Object) str, (Object) adVar.f108071n)) {
            return false;
        }
        return C43036f.f108637b.mo87419f();
    }

    /* renamed from: l */
    public final boolean mo87183l() {
        if (this.f108052d != null) {
            C42734ad adVar = this.f108052d;
            if (adVar == null) {
                C52711k.m112237a("cutVideoModel");
            }
            if (adVar.f108068k != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo87184m() {
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        if (adVar.f108076s != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo87181j() {
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        if (adVar.f108065h == null) {
            C42734ad adVar2 = this.f108052d;
            if (adVar2 == null) {
                C52711k.m112237a("cutVideoModel");
            }
            if (TextUtils.isEmpty(adVar2.f108064g)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public final boolean mo87185n() {
        Integer num;
        C42734ad adVar = this.f108052d;
        if (adVar == null) {
            C52711k.m112237a("cutVideoModel");
        }
        if (adVar.f108076s != null) {
            C42734ad adVar2 = this.f108052d;
            if (adVar2 == null) {
                C52711k.m112237a("cutVideoModel");
            }
            LivePublishModel livePublishModel = adVar2.f108076s;
            if (livePublishModel != null) {
                num = livePublishModel.getType();
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo87175a(C42734ad adVar) {
        C52711k.m112240b(adVar, "<set-?>");
        this.f108052d = adVar;
    }
}
