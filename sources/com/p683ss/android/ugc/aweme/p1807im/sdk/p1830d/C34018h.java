package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import android.text.TextUtils;
import com.bytedance.p702im.core.p705b.C11176d;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34548e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35281r;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.ImApi;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h */
public final class C34018h {

    /* renamed from: c */
    public static final C34019a f87955c = new C34019a(null);

    /* renamed from: a */
    public final C1689b f87956a;

    /* renamed from: b */
    volatile boolean f87957b;

    /* renamed from: d */
    private volatile int f87958d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$a */
    public static final class C34019a {
        private C34019a() {
        }

        /* renamed from: a */
        public static C34018h m77784a() {
            return C34020b.f87959a;
        }

        public /* synthetic */ C34019a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$b */
    static final class C34020b {

        /* renamed from: a */
        public static final C34018h f87959a = new C34018h(null);

        /* renamed from: b */
        public static final C34020b f87960b = new C34020b();

        private C34020b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$c */
    static final class C34021c<T> implements C1710e<C34548e> {

        /* renamed from: a */
        final /* synthetic */ C34018h f87961a;

        /* renamed from: b */
        final /* synthetic */ int f87962b;

        C34021c(C34018h hVar, int i) {
            this.f87961a = hVar;
            this.f87962b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            C34548e eVar = (C34548e) obj;
            C34018h hVar = this.f87961a;
            String str = eVar.f89072c;
            int i = this.f87962b;
            String eVar2 = eVar.toString();
            C52711k.m112236a((Object) eVar2, "it.toString()");
            hVar.mo71973a(true, str, null, i, 1, eVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$d */
    static final class C34022d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C34018h f87963a;

        /* renamed from: b */
        final /* synthetic */ int f87964b;

        C34022d(C34018h hVar, int i) {
            this.f87963a = hVar;
            this.f87964b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f87963a.mo71973a(true, null, (Throwable) obj, this.f87964b, 1, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$e */
    static final class C34023e<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f87965a;

        C34023e(boolean z) {
            this.f87965a = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C34004b.m77717a();
            C34004b.m77719c();
            if (this.f87965a) {
                C35197am.m79562c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$f */
    static final class C34024f<T> implements C1710e<C34548e> {

        /* renamed from: a */
        final /* synthetic */ C34018h f87966a;

        /* renamed from: b */
        final /* synthetic */ boolean f87967b;

        /* renamed from: c */
        final /* synthetic */ int f87968c;

        /* renamed from: d */
        final /* synthetic */ boolean f87969d;

        C34024f(C34018h hVar, boolean z, int i, boolean z2) {
            this.f87966a = hVar;
            this.f87967b = z;
            this.f87968c = i;
            this.f87969d = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
            if (r4 == r2) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r11) {
            /*
                r10 = this;
                com.ss.android.ugc.aweme.im.sdk.model.e r11 = (com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34548e) r11
                com.ss.android.ugc.aweme.im.sdk.model.f r0 = r11.f89070a
                r1 = 1
                if (r0 == 0) goto L_0x007e
                com.ss.android.ugc.aweme.im.sdk.utils.t r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r3 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                long r2 = r2.mo73421g()
                long r4 = r0.f89073a
                r6 = 0
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x007e
                java.lang.String r6 = "im_flip_chat"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = "fetchRebootMiscState-delTime="
                r7.<init>(r8)
                r7.append(r4)
                java.lang.String r7 = r7.toString()
                com.p683ss.android.agilelogger.C18778a.m45854e(r6, r7)
                r6 = 0
                int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r7 <= 0) goto L_0x0042
                com.ss.android.ugc.aweme.im.sdk.utils.t r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r7 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                r6.mo73393a(r4)
            L_0x0040:
                r6 = 1
                goto L_0x0047
            L_0x0042:
                int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r7 != 0) goto L_0x0047
                goto L_0x0040
            L_0x0047:
                long r7 = r0.f89074b
                int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x005a
                com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r2 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r0.mo73393a(r4)
                r6 = 1
            L_0x005a:
                if (r6 == 0) goto L_0x007e
                com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r2 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                boolean r0 = r0.mo73420f()
                if (r0 != 0) goto L_0x007e
                com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r2 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r0.mo73404b(r1)
                com.ss.android.ugc.aweme.im.sdk.d.k r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.m77795a()
                r0.mo71990g()
            L_0x007e:
                java.lang.Boolean r0 = r11.f89071b
                if (r0 == 0) goto L_0x00a3
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x00a3
                com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r2 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                boolean r0 = r0.mo73416e()
                if (r0 != 0) goto L_0x00a3
                com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r2 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r0.mo73399a(r1)
            L_0x00a3:
                com.ss.android.ugc.aweme.im.sdk.d.h r3 = r10.f87966a
                boolean r4 = r10.f87967b
                java.lang.String r5 = r11.f89072c
                r6 = 0
                int r7 = r10.f87968c
                boolean r0 = r10.f87969d
                int r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34018h.m77774a(r0)
                java.lang.String r9 = r11.toString()
                java.lang.String r11 = "it.toString()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r11)
                r3.mo71973a(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34018h.C34024f.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$g */
    static final class C34025g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C34018h f87970a;

        /* renamed from: b */
        final /* synthetic */ boolean f87971b;

        /* renamed from: c */
        final /* synthetic */ int f87972c;

        /* renamed from: d */
        final /* synthetic */ boolean f87973d;

        C34025g(C34018h hVar, boolean z, int i, boolean z2) {
            this.f87970a = hVar;
            this.f87971b = z;
            this.f87972c = i;
            this.f87973d = z2;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f87970a.mo71973a(this.f87971b, null, (Throwable) obj, this.f87972c, C34018h.m77774a(this.f87973d), "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$h */
    public static final class C34026h<T> implements C1710e<C34548e> {

        /* renamed from: a */
        final /* synthetic */ C34018h f87974a;

        public C34026h(C34018h hVar) {
            this.f87974a = hVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i;
            C34548e eVar = (C34548e) obj;
            C35284t a = C35284t.m79782a();
            C52711k.m112236a((Object) a, "IMSPUtils.get()");
            String k = a.mo73432k();
            if (TextUtils.isEmpty(eVar.f89072c)) {
                C34018h.m77778a((Throwable) null);
                i = 0;
            } else {
                C35284t a2 = C35284t.m79782a();
                C52711k.m112236a((Object) a2, "IMSPUtils.get()");
                a2.mo73395a(eVar.f89072c);
                C35197am.m79565d();
                i = 1;
            }
            C34018h hVar = this.f87974a;
            C52711k.m112236a((Object) k, "localToken");
            String eVar2 = eVar.toString();
            C52711k.m112236a((Object) eVar2, "it.toString()");
            hVar.mo71971a(2, k, 1, i, "", eVar2, eVar.f89072c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$i */
    public static final class C34027i<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C34018h f87975a;

        public C34027i(C34018h hVar) {
            this.f87975a = hVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C34018h.m77778a(th);
            C34018h hVar = this.f87975a;
            C35284t a = C35284t.m79782a();
            C52711k.m112236a((Object) a, "IMSPUtils.get()");
            String k = a.mo73432k();
            C52711k.m112236a((Object) k, "IMSPUtils.get().token");
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            hVar.mo71971a(2, k, 1, 0, message, "", null);
        }
    }

    /* renamed from: a */
    public static int m77774a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: b */
    public static final C34018h m77779b() {
        return C34019a.m77784a();
    }

    private C34018h() {
        this.f87956a = new C1689b();
    }

    /* renamed from: a */
    public final void mo71970a() {
        C34018h hVar;
        StringBuilder sb = new StringBuilder("ensureIMState state=");
        sb.append(this.f87957b);
        m77777a(sb.toString());
        if (!this.f87957b) {
            hVar = this;
        } else {
            hVar = null;
        }
        C34018h hVar2 = hVar;
        if (hVar2 != null) {
            hVar2.mo71972a(true, 3);
        }
    }

    public /* synthetic */ C34018h(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public static void m77777a(String str) {
        StringBuilder sb = new StringBuilder("MixInitTask ");
        sb.append(str);
        C32458a.m75144a(sb.toString());
    }

    /* renamed from: a */
    public static void m77778a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", "fetch_token_failed");
            if (th != null) {
                jSONObject.put("error", th.toString());
            }
            C11176d.m22636a("chat_room", "fetch_token_failed", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo71972a(boolean z, int i) {
        boolean z2;
        boolean z3;
        Boolean bool;
        StringBuilder sb = new StringBuilder("start login, netPull: ");
        sb.append(z);
        m77777a(sb.toString());
        this.f87958d = 0;
        this.f87956a.mo6180a();
        if (!C35265e.m79727a()) {
            m77777a("start login but user not login");
            return;
        }
        C35284t a = C35284t.m79782a();
        C52711k.m112236a((Object) a, "IMSPUtils.get()");
        boolean isEmpty = TextUtils.isEmpty(a.mo73432k());
        if (!isEmpty) {
            m77777a("start login local token exist and login IM");
            this.f87956a.mo6181a(C1680ad.m5961a(Boolean.valueOf(true)).mo6148a(C1667a.m5940a()).mo6162d(new C34023e(z)));
        }
        if (z) {
            if (isEmpty || C35284t.m79782a().mo73439o()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C35243bl.m79709a()) {
                C35284t a2 = C35284t.m79782a();
                C52711k.m112236a((Object) a2, "IMSPUtils.get()");
                if (!a2.mo73416e()) {
                    z3 = true;
                    IESSettingsProxy b = C32816h.m75716b();
                    C52711k.m112236a((Object) b, "SettingsReader.get()");
                    FlipChatSettings flipchatSettings = b.getFlipchatSettings();
                    C52711k.m112236a((Object) flipchatSettings, "SettingsReader.get().flipchatSettings");
                    bool = flipchatSettings.getMainSwitch();
                    StringBuilder sb2 = new StringBuilder("start login do fetch mix needToken ");
                    sb2.append(z2);
                    sb2.append(" needXPlan ");
                    sb2.append(z3);
                    sb2.append(" needRChat ");
                    sb2.append(bool);
                    m77777a(sb2.toString());
                    C1689b bVar = this.f87956a;
                    ImApi a3 = C35286u.m79865a();
                    C52711k.m112236a((Object) bool, "needRChat");
                    bVar.mo6181a(a3.fetchMixInit(m77774a(bool.booleanValue()), m77774a(z3), m77774a(z2)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C34024f<Object>(this, isEmpty, i, z2), (C1710e<? super Throwable>) new C34025g<Object>(this, isEmpty, i, z2)));
                    this.f87957b = true;
                }
            }
            z3 = false;
            try {
                IESSettingsProxy b2 = C32816h.m75716b();
                C52711k.m112236a((Object) b2, "SettingsReader.get()");
                FlipChatSettings flipchatSettings2 = b2.getFlipchatSettings();
                C52711k.m112236a((Object) flipchatSettings2, "SettingsReader.get().flipchatSettings");
                bool = flipchatSettings2.getMainSwitch();
            } catch (Exception unused) {
                bool = Boolean.valueOf(false);
            }
            StringBuilder sb22 = new StringBuilder("start login do fetch mix needToken ");
            sb22.append(z2);
            sb22.append(" needXPlan ");
            sb22.append(z3);
            sb22.append(" needRChat ");
            sb22.append(bool);
            m77777a(sb22.toString());
            C1689b bVar2 = this.f87956a;
            ImApi a32 = C35286u.m79865a();
            C52711k.m112236a((Object) bool, "needRChat");
            bVar2.mo6181a(a32.fetchMixInit(m77774a(bool.booleanValue()), m77774a(z3), m77774a(z2)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C34024f<Object>(this, isEmpty, i, z2), (C1710e<? super Throwable>) new C34025g<Object>(this, isEmpty, i, z2)));
            this.f87957b = true;
        }
    }

    /* renamed from: a */
    private static HashMap<String, Object> m77775a(int i, String str, int i2, int i3, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Map map = hashMap;
        map.put("reason", Integer.valueOf(i));
        map.put("local_token", str);
        map.put("need_token", Integer.valueOf(i2));
        map.put("status", Integer.valueOf(i3));
        map.put("error_msg", str2);
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0049, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71973a(boolean r19, java.lang.String r20, java.lang.Throwable r21, int r22, int r23, java.lang.String r24) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleToken token is empty, force = "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", retryCount = "
            r0.append(r1)
            int r1 = r8.f87958d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m77777a(r0)
            int r0 = r8.f87958d
            if (r0 != 0) goto L_0x005e
            com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            java.lang.String r1 = "IMSPUtils.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r2 = r0.mo73432k()
            java.lang.String r0 = "IMSPUtils.get().token"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r0)
            r4 = 0
            if (r21 == 0) goto L_0x004e
            java.lang.String r0 = r21.getMessage()
            if (r0 != 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = r0
            goto L_0x0051
        L_0x004e:
            java.lang.String r0 = ""
            goto L_0x004c
        L_0x0051:
            r0 = r18
            r1 = r22
            r3 = r23
            r6 = r24
            r7 = r20
            r0.mo71971a(r1, r2, r3, r4, r5, r6, r7)
        L_0x005e:
            if (r9 == 0) goto L_0x00b4
            int r0 = r8.f87958d
            r1 = 50
            if (r0 > r1) goto L_0x00b4
            int r0 = r8.f87958d
            r1 = 1
            int r0 = r0 + r1
            r8.f87958d = r0
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79727a()
            if (r0 == 0) goto L_0x00b4
            c.a.b.b r0 = r8.f87956a
            com.ss.android.ugc.aweme.im.sdk.utils.ImApi r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u.m79865a()
            r3 = 0
            c.a.v r12 = r2.fetchMixInit(r3, r3, r1)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
            r13 = 5
            c.a.ac r16 = p064c.p065a.p093k.C2168a.m6519a()
            r17 = 1
            c.a.v r2 = r12.mo6512a(r13, r15, r16, r17)
            c.a.ac r3 = p064c.p065a.p093k.C2168a.m6521b()
            c.a.v r2 = r2.mo6529b(r3)
            c.a.ac r3 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            int r4 = p064c.p065a.C2201v.m6590a()
            c.a.v r1 = r2.mo6515a(r3, r1, r4)
            com.ss.android.ugc.aweme.im.sdk.d.h$c r2 = new com.ss.android.ugc.aweme.im.sdk.d.h$c
            r2.<init>(r8, r11)
            c.a.d.e r2 = (p064c.p065a.p071d.C1710e) r2
            com.ss.android.ugc.aweme.im.sdk.d.h$d r3 = new com.ss.android.ugc.aweme.im.sdk.d.h$d
            r3.<init>(r8, r11)
            c.a.d.e r3 = (p064c.p065a.p071d.C1710e) r3
            c.a.b.c r1 = r1.mo6505a(r2, r3)
            r0.mo6181a(r1)
        L_0x00b4:
            m77778a(r21)
            return
        L_0x00b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleToken token is OK, force = "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", retryCount = "
            r0.append(r1)
            int r1 = r8.f87958d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m77777a(r0)
            com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            java.lang.String r1 = "IMSPUtils.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r2 = r0.mo73432k()
            java.lang.String r0 = "IMSPUtils.get().token"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r0)
            r4 = 1
            java.lang.String r5 = ""
            r0 = r18
            r1 = r22
            r3 = r23
            r6 = r24
            r7 = r20
            r0.mo71971a(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            java.lang.String r1 = "IMSPUtils.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.mo73395a(r10)
            if (r9 == 0) goto L_0x010c
            com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77719c()
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79562c()
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34018h.mo71973a(boolean, java.lang.String, java.lang.Throwable, int, int, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo71971a(int i, String str, int i2, int i3, String str2, String str3, String str4) {
        HashMap a = m77775a(i, str, i2, i3, str2);
        if (i3 == 0) {
            C35265e.m79726a("im_reboot_misc_query", a);
        }
        C35281r.f90615b.mo73372a(str, str4, i, i3);
        Map map = a;
        String str5 = "token";
        if (str4 == null) {
            str4 = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        map.put(str5, str4);
        map.put("resp", str3);
        StringBuilder sb = new StringBuilder("im_reboot_misc_query ");
        sb.append(a);
        C32458a.m75144a(sb.toString());
    }
}
