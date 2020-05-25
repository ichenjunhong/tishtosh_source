package com.bytedance.sdk.account.p878m;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.sdk.account.m.g */
public final class C13215g {
    /* renamed from: a */
    public static void m26598a(Context context, int i) {
        if (context != null) {
            Toast makeText = Toast.makeText(context, R.string.c2j, 0);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
        }
    }
}
