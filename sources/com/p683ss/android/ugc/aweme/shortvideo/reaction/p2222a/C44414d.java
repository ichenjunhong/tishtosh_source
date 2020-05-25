package com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a;

import com.p683ss.android.linkselector.LinkSelector;
import com.p683ss.android.ugc.aweme.app.download.C23079b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.d */
public final class C44414d {

    /* renamed from: a */
    public static final C44414d f112357a = new C44414d();

    private C44414d() {
    }

    /* renamed from: a */
    public static final List<String> m97221a(List<String> list, Aweme aweme) {
        C52711k.m112240b(list, "urlList");
        ArrayList arrayList = new ArrayList();
        for (String a : list) {
            String a2 = C23079b.m56620a(aweme, LinkSelector.m46790a().mo39174a(a));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
