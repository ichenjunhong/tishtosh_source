package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop;

import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.a */
public final class C46476a {

    /* renamed from: a */
    public static List<String> f117258a = new ArrayList();

    /* renamed from: b */
    static boolean f117259b = true;

    /* renamed from: c */
    public static boolean f117260c = true;

    /* renamed from: d */
    public static final C46476a f117261d = new C46476a();

    /* renamed from: e */
    private static final int f117262e = f117262e;

    /* renamed from: f */
    private static final int f117263f = f117263f;

    /* renamed from: g */
    private static final int f117264g = f117264g;

    /* renamed from: h */
    private static boolean f117265h;

    /* renamed from: i */
    private static final String[] f117266i = {"_data"};

    private C46476a() {
    }

    /* renamed from: a */
    public static int m100890a() {
        return f117262e;
    }

    /* renamed from: b */
    public static int m100893b() {
        return f117263f;
    }

    /* renamed from: c */
    public static boolean m100895c() {
        return f117265h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ all -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo93214d() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = android.os.Environment.DIRECTORY_DCIM
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r1)
            java.lang.String r2 = "Environment.getExternalS…vironment.DIRECTORY_DCIM)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r5 = "_data like ? "
            r8 = 1
            java.lang.String[] r6 = new java.lang.String[r8]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 37
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r9 = 0
            r6[r9] = r1
            android.app.Application r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88233b()
            java.lang.String r2 = "CameraClient.getApplication()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String[] r4 = f117266i
            java.lang.String r7 = "date_added DESC LIMIT 1000"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00b0
        L_0x0046:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x00a5
            java.lang.String r2 = r1.getString(r9)     // Catch:{ all -> 0x00ab }
            boolean r3 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r2)     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x0046
            boolean r3 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r2)     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x009e
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00ab }
            r3.<init>()     // Catch:{ all -> 0x00ab }
            r3.inJustDecodeBounds = r8     // Catch:{ all -> 0x00ab }
            android.graphics.BitmapFactory.decodeFile(r2, r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r3.outMimeType     // Catch:{ all -> 0x00ab }
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x00ab }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00ab }
            if (r4 != 0) goto L_0x009e
            java.lang.String r4 = "type"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ all -> 0x00ab }
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = "png"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x00ab }
            boolean r4 = p2628d.p2650m.C52830p.m112455b(r4, r5, r8)     // Catch:{ all -> 0x00ab }
            if (r4 != 0) goto L_0x009c
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = "jpg"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x00ab }
            boolean r4 = p2628d.p2650m.C52830p.m112455b(r4, r5, r8)     // Catch:{ all -> 0x00ab }
            if (r4 != 0) goto L_0x009c
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "jpeg"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x00ab }
            boolean r3 = p2628d.p2650m.C52830p.m112455b(r3, r4, r8)     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x009e
        L_0x009c:
            r3 = 1
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            if (r3 == 0) goto L_0x0046
            r0.add(r2)     // Catch:{ all -> 0x00ab }
            goto L_0x0046
        L_0x00a5:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00ab }
            r1.close()
            return r0
        L_0x00ab:
            r0 = move-exception
            r1.close()
            throw r0
        L_0x00b0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a.mo93214d():java.util.List");
    }

    /* renamed from: a */
    public static void m100891a(boolean z) {
        f117265h = z;
    }

    /* renamed from: b */
    public static void m100894b(boolean z) {
        f117259b = z;
    }

    /* renamed from: a */
    public static final boolean m100892a(Effect effect) {
        if (effect == null || TextUtils.isEmpty(effect.getSdkExtra())) {
            return false;
        }
        String sdkExtra = effect.getSdkExtra();
        C52711k.m112236a((Object) sdkExtra, "bean.sdkExtra");
        if (!C52830p.m112456b((CharSequence) sdkExtra, (CharSequence) "pl", false, 2, (Object) null)) {
            return false;
        }
        String sdkExtra2 = effect.getSdkExtra();
        C52711k.m112236a((Object) sdkExtra2, "bean.sdkExtra");
        if (!C52830p.m112456b((CharSequence) sdkExtra2, (CharSequence) "alg", false, 2, (Object) null)) {
            return false;
        }
        try {
            return new JSONObject(effect.getSdkExtra()).has("pl");
        } catch (Exception unused) {
            return false;
        }
    }
}
