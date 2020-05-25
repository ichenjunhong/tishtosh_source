package com.bytedance.android.p140a.p141a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.bytedance.android.p140a.p141a.p142a.C2771a;
import com.bytedance.android.p140a.p141a.p143b.C2776a;
import com.bytedance.android.p140a.p141a.p143b.C2777b;
import com.bytedance.android.p140a.p141a.p144c.C2779a;
import com.bytedance.android.p140a.p141a.p144c.C2780b;
import com.bytedance.android.p140a.p141a.p146e.C2787a;
import com.bytedance.android.p140a.p141a.p148g.C2792a;
import com.bytedance.android.p140a.p141a.p149h.C2796a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.a.a.e */
public final class C2786e extends C2782d {

    /* renamed from: i */
    private static volatile C2786e f8353i;

    /* renamed from: a */
    public boolean f8354a;

    /* renamed from: b */
    public Context f8355b;

    /* renamed from: c */
    public C2792a f8356c;

    /* renamed from: d */
    public C2770a f8357d = new C2770a();

    /* renamed from: e */
    public C2772b f8358e = new C2772b();

    /* renamed from: f */
    public C2776a f8359f;

    /* renamed from: g */
    public C2771a f8360g;

    /* renamed from: h */
    public C2789f f8361h;

    /* renamed from: j */
    private List<Pair<View, C2787a>> f8362j = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public final boolean mo7385b() {
        return this.f8354a;
    }

    /* renamed from: e */
    public final boolean mo7389e() {
        if (!this.f8354a || !this.f8356c.f8388h) {
            return false;
        }
        return true;
    }

    private C2786e() {
    }

    /* renamed from: d */
    public static C2786e m7920d() {
        if (f8353i == null) {
            synchronized (C2786e.class) {
                if (f8353i == null) {
                    f8353i = new C2786e();
                }
            }
        }
        return f8353i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7386c() {
        if (this.f8362j != null && !this.f8362j.isEmpty()) {
            for (Pair pair : this.f8362j) {
                this.f8358e.mo7364a((View) pair.first, (C2787a) pair.second);
            }
            this.f8362j.clear();
        }
    }

    /* renamed from: a */
    public final void mo7380a(C2771a aVar) {
        this.f8360g = aVar;
    }

    /* renamed from: a */
    public final void mo7381a(C2789f fVar) {
        this.f8361h = fVar;
    }

    /* renamed from: a */
    public final void mo7384a(ExecutorService executorService) {
        if (!(executorService == C2779a.f8345a || C2779a.f8345a == null)) {
            C2779a.f8345a.shutdown();
        }
        C2779a.f8345a = executorService;
    }

    /* renamed from: a */
    public final void mo7382a(C2792a aVar) {
        if (mo7385b()) {
            this.f8356c = aVar;
            C2772b bVar = this.f8358e;
            if (m7920d().mo7389e()) {
                C2779a.m7905a(new C2780b() {
                    /* renamed from: a */
                    public final void mo7365a() {
                        try {
                            C2786e.m7920d().f8357d.mo7361a();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo7383a(C2796a aVar) {
        if (mo7385b()) {
            C2772b bVar = this.f8358e;
            if (aVar != null && !TextUtils.isEmpty(aVar.mo7402b())) {
                C2779a.m7905a(new C2780b(aVar) {

                    /* renamed from: a */
                    final /* synthetic */ C2796a f8337a;

                    /* renamed from: a */
                    public final void mo7365a() {
                        C2770a aVar = C2786e.m7920d().f8357d;
                        C2796a aVar2 = this.f8337a;
                        String b = aVar2.mo7402b();
                        C2796a aVar3 = (C2796a) aVar.f8332a.get(b);
                        if (aVar3 != null) {
                            if (aVar3 != aVar2) {
                                StringBuilder sb = new StringBuilder("existing tracker with key:");
                                sb.append(b);
                                sb.append("found, replace it");
                            } else {
                                return;
                            }
                        }
                        aVar.f8332a.put(b, aVar2);
                        aVar2.mo7403c();
                        aVar2.mo7361a();
                        aVar2.mo7404d();
                    }

                    {
                        this.f8337a = r2;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo7379a(Context context, C2792a aVar) {
        if (!this.f8354a && context != null && aVar != null) {
            this.f8355b = context.getApplicationContext();
            this.f8359f = new C2777b(context, "byte_ad_tracker_preferences");
            this.f8356c = aVar;
            this.f8354a = true;
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7388a(android.view.View r16, java.lang.String r17, long r18, java.util.List<java.lang.String> r20, boolean r21, long r22, java.lang.String r24, org.json.JSONObject r25) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r6 = r17
            android.text.TextUtils.isEmpty(r17)
            com.bytedance.android.a.a.c r2 = com.bytedance.android.p140a.p141a.C2778c.m7898a()
            int r3 = r17.hashCode()
            r4 = 9
            r5 = 8
            r7 = 7
            r8 = 6
            r9 = 5
            r10 = 4
            r11 = 1
            r12 = 2
            r13 = 0
            r14 = -1
            switch(r3) {
                case -1877652737: goto L_0x007d;
                case -1353638573: goto L_0x0072;
                case -493575378: goto L_0x0068;
                case -493575290: goto L_0x005e;
                case -493575223: goto L_0x0054;
                case 3443508: goto L_0x004a;
                case 3529469: goto L_0x0040;
                case 94750088: goto L_0x0036;
                case 986870585: goto L_0x002b;
                case 1928152881: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0087
        L_0x0021:
            java.lang.String r3 = "play_valid"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 3
            goto L_0x0088
        L_0x002b:
            java.lang.String r3 = "cpv_15s"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 9
            goto L_0x0088
        L_0x0036:
            java.lang.String r3 = "click"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 1
            goto L_0x0088
        L_0x0040:
            java.lang.String r3 = "show"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 0
            goto L_0x0088
        L_0x004a:
            java.lang.String r3 = "play"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 2
            goto L_0x0088
        L_0x0054:
            java.lang.String r3 = "play_75"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 7
            goto L_0x0088
        L_0x005e:
            java.lang.String r3 = "play_50"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 6
            goto L_0x0088
        L_0x0068:
            java.lang.String r3 = "play_25"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 5
            goto L_0x0088
        L_0x0072:
            java.lang.String r3 = "cpv_6s"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 8
            goto L_0x0088
        L_0x007d:
            java.lang.String r3 = "play_over"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 4
            goto L_0x0088
        L_0x0087:
            r3 = -1
        L_0x0088:
            switch(r3) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x00ad;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a1;
                case 5: goto L_0x009d;
                case 6: goto L_0x0099;
                case 7: goto L_0x0094;
                case 8: goto L_0x0091;
                case 9: goto L_0x008f;
                default: goto L_0x008b;
            }
        L_0x008b:
            r5 = r20
            r4 = -1
            goto L_0x00b4
        L_0x008f:
            r4 = 10
        L_0x0091:
            r5 = r20
            goto L_0x00b4
        L_0x0094:
            r5 = r20
            r4 = 8
            goto L_0x00b4
        L_0x0099:
            r5 = r20
            r4 = 7
            goto L_0x00b4
        L_0x009d:
            r5 = r20
            r4 = 6
            goto L_0x00b4
        L_0x00a1:
            r5 = r20
            r4 = 5
            goto L_0x00b4
        L_0x00a5:
            r5 = r20
            r4 = 4
            goto L_0x00b4
        L_0x00a9:
            r5 = r20
            r4 = 1
            goto L_0x00b4
        L_0x00ad:
            r5 = r20
            r4 = 2
            goto L_0x00b4
        L_0x00b1:
            r5 = r20
            r4 = 0
        L_0x00b4:
            r2.mo7373a(r4, r5)
            com.bytedance.android.a.a.e.b r12 = new com.bytedance.android.a.a.e.b
            r2 = r12
            r3 = r18
            r5 = r20
            r6 = r17
            r7 = r21
            r8 = r22
            r10 = r24
            r11 = r25
            r2.<init>(r3, r5, r6, r7, r8, r10, r11)
            boolean r2 = r15.mo7385b()
            if (r2 == 0) goto L_0x00d7
            com.bytedance.android.a.a.b r2 = r0.f8358e
            r2.mo7364a(r1, r12)
            return
        L_0x00d7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "pending event:"
            r2.<init>(r3)
            java.lang.String r3 = r12.f8364b
            r2.append(r3)
            java.lang.String r3 = "-"
            r2.append(r3)
            java.lang.String r3 = r12.mo7390a()
            r2.append(r3)
            java.util.List<android.util.Pair<android.view.View, com.bytedance.android.a.a.e.a>> r2 = r0.f8362j
            android.util.Pair r1 = android.util.Pair.create(r1, r12)
            r2.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p140a.p141a.C2786e.mo7388a(android.view.View, java.lang.String, long, java.util.List, boolean, long, java.lang.String, org.json.JSONObject):void");
    }
}
