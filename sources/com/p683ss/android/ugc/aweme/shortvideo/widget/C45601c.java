package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p924h.C13718c;
import com.facebook.imagepipeline.p963c.C13948g;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14046g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42658a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45604f.C45605a;
import p064c.p065a.p071d.C1710e;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.c */
final /* synthetic */ class C45601c implements C1710e {

    /* renamed from: a */
    private final C45592a f115346a;

    /* renamed from: b */
    private final C42658a f115347b;

    C45601c(C45592a aVar, C42658a aVar2) {
        this.f115346a = aVar;
        this.f115347b = aVar2;
    }

    public final void accept(Object obj) {
        C13718c cVar;
        C45592a aVar = this.f115346a;
        C42658a aVar2 = this.f115347b;
        Bitmap bitmap = (Bitmap) ((C52847n) obj).getSecond();
        if (bitmap != null && !bitmap.isRecycled()) {
            if (aVar.f115326b) {
                cVar = C13948g.m28419a();
            } else {
                C45605a aVar3 = C45604f.f115350b;
                cVar = (C45604f) C45604f.f115349a.getValue();
            }
            aVar2.mo86959a(C13715a.m27746a(new C14043d(bitmap, cVar, C14046g.f36711a, 0)));
        }
    }
}
