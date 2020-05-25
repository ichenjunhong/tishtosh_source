package com.p683ss.android.ugc.aweme.detail.p1623e;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.detail.C27333f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.main.experiment.C36645a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48020g;
import com.p683ss.android.ugc.aweme.video.C48121w;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.e.a */
public final class C27332a {

    /* renamed from: a */
    public static final C27332a f72080a = new C27332a();

    private C27332a() {
    }

    /* renamed from: c */
    private static boolean m65862c(String str) {
        if (2 != C36645a.m82553a() || !TextUtils.equals(str, "from_follow_tab")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo55771a(String str) {
        if (!m65862c(str)) {
            CharSequence charSequence = str;
            if (!TextUtils.equals("poi_grid", charSequence) && !TextUtils.equals("from_nearby", charSequence) && !TextUtils.equals("from_search", charSequence) && !TextUtils.equals("from_search_similar_aweme", charSequence) && !C27333f.m65865a(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m65861b(String str) {
        if (!mo55771a(str)) {
            CharSequence charSequence = str;
            if (!TextUtils.equals("from_poi_categorized", charSequence) && !TextUtils.equals("from_search_jedi", charSequence) && !TextUtils.equals("potential_friends", charSequence) && !TextUtils.equals("from_no_request", charSequence) && !TextUtils.equals("from_commerce_seed", charSequence) && !TextUtils.equals("from_commerce_bill_share", charSequence) && !TextUtils.equals("from_anchor_video", charSequence) && !TextUtils.equals("from_profile_self", charSequence) && !TextUtils.equals("from_profile_other", charSequence) && !TextUtils.equals("from_commerce_banner", charSequence) && !TextUtils.equals("from_visual_search_result", charSequence) && !TextUtils.equals("poi_rate", charSequence) && !TextUtils.equals("poi_rate_list", charSequence) && !TextUtils.equals("poi_map", charSequence) && !TextUtils.equals("from_familiar_tab", charSequence) && !TextUtils.equals("from_channel", charSequence) && !TextUtils.equals("poi_street", charSequence) && !TextUtils.equals("from_search_commodity", charSequence) && !TextUtils.equals("from_mix_detail", charSequence) && !TextUtils.equals("from_search_live", charSequence) && !TextUtils.equals("from_follow_often_watch", charSequence)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo55770a(Aweme aweme, String str, int i, String str2, long j, boolean z, int i2) {
        if (aweme != null && m65861b(str)) {
            C30332aw awVar = new C30332aw(21, aweme);
            awVar.f79231d = str;
            awVar.f79234g = i;
            awVar.f79239l = z;
            if (C27333f.m65865a(str)) {
                C48020g N = C48121w.m104250N();
                C52711k.m112236a((Object) N, "PlayerManager.getPlayerInfoProvider()");
                awVar.f79237j = N.mo95256n();
                C48020g N2 = C48121w.m104250N();
                C52711k.m112236a((Object) N2, "PlayerManager.getPlayerInfoProvider()");
                awVar.f79238k = N2.mo95257o();
                awVar.f79232e = str2;
                awVar.f79233f = j;
            }
            awVar.f79235h = i2;
            C47718bf.m103288a(awVar);
        }
    }
}
