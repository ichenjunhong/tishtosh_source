package com.airbnb.lottie.p114f;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p104a.p105a.C2309j;
import com.airbnb.lottie.p108c.C2341a;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.C2399f;
import com.airbnb.lottie.p108c.p110b.C2371l;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.List;

/* renamed from: com.airbnb.lottie.f.e */
public final class C2453e {
    /* renamed from: a */
    public static float m7169a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    static int m7170a(float f, float f2) {
        boolean z;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* renamed from: a */
    public static PointF m7172a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m7173a(C2371l lVar, Path path) {
        path.reset();
        PointF pointF = lVar.f7381b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        for (int i = 0; i < lVar.f7380a.size(); i++) {
            C2341a aVar = (C2341a) lVar.f7380a.get(i);
            PointF pointF3 = aVar.f7297a;
            PointF pointF4 = aVar.f7298b;
            PointF pointF5 = aVar.f7299c;
            if (!pointF3.equals(pointF2) || !pointF4.equals(pointF5)) {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path.lineTo(pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
        }
        if (lVar.f7382c) {
            path.close();
        }
    }

    /* renamed from: a */
    public static int m7171a(int i, int i2, int i3) {
        return Math.max(0, Math.min(NormalGiftView.ALPHA_255, i));
    }

    /* renamed from: b */
    public static float m7175b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static void m7174a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2, C2309j jVar) {
        if (eVar.mo6763c(jVar.mo6713b(), i)) {
            list.add(eVar2.mo6760a(jVar.mo6713b()).mo6759a((C2399f) jVar));
        }
    }
}
