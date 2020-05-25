package com.p683ss.ugc.live.barrage.p2603b;

import com.p683ss.ugc.live.barrage.C51594a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.view.BarrageLayout;
import java.util.Iterator;
import java.util.Random;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.live.barrage.b.d */
public final class C51615d extends C51607a {

    /* renamed from: a */
    private final BarrageLayout f128916a;

    /* renamed from: j */
    private final int f128917j;

    /* renamed from: k */
    private final int f128918k;

    /* renamed from: l */
    private final int f128919l = 7000;

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

    /* renamed from: a */
    public final void mo10735a(C51594a aVar, float f) {
        C52711k.m112240b(aVar, "runningBarrageList");
        float[] fArr = new float[this.f128918k];
        int width = this.f128916a.getWidth();
        int height = this.f128916a.getHeight();
        float f2 = (float) width;
        float f3 = (f / ((float) this.f128919l)) * f2;
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            C51596a aVar2 = (C51596a) it.next();
            if (aVar2.f128881k.right < 0.0f) {
                aVar2.mo105543d();
                aVar.remove((Object) aVar2);
            }
            int height2 = (int) ((aVar2.f128881k.bottom - aVar2.f128881k.height()) / ((float) this.f128917j));
            if (aVar2.f128881k.right > fArr[height2]) {
                fArr[height2] = aVar2.f128881k.right;
            }
            aVar2.f128881k.offset(-f3, 0.0f);
        }
        int nextInt = new Random().nextInt(this.f128918k);
        int i = this.f128918k;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + nextInt;
            if (i3 >= this.f128918k) {
                i3 -= this.f128918k;
            }
            if (this.f128917j * i3 <= height && fArr[i3] < f2) {
                C51596a e = mo105552e();
                if (e != null) {
                    float width2 = e.f128881k.width();
                    float height3 = e.f128881k.height();
                    e.f128881k.left = f2;
                    e.f128881k.right = width2 + f2;
                    e.f128881k.top = (float) (this.f128917j * i3);
                    e.f128881k.bottom = ((float) (i3 * this.f128917j)) + height3;
                    aVar.add(e);
                } else {
                    return;
                }
            }
        }
    }

    public C51615d(BarrageLayout barrageLayout, int i, int i2, int i3) {
        C52711k.m112240b(barrageLayout, "barrageLayout");
        super(barrageLayout);
        this.f128916a = barrageLayout;
        this.f128917j = i;
        this.f128918k = i2;
    }
}
