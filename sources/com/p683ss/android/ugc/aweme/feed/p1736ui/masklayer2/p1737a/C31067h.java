package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.feed.helper.C30368h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30349r;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.ShareExtService;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h */
public final class C31067h extends C31068i {

    /* renamed from: a */
    private final SharePackage f81320a;

    public C31067h(C31051a aVar) {
        C52711k.m112240b(aVar, "actionsManager");
        super(aVar);
        this.f81320a = aVar.f81300d;
    }

    /* renamed from: a */
    public final void mo63838a(View view) {
        C52711k.m112240b(view, "v");
        ShareExtService b = C41979aq.m91947b();
        Aweme aweme = this.f81322e;
        if (aweme == null) {
            C52711k.m112234a();
        }
        C42357g dislikeAction = b.getDislikeAction(aweme, this.f81323f, "long_press");
        if (dislikeAction != null && dislikeAction.mo49957f()) {
            dislikeAction.mo49950a(C11010c.m22280a(), this.f81320a);
            if (TextUtils.equals(this.f81323f, "homepage_hot") && C30368h.m71294c()) {
                C47718bf.m103288a(new C30349r());
            }
        }
    }
}
