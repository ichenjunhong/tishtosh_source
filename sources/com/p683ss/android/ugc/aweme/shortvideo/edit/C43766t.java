package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.graphics.RectF;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.vesdk.VESize;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.t */
public final class C43766t {

    /* renamed from: a */
    public static final C43766t f110830a = new C43766t();

    /* renamed from: b */
    private static final String f110831b = f110831b;

    private C43766t() {
    }

    /* renamed from: a */
    public static final boolean m96200a(C20347c cVar, C43449bd bdVar, C43658m... mVarArr) {
        C52711k.m112240b(cVar, "veEditor");
        C52711k.m112240b(bdVar, "sizeProvider");
        C52711k.m112240b(mVarArr, "controllers");
        if (bdVar.mo88379a() == bdVar.mo88243a(true) && bdVar.mo88380b() == bdVar.mo88244b(true)) {
            return false;
        }
        VESize b = cVar.mo43037b();
        int a = bdVar.mo88243a(true);
        int b2 = bdVar.mo88244b(true);
        bdVar.mo88379a();
        bdVar.mo88380b();
        float f = (((float) b.height) - (((float) b2) * ((((float) b.width) * 1.0f) / ((float) a)))) / 2.0f;
        RectF rectF = new RectF();
        rectF.set(0.0f, f, (float) b.width, ((float) b.height) - f);
        boolean z = false;
        for (int i = 0; i < 6; i++) {
            C43658m mVar = mVarArr[i];
            if (mVar != null) {
                z |= mVar.mo88639a(rectF);
            }
        }
        return z;
    }
}
