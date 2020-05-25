package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio;

import android.text.TextUtils;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33374a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33414f.C33416a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import java.io.File;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d */
public final class C33495d implements C33512m {

    /* renamed from: f */
    public static final C33497b f86788f = new C33497b(null);

    /* renamed from: a */
    C33498e f86789a;

    /* renamed from: b */
    List<C11207p> f86790b;

    /* renamed from: c */
    C33511l f86791c;

    /* renamed from: d */
    public C11207p f86792d;

    /* renamed from: e */
    C11207p f86793e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d$a */
    public final class C33496a implements C33416a {

        /* renamed from: a */
        public final C11207p f86794a;

        /* renamed from: b */
        final /* synthetic */ C33495d f86795b;

        /* renamed from: a */
        public final void mo70821a(Throwable th) {
        }

        public C33496a(C33495d dVar, C11207p pVar) {
            C52711k.m112240b(pVar, "message");
            this.f86795b = dVar;
            this.f86794a = pVar;
        }

        /* renamed from: a */
        public final void mo70820a(String str, UrlModel urlModel) {
            boolean z;
            CharSequence charSequence = str;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.f86795b.f86792d != null) {
                C11207p pVar = this.f86794a;
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    File file = new File(str);
                    if (file.exists() && file.isFile()) {
                        Map localExt = pVar.getLocalExt();
                        C52711k.m112236a((Object) localExt, "localExt");
                        localExt.put("localpath", str);
                    }
                }
                if (C52711k.m112239a((Object) this.f86794a, (Object) this.f86795b.f86792d)) {
                    this.f86795b.mo70924a(this.f86794a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d$b */
    public static final class C33497b {
        private C33497b() {
        }

        public /* synthetic */ C33497b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo70925b() {
        this.f86793e = null;
        C33511l lVar = this.f86791c;
        if (lVar == null) {
            C52711k.m112237a("callback");
        }
        lVar.mo70909c();
    }

    /* renamed from: a */
    public final void mo70921a() {
        C11207p pVar;
        boolean z;
        C33511l lVar = this.f86791c;
        if (lVar == null) {
            C52711k.m112237a("callback");
        }
        lVar.mo70909c();
        if (this.f86793e != null) {
            List<C11207p> list = this.f86790b;
            if (list == null) {
                C52711k.m112237a("messageQueue");
            }
            C11207p pVar2 = this.f86793e;
            if (pVar2 == null) {
                C52711k.m112234a();
            }
            int indexOf = list.indexOf(pVar2);
            if (indexOf >= 0) {
                List<C11207p> list2 = this.f86790b;
                if (list2 == null) {
                    C52711k.m112237a("messageQueue");
                }
                if (indexOf < list2.size()) {
                    int i = indexOf - 1;
                    while (true) {
                        if (i < 0) {
                            break;
                        }
                        List<C11207p> list3 = this.f86790b;
                        if (list3 == null) {
                            C52711k.m112237a("messageQueue");
                        }
                        pVar = (C11207p) list3.get(i);
                        if (pVar.isDeleted() || pVar.isRecalled() || TextUtils.equals((CharSequence) pVar.getLocalExt().get("isPlayed"), "1")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            break;
                        }
                        i--;
                    }
                }
            }
        }
        pVar = null;
        if (pVar != null) {
            mo70924a(pVar);
        } else {
            this.f86793e = null;
        }
    }

    /* renamed from: b */
    private final void m76756b(C11207p pVar) {
        C33374a.m76531a().mo70753a(null, pVar, new C33496a(this, pVar));
    }

    /* renamed from: d */
    private static boolean m76758d(C11207p pVar) {
        if (pVar.isDeleted() || pVar.isRecalled()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m76759e(C11207p pVar) {
        if (pVar.getMsgType() != 17 || pVar.isSelf()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo70923a(boolean z) {
        this.f86793e = null;
        C33498e eVar = this.f86789a;
        if (eVar == null) {
            C52711k.m112237a("playManager");
        }
        eVar.mo70928a(z);
    }

    /* renamed from: c */
    private static File m76757c(C11207p pVar) {
        boolean z;
        String str = (String) pVar.getLocalExt().get("localpath");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70922a(java.util.List<com.bytedance.p702im.core.p706c.C11207p> r7) {
        /*
            r6 = this;
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0014
            return
        L_0x0014:
            com.bytedance.im.core.c.p r0 = r6.f86793e
            if (r0 == 0) goto L_0x0030
            java.util.List<com.bytedance.im.core.c.p> r0 = r6.f86790b
            if (r0 != 0) goto L_0x0021
            java.lang.String r3 = "messageQueue"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0021:
            com.bytedance.im.core.c.p r3 = r6.f86793e
            if (r3 != 0) goto L_0x0028
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0028:
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            java.util.List<com.bytedance.im.core.c.p> r3 = r6.f86790b
            if (r3 != 0) goto L_0x003a
            java.lang.String r4 = "messageQueue"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x003a:
            r3.clear()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0043:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r7.next()
            com.bytedance.im.core.c.p r3 = (com.bytedance.p702im.core.p706c.C11207p) r3
            if (r3 == 0) goto L_0x0043
            boolean r4 = m76759e(r3)
            if (r4 == 0) goto L_0x0043
            java.util.List<com.bytedance.im.core.c.p> r4 = r6.f86790b
            if (r4 != 0) goto L_0x0060
            java.lang.String r5 = "messageQueue"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0060:
            r4.add(r3)
            goto L_0x0043
        L_0x0064:
            com.bytedance.im.core.c.p r7 = r6.f86793e
            if (r7 != 0) goto L_0x0069
            return
        L_0x0069:
            java.util.List<com.bytedance.im.core.c.p> r7 = r6.f86790b
            if (r7 != 0) goto L_0x0072
            java.lang.String r3 = "messageQueue"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0072:
            com.bytedance.im.core.c.p r3 = r6.f86793e
            if (r3 != 0) goto L_0x0079
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0079:
            int r7 = r7.indexOf(r3)
            r3 = 0
            if (r0 == 0) goto L_0x0086
            if (r7 >= 0) goto L_0x0086
            r6.mo70923a(false)
            return
        L_0x0086:
            if (r7 < 0) goto L_0x00ae
            java.util.List<com.bytedance.im.core.c.p> r0 = r6.f86790b
            if (r0 != 0) goto L_0x0091
            java.lang.String r4 = "messageQueue"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0091:
            java.lang.Object r7 = r0.get(r7)
            com.bytedance.im.core.c.p r7 = (com.bytedance.p702im.core.p706c.C11207p) r7
            r6.f86793e = r7
            com.bytedance.im.core.c.p r7 = r6.f86793e
            if (r7 != 0) goto L_0x00a0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a0:
            boolean r0 = m76758d(r7)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r7 = r3
        L_0x00a9:
            if (r7 == 0) goto L_0x00ae
            r6.mo70923a(false)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33495d.mo70922a(java.util.List):void");
    }

    /* renamed from: a */
    public final boolean mo70924a(C11207p pVar) {
        if (pVar == null) {
            return false;
        }
        if (C52711k.m112239a((Object) pVar, (Object) this.f86793e)) {
            mo70923a(false);
            return false;
        }
        C33511l lVar = this.f86791c;
        if (lVar == null) {
            C52711k.m112237a("callback");
        }
        lVar.mo70904a(pVar);
        File c = m76757c(pVar);
        if (c == null) {
            this.f86792d = pVar;
            m76756b(pVar);
            return false;
        }
        C33498e eVar = this.f86789a;
        if (eVar == null) {
            C52711k.m112237a("playManager");
        }
        eVar.mo70927a(c);
        this.f86793e = pVar;
        this.f86792d = null;
        m76753a(pVar, true);
        C33511l lVar2 = this.f86791c;
        if (lVar2 == null) {
            C52711k.m112237a("callback");
        }
        lVar2.mo70908b(pVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m76753a(C11207p pVar, boolean z) {
        if (!C52711k.m112239a((Object) "1", (Object) (String) pVar.getLocalExt().get("isPlayed"))) {
            Map localExt = pVar.getLocalExt();
            C52711k.m112236a((Object) localExt, "localExt");
            localExt.put("isPlayed", "1");
            if (!z) {
                pVar = null;
            }
            if (pVar != null) {
                C35197am.m79561b(pVar);
            }
        }
    }
}
