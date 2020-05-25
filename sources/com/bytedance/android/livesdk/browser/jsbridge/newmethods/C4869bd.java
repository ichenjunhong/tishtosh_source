package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Environment;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.p279af.C4581b;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;
import java.io.File;
import java.io.IOException;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bd */
public final class C4869bd extends C10779d<C4871a, C4872b> {

    /* renamed from: a */
    public Fragment f13110a;

    /* renamed from: b */
    public String f13111b;

    /* renamed from: c */
    public C1690c f13112c;

    /* renamed from: d */
    public ProgressDialog f13113d;

    /* renamed from: e */
    public C4871a f13114e;

    /* renamed from: f */
    public int f13115f;

    /* renamed from: g */
    private String f13116g = "upload_photo";

    /* renamed from: h */
    private String f13117h;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bd$a */
    public static final class C4871a {
        @C17952c(mo34828a = "aspect_x")

        /* renamed from: a */
        int f13121a;
        @C17952c(mo34828a = "aspect_y")

        /* renamed from: b */
        int f13122b;
        @C17952c(mo34828a = "min_width")

        /* renamed from: c */
        public int f13123c;
        @C17952c(mo34828a = "min_height")

        /* renamed from: d */
        public int f13124d;
        @C17952c(mo34828a = "max_size")

        /* renamed from: e */
        public int f13125e;
        @C17952c(mo34828a = "action_type")

        /* renamed from: f */
        int f13126f;

        C4871a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bd$b */
    static final class C4872b {
        @C17952c(mo34828a = "uri")

        /* renamed from: a */
        String f13127a;
        @C17952c(mo34828a = "url")

        /* renamed from: b */
        String f13128b;
        @C17952c(mo34828a = "image_data")

        /* renamed from: c */
        String f13129c;

        private C4872b(String str, String str2) {
            this.f13127a = str;
            this.f13128b = str2;
        }
    }

    /* renamed from: d */
    public final void mo10633d() {
        mo10629a();
        finishWithFailure();
    }

    /* renamed from: e */
    private Uri m11392e() {
        return m11390a(mo10632c());
    }

    public final void onTerminate() {
        if (this.f13112c != null) {
            this.f13112c.dispose();
        }
        this.f13110a = null;
        mo10629a();
    }

    /* renamed from: f */
    private String m11393f() {
        StringBuilder sb = new StringBuilder();
        sb.append(m11394g());
        sb.append(".temp");
        return sb.toString();
    }

    /* renamed from: g */
    private String m11394g() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13116g);
        sb.append("_");
        sb.append(this.f13117h);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10629a() {
        if (this.f13113d != null && this.f13113d.isShowing()) {
            this.f13113d.dismiss();
        }
    }

    /* renamed from: c */
    public String mo10632c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13116g);
        sb.append("_");
        sb.append(this.f13117h);
        sb.append("crop");
        return sb.toString();
    }

    /* renamed from: b */
    public Uri mo10631b() {
        String f = m11393f();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13111b);
        sb.append("/");
        sb.append(f);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f13111b);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C8064d.m16005b();
                C8064d.m9718a(6, e.getStackTrace());
            }
        }
        FragmentActivity activity = this.f13110a.getActivity();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13110a.getActivity().getPackageName());
        sb2.append(TTLiveFileProvider.NAME);
        return TTLiveFileProvider.getUri(activity, sb2.toString(), file);
    }

    public C4869bd(Fragment fragment) {
        this.f13110a = fragment;
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/DCIM/Camera");
        this.f13111b = sb.toString();
    }

    /* renamed from: a */
    private Uri m11390a(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13111b);
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f13111b);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        C4871a aVar = (C4871a) obj;
        this.f13114e = aVar;
        this.f13117h = String.valueOf(System.currentTimeMillis());
        FragmentActivity activity = this.f13110a.getActivity();
        if (aVar.f13126f == 0) {
            C4581b.m11004a(activity, this.f13110a, 40004, this.f13111b, m11393f());
            return;
        }
        if (aVar.f13126f == 1) {
            C4581b.m11003a((Activity) activity, this.f13110a, 40003);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(6:4|5|(1:11)|12|13|14)|15|16|(1:18)|19|20|(1:22)|23) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0089 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084 A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d A[Catch:{ Exception -> 0x0096 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10630a(android.net.Uri r6, boolean r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.camera.action.CROP"
            r0.<init>(r1)
            r1 = 1
            if (r7 == 0) goto L_0x000e
            goto L_0x0039
        L_0x000e:
            java.lang.String r7 = r6.getLastPathSegment()     // Catch:{ Exception -> 0x0089 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0089 }
            r3 = 19
            if (r2 < r3) goto L_0x002e
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r7)     // Catch:{ Exception -> 0x0089 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = ":"
            boolean r2 = r7.contains(r2)     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2)     // Catch:{ Exception -> 0x0089 }
            r7 = r7[r1]     // Catch:{ Exception -> 0x0089 }
        L_0x002e:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ NumberFormatException -> 0x0039 }
            long r3 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0039 }
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r2, r3)     // Catch:{ NumberFormatException -> 0x0039 }
            r6 = r7
        L_0x0039:
            r0.addFlags(r1)     // Catch:{ Exception -> 0x0089 }
            r7 = 2
            r0.addFlags(r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r7 = "image/*"
            r0.setDataAndType(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "crop"
            java.lang.String r7 = "true"
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "scale"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "aspectX"
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.bd$a r7 = r5.f13114e     // Catch:{ Exception -> 0x0089 }
            int r7 = r7.f13121a     // Catch:{ Exception -> 0x0089 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "aspectY"
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.bd$a r7 = r5.f13114e     // Catch:{ Exception -> 0x0089 }
            int r7 = r7.f13122b     // Catch:{ Exception -> 0x0089 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "return-data"
            r7 = 0
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0089 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0089 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "noFaceDetection"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "scaleUpIfNeeded"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0089 }
            android.net.Uri r6 = r5.m11392e()     // Catch:{ Exception -> 0x0089 }
            if (r6 == 0) goto L_0x0089
            java.lang.String r7 = "output"
            r0.putExtra(r7, r6)     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            android.support.v4.app.Fragment r6 = r5.f13110a     // Catch:{ Exception -> 0x0096 }
            if (r6 == 0) goto L_0x0095
            android.support.v4.app.Fragment r6 = r5.f13110a     // Catch:{ Exception -> 0x0096 }
            r7 = 40002(0x9c42, float:5.6055E-41)
            r6.startActivityForResult(r0, r7)     // Catch:{ Exception -> 0x0096 }
        L_0x0095:
            return
        L_0x0096:
            android.support.v4.app.Fragment r6 = r5.f13110a
            android.content.Context r6 = r6.getContext()
            r7 = 2132551266(0x7f1c2662, float:2.0755886E38)
            com.bytedance.common.utility.C9432q.m18672a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4869bd.mo10630a(android.net.Uri, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0045 A[SYNTHETIC, Splitter:B:31:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A[SYNTHETIC, Splitter:B:37:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11391a(java.lang.String r4, int r5, int r6) {
        /*
            r0 = 1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0049, all -> 0x0041 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0049, all -> 0x0041 }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r4.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            android.graphics.BitmapFactory.decodeStream(r2, r1, r4)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            int r1 = r4.outWidth     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r3 = 0
            if (r5 > r1) goto L_0x0033
            int r5 = r4.outHeight     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            if (r6 <= r5) goto L_0x001b
            goto L_0x0033
        L_0x001b:
            int r5 = r4.outWidth     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            int r4 = r4.outHeight     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            int r5 = r5 * r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r5 <= r4) goto L_0x002f
            r4 = 2132551267(0x7f1c2663, float:2.0755888E38)
            com.bytedance.android.livesdk.p279af.C4575an.m10981a(r4)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r2.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r3
        L_0x002f:
            r2.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x004e
        L_0x0033:
            r4 = 2132551268(0x7f1c2664, float:2.075589E38)
            com.bytedance.android.livesdk.p279af.C4575an.m10981a(r4)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            return r3
        L_0x003d:
            r4 = move-exception
            goto L_0x0043
        L_0x003f:
            r1 = r2
            goto L_0x0049
        L_0x0041:
            r4 = move-exception
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r4
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4869bd.m11391a(java.lang.String, int, int):boolean");
    }
}
