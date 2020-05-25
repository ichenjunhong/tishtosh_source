package com.facebook.imagepipeline.p974n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p927k.C13731f;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imageutils.C14256e;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.aa */
public class C14104aa extends C14108ac implements C14171bb<C14044e> {

    /* renamed from: a */
    private static final Class<?> f36828a = C14104aa.class;

    /* renamed from: b */
    private static final String[] f36829b = {"_id", "_data"};

    /* renamed from: c */
    private static final String[] f36830c = {"_data"};

    /* renamed from: d */
    private static final Rect f36831d = new Rect(0, 0, UnReadVideoExperiment.LIKE_USER_LIST, 384);

    /* renamed from: e */
    private static final Rect f36832e = new Rect(0, 0, 96, 96);

    /* renamed from: f */
    private final ContentResolver f36833f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26348a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14044e mo26347a(C14229b bVar) throws IOException {
        Uri uri = bVar.mSourceUri;
        if (C13731f.m27781e(uri)) {
            C14044e a = m28875a(uri, bVar.mResizeOptions);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static int m28874a(String str) {
        if (str != null) {
            try {
                return C14256e.m29213a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e) {
                C13697a.m27688b(f36828a, e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo26349a(C13952d dVar) {
        return C14172bc.m29044a(f36831d.width(), f36831d.height(), dVar);
    }

    /* renamed from: a */
    private C14044e m28875a(Uri uri, C13952d dVar) throws IOException {
        Cursor query = this.f36833f.query(uri, f36829b, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (dVar != null) {
                C14044e a = m28876a(dVar, query.getInt(query.getColumnIndex("_id")));
                if (a != null) {
                    a.f36703d = m28874a(string);
                    query.close();
                    return a;
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.p970j.C14044e m28876a(com.facebook.imagepipeline.common.C13952d r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            android.graphics.Rect r0 = f36832e
            int r0 = r0.width()
            android.graphics.Rect r1 = f36832e
            int r1 = r1.height()
            boolean r0 = com.facebook.imagepipeline.p974n.C14172bc.m29044a(r0, r1, r5)
            if (r0 == 0) goto L_0x0014
            r5 = 3
            goto L_0x0029
        L_0x0014:
            android.graphics.Rect r0 = f36831d
            int r0 = r0.width()
            android.graphics.Rect r1 = f36831d
            int r1 = r1.height()
            boolean r5 = com.facebook.imagepipeline.p974n.C14172bc.m29044a(r0, r1, r5)
            if (r5 == 0) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            r0 = 0
            if (r5 != 0) goto L_0x002d
            return r0
        L_0x002d:
            android.content.ContentResolver r1 = r4.f36833f     // Catch:{ all -> 0x0081 }
            long r2 = (long) r6     // Catch:{ all -> 0x0081 }
            java.lang.String[] r6 = f36830c     // Catch:{ all -> 0x0081 }
            android.database.Cursor r5 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r1, r2, r5, r6)     // Catch:{ all -> 0x0081 }
            if (r5 != 0) goto L_0x003e
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r0
        L_0x003e:
            r5.moveToFirst()     // Catch:{ all -> 0x007f }
            int r6 = r5.getCount()     // Catch:{ all -> 0x007f }
            if (r6 <= 0) goto L_0x0079
            java.lang.String r6 = "_data"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ all -> 0x007f }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x007f }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x007f }
            r1.<init>(r6)     // Catch:{ all -> 0x007f }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0079
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x007f }
            r0.<init>(r6)     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x0065
            r6 = -1
            goto L_0x006f
        L_0x0065:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x007f }
            r1.<init>(r6)     // Catch:{ all -> 0x007f }
            long r1 = r1.length()     // Catch:{ all -> 0x007f }
            int r6 = (int) r1     // Catch:{ all -> 0x007f }
        L_0x006f:
            com.facebook.imagepipeline.j.e r6 = r4.mo26354b(r0, r6)     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0078
            r5.close()
        L_0x0078:
            return r6
        L_0x0079:
            if (r5 == 0) goto L_0x007e
            r5.close()
        L_0x007e:
            return r0
        L_0x007f:
            r6 = move-exception
            goto L_0x0083
        L_0x0081:
            r6 = move-exception
            r5 = r0
        L_0x0083:
            if (r5 == 0) goto L_0x0088
            r5.close()
        L_0x0088:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14104aa.m28876a(com.facebook.imagepipeline.common.d, int):com.facebook.imagepipeline.j.e");
    }

    public C14104aa(Executor executor, C13711i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f36833f = contentResolver;
    }
}
