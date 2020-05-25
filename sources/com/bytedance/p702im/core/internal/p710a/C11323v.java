package com.bytedance.p702im.core.internal.p710a;

import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p705b.C11176d;

/* renamed from: com.bytedance.im.core.internal.a.v */
public final class C11323v {
    /* renamed from: a */
    public static String m23121a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static void m23122a(C11287b bVar) {
        if (bVar != null) {
            try {
                bVar.mo20989a();
            } catch (Exception e) {
                C11467e.m23465a("close cursor", (Throwable) e);
                C11176d.m22632a(e);
            }
        }
    }

    /* renamed from: a */
    public static void m23123a(C11302f fVar) {
        if (fVar != null) {
            try {
                fVar.mo21013c();
            } catch (Exception e) {
                C11467e.m23465a("close ISQLiteStatement", (Throwable) e);
                C11176d.m22632a(e);
            }
        }
    }
}
