package com.p683ss.android.ugc.aweme.dfbase;

import android.app.Application;
import com.bytedance.common.utility.p521a.C9373b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p763l.C12137a;
import com.bytedance.p763l.C12152c;

/* renamed from: com.ss.android.ugc.aweme.dfbase.o */
public class C27560o implements C12137a {

    /* renamed from: a */
    private static volatile boolean f72445a;

    private C27560o() {
        C12152c.m24594a((C12137a) this);
    }

    /* renamed from: a */
    public final Application mo23048a() {
        return (Application) C11010c.m22280a();
    }

    /* renamed from: b */
    public final int mo23049b() {
        return C9373b.m18554b(C11010c.m22280a(), "SS_VERSION_CODE");
    }

    /* renamed from: c */
    public static void m66233c() {
        if (!f72445a) {
            synchronized (C27560o.class) {
                if (!f72445a) {
                    new C27560o();
                    f72445a = true;
                }
            }
        }
    }
}
