package com.p683ss.android.message.sswo;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.view.Display;

/* renamed from: com.ss.android.message.sswo.a */
public class C19495a {

    /* renamed from: c */
    private static volatile C19495a f53842c;

    /* renamed from: a */
    public Context f53843a;

    /* renamed from: b */
    public SswoReceiver f53844b = new SswoReceiver();

    /* renamed from: b */
    public final void mo40652b() {
        try {
            SswoActivity.m47727a(this.f53843a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo40651a() {
        try {
            this.f53843a.unregisterReceiver(this.f53844b);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final boolean mo40653c() {
        try {
            if (VERSION.SDK_INT >= 20) {
                Display[] displays = ((DisplayManager) this.f53843a.getSystemService("display")).getDisplays();
                if (displays == null || displays.length <= 0 || 1 != displays[0].getState()) {
                    return false;
                }
                return true;
            } else if (!((PowerManager) this.f53843a.getSystemService("power")).isScreenOn()) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable unused) {
        }
    }

    private C19495a(Context context) {
        this.f53843a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C19495a m47729a(Context context) {
        if (f53842c == null) {
            synchronized (C19495a.class) {
                if (f53842c == null) {
                    f53842c = new C19495a(context);
                }
            }
        }
        return f53842c;
    }
}
