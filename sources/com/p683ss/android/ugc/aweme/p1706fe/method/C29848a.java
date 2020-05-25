package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29938a;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* renamed from: com.ss.android.ugc.aweme.fe.method.a */
public abstract class C29848a implements C23423b, C29908n {

    /* renamed from: c */
    public WeakReference<Activity> f77924c;

    /* renamed from: d */
    public C29851a f77925d = new C29851a();

    /* renamed from: e */
    public C29938a f77926e;

    /* renamed from: f */
    public short[] f77927f;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a$a */
    public static class C29851a {

        /* renamed from: a */
        public C48191h f77931a;

        /* renamed from: b */
        public WeakReference<C29938a> f77932b;

        /* renamed from: a */
        public final void mo60078a() {
            if (this.f77931a != null) {
                this.f77931a.dismiss();
                this.f77931a = null;
                if (this.f77932b != null) {
                    this.f77932b.clear();
                    this.f77932b = null;
                }
            }
        }

        /* renamed from: a */
        public final void mo60079a(Context context) {
            if (this.f77931a == null || !this.f77931a.isShowing()) {
                this.f77931a = new C48191h(context, context.getString(R.string.f8d));
                this.f77931a.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo60074a() {
        this.f77925d.mo60078a();
    }

    public C29848a(Activity activity) {
        this.f77924c = new WeakReference<>(activity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r0.equals("camera-image") != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60075a(final org.json.JSONObject r6) throws org.json.JSONException {
        /*
            r5 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r5.f77924c
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.base.activity.C23440s
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r6 = "uploadFailed"
            r5.mo49922a(r2, r6)
            return
        L_0x0013:
            java.lang.String r1 = "features"
            org.json.JSONArray r1 = r6.optJSONArray(r1)
            java.lang.String r3 = "showActionSheet"
            boolean r3 = r6.optBoolean(r3)
            r4 = r0
            com.ss.android.ugc.aweme.base.activity.s r4 = (com.p683ss.android.ugc.aweme.base.activity.C23440s) r4
            r4.mo48604a(r5)
            if (r3 != 0) goto L_0x00c4
            java.lang.String r0 = r1.optString(r2)
            r1 = -1
            int r3 = r0.hashCode()
            r4 = -2031693645(0xffffffff86e6d0b3, float:-8.682304E-35)
            if (r3 == r4) goto L_0x0063
            r2 = -2019804205(0xffffffff879c3bd3, float:-2.3507433E-34)
            if (r3 == r2) goto L_0x0059
            r2 = -1903465347(0xffffffff8e8b6c7d, float:-3.4370616E-30)
            if (r3 == r2) goto L_0x004f
            r2 = -1891575907(0xffffffff8f40d79d, float:-9.5078565E-30)
            if (r3 == r2) goto L_0x0045
            goto L_0x006c
        L_0x0045:
            java.lang.String r2 = "album-video"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r2 = 3
            goto L_0x006d
        L_0x004f:
            java.lang.String r2 = "album-image"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r2 = 1
            goto L_0x006d
        L_0x0059:
            java.lang.String r2 = "camera-video"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r2 = 2
            goto L_0x006d
        L_0x0063:
            java.lang.String r3 = "camera-image"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r2 = -1
        L_0x006d:
            switch(r2) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0089;
                case 3: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x00c3
        L_0x0071:
            java.lang.String r0 = "type"
            r1 = 700(0x2bc, float:9.81E-43)
            r6.put(r0, r1)
            com.ss.android.ugc.aweme.fe.method.upload.e r0 = new com.ss.android.ugc.aweme.fe.method.upload.e
            java.lang.ref.WeakReference<android.app.Activity> r1 = r5.f77924c
            com.ss.android.ugc.aweme.fe.method.a$a r2 = r5.f77925d
            r0.<init>(r1, r2, r5)
            r5.f77926e = r0
            com.ss.android.ugc.aweme.fe.method.upload.a r0 = r5.f77926e
            r0.mo60082a(r6)
            goto L_0x00c3
        L_0x0089:
            java.lang.String r0 = "type"
            r1 = 800(0x320, float:1.121E-42)
            r6.put(r0, r1)
            com.ss.android.ugc.aweme.fe.method.upload.e r0 = new com.ss.android.ugc.aweme.fe.method.upload.e
            java.lang.ref.WeakReference<android.app.Activity> r1 = r5.f77924c
            com.ss.android.ugc.aweme.fe.method.a$a r2 = r5.f77925d
            r0.<init>(r1, r2, r5)
            r5.f77926e = r0
            com.ss.android.ugc.aweme.fe.method.upload.a r0 = r5.f77926e
            r0.mo60082a(r6)
            return
        L_0x00a1:
            com.ss.android.ugc.aweme.fe.method.upload.d r0 = new com.ss.android.ugc.aweme.fe.method.upload.d
            java.lang.ref.WeakReference<android.app.Activity> r1 = r5.f77924c
            com.ss.android.ugc.aweme.fe.method.a$a r2 = r5.f77925d
            r0.<init>(r1, r2, r5)
            r5.f77926e = r0
            com.ss.android.ugc.aweme.fe.method.upload.a r0 = r5.f77926e
            r0.mo60082a(r6)
            return
        L_0x00b2:
            com.ss.android.ugc.aweme.fe.method.a.a r0 = new com.ss.android.ugc.aweme.fe.method.a.a
            java.lang.ref.WeakReference<android.app.Activity> r1 = r5.f77924c
            com.ss.android.ugc.aweme.fe.method.a$a r2 = r5.f77925d
            r0.<init>(r1, r2, r5)
            r5.f77926e = r0
            com.ss.android.ugc.aweme.fe.method.upload.a r0 = r5.f77926e
            r0.mo60082a(r6)
            return
        L_0x00c3:
            return
        L_0x00c4:
            android.content.res.Resources r2 = r0.getResources()
            java.lang.String[] r1 = r5.m69994a(r2, r1)
            com.bytedance.ies.uikit.dialog.b$a r2 = new com.bytedance.ies.uikit.dialog.b$a
            r2.<init>(r0)
            com.ss.android.ugc.aweme.fe.method.a$1 r0 = new com.ss.android.ugc.aweme.fe.method.a$1
            r0.<init>(r6)
            com.bytedance.ies.uikit.dialog.b$a r6 = r2.mo20142a(r1, r0)
            com.bytedance.ies.uikit.dialog.b r6 = r6.mo20143a()
            com.ss.android.ugc.aweme.fe.method.a$2 r0 = new com.ss.android.ugc.aweme.fe.method.a$2
            r0.<init>()
            r6.setOnCancelListener(r0)
            r6.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.C29848a.mo60075a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    private String[] m69994a(Resources resources, JSONArray jSONArray) {
        String[] strArr = {resources.getString(R.string.am_), resources.getString(R.string.alm), resources.getString(R.string.amj), resources.getString(R.string.amk), resources.getString(R.string.wf)};
        String[] strArr2 = new String[(jSONArray.length() + 1)];
        this.f77927f = new short[strArr2.length];
        for (int i = 0; i < strArr2.length; i++) {
            String optString = jSONArray.optString(i);
            char c = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != -2031693645) {
                if (hashCode != -2019804205) {
                    if (hashCode != -1903465347) {
                        if (hashCode == -1891575907 && optString.equals("album-video")) {
                            c = 3;
                        }
                    } else if (optString.equals("album-image")) {
                        c = 2;
                    }
                } else if (optString.equals("camera-video")) {
                    c = 1;
                }
            } else if (optString.equals("camera-image")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.f77927f[i] = 0;
                    strArr2[i] = strArr[0];
                    break;
                case 1:
                    this.f77927f[i] = 2;
                    strArr2[i] = strArr[2];
                    break;
                case 2:
                    this.f77927f[i] = 1;
                    strArr2[i] = strArr[1];
                    break;
                case 3:
                    this.f77927f[i] = 3;
                    strArr2[i] = strArr[3];
                    break;
                default:
                    this.f77927f[i] = 4;
                    strArr2[i] = strArr[4];
                    break;
            }
        }
        return strArr2;
    }

    /* renamed from: a */
    public final boolean mo48596a(int i, int i2, Intent intent) {
        if ((i == 1 || i == 600 || i == 700 || i == 800 || i == 900 || i == 10003) && this.f77926e != null) {
            return this.f77926e.mo60083a(i, i2, intent);
        }
        mo49922a(0, "uploadFailed");
        return true;
    }
}
