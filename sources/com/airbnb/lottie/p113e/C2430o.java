package com.airbnb.lottie.p113e;

import android.support.p030v4.p038f.C0801o;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p115g.C2468a;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: com.airbnb.lottie.e.o */
class C2430o {

    /* renamed from: a */
    private static final Interpolator f7534a = new LinearInterpolator();

    /* renamed from: b */
    private static C0801o<WeakReference<Interpolator>> f7535b;

    C2430o() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m7112a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (C2430o.class) {
            if (f7535b == null) {
                f7535b = new C0801o<>();
            }
            weakReference = (WeakReference) f7535b.mo2591a(i);
        }
        return weakReference;
    }

    /* renamed from: a */
    private static void m7113a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C2430o.class) {
            f7535b.mo2595b(i, weakReference);
        }
    }

    /* renamed from: a */
    private static <T> C2468a<T> m7109a(JsonReader jsonReader, float f, C2415af<T> afVar) throws IOException {
        return new C2468a<>(afVar.mo6783a(jsonReader, f));
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> com.airbnb.lottie.p115g.C2468a<T> m7111a(com.airbnb.lottie.C2408e r18, android.util.JsonReader r19, float r20, com.airbnb.lottie.p113e.C2415af<T> r21) throws java.io.IOException {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r19.beginObject()
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x0012:
            boolean r11 = r19.hasNext()
            if (r11 == 0) goto L_0x00b1
            java.lang.String r11 = r19.nextName()
            r13 = -1
            int r16 = r11.hashCode()
            r3 = 1
            switch(r16) {
                case 101: goto L_0x006c;
                case 104: goto L_0x0062;
                case 105: goto L_0x0058;
                case 111: goto L_0x004e;
                case 115: goto L_0x0044;
                case 116: goto L_0x003a;
                case 3701: goto L_0x0030;
                case 3707: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0076
        L_0x0026:
            java.lang.String r5 = "to"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0076
            r5 = 6
            goto L_0x0077
        L_0x0030:
            java.lang.String r5 = "ti"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0076
            r5 = 7
            goto L_0x0077
        L_0x003a:
            java.lang.String r5 = "t"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0076
            r5 = 0
            goto L_0x0077
        L_0x0044:
            java.lang.String r5 = "s"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0076
            r5 = 1
            goto L_0x0077
        L_0x004e:
            java.lang.String r5 = "o"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0076
            r5 = 3
            goto L_0x0077
        L_0x0058:
            java.lang.String r5 = "i"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0076
            r5 = 4
            goto L_0x0077
        L_0x0062:
            java.lang.String r5 = "h"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0076
            r5 = 5
            goto L_0x0077
        L_0x006c:
            java.lang.String r5 = "e"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0076
            r5 = 2
            goto L_0x0077
        L_0x0076:
            r5 = -1
        L_0x0077:
            switch(r5) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a4;
                case 2: goto L_0x009e;
                case 3: goto L_0x0098;
                case 4: goto L_0x0092;
                case 5: goto L_0x0088;
                case 6: goto L_0x0083;
                case 7: goto L_0x007e;
                default: goto L_0x007a;
            }
        L_0x007a:
            r19.skipValue()
            goto L_0x0012
        L_0x007e:
            android.graphics.PointF r15 = com.airbnb.lottie.p113e.C2428n.m7105b(r19, r20)
            goto L_0x0012
        L_0x0083:
            android.graphics.PointF r14 = com.airbnb.lottie.p113e.C2428n.m7105b(r19, r20)
            goto L_0x0012
        L_0x0088:
            int r5 = r19.nextInt()
            if (r5 != r3) goto L_0x0090
            r6 = 1
            goto L_0x0012
        L_0x0090:
            r6 = 0
            goto L_0x0012
        L_0x0092:
            android.graphics.PointF r8 = com.airbnb.lottie.p113e.C2428n.m7105b(r19, r20)
            goto L_0x0012
        L_0x0098:
            android.graphics.PointF r7 = com.airbnb.lottie.p113e.C2428n.m7105b(r19, r20)
            goto L_0x0012
        L_0x009e:
            java.lang.Object r10 = r2.mo6783a(r0, r1)
            goto L_0x0012
        L_0x00a4:
            java.lang.Object r9 = r2.mo6783a(r0, r1)
            goto L_0x0012
        L_0x00aa:
            double r11 = r19.nextDouble()
            float r12 = (float) r11
            goto L_0x0012
        L_0x00b1:
            r19.endObject()
            if (r6 == 0) goto L_0x00bc
            android.view.animation.Interpolator r0 = f7534a
            r11 = r0
            r10 = r9
            goto L_0x014d
        L_0x00bc:
            if (r7 == 0) goto L_0x014a
            if (r8 == 0) goto L_0x014a
            float r0 = r7.x
            float r2 = -r1
            float r0 = com.airbnb.lottie.p114f.C2453e.m7175b(r0, r2, r1)
            r7.x = r0
            float r0 = r7.y
            r3 = 1120403456(0x42c80000, float:100.0)
            r5 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = com.airbnb.lottie.p114f.C2453e.m7175b(r0, r5, r3)
            r7.y = r0
            float r0 = r8.x
            float r0 = com.airbnb.lottie.p114f.C2453e.m7175b(r0, r2, r1)
            r8.x = r0
            float r0 = r8.y
            float r0 = com.airbnb.lottie.p114f.C2453e.m7175b(r0, r5, r3)
            r8.y = r0
            float r0 = r7.x
            float r2 = r7.y
            float r3 = r8.x
            float r5 = r8.y
            r6 = 17
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x00f9
            r6 = 1141096448(0x4403c000, float:527.0)
            float r0 = r0 * r6
            int r6 = (int) r0
        L_0x00f9:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0103
            int r6 = r6 * 31
            float r0 = (float) r6
            float r0 = r0 * r2
            int r6 = (int) r0
        L_0x0103:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x010d
            int r6 = r6 * 31
            float r0 = (float) r6
            float r0 = r0 * r3
            int r6 = (int) r0
        L_0x010d:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0117
            int r6 = r6 * 31
            float r0 = (float) r6
            float r0 = r0 * r5
            int r6 = (int) r0
        L_0x0117:
            java.lang.ref.WeakReference r0 = m7112a(r6)
            if (r0 == 0) goto L_0x0127
            java.lang.Object r2 = r0.get()
            r5 = r2
            android.view.animation.Interpolator r5 = (android.view.animation.Interpolator) r5
            r17 = r5
            goto L_0x0129
        L_0x0127:
            r17 = 0
        L_0x0129:
            if (r0 == 0) goto L_0x0131
            if (r17 != 0) goto L_0x012e
            goto L_0x0131
        L_0x012e:
            r0 = r17
            goto L_0x014c
        L_0x0131:
            float r0 = r7.x
            float r0 = r0 / r1
            float r2 = r7.y
            float r2 = r2 / r1
            float r3 = r8.x
            float r3 = r3 / r1
            float r4 = r8.y
            float r4 = r4 / r1
            android.view.animation.Interpolator r0 = android.support.p030v4.view.p042b.C1027f.m2954a(r0, r2, r3, r4)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x014c }
            r1.<init>(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x014c }
            m7113a(r6, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x014c }
            goto L_0x014c
        L_0x014a:
            android.view.animation.Interpolator r0 = f7534a
        L_0x014c:
            r11 = r0
        L_0x014d:
            com.airbnb.lottie.g.a r0 = new com.airbnb.lottie.g.a
            r13 = 0
            r7 = r0
            r8 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.f7614g = r14
            r0.f7615h = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p113e.C2430o.m7111a(com.airbnb.lottie.e, android.util.JsonReader, float, com.airbnb.lottie.e.af):com.airbnb.lottie.g.a");
    }

    /* renamed from: a */
    static <T> C2468a<T> m7110a(JsonReader jsonReader, C2408e eVar, float f, C2415af<T> afVar, boolean z) throws IOException {
        if (z) {
            return m7111a(eVar, jsonReader, f, afVar);
        }
        return m7109a(jsonReader, f, afVar);
    }
}
