package android.support.p030v4.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;

/* renamed from: android.support.v4.content.i */
public final class C0745i {
    /* renamed from: a */
    public static int m2143a(Context context, String str) {
        String str2;
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        if (VERSION.SDK_INT >= 23) {
            str2 = AppOpsManager.permissionToOp(str);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (VERSION.SDK_INT >= 23) {
                i = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str2, packageName);
            } else {
                i = 1;
            }
            if (i != 0) {
                return -2;
            }
        }
        return 0;
    }
}
