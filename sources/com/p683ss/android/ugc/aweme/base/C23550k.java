package com.p683ss.android.ugc.aweme.base;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.k */
public final class C23550k {

    /* renamed from: a */
    public String f62670a;

    /* renamed from: b */
    public List<String> f62671b = new ArrayList();

    /* renamed from: a */
    public final boolean mo48718a() {
        if (this.f62671b == null || this.f62671b.isEmpty()) {
            return true;
        }
        return false;
    }

    public C23550k(String str, List<String> list) {
        this.f62670a = str;
        if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    this.f62671b.add(str2);
                }
            }
        }
    }
}
