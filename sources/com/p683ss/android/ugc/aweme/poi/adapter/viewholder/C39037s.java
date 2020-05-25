package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.s */
public final class C39037s extends C31805p {

    /* renamed from: aT */
    public final FollowFeedLayout f99516aT;

    /* renamed from: aU */
    public final C39067g f99517aU;

    /* renamed from: aV */
    public final C31755b f99518aV;

    /* renamed from: aW */
    public final C31848j f99519aW;

    /* renamed from: aX */
    public final C31754a f99520aX;

    /* renamed from: aY */
    private final int f99521aY;

    /* renamed from: aZ */
    private final String f99522aZ;

    /* renamed from: ab */
    public final int mo64845ab() {
        return 10;
    }

    /* renamed from: ae */
    public final void mo64847ae() {
        mo64841Y();
    }

    /* renamed from: c */
    public final void mo64848c(boolean z) {
    }

    /* renamed from: X */
    public final boolean mo64839X() {
        return super.mo64839X();
    }

    /* renamed from: ad */
    public final String mo64846ad() {
        if (this.f99521aY != 1) {
            return "from_poi_detail";
        }
        return "poi_rate";
    }

    /* renamed from: Y */
    public final void mo64841Y() {
        String str;
        CharSequence charSequence;
        String str2;
        super.mo64841Y();
        Bundle bundle = new Bundle();
        Aweme aweme = this.f83048c;
        C52711k.m112236a((Object) aweme, "mAweme");
        bundle.putString("id", aweme.getAid());
        bundle.putString("refer", mo64771c());
        bundle.putString("video_from", mo64846ad());
        Aweme aweme2 = this.f83048c;
        C52711k.m112236a((Object) aweme2, "mAweme");
        bundle.putInt("profile_enterprise_type", aweme2.getEnterpriseType());
        bundle.putInt("page_type", mo64845ab());
        String str3 = "poi_id";
        C39067g gVar = this.f99517aU;
        String str4 = null;
        if (gVar != null) {
            str = gVar.getPoiId();
        } else {
            str = null;
        }
        bundle.putString(str3, str);
        bundle.putString("previous_page", "poi_page");
        if (mo64842Z() != null) {
            bundle.putString("userid", mo64842Z());
        }
        C39067g gVar2 = this.f99517aU;
        if (gVar2 != null) {
            charSequence = gVar2.getAwemeId();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            String str5 = "related_gid";
            C39067g gVar3 = this.f99517aU;
            if (gVar3 != null) {
                str2 = gVar3.getAwemeId();
            } else {
                str2 = null;
            }
            bundle.putString(str5, str2);
        }
        if (!TextUtils.isEmpty(this.f99522aZ)) {
            bundle.putString("poi_tab_type", this.f99522aZ);
        }
        String str6 = "page_poi_id";
        C39067g gVar4 = this.f99517aU;
        if (gVar4 != null) {
            str4 = gVar4.getPoiId();
        }
        bundle.putString(str6, str4);
        C39460p.m87759a(mo64749N(), bundle, (View) this.f83120av);
    }

    public C39037s(FollowFeedLayout followFeedLayout, C39067g gVar, C31755b bVar, C31848j jVar, C31754a aVar, int i, String str) {
        C52711k.m112240b(followFeedLayout, "view");
        C52711k.m112240b(bVar, "provider");
        C52711k.m112240b(jVar, "scrollStateManager");
        C52711k.m112240b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        this.f99516aT = followFeedLayout;
        this.f99517aU = gVar;
        this.f99518aV = bVar;
        this.f99519aW = jVar;
        this.f99520aX = aVar;
        this.f99521aY = i;
        this.f99522aZ = str;
    }
}
