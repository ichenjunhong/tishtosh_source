package com.p683ss.android.ugc.aweme.favorites.p1701a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.f */
public final class C29665f {
    @C17952c(mo34828a = "sticker_list")

    /* renamed from: a */
    public List<C46069d> f77550a;
    @C17952c(mo34828a = "cursor")

    /* renamed from: b */
    public int f77551b;
    @C17952c(mo34828a = "has_more")

    /* renamed from: c */
    public int f77552c;

    /* renamed from: a */
    public final boolean mo59928a() {
        if (this.f77552c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo59927a(boolean z) {
        this.f77552c = z ? 1 : 0;
    }
}
