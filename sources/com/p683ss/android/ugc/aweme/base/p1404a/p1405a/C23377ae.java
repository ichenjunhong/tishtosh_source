package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.profile.C39938k;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ae */
final class C23377ae implements C39938k {

    /* renamed from: a */
    private Context f62392a;

    /* renamed from: b */
    private Keva f62393b = Keva.getRepoFromSp(this.f62392a, "PrivateAlbumSp", 0);

    /* renamed from: a */
    public final boolean mo48467a(boolean z) {
        return this.f62393b.getBoolean("has_show_private_album_guide", false);
    }

    /* renamed from: b */
    public final void mo48468b(boolean z) {
        this.f62393b.storeBoolean("has_show_private_album_guide", true);
    }

    public C23377ae(Context context) {
        this.f62392a = context;
    }
}
