package com.p683ss.android.ugc.aweme.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.utils.ag */
public final class C47666ag {
    /* renamed from: a */
    public static void m103177a(String str, Context context, String str2) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str2));
    }
}
