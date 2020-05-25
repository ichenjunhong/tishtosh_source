package com.p683ss.android.ugc.aweme.account.util;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.p038f.C0779b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.util.s */
public final class C22281s {

    /* renamed from: a */
    private static final C0779b<Integer> f60049a;

    static {
        C0779b<Integer> bVar = new C0779b<>();
        f60049a = bVar;
        bVar.add(Integer.valueOf(1039));
        f60049a.add(Integer.valueOf(1049));
        f60049a.add(Integer.valueOf(1050));
    }

    /* renamed from: a */
    public static boolean m55138a(int i) {
        return f60049a.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m55135a(Context context, String str) {
        m55137a(context, str, context.getString(R.string.vo), true);
    }

    /* renamed from: a */
    public static void m55136a(Context context, String str, int i) {
        C10691a.m21545b(context, str).mo19066a();
    }

    /* renamed from: a */
    public static void m55137a(Context context, String str, String str2, boolean z) {
        Dialog c = new C10643a(context).mo18902b(str).mo18893a(str2, (OnClickListener) null).mo18897a().mo18883c();
        c.setCancelable(z);
        c.setCanceledOnTouchOutside(z);
    }
}
