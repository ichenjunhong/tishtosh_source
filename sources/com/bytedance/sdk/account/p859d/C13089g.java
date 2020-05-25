package com.bytedance.sdk.account.p859d;

import android.content.Context;
import com.bytedance.sdk.account.p868i.p869a.C13176a;

/* renamed from: com.bytedance.sdk.account.d.g */
public class C13089g implements C13176a {

    /* renamed from: a */
    private static volatile C13176a f34204a;

    /* renamed from: b */
    private final Context f34205b;

    private C13089g(Context context) {
        this.f34205b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C13176a m26338a(Context context) {
        if (f34204a == null) {
            synchronized (C13089g.class) {
                if (f34204a == null) {
                    f34204a = new C13089g(context);
                }
            }
        }
        return f34204a;
    }
}
