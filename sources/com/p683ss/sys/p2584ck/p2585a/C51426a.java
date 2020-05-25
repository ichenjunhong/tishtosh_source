package com.p683ss.sys.p2584ck.p2585a;

import android.content.Context;
import com.p683ss.p1096a.p1097a.C18477a;
import com.p683ss.p1096a.p1097a.C18478b;
import com.p683ss.sys.p2584ck.C51438b;

/* renamed from: com.ss.sys.ck.a.a */
public final class C51426a extends C18478b {

    /* renamed from: f */
    private Context f128596f;

    public C51426a(Context context, String str, String str2) {
        super(context, str);
        this.f128596f = context;
        if (str2 == null || str2.length() <= 0) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C18477a.m44716c(0));
        sb.append("/v.s");
        sb.append(str2);
        this.f50893a = sb.toString();
    }

    /* renamed from: a */
    public final boolean mo37728a(int i, byte[] bArr) {
        if (i != 200 || bArr == null) {
            return false;
        }
        try {
            if (bArr.length > 0) {
                return C51438b.m110621a(new String(bArr));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
