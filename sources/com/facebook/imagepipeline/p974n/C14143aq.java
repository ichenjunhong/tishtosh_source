package com.facebook.imagepipeline.p974n;

import android.content.ContentResolver;
import com.facebook.common.p923g.C13711i;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.aq */
public final class C14143aq extends C14108ac {

    /* renamed from: a */
    private final ContentResolver f36922a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26348a() {
        return "QualifiedResourceFetchProducer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14044e mo26347a(C14229b bVar) throws IOException {
        return mo26354b(this.f36922a.openInputStream(bVar.mSourceUri), -1);
    }

    public C14143aq(Executor executor, C13711i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f36922a = contentResolver;
    }
}
