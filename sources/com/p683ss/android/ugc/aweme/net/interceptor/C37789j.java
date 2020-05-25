package com.p683ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.j */
public final class C37789j implements C53676u {
    public final C53504ad intercept(C53677a aVar) throws IOException {
        String[] strArr;
        C53498ab a = aVar.mo111416a();
        C53673t tVar = a.f132378a;
        if (tVar != null) {
            C47865ew.m103536a().mo95081a(tVar);
            C53674a j = tVar.mo111624j();
            for (String str : C47865ew.f120428b) {
                String c = tVar.mo111612c(str);
                StringBuilder sb = new StringBuilder("sec_");
                sb.append(str);
                if (TextUtils.isEmpty(tVar.mo111612c(sb.toString()))) {
                    String c2 = C47865ew.m103536a().mo95083c(c);
                    if (!TextUtils.isEmpty(c2)) {
                        if (C47865ew.m103536a().mo95082b(tVar.toString())) {
                            j.mo111638g(str);
                        }
                        StringBuilder sb2 = new StringBuilder("sec_");
                        sb2.append(str);
                        j.mo111634c(sb2.toString(), c2);
                    }
                }
            }
            if (C47865ew.m103536a().f120439e) {
                j.mo111634c("compile_mode", C47865ew.f120427a);
            }
            a = a.mo111256a().mo111262a(j.mo111632b().toString()).mo111272c();
        }
        return aVar.mo111417a(a);
    }
}
