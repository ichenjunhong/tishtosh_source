package com.p683ss.android.ugc.awemepushlib.p2408c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.common.util.C18920g;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.c.a */
public final class C48432a {
    /* renamed from: a */
    private static boolean m104794a(int i) {
        return i == 1 || i == 4;
    }

    /* renamed from: b */
    public static boolean m104798b() {
        try {
            return true ^ "Hisense".equalsIgnoreCase(Build.BRAND);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m104793a() {
        if (C11016e.m22312g() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m104799c() {
        try {
            if (C18920g.m46057d()) {
                return true;
            }
            if (VERSION.SDK_INT > 20 && C18920g.m46047a()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m104792a(Runnable runnable) {
        if (C9432q.m18684a()) {
            C9393e.submitRunnable(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static boolean m104796a(Map map) {
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m104795a(int i, Context context, Intent intent) {
        if (i != 0) {
            return false;
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m104797a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.support.v4.app.aa$g] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14, types: [android.support.v4.app.aa$f] */
    /* JADX WARNING: type inference failed for: r3v17, types: [android.support.v4.app.aa$e] */
    /* JADX WARNING: type inference failed for: r3v20, types: [android.support.v4.app.aa$c] */
    /* JADX WARNING: type inference failed for: r3v21, types: [android.support.v4.media.a.a$a] */
    /* JADX WARNING: type inference failed for: r13v38, types: [android.support.v4.app.aa$b] */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x03c8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
      assigns: [?[OBJECT, ARRAY], android.support.v4.app.aa$f, android.support.v4.app.aa$e, android.support.v4.app.aa$c]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.support.v4.app.aa$g, android.support.v4.app.aa$f, android.support.v4.app.aa$e, android.support.v4.app.aa$c]
      mth insns count: 361
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03d0 A[Catch:{ Exception -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03d1 A[Catch:{ Exception -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03d4 A[Catch:{ Exception -> 0x03fa }] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification m104791a(android.content.Context r17, com.p683ss.android.ugc.awemepushlib.p2406a.C48428b r18, android.graphics.Bitmap r19, android.graphics.Bitmap r20, android.content.Intent r21, boolean r22) {
        /*
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            int r5 = r0.pass_through
            boolean r5 = m104795a(r5, r1, r4)
            r6 = 0
            if (r5 == 0) goto L_0x0014
            return r6
        L_0x0014:
            r5 = 0
            if (r2 != 0) goto L_0x0019
            r0.imageType = r5
        L_0x0019:
            if (r3 == 0) goto L_0x001d
            r7 = r3
            goto L_0x001e
        L_0x001d:
            r7 = r2
        L_0x001e:
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.p683ss.android.ugc.awemepushlib.interaction.C48442b.m104831a(r8)
            com.bytedance.ies.abmock.b r9 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.awemepushapi.PushSettingExperiment> r10 = com.p683ss.android.ugc.awemepushapi.PushSettingExperiment.class
            r11 = 0
            java.lang.String r12 = "enable_notification_category"
            r13 = 31744(0x7c00, float:4.4483E-41)
            r14 = 0
            boolean r8 = r9.mo18172a(r10, r11, r12, r13, r14)
            r9 = 1
            if (r8 == 0) goto L_0x0078
            com.p683ss.android.ugc.awemepushlib.interaction.C48442b.m104833b(r17)
            com.ss.android.ugc.awemepushlib.a.b$a r8 = r0.extra
            java.lang.String r8 = r8.notificationChannelId
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0070
            com.ss.android.ugc.awemepushlib.a.b$a r8 = r0.extra
            java.lang.String r8 = r8.notificationChannelId
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            if (r10 < r11) goto L_0x0062
            if (r1 != 0) goto L_0x0052
            goto L_0x0062
        L_0x0052:
            java.lang.String r10 = "notification"
            java.lang.Object r10 = r1.getSystemService(r10)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            android.app.NotificationChannel r8 = r10.getNotificationChannel(r8)
            if (r8 == 0) goto L_0x0062
            r8 = 1
            goto L_0x0063
        L_0x0062:
            r8 = 0
        L_0x0063:
            if (r8 != 0) goto L_0x0066
            goto L_0x0070
        L_0x0066:
            android.support.v4.app.aa$d r8 = new android.support.v4.app.aa$d
            com.ss.android.ugc.awemepushlib.a.b$a r10 = r0.extra
            java.lang.String r10 = r10.notificationChannelId
            r8.<init>(r1, r10)
            goto L_0x0082
        L_0x0070:
            android.support.v4.app.aa$d r8 = new android.support.v4.app.aa$d
            java.lang.String r10 = "other_channel"
            r8.<init>(r1, r10)
            goto L_0x0082
        L_0x0078:
            com.p683ss.android.ugc.awemepushlib.interaction.C48442b.m104834c(r17)
            android.support.v4.app.aa$d r8 = new android.support.v4.app.aa$d
            java.lang.String r10 = "com.ss.android.ugc.aweme.server"
            r8.<init>(r1, r10)
        L_0x0082:
            java.lang.String r10 = r0.title
            boolean r10 = com.bytedance.common.utility.C9431p.m18664a(r10)
            if (r10 == 0) goto L_0x0093
            r10 = 2132541964(0x7f1c020c, float:2.073702E38)
            java.lang.String r10 = r1.getString(r10)
            r0.title = r10
        L_0x0093:
            java.lang.String r10 = r0.title
            android.support.v4.app.aa$d r10 = r8.mo2131d(r10)
            r10.mo2126b(r9)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 20
            if (r10 <= r11) goto L_0x00a9
            r10 = 2131955412(0x7f130ed4, float:1.954735E38)
            r8.mo2111a(r10)
            goto L_0x00af
        L_0x00a9:
            r10 = 2131955411(0x7f130ed3, float:1.9547349E38)
            r8.mo2111a(r10)
        L_0x00af:
            boolean r10 = r0.led
            if (r10 == 0) goto L_0x00e0
            android.app.Notification r10 = r8.f2200N
            r12 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r10.ledARGB = r12
            android.app.Notification r10 = r8.f2200N
            r12 = 1000(0x3e8, float:1.401E-42)
            r10.ledOnMS = r12
            android.app.Notification r10 = r8.f2200N
            r12 = 2500(0x9c4, float:3.503E-42)
            r10.ledOffMS = r12
            android.app.Notification r10 = r8.f2200N
            int r10 = r10.ledOnMS
            if (r10 == 0) goto L_0x00d4
            android.app.Notification r10 = r8.f2200N
            int r10 = r10.ledOffMS
            if (r10 == 0) goto L_0x00d4
            r10 = 1
            goto L_0x00d5
        L_0x00d4:
            r10 = 0
        L_0x00d5:
            android.app.Notification r12 = r8.f2200N
            android.app.Notification r13 = r8.f2200N
            int r13 = r13.flags
            r13 = r13 & -2
            r10 = r10 | r13
            r12.flags = r10
        L_0x00e0:
            com.ss.android.ugc.awemepushlib.a.b$a r10 = r0.extra
            boolean r10 = r10.isGroupSummary
            if (r10 != 0) goto L_0x00f0
            java.lang.String r10 = "defaultGroup"
            r8.f2222u = r10
            com.ss.android.ugc.awemepushlib.a.b$a r10 = r0.extra
            boolean r10 = r10.isGroupSummary
            r8.f2223v = r10
        L_0x00f0:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            r12 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r1, r5, r10, r12)
            int r13 = r0.imageType
            boolean r13 = m104794a(r13)
            if (r13 == 0) goto L_0x013a
            if (r2 == 0) goto L_0x013a
            android.support.v4.app.aa$b r13 = new android.support.v4.app.aa$b
            r13.<init>()
            r13.f2183a = r2
            java.lang.String r14 = r0.title
            android.support.v4.app.aa$b r13 = r13.mo2104a(r14)
            java.lang.String r14 = r0.text
            android.support.v4.app.aa$b r13 = r13.mo2106b(r14)
            if (r3 == 0) goto L_0x011e
            r13.mo2103a(r3)
            goto L_0x0137
        L_0x011e:
            android.content.res.Resources r3 = r17.getResources()
            int r14 = com.p683ss.android.ugc.awemepushlib.R$drawable.icon
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r14)
            boolean r14 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r14 == 0) goto L_0x0133
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            goto L_0x0134
        L_0x0133:
            r3 = r6
        L_0x0134:
            r13.mo2103a(r3)
        L_0x0137:
            r3 = r13
            goto L_0x01f9
        L_0x013a:
            int r3 = r0.imageType
            r13 = 5
            if (r3 != r13) goto L_0x0153
            android.support.v4.media.a.a$a r3 = new android.support.v4.media.a.a$a
            r3.<init>()
            android.support.v4.media.session.MediaSessionCompat r13 = new android.support.v4.media.session.MediaSessionCompat
            java.lang.String r14 = "notification"
            r13.<init>(r1, r14)
            android.support.v4.media.session.MediaSessionCompat$Token r13 = r13.mo2800a()
            r3.f2954b = r13
            goto L_0x01f9
        L_0x0153:
            int r3 = r0.imageType
            r13 = 6
            if (r3 != r13) goto L_0x017c
            android.support.v4.app.aa$c r3 = new android.support.v4.app.aa$c
            r3.<init>()
            java.lang.String r13 = r0.title
            android.support.v4.app.aa$c r3 = r3.mo2107a(r13)
            java.lang.String r13 = r0.text
            android.support.v4.app.aa$c r3 = r3.mo2108b(r13)
            com.ss.android.ugc.awemepushlib.a.b$a r13 = r0.extra
            java.lang.String r13 = r13.extra_text
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x01f9
            com.ss.android.ugc.awemepushlib.a.b$a r13 = r0.extra
            java.lang.String r13 = r13.extra_text
            r3.mo2109c(r13)
            goto L_0x01f9
        L_0x017c:
            int r3 = r0.imageType
            r13 = 7
            if (r3 != r13) goto L_0x01ba
            android.support.v4.app.aa$e r3 = new android.support.v4.app.aa$e
            r3.<init>()
            java.lang.String r13 = r0.title
            android.support.v4.app.aa$e r3 = r3.mo2133a(r13)
            java.lang.String r13 = r0.text
            android.support.v4.app.aa$e r3 = r3.mo2134b(r13)
            com.ss.android.ugc.awemepushlib.a.b$a r13 = r0.extra
            java.lang.String r13 = r13.extra_text
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x01f9
            com.ss.android.ugc.awemepushlib.a.b$a r13 = r0.extra
            java.lang.String r13 = r13.extra_text
            java.lang.String r14 = "\n"
            java.lang.String[] r13 = r13.split(r14)
            int r14 = r13.length
            r15 = 0
        L_0x01a8:
            if (r15 >= r14) goto L_0x01f9
            r12 = r13[r15]
            boolean r16 = android.text.TextUtils.isEmpty(r12)
            if (r16 != 0) goto L_0x01b5
            r3.mo2135c(r12)
        L_0x01b5:
            int r15 = r15 + 1
            r12 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x01a8
        L_0x01ba:
            int r3 = r0.imageType
            r12 = 8
            if (r3 != r12) goto L_0x01f8
            android.support.v4.app.aa$f r3 = new android.support.v4.app.aa$f
            java.lang.String r12 = ""
            r3.<init>(r12)
            java.lang.String r12 = r0.title
            r3.f2231c = r12
            java.lang.String r12 = r0.text
            long r13 = java.lang.System.currentTimeMillis()
            java.util.List<android.support.v4.app.aa$f$a> r15 = r3.f2229a
            android.support.v4.app.aa$f$a r9 = new android.support.v4.app.aa$f$a
            android.support.v4.app.af$a r11 = new android.support.v4.app.af$a
            r11.<init>()
            android.support.v4.app.af$a r11 = r11.mo2155a(r6)
            android.support.v4.app.af r11 = r11.mo2156a()
            r9.<init>(r12, r13, r11)
            r15.add(r9)
            java.util.List<android.support.v4.app.aa$f$a> r9 = r3.f2229a
            int r9 = r9.size()
            r11 = 25
            if (r9 <= r11) goto L_0x01f9
            java.util.List<android.support.v4.app.aa$f$a> r9 = r3.f2229a
            r9.remove(r5)
            goto L_0x01f9
        L_0x01f8:
            r3 = r6
        L_0x01f9:
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 20
            if (r9 <= r11) goto L_0x020d
            com.ss.android.ugc.awemepushlib.a.b$a r9 = r0.extra
            boolean r9 = r9.is_notification_top
            if (r9 == 0) goto L_0x020d
            r8.f2208g = r10
            r9 = 128(0x80, float:1.794E-43)
            r10 = 1
            r8.mo2121a(r9, r10)
        L_0x020d:
            int r9 = r0.imageType
            boolean r9 = m104794a(r9)
            if (r9 == 0) goto L_0x021a
            if (r7 == 0) goto L_0x021a
            r8.mo2115a(r7)
        L_0x021a:
            com.ss.android.ugc.awemepushlib.a.b$a r9 = r0.extra
            int r9 = r9.getPriority()
            r8.mo2128c(r9)
            com.ss.android.ugc.awemepushlib.a.b$a r9 = r0.extra
            boolean r9 = r9.isZeroVibrate
            if (r9 == 0) goto L_0x022f
            long[] r9 = new long[r5]
            android.app.Notification r10 = r8.f2200N
            r10.vibrate = r9
        L_0x022f:
            com.ss.android.ugc.awemepushlib.a.b$a r9 = r0.extra
            java.lang.String r9 = r9.bg_color
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0244
            com.ss.android.ugc.awemepushlib.a.b$a r9 = r0.extra
            java.lang.String r9 = r9.bg_color
            int r9 = android.graphics.Color.parseColor(r9)
            r8.mo2130d(r9)
        L_0x0244:
            java.lang.String r9 = r0.title
            android.support.v4.app.aa$d r9 = r8.mo2118a(r9)
            java.lang.String r10 = r0.text
            android.support.v4.app.aa$d r9 = r9.mo2125b(r10)
            long r10 = java.lang.System.currentTimeMillis()
            r9.mo2113a(r10)
            com.ss.android.ugc.awemepushlib.a.b$a r9 = r0.extra
            int r9 = r9.visibility
            r8.mo2132e(r9)
            boolean r9 = m104799c()
            if (r9 != 0) goto L_0x026d
            com.ss.android.ugc.awemepushlib.a.b$a r9 = r0.extra
            boolean r9 = r9.user_system_style
            if (r9 == 0) goto L_0x026b
            goto L_0x026d
        L_0x026b:
            r9 = 0
            goto L_0x026e
        L_0x026d:
            r9 = 1
        L_0x026e:
            r10 = 2
            r11 = 3
            if (r9 != 0) goto L_0x0333
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r9 = "HH:mm"
            java.util.Locale r12 = java.util.Locale.getDefault()
            r2.<init>(r9, r12)
            java.util.Date r9 = new java.util.Date
            long r12 = java.lang.System.currentTimeMillis()
            r9.<init>(r12)
            java.lang.String r2 = r2.format(r9)
            java.lang.String r9 = r17.getPackageName()
            int r12 = r0.imageType
            if (r12 != r11) goto L_0x029b
            android.widget.RemoteViews r12 = new android.widget.RemoteViews
            r13 = 2132215457(0x7f1706a1, float:2.0074785E38)
            r12.<init>(r9, r13)
            goto L_0x02b1
        L_0x029b:
            int r12 = r0.imageType
            r13 = 1
            if (r12 != r13) goto L_0x02a9
            android.widget.RemoteViews r12 = new android.widget.RemoteViews
            r13 = 2132215456(0x7f1706a0, float:2.0074783E38)
            r12.<init>(r9, r13)
            goto L_0x02b1
        L_0x02a9:
            android.widget.RemoteViews r12 = new android.widget.RemoteViews
            r13 = 2132215455(0x7f17069f, float:2.007478E38)
            r12.<init>(r9, r13)
        L_0x02b1:
            r9 = 2132023392(0x7f141860, float:1.968523E38)
            java.lang.String r13 = r0.title
            r12.setTextViewText(r9, r13)
            r9 = 2132023286(0x7f1417f6, float:1.9685016E38)
            java.lang.String r13 = r0.text
            r12.setTextViewText(r9, r13)
            r9 = 2132023369(0x7f141849, float:1.9685184E38)
            r12.setTextViewText(r9, r2)
            int r2 = r0.imageType
            boolean r2 = m104794a(r2)
            r9 = 2132019564(0x7f14096c, float:1.9677466E38)
            if (r2 == 0) goto L_0x02d8
            if (r7 == 0) goto L_0x02d8
            r12.setImageViewBitmap(r9, r7)
            goto L_0x02dd
        L_0x02d8:
            int r2 = com.p683ss.android.ugc.awemepushlib.R$drawable.icon
            r12.setImageViewResource(r9, r2)
        L_0x02dd:
            int r2 = android.os.Build.VERSION.SDK_INT
            r13 = 20
            if (r2 <= r13) goto L_0x02fe
            boolean r2 = com.bytedance.ies.uikit.p699c.C11088a.m22439a(r17)     // Catch:{ Throwable -> 0x02fd }
            if (r2 == 0) goto L_0x02fe
            r2 = 2132022394(0x7f14147a, float:1.9683206E38)
            java.lang.String r13 = "setBackgroundColor"
            android.content.res.Resources r14 = r17.getResources()     // Catch:{ Throwable -> 0x02fd }
            r15 = 2131821670(0x7f110466, float:1.927609E38)
            int r14 = r14.getColor(r15)     // Catch:{ Throwable -> 0x02fd }
            r12.setInt(r2, r13, r14)     // Catch:{ Throwable -> 0x02fd }
            goto L_0x02fe
        L_0x02fd:
        L_0x02fe:
            int r2 = r0.imageType
            if (r2 == r10) goto L_0x030d
            if (r2 == r11) goto L_0x030d
            r13 = 1
            if (r2 == r13) goto L_0x030d
            r13 = 4
            if (r2 != r13) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r2 = 0
            goto L_0x030e
        L_0x030d:
            r2 = 1
        L_0x030e:
            if (r2 == 0) goto L_0x0330
            if (r7 == 0) goto L_0x0330
            int r2 = r7.getWidth()     // Catch:{ Exception -> 0x0330 }
            int r13 = r7.getHeight()     // Catch:{ Exception -> 0x0330 }
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0330 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r13, r14)     // Catch:{ Exception -> 0x0330 }
            android.graphics.Canvas r13 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0330 }
            r13.<init>(r2)     // Catch:{ Exception -> 0x0330 }
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0330 }
            r14.<init>()     // Catch:{ Exception -> 0x0330 }
            r13.drawBitmap(r7, r14, r6)     // Catch:{ Exception -> 0x0330 }
            r12.setImageViewBitmap(r9, r2)     // Catch:{ Exception -> 0x0330 }
        L_0x0330:
            r8.f2192F = r12
            goto L_0x0372
        L_0x0333:
            if (r2 == 0) goto L_0x0359
            int r7 = r0.imageType
            if (r7 == 0) goto L_0x0359
            int r7 = r19.getWidth()     // Catch:{ Exception -> 0x0355 }
            int r9 = r19.getHeight()     // Catch:{ Exception -> 0x0355 }
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0355 }
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r9, r12)     // Catch:{ Exception -> 0x0355 }
            android.graphics.Canvas r9 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0355 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x0355 }
            android.graphics.Matrix r12 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0355 }
            r12.<init>()     // Catch:{ Exception -> 0x0355 }
            r9.drawBitmap(r2, r12, r6)     // Catch:{ Exception -> 0x0355 }
            r2 = r7
        L_0x0355:
            r8.mo2115a(r2)
            goto L_0x0372
        L_0x0359:
            android.content.res.Resources r2 = r17.getResources()
            int r7 = com.p683ss.android.ugc.awemepushlib.R$drawable.icon
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r7)
            boolean r7 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r7 == 0) goto L_0x036e
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r2 = r2.getBitmap()
            goto L_0x036f
        L_0x036e:
            r2 = r6
        L_0x036f:
            r8.mo2115a(r2)
        L_0x0372:
            if (r3 == 0) goto L_0x0377
            r8.mo2117a(r3)
        L_0x0377:
            java.lang.String r2 = r0.soundUrl     // Catch:{ Exception -> 0x03fa }
            android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x03fa }
            boolean r2 = r0.sound     // Catch:{ Exception -> 0x03fa }
            if (r2 != 0) goto L_0x0384
            boolean r2 = r0.useSound     // Catch:{ Exception -> 0x03fa }
            if (r2 == 0) goto L_0x03a6
        L_0x0384:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r3 = "android.resource://"
            r2.<init>(r3)     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r3 = r17.getPackageName()     // Catch:{ Exception -> 0x03a0 }
            r2.append(r3)     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r3 = "/2132475912"
            r2.append(r3)     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03a0 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x03a1
        L_0x03a0:
            r2 = r6
        L_0x03a1:
            if (r2 == 0) goto L_0x03a9
            r8.mo2116a(r2)     // Catch:{ Exception -> 0x03fa }
        L_0x03a6:
            r2 = 1
            r3 = 0
            goto L_0x03ae
        L_0x03a9:
            r2 = 1
            r8.mo2123b(r2)     // Catch:{ Exception -> 0x03fa }
            r3 = 1
        L_0x03ae:
            boolean r0 = r0.vibrator     // Catch:{ Exception -> 0x03fa }
            if (r0 == 0) goto L_0x03c8
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Throwable -> 0x03c8 }
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch:{ Throwable -> 0x03c8 }
            int r0 = r0.getRingerMode()     // Catch:{ Throwable -> 0x03c8 }
            switch(r0) {
                case 0: goto L_0x03c8;
                case 1: goto L_0x03c2;
                case 2: goto L_0x03c2;
                default: goto L_0x03c1;
            }     // Catch:{ Throwable -> 0x03c8 }
        L_0x03c1:
            goto L_0x03c8
        L_0x03c2:
            if (r3 == 0) goto L_0x03c5
            r10 = 3
        L_0x03c5:
            r8.mo2123b(r10)     // Catch:{ Throwable -> 0x03c8 }
        L_0x03c8:
            com.ss.android.ugc.awemepushlib.manager.a r0 = com.p683ss.android.ugc.awemepushlib.manager.C48479a.m104895a()     // Catch:{ Exception -> 0x03fa }
            int r0 = r0.f121885j     // Catch:{ Exception -> 0x03fa }
            if (r0 <= 0) goto L_0x03d1
            goto L_0x03d2
        L_0x03d1:
            r2 = 0
        L_0x03d2:
            if (r2 == 0) goto L_0x03ee
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x03fa }
            java.lang.Class<com.ss.android.ugc.awemepushlib.os.receiver.NotificationBroadcastReceiver> r2 = com.p683ss.android.ugc.awemepushlib.p2410os.receiver.NotificationBroadcastReceiver.class
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x03fa }
            java.lang.String r2 = "notification_cancelled"
            r0.setAction(r2)     // Catch:{ Exception -> 0x03fa }
            java.lang.String r2 = "contentIntentURI"
            r0.putExtra(r2, r4)     // Catch:{ Exception -> 0x03fa }
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r1, r5, r0, r2)     // Catch:{ Exception -> 0x03fa }
            r8.mo2124b(r0)     // Catch:{ Exception -> 0x03fa }
        L_0x03ee:
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r5, r4, r5)     // Catch:{ Exception -> 0x03fa }
            r8.mo2114a(r0)     // Catch:{ Exception -> 0x03fa }
            android.app.Notification r0 = r8.mo2122b()     // Catch:{ Exception -> 0x03fa }
            return r0
        L_0x03fa:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "can not get launch intent: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.bytedance.ies.p672e.C10752a.m21792a(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.awemepushlib.p2408c.C48432a.m104791a(android.content.Context, com.ss.android.ugc.awemepushlib.a.b, android.graphics.Bitmap, android.graphics.Bitmap, android.content.Intent, boolean):android.app.Notification");
    }
}
