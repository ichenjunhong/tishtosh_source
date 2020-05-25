package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Context;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShowPoiSpuAwemeMethod */
public final class ShowPoiSpuAwemeMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C29841a f77911b = new C29841a(null);

    /* renamed from: a */
    public final WeakReference<Context> f77912a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShowPoiSpuAwemeMethod$a */
    public static final class C29841a {
        private C29841a() {
        }

        public /* synthetic */ C29841a(C52707g gVar) {
            this();
        }
    }

    public ShowPoiSpuAwemeMethod(WeakReference<Context> weakReference) {
        C52711k.m112240b(weakReference, "contextRef");
        this.f77912a = weakReference;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r1 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r3 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r10 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r11 == null) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r10, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x000a
            java.lang.String r11 = "spu_id"
            java.lang.String r11 = r10.optString(r11)
            if (r11 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r11 = ""
        L_0x000c:
            if (r10 == 0) goto L_0x0016
            java.lang.String r0 = "poi_id"
            java.lang.String r0 = r10.optString(r0)
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r0 = ""
        L_0x0018:
            if (r10 == 0) goto L_0x0022
            java.lang.String r1 = "aweme_id"
            java.lang.String r1 = r10.optString(r1)
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            java.lang.String r1 = ""
        L_0x0024:
            if (r10 == 0) goto L_0x002d
            java.lang.String r2 = "page_size"
            int r2 = r10.optInt(r2)
            goto L_0x002f
        L_0x002d:
            r2 = 20
        L_0x002f:
            if (r10 == 0) goto L_0x0039
            java.lang.String r3 = "type"
            java.lang.String r3 = r10.optString(r3)
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r3 = ""
        L_0x003b:
            java.lang.String r4 = "poi"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            r3 = r3 ^ 1
            java.lang.String r4 = ""
            r5 = 0
            if (r10 == 0) goto L_0x0065
            java.lang.String r6 = "tracker_data"
            boolean r6 = r10.isNull(r6)
            if (r6 != 0) goto L_0x0065
            java.lang.String r4 = "tracker_data"
            java.lang.String r4 = r10.getString(r4)
            java.lang.String r10 = "params.getString(PARAM_KEY_TRACKER_DATA)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r10)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>(r4)
            goto L_0x0066
        L_0x0065:
            r10 = r5
        L_0x0066:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "id"
            r6.putString(r7, r1)
            java.lang.String r1 = "video_from"
            java.lang.String r7 = "from_poi_spu_rate_aweme_rn"
            r6.putString(r1, r7)
            java.lang.String r1 = "userid"
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r8 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r7 = r7.getCurUserId()
            r6.putString(r1, r7)
            java.lang.String r1 = "refer"
            if (r10 == 0) goto L_0x0095
            java.lang.String r7 = "enter_from"
            java.lang.String r10 = r10.getString(r7)
            if (r10 != 0) goto L_0x0097
        L_0x0095:
            java.lang.String r10 = ""
        L_0x0097:
            r6.putString(r1, r10)
            java.lang.String r10 = "from_post_list"
            r1 = 0
            r6.putInt(r10, r1)
            java.lang.String r10 = "spu_id"
            r6.putString(r10, r11)
            java.lang.String r10 = "page_size"
            r6.putInt(r10, r2)
            java.lang.String r10 = "content_source"
            java.lang.String r1 = "rate"
            r6.putString(r10, r1)
            java.lang.String r10 = "poi_id"
            r6.putString(r10, r0)
            java.lang.String r10 = "tracker_data"
            r6.putString(r10, r4)
            java.lang.String r10 = "rate_type"
            r6.putInt(r10, r3)
            java.lang.String r10 = "poi_tab_type"
            java.lang.String r1 = "rate"
            r6.putString(r10, r1)
            com.ss.android.ugc.aweme.poi.service.IPoiService r10 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r10 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r10
            r10.setPoiSpuRateAwemeModel(r11, r2, r0, r3)
            android.content.Intent r10 = new android.content.Intent
            java.lang.ref.WeakReference<android.content.Context> r11 = r9.f77912a
            java.lang.Object r11 = r11.get()
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Class<com.ss.android.ugc.aweme.detail.ui.DetailActivity> r0 = com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity.class
            r10.<init>(r11, r0)
            r10.putExtras(r6)
            java.lang.ref.WeakReference<android.content.Context> r11 = r9.f77912a
            java.lang.Object r11 = r11.get()
            android.content.Context r11 = (android.content.Context) r11
            com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity.m66078a(r11, r10, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.ShowPoiSpuAwemeMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
