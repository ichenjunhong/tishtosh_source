package com.bytedance.apm.agent.instrumentation.interceptor;

import android.text.TextUtils;
import com.bytedance.apm.p480f.p481a.C9015b;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

public class AddHeaderInterceptor implements C53676u {
    public C53504ad intercept(C53677a aVar) throws IOException {
        C53498ab a = aVar.mo111416a();
        C53499a a2 = a.mo111256a();
        if (TextUtils.isEmpty(a.mo111255a("x-tt-trace-log")) && C9015b.m17827a().f24585c && C9015b.m17827a().f24584b == 1) {
            a2.mo111271b("x-tt-trace-log", "01");
        }
        return aVar.mo111417a(a2.mo111272c());
    }
}
