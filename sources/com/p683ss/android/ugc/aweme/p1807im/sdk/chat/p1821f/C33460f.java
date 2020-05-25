package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f;

import android.os.Build.VERSION;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.C35462l;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.f */
public final class C33460f {

    /* renamed from: a */
    public static final C33460f f86713a = new C33460f();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.f$a */
    public static final class C33461a extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C23371a f86714a;

        public C33461a(C23371a aVar) {
            this.f86714a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            StringBuilder sb = new StringBuilder("checkShowChatCallEntrance result: ");
            sb.append(booleanValue);
            C33460f.m76691a(sb.toString());
            this.f86714a.run(Boolean.valueOf(booleanValue));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.f$b */
    static final class C33462b extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f86715a;

        /* renamed from: b */
        final /* synthetic */ C35462l f86716b;

        /* renamed from: c */
        final /* synthetic */ IMUser f86717c;

        C33462b(String str, C35462l lVar, IMUser iMUser) {
            this.f86715a = str;
            this.f86716b = lVar;
            this.f86717c = iMUser;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                StringBuilder sb = new StringBuilder("startChatCall [");
                sb.append(this.f86715a);
                sb.append("] failed: rtc not enableds");
                C33460f.m76691a(sb.toString());
                if (VERSION.SDK_INT < 21) {
                    StringBuilder sb2 = new StringBuilder("startChatCall [");
                    sb2.append(this.f86715a);
                    sb2.append("] failed: versionUnAvailable");
                    C33460f.m76691a(sb2.toString());
                    C10691a.m21548c(C11010c.m22280a(), (int) R.string.hbk).mo19066a();
                }
            } else {
                C11010c.m22280a();
                C35265e.m79733d();
                String uid = this.f86717c.getUid();
                C52711k.m112236a((Object) uid, "toUser.uid");
                Long.parseLong(uid);
                C52711k.m112236a((Object) this.f86717c.getSecUid(), "toUser.secUid");
            }
            return C52860x.f131107a;
        }
    }

    private C33460f() {
    }

    /* renamed from: a */
    public static void m76691a(String str) {
        StringBuilder sb = new StringBuilder("RtcChatCallHelper ");
        sb.append(str);
        C32458a.m75144a(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.im.service.l] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.im.service.l] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.im.service.l, java.lang.String]
      uses: [java.lang.String, ?[int, boolean, OBJECT, ARRAY, byte, short, char], com.ss.android.ugc.aweme.im.service.l]
      mth insns count: 82
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m76690a(com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "clickFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImChatCallSettings.getValue()
            if (r0 != 0) goto L_0x0022
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "startChatCall ["
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = "] failed: settings disabled"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            m76691a(r4)
            return
        L_0x0022:
            r0 = 0
            if (r4 == 0) goto L_0x00b2
            java.lang.String r1 = r4.getUid()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0038
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r1 = 0
            goto L_0x0039
        L_0x0038:
            r1 = 1
        L_0x0039:
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = r4.getSecUid()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0049
            int r1 = r1.length()
            if (r1 != 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            if (r2 == 0) goto L_0x004d
            goto L_0x00b2
        L_0x004d:
            int r1 = r4.getFollowStatus()
            r2 = 2
            if (r1 == r2) goto L_0x0080
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r1 = 2132542721(0x7f1c0501, float:2.0738555E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r0, r1)
            r0.mo19066a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "startChatCall ["
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = "] failed: toUser not friend: "
            r0.append(r5)
            int r4 = r4.getFollowStatus()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            m76691a(r4)
            return
        L_0x0080:
            com.ss.android.ugc.aweme.im.sdk.d.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r2 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.im.service.j r1 = r1.mo71949f()
            if (r1 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.im.service.l r0 = r1.getXrtcProxy()
        L_0x0093:
            if (r0 != 0) goto L_0x00ac
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "startChatCall ["
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = "] failed: rtcProxy null"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            m76691a(r4)
            return
        L_0x00ac:
            com.ss.android.ugc.aweme.im.sdk.chat.f.f$b r1 = new com.ss.android.ugc.aweme.im.sdk.chat.f.f$b
            r1.<init>(r5, r0, r4)
            return
        L_0x00b2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "startChatCall ["
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = "] failed: toUser invalid ["
            r1.append(r5)
            if (r4 == 0) goto L_0x00c8
            java.lang.String r5 = r4.getUid()
            goto L_0x00c9
        L_0x00c8:
            r5 = r0
        L_0x00c9:
            r1.append(r5)
            java.lang.String r5 = ", "
            r1.append(r5)
            if (r4 == 0) goto L_0x00d7
            java.lang.String r0 = r4.getSecUid()
        L_0x00d7:
            r1.append(r0)
            r4 = 93
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            m76691a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33460f.m76690a(com.ss.android.ugc.aweme.im.service.model.IMUser, java.lang.String):void");
    }
}
