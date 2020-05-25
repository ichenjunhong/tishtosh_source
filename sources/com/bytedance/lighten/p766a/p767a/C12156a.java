package com.bytedance.lighten.p766a.p767a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lighten.a.a.a */
public final class C12156a {

    /* renamed from: a */
    public List<String> f32092a = new ArrayList();

    /* renamed from: a */
    public final boolean mo23067a() {
        if (this.f32092a == null || this.f32092a.isEmpty()) {
            return true;
        }
        return false;
    }

    public C12156a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    this.f32092a.add(str);
                }
            }
        }
    }
}
