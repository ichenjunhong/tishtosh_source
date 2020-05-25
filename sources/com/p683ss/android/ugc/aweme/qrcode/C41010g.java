package com.p683ss.android.ugc.aweme.qrcode;

import android.text.TextUtils;
import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.g */
public final /* synthetic */ class C41010g implements Callable {

    /* renamed from: a */
    private final String f104260a;

    /* renamed from: b */
    private final int f104261b;

    public C41010g(String str, int i) {
        this.f104260a = str;
        this.f104261b = i;
    }

    public final Object call() {
        String str = this.f104260a;
        int i = this.f104261b;
        String a = C23515d.m57663a(C11010c.m22280a(), str);
        String a2 = C41009f.m90636a();
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a)) {
            C9396a.m18580a(a, a2, C41009f.m90637b(i));
        }
        return null;
    }
}
