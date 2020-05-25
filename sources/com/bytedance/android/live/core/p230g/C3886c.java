package com.bytedance.android.live.core.p230g;

import android.content.ClipData;
import android.content.ClipboardManager;

/* renamed from: com.bytedance.android.live.core.g.c */
public final class C3886c {

    /* renamed from: a */
    private static CharSequence f10896a;

    /* renamed from: a */
    public static void m9822a(CharSequence charSequence) throws Exception {
        f10896a = charSequence;
        ((ClipboardManager) C3922z.m9915e().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
    }
}
