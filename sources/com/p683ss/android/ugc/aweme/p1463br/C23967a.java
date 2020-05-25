package com.p683ss.android.ugc.aweme.p1463br;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import p060b.p061a.p062a.p063a.C1661a;

/* renamed from: com.ss.android.ugc.aweme.br.a */
public final class C23967a {

    /* renamed from: a */
    static final C23968a f63640a;

    /* renamed from: com.ss.android.ugc.aweme.br.a$a */
    static class C23968a {
        C23968a() {
        }

        /* renamed from: a */
        public String mo49554a(Context context) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/DCIM/Camera/");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.br.a$b */
    static class C23969b extends C23968a {
        C23969b() {
        }

        /* renamed from: a */
        public final String mo49554a(Context context) {
            if (!C1661a.f5800a) {
                float b = C1661a.m5778b();
                if (C1661a.m5777a() || b >= 3.6f) {
                    C1661a.f5801b = true;
                }
                C1661a.f5800a = true;
            }
            if (C1661a.f5801b) {
                return super.mo49554a(context);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/相机/");
            return sb.toString();
        }
    }

    static {
        if ("VIVO".equals(Build.BRAND.toUpperCase())) {
            f63640a = new C23969b();
        } else {
            f63640a = new C23968a();
        }
    }

    /* renamed from: a */
    public static String m58772a(Context context) {
        return f63640a.mo49554a(context);
    }
}
