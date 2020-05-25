package android.support.p043v7.p044a.p045a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.content.p035a.C0710a;
import android.support.p043v7.widget.C1480g;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.a.a.a */
public final class C1124a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3587a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C1125a>> f3588b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3589c = new Object();

    /* renamed from: android.support.v7.a.a.a$a */
    static class C1125a {

        /* renamed from: a */
        final ColorStateList f3590a;

        /* renamed from: b */
        final Configuration f3591b;

        C1125a(ColorStateList colorStateList, Configuration configuration) {
            this.f3590a = colorStateList;
            this.f3591b = configuration;
        }
    }

    /* renamed from: b */
    public static Drawable m3315b(Context context, int i) {
        return C1480g.m5205a().mo5770a(context, i);
    }

    /* renamed from: a */
    public static ColorStateList m3313a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m3317d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m3316c(context, i);
        if (c == null) {
            return C0726c.m2096b(context, i);
        }
        m3314a(context, i, c);
        return c;
    }

    /* renamed from: c */
    private static ColorStateList m3316c(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) f3587a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f3587a.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            z = false;
        }
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return C0710a.m2055a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m3317d(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f3589c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.a.a.a$a>> r1 = f3588b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            android.support.v7.a.a.a$a r2 = (android.support.p043v7.p044a.p045a.C1124a.C1125a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f3591b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f3590a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.p044a.p045a.C1124a.m3317d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static void m3314a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f3589c) {
            SparseArray sparseArray = (SparseArray) f3588b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f3588b.put(context, sparseArray);
            }
            sparseArray.append(i, new C1125a(colorStateList, context.getResources().getConfiguration()));
        }
    }
}
