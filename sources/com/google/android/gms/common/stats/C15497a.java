package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.util.C15513d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public final class C15497a {

    /* renamed from: a */
    private static final Object f39954a = new Object();

    /* renamed from: b */
    private static volatile C15497a f39955b;

    /* renamed from: c */
    private static boolean f39956c = false;

    /* renamed from: d */
    private final List<String> f39957d = Collections.EMPTY_LIST;

    /* renamed from: e */
    private final List<String> f39958e = Collections.EMPTY_LIST;

    /* renamed from: f */
    private final List<String> f39959f = Collections.EMPTY_LIST;

    /* renamed from: g */
    private final List<String> f39960g = Collections.EMPTY_LIST;

    /* renamed from: a */
    public static C15497a m32246a() {
        if (f39955b == null) {
            synchronized (f39954a) {
                if (f39955b == null) {
                    f39955b = new C15497a();
                }
            }
        }
        return f39955b;
    }

    private C15497a() {
    }

    /* renamed from: a */
    public static boolean m32248a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C15513d.m32270a(context, component.getPackageName());
        }
        if (z) {
            return false;
        }
        return C15498b.m32250a(context, intent, serviceConnection, i);
    }

    /* renamed from: a */
    public final boolean mo28515a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m32248a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* renamed from: a */
    public static void m32247a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
