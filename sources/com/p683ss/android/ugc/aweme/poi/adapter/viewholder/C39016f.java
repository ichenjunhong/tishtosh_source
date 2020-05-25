package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31804o;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.f */
public final class C39016f extends C31804o {

    /* renamed from: aA */
    public final C31755b f99429aA;

    /* renamed from: aB */
    public final C31848j f99430aB;

    /* renamed from: aC */
    public final C31754a f99431aC;

    /* renamed from: aD */
    private final int f99432aD;

    /* renamed from: aE */
    private final String f99433aE;

    /* renamed from: ay */
    public final FollowFeedLayout f99434ay;

    /* renamed from: az */
    public final C39067g f99435az;

    /* renamed from: V */
    public final int mo64837V() {
        return 10;
    }

    /* renamed from: X */
    public final void mo64839X() {
        mo64834S();
    }

    /* renamed from: a */
    public final void mo64840a(boolean z) {
    }

    /* renamed from: R */
    public final boolean mo64833R() {
        return super.mo64833R();
    }

    /* renamed from: W */
    public final String mo64838W() {
        if (this.f99432aD != 1) {
            return "from_poi_detail";
        }
        return "poi_rate";
    }

    /* renamed from: S */
    public final void mo64834S() {
        String str;
        CharSequence charSequence;
        if (this.f83048c != null) {
            C23794bh.m58392f().mo65001b(this.f83048c, mo64771c());
            mo64840a(true);
            C31213v.m72896a(this.f83052g.mo64671c(this.f83048c));
            Bundle bundle = new Bundle();
            Aweme aweme = this.f83048c;
            C52711k.m112236a((Object) aweme, "mAweme");
            bundle.putString("id", aweme.getAid());
            bundle.putString("refer", mo64771c());
            bundle.putString("video_from", mo64838W());
            Aweme aweme2 = this.f83048c;
            C52711k.m112236a((Object) aweme2, "mAweme");
            bundle.putInt("profile_enterprise_type", aweme2.getEnterpriseType());
            bundle.putInt("page_type", mo64837V());
            String str2 = "poi_id";
            C39067g gVar = this.f99435az;
            String str3 = null;
            if (gVar != null) {
                str = gVar.getPoiId();
            } else {
                str = null;
            }
            bundle.putString(str2, str);
            bundle.putString("previous_page", "poi_page");
            if (mo64835T() != null) {
                bundle.putString("userid", mo64835T());
            }
            C39067g gVar2 = this.f99435az;
            if (gVar2 != null) {
                charSequence = gVar2.getAwemeId();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                String str4 = "related_gid";
                C39067g gVar3 = this.f99435az;
                if (gVar3 != null) {
                    str3 = gVar3.getAwemeId();
                }
                bundle.putString(str4, str3);
            }
            if (!TextUtils.isEmpty(this.f99433aE)) {
                bundle.putString("poi_tab_type", this.f99433aE);
            }
            C39460p.m87759a(mo64749N(), bundle, (View) this.f83093av);
        }
    }

    public C39016f(FollowFeedLayout followFeedLayout, C39067g gVar, C31755b bVar, C31848j jVar, C31754a aVar, int i, String str) {
        C52711k.m112240b(followFeedLayout, "view");
        C52711k.m112240b(bVar, "provider");
        C52711k.m112240b(jVar, "scrollStateManager");
        C52711k.m112240b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        this.f99434ay = followFeedLayout;
        this.f99435az = gVar;
        this.f99429aA = bVar;
        this.f99430aB = jVar;
        this.f99431aC = aVar;
        this.f99432aD = i;
        this.f99433aE = str;
    }
}
