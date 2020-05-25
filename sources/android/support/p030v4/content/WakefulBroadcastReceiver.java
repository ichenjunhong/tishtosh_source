package android.support.p030v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: android.support.v4.content.WakefulBroadcastReceiver */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<WakeLock> f2489a = new SparseArray<>();

    /* renamed from: b */
    private static int f2490b = 1;

    /* renamed from: a */
    public static boolean m2041a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f2489a) {
            WakeLock wakeLock = (WakeLock) f2489a.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            wakeLock.release();
            f2489a.remove(intExtra);
            return true;
        }
    }

    /* renamed from: a_ */
    public static ComponentName m2042a_(Context context, Intent intent) {
        ComponentName componentName;
        synchronized (f2489a) {
            int i = f2490b;
            int i2 = f2490b + 1;
            f2490b = i2;
            if (i2 <= 0) {
                f2490b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                componentName = context.startService(intent);
            } else {
                componentName = null;
            }
            if (componentName == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder("androidx.core:wake:");
            sb.append(componentName.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f2489a.put(i, newWakeLock);
            return componentName;
        }
    }
}
