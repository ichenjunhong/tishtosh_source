package com.facebook.imagepipeline.p974n;

import com.facebook.common.p923g.C13711i;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ad */
public final class C14111ad extends C14108ac {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26348a() {
        return "LocalFileFetchProducer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14044e mo26347a(C14229b bVar) throws IOException {
        return mo26354b(new FileInputStream(bVar.getSourceFile().toString()), (int) bVar.getSourceFile().length());
    }

    public C14111ad(Executor executor, C13711i iVar) {
        super(executor, iVar);
    }
}
