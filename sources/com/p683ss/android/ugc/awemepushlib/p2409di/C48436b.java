package com.p683ss.android.ugc.awemepushlib.p2409di;

import android.content.Context;
import com.p683ss.android.common.util.MultiProcessSharedProvider;
import com.p683ss.android.common.util.MultiProcessSharedProvider.C18901a;
import com.p683ss.android.push.window.oppo.C19643a;
import com.p683ss.android.ugc.aweme.common.C26883g;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.di.b */
public final class C48436b implements C19643a {
    /* renamed from: a */
    public final void mo40958a(Context context, Map<String, ?> map) {
        try {
            C18901a a = MultiProcessSharedProvider.m46016a(context);
            for (Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    a.mo38754a((String) entry.getKey(), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a.mo38755a((String) entry.getKey(), ((Long) value).longValue());
                } else if (value instanceof Float) {
                    a.mo38753a((String) entry.getKey(), ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    a.mo38757a((String) entry.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    a.mo38756a((String) entry.getKey(), (String) value);
                }
            }
            a.mo38758a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final String mo40956a(Context context, String str, String str2) {
        return MultiProcessSharedProvider.m46020b(context).mo38760a(str, str2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:15|(1:17)|18|(1:20)(1:(1:22))|23|24|25|26|(1:28)|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x016d */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0189 A[Catch:{ Exception -> 0x01a1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m104814a(android.content.Context r16, com.p683ss.android.ugc.awemepushlib.p2406a.C48428b r17, int r18, java.util.HashMap r19) {
        /*
            r0 = r17
            r1 = r18
            com.ss.android.push.window.oppo.c r2 = com.p683ss.android.push.window.oppo.C19645c.m48006a(r16)
            boolean r2 = r2.mo40967a()
            r3 = 0
            if (r2 == 0) goto L_0x01c5
            com.ss.android.ugc.awemepushlib.a.b$a r2 = r0.extra
            int r2 = r2.floatWindow
            r4 = 1
            if (r2 != r4) goto L_0x01c5
            com.p683ss.android.ugc.awemepushlib.interaction.C48444c.m104838a(r0, r3, r1)
            com.ss.android.push.window.oppo.c r2 = com.p683ss.android.push.window.oppo.C19645c.m48006a(r16)
            org.json.JSONObject r5 = r0.originData
            java.lang.String r6 = r0.text
            java.lang.String r7 = r0.title
            int r7 = r0.f121792id
            com.ss.android.ugc.awemepushlib.a.b$a r8 = r0.extra
            java.lang.String r8 = r8.toJsonString()
            com.ss.android.ugc.awemepushlib.di.b$1 r9 = new com.ss.android.ugc.awemepushlib.di.b$1
            r10 = r16
            r11 = r19
            r9.<init>(r10, r0, r1, r11)
            boolean r0 = r2.mo40967a()
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r2.f54128o
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r5.toString()
            r2.mo40966a(r0, r1, r8)
            goto L_0x01c4
        L_0x0047:
            android.content.Context r0 = r2.f54118e     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r10 = "power"
            java.lang.Object r0 = r0.getSystemService(r10)     // Catch:{ Exception -> 0x01a1 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ Exception -> 0x01a1 }
            boolean r10 = r0.isScreenOn()     // Catch:{ Exception -> 0x01a1 }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01a1 }
            r12 = 20
            if (r11 < r12) goto L_0x005f
            boolean r10 = r0.isInteractive()     // Catch:{ Exception -> 0x01a1 }
        L_0x005f:
            if (r10 != 0) goto L_0x006a
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x01a1 }
            r2.mo40966a(r0, r1, r8)     // Catch:{ Exception -> 0x01a1 }
            goto L_0x01c4
        L_0x006a:
            android.view.View r0 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            if (r0 != 0) goto L_0x007e
            android.content.Context r0 = r2.f54118e     // Catch:{ Exception -> 0x01a1 }
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch:{ Exception -> 0x01a1 }
            r1 = 2132215379(0x7f170653, float:2.0074626E38)
            r5 = 0
            android.view.View r0 = r0.inflate(r1, r5)     // Catch:{ Exception -> 0x01a1 }
            r2.f54117d = r0     // Catch:{ Exception -> 0x01a1 }
        L_0x007e:
            android.view.View r0 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            r1 = 2132021031(0x7f140f27, float:1.9680442E38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x01a1 }
            android.view.View r1 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            r5 = 2132022406(0x7f141486, float:1.968323E38)
            android.view.View r1 = r1.findViewById(r5)     // Catch:{ Exception -> 0x01a1 }
            com.ss.android.push.window.oppo.PushWindowScrollView r1 = (com.p683ss.android.push.window.oppo.PushWindowScrollView) r1     // Catch:{ Exception -> 0x01a1 }
            android.view.View r5 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            r8 = 2132023430(0x7f141886, float:1.9685308E38)
            android.view.View r5 = r5.findViewById(r8)     // Catch:{ Exception -> 0x01a1 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x01a1 }
            android.view.View r8 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            r10 = 2132018306(0x7f140482, float:1.9674915E38)
            android.view.View r8 = r8.findViewById(r10)     // Catch:{ Exception -> 0x01a1 }
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch:{ Exception -> 0x01a1 }
            android.view.View r10 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            r11 = 2132023380(0x7f141854, float:1.9685206E38)
            android.view.View r10 = r10.findViewById(r11)     // Catch:{ Exception -> 0x01a1 }
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch:{ Exception -> 0x01a1 }
            android.view.View r11 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            r12 = 2132019581(0x7f14097d, float:1.96775E38)
            android.view.View r11 = r11.findViewById(r12)     // Catch:{ Exception -> 0x01a1 }
            android.widget.ImageView r11 = (android.widget.ImageView) r11     // Catch:{ Exception -> 0x01a1 }
            android.content.Context r12 = r2.f54118e     // Catch:{ Exception -> 0x01a1 }
            r13 = 2132541961(0x7f1c0209, float:2.0737013E38)
            java.lang.String r12 = r12.getString(r13)     // Catch:{ Exception -> 0x01a1 }
            r5.setText(r12)     // Catch:{ Exception -> 0x01a1 }
            r8.setText(r6)     // Catch:{ Exception -> 0x01a1 }
            r5 = 2131955411(0x7f130ed3, float:1.9547349E38)
            r11.setImageResource(r5)     // Catch:{ Exception -> 0x01a1 }
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r6 = "HH:mm"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x01a1 }
            r5.<init>(r6, r8)     // Catch:{ Exception -> 0x01a1 }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x01a1 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a1 }
            r6.<init>(r11)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r5 = r5.format(r6)     // Catch:{ Exception -> 0x01a1 }
            r10.setText(r5)     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams     // Catch:{ Exception -> 0x01a1 }
            r5.<init>()     // Catch:{ Exception -> 0x01a1 }
            r2.f54116c = r5     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            r6 = -2
            r5.height = r6     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            r6 = -1
            r5.width = r6     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            r6 = -3
            r5.format = r6     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            r6 = 16973828(0x1030004, float:2.406091E-38)
            r5.windowAnimations = r6     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            int r6 = r2.f54122i     // Catch:{ Exception -> 0x01a1 }
            r5.type = r6     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            int r6 = r2.f54123j     // Catch:{ Exception -> 0x01a1 }
            r5.flags = r6     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r6 = "Toast"
            r5.setTitle(r6)     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            r6 = 49
            r5.gravity = r6     // Catch:{ Exception -> 0x01a1 }
            r2.f54131r = r3     // Catch:{ Exception -> 0x01a1 }
            com.ss.android.push.window.oppo.c$2 r5 = new com.ss.android.push.window.oppo.c$2     // Catch:{ Exception -> 0x01a1 }
            r5.<init>()     // Catch:{ Exception -> 0x01a1 }
            r1.setOnScrollListener(r5)     // Catch:{ Exception -> 0x01a1 }
            android.view.GestureDetector r1 = new android.view.GestureDetector     // Catch:{ Exception -> 0x01a1 }
            android.content.Context r5 = r2.f54118e     // Catch:{ Exception -> 0x01a1 }
            com.ss.android.push.window.oppo.c$3 r6 = new com.ss.android.push.window.oppo.c$3     // Catch:{ Exception -> 0x01a1 }
            r6.<init>(r7, r3, r9)     // Catch:{ Exception -> 0x01a1 }
            r1.<init>(r5, r6)     // Catch:{ Exception -> 0x01a1 }
            com.ss.android.push.window.oppo.c$4 r5 = new com.ss.android.push.window.oppo.c$4     // Catch:{ Exception -> 0x01a1 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x01a1 }
            r0.setOnTouchListener(r5)     // Catch:{ Exception -> 0x01a1 }
            android.content.Context r0 = r2.f54118e     // Catch:{ Exception -> 0x01a1 }
            com.ss.android.push.window.oppo.d r0 = com.p683ss.android.push.window.oppo.C19655d.m48020a(r0)     // Catch:{ Exception -> 0x01a1 }
            android.content.Context r1 = r0.f54147a     // Catch:{ Exception -> 0x01a1 }
            com.ss.android.push.window.oppo.c r1 = com.p683ss.android.push.window.oppo.C19645c.m48006a(r1)     // Catch:{ Exception -> 0x01a1 }
            boolean r1 = r1.f54126m     // Catch:{ Exception -> 0x01a1 }
            if (r1 != 0) goto L_0x0158
            com.ss.android.push.window.oppo.b<java.lang.Integer, com.ss.android.push.window.oppo.d$a> r0 = r0.f54148b     // Catch:{ Exception -> 0x01a1 }
            r0.mo40961a()     // Catch:{ Exception -> 0x01a1 }
            goto L_0x0166
        L_0x0158:
            if (r7 <= 0) goto L_0x0166
            com.ss.android.push.window.oppo.b<java.lang.Integer, com.ss.android.push.window.oppo.d$a> r1 = r0.f54148b     // Catch:{ Exception -> 0x01a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01a1 }
            r1.mo40959a(r5)     // Catch:{ Exception -> 0x01a1 }
            r0.mo40982a()     // Catch:{ Exception -> 0x01a1 }
        L_0x0166:
            android.view.WindowManager r0 = r2.f54115b     // Catch:{ Exception -> 0x016d }
            android.view.View r1 = r2.f54117d     // Catch:{ Exception -> 0x016d }
            r0.removeView(r1)     // Catch:{ Exception -> 0x016d }
        L_0x016d:
            android.view.View r0 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            r1 = 0
            r0.setTranslationY(r1)     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager r0 = r2.f54115b     // Catch:{ Exception -> 0x01a1 }
            android.view.View r1 = r2.f54117d     // Catch:{ Exception -> 0x01a1 }
            android.view.WindowManager$LayoutParams r5 = r2.f54116c     // Catch:{ Exception -> 0x01a1 }
            r0.addView(r1, r5)     // Catch:{ Exception -> 0x01a1 }
            r2.f54128o = r4     // Catch:{ Exception -> 0x01a1 }
            android.os.Handler r0 = r2.f54119f     // Catch:{ Exception -> 0x01a1 }
            java.lang.Runnable r1 = r2.f54132s     // Catch:{ Exception -> 0x01a1 }
            r0.removeCallbacks(r1)     // Catch:{ Exception -> 0x01a1 }
            boolean r0 = r2.f54127n     // Catch:{ Exception -> 0x01a1 }
            if (r0 == 0) goto L_0x0193
            android.os.Handler r0 = r2.f54119f     // Catch:{ Exception -> 0x01a1 }
            java.lang.Runnable r1 = r2.f54132s     // Catch:{ Exception -> 0x01a1 }
            int r5 = r2.f54124k     // Catch:{ Exception -> 0x01a1 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x01a1 }
            r0.postDelayed(r1, r5)     // Catch:{ Exception -> 0x01a1 }
        L_0x0193:
            android.content.Context r8 = r2.f54118e     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r9 = "pop_window_show"
            long r10 = (long) r7     // Catch:{ Exception -> 0x01a1 }
            r12 = -1
            r14 = 0
            org.json.JSONObject[] r15 = new org.json.JSONObject[r3]     // Catch:{ Exception -> 0x01a1 }
            com.p683ss.android.push.window.oppo.C19645c.m48008a(r8, r9, r10, r12, r14, r15)     // Catch:{ Exception -> 0x01a1 }
            goto L_0x01c4
        L_0x01a1:
            r0 = move-exception
            r2.f54128o = r3
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01c4 }
            r1.<init>()     // Catch:{ JSONException -> 0x01c4 }
            java.lang.String r5 = "error"
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x01c4 }
            r1.put(r5, r0)     // Catch:{ JSONException -> 0x01c4 }
            android.content.Context r8 = r2.f54118e     // Catch:{ JSONException -> 0x01c4 }
            java.lang.String r9 = "pop_window_show_fail"
            long r10 = (long) r7     // Catch:{ JSONException -> 0x01c4 }
            r12 = -1
            r14 = 0
            org.json.JSONObject[] r15 = new org.json.JSONObject[r4]     // Catch:{ JSONException -> 0x01c4 }
            r15[r3] = r1     // Catch:{ JSONException -> 0x01c4 }
            com.p683ss.android.push.window.oppo.C19645c.m48008a(r8, r9, r10, r12, r14, r15)     // Catch:{ JSONException -> 0x01c4 }
            r2.mo40968b()     // Catch:{ JSONException -> 0x01c4 }
        L_0x01c4:
            return r4
        L_0x01c5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.awemepushlib.p2409di.C48436b.m104814a(android.content.Context, com.ss.android.ugc.awemepushlib.a.b, int, java.util.HashMap):boolean");
    }

    /* renamed from: a */
    public final void mo40957a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C26883g.m64994a(context, str, str2, str3, j, j2, jSONObject);
    }
}
