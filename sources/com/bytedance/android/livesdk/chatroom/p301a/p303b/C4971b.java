package com.bytedance.android.livesdk.chatroom.p301a.p303b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.p2603b.C51607a;
import com.p683ss.ugc.live.barrage.view.BarrageLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.b.b */
public final class C4971b extends C51607a {

    /* renamed from: a */
    public static final C4972a f13336a = new C4972a(null);

    /* renamed from: j */
    private final float[] f13337j = new float[2];

    /* renamed from: k */
    private final CopyOnWriteArrayList<Float> f13338k = new CopyOnWriteArrayList<>();

    /* renamed from: l */
    private final PathMeasure f13339l = new PathMeasure();

    /* renamed from: m */
    private final BarrageLayout f13340m;

    /* renamed from: n */
    private final Path f13341n;

    /* renamed from: o */
    private final int f13342o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.b.b$a */
    public static final class C4972a {
        private C4972a() {
        }

        public /* synthetic */ C4972a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo10732a() {
        mo105551d();
        this.f13338k.clear();
        super.mo10732a();
    }

    /* renamed from: a */
    public final void mo10734a(C51596a aVar) {
        C52711k.m112240b(aVar, "barrage");
        mo105550c();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.ugc.live.barrage.a, code=com.ss.ugc.live.barrage.a<com.ss.ugc.live.barrage.a.a>, for r14v0, types: [com.ss.ugc.live.barrage.a, com.ss.ugc.live.barrage.a<com.ss.ugc.live.barrage.a.a>, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10735a(com.p683ss.ugc.live.barrage.C51594a<com.p683ss.ugc.live.barrage.p2602a.C51596a> r14, float r15) {
        /*
            r13 = this;
            java.lang.String r0 = "runBarrageList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
            int r0 = r13.f13342o
            float r0 = (float) r0
            float r15 = r15 / r0
            r0 = r14
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0108
            java.lang.Object r1 = r0.next()
            com.ss.ugc.live.barrage.a.a r1 = (com.p683ss.ugc.live.barrage.p2602a.C51596a) r1
            int r5 = r14.indexOf(r1)
            boolean r6 = r1 instanceof com.bytedance.android.livesdk.chatroom.p301a.p302a.C4965a
            if (r6 == 0) goto L_0x0010
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r6 = r13.f13338k
            java.lang.Object r6 = r6.get(r5)
            java.lang.Float r6 = (java.lang.Float) r6
            r7 = 2
            float[] r8 = new float[r7]
            float[] r7 = new float[r7]
            android.graphics.PathMeasure r9 = r13.f13339l
            float r10 = r6.floatValue()
            android.graphics.PathMeasure r11 = r13.f13339l
            float r11 = r11.getLength()
            float r10 = r10 * r11
            r11 = 0
            r9.getPosTan(r10, r8, r11)
            android.graphics.PathMeasure r9 = r13.f13339l
            float r10 = r6.floatValue()
            float r10 = r10 + r15
            android.graphics.PathMeasure r12 = r13.f13339l
            float r12 = r12.getLength()
            float r10 = r10 * r12
            r9.getPosTan(r10, r7, r11)
            android.graphics.RectF r9 = r1.f128881k
            float r10 = r9.top
            r11 = r7[r4]
            r12 = r8[r4]
            float r11 = r11 - r12
            float r10 = r10 + r11
            r9.top = r10
            android.graphics.RectF r9 = r1.f128881k
            float r10 = r9.bottom
            r11 = r7[r4]
            r4 = r8[r4]
            float r11 = r11 - r4
            float r10 = r10 + r11
            r9.bottom = r10
            android.graphics.RectF r4 = r1.f128881k
            float r9 = r4.left
            r10 = r7[r3]
            r11 = r8[r3]
            float r10 = r10 - r11
            float r9 = r9 + r10
            r4.left = r9
            android.graphics.RectF r4 = r1.f128881k
            float r9 = r4.right
            r7 = r7[r3]
            r3 = r8[r3]
            float r7 = r7 - r3
            float r9 = r9 + r7
            r4.right = r9
            float r3 = r6.floatValue()
            float r3 = r3 + r15
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00aa
            r3 = r1
            com.bytedance.android.livesdk.chatroom.a.a.a r3 = (com.bytedance.android.livesdk.chatroom.p301a.p302a.C4965a) r3
            r4 = 1134768947(0x43a33333, float:326.4)
            java.lang.String r7 = "progress"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            float r7 = r6.floatValue()
            float r2 = r2 - r7
            float r2 = r2 - r15
            float r2 = r2 * r4
            int r2 = (int) r2
            r3.f13323b = r2
        L_0x00aa:
            float r2 = r6.floatValue()
            float r2 = r2 + r15
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c9
            r2 = r1
            com.bytedance.android.livesdk.chatroom.a.a.a r2 = (com.bytedance.android.livesdk.chatroom.p301a.p302a.C4965a) r2
            r3 = 1047904911(0x3e75c28f, float:0.24)
            float r4 = r6.floatValue()
            float r4 = r4 + r15
            r7 = 1077097267(0x40333333, float:2.8)
            float r4 = r4 * r7
            float r4 = r4 + r3
            r2.f13324c = r4
        L_0x00c9:
            com.bytedance.android.livesdk.chatroom.a.a.a r1 = (com.bytedance.android.livesdk.chatroom.p301a.p302a.C4965a) r1
            double r2 = r1.f13326e
            float r4 = r6.floatValue()
            double r7 = (double) r4
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r9
            r9 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r7 = r7 * r9
            double r2 = r2 + r7
            double r2 = java.lang.Math.sin(r2)
            r7 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = r2 * r7
            float r2 = (float) r2
            r1.f13325d = r2
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r2 = r13.f13338k
            float r3 = r6.floatValue()
            float r3 = r3 + r15
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2.set(r5, r3)
            int r1 = r1.f13323b
            if (r1 != 0) goto L_0x0010
            r14.remove(r5)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r1 = r13.f13338k
            r1.remove(r5)
            goto L_0x0010
        L_0x0108:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r15 = r13.f13338k
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0110:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r15.next()
            java.lang.Float r0 = (java.lang.Float) r0
            float r1 = r0.floatValue()
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 < 0) goto L_0x0110
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r1 = r13.f13338k
            int r0 = r1.indexOf(r0)
            r14.remove(r0)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r1 = r13.f13338k
            r1.remove(r0)
            goto L_0x0110
        L_0x0135:
            com.ss.ugc.live.barrage.a.a r15 = r13.mo105552e()
            if (r15 != 0) goto L_0x013c
            return
        L_0x013c:
            boolean r0 = r15 instanceof com.bytedance.android.livesdk.chatroom.p301a.p302a.C4965a
            if (r0 == 0) goto L_0x0135
            android.graphics.RectF r0 = r15.f128881k
            float r0 = r0.width()
            android.graphics.RectF r1 = r15.f128881k
            float r1 = r1.height()
            android.graphics.RectF r2 = r15.f128881k
            float[] r5 = r13.f13337j
            r5 = r5[r3]
            r2.left = r5
            android.graphics.RectF r2 = r15.f128881k
            float[] r5 = r13.f13337j
            r5 = r5[r3]
            float r5 = r5 + r0
            r2.right = r5
            android.graphics.RectF r0 = r15.f128881k
            float[] r2 = r13.f13337j
            r2 = r2[r4]
            r0.top = r2
            android.graphics.RectF r0 = r15.f128881k
            float[] r2 = r13.f13337j
            r2 = r2[r4]
            float r2 = r2 + r1
            r0.bottom = r2
            r0 = r15
            com.bytedance.android.livesdk.chatroom.a.a.a r0 = (com.bytedance.android.livesdk.chatroom.p301a.p302a.C4965a) r0
            r1 = 0
            r0.f13324c = r1
            r14.add(r15)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r15 = r13.f13338k
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r15.add(r0)
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p301a.p303b.C4971b.mo10735a(com.ss.ugc.live.barrage.a, float):void");
    }

    public C4971b(BarrageLayout barrageLayout, Path path, int i) {
        C52711k.m112240b(barrageLayout, "barrageView");
        C52711k.m112240b(path, LeakCanaryFileProvider.f132050j);
        super(barrageLayout);
        this.f13340m = barrageLayout;
        this.f13341n = path;
        this.f13342o = i;
        this.f13339l.setPath(this.f13341n, false);
        this.f13339l.getPosTan(0.0f, this.f13337j, null);
    }
}
