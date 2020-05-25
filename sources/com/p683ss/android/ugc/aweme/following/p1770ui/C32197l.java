package com.p683ss.android.ugc.aweme.following.p1770ui;

import com.bytedance.jedi.arch.ext.list.C11861j;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.l */
final /* synthetic */ class C32197l extends C52720t {

    /* renamed from: a */
    public static final C52771j f83944a = new C32197l();

    C32197l() {
    }

    public final String getName() {
        return "hasMore";
    }

    public final C52761d getOwner() {
        return C52728w.m112246a(C11861j.class, "profile_tiktokI18nRelease");
    }

    public final String getSignature() {
        return "getHasMore(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
    }

    public final Object get(Object obj) {
        return C11861j.m24214d((RecommendUserListState) obj);
    }
}
