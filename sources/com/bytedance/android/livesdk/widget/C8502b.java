package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.p301a.p303b.C4969a;
import com.bytedance.android.livesdkapi.depend.live.C8643b;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.p683ss.ugc.live.barrage.view.BarrageLayout;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Random;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.widget.b */
public final class C8502b implements C8619a, C8643b {

    /* renamed from: a */
    public static final C8503a f23326a = new C8503a(null);

    /* renamed from: b */
    private TypedArray f23327b;

    /* renamed from: c */
    private Bitmap[] f23328c;

    /* renamed from: d */
    private final Random f23329d = new Random();

    /* renamed from: e */
    private C4969a f23330e;

    /* renamed from: f */
    private final C8618a f23331f = new C8618a(this);

    /* renamed from: g */
    private final Context f23332g;

    /* renamed from: h */
    private final ViewGroup f23333h;

    /* renamed from: com.bytedance.android.livesdk.widget.b$a */
    public static final class C8503a {
        private C8503a() {
        }

        public /* synthetic */ C8503a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: e */
    private final boolean m16766e() {
        try {
            TypedArray typedArray = this.f23327b;
            if (typedArray != null) {
                typedArray.length();
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    public final void mo14944b() {
        this.f23331f.removeMessages(12);
        this.f23331f.removeMessages(13);
    }

    /* renamed from: c */
    public final void mo14945c() {
        mo14944b();
        Bitmap[] bitmapArr = this.f23328c;
        if (bitmapArr != null) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
        TypedArray typedArray = this.f23327b;
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    /* renamed from: d */
    private final void m16765d() {
        if (this.f23332g != null && this.f23333h != null) {
            BarrageLayout barrageLayout = new BarrageLayout(this.f23332g, null, 0, 6, null);
            barrageLayout.setLayoutParams(new LayoutParams(-1, -1));
            this.f23333h.addView(barrageLayout);
            this.f23330e = new C4969a(barrageLayout, 1400);
            barrageLayout.m110794a(this.f23330e, barrageLayout.f128921a.size());
            for (int i = 0; i < 10; i++) {
                Path path = new Path();
                path.moveTo((float) C3922z.m9899a(50.0f), (float) C3922z.m9899a(220.0f));
                float f = (float) (((i - 5) * 6) + 50);
                path.quadTo((float) C3922z.m9899a(f), (float) C3922z.m9899a(220.0f), (float) C3922z.m9899a(f), (float) C3922z.m9899a(40.0f));
                C4969a aVar = this.f23330e;
                if (aVar != null) {
                    aVar.mo10733a(path);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14943a() {
        int nextInt = this.f23329d.nextInt(6) + 5;
        long[] jArr = new long[nextInt];
        for (int i = 0; i < nextInt; i++) {
            jArr[i] = (long) this.f23329d.nextInt(3000);
            this.f23331f.sendEmptyMessageDelayed(13, jArr[i]);
        }
        this.f23331f.sendEmptyMessageDelayed(12, 3000);
        StringBuilder sb = new StringBuilder("Barrage count: ");
        sb.append(nextInt);
        sb.append(", at times: ");
        C52711k.m112236a((Object) Arrays.toString(jArr), "java.util.Arrays.toString(this)");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r6 > 0) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11060a(android.os.Message r6) {
        /*
            r5 = this;
            java.lang.String r0 = "msg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            int r6 = r6.what
            switch(r6) {
                case 12: goto L_0x0082;
                case 13: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0086
        L_0x000c:
            boolean r6 = r5.m16766e()
            r0 = 0
            if (r6 != 0) goto L_0x001f
            android.content.res.TypedArray r6 = r5.f23327b
            if (r6 == 0) goto L_0x001c
            int r6 = r6.length()
            goto L_0x001d
        L_0x001c:
            r6 = 0
        L_0x001d:
            if (r6 <= 0) goto L_0x002e
        L_0x001f:
            com.bytedance.android.livesdk.chatroom.a.b.a r6 = r5.f23330e
            r1 = 24
            if (r6 == 0) goto L_0x002a
            int r6 = r6.mo10736b()
            goto L_0x002c
        L_0x002a:
            r6 = 24
        L_0x002c:
            if (r6 < r1) goto L_0x002f
        L_0x002e:
            return
        L_0x002f:
            android.graphics.Bitmap[] r6 = r5.f23328c
            if (r6 == 0) goto L_0x0086
            java.util.Random r1 = r5.f23329d
            int r2 = r6.length
            int r1 = r1.nextInt(r2)
            r2 = r6[r1]
            r3 = 0
            if (r2 == 0) goto L_0x0045
            boolean r2 = r2.isRecycled()
            if (r2 == 0) goto L_0x005d
        L_0x0045:
            android.content.res.TypedArray r2 = r5.f23327b
            if (r2 == 0) goto L_0x005d
            android.content.Context r4 = r5.f23332g
            if (r4 == 0) goto L_0x0052
            android.content.res.Resources r4 = r4.getResources()
            goto L_0x0053
        L_0x0052:
            r4 = r3
        L_0x0053:
            int r2 = r2.getResourceId(r1, r0)
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r4, r2)
            r6[r1] = r2
        L_0x005d:
            r6 = r6[r1]
            if (r6 == 0) goto L_0x0081
            boolean r1 = r6.isRecycled()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r6 = r3
        L_0x006b:
            if (r6 == 0) goto L_0x0081
            com.bytedance.android.livesdk.chatroom.a.b.a r1 = r5.f23330e
            if (r1 == 0) goto L_0x0086
            com.bytedance.android.livesdk.chatroom.a.a.a r2 = new com.bytedance.android.livesdk.chatroom.a.a.a
            java.util.Random r3 = r5.f23329d
            double r3 = r3.nextDouble()
            r2.<init>(r6, r3)
            com.ss.ugc.live.barrage.a.a r2 = (com.p683ss.ugc.live.barrage.p2602a.C51596a) r2
            r1.mo105547a(r2, r0)
        L_0x0081:
            return
        L_0x0082:
            r5.mo14943a()
            return
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.C8502b.mo11060a(android.os.Message):void");
    }

    public C8502b(Context context, ViewGroup viewGroup) {
        TypedArray typedArray;
        this.f23332g = context;
        this.f23333h = viewGroup;
        Resources a = C3922z.m9901a();
        if (a != null) {
            typedArray = a.obtainTypedArray(R.array.af);
        } else {
            typedArray = null;
        }
        this.f23327b = typedArray;
        TypedArray typedArray2 = this.f23327b;
        if (typedArray2 != null) {
            this.f23328c = new Bitmap[typedArray2.length()];
        }
        m16765d();
    }
}
