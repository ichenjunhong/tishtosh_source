package com.bytedance.android.livesdk.p279af;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.android.live.room.C4182c;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.af.p */
public final class C4606p implements C4182c {

    /* renamed from: n */
    private static SimpleDateFormat f12569n;

    /* renamed from: a */
    Activity f12570a;

    /* renamed from: b */
    final Fragment f12571b;

    /* renamed from: c */
    final String f12572c;

    /* renamed from: d */
    final C4183a f12573d;

    /* renamed from: e */
    private final Resources f12574e;

    /* renamed from: f */
    private final String f12575f;

    /* renamed from: g */
    private String f12576g;

    /* renamed from: h */
    private final int f12577h;

    /* renamed from: i */
    private final int f12578i;

    /* renamed from: j */
    private final int f12579j;

    /* renamed from: k */
    private final int f12580k;

    /* renamed from: l */
    private final String f12581l;

    /* renamed from: m */
    private final Map<String, String> f12582m;

    /* renamed from: o */
    private ProgressDialog f12583o;

    /* renamed from: f */
    private Uri m11059f() {
        return m11053a(m11060g());
    }

    /* renamed from: b */
    public final void mo9579b() {
        if (this.f12583o != null) {
            this.f12583o.dismiss();
        }
    }

    /* renamed from: g */
    private String m11060g() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12575f);
        sb.append("_");
        sb.append(this.f12576g);
        sb.append(this.f12581l);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo9580c() {
        this.f12576g = String.valueOf(System.currentTimeMillis());
        String[] stringArray = this.f12574e.getStringArray(R.array.ae);
        C1161a aVar = new C1161a(this.f12570a);
        aVar.mo3767a((CharSequence[]) stringArray, (OnClickListener) new C4607q(this));
        aVar.mo3766a(false);
        aVar.mo3775c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo10400d() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12575f);
        sb2.append("_");
        sb2.append(this.f12576g);
        sb.append(sb2.toString());
        sb.append(".jpeg");
        return sb.toString();
    }

    /* renamed from: e */
    private Uri m11058e() {
        String d = mo10400d();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12572c);
        sb.append("/");
        sb.append(d);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f12572c);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        Activity activity = this.f12570a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12570a.getPackageName());
        sb2.append(TTLiveFileProvider.NAME);
        return TTLiveFileProvider.getUri(activity, sb2.toString(), file);
    }

    /* renamed from: a */
    public final void mo9577a() {
        if (this.f12583o == null) {
            this.f12583o = new ProgressDialog(this.f12570a);
            this.f12583o.setMessage(this.f12570a.getString(R.string.eu_));
            this.f12583o.setIndeterminate(true);
            this.f12583o.setCancelable(true);
        }
        if (!this.f12583o.isShowing()) {
            this.f12583o.show();
        }
    }

    /* renamed from: a */
    private void m11054a(int i) {
        Toast makeText = Toast.makeText(this.f12570a, i, 0);
        makeText.setGravity(49, 0, 0);
        C4608r.m11066a(makeText);
    }

    /* renamed from: a */
    private Uri m11053a(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12572c);
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f12572c);
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

    /* renamed from: b */
    private static String m11057b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            String attribute = new ExifInterface(str).getAttribute("DateTime");
            if (!TextUtils.isEmpty(attribute)) {
                if (f12569n == null) {
                    f12569n = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                }
                return String.valueOf(f12569n.parse(attribute).getTime());
            }
        } catch (IOException | ParseException unused) {
        }
        return String.valueOf(file.lastModified());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|(6:4|5|(1:11)|12|13|14)|15|16|(1:18)|19|20|(2:22|27)(2:23|24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        m11054a((int) com.ss.android.ugc.trill.R.string.eym);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086 A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092 A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098 A[Catch:{ Exception -> 0x009e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11055a(android.net.Uri r7, boolean r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "ttlive_upload_cover_want_crop"
            r1 = 0
            r2 = 0
            com.bytedance.android.live.core.p225d.C3837e.m9744a(r0, r2, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.camera.action.CROP"
            r0.<init>(r1)
            r1 = 1
            if (r8 == 0) goto L_0x0015
            goto L_0x0040
        L_0x0015:
            java.lang.String r8 = r7.getLastPathSegment()     // Catch:{ Exception -> 0x008b }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x008b }
            r4 = 19
            if (r3 < r4) goto L_0x0035
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Exception -> 0x008b }
            if (r3 != 0) goto L_0x0035
            java.lang.String r3 = ":"
            boolean r3 = r8.contains(r3)     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = ":"
            java.lang.String[] r8 = r8.split(r3)     // Catch:{ Exception -> 0x008b }
            r8 = r8[r1]     // Catch:{ Exception -> 0x008b }
        L_0x0035:
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ NumberFormatException -> 0x0040 }
            long r4 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0040 }
            android.net.Uri r8 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch:{ NumberFormatException -> 0x0040 }
            r7 = r8
        L_0x0040:
            r0.addFlags(r1)     // Catch:{ Exception -> 0x008b }
            r8 = 2
            r0.addFlags(r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r8 = "image/*"
            r0.setDataAndType(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "crop"
            java.lang.String r8 = "true"
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "scale"
            r0.putExtra(r7, r1)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "aspectX"
            int r8 = r6.f12577h     // Catch:{ Exception -> 0x008b }
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "aspectY"
            int r8 = r6.f12578i     // Catch:{ Exception -> 0x008b }
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "return-data"
            r0.putExtra(r7, r2)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x008b }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x008b }
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "noFaceDetection"
            r0.putExtra(r7, r1)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "scaleUpIfNeeded"
            r0.putExtra(r7, r1)     // Catch:{ Exception -> 0x008b }
            android.net.Uri r7 = r6.m11059f()     // Catch:{ Exception -> 0x008b }
            if (r7 == 0) goto L_0x008b
            java.lang.String r8 = "output"
            r0.putExtra(r8, r7)     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            android.support.v4.app.Fragment r7 = r6.f12571b     // Catch:{ Exception -> 0x009e }
            r8 = 40002(0x9c42, float:5.6055E-41)
            if (r7 == 0) goto L_0x0098
            android.support.v4.app.Fragment r7 = r6.f12571b     // Catch:{ Exception -> 0x009e }
            r7.startActivityForResult(r0, r8)     // Catch:{ Exception -> 0x009e }
            goto L_0x00a4
        L_0x0098:
            android.app.Activity r7 = r6.f12570a     // Catch:{ Exception -> 0x009e }
            r7.startActivityForResult(r0, r8)     // Catch:{ Exception -> 0x009e }
            return
        L_0x009e:
            r7 = 2132551266(0x7f1c2662, float:2.0755886E38)
            r6.m11054a(r7)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p279af.C4606p.m11055a(android.net.Uri, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[SYNTHETIC, Splitter:B:31:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0050 A[SYNTHETIC, Splitter:B:37:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11056a(java.lang.String r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004e, all -> 0x0046 }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x004e, all -> 0x0046 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r6.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            android.graphics.BitmapFactory.decodeStream(r2, r1, r6)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            int r3 = r6.outWidth     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r4 = 0
            if (r7 > r3) goto L_0x0033
            int r7 = r6.outHeight     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            if (r8 <= r7) goto L_0x001b
            goto L_0x0033
        L_0x001b:
            int r7 = r6.outWidth     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            int r6 = r6.outHeight     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            int r7 = r7 * r6
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 <= r6) goto L_0x002f
            r6 = 2132551267(0x7f1c2663, float:2.0755888E38)
            r5.m11054a(r6)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r2.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r4
        L_0x002f:
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x0033:
            r6 = 2132551268(0x7f1c2664, float:2.075589E38)
            r5.m11054a(r6)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            java.lang.String r6 = "ttlive_upload_cover_small_toast"
            com.bytedance.android.live.core.p225d.C3837e.m9744a(r6, r4, r1)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r2.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r4
        L_0x0042:
            r6 = move-exception
            goto L_0x0048
        L_0x0044:
            r1 = r2
            goto L_0x004e
        L_0x0046:
            r6 = move-exception
            r2 = r1
        L_0x0048:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r6
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p279af.C4606p.m11056a(java.lang.String, int, int):boolean");
    }

    /* renamed from: a */
    public final boolean mo9578a(int i, int i2, Intent intent) {
        if (i == 40003) {
            if (i2 == 0) {
                if (this.f12573d != null) {
                    this.f12573d.mo8916b_();
                }
                return false;
            } else if (intent == null) {
                if (this.f12573d != null) {
                    this.f12573d.mo8916b_();
                }
                return false;
            } else {
                Uri data = intent.getData();
                String a = C4581b.m11001a((Context) this.f12570a, data);
                if (C9431p.m18664a(a)) {
                    if (this.f12573d != null) {
                        this.f12573d.mo8916b_();
                    }
                    C9432q.m18673a((Context) this.f12570a, (int) R.drawable.bpe, (int) R.string.eyj);
                    return false;
                } else if (!new File(a).exists()) {
                    if (this.f12573d != null) {
                        this.f12573d.mo8916b_();
                    }
                    C9432q.m18673a((Context) this.f12570a, (int) R.drawable.bpe, (int) R.string.eyj);
                    return false;
                } else {
                    if ("file".equals(data.getScheme())) {
                        data = C4581b.m11000a((Context) this.f12570a, a);
                    }
                    m11055a(data, false);
                    this.f12582m.put(this.f12576g, m11057b(a));
                    return true;
                }
            }
        } else if (i != 40004) {
            if (i == 40002) {
                if (i2 == 0) {
                    if (this.f12573d != null) {
                        this.f12573d.mo8916b_();
                    }
                    return false;
                }
                C8049c.m15979a().mo14202a("livesdk_cover_crop_commit", new HashMap(), new C8059j().mo14218f("click").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("cover_edit"));
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12572c);
                sb.append("/");
                sb.append(m11060g());
                File file = new File(sb.toString());
                if (!file.exists()) {
                    return true;
                }
                if (!m11056a(file.getAbsolutePath(), this.f12579j, this.f12580k)) {
                    C4581b.m11003a(this.f12570a, this.f12571b, 40003);
                    return true;
                }
                String absolutePath = file.getAbsolutePath();
                String str = (String) this.f12582m.remove(this.f12576g);
                if (this.f12573d != null) {
                    this.f12573d.mo8915a(absolutePath, str);
                }
                return true;
            }
            return false;
        } else if (i2 == 0) {
            if (this.f12573d != null) {
                this.f12573d.mo8916b_();
            }
            return false;
        } else {
            try {
                m11055a(m11058e(), true);
                this.f12582m.put(this.f12576g, String.valueOf(System.currentTimeMillis()));
                return true;
            } catch (Exception unused) {
            }
        }
    }

    public C4606p(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, C4183a aVar) {
        this(activity, fragment, str, i, i2, i3, i4, aVar, "");
    }

    private C4606p(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, C4183a aVar, String str2) {
        this.f12582m = new HashMap();
        this.f12570a = activity;
        this.f12571b = fragment;
        this.f12573d = aVar;
        this.f12577h = i;
        this.f12578i = i2;
        this.f12579j = i3;
        this.f12580k = i4;
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/DCIM/Camera");
        this.f12572c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".data");
        this.f12575f = sb2.toString();
        if (this.f12570a == null && this.f12571b != null) {
            this.f12570a = this.f12571b.getActivity();
        }
        this.f12574e = this.f12570a.getResources();
        this.f12581l = str2;
    }
}
