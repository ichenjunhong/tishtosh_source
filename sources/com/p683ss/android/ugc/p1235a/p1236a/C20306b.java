package com.p683ss.android.ugc.p1235a.p1236a;

import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.p1235a.C20314g;
import java.util.List;

/* renamed from: com.ss.android.ugc.a.a.b */
final class C20306b extends C20314g {
    C20306b() {
        this.f55809a.add("com.ss.android.ugc.aweme.live.LiveOuterService");
        mo42957a(ILiveOuterService.class, "com.ss.android.ugc.aweme.live.LiveOuterService");
    }

    /* renamed from: a */
    public final <T> T mo42949a(String str, Object... objArr) {
        if ((objArr == null || objArr.length == 0) && str.equals("com.ss.android.ugc.aweme.live.LiveOuterService")) {
            return new C36173w();
        }
        return null;
    }

    /* renamed from: a */
    public final <T> List<T> mo42950a(Class<T> cls, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            if (this.f55810b.get(cls) != null) {
                return mo42956a((List) this.f55810b.get(cls), new Object[0]);
            }
            return null;
        } else if (this.f55810b.get(cls) != null) {
            return mo42956a((List) this.f55810b.get(cls), objArr);
        } else {
            return null;
        }
    }
}
