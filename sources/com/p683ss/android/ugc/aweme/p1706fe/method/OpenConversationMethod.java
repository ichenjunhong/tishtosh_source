package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1901c.C35432b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod */
public final class OpenConversationMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29820a f77864a = new C29820a(null);

    /* renamed from: b */
    private HashMap<String, C29789a> f77865b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod$a */
    public static final class C29820a {
        private C29820a() {
        }

        public /* synthetic */ C29820a(C52707g gVar) {
            this();
        }
    }

    public OpenConversationMethod() {
        this(null, 1, null);
    }

    public OpenConversationMethod(C10757a aVar) {
        super(aVar);
        this.f77865b = new HashMap<>();
    }

    @C53771m
    public final void onSelectedChatMsg(C35432b bVar) {
        C52711k.m112240b(bVar, "event");
        String str = bVar.f91103b;
        boolean z = true;
        if (C24678b.m60182a(str)) {
            Map map = this.f77865b;
            if (map == null) {
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            } else if (map.containsKey(str)) {
                Map map2 = this.f77865b;
                if (map2 != null) {
                    C29789a aVar = (C29789a) C52731z.m112270f(map2).remove(str);
                    if (aVar != null && C24678b.m60182a(bVar.f91102a)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("msgList", bVar.f91102a);
                        aVar.mo60040a(jSONObject, 1, "");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
            }
        }
        Map map3 = this.f77865b;
        if (map3 != null && !map3.isEmpty()) {
            z = false;
        }
        if (z) {
            C47718bf.m103291d(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r14, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x000a
            java.lang.String r1 = "extra"
            java.lang.String r1 = r14.optString(r1)
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r2 = 0
            goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            if (r2 == 0) goto L_0x001f
            return
        L_0x001f:
            java.lang.String r2 = "utf-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)
            java.lang.Class<com.google.gson.o> r2 = com.google.gson.C18085o.class
            java.lang.Object r1 = com.p683ss.android.ugc.aweme.utils.C47760cd.m103384a(r1, r2)
            com.google.gson.o r1 = (com.google.gson.C18085o) r1
            if (r1 == 0) goto L_0x003c
            java.lang.String r2 = "conversation_id"
            com.google.gson.l r2 = r1.mo35022b(r2)
            if (r2 == 0) goto L_0x003c
            java.lang.String r2 = r2.mo34905c()
            goto L_0x003d
        L_0x003c:
            r2 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x004c
            java.lang.String r5 = "uid"
            com.google.gson.l r5 = r1.mo35022b(r5)
            if (r5 == 0) goto L_0x004c
            java.lang.String r5 = r5.mo34905c()
            goto L_0x004d
        L_0x004c:
            r5 = r0
        L_0x004d:
            if (r1 == 0) goto L_0x005c
            java.lang.String r6 = "nickname"
            com.google.gson.l r1 = r1.mo35022b(r6)
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r1.mo34905c()
            goto L_0x005d
        L_0x005c:
            r1 = r0
        L_0x005d:
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x006b
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r6 = 0
            goto L_0x006c
        L_0x006b:
            r6 = 1
        L_0x006c:
            if (r6 == 0) goto L_0x0093
            boolean r6 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r5)
            if (r6 == 0) goto L_0x0093
            boolean r6 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r1)
            if (r6 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.im.service.IIMService r2 = com.p683ss.android.ugc.aweme.p1807im.C33194e.m76279d()
            java.lang.String r2 = r2.getConversationId(r5)
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = new com.ss.android.ugc.aweme.im.service.model.IMUser
            r6.<init>()
            r6.setUid(r5)
            r6.setNickName(r1)
            r6.setFake(r4)
            r9 = r2
            r10 = r6
            goto L_0x0095
        L_0x0093:
            r10 = r0
            r9 = r2
        L_0x0095:
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x00a0
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00a1
        L_0x00a0:
            r3 = 1
        L_0x00a1:
            if (r3 != 0) goto L_0x00aa
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = r13.f77865b
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r9, r15)
        L_0x00aa:
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r13)
            com.ss.android.ugc.aweme.im.service.IIMService r7 = com.p683ss.android.ugc.aweme.p1807im.C33194e.m76279d()
            java.lang.ref.WeakReference r15 = r13.f77793e
            java.lang.Object r15 = r15.get()
            if (r15 == 0) goto L_0x00cc
            android.app.Activity r15 = (android.app.Activity) r15
            r8 = r15
            android.content.Context r8 = (android.content.Context) r8
            r11 = 1
            if (r14 == 0) goto L_0x00c7
            java.lang.String r15 = "msgList"
            java.lang.String r0 = r14.optString(r15)
        L_0x00c7:
            r12 = r0
            r7.startSelectChatMsg(r8, r9, r10, r11, r12)
            return
        L_0x00cc:
            d.u r14 = new d.u
            java.lang.String r15 = "null cannot be cast to non-null type android.app.Activity"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.OpenConversationMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ OpenConversationMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
