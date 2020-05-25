package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RequestPermissionMethod */
public final class RequestPermissionMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29830a f77881a = new C29830a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RequestPermissionMethod$a */
    public static final class C29830a {
        private C29830a() {
        }

        public /* synthetic */ C29830a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RequestPermissionMethod$b */
    public static final class C29831b implements C47939a {

        /* renamed from: a */
        final /* synthetic */ RequestPermissionMethod f77882a;

        /* renamed from: b */
        final /* synthetic */ Activity f77883b;

        /* renamed from: c */
        final /* synthetic */ C29789a f77884c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f77885d;

        /* renamed from: a */
        public final void mo60068a() {
            C29789a aVar = this.f77884c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            aVar.mo60039a((Object) jSONObject);
            this.f77882a.mo60067a(this.f77885d);
        }

        /* renamed from: b */
        public final void mo60069b() {
            C29789a aVar = this.f77884c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            aVar.mo60039a((Object) jSONObject);
        }

        C29831b(RequestPermissionMethod requestPermissionMethod, Activity activity, C29789a aVar, JSONObject jSONObject) {
            this.f77882a = requestPermissionMethod;
            this.f77883b = activity;
            this.f77884c = aVar;
            this.f77885d = jSONObject;
        }
    }

    public RequestPermissionMethod() {
        this(null, 1, null);
    }

    public RequestPermissionMethod(C10757a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60067a(org.json.JSONObject r7) {
        /*
            r6 = this;
            java.lang.String r0 = "permission_list"
            org.json.JSONArray r7 = r7.optJSONArray(r0)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0024
            int r2 = r7.length()
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0024
            java.lang.Object r4 = r7.get(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            if (r4 == 0) goto L_0x0021
            r7 = 1
            goto L_0x0025
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0024:
            r7 = 0
        L_0x0025:
            if (r7 == 0) goto L_0x0070
            java.lang.ref.WeakReference r7 = r6.f77793e
            if (r7 == 0) goto L_0x003a
            java.lang.Object r7 = r7.get()
            android.content.Context r7 = (android.content.Context) r7
            if (r7 == 0) goto L_0x003a
            java.lang.String r2 = "location"
            java.lang.Object r7 = r7.getSystemService(r2)
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            if (r7 == 0) goto L_0x0068
            android.location.LocationManager r7 = (android.location.LocationManager) r7
            if (r7 == 0) goto L_0x004a
            java.lang.String r2 = "gps"
            boolean r7 = r7.isProviderEnabled(r2)
            if (r7 != r1) goto L_0x004a
            r0 = 1
        L_0x004a:
            if (r0 != 0) goto L_0x0070
            java.lang.ref.WeakReference r7 = r6.f77793e
            if (r7 == 0) goto L_0x0070
            java.lang.Object r7 = r7.get()
            android.content.Context r7 = (android.content.Context) r7
            if (r7 == 0) goto L_0x0070
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.LOCATION_SOURCE_SETTINGS"
            r0.<init>(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
            r7.startActivity(r0)
            return
        L_0x0068:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.location.LocationManager"
            r7.<init>(r0)
            throw r7
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.RequestPermissionMethod.mo60067a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        Context context;
        if (jSONObject != null) {
            WeakReference weakReference = this.f77793e;
            String[] strArr = null;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("permission_list");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object obj = optJSONArray.get(i);
                        if (obj instanceof Integer) {
                            List list = arrayList;
                            switch (((Number) obj).intValue()) {
                                case 1:
                                    list.add("android.permission.ACCESS_COARSE_LOCATION");
                                    list.add("android.permission.ACCESS_FINE_LOCATION");
                                    break;
                                case 2:
                                    list.add("android.permission.WRITE_EXTERNAL_STORAGE");
                                    break;
                                case 3:
                                    list.add("android.permission.READ_EXTERNAL_STORAGE");
                                    break;
                            }
                        }
                    }
                    int size = arrayList.size();
                    String[] strArr2 = new String[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        strArr2[i2] = "";
                    }
                    strArr = (String[]) arrayList.toArray(strArr2);
                }
                if (strArr != null) {
                    C47937a.m103724b(activity, 1001, strArr, new C29831b(this, activity, aVar, jSONObject));
                }
            }
        }
    }

    private /* synthetic */ RequestPermissionMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
