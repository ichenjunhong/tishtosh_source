package com.p683ss.android.ugc.trill;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.trill.a */
public final class C50292a {
    /* renamed from: a */
    public static boolean m108557a(int i, Context context, Intent intent) {
        if (i != 0) {
            return false;
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
