package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.os.Bundle;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.p683ss.android.ugc.aweme.poi.model.C39125i;
import com.p683ss.android.ugc.aweme.poi.model.C39140x;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38956a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.t */
public final class C39408t extends AbsPoiAwemeFeedFragment {

    /* renamed from: y */
    private C38956a f100795y;

    /* renamed from: z */
    private String f100796z = "";

    /* renamed from: a */
    public final boolean mo80023a(PoiDetail poiDetail) {
        return false;
    }

    /* renamed from: h */
    public final int mo80029h() {
        return R.layout.bms;
    }

    /* renamed from: i */
    public final int mo80030i() {
        return 65440;
    }

    /* renamed from: r */
    public final C39384j mo80041r() {
        if (this.f100276b == null) {
            this.f100276b = new C39433v(this);
        }
        return this.f100276b;
    }

    /* renamed from: y */
    public final C39140x mo80043y() {
        return new C39125i(mo80030i());
    }

    /* renamed from: s */
    public final C39387k mo80042s() {
        if (this.f100275a == null) {
            this.f100275a = new C39434w(this.f100795y, this.f100796z);
        }
        return this.f100275a;
    }

    /* renamed from: t */
    public final void mo63439t() {
        if (getUserVisibleHint() && this.f80579p == -1) {
            this.f80579p = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public final void mo63440u() {
        if (getUserVisibleHint() && this.f80579p != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f80579p;
            if (currentTimeMillis > 0) {
                C18842a.m45932a(new C39409u(this, currentTimeMillis));
            }
            this.f80579p = -1;
        }
    }

    /* renamed from: a */
    public final void mo63436a(Bundle bundle) {
        super.mo63436a(bundle);
        if (bundle != null) {
            this.f100795y = (C38956a) bundle.getSerializable("EXTRA_POI_AWEME_POSITION");
            this.f100796z = bundle.getString("aweme_id", "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo80381c(long j) {
        C26890h.m65004a(getContext(), "stay_time", this.f80580q, j, 0);
        mo63435a(j);
    }

    /* renamed from: a */
    public final void mo63435a(long j) {
        new C23213as().mo48005a(String.valueOf(j)).mo48006b(this.f80580q).mo48010e(this.f100280j).mo48008d("poi_video").mo48076e();
    }
}
