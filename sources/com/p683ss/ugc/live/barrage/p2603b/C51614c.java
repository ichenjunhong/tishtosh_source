package com.p683ss.ugc.live.barrage.p2603b;

import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.view.BarrageLayout;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.live.barrage.b.c */
public final class C51614c extends C51607a {

    /* renamed from: a */
    private final BarrageLayout f128912a;

    /* renamed from: j */
    private final int f128913j;

    /* renamed from: k */
    private final int f128914k = 2;

    /* renamed from: l */
    private final int f128915l = 7000;

    /* renamed from: a */
    public final void mo10732a() {
        mo105551d();
        super.mo10732a();
    }

    /* renamed from: a */
    public final void mo10734a(C51596a aVar) {
        C52711k.m112240b(aVar, "barrage");
        mo105550c();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.ugc.live.barrage.a, code=com.ss.ugc.live.barrage.a<com.ss.ugc.live.barrage.a.a>, for r10v0, types: [com.ss.ugc.live.barrage.a, com.ss.ugc.live.barrage.a<com.ss.ugc.live.barrage.a.a>, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10735a(com.p683ss.ugc.live.barrage.C51594a<com.p683ss.ugc.live.barrage.p2602a.C51596a> r10, float r11) {
        /*
            r9 = this;
            java.lang.String r0 = "runningBarrageList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            com.ss.ugc.live.barrage.view.BarrageLayout r0 = r9.f128912a
            int r0 = r0.getWidth()
            com.ss.ugc.live.barrage.view.BarrageLayout r1 = r9.f128912a
            int r1 = r1.getHeight()
            com.ss.ugc.live.barrage.view.BarrageLayout r2 = r9.f128912a
            r2.postInvalidate()
            int r2 = r9.f128914k
            float[] r2 = new float[r2]
            int r3 = r9.f128915l
            float r3 = (float) r3
            float r11 = r11 / r3
            float r0 = (float) r0
            float r11 = r11 * r0
            r3 = r10
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0028:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r3.next()
            com.ss.ugc.live.barrage.a.a r4 = (com.p683ss.ugc.live.barrage.p2602a.C51596a) r4
            android.graphics.RectF r5 = r4.f128881k
            float r5 = r5.right
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            r10.remove(r4)
        L_0x0040:
            android.graphics.RectF r5 = r4.f128881k
            float r5 = r5.bottom
            android.graphics.RectF r7 = r4.f128881k
            float r7 = r7.height()
            float r5 = r5 - r7
            int r7 = r9.f128913j
            float r7 = (float) r7
            float r5 = r5 / r7
            int r5 = (int) r5
            android.graphics.RectF r7 = r4.f128881k
            float r7 = r7.right
            r8 = r2[r5]
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0060
            android.graphics.RectF r7 = r4.f128881k
            float r7 = r7.right
            r2[r5] = r7
        L_0x0060:
            android.graphics.RectF r4 = r4.f128881k
            float r5 = -r11
            r4.offset(r5, r6)
            goto L_0x0028
        L_0x0067:
            r11 = 0
            int r3 = r9.f128914k
        L_0x006a:
            if (r11 >= r3) goto L_0x00ad
            int r4 = r9.f128913j
            int r4 = r4 * r11
            if (r4 > r1) goto L_0x00aa
            r4 = r2[r11]
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00aa
            com.ss.ugc.live.barrage.a.a r4 = r9.mo105552e()
            if (r4 != 0) goto L_0x007f
            return
        L_0x007f:
            android.graphics.RectF r5 = r4.f128881k
            float r5 = r5.width()
            android.graphics.RectF r6 = r4.f128881k
            float r6 = r6.height()
            android.graphics.RectF r7 = r4.f128881k
            r7.left = r0
            android.graphics.RectF r7 = r4.f128881k
            float r5 = r5 + r0
            r7.right = r5
            android.graphics.RectF r5 = r4.f128881k
            int r7 = r9.f128913j
            int r7 = r7 * r11
            float r7 = (float) r7
            r5.top = r7
            android.graphics.RectF r5 = r4.f128881k
            int r7 = r9.f128913j
            int r7 = r7 * r11
            float r7 = (float) r7
            float r7 = r7 + r6
            r5.bottom = r7
            r10.add(r4)
        L_0x00aa:
            int r11 = r11 + 1
            goto L_0x006a
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.live.barrage.p2603b.C51614c.mo10735a(com.ss.ugc.live.barrage.a, float):void");
    }

    public C51614c(BarrageLayout barrageLayout, int i, int i2, int i3) {
        C52711k.m112240b(barrageLayout, "barrageLayout");
        super(barrageLayout);
        this.f128912a = barrageLayout;
        this.f128913j = i;
    }
}
