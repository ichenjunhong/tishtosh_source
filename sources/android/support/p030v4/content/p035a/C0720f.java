package android.support.p030v4.content.p035a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: android.support.v4.content.a.f */
public final class C0720f {

    /* renamed from: android.support.v4.content.a.f$a */
    public static abstract class C0721a {
        /* renamed from: a */
        public abstract void mo2382a(Typeface typeface);

        /* renamed from: a */
        public final void mo2381a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                }
            });
        }

        /* renamed from: a */
        public final void mo2383a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                    C0721a.this.mo2382a(typeface);
                }
            });
        }
    }

    /* renamed from: a */
    public static Drawable m2075a(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: b */
    public static int m2076b(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: a */
    public static Typeface m2073a(Context context, int i, TypedValue typedValue, int i2, C0721a aVar) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m2074a(context, resources, typedValue, i, i2, aVar, null, true);
        if (a != null || aVar != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[Catch:{ IOException | XmlPullParserException -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[Catch:{ IOException | XmlPullParserException -> 0x00ae }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m2074a(android.content.Context r14, android.content.res.Resources r15, android.util.TypedValue r16, int r17, int r18, android.support.p030v4.content.p035a.C0720f.C0721a r19, android.os.Handler r20, boolean r21) {
        /*
            r0 = r14
            r7 = r15
            r1 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            java.lang.CharSequence r3 = r1.string
            if (r3 == 0) goto L_0x00b4
            java.lang.CharSequence r1 = r1.string
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "res/"
            boolean r3 = r1.startsWith(r3)
            r12 = 0
            r13 = -3
            if (r3 != 0) goto L_0x0026
            if (r10 == 0) goto L_0x0025
            r10.mo2381a(r13, r11)
        L_0x0025:
            return r12
        L_0x0026:
            android.support.v4.f.h<java.lang.String, android.graphics.Typeface> r3 = android.support.p030v4.graphics.C0807c.f2736b
            java.lang.String r4 = android.support.p030v4.graphics.C0807c.m2314a(r15, r8, r9)
            java.lang.Object r3 = r3.mo2501a(r4)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 == 0) goto L_0x003a
            if (r10 == 0) goto L_0x0039
            r10.mo2383a(r3, r11)
        L_0x0039:
            return r3
        L_0x003a:
            java.lang.String r3 = r1.toLowerCase()     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            java.lang.String r4 = ".xml"
            boolean r3 = r3.endsWith(r4)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            if (r3 == 0) goto L_0x009e
            android.content.res.XmlResourceParser r1 = r15.getXml(r8)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            android.support.v4.content.a.c$a r1 = android.support.p030v4.content.p035a.C0712c.m2064a(r1, r15)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            if (r1 != 0) goto L_0x0056
            if (r10 == 0) goto L_0x0055
            r10.mo2381a(r13, r11)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
        L_0x0055:
            return r12
        L_0x0056:
            boolean r3 = r1 instanceof android.support.p030v4.content.p035a.C0712c.C0716d     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            if (r3 == 0) goto L_0x007f
            android.support.v4.content.a.c$d r1 = (android.support.p030v4.content.p035a.C0712c.C0716d) r1     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            r3 = 0
            r4 = 1
            if (r21 == 0) goto L_0x0065
            int r5 = r1.f2512c     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            if (r5 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0065:
            if (r10 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r21 == 0) goto L_0x006f
            int r2 = r1.f2511b     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            r5 = r2
            goto L_0x0071
        L_0x006f:
            r2 = -1
            r5 = -1
        L_0x0071:
            android.support.v4.d.a r1 = r1.f2510a     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            r0 = r14
            r2 = r19
            r3 = r20
            r6 = r18
            android.graphics.Typeface r0 = android.support.p030v4.p036d.C0747b.m2144a(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            goto L_0x0092
        L_0x007f:
            android.support.v4.graphics.h r2 = android.support.p030v4.graphics.C0807c.f2735a     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            android.support.v4.content.a.c$b r1 = (android.support.p030v4.content.p035a.C0712c.C0714b) r1     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            android.graphics.Typeface r0 = r2.mo2663a(r14, r1, r15, r9)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            if (r10 == 0) goto L_0x0092
            if (r0 == 0) goto L_0x008f
            r10.mo2383a(r0, r11)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            goto L_0x0092
        L_0x008f:
            r10.mo2381a(r13, r11)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
        L_0x0092:
            if (r0 == 0) goto L_0x009d
            android.support.v4.f.h<java.lang.String, android.graphics.Typeface> r1 = android.support.p030v4.graphics.C0807c.f2736b     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            java.lang.String r2 = android.support.p030v4.graphics.C0807c.m2314a(r15, r8, r9)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            r1.mo2502a(r2, r0)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
        L_0x009d:
            return r0
        L_0x009e:
            android.graphics.Typeface r0 = android.support.p030v4.graphics.C0807c.m2313a(r14, r15, r8, r1, r9)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            if (r10 == 0) goto L_0x00ad
            if (r0 == 0) goto L_0x00aa
            r10.mo2383a(r0, r11)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
            goto L_0x00ad
        L_0x00aa:
            r10.mo2381a(r13, r11)     // Catch:{ IOException | XmlPullParserException -> 0x00ae }
        L_0x00ad:
            return r0
        L_0x00ae:
            if (r10 == 0) goto L_0x00b3
            r10.mo2381a(r13, r11)
        L_0x00b3:
            return r12
        L_0x00b4:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r3 = r15.getResourceName(r8)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.content.p035a.C0720f.m2074a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.content.a.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
