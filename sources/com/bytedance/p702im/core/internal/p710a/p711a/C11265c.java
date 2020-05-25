package com.bytedance.p702im.core.internal.p710a.p711a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p713c.C11275a;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;

/* renamed from: com.bytedance.im.core.internal.a.a.c */
public final class C11265c {

    /* renamed from: a */
    private static String f30348a;

    /* renamed from: b */
    private static volatile C11299d f30349b;

    /* renamed from: a */
    public static synchronized C11299d m22875a() {
        C11275a aVar;
        synchronized (C11265c.class) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(C11165c.m22588a().f30108c.mo20490a());
                sb.append("_im.db");
                String sb2 = sb.toString();
                if (f30349b == null || !sb2.equals(f30348a) || !f30349b.mo21001a()) {
                    if (f30349b != null) {
                        C11299d dVar = f30349b;
                        if (dVar != null) {
                            try {
                                dVar.mo21003b();
                            } catch (Exception e) {
                                C11467e.m23465a("close db", (Throwable) e);
                                C11176d.m22632a(e);
                            }
                        }
                    }
                    C11165c.m22588a().f30108c.mo20504g();
                    if (!C11165c.m22588a().mo20513b().f30142f || TextUtils.isEmpty(C11165c.m22588a().mo20513b().f30161y)) {
                        aVar = new C11264b(C11165c.m22588a().f30106a, sb2);
                    } else {
                        aVar = new C11267e(C11165c.m22588a().f30106a, sb2, C11165c.m22588a().mo20513b().f30161y);
                    }
                    aVar.mo20968b();
                    f30348a = sb2;
                    f30349b = aVar.f30378d.mo20969c();
                    C11299d dVar2 = f30349b;
                    return dVar2;
                }
                C11299d dVar3 = f30349b;
                return dVar3;
            } catch (Exception e2) {
                C11467e.m23465a("getIMDB", (Throwable) e2);
                C11176d.m22632a(e2);
            }
        }
    }
}
