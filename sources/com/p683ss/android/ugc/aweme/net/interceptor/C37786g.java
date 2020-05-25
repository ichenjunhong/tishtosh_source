package com.p683ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.net.C37792l;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53676u.C53677a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.g */
public final class C37786g implements C37792l {
    public final C53504ad intercept(C53677a aVar) throws IOException {
        C53498ab a = aVar.mo111416a();
        if (TextUtils.equals("", a.f132378a.mo111612c("device_id"))) {
            a = a.mo111256a().mo111268a(a.f132378a.mo111624j().mo111638g("device_id").mo111632b()).mo111272c();
        }
        return aVar.mo111417a(a);
    }
}
