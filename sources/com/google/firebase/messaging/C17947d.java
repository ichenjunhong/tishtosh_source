package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.d */
final class C17947d {

    /* renamed from: a */
    private static final AtomicInteger f49837a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: b */
    private final Context f49838b;

    /* renamed from: c */
    private Bundle f49839c;

    public C17947d(Context context) {
        this.f49838b = context.getApplicationContext();
    }

    /* renamed from: a */
    static String m43990a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* renamed from: b */
    private static Object[] m43993b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_args");
        String a = m43990a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a);
            Object[] objArr = new String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return objArr;
        } catch (JSONException unused) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf("_loc_args");
            String substring = (valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(a);
            sb.append("  Default value will be used.");
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (m43992a(r6) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0258  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34813a(android.os.Bundle r15) {
        /*
            r14 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = "gcm.n.noui"
            java.lang.String r1 = m43990a(r15, r1)
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            android.content.Context r0 = r14.f49838b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 != 0) goto L_0x005c
            boolean r0 = com.google.android.gms.common.util.C15524o.m32299g()
            if (r0 != 0) goto L_0x002c
            r3 = 10
            android.os.SystemClock.sleep(r3)
        L_0x002c:
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r14.f49838b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x005c
            java.util.Iterator r3 = r3.iterator()
        L_0x0044:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0044
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x0060
            return r2
        L_0x0060:
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r14.m43994c(r15, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x007c
            android.content.Context r0 = r14.f49838b
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            android.content.Context r3 = r14.f49838b
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.CharSequence r0 = r0.loadLabel(r3)
        L_0x007c:
            java.lang.String r3 = "gcm.n.body"
            java.lang.String r3 = r14.m43994c(r15, r3)
            java.lang.String r4 = "gcm.n.icon"
            java.lang.String r4 = m43990a(r15, r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x00be
            android.content.Context r5 = r14.f49838b
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r6 = "drawable"
            android.content.Context r7 = r14.f49838b
            java.lang.String r7 = r7.getPackageName()
            int r6 = r5.getIdentifier(r4, r6, r7)
            if (r6 == 0) goto L_0x00a9
            boolean r7 = r14.m43992a(r6)
            if (r7 == 0) goto L_0x00a9
            goto L_0x00e9
        L_0x00a9:
            java.lang.String r6 = "mipmap"
            android.content.Context r7 = r14.f49838b
            java.lang.String r7 = r7.getPackageName()
            int r6 = r5.getIdentifier(r4, r6, r7)
            if (r6 == 0) goto L_0x00be
            boolean r4 = r14.m43992a(r6)
            if (r4 == 0) goto L_0x00be
            goto L_0x00e9
        L_0x00be:
            android.os.Bundle r4 = r14.m43988a()
            java.lang.String r5 = "com.google.firebase.messaging.default_notification_icon"
            int r4 = r4.getInt(r5, r2)
            if (r4 == 0) goto L_0x00d0
            boolean r5 = r14.m43992a(r4)
            if (r5 != 0) goto L_0x00d8
        L_0x00d0:
            android.content.Context r4 = r14.f49838b
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.icon
        L_0x00d8:
            if (r4 == 0) goto L_0x00e3
            boolean r5 = r14.m43992a(r4)
            if (r5 != 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r6 = r4
            goto L_0x00e9
        L_0x00e3:
            r4 = 17301651(0x1080093, float:2.4979667E-38)
            r6 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x00e9:
            java.lang.String r4 = "gcm.n.color"
            java.lang.String r4 = m43990a(r15, r4)
            java.lang.Integer r4 = r14.m43989a(r4)
            java.lang.String r5 = "gcm.n.sound2"
            java.lang.String r5 = m43990a(r15, r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L_0x0105
            java.lang.String r5 = "gcm.n.sound"
            java.lang.String r5 = m43990a(r15, r5)
        L_0x0105:
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            r8 = 0
            if (r7 == 0) goto L_0x010e
            r5 = r8
            goto L_0x0166
        L_0x010e:
            java.lang.String r7 = "default"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0161
            android.content.Context r7 = r14.f49838b
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r9 = "raw"
            android.content.Context r10 = r14.f49838b
            java.lang.String r10 = r10.getPackageName()
            int r7 = r7.getIdentifier(r5, r9, r10)
            if (r7 == 0) goto L_0x0161
            android.content.Context r7 = r14.f49838b
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            int r9 = r9 + 24
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            int r9 = r9 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            java.lang.String r9 = "android.resource://"
            r10.append(r9)
            r10.append(r7)
            java.lang.String r7 = "/raw/"
            r10.append(r7)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L_0x0166
        L_0x0161:
            r5 = 2
            android.net.Uri r5 = android.media.RingtoneManager.getDefaultUri(r5)
        L_0x0166:
            java.lang.String r7 = "gcm.n.click_action"
            java.lang.String r7 = m43990a(r15, r7)
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x0186
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r7)
            android.content.Context r7 = r14.f49838b
            java.lang.String r7 = r7.getPackageName()
            r9.setPackage(r7)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r9.setFlags(r7)
            goto L_0x01ca
        L_0x0186:
            java.lang.String r7 = "gcm.n.link_android"
            java.lang.String r7 = m43990a(r15, r7)
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L_0x0198
            java.lang.String r7 = "gcm.n.link"
            java.lang.String r7 = m43990a(r15, r7)
        L_0x0198:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x01a3
            android.net.Uri r7 = android.net.Uri.parse(r7)
            goto L_0x01a4
        L_0x01a3:
            r7 = r8
        L_0x01a4:
            if (r7 == 0) goto L_0x01ba
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "android.intent.action.VIEW"
            r9.<init>(r10)
            android.content.Context r10 = r14.f49838b
            java.lang.String r10 = r10.getPackageName()
            r9.setPackage(r10)
            r9.setData(r7)
            goto L_0x01ca
        L_0x01ba:
            android.content.Context r7 = r14.f49838b
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.Context r9 = r14.f49838b
            java.lang.String r9 = r9.getPackageName()
            android.content.Intent r9 = r7.getLaunchIntentForPackage(r9)
        L_0x01ca:
            r7 = 1073741824(0x40000000, float:2.0)
            if (r9 != 0) goto L_0x01d0
            r9 = r8
            goto L_0x0214
        L_0x01d0:
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            r9.addFlags(r10)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r15)
            com.google.firebase.messaging.FirebaseMessagingService.zzj(r10)
            r9.putExtras(r10)
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x01e8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0208
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "gcm.n."
            boolean r12 = r11.startsWith(r12)
            if (r12 != 0) goto L_0x0204
            java.lang.String r12 = "gcm.notification."
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x01e8
        L_0x0204:
            r9.removeExtra(r11)
            goto L_0x01e8
        L_0x0208:
            android.content.Context r10 = r14.f49838b
            java.util.concurrent.atomic.AtomicInteger r11 = f49837a
            int r11 = r11.incrementAndGet()
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivity(r10, r11, r9, r7)
        L_0x0214:
            if (r15 != 0) goto L_0x0218
            r10 = 0
            goto L_0x0224
        L_0x0218:
            java.lang.String r10 = "1"
            java.lang.String r11 = "google.c.a.e"
            java.lang.String r11 = r15.getString(r11)
            boolean r10 = r10.equals(r11)
        L_0x0224:
            if (r10 == 0) goto L_0x0258
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r10.<init>(r11)
            m43991a(r10, r15)
            java.lang.String r11 = "pending_intent"
            r10.putExtra(r11, r9)
            android.content.Context r9 = r14.f49838b
            java.util.concurrent.atomic.AtomicInteger r11 = f49837a
            int r11 = r11.incrementAndGet()
            android.app.PendingIntent r9 = com.google.firebase.iid.C17941y.m43969a(r9, r11, r10, r7)
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r10.<init>(r11)
            m43991a(r10, r15)
            android.content.Context r11 = r14.f49838b
            java.util.concurrent.atomic.AtomicInteger r12 = f49837a
            int r12 = r12.incrementAndGet()
            android.app.PendingIntent r7 = com.google.firebase.iid.C17941y.m43969a(r11, r12, r10, r7)
            goto L_0x0259
        L_0x0258:
            r7 = r8
        L_0x0259:
            java.lang.String r10 = "gcm.n.android_channel_id"
            java.lang.String r10 = m43990a(r15, r10)
            boolean r11 = com.google.android.gms.common.util.C15524o.m32301i()
            if (r11 == 0) goto L_0x02bf
            android.content.Context r11 = r14.f49838b
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo()
            int r11 = r11.targetSdkVersion
            r12 = 26
            if (r11 >= r12) goto L_0x0272
            goto L_0x02bf
        L_0x0272:
            android.content.Context r8 = r14.f49838b
            java.lang.Class<android.app.NotificationManager> r11 = android.app.NotificationManager.class
            java.lang.Object r8 = r8.getSystemService(r11)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x028a
            android.app.NotificationChannel r11 = r8.getNotificationChannel(r10)
            if (r11 == 0) goto L_0x028a
        L_0x0288:
            r8 = r10
            goto L_0x02bf
        L_0x028a:
            android.os.Bundle r10 = r14.m43988a()
            java.lang.String r11 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r10 = r10.getString(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x02a1
            android.app.NotificationChannel r11 = r8.getNotificationChannel(r10)
            if (r11 == 0) goto L_0x02a1
            goto L_0x0288
        L_0x02a1:
            java.lang.String r10 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r10 = r8.getNotificationChannel(r10)
            if (r10 != 0) goto L_0x02bd
            android.app.NotificationChannel r10 = new android.app.NotificationChannel
            java.lang.String r11 = "fcm_fallback_notification_channel"
            android.content.Context r12 = r14.f49838b
            r13 = 2132544586(0x7f1c0c4a, float:2.0742338E38)
            java.lang.String r12 = r12.getString(r13)
            r13 = 3
            r10.<init>(r11, r12, r13)
            r8.createNotificationChannel(r10)
        L_0x02bd:
            java.lang.String r8 = "fcm_fallback_notification_channel"
        L_0x02bf:
            android.support.v4.app.aa$d r10 = new android.support.v4.app.aa$d
            android.content.Context r11 = r14.f49838b
            r10.<init>(r11)
            android.support.v4.app.aa$d r10 = r10.mo2126b(r1)
            android.support.v4.app.aa$d r6 = r10.mo2111a(r6)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x02d7
            r6.mo2118a(r0)
        L_0x02d7:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x02ec
            r6.mo2125b(r3)
            android.support.v4.app.aa$c r0 = new android.support.v4.app.aa$c
            r0.<init>()
            android.support.v4.app.aa$c r0 = r0.mo2109c(r3)
            r6.mo2117a(r0)
        L_0x02ec:
            if (r4 == 0) goto L_0x02f5
            int r0 = r4.intValue()
            r6.mo2130d(r0)
        L_0x02f5:
            if (r5 == 0) goto L_0x02fa
            r6.mo2116a(r5)
        L_0x02fa:
            if (r9 == 0) goto L_0x02ff
            r6.mo2114a(r9)
        L_0x02ff:
            if (r7 == 0) goto L_0x0304
            r6.mo2124b(r7)
        L_0x0304:
            if (r8 == 0) goto L_0x0309
            r6.mo2119a(r8)
        L_0x0309:
            android.app.Notification r0 = r6.mo2122b()
            java.lang.String r3 = "gcm.n.tag"
            java.lang.String r15 = m43990a(r15, r3)
            android.content.Context r3 = r14.f49838b
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            boolean r4 = android.text.TextUtils.isEmpty(r15)
            if (r4 == 0) goto L_0x033a
            long r4 = android.os.SystemClock.uptimeMillis()
            r15 = 37
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r15)
            java.lang.String r15 = "FCM-Notification:"
            r6.append(r15)
            r6.append(r4)
            java.lang.String r15 = r6.toString()
        L_0x033a:
            r3.notify(r15, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C17947d.mo34813a(android.os.Bundle):boolean");
    }

    /* renamed from: c */
    private final String m43994c(Bundle bundle, String str) {
        String a = m43990a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        String a2 = m43990a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        Resources resources = this.f49838b.getResources();
        int identifier = resources.getIdentifier(a2, "string", this.f49838b.getPackageName());
        if (identifier == 0) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf("_loc_key");
            String substring = (valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(a2).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(a2);
            sb.append(" Default value will be used.");
            return null;
        }
        Object[] b = m43993b(bundle, str);
        if (b == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, b);
        } catch (MissingFormatArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final boolean m43992a(int i) {
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(this.f49838b.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable);
        } catch (NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private final Integer m43989a(String str) {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i = m43988a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0726c.m2098c(this.f49838b, i));
            } catch (NotFoundException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m43991a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    /* renamed from: a */
    private final Bundle m43988a() {
        ApplicationInfo applicationInfo;
        if (this.f49839c != null) {
            return this.f49839c;
        }
        ApplicationInfo applicationInfo2 = null;
        try {
            PackageManager packageManager = this.f49838b.getPackageManager();
            String packageName = this.f49838b.getPackageName();
            if (TextUtils.equals(packageName, C11010c.m22280a().getPackageName())) {
                if (C18970b.f52271a == null) {
                    C18970b.f52271a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = C18970b.f52271a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            applicationInfo2 = applicationInfo;
        } catch (NameNotFoundException unused) {
        }
        if (applicationInfo2 == null || applicationInfo2.metaData == null) {
            return Bundle.EMPTY;
        }
        this.f49839c = applicationInfo2.metaData;
        return this.f49839c;
    }
}
