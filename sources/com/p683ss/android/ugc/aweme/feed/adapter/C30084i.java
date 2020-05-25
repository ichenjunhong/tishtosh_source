package com.p683ss.android.ugc.aweme.feed.adapter;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.i */
public final class C30084i {

    /* renamed from: a */
    private final ArrayList<Aweme> f78528a = new ArrayList<>();

    /* renamed from: a */
    public final int mo60345a() {
        return this.f78528a.size();
    }

    /* renamed from: b */
    public final List<Aweme> mo60348b() {
        return this.f78528a;
    }

    /* renamed from: a */
    public final Aweme mo60346a(int i) {
        if (i < 0 || i >= mo60345a()) {
            return null;
        }
        return (Aweme) this.f78528a.get(i);
    }

    /* renamed from: a */
    public final void mo60347a(List<? extends Aweme> list) {
        List list2;
        this.f78528a.clear();
        if (list != null) {
            list2 = C52575l.m112128b((Iterable<? extends T>) list);
        } else {
            list2 = null;
        }
        C30085j.m70621a(this.f78528a, list2);
    }
}
