package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.content.C0732g;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.internal.utils.C11500m;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11198g;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33351aa;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33351aa.C33352a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34604d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34576b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34591g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34595h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34597i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1863b.C34601a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.C34684c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.C34684c.C34687b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35195ak;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.C35463m;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35468e;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p001a.C0010f;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.k */
public final class C34032k {

    /* renamed from: a */
    public static boolean f87983a;

    /* renamed from: m */
    private static volatile C34032k f87984m;

    /* renamed from: b */
    public C34576b f87985b;

    /* renamed from: c */
    public Map<String, C35456b> f87986c = new ConcurrentHashMap();

    /* renamed from: d */
    public Map<String, C35456b> f87987d = new ConcurrentHashMap();

    /* renamed from: e */
    public volatile int f87988e;

    /* renamed from: f */
    public volatile int f87989f;

    /* renamed from: g */
    public volatile boolean f87990g;

    /* renamed from: h */
    public C0010f f87991h;

    /* renamed from: i */
    public Handler f87992i = new C33351aa(this.f87998p);

    /* renamed from: j */
    boolean f87993j = true;

    /* renamed from: k */
    C11198g f87994k = new C11198g() {
        /* renamed from: a */
        public final void mo20664a(String str, List<C11206o> list) {
        }

        /* renamed from: a */
        public final void mo20665a(List<C11206o> list) {
        }

        /* renamed from: b */
        public final void mo20670b(List<C11206o> list) {
        }

        /* renamed from: d */
        public final void mo20676d(C11180b bVar) {
        }

        /* renamed from: e */
        public final void mo20679e(C11180b bVar) {
        }

        /* renamed from: a */
        public final void mo20662a(C11180b bVar) {
            C34032k.this.f87990g = true;
            C34032k.this.f87992i.sendEmptyMessage(2);
        }

        /* renamed from: b */
        public final void mo20668b(C11180b bVar) {
            C34032k.this.f87990g = true;
            C34032k.this.f87992i.sendEmptyMessage(2);
        }

        /* renamed from: c */
        public final void mo20673c(C11180b bVar) {
            C34032k.this.f87990g = true;
            C34032k.this.f87992i.sendEmptyMessage(2);
        }

        /* renamed from: a */
        public final void mo20718a(Map<String, C11180b> map) {
            C34032k.f87983a = true;
            C34032k.this.f87990g = true;
            C34032k.this.f87992i.sendEmptyMessage(2);
        }
    };

    /* renamed from: l */
    public Comparator<C35456b> f87995l = new Comparator<C35456b>() {
        /* renamed from: a */
        private static long m77820a(C35456b bVar) {
            long j = bVar.f91118i;
            try {
                C11180b a = C11182d.m22641a().mo20658a(bVar.bm_());
                if (a != null) {
                    return Math.max(C34604d.f89152b.mo72654b(a), j);
                }
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
            return j;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C35456b bVar = (C35456b) obj;
            C35456b bVar2 = (C35456b) obj2;
            if (bVar.f91121l != bVar2.f91121l) {
                return Integer.compare(bVar2.f91121l, bVar.f91121l);
            }
            return (m77820a(bVar2) > m77820a(bVar) ? 1 : (m77820a(bVar2) == m77820a(bVar) ? 0 : -1));
        }
    };

    /* renamed from: n */
    private C0013i f87996n;

    /* renamed from: o */
    private Set<C34601a<C35456b>> f87997o = new HashSet();

    /* renamed from: p */
    private C33352a f87998p = new C33352a() {
        /* renamed from: a */
        public final void mo70695a(Object obj, int i) {
        }

        /* renamed from: c */
        public final void mo70698c() {
        }

        /* renamed from: a */
        public final void mo70692a() {
            C35460j f = C34004b.m77717a().mo71949f();
            if (f == null || !f.enableIM() || (f.getUnder16Proxy() != null && f.getUnder16Proxy().mo70447a())) {
                C34032k.this.mo71986c();
            } else {
                C34032k.this.mo71984b();
            }
        }
    };

    /* renamed from: e */
    public final void mo71988e() {
        this.f87992i.sendEmptyMessage(1);
    }

    /* renamed from: f */
    public final void mo71989f() {
        C34684c.m78664a().mo72745a(new C34687b() {
            public final void onFetch(C34597i iVar) {
                if (iVar != null) {
                    C34032k.m77795a().mo71981a((C35456b) C34595h.m78547a(iVar));
                    return;
                }
                C34032k.m77795a().mo71982a("stranger_1");
            }
        });
    }

    /* renamed from: a */
    public static C34032k m77795a() {
        if (f87984m == null) {
            synchronized (C34032k.class) {
                if (f87984m == null) {
                    f87984m = new C34032k();
                }
            }
        }
        return f87984m;
    }

    /* renamed from: g */
    public final void mo71990g() {
        if (this.f87985b != null) {
            this.f87990g = true;
            this.f87985b = null;
            this.f87992i.sendEmptyMessage(2);
        }
    }

    private C34032k() {
    }

    /* renamed from: b */
    public final synchronized void mo71984b() {
        C32458a.m75144a("SessionListManager syncSessionListI18n step 1");
        C11500m.m23559a();
        if (this.f87996n == null || this.f87996n.mo31c() || this.f87996n.mo26b() || this.f87996n.mo33d()) {
            this.f87991h = new C0010f();
            C32458a.m75144a("SessionListManager syncSessionListI18n step 2");
            this.f87996n = C0013i.m17a((Callable<TResult>) new Callable<Pair<List<C35456b>, Integer>>() {
                /* JADX WARNING: type inference failed for: r8v1 */
                /* JADX WARNING: Multi-variable type inference failed */
                /* JADX WARNING: Removed duplicated region for block: B:71:0x01bf  */
                /* JADX WARNING: Unknown variable types count: 1 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                    /*
                        r19 = this;
                        r0 = r19
                        java.util.ArrayList r1 = new java.util.ArrayList
                        com.ss.android.ugc.aweme.im.sdk.d.k r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.service.h.b> r2 = r2.f87987d
                        java.util.Collection r2 = r2.values()
                        r1.<init>(r2)
                        com.ss.android.ugc.aweme.im.sdk.d.k r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        boolean r2 = r2.f87990g
                        if (r2 == 0) goto L_0x0207
                        com.ss.android.ugc.aweme.im.sdk.d.k r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.service.h.b> r2 = r2.f87986c
                        r2.clear()
                        com.bytedance.im.core.c.d r2 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
                        java.util.Map r2 = r2.mo20678e()
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        java.lang.String r4 = "SessionListManager syncSessionListI18n step 3, ConversationSize: "
                        r3.<init>(r4)
                        int r4 = r2.size()
                        r3.append(r4)
                        java.lang.String r3 = r3.toString()
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r3)
                        java.util.Collection r2 = r2.values()
                        java.util.Iterator r2 = r2.iterator()
                        r4 = 0
                        r5 = 0
                    L_0x0043:
                        boolean r6 = r2.hasNext()
                        if (r6 == 0) goto L_0x01ea
                        java.lang.Object r6 = r2.next()
                        com.bytedance.im.core.c.b r6 = (com.bytedance.p702im.core.p706c.C11180b) r6
                        r7 = 1
                        if (r6 == 0) goto L_0x0063
                        boolean r9 = r6.isSingleChat()
                        r10 = 52
                        r11 = 7
                        r12 = 13
                        if (r9 == 0) goto L_0x00df
                        com.bytedance.im.core.c.p r9 = r6.getLastMessage()
                        if (r9 != 0) goto L_0x0067
                    L_0x0063:
                        r18 = r4
                        goto L_0x01bc
                    L_0x0067:
                        java.lang.String r13 = r6.getConversationId()
                        long r13 = com.bytedance.p702im.core.p706c.C11190e.m22685a(r13)
                        r15 = 0
                        int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r17 > 0) goto L_0x0076
                        goto L_0x0063
                    L_0x0076:
                        com.ss.android.ugc.aweme.im.sdk.module.session.a.a r8 = new com.ss.android.ugc.aweme.im.sdk.module.session.a.a
                        r8.<init>()
                        java.lang.String r13 = r6.getConversationId()
                        r8.f91114e = r13
                        int r13 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35209av.m79593a(r6)
                        r8.f91121l = r13
                        boolean r13 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a.m76677a(r6)
                        r8.f89109b = r13
                        long r13 = r6.getUnreadCount()
                        int r13 = (int) r13
                        r8.f91119j = r13
                        long r13 = r9.getCreatedAt()
                        boolean r15 = r6.isStickTop()
                        if (r15 == 0) goto L_0x00a9
                        r18 = r4
                        long r3 = r6.getUpdatedTime()
                        long r13 = java.lang.Math.max(r13, r3)
                        goto L_0x00ab
                    L_0x00a9:
                        r18 = r4
                    L_0x00ab:
                        r8.mo73751a(r13)
                        int r3 = r9.getMsgType()
                        if (r12 != r3) goto L_0x00b9
                        com.ss.android.ugc.aweme.im.sdk.module.session.a.e$a r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34587e.C34588a.SUCCESS
                        r8.f89134c = r3
                        goto L_0x00c3
                    L_0x00b9:
                        int r3 = r9.getMsgStatus()
                        com.ss.android.ugc.aweme.im.sdk.module.session.a.e$a r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34587e.m78536a(r3)
                        r8.f89134c = r3
                    L_0x00c3:
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y.content(r9)
                        if (r3 == 0) goto L_0x00cf
                        java.lang.String r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34566a.m78501a(r3, r9)
                        r8.f91117h = r3
                    L_0x00cf:
                        int r3 = r9.getMsgType()
                        if (r3 == r11) goto L_0x00db
                        int r3 = r9.getMsgType()
                        if (r3 != r10) goto L_0x01bd
                    L_0x00db:
                        r8.f91124o = r7
                        goto L_0x01bd
                    L_0x00df:
                        r18 = r4
                        boolean r3 = r6.isGroupChat()
                        if (r3 == 0) goto L_0x01bc
                        com.bytedance.im.core.c.p r3 = r6.getLastMessage()
                        if (r3 != 0) goto L_0x00ef
                        goto L_0x01bc
                    L_0x00ef:
                        com.ss.android.ugc.aweme.im.sdk.module.session.a.d r4 = new com.ss.android.ugc.aweme.im.sdk.module.session.a.d
                        r4.<init>()
                        java.lang.String r9 = r6.getConversationId()
                        r4.f91114e = r9
                        int r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35209av.m79593a(r6)
                        r4.f91121l = r9
                        long r13 = r6.getUnreadCount()
                        int r9 = (int) r13
                        r4.f91119j = r9
                        long r13 = r3.getCreatedAt()
                        boolean r9 = r6.isStickTop()
                        if (r9 == 0) goto L_0x0119
                        long r8 = r6.getUpdatedTime()
                        long r13 = java.lang.Math.max(r13, r8)
                    L_0x0119:
                        r4.mo73751a(r13)
                        com.bytedance.im.core.c.c r8 = r6.getCoreInfo()
                        if (r8 == 0) goto L_0x012b
                        com.bytedance.im.core.c.c r8 = r6.getCoreInfo()
                        java.lang.String r8 = r8.getIcon()
                        goto L_0x012c
                    L_0x012b:
                        r8 = 0
                    L_0x012c:
                        r4.f91115f = r8
                        int r8 = r3.getMsgType()
                        if (r12 != r8) goto L_0x0139
                        com.ss.android.ugc.aweme.im.sdk.module.session.a.e$a r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34587e.C34588a.SUCCESS
                        r4.f89134c = r8
                        goto L_0x0143
                    L_0x0139:
                        int r8 = r3.getMsgStatus()
                        com.ss.android.ugc.aweme.im.sdk.module.session.a.e$a r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34587e.m78536a(r8)
                        r4.f89134c = r8
                    L_0x0143:
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y.content(r3)
                        if (r8 == 0) goto L_0x014f
                        java.lang.String r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34566a.m78503a(r4, r8, r3)
                        r4.f91117h = r9
                    L_0x014f:
                        int r9 = r3.getMsgType()
                        if (r9 == r11) goto L_0x015b
                        int r9 = r3.getMsgType()
                        if (r9 != r10) goto L_0x015d
                    L_0x015b:
                        r4.f91124o = r7
                    L_0x015d:
                        int r9 = r3.getMsgType()
                        r10 = 1001(0x3e9, float:1.403E-42)
                        if (r9 != r10) goto L_0x018e
                        if (r8 == 0) goto L_0x018e
                        java.util.Map r9 = r3.getExt()
                        if (r9 != 0) goto L_0x0172
                        java.util.HashMap r9 = new java.util.HashMap
                        r9.<init>()
                    L_0x0172:
                        java.lang.String r10 = "group_notice_show"
                        boolean r10 = r9.containsKey(r10)
                        if (r10 != 0) goto L_0x018e
                        java.lang.String r10 = "group_notice_show"
                        java.lang.String r11 = "show"
                        r9.put(r10, r11)
                        r3.setExt(r9)
                        java.lang.String r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79761a(r8)
                        r3.setContent(r8)
                        com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79556a(r3)
                    L_0x018e:
                        com.bytedance.im.core.c.c r3 = r6.getCoreInfo()
                        if (r3 == 0) goto L_0x01ad
                        com.bytedance.im.core.c.c r3 = r6.getCoreInfo()
                        java.lang.String r3 = r3.getName()
                        boolean r3 = android.text.TextUtils.isEmpty(r3)
                        if (r3 != 0) goto L_0x01ad
                        com.bytedance.im.core.c.c r3 = r6.getCoreInfo()
                        java.lang.String r3 = r3.getName()
                        r4.f91116g = r3
                        goto L_0x01ba
                    L_0x01ad:
                        android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                        r8 = 2132545333(0x7f1c0f35, float:2.0743853E38)
                        java.lang.String r3 = r3.getString(r8)
                        r4.f91116g = r3
                    L_0x01ba:
                        r8 = r4
                        goto L_0x01bd
                    L_0x01bc:
                        r8 = 0
                    L_0x01bd:
                        if (r8 == 0) goto L_0x01e6
                        boolean r3 = r8.mo73754h()
                        if (r3 == 0) goto L_0x01cc
                        boolean r3 = r6.isMute()
                        if (r3 == 0) goto L_0x01cc
                        goto L_0x01cd
                    L_0x01cc:
                        r7 = 0
                    L_0x01cd:
                        com.ss.android.ugc.aweme.im.sdk.d.k r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.service.h.b> r3 = r3.f87986c
                        java.lang.String r4 = r8.bm_()
                        r3.put(r4, r8)
                        r1.add(r8)
                        if (r7 != 0) goto L_0x01e3
                        int r3 = r8.f91119j
                        int r4 = r18 + r3
                        goto L_0x0043
                    L_0x01e3:
                        int r3 = r8.f91119j
                        int r5 = r5 + r3
                    L_0x01e6:
                        r4 = r18
                        goto L_0x0043
                    L_0x01ea:
                        r18 = r4
                        com.ss.android.ugc.aweme.im.sdk.d.k r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        r3 = r18
                        r2.f87988e = r3
                        com.ss.android.ugc.aweme.im.sdk.d.k r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        r2.f87989f = r5
                        com.ss.android.ugc.aweme.im.sdk.d.k r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        java.util.Comparator<com.ss.android.ugc.aweme.im.service.h.b> r2 = r2.f87995l
                        java.util.Collections.sort(r1, r2)
                        android.util.Pair r2 = new android.util.Pair
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                        r2.<init>(r1, r3)
                        return r2
                    L_0x0207:
                        com.ss.android.ugc.aweme.im.sdk.d.k r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.service.h.b> r2 = r2.f87986c
                        java.util.Collection r2 = r2.values()
                        r1.addAll(r2)
                        com.ss.android.ugc.aweme.im.sdk.d.k r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        java.util.Comparator<com.ss.android.ugc.aweme.im.service.h.b> r2 = r2.f87995l
                        java.util.Collections.sort(r1, r2)
                        android.util.Pair r2 = new android.util.Pair
                        com.ss.android.ugc.aweme.im.sdk.d.k r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.this
                        int r3 = r3.f87988e
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                        r2.<init>(r1, r3)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.C340386.call():java.lang.Object");
                }
            }, this.f87991h.mo13b()).mo30c(new C0011g<Pair<List<C35456b>, Integer>, Void>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    Pair pair = (Pair) iVar.mo34e();
                    int i = 0;
                    if (pair != null) {
                        C34032k.this.f87990g = false;
                        C34032k.this.mo71983a((List) pair.first);
                        C34032k.this.f87988e = ((Integer) pair.second).intValue();
                        C34032k.this.mo71987d();
                    }
                    if (pair != null && !C9376b.m18558a((Collection) pair.first)) {
                        i = ((List) pair.first).size();
                    }
                    StringBuilder sb = new StringBuilder("SessionListManager syncSessionListI18n finished: ");
                    sb.append(i);
                    C32458a.m75144a(sb.toString());
                    C34032k.this.f87991h = null;
                    return null;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: c */
    public final synchronized void mo71986c() {
        C11500m.m23559a();
        if (this.f87996n == null || this.f87996n.mo31c() || this.f87996n.mo26b() || this.f87996n.mo33d()) {
            this.f87991h = new C0010f();
            this.f87996n = C0013i.m17a((Callable<TResult>) new Callable<List<C35456b>>() {
                public final /* synthetic */ Object call() throws Exception {
                    int i;
                    int i2;
                    ArrayList arrayList = new ArrayList(C34032k.this.f87987d.values());
                    if (C35284t.m79782a().mo73420f() || C34032k.this.f87985b == null) {
                        i2 = 0;
                        i = 0;
                    } else {
                        arrayList.add(C34032k.this.f87985b);
                        i2 = C34032k.this.f87985b.f91119j + 0;
                        i = C34032k.this.f87985b.f89121a + 0;
                    }
                    C35463m under16Proxy = C34004b.m77717a().mo71949f().getUnder16Proxy();
                    if (under16Proxy != null && under16Proxy.mo70448b() && !C35284t.m79782a().f90620a.getBoolean("notice_under_16_deleted_state", false)) {
                        arrayList.add(new C34591g());
                    }
                    C34032k.this.f87988e = i2;
                    C34032k.this.f87989f = i;
                    Collections.sort(arrayList, C34032k.this.f87995l);
                    return arrayList;
                }
            }, this.f87991h.mo13b()).mo30c(new C0011g<List<C35456b>, Void>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    List list = (List) iVar.mo34e();
                    if (list != null) {
                        C34032k.this.mo71983a(list);
                        C34032k.this.mo71987d();
                    }
                    C34032k.this.f87991h = null;
                    return null;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: d */
    public final void mo71987d() {
        C0732g a = C0732g.m2130a(C11010c.m22280a());
        Intent intent = new Intent("com.msg.count.action.arrived");
        int max = Math.max(0, Math.abs(C35284t.m79782a().mo73410d() - this.f87989f));
        if (C34604d.m78558a()) {
            max++;
        }
        intent.putExtra("msg_count", this.f87988e);
        if (C35243bl.m79709a()) {
            String str = "msg_dot";
            if (max == 0) {
                max = -1;
            }
            intent.putExtra(str, max);
        }
        a.mo2404a(intent);
    }

    /* renamed from: b */
    public final void mo71985b(C34601a<C35456b> aVar) {
        this.f87997o.remove(aVar);
    }

    /* renamed from: a */
    public final void mo71980a(C34601a<C35456b> aVar) {
        this.f87997o.add(aVar);
        this.f87992i.sendEmptyMessage(1);
    }

    /* renamed from: a */
    public final void mo71981a(C35456b bVar) {
        if (bVar.mo72634b() != 10) {
            this.f87987d.put(bVar.bm_(), bVar);
            this.f87992i.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public final void mo71979a(Bundle bundle) {
        C35468e iMSetting = C34004b.m77717a().mo71949f().getIMSetting();
        if (!(iMSetting == null || iMSetting.f91146d == null || !iMSetting.f91146d.getShowMsgCell().booleanValue() || !iMSetting.f91146d.getMainSwitch().booleanValue() || bundle == null)) {
            this.f87990g = true;
            if (this.f87985b == null) {
                this.f87985b = new C34576b();
                this.f87985b.f91124o = true;
            }
            long j = bundle.getLong("flip_chat_msg_unread_dot_count");
            long j2 = bundle.getLong("flip_chat_msg_unread_count");
            long j3 = bundle.getLong("flip_chat_msg_update_time");
            String string = bundle.getString("flip_chat_msg_content");
            this.f87985b.f89121a = C35195ak.m79550a(j);
            this.f87985b.f91119j = C35195ak.m79550a(j2);
            this.f87985b.mo73751a(j3);
            this.f87985b.f91117h = string;
            this.f87992i.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public final void mo71982a(String str) {
        if (!TextUtils.isEmpty(str) && this.f87987d.containsKey(str)) {
            this.f87987d.remove(str);
            this.f87992i.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public final void mo71983a(List<C35456b> list) {
        for (C34601a a : this.f87997o) {
            a.mo72620a(list);
        }
    }
}
