package com.p683ss.android.ugc.aweme.photo.p2045a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.photo.a.a */
public final class C38653a {
    /* renamed from: a */
    public static void m85993a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
    }
}
