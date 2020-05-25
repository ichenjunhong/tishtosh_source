package com.p683ss.p2566d;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.d.a */
public final class C51295a {

    /* renamed from: a */
    public static C51297b f128065a;

    /* renamed from: b */
    public static int f128066b;

    /* renamed from: c */
    public static AtomicInteger f128067c = new AtomicInteger(0);

    /* renamed from: d */
    private static HandlerThread f128068d;

    /* renamed from: e */
    private static C51296a f128069e;

    /* renamed from: com.ss.d.a$a */
    static class C51296a extends Handler {
        public C51296a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            Activity activity = (Activity) message.obj;
            switch (i) {
                case 1:
                    C51295a.f128065a.mo48203a(C51298c.m110295b(activity), -1.0f, -1);
                    break;
                case 2:
                    C51295a.f128065a.mo48203a(-1.0f, C51298c.m110294a(activity), -1);
                    break;
                case 3:
                    C51295a.f128065a.mo48203a(-1.0f, -1.0f, C51298c.m110296c(activity));
                    break;
                case 4:
                    C51295a.f128065a.mo48203a(C51298c.m110295b(activity), C51298c.m110294a(activity), -1);
                    break;
                case 5:
                    C51295a.f128065a.mo48203a(C51298c.m110295b(activity), C51298c.m110294a(activity), C51298c.m110296c(activity));
                    break;
            }
            sendMessageDelayed(obtainMessage(i, activity), (long) C51295a.f128066b);
        }
    }

    /* renamed from: a */
    public static void m110289a() {
        if (f128068d != null) {
            f128068d.quit();
            f128065a.mo48202a();
            f128068d = null;
            f128069e = null;
            f128065a = null;
        }
    }

    /* renamed from: a */
    public static void m110290a(Activity activity, C51297b bVar) {
        m110291a(activity, bVar, 1, 3000);
    }

    /* renamed from: a */
    private static void m110291a(Activity activity, C51297b bVar, int i, int i2) {
        if (f128068d == null) {
            HandlerThread handlerThread = new HandlerThread("Thor-Handler-Thread");
            f128068d = handlerThread;
            handlerThread.start();
            f128069e = new C51296a(f128068d.getLooper());
            f128065a = bVar;
            f128066b = 3000;
        }
        C51296a aVar = f128069e;
        aVar.sendMessage(aVar.obtainMessage(1, activity));
    }
}
