package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48308c;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.q */
public final class C48359q implements C10762d {

    /* renamed from: a */
    private C10757a f121653a;

    /* renamed from: b */
    private C48308c f121654b;

    public C48359q(C10757a aVar, C48308c cVar) {
        this.f121653a = aVar;
        this.f121654b = cVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.web.jsbridge.a.b] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.web.jsbridge.a.e] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.web.jsbridge.a.c] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.ss.android.ugc.aweme.web.jsbridge.a.e] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.ss.android.ugc.aweme.web.jsbridge.a.c] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v4, types: [com.ss.android.ugc.aweme.web.jsbridge.a.e]
      assigns: [com.ss.android.ugc.aweme.web.jsbridge.a.e, com.ss.android.ugc.aweme.web.jsbridge.a.c]
      uses: [com.ss.android.ugc.aweme.web.jsbridge.a.e, com.ss.android.ugc.aweme.web.jsbridge.a.b, com.ss.android.ugc.aweme.web.jsbridge.a.c]
      mth insns count: 28
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[Catch:{ Exception -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[Catch:{ Exception -> 0x0038 }] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.p675g.p676a.C10766h r8, org.json.JSONObject r9) throws java.lang.Exception {
        /*
            r7 = this;
            r0 = 0
            r8.f28951h = r0     // Catch:{ Exception -> 0x0038 }
            com.bytedance.ies.g.a.a r4 = r7.f121653a     // Catch:{ Exception -> 0x0038 }
            com.ss.android.ugc.aweme.web.jsbridge.a.a$c r6 = r7.f121654b     // Catch:{ Exception -> 0x0038 }
            java.lang.String r1 = com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.m104636a(r8)     // Catch:{ Exception -> 0x0038 }
            r2 = -1
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x0038 }
            r5 = 3708(0xe7c, float:5.196E-42)
            if (r3 == r5) goto L_0x0015
            goto L_0x001e
        L_0x0015:
            java.lang.String r3 = "v2"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x0038 }
            if (r1 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = -1
        L_0x001f:
            if (r0 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.web.jsbridge.a.c r0 = new com.ss.android.ugc.aweme.web.jsbridge.a.c     // Catch:{ Exception -> 0x0038 }
            r5 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0034
        L_0x002b:
            com.ss.android.ugc.aweme.web.jsbridge.a.e r0 = new com.ss.android.ugc.aweme.web.jsbridge.a.e     // Catch:{ Exception -> 0x0038 }
            r5 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0038 }
        L_0x0034:
            r0.mo95796a()     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.C48359q.call(com.bytedance.ies.g.a.h, org.json.JSONObject):void");
    }
}
