package com.p683ss.android.ugc.aweme.commercialize.egg.service;

import android.view.ViewStub;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25769c;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25780a;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService */
public interface ICommerceEggService {
    void addCommerceEggData(C25773a aVar);

    void clearCommentData();

    String getCommentEggHint(String str);

    C25780a getCommerceEggView(ViewStub viewStub);

    void init(C25769c cVar);

    void preloadCommentData(String str, String str2, ItemCommentEggGroup itemCommentEggGroup, boolean z);
}
