package com.p683ss.android.ugc.aweme.profile.jedi.aweme;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.k */
public final class C39937k {
    /* renamed from: a */
    public static final List<Aweme> m88679a(List<? extends Aweme> list) {
        if (list == null) {
            return C52575l.m112097a();
        }
        Iterable<Aweme> iterable = list;
        Collection arrayList = new ArrayList();
        for (Aweme clone : iterable) {
            arrayList.add(clone.clone());
        }
        return (List) arrayList;
    }
}
