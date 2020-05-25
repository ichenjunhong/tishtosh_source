package com.p683ss.android.ugc.asve.p1237a;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.asve.p1243f.C20403a;
import com.p683ss.android.vesdk.C50601ah.C50614c;
import com.p683ss.android.vesdk.model.BefTextLayout;
import com.p683ss.android.vesdk.model.BefTextLayoutResult;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.a.a */
public final class C20316a implements C50614c {
    /* renamed from: a */
    public final BefTextLayoutResult mo42959a(String str, BefTextLayout befTextLayout) {
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        C20403a aVar = new C20403a(befTextLayout);
        Bitmap a = aVar.mo43231a(str);
        befTextLayoutResult.setBitmap(a);
        befTextLayoutResult.setLineCount(aVar.f55936c);
        C52711k.m112236a((Object) a, "bitmap");
        befTextLayoutResult.setHeight(a.getHeight());
        befTextLayoutResult.setWidth(a.getWidth());
        return befTextLayoutResult;
    }
}
