package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p279af.C4560ab;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.livesdk.widget.g */
public final class C8546g {

    /* renamed from: a */
    private static TypedArray f23435a = C3922z.m9901a().obtainTypedArray(R.array.af);

    /* renamed from: b */
    private static WeakHashMap<C8547a, Bitmap> f23436b = new WeakHashMap<>();

    /* renamed from: c */
    private static WeakReference<Bitmap> f23437c;

    /* renamed from: d */
    private static Random f23438d = new Random();

    /* renamed from: com.bytedance.android.livesdk.widget.g$a */
    static final class C8547a {

        /* renamed from: a */
        public int f23439a;

        /* renamed from: b */
        public int f23440b;

        /* renamed from: c */
        public int f23441c;

        /* renamed from: d */
        public int f23442d = -1;

        public final int hashCode() {
            return ((((((this.f23439a + 629) * 37) + this.f23440b) * 37) + this.f23441c) * 37) + this.f23442d;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C8547a)) {
                return false;
            }
            C8547a aVar = (C8547a) obj;
            if (this.f23440b == aVar.f23440b && this.f23441c == aVar.f23441c && this.f23439a == aVar.f23439a && this.f23442d == aVar.f23442d) {
                return true;
            }
            return false;
        }

        C8547a(int i, int i2, int i3, int i4) {
            this.f23440b = i2;
            this.f23441c = i3;
            this.f23439a = i;
        }
    }

    /* renamed from: a */
    public static Bitmap m16856a(Context context, String str) {
        int i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.qp);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.qo);
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.valueOf(str).intValue();
            } catch (Exception e) {
                C3831a.m9706a(6, "HeartView", e.getStackTrace());
                i = f23438d.nextInt(f23435a.length());
            }
        } else {
            i = f23438d.nextInt(f23435a.length());
            C3831a.m9707a("HeartView", "digg index is null, get random index!");
        }
        if (i < 0) {
            C3831a.m9716d("HeartView", "the index from remote is negative number!");
            i = f23438d.nextInt(f23435a.length());
        }
        if (f23435a.length() <= 0) {
            return null;
        }
        TypedArray typedArray = f23435a;
        return C4560ab.m10953a(context, typedArray.getResourceId(i % typedArray.length(), 0), dimensionPixelSize, dimensionPixelSize2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m16855a(android.content.Context r4, int r5, int r6, int r7) {
        /*
            com.bytedance.android.livesdk.widget.g$a r0 = new com.bytedance.android.livesdk.widget.g$a
            r1 = -1
            r0.<init>(r5, r6, r7, r1)
            java.util.WeakHashMap<com.bytedance.android.livesdk.widget.g$a, android.graphics.Bitmap> r1 = f23436b
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x0017
            boolean r2 = r1.isRecycled()
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = f23437c
            r2 = 0
            if (r1 == 0) goto L_0x003f
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = f23437c
            java.lang.Object r1 = r1.get()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x003d
            int r3 = r1.getWidth()
            if (r3 != r6) goto L_0x0036
            int r3 = r1.getHeight()
            if (r3 == r7) goto L_0x003d
        L_0x0036:
            boolean r3 = r1.isRecycled()
            if (r3 != 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            f23437c = r2
        L_0x003f:
            r1 = r2
        L_0x0040:
            if (r1 != 0) goto L_0x0057
            r1 = 2131956119(0x7f131197, float:1.9548785E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r4, r1)
            if (r1 != 0) goto L_0x004c
            return r2
        L_0x004c:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r4 = f23437c
            if (r4 != 0) goto L_0x0057
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r1)
            f23437c = r4
        L_0x0057:
            r4 = 0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r1, r6, r7, r4)
            if (r4 != 0) goto L_0x005f
            return r2
        L_0x005f:
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>()
            r6.setBitmap(r4)
            android.graphics.Paint r7 = new android.graphics.Paint
            r2 = 3
            r7.<init>(r2)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.<init>(r5, r3)
            r7.setColorFilter(r2)
            r5 = 0
            r6.drawBitmap(r4, r5, r5, r7)
            java.util.WeakHashMap<com.bytedance.android.livesdk.widget.g$a, android.graphics.Bitmap> r5 = f23436b
            r5.put(r0, r4)
            boolean r5 = r1.isRecycled()
            if (r5 != 0) goto L_0x0089
            r1.recycle()
        L_0x0089:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.C8546g.m16855a(android.content.Context, int, int, int):android.graphics.Bitmap");
    }
}
