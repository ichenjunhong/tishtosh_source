package com.p683ss.android.ugc.aweme.p1706fe.method.commerce;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.TaoCommandMethod */
public final class TaoCommandMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29876a f77978a = new C29876a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.TaoCommandMethod$a */
    public static final class C29876a {
        private C29876a() {
        }

        public /* synthetic */ C29876a(C52707g gVar) {
            this();
        }
    }

    public TaoCommandMethod() {
        this(null, 1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023 A[Catch:{ Exception -> 0x002c }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m70023c() {
        /*
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x002c }
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x0020
            android.content.ClipData r0 = r0.getPrimaryClip()     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x0020
            r1 = 0
            android.content.ClipData$Item r0 = r0.getItemAt(r1)     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x0020
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x002c }
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x002c }
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r0 = ""
        L_0x002b:
            return r0
        L_0x002c:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.commerce.TaoCommandMethod.m70023c():java.lang.String");
    }

    public TaoCommandMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("command", m70023c());
        aVar.mo60039a((Object) jSONObject2);
    }

    public /* synthetic */ TaoCommandMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
