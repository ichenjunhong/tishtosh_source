package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.bytedance.p702im.core.internal.p720c.C11442b;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11199h;
import com.bytedance.p702im.core.p706c.C11200i;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11203l;
import com.bytedance.p702im.core.p706c.C11205n;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.bytedance.p702im.core.p706c.C11238s;
import com.bytedance.p702im.core.p706c.C11241u;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33429p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33433q;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34007c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.u */
public class C33709u extends C34007c implements C11203l {

    /* renamed from: e */
    private static String f87422e = "u";

    /* renamed from: a */
    public CharSequence f87423a;

    /* renamed from: b */
    public C11213r f87424b;

    /* renamed from: c */
    public Runnable f87425c;

    /* renamed from: d */
    public Runnable f87426d;

    /* renamed from: f */
    private boolean f87427f;

    /* renamed from: g */
    private int f87428g;

    /* renamed from: h */
    private int f87429h;

    /* renamed from: i */
    private int f87430i;

    /* renamed from: j */
    private int f87431j;

    /* renamed from: k */
    private int f87432k;

    /* renamed from: l */
    private int f87433l;

    /* renamed from: m */
    private int f87434m;

    /* renamed from: n */
    private int f87435n;

    /* renamed from: o */
    private int f87436o;

    /* renamed from: p */
    private int f87437p;

    /* renamed from: q */
    private int f87438q;

    /* renamed from: r */
    private int f87439r;

    /* renamed from: s */
    private int f87440s;

    /* renamed from: t */
    private int f87441t;

    /* renamed from: u */
    private int f87442u;

    /* renamed from: v */
    private int f87443v;

    /* renamed from: w */
    private int f87444w;

    /* renamed from: x */
    private C33689r f87445x;

    /* renamed from: y */
    private C11190e f87446y;

    /* renamed from: a */
    public final void mo20722a(int i, C11238s sVar) {
    }

    /* renamed from: a */
    public final void mo20723a(int i, C11241u uVar) {
    }

    /* renamed from: f */
    public final void mo20733f(List<C11241u> list) {
    }

    /* renamed from: d */
    private void m77194d() {
        C11180b a = C11182d.m22641a().mo20658a(this.f87423a.toString());
        long a2 = C11190e.m22685a(this.f87423a.toString());
        if (a == null || a.isTemp()) {
            C11182d.m22641a().mo20661a(a2, (C11162b<C11180b>) new C11162b<C11180b>() {
                /* renamed from: a */
                public final void mo20508a(C11202k kVar) {
                }

                /* renamed from: a */
                public final /* synthetic */ void mo20506a(Object obj) {
                    C11180b bVar = (C11180b) obj;
                    C11182d.m22641a();
                    C11182d.m22646c(C33709u.this.f87423a.toString());
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20108a() {
        super.mo20108a();
        m77194d();
        C11213r rVar = this.f87424b;
        if (rVar.f30225e) {
            C11182d a = C11182d.m22641a();
            a.f30180c.add(rVar.f30222b);
        }
        if (this.f87427f) {
            this.f87445x.notifyDataSetChanged();
            this.f87427f = false;
        }
    }

    public final void bi_() {
        super.bi_();
        C11213r rVar = this.f87424b;
        rVar.f30224d = null;
        rVar.f30221a.clear();
        C11472i.m23483a().mo21116b(rVar.f30222b, (C11203l) rVar);
        if (rVar.f30229i) {
            C11472i a = C11472i.m23483a();
            String str = rVar.f30222b;
            C11199h hVar = rVar.f30230j;
            List list = (List) a.f30781e.get(str);
            if (list != null) {
                list.remove(hVar);
            }
            a.f30781e.put(str, list);
            rVar.f30230j = null;
        }
        C11442b.m23355a().mo21074a(rVar.f30228h);
        rVar.f30228h.clear();
        this.f87446y.mo20695b();
    }

    public final void bj_() {
        String str;
        C11213r rVar = this.f87424b;
        if (rVar.f30225e) {
            C11182d a = C11182d.m22641a();
            a.f30180c.remove(rVar.f30222b);
        }
        this.f87438q += C33433q.f86664a;
        this.f87442u += C33429p.f86654b;
        C33433q.f86664a = 0;
        C33429p.f86654b = 0;
        C35190af.m79442a();
        String charSequence = this.f87423a.toString();
        int i = this.f87428g;
        int i2 = this.f87429h;
        int i3 = this.f87431j;
        int i4 = this.f87432k;
        int i5 = this.f87433l;
        int i6 = this.f87434m;
        int i7 = this.f87435n;
        int i8 = this.f87436o;
        int i9 = this.f87437p;
        int i10 = this.f87438q;
        int i11 = this.f87439r;
        int i12 = this.f87440s;
        int i13 = this.f87441t;
        int i14 = this.f87442u;
        String str2 = charSequence;
        int i15 = this.f87443v;
        int i16 = this.f87444w;
        StringBuilder sb = new StringBuilder("[");
        sb.append(i + i2);
        sb.append(",");
        sb.append(i2);
        sb.append("]");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(i3 + i4);
        sb3.append(",");
        sb3.append(i4);
        sb3.append("]");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder("[");
        sb5.append(i5 + i6);
        sb5.append(",");
        sb5.append(i6);
        sb5.append("]");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder("[");
        sb7.append(i7 + i8);
        sb7.append(",");
        sb7.append(i8);
        sb7.append("]");
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder("[");
        sb9.append(i9 + i10);
        sb9.append(",");
        sb9.append(i10);
        sb9.append("]");
        String sb10 = sb9.toString();
        StringBuilder sb11 = new StringBuilder("[");
        sb11.append(i11 + i12);
        sb11.append(",");
        sb11.append(i12);
        sb11.append("]");
        String sb12 = sb11.toString();
        StringBuilder sb13 = new StringBuilder("[");
        sb13.append(i13 + i14);
        sb13.append(",");
        sb13.append(i14);
        sb13.append("]");
        String sb14 = sb13.toString();
        StringBuilder sb15 = new StringBuilder("[");
        sb15.append(i15 + i16);
        sb15.append(",");
        sb15.append(i16);
        sb15.append("]");
        String sb16 = sb15.toString();
        long a2 = C11190e.m22685a(str2);
        HashMap hashMap = new HashMap();
        hashMap.put("send_message", sb2);
        hashMap.put("send_emoji", sb4);
        hashMap.put("send_favorite_emoji", sb6);
        hashMap.put("send_giphy", sb8);
        hashMap.put("send_pic", sb10);
        hashMap.put("send_text", sb12);
        hashMap.put("send_audio", sb14);
        hashMap.put("send_video", sb16);
        hashMap.put("to_user_id", String.valueOf(a2));
        hashMap.put("process_id", C35190af.f90475b);
        C26890h.m65011a("chat_stats", (Map<String, String>) hashMap);
        String charSequence2 = this.f87423a.toString();
        if (this.f87445x.mo71721l()) {
            str = "stranger";
        } else {
            str = "no_stranger";
        }
        int i17 = this.f87428g;
        int i18 = this.f87430i;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("event", "chat_stats");
        hashMap2.put("label", "message");
        hashMap2.put("success_cnt", String.valueOf(i17));
        hashMap2.put("fail_cnt", String.valueOf(i18));
        hashMap2.put("session_id", String.valueOf(C11190e.m22685a(charSequence2)));
        hashMap2.put("source_type", str);
        C34004b.m77717a().mo71949f().monitorMsgSendStatus(hashMap2);
        this.f87428g = 0;
        this.f87429h = 0;
        this.f87430i = 0;
        this.f87432k = 0;
        this.f87431j = 0;
        this.f87433l = 0;
        this.f87434m = 0;
        this.f87435n = 0;
        this.f87436o = 0;
        this.f87437p = 0;
        this.f87438q = 0;
        this.f87439r = 0;
        this.f87440s = 0;
        this.f87441t = 0;
        this.f87442u = 0;
        this.f87443v = 0;
        this.f87444w = 0;
        this.f87427f = true;
    }

    /* renamed from: c */
    public final void mo20730c(List<C11207p> list) {
        this.f87445x.mo71711a(list, 4);
    }

    /* renamed from: d */
    public final void mo20731d(List<C11207p> list) {
        this.f87445x.mo71711a(list, 5);
    }

    /* renamed from: e */
    public final void mo20732e(List<C11207p> list) {
        this.f87445x.mo71711a(list, 6);
    }

    /* renamed from: a */
    public final void mo20662a(C11180b bVar) {
        this.f87424b.mo20727a(true);
    }

    /* renamed from: b */
    public final void mo20668b(C11180b bVar) {
        super.mo20668b(bVar);
        if (this.f87426d != null) {
            this.f87426d.run();
        }
    }

    /* renamed from: a */
    public final void mo20724a(C11207p pVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVar);
        this.f87445x.mo71711a((List<C11207p>) arrayList, 3);
    }

    /* renamed from: b */
    public final void mo20729b(C11207p pVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVar);
        this.f87445x.mo71711a((List<C11207p>) arrayList, 7);
    }

    /* renamed from: c */
    public final void mo20673c(C11180b bVar) {
        String str;
        super.mo20673c(bVar);
        StringBuilder sb = new StringBuilder("markAuthorSupporterChatLocal: ");
        String str2 = null;
        if (bVar != null) {
            str = bVar.getConversationId();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", ");
        if (bVar != null) {
            Map localExt = bVar.getLocalExt();
            if (localExt != null) {
                str2 = (String) localExt.get("a:s_author_im_supporter");
            }
        }
        sb.append(str2);
        if (bVar != null && C52711k.m112239a((Object) C33453a.f86701a, (Object) bVar.getConversationId()) && (!C52711k.m112239a((Object) "1", (Object) (String) bVar.getLocalExt().get("a:s_author_im_supporter")))) {
            Map localExt2 = bVar.getLocalExt();
            C52711k.m112236a((Object) localExt2, "localExt");
            localExt2.put("a:s_author_im_supporter", "1");
        }
        if (this.f87425c != null) {
            this.f87425c.run();
        }
    }

    /* renamed from: a */
    public final void mo20727a(boolean z) {
        C33689r rVar = this.f87445x;
        if (rVar.f87358c == 1) {
            rVar.f87358c = 0;
        }
        if (rVar.f87360e != null) {
            rVar.f87360e.clear();
        }
    }

    /* renamed from: b */
    public final void mo20728b(int i, C11207p pVar) {
        String str = f87422e;
        StringBuilder sb = new StringBuilder("onAddMessage: ");
        sb.append(pVar);
        C32458a.m75141a(4, str, sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVar);
        this.f87445x.mo71711a((List<C11207p>) arrayList, 1);
    }

    public C33709u(String str, C33689r rVar) {
        this.f87423a = str;
        this.f87445x = rVar;
        if (ReadStateViewModel.f86455c) {
            this.f87424b = new C11213r(str, true, true);
        } else {
            this.f87424b = new C11213r(str);
        }
        C11213r rVar2 = this.f87424b;
        rVar2.f30224d = this;
        C11472i.m23483a().mo21113a(rVar2.f30222b, (C11203l) rVar2);
        C11182d.m22641a();
        C11182d.m22646c(rVar2.f30222b);
        if (rVar2.f30229i) {
            C11472i a = C11472i.m23483a();
            String str2 = rVar2.f30222b;
            C11199h hVar = rVar2.f30230j;
            List list = (List) a.f30781e.get(str2);
            if (list == null) {
                list = new ArrayList();
            }
            if (!list.contains(hVar)) {
                list.add(hVar);
            }
            a.f30781e.put(str2, list);
        }
        rVar.f87359d = this.f87424b;
        this.f87446y = new C11190e(str);
        this.f87446y.mo20688a((C11200i) this);
    }

    /* renamed from: a */
    public final void mo20726a(List<C11207p> list, int i) {
        this.f87445x.mo71711a(list, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r12 != 4) goto L_0x0068;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20721a(int r12, com.bytedance.p702im.core.p706c.C11207p r13) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.r r12 = r11.f87445x
            boolean r12 = r12.mo71721l()
            r0 = 2
            if (r12 == 0) goto L_0x0021
            int r12 = r13.getMsgStatus()
            if (r12 != r0) goto L_0x0021
            org.greenrobot.eventbus.c r12 = org.greenrobot.eventbus.C53755c.m114319a()
            com.ss.android.ugc.aweme.im.sdk.model.g r1 = new com.ss.android.ugc.aweme.im.sdk.model.g
            java.lang.CharSequence r2 = r11.f87423a
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r12.mo112960d(r1)
        L_0x0021:
            int r12 = r13.getMsgStatus()
            r1 = 30
            r2 = 17
            r3 = 7
            r4 = 502(0x1f6, float:7.03E-43)
            r5 = 27
            r6 = 501(0x1f5, float:7.02E-43)
            r7 = 5
            r8 = 3
            r9 = 1
            if (r12 != r8) goto L_0x00d0
            int r12 = r11.f87429h
            int r12 = r12 + r9
            r11.f87429h = r12
            int r12 = r13.getMsgStatus()
            if (r12 != r8) goto L_0x0068
            java.util.Map r12 = r13.getLocalExt()     // Catch:{ Exception -> 0x0055 }
            java.lang.String r10 = "s:send_response_check_msg"
            java.lang.Object r12 = r12.get(r10)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra> r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseExtra.class
            java.lang.Object r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r12, r10)     // Catch:{ Exception -> 0x0055 }
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra r12 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseExtra) r12     // Catch:{ Exception -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r12 = 0
        L_0x0056:
            if (r12 == 0) goto L_0x0063
            int r12 = r12.getStatusCode()
            if (r12 < 0) goto L_0x0063
            if (r12 == r9) goto L_0x0063
            r10 = 4
            if (r12 != r10) goto L_0x0068
        L_0x0063:
            int r12 = r11.f87430i
            int r12 = r12 + r9
            r11.f87430i = r12
        L_0x0068:
            int r12 = r13.getMsgType()
            if (r12 != r7) goto L_0x0095
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y.content(r13)
            if (r12 == 0) goto L_0x013b
            int r0 = r12.getType()
            if (r0 != r6) goto L_0x0081
            int r12 = r11.f87434m
            int r12 = r12 + r9
            r11.f87434m = r12
            goto L_0x013b
        L_0x0081:
            int r12 = r12.getType()
            if (r12 != r4) goto L_0x008e
            int r12 = r11.f87436o
            int r12 = r12 + r9
            r11.f87436o = r12
            goto L_0x013b
        L_0x008e:
            int r12 = r11.f87432k
            int r12 = r12 + r9
            r11.f87432k = r12
            goto L_0x013b
        L_0x0095:
            int r12 = r13.getMsgType()
            if (r12 == r0) goto L_0x00c9
            int r12 = r13.getMsgType()
            if (r12 != r5) goto L_0x00a2
            goto L_0x00c9
        L_0x00a2:
            int r12 = r13.getMsgType()
            if (r12 != r3) goto L_0x00af
            int r12 = r11.f87440s
            int r12 = r12 + r9
            r11.f87440s = r12
            goto L_0x013b
        L_0x00af:
            int r12 = r13.getMsgType()
            if (r12 != r2) goto L_0x00bc
            int r12 = r11.f87442u
            int r12 = r12 + r9
            r11.f87442u = r12
            goto L_0x013b
        L_0x00bc:
            int r12 = r13.getMsgType()
            if (r12 != r1) goto L_0x013b
            int r12 = r11.f87444w
            int r12 = r12 + r9
            r11.f87444w = r12
            goto L_0x013b
        L_0x00c9:
            int r12 = r11.f87438q
            int r12 = r12 + r9
            r11.f87438q = r12
            goto L_0x013b
        L_0x00d0:
            int r12 = r13.getMsgStatus()
            if (r12 != r0) goto L_0x013b
            int r12 = r11.f87428g
            int r12 = r12 + r9
            r11.f87428g = r12
            int r12 = r13.getMsgType()
            if (r12 != r7) goto L_0x0105
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y.content(r13)
            if (r12 == 0) goto L_0x013b
            int r0 = r12.getType()
            if (r0 != r6) goto L_0x00f3
            int r12 = r11.f87433l
            int r12 = r12 + r9
            r11.f87433l = r12
            goto L_0x013b
        L_0x00f3:
            int r12 = r12.getType()
            if (r12 != r4) goto L_0x00ff
            int r12 = r11.f87435n
            int r12 = r12 + r9
            r11.f87435n = r12
            goto L_0x013b
        L_0x00ff:
            int r12 = r11.f87431j
            int r12 = r12 + r9
            r11.f87431j = r12
            goto L_0x013b
        L_0x0105:
            int r12 = r13.getMsgType()
            if (r12 == r0) goto L_0x0136
            int r12 = r13.getMsgType()
            if (r12 != r5) goto L_0x0112
            goto L_0x0136
        L_0x0112:
            int r12 = r13.getMsgType()
            if (r12 != r3) goto L_0x011e
            int r12 = r11.f87439r
            int r12 = r12 + r9
            r11.f87439r = r12
            goto L_0x013b
        L_0x011e:
            int r12 = r13.getMsgType()
            if (r12 != r2) goto L_0x012a
            int r12 = r11.f87441t
            int r12 = r12 + r9
            r11.f87441t = r12
            goto L_0x013b
        L_0x012a:
            int r12 = r13.getMsgType()
            if (r12 != r1) goto L_0x013b
            int r12 = r11.f87443v
            int r12 = r12 + r9
            r11.f87443v = r12
            goto L_0x013b
        L_0x0136:
            int r12 = r11.f87437p
            int r12 = r12 + r9
            r11.f87437p = r12
        L_0x013b:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.add(r13)
            com.ss.android.ugc.aweme.im.sdk.chat.r r0 = r11.f87445x
            r1 = 0
            r0.mo71711a(r12, r1)
            int r12 = r13.getMsgStatus()
            if (r12 != r8) goto L_0x0152
            r11.m77194d()
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33709u.mo20721a(int, com.bytedance.im.core.c.p):void");
    }

    /* renamed from: a */
    public final void mo20725a(C11207p pVar, Map<String, List<C11205n>> map, Map<String, List<C11205n>> map2) {
        C33689r rVar = this.f87445x;
        if (rVar != null && pVar != null) {
            StringBuilder sb = new StringBuilder("try update msg list for ");
            sb.append(pVar);
            C32458a.m75141a(3, "DmHelper", sb.toString());
            List arrayList = new ArrayList();
            arrayList.add(pVar);
            rVar.mo70695a((Object) arrayList, 0);
        }
    }
}
