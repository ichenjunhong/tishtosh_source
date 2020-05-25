package leakcanary.internal;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.internal.n */
public final class C53433n {

    /* renamed from: a */
    public static final C53433n f132140a = new C53433n();

    private C53433n() {
    }

    /* renamed from: a */
    public static Notification m113488a(Context context, Builder builder, C53432m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(builder, "builder");
        C52711k.m112240b(mVar, "type");
        builder.setWhen(System.currentTimeMillis());
        if (VERSION.SDK_INT >= 26) {
            Object systemService = context.getSystemService("notification");
            if (systemService != null) {
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (notificationManager.getNotificationChannel(mVar.name()) == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel(mVar.name(), mVar.getNameStr(), mVar.getImportance()));
                }
                builder.setChannelId(mVar.name());
            } else {
                throw new C52857u("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }
        if (VERSION.SDK_INT < 16) {
            Notification notification = builder.getNotification();
            C52711k.m112236a((Object) notification, "builder.notification");
            return notification;
        }
        Notification build = builder.build();
        C52711k.m112236a((Object) build, "builder.build()");
        return build;
    }
}
