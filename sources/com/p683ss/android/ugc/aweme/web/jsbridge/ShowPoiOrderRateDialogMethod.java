package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ShowPoiOrderRateDialogMethod */
public final class ShowPoiOrderRateDialogMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C48298a f121527b = new C48298a(null);

    /* renamed from: a */
    public final WeakReference<Context> f121528a;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ShowPoiOrderRateDialogMethod$a */
    public static final class C48298a {
        private C48298a() {
        }

        public /* synthetic */ C48298a(C52707g gVar) {
            this();
        }
    }

    public ShowPoiOrderRateDialogMethod(WeakReference<Context> weakReference) {
        C52711k.m112240b(weakReference, "contextRef");
        this.f121528a = weakReference;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r12 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r12 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r12 == null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r12 == null) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r11, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x000d
            java.lang.String r12 = "poi_id"
            java.lang.String r12 = r11.getString(r12)
            if (r12 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = r12
            goto L_0x0010
        L_0x000d:
            java.lang.String r12 = ""
            goto L_0x000b
        L_0x0010:
            if (r11 == 0) goto L_0x001d
            java.lang.String r12 = "poi_name"
            java.lang.String r12 = r11.getString(r12)
            if (r12 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r3 = r12
            goto L_0x0020
        L_0x001d:
            java.lang.String r12 = ""
            goto L_0x001b
        L_0x0020:
            if (r11 == 0) goto L_0x002d
            java.lang.String r12 = "object_id"
            java.lang.String r12 = r11.getString(r12)
            if (r12 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r4 = r12
            goto L_0x0030
        L_0x002d:
            java.lang.String r12 = ""
            goto L_0x002b
        L_0x0030:
            if (r11 == 0) goto L_0x003a
            java.lang.String r12 = "object_type"
            java.lang.String r12 = r11.getString(r12)
            if (r12 != 0) goto L_0x003c
        L_0x003a:
            java.lang.String r12 = "0"
        L_0x003c:
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x0052
            java.lang.String r1 = "spu_id"
            boolean r1 = r11.isNull(r1)
            if (r1 != 0) goto L_0x0052
            java.lang.String r0 = "spu_id"
            java.lang.String r0 = r11.getString(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = ""
        L_0x0052:
            r6 = r0
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            if (r11 == 0) goto L_0x0096
            java.lang.String r0 = "tracker_data"
            boolean r0 = r11.isNull(r0)
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "tracker_data"
            java.lang.String r11 = r11.getString(r0)
            if (r11 != 0) goto L_0x006c
            java.lang.String r11 = ""
        L_0x006c:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r11)
            java.util.Iterator r11 = r0.keys()
        L_0x0075:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0096
            java.lang.Object r1 = r11.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = r0.getString(r1)
            r7 = r8
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r9 = "key"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r9)
            java.lang.String r9 = "value"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)
            r7.put(r1, r5)
            goto L_0x0075
        L_0x0096:
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            r0 = r11
            com.ss.android.ugc.aweme.poi.service.IPoiService r0 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r0
            java.lang.ref.WeakReference<android.content.Context> r11 = r10.f121528a
            java.lang.Object r11 = r11.get()
            r1 = r11
            android.content.Context r1 = (android.content.Context) r1
            int r11 = java.lang.Integer.parseInt(r12)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.lang.String r7 = ""
            r0.showPoiRateDialog(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.ShowPoiOrderRateDialogMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
