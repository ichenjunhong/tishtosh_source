package com.p683ss.android.ugc.trill.abtest.impl;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0610aa.C0614d;
import com.p683ss.android.ugc.aweme.R$drawable;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.trill.abtest.C50294a;
import com.p683ss.android.ugc.trill.app.TrillApplication;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.abtest.impl.b */
public final class C50300b extends C50294a<Boolean> {
    /* renamed from: a */
    public final /* synthetic */ Object mo98200a() {
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo98201a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) TrillApplication.m56199a().getSystemService("notification");
            if (notificationManager.getNotificationChannel("AttractUserWithoutLoginHome") != null) {
                notificationManager.deleteNotificationChannel("AttractUserWithoutLoginHome");
            }
        }
        if (C20902b.m53242a().isLogin() || ((Boolean) C23183v.m56778a().mo47929y().mo47782d()).booleanValue() || !bool.booleanValue()) {
            return false;
        }
        NotificationManager notificationManager2 = (NotificationManager) TrillApplication.m56199a().getSystemService("notification");
        Intent intent = new Intent(TrillApplication.m56199a(), NotificationBroadcastReceiver.class);
        intent.setAction("notification_clicked");
        intent.putExtra("type", 1);
        PendingIntent broadcast = PendingIntent.getBroadcast(TrillApplication.m56199a(), 0, intent, 1073741824);
        if (VERSION.SDK_INT >= 26) {
            String str = "other_channel";
            String string = TrillApplication.m56199a().getString(R.string.hik);
            if (VERSION.SDK_INT >= 26 && notificationManager2 != null && notificationManager2.getNotificationChannel(str) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(str, string, 4);
                notificationChannel.enableLights(true);
                notificationChannel.enableVibration(true);
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.setShowBadge(true);
                notificationChannel.setLightColor(-16711936);
                notificationManager2.createNotificationChannel(notificationChannel);
            }
        }
        C0614d dVar = new C0614d(TrillApplication.m56199a(), "other_channel");
        if (VERSION.SDK_INT > 20) {
            dVar.mo2111a(2131955412);
        } else {
            dVar.mo2111a((int) R.drawable.status_icon);
        }
        Drawable drawable = TrillApplication.m56199a().getResources().getDrawable(R$drawable.icon);
        Bitmap bitmap = null;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        }
        dVar.mo2115a(bitmap).mo2118a((CharSequence) TrillApplication.m56199a().getString(R.string.it)).mo2125b((CharSequence) TrillApplication.m56199a().getString(R.string.l2));
        dVar.mo2114a(broadcast);
        if (notificationManager2 != null) {
            notificationManager2.notify(1, dVar.mo2122b());
        }
        C23183v.m56778a().mo47929y().mo47776a(Boolean.valueOf(true));
        C26890h.onEvent(MobClick.obtain().setLabelName("show").setEventName("recall_push"));
        return true;
    }
}
