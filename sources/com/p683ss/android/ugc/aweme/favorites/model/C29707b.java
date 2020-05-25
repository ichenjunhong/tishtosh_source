package com.p683ss.android.ugc.aweme.favorites.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.b */
public final class C29707b {
    @C17952c(mo34828a = "ch_list")

    /* renamed from: a */
    public List<Challenge> f77617a;
    @C17952c(mo34828a = "cursor")

    /* renamed from: b */
    public int f77618b;
    @C17952c(mo34828a = "has_more")

    /* renamed from: c */
    public int f77619c;

    /* renamed from: a */
    public final boolean mo59972a() {
        if (this.f77619c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo59971a(boolean z) {
        this.f77619c = z ? 1 : 0;
    }
}
