package com.facebook.imagepipeline.p966f;

import android.graphics.Bitmap;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14041b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;

/* renamed from: com.facebook.imagepipeline.f.b */
public abstract class C14024b extends C13744b<C13715a<C14042c>> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9012a(Bitmap bitmap);

    public void onNewResultImpl(C13745c<C13715a<C14042c>> cVar) {
        if (cVar.mo25672b()) {
            C13715a aVar = (C13715a) cVar.mo25674d();
            Bitmap bitmap = null;
            if (aVar != null && (aVar.mo25630a() instanceof C14041b)) {
                bitmap = ((C14041b) aVar.mo25630a()).mo26257d();
            }
            try {
                mo9012a(bitmap);
            } finally {
                C13715a.m27752c(aVar);
            }
        }
    }
}
