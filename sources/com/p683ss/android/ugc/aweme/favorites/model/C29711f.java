package com.p683ss.android.ugc.aweme.favorites.model;

import com.google.p1057b.p1058a.C17422l;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.f */
final /* synthetic */ class C29711f implements C17422l {

    /* renamed from: a */
    private final boolean f77623a;

    /* renamed from: b */
    private final List f77624b;

    C29711f(boolean z, List list) {
        this.f77623a = z;
        this.f77624b = list;
    }

    public final boolean apply(Object obj) {
        return this.f77623a || !this.f77624b.contains((C46069d) obj);
    }
}
