package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.share.C41962ag;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.aj */
final class C23382aj implements C41962ag {

    /* renamed from: a */
    private Context f62402a;

    /* renamed from: b */
    private Keva f62403b = Keva.getRepoFromSp(this.f62402a, "ReuseStickerUpdateSP", 0);

    /* renamed from: b */
    public final void mo48476b(int i) {
        this.f62403b.storeInt("version_code", i);
    }

    /* renamed from: a */
    public final int mo48473a(int i) {
        return this.f62403b.getInt("version_code", 0);
    }

    /* renamed from: b */
    public final void mo48477b(long j) {
        this.f62403b.storeLong("time", j);
    }

    public C23382aj(Context context) {
        this.f62402a = context;
    }

    /* renamed from: a */
    public final long mo48474a(long j) {
        return this.f62403b.getLong("time", 0);
    }

    /* renamed from: b */
    public final void mo48478b(String str) {
        this.f62403b.storeString("eid", str);
    }

    /* renamed from: a */
    public final String mo48475a(String str) {
        return this.f62403b.getString("eid", str);
    }
}
