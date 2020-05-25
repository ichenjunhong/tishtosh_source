package com.p683ss.android.ugc.aweme.update;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0610aa.C0614d;
import android.widget.RemoteViews;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.update.g */
public final class C47520g {
    /* renamed from: a */
    public static Notification m102948a(Context context, C0614d dVar, String str, String str2, int i) {
        if (VERSION.SDK_INT >= 14) {
            dVar.mo2118a((CharSequence) str).mo2129c((CharSequence) str2).mo2112a(100, i, false);
        }
        Notification b = dVar.mo2122b();
        if (VERSION.SDK_INT < 14) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.af3);
            remoteViews.setProgressBar(R.id.c62, 100, i, false);
            remoteViews.setTextViewText(R.id.c6e, str2);
            remoteViews.setTextViewText(R.id.title, str);
            b.contentView = remoteViews;
        }
        return b;
    }

    /* renamed from: a */
    public static Notification m102947a(Context context, C0614d dVar, int i, Bitmap bitmap, String str, String str2, String str3, int i2, PendingIntent pendingIntent) {
        dVar.mo2111a(17301633).mo2131d((CharSequence) str).mo2113a(System.currentTimeMillis()).mo2120a(true).mo2114a(pendingIntent);
        return m102948a(context, dVar, str2, str3, i2);
    }
}
