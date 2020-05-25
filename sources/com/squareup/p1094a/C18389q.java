package com.squareup.p1094a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.squareup.p1094a.C18343aa.C18344a;
import com.squareup.p1094a.C18396v.C18402d;
import java.io.IOException;

/* renamed from: com.squareup.a.q */
final class C18389q extends C18373g {

    /* renamed from: b */
    private static final String[] f50779b = {"orientation"};

    /* renamed from: com.squareup.a.q$a */
    enum C18390a {
        MICRO(3, 96, 96),
        MINI(1, UnReadVideoExperiment.LIKE_USER_LIST, 384),
        FULL(2, -1, -1);
        

        /* renamed from: d */
        final int f50784d;

        /* renamed from: e */
        final int f50785e;

        /* renamed from: f */
        final int f50786f;

        private C18390a(int i, int i2, int i3) {
            this.f50784d = i;
            this.f50785e = i2;
            this.f50786f = i3;
        }
    }

    C18389q(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final boolean mo36788a(C18409y yVar) {
        Uri uri = yVar.f50842d;
        if (!C42311c.f106865i.equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m44663a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = f50779b     // Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
            if (r8 == 0) goto L_0x0022
            boolean r9 = r8.moveToFirst()     // Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
            if (r9 != 0) goto L_0x0016
            goto L_0x0022
        L_0x0016:
            int r9 = r8.getInt(r0)     // Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
            if (r8 == 0) goto L_0x001f
            r8.close()
        L_0x001f:
            return r9
        L_0x0020:
            r9 = move-exception
            goto L_0x002a
        L_0x0022:
            if (r8 == 0) goto L_0x0027
            r8.close()
        L_0x0027:
            return r0
        L_0x0028:
            r9 = move-exception
            r8 = r1
        L_0x002a:
            if (r8 == 0) goto L_0x002f
            r8.close()
        L_0x002f:
            throw r9
        L_0x0030:
            r8 = r1
        L_0x0031:
            if (r8 == 0) goto L_0x0036
            r8.close()
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p1094a.C18389q.m44663a(android.content.ContentResolver, android.net.Uri):int");
    }

    /* renamed from: a */
    public final C18344a mo36787a(C18409y yVar, int i) throws IOException {
        boolean z;
        C18390a aVar;
        Bitmap bitmap;
        int i2;
        C18409y yVar2 = yVar;
        ContentResolver contentResolver = this.f50736a.getContentResolver();
        int a = m44663a(contentResolver, yVar2.f50842d);
        String type = contentResolver.getType(yVar2.f50842d);
        if (type == null || !type.startsWith("video/")) {
            z = false;
        } else {
            z = true;
        }
        if (yVar.mo36871c()) {
            int i3 = yVar2.f50846h;
            int i4 = yVar2.f50847i;
            if (i3 <= C18390a.MICRO.f50785e && i4 <= C18390a.MICRO.f50786f) {
                aVar = C18390a.MICRO;
            } else if (i3 > C18390a.MINI.f50785e || i4 > C18390a.MINI.f50786f) {
                aVar = C18390a.FULL;
            } else {
                aVar = C18390a.MINI;
            }
            C18390a aVar2 = aVar;
            if (!z && aVar2 == C18390a.FULL) {
                return new C18344a(null, mo36821b(yVar), C18402d.DISK, a);
            }
            long parseId = ContentUris.parseId(yVar2.f50842d);
            Options c = m44566c(yVar);
            c.inJustDecodeBounds = true;
            Options options = c;
            m44563a(yVar2.f50846h, yVar2.f50847i, aVar2.f50785e, aVar2.f50786f, c, yVar);
            if (z) {
                if (aVar2 == C18390a.FULL) {
                    i2 = 1;
                } else {
                    i2 = aVar2.f50784d;
                }
                bitmap = Thumbnails.getThumbnail(contentResolver, parseId, i2, options);
            } else {
                bitmap = Images.Thumbnails.getThumbnail(contentResolver, parseId, aVar2.f50784d, options);
            }
            if (bitmap != null) {
                return new C18344a(bitmap, null, C18402d.DISK, a);
            }
        }
        return new C18344a(null, mo36821b(yVar), C18402d.DISK, a);
    }
}
