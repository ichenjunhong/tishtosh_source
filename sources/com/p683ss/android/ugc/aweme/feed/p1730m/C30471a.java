package com.p683ss.android.ugc.aweme.feed.p1730m;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;

/* renamed from: com.ss.android.ugc.aweme.feed.m.a */
public final class C30471a extends C26832a {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof C30478c)) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new C30477b(objArr), 0);
        return true;
    }
}
