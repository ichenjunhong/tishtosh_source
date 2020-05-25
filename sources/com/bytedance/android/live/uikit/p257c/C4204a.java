package com.bytedance.android.live.uikit.p257c;

import android.content.Context;
import android.widget.Toast;
import com.C2240a;
import com.bytedance.android.live.uikit.p256b.C4202c;
import com.bytedance.common.utility.C9406f;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;

/* renamed from: com.bytedance.android.live.uikit.c.a */
public final class C4204a {
    /* renamed from: a */
    public static void m10421a(Context context, int i) {
        if (context != null) {
            m10423a(context, context.getString(i));
        }
    }

    /* renamed from: a */
    public static void m10423a(Context context, String str) {
        if (context != null && !C9431p.m18664a(str)) {
            if (context instanceof C9406f) {
                ((C9406f) context).showCustomToast(str);
                return;
            }
            try {
                Toast makeText = Toast.makeText(context, str, 0);
                if (makeText != null) {
                    C4205b.m10425a(makeText);
                }
            } catch (Exception e) {
                C9415i.m18634a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static final String m10420a(long j, String str) {
        if (j <= 10000) {
            return String.valueOf(j);
        }
        double d = (double) j;
        Double.isNaN(d);
        String a = C2240a.m6772a("%.1f", new Object[]{Double.valueOf((d * 1.0d) / 10000.0d)});
        if ('0' == a.charAt(a.length() - 1)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.substring(0, a.length() - 2));
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m10422a(Context context, int i, long j) {
        if (context != null) {
            m10424a(context, context.getString(i), j);
        }
    }

    /* renamed from: a */
    public static void m10424a(Context context, String str, long j) {
        if (context != null && !C9431p.m18664a(str) && !(context instanceof C4202c)) {
            try {
                Toast makeText = Toast.makeText(context, str, 0);
                if (makeText != null) {
                    C4205b.m10425a(makeText);
                }
            } catch (Exception e) {
                C9415i.m18634a((Throwable) e);
            }
        }
    }
}
