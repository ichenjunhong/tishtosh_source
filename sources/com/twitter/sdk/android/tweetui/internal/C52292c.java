package com.twitter.sdk.android.tweetui.internal;

import com.C2240a;
import java.util.Locale;

/* renamed from: com.twitter.sdk.android.tweetui.internal.c */
final class C52292c {
    /* renamed from: a */
    static String m111729a(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        if (i4 > 0) {
            return C2240a.m6773a(Locale.getDefault(), "%1$d:%2$02d:%3$02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)});
        }
        return C2240a.m6773a(Locale.getDefault(), "%1$d:%2$02d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
    }
}
