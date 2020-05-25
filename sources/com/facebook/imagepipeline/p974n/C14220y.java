package com.facebook.imagepipeline.p974n;

import android.content.res.AssetManager;
import com.facebook.common.p923g.C13711i;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.y */
public final class C14220y extends C14108ac {

    /* renamed from: a */
    private final AssetManager f37118a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26348a() {
        return "LocalAssetFetchProducer";
    }

    /* renamed from: c */
    private static String m29157c(C14229b bVar) {
        return bVar.mSourceUri.getPath().substring(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14044e mo26347a(C14229b bVar) throws IOException {
        return mo26354b(this.f37118a.open(m29157c(bVar), 2), m29156b(bVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e A[SYNTHETIC, Splitter:B:15:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0025 A[SYNTHETIC, Splitter:B:23:0x0025] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m29156b(com.facebook.imagepipeline.p975o.C14229b r4) {
        /*
            r3 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r3.f37118a     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            java.lang.String r4 = m29157c(r4)     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            android.content.res.AssetFileDescriptor r4 = r1.openFd(r4)     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            long r0 = r4.getLength()     // Catch:{ IOException -> 0x0023, all -> 0x0016 }
            int r0 = (int) r0
            if (r4 == 0) goto L_0x0015
            r4.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r0
        L_0x0016:
            r0 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L_0x001c
        L_0x001b:
            r4 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            throw r4
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r4 == 0) goto L_0x0028
            r4.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14220y.m29156b(com.facebook.imagepipeline.o.b):int");
    }

    public C14220y(Executor executor, C13711i iVar, AssetManager assetManager) {
        super(executor, iVar);
        this.f37118a = assetManager;
    }
}
