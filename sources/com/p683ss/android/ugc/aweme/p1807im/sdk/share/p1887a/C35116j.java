package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.j */
public final class C35116j {

    /* renamed from: a */
    public static final C35116j f90311a = new C35116j();

    /* renamed from: b */
    private static C35115i f90312b;

    /* renamed from: c */
    private static final Map<String, C35115i> f90313c = new LinkedHashMap();

    private C35116j() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0168  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m79347a(com.bytedance.p702im.core.p706c.C11207p r10) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.share.a.j> r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j.class
            monitor-enter(r0)
            com.ss.android.ugc.aweme.im.sdk.share.a.i r1 = f90312b     // Catch:{ all -> 0x016e }
            if (r1 == 0) goto L_0x016c
            r1 = 2
            if (r10 == 0) goto L_0x0010
            int r2 = r10.getMsgStatus()     // Catch:{ all -> 0x016e }
            if (r2 == r1) goto L_0x001b
        L_0x0010:
            if (r10 == 0) goto L_0x016c
            int r2 = r10.getMsgStatus()     // Catch:{ all -> 0x016e }
            r3 = 3
            if (r2 == r3) goto L_0x001b
            monitor-exit(r0)
            return
        L_0x001b:
            java.lang.String r2 = "process_id"
            java.lang.String r2 = r10.getLocalExtValue(r2)     // Catch:{ all -> 0x016e }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x016e }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x016e }
            r3 = 1
            r4 = 0
            r5 = 8
            r6 = 0
            if (r2 != 0) goto L_0x00ac
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.share.a.i> r2 = f90313c     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "process_id"
            java.lang.String r7 = r10.getLocalExtValue(r7)     // Catch:{ all -> 0x016e }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x016e }
            com.ss.android.ugc.aweme.im.sdk.share.a.i r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35115i) r2     // Catch:{ all -> 0x016e }
            if (r2 == 0) goto L_0x00ac
            java.lang.String r7 = r2.f90307a     // Catch:{ all -> 0x016e }
            java.lang.String r8 = "aweme"
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)     // Catch:{ all -> 0x016e }
            if (r7 == 0) goto L_0x00ac
            int r7 = r10.getMsgType()     // Catch:{ all -> 0x016e }
            if (r7 != r5) goto L_0x00ac
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r2.f90308b     // Catch:{ all -> 0x016e }
            java.lang.String r7 = r10.getConversationId()     // Catch:{ all -> 0x016e }
            boolean r5 = r5.containsKey(r7)     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = r6
        L_0x005c:
            if (r2 == 0) goto L_0x0126
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r2.f90308b     // Catch:{ all -> 0x016e }
            java.lang.String r7 = r10.getConversationId()     // Catch:{ all -> 0x016e }
            java.lang.Object r5 = r5.remove(r7)     // Catch:{ all -> 0x016e }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x0126
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x016e }
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r7 = r2.f90309c     // Catch:{ all -> 0x016e }
            android.os.Bundle r7 = r7.f106900i     // Catch:{ all -> 0x016e }
            java.lang.String r8 = r10.getConversationId()     // Catch:{ all -> 0x016e }
            java.lang.String r9 = "message.conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)     // Catch:{ all -> 0x016e }
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai.m79542a(r7, r8, r5)     // Catch:{ all -> 0x016e }
            if (r10 == 0) goto L_0x0089
            int r7 = r10.getMsgStatus()     // Catch:{ all -> 0x016e }
            if (r7 != r1) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r3 = 0
        L_0x008a:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r2.f90309c     // Catch:{ all -> 0x016e }
            android.os.Bundle r1 = r1.f106900i     // Catch:{ all -> 0x016e }
            java.lang.String r2 = r10.getConversationId()     // Catch:{ all -> 0x016e }
            java.lang.String r4 = "message.conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ all -> 0x016e }
            if (r10 == 0) goto L_0x009e
            java.util.Map r4 = r10.getLocalExt()     // Catch:{ all -> 0x016e }
            goto L_0x009f
        L_0x009e:
            r4 = r6
        L_0x009f:
            java.lang.String r7 = "s:err_code"
            java.lang.Object r4 = r4.get(r7)     // Catch:{ all -> 0x016e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x016e }
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai.m79543a(r1, r2, r5, r3, r4)     // Catch:{ all -> 0x016e }
            goto L_0x0126
        L_0x00ac:
            com.ss.android.ugc.aweme.im.sdk.share.a.i r2 = f90312b     // Catch:{ all -> 0x016e }
            if (r2 != 0) goto L_0x00b3
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x016e }
        L_0x00b3:
            java.lang.String r2 = r2.f90307a     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "aweme"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r7)     // Catch:{ all -> 0x016e }
            if (r2 == 0) goto L_0x0126
            int r2 = r10.getMsgType()     // Catch:{ all -> 0x016e }
            if (r2 != r5) goto L_0x0126
            com.ss.android.ugc.aweme.im.sdk.share.a.i r2 = f90312b     // Catch:{ all -> 0x016e }
            if (r2 != 0) goto L_0x00ca
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x016e }
        L_0x00ca:
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r2.f90308b     // Catch:{ all -> 0x016e }
            java.lang.String r7 = r10.getConversationId()     // Catch:{ all -> 0x016e }
            boolean r5 = r5.containsKey(r7)     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r2 = r6
        L_0x00d8:
            if (r2 == 0) goto L_0x0126
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r2.f90308b     // Catch:{ all -> 0x016e }
            java.lang.String r7 = r10.getConversationId()     // Catch:{ all -> 0x016e }
            java.lang.Object r5 = r5.remove(r7)     // Catch:{ all -> 0x016e }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x0126
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x016e }
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r7 = r2.f90309c     // Catch:{ all -> 0x016e }
            android.os.Bundle r7 = r7.f106900i     // Catch:{ all -> 0x016e }
            java.lang.String r8 = r10.getConversationId()     // Catch:{ all -> 0x016e }
            java.lang.String r9 = "message.conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)     // Catch:{ all -> 0x016e }
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai.m79542a(r7, r8, r5)     // Catch:{ all -> 0x016e }
            if (r10 == 0) goto L_0x0105
            int r7 = r10.getMsgStatus()     // Catch:{ all -> 0x016e }
            if (r7 != r1) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r3 = 0
        L_0x0106:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r2.f90309c     // Catch:{ all -> 0x016e }
            android.os.Bundle r1 = r1.f106900i     // Catch:{ all -> 0x016e }
            java.lang.String r2 = r10.getConversationId()     // Catch:{ all -> 0x016e }
            java.lang.String r4 = "message.conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ all -> 0x016e }
            if (r10 == 0) goto L_0x011a
            java.util.Map r4 = r10.getLocalExt()     // Catch:{ all -> 0x016e }
            goto L_0x011b
        L_0x011a:
            r4 = r6
        L_0x011b:
            java.lang.String r7 = "s:err_code"
            java.lang.Object r4 = r4.get(r7)     // Catch:{ all -> 0x016e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x016e }
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai.m79543a(r1, r2, r5, r3, r4)     // Catch:{ all -> 0x016e }
        L_0x0126:
            java.lang.String r1 = "process_id"
            java.lang.String r1 = r10.getLocalExtValue(r1)     // Catch:{ all -> 0x016e }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x016e }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x016e }
            if (r1 != 0) goto L_0x0159
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.share.a.i> r1 = f90313c     // Catch:{ all -> 0x016e }
            java.lang.String r2 = "process_id"
            java.lang.String r2 = r10.getLocalExtValue(r2)     // Catch:{ all -> 0x016e }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x016e }
            com.ss.android.ugc.aweme.im.sdk.share.a.i r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35115i) r1     // Catch:{ all -> 0x016e }
            if (r1 == 0) goto L_0x0159
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r1.f90308b     // Catch:{ all -> 0x016e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x016e }
            if (r1 == 0) goto L_0x0159
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.share.a.i> r1 = f90313c     // Catch:{ all -> 0x016e }
            java.lang.String r2 = "process_id"
            java.lang.String r10 = r10.getLocalExtValue(r2)     // Catch:{ all -> 0x016e }
            r1.remove(r10)     // Catch:{ all -> 0x016e }
            monitor-exit(r0)
            return
        L_0x0159:
            com.ss.android.ugc.aweme.im.sdk.share.a.i r10 = f90312b     // Catch:{ all -> 0x016e }
            if (r10 != 0) goto L_0x0160
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x016e }
        L_0x0160:
            java.util.Map<java.lang.String, java.lang.Boolean> r10 = r10.f90308b     // Catch:{ all -> 0x016e }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x016e }
            if (r10 == 0) goto L_0x016a
            f90312b = r6     // Catch:{ all -> 0x016e }
        L_0x016a:
            monitor-exit(r0)
            return
        L_0x016c:
            monitor-exit(r0)
            return
        L_0x016e:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j.m79347a(com.bytedance.im.core.c.p):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m79348a(java.lang.String r5, com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r6, java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact> r7) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.share.a.j> r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j.class
            monitor-enter(r0)
            java.lang.String r1 = "sharePackage"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r1)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "list"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r1)     // Catch:{ all -> 0x0095 }
            com.ss.android.ugc.aweme.im.sdk.share.a.i r1 = f90312b     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = "ShareStateHelper markShare lastShareState not null"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r1)     // Catch:{ all -> 0x0095 }
        L_0x0016:
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x001e
            monitor-exit(r0)
            return
        L_0x001e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0095 }
            r1.<init>()     // Catch:{ all -> 0x0095 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0095 }
            r2 = r7
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0095 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0095 }
        L_0x002c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0095 }
            if (r3 == 0) goto L_0x0075
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0095 }
            com.ss.android.ugc.aweme.im.service.model.IMContact r3 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r3     // Catch:{ all -> 0x0095 }
            boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r3     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = r3.getUid()     // Catch:{ all -> 0x0095 }
            java.lang.String r4 = "it.uid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ all -> 0x0095 }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = com.bytedance.p702im.core.p706c.C11190e.m22687a(r3)     // Catch:{ all -> 0x0095 }
            java.lang.String r4 = "ConversationModel.findCo…nIdByUid(it.uid.toLong())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ all -> 0x0095 }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0095 }
            r1.put(r3, r4)     // Catch:{ all -> 0x0095 }
            goto L_0x002c
        L_0x005d:
            boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.im.service.model.IMConversation r3 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r3     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = r3.getConversationId()     // Catch:{ all -> 0x0095 }
            java.lang.String r4 = "it.conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ all -> 0x0095 }
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0095 }
            r1.put(r3, r4)     // Catch:{ all -> 0x0095 }
            goto L_0x002c
        L_0x0075:
            com.ss.android.ugc.aweme.im.sdk.share.a.i r2 = new com.ss.android.ugc.aweme.im.sdk.share.a.i     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = r6.f106895d     // Catch:{ all -> 0x0095 }
            r2.<init>(r3, r1, r6, r7)     // Catch:{ all -> 0x0095 }
            f90312b = r2     // Catch:{ all -> 0x0095 }
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x0095 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0095 }
            if (r6 != 0) goto L_0x0093
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.share.a.i> r6 = f90313c     // Catch:{ all -> 0x0095 }
            if (r5 != 0) goto L_0x008e
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x0095 }
        L_0x008e:
            com.ss.android.ugc.aweme.im.sdk.share.a.i r7 = f90312b     // Catch:{ all -> 0x0095 }
            r6.put(r5, r7)     // Catch:{ all -> 0x0095 }
        L_0x0093:
            monitor-exit(r0)
            return
        L_0x0095:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j.m79348a(java.lang.String, com.ss.android.ugc.aweme.sharer.ui.SharePackage, java.util.List):void");
    }
}
