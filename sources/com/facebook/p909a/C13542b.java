package com.facebook.p909a;

import android.preference.PreferenceManager;
import com.facebook.C14533n;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.a.b */
public class C13542b {

    /* renamed from: a */
    public static ReentrantReadWriteLock f35349a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public static String f35350b = null;

    /* renamed from: c */
    public static volatile boolean f35351c = false;

    /* renamed from: d */
    private static final String f35352d = "b";

    C13542b() {
    }

    /* renamed from: a */
    public static String m27364a() {
        if (!f35351c) {
            m27365b();
        }
        f35349a.readLock().lock();
        try {
            return f35350b;
        } finally {
            f35349a.readLock().unlock();
        }
    }

    /* renamed from: b */
    public static void m27365b() {
        if (!f35351c) {
            f35349a.writeLock().lock();
            try {
                if (!f35351c) {
                    f35350b = PreferenceManager.getDefaultSharedPreferences(C14533n.m29773g()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f35351c = true;
                    f35349a.writeLock().unlock();
                }
            } finally {
                f35349a.writeLock().unlock();
            }
        }
    }
}
