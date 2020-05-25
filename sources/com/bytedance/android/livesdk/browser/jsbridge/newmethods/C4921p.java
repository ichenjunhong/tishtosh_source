package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.user.C3011j;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.p279af.C4581b;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p416t.C8302f;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.p1076a.C17952c;
import com.google.gson.p1077b.C17956a;
import com.ss.android.ugc.trill.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p */
public final class C4921p extends C10779d<JSONObject, C4932b> {

    /* renamed from: a */
    public final String f13223a;

    /* renamed from: b */
    public C1690c f13224b;

    /* renamed from: c */
    public Fragment f13225c;

    /* renamed from: d */
    public ProgressDialog f13226d;

    /* renamed from: e */
    C10783f f13227e;

    /* renamed from: f */
    public int f13228f;

    /* renamed from: g */
    public int f13229g;

    /* renamed from: h */
    public int f13230h;

    /* renamed from: i */
    public String f13231i;

    /* renamed from: j */
    public JSONObject f13232j;

    /* renamed from: k */
    private String f13233k;

    /* renamed from: l */
    private String f13234l = "upload_photo";

    /* renamed from: m */
    private int f13235m;

    /* renamed from: n */
    private int f13236n;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p$a */
    public static final class C4931a {
        @C17952c(mo34828a = "uri")

        /* renamed from: a */
        String f13255a;
        @C17952c(mo34828a = "local_url")

        /* renamed from: b */
        String f13256b;
        @C17952c(mo34828a = "local_img")

        /* renamed from: c */
        String f13257c;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p$b */
    public static final class C4932b {
        @C17952c(mo34828a = "code")

        /* renamed from: a */
        int f13258a;
        @C17952c(mo34828a = "status")

        /* renamed from: b */
        int f13259b;
        @C17952c(mo34828a = "status_msg")

        /* renamed from: c */
        String f13260c;
        @C17952c(mo34828a = "data")

        /* renamed from: d */
        C4931a f13261d;

        private C4932b(int i, int i2, String str, C4931a aVar) {
            this.f13258a = i;
            this.f13259b = i2;
            this.f13260c = str;
            this.f13261d = aVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p$c */
    static class C4933c {

        /* renamed from: a */
        public C4177d<C3011j> f13262a;

        /* renamed from: b */
        public String f13263b;

        public C4933c(String str, C4177d<C3011j> dVar) {
            this.f13262a = dVar;
            this.f13263b = str;
        }
    }

    /* renamed from: f */
    private Uri m11416f() {
        return m11414a(mo10657d());
    }

    public final void onTerminate() {
        if (this.f13224b != null) {
            this.f13224b.dispose();
        }
        this.f13225c = null;
        this.f13227e = null;
    }

    /* renamed from: g */
    private String m11417g() {
        StringBuilder sb = new StringBuilder();
        sb.append(m11418h());
        sb.append(".jpeg");
        return sb.toString();
    }

    /* renamed from: h */
    private String m11418h() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13234l);
        sb.append("_");
        sb.append(this.f13233k);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10653a() {
        if (this.f13226d != null && this.f13226d.isShowing()) {
            this.f13226d.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo10655b() {
        mo10653a();
        C4932b bVar = new C4932b(1, C3922z.m9903a((int) R.string.hp4), new C4931a());
        finishWithResult(bVar);
    }

    /* renamed from: d */
    public String mo10657d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13234l);
        sb.append("_");
        sb.append(this.f13233k);
        sb.append("crop");
        return sb.toString();
    }

    /* renamed from: e */
    public final void mo10658e() {
        mo10653a();
        C4932b bVar = new C4932b(1, C3922z.m9903a((int) R.string.hp4), new C4931a());
        finishWithResult(bVar);
    }

    /* renamed from: c */
    public Uri mo10656c() {
        String g = m11417g();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13223a);
        sb.append("/");
        sb.append(g);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f13223a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C8064d.m16005b();
                C8064d.m9718a(6, e.getStackTrace());
            }
        }
        FragmentActivity activity = this.f13225c.getActivity();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13225c.getActivity().getPackageName());
        sb2.append(TTLiveFileProvider.NAME);
        return TTLiveFileProvider.getUri(activity, sb2.toString(), file);
    }

    public C4921p(Fragment fragment) {
        this.f13225c = fragment;
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/DCIM/Camera");
        this.f13223a = sb.toString();
    }

    /* renamed from: a */
    private Uri m11414a(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13223a);
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f13223a);
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

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(6:4|5|(1:11)|12|13|14)|15|16|(1:18)|19|20|(1:22)|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        com.bytedance.common.utility.C9432q.m18672a(r5.f13225c.getContext(), (int) com.ss.android.ugc.trill.R.string.eym);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0085 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ Exception -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089 A[Catch:{ Exception -> 0x0092 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10654a(android.net.Uri r6, boolean r7) {
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
            java.lang.String r7 = r6.getLastPathSegment()     // Catch:{ Exception -> 0x0085 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0085 }
            r3 = 19
            if (r2 < r3) goto L_0x002e
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r7)     // Catch:{ Exception -> 0x0085 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = ":"
            boolean r2 = r7.contains(r2)     // Catch:{ Exception -> 0x0085 }
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2)     // Catch:{ Exception -> 0x0085 }
            r7 = r7[r1]     // Catch:{ Exception -> 0x0085 }
        L_0x002e:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ NumberFormatException -> 0x0039 }
            long r3 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0039 }
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r2, r3)     // Catch:{ NumberFormatException -> 0x0039 }
            r6 = r7
        L_0x0039:
            r0.addFlags(r1)     // Catch:{ Exception -> 0x0085 }
            r7 = 2
            r0.addFlags(r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r7 = "image/*"
            r0.setDataAndType(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "crop"
            java.lang.String r7 = "true"
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "scale"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "aspectX"
            int r7 = r5.f13235m     // Catch:{ Exception -> 0x0085 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "aspectY"
            int r7 = r5.f13236n     // Catch:{ Exception -> 0x0085 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "return-data"
            r7 = 0
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0085 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0085 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "noFaceDetection"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "scaleUpIfNeeded"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0085 }
            android.net.Uri r6 = r5.m11416f()     // Catch:{ Exception -> 0x0085 }
            if (r6 == 0) goto L_0x0085
            java.lang.String r7 = "output"
            r0.putExtra(r7, r6)     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            android.support.v4.app.Fragment r6 = r5.f13225c     // Catch:{ Exception -> 0x0092 }
            if (r6 == 0) goto L_0x0091
            android.support.v4.app.Fragment r6 = r5.f13225c     // Catch:{ Exception -> 0x0092 }
            r7 = 40002(0x9c42, float:5.6055E-41)
            r6.startActivityForResult(r0, r7)     // Catch:{ Exception -> 0x0092 }
        L_0x0091:
            return
        L_0x0092:
            android.support.v4.app.Fragment r6 = r5.f13225c
            android.content.Context r6 = r6.getContext()
            r7 = 2132551266(0x7f1c2662, float:2.0755886E38)
            com.bytedance.common.utility.C9432q.m18672a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4921p.mo10654a(android.net.Uri, boolean):void");
    }

    public final /* synthetic */ void invoke(Object obj, final C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        this.f13227e = fVar;
        String optString = jSONObject.optString("type");
        final JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 == null) {
            C4932b bVar = new C4932b(4, C3922z.m9903a((int) R.string.hrw), new C4931a());
            finishWithResult(bVar);
            return;
        }
        int optInt = jSONObject2.optInt("action_type", 0);
        this.f13231i = jSONObject2.optString("url");
        this.f13232j = new JSONObject();
        int i = -1;
        if (jSONObject2.getJSONObject("params") != null) {
            this.f13232j = jSONObject2.getJSONObject("params");
            i = this.f13232j.optInt("encrypt", -1);
        }
        if (TextUtils.isEmpty(this.f13231i) || (!this.f13231i.startsWith(WebKitApi.SCHEME_HTTPS) && i == 1)) {
            C4932b bVar2 = new C4932b(5, C3922z.m9903a((int) R.string.hp5), new C4931a());
            finishWithResult(bVar2);
            return;
        }
        if (!TextUtils.equals("video", optString) || !(fVar.f28972a instanceof Activity)) {
            if (TextUtils.equals("picture", optString)) {
                this.f13233k = String.valueOf(System.currentTimeMillis());
                this.f13230h = jSONObject2.optInt("min_width");
                this.f13229g = jSONObject2.optInt("min_height");
                this.f13235m = jSONObject2.optInt("aspect_x", 1);
                this.f13236n = jSONObject2.optInt("aspect_y", 1);
                FragmentActivity activity = this.f13225c.getActivity();
                if (optInt == 0) {
                    C4581b.m11004a(activity, this.f13225c, 40004, this.f13223a, m11417g());
                } else if (optInt == 1) {
                    C4581b.m11003a((Activity) activity, this.f13225c, 40003);
                }
            }
        } else if (optInt == 0) {
            C8302f.m16453a((Activity) fVar.f28972a).mo14484a(new C8288d() {
                /* renamed from: b */
                public final void mo9069b(String... strArr) {
                    C9432q.m18673a(fVar.f28972a, (int) R.drawable.bpe, (int) R.string.e7c);
                    C4921p.this.finishWithFailure();
                }

                /* renamed from: a */
                public final void mo9068a(String... strArr) {
                    int optInt = jSONObject2.optInt("duration_limit", 10000) / 1000;
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.durationLimit", optInt);
                    intent.putExtra("android.intent.extra.videoQuality", 1);
                    if (C4921p.this.f13225c.getActivity() == null) {
                        C4921p.this.finishWithFailure();
                    } else {
                        C4921p.this.f13225c.startActivityForResult(intent, 9001);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (optInt == 1) {
            C8302f.m16453a((Activity) fVar.f28972a).mo14484a(new C8288d() {
                /* renamed from: b */
                public final void mo9069b(String... strArr) {
                    C9432q.m18673a(fVar.f28972a, (int) R.drawable.bpe, (int) R.string.e7c);
                    C4921p.this.finishWithFailure();
                }

                /* renamed from: a */
                public final void mo9068a(String... strArr) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    if (jSONObject2.optInt("duration_limit", -1) != -1) {
                        C4932b bVar = new C4932b(1, C3922z.m9903a((int) R.string.hr2), new C4931a());
                        C4921p.this.finishWithResult(bVar);
                        return;
                    }
                    intent.setType("video/*");
                    if (C4921p.this.f13225c.getActivity() == null) {
                        C4921p.this.finishWithFailure();
                    } else {
                        C4921p.this.f13225c.startActivityForResult(intent, 9002);
                    }
                }
            }, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0045 A[SYNTHETIC, Splitter:B:31:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A[SYNTHETIC, Splitter:B:37:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11415a(java.lang.String r4, int r5, int r6) {
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
            r4 = 20971520(0x1400000, float:3.526483E-38)
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4921p.m11415a(java.lang.String, int, int):boolean");
    }

    /* renamed from: a */
    public final C4177d<C3011j> mo10652a(String str, File file, JSONObject jSONObject) throws Exception {
        IHostNetwork iHostNetwork = (IHostNetwork) C4116c.m10249a(INetworkService.class);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
        Builder buildUpon = Uri.parse(str).buildUpon();
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                buildUpon.appendQueryParameter(str2, String.valueOf(jSONObject.opt(str2)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        String uri = buildUpon.build().toString();
        C3831a.m9707a("EncryptedUploadMethod", uri);
        String str3 = new String(((C8815e) iHostNetwork.uploadFile(-1, uri, new ArrayList(1), multipartTypedOutput.mimeType(), byteArrayOutputStream.toByteArray(), multipartTypedOutput.length(), multipartTypedOutput.md5Stub()).mo15805a()).f24066e);
        C4177d<C3011j> dVar = (C4177d) C2942b.m8369a().mo34885a(str3, new C17956a<C4177d<C3011j>>() {
        }.f49843c);
        try {
            if (dVar.statusCode != 0) {
                dVar.error = (RequestError) C2942b.m8369a().mo34884a(new JSONObject(str3).getJSONObject("data").toString(), RequestError.class);
            }
        } catch (JSONException unused2) {
        }
        return dVar;
    }
}
