package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.af.an */
public final class C4575an {
    /* renamed from: a */
    public static void m10981a(int i) {
        m10982a(i, 0);
    }

    /* renamed from: a */
    public static void m10987a(String str) {
        m10988a(str, 0);
    }

    /* renamed from: a */
    public static void m10982a(int i, int i2) {
        Context e = C3922z.m9915e();
        if (e != null) {
            m10988a(e.getString(i), i2);
        }
    }

    /* renamed from: a */
    public static void m10983a(Context context, int i) {
        m10984a(context, i, 0);
    }

    /* renamed from: a */
    public static void m10985a(Context context, String str) {
        m10986a(context, str, 0);
    }

    /* renamed from: a */
    public static void m10988a(String str, int i) {
        Context e = C3922z.m9915e();
        if (e != null && !TextUtils.isEmpty(str)) {
            if (C4623x.m11087b()) {
                TextView textView = (TextView) ((LayoutInflater) e.getSystemService("layout_inflater")).inflate(R.layout.aqi, null);
                if (textView != null) {
                    Toast toast = new Toast(e);
                    toast.setGravity(17, 0, 0);
                    toast.setView(textView);
                    toast.setDuration(i);
                    textView.setText(str);
                    C4576ao.m10989a(toast);
                    return;
                }
                return;
            }
            ((IHostApp) C4116c.m10249a(IHostApp.class)).centerToast(e, str, i);
        }
    }

    /* renamed from: a */
    private static void m10984a(Context context, int i, int i2) {
        if (context == null) {
            context = C3922z.m9915e();
        }
        m10986a(context, context.getString(i), 0);
    }

    /* renamed from: a */
    private static void m10986a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str)) {
            ((IHostApp) C4116c.m10249a(IHostApp.class)).systemToast(context, str, i);
        }
    }
}
