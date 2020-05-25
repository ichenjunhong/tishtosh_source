package com.p683ss.android.agilelogger.p1125b.p1126a;

import com.p683ss.android.agilelogger.p1136f.C18830k;

/* renamed from: com.ss.android.agilelogger.b.a.b */
public final class C18788b implements C18787a {
    /* renamed from: a */
    private static String m45859a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 10);
        String[] split = str.split(C18830k.f52009a);
        int length = split.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(C18830k.f52009a);
            }
            String str2 = split[i];
            sb.append(9553);
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ String mo38395a(Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                int i2 = i + 1;
                strArr2[i] = str;
                i = i2;
            }
        }
        if (i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════");
        sb.append(C18830k.f52009a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(m45859a(strArr2[i3]));
            if (i3 != i - 1) {
                sb.append(C18830k.f52009a);
                sb.append("╟───────────────────────────────────────────────────────────────────────────────────────────────────");
                sb.append(C18830k.f52009a);
            } else {
                sb.append(C18830k.f52009a);
                sb.append("╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}
