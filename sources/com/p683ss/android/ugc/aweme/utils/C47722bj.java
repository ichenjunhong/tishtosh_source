package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p030v4.content.FileProvider;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.utils.bj */
public final class C47722bj {
    /* renamed from: a */
    public static Uri m103304a(Context context, File file) {
        if (VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".fileprovider");
        return FileProvider.getUriForFile(context, sb.toString(), file);
    }
}
