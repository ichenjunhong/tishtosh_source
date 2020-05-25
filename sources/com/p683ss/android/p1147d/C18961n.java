package com.p683ss.android.p1147d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: com.ss.android.d.n */
public final class C18961n {
    /* renamed from: a */
    public static void m46135a(Context context, String str) {
        try {
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(str))));
        } catch (Exception unused) {
        }
    }
}
