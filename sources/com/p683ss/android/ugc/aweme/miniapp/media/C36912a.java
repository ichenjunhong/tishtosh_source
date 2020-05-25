package com.p683ss.android.ugc.aweme.miniapp.media;

import android.app.Activity;
import android.content.Intent;
import android.media.ExifInterface;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36954b.C36956b;
import com.p683ss.android.ugc.aweme.profile.util.C40557p;
import com.zhihu.matisse.C45331a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.media.a */
public final class C36912a {

    /* renamed from: a */
    C40557p f94296a;

    /* renamed from: b */
    Activity f94297b;

    /* renamed from: a */
    public static int m83047a(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return NormalGiftView.ALPHA_180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static List<C36956b> m83048a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        List<String> b = C45331a.m98819b(intent);
        if (b == null) {
            b = new LinkedList<>();
        }
        for (String bVar : b) {
            C36956b bVar2 = new C36956b(bVar, "", 0, 0, 0, 0, "");
            arrayList.add(bVar2);
        }
        return arrayList;
    }

    public C36912a(Activity activity, Fragment fragment) {
        this.f94297b = activity;
        this.f94296a = new C40557p(activity, fragment, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f A[SYNTHETIC, Splitter:B:26:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f A[SYNTHETIC, Splitter:B:37:0x007f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo76173a(android.content.Context r5, android.graphics.Bitmap r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0005
            java.lang.String r5 = ""
            return r5
        L_0x0005:
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.ss.android.ugc.aweme.profile.util.p r1 = r4.f94296a
            java.lang.String r1 = r1.f103485e
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ".jpg"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            r0 = 0
            boolean r1 = r5.exists()     // Catch:{ IOException -> 0x0073, all -> 0x0063 }
            if (r1 != 0) goto L_0x0040
            java.io.File r1 = r5.getParentFile()     // Catch:{ IOException -> 0x0073, all -> 0x0063 }
            r1.mkdirs()     // Catch:{ IOException -> 0x0073, all -> 0x0063 }
            r5.createNewFile()     // Catch:{ IOException -> 0x0073, all -> 0x0063 }
        L_0x0040:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0073, all -> 0x0063 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0073, all -> 0x0063 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0074, all -> 0x0060 }
            r3 = 100
            r6.compress(r2, r3, r1)     // Catch:{ IOException -> 0x0074, all -> 0x0060 }
            r1.flush()     // Catch:{ IOException -> 0x0074, all -> 0x0060 }
            boolean r0 = r6.isRecycled()
            if (r0 != 0) goto L_0x0058
            r6.recycle()
        L_0x0058:
            r1.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            java.lang.String r5 = r5.getAbsolutePath()
            return r5
        L_0x0060:
            r5 = move-exception
            r0 = r1
            goto L_0x0064
        L_0x0063:
            r5 = move-exception
        L_0x0064:
            boolean r1 = r6.isRecycled()
            if (r1 != 0) goto L_0x006d
            r6.recycle()
        L_0x006d:
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            throw r5
        L_0x0073:
            r1 = r0
        L_0x0074:
            boolean r5 = r6.isRecycled()
            if (r5 != 0) goto L_0x007d
            r6.recycle()
        L_0x007d:
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp.media.C36912a.mo76173a(android.content.Context, android.graphics.Bitmap):java.lang.String");
    }
}
