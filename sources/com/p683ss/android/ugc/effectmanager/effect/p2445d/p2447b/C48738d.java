package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.C48903k;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48743c;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48750f;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48753i;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48865f;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48873n;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.d */
public final class C48738d implements C48686a, C48743c {

    /* renamed from: a */
    private C48890g f122402a = this.f122403b.f122047a;

    /* renamed from: b */
    private C48565a f122403b;

    /* renamed from: c */
    private Handler f122404c = new C48685j(this);

    public C48738d(C48565a aVar) {
        this.f122403b = aVar;
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        switch (message.what) {
            case 40:
                if (message.obj instanceof C48750f) {
                    C48750f fVar = (C48750f) message.obj;
                    C48903k kVar = this.f122402a.f122948A;
                    String str = fVar.f122278a;
                    if (kVar.f123041e == null) {
                        kVar.f123041e = new HashMap();
                    }
                    C48711p pVar = (C48711p) kVar.f123041e.get(str);
                    if (pVar != null) {
                        if (fVar.f122434b) {
                            pVar.mo8638a(fVar.f122435c);
                        } else {
                            pVar.mo92558a(fVar.f122436d);
                        }
                        C48903k kVar2 = this.f122402a.f122948A;
                        String str2 = fVar.f122278a;
                        if (kVar2.f123041e != null) {
                            kVar2.f123041e.remove(str2);
                            break;
                        }
                    }
                }
                break;
            case BaseNotice.LIKE /*41*/:
                if (message.obj instanceof C48753i) {
                    C48753i iVar = (C48753i) message.obj;
                    C48903k kVar3 = this.f122402a.f122948A;
                    String str3 = iVar.f122278a;
                    if (kVar3.f123042f == null) {
                        kVar3.f123042f = new HashMap();
                    }
                    C48706k kVar4 = (C48706k) kVar3.f123042f.get(str3);
                    if (kVar4 != null) {
                        if (iVar.f122441b == null) {
                            kVar4.mo8638a(iVar.f122442c);
                        } else {
                            kVar4.mo92557a(iVar.f122441b);
                        }
                        C48903k kVar5 = this.f122402a.f122948A;
                        String str4 = iVar.f122278a;
                        if (kVar5.f123042f != null) {
                            kVar5.f123042f.remove(str4);
                        }
                    }
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final String mo96312a(String str, C48706k kVar) {
        String a = C48679o.m105350a();
        C48903k kVar2 = this.f122403b.f122047a.f122948A;
        if (kVar2.f123042f == null) {
            kVar2.f123042f = new HashMap();
        }
        kVar2.f123042f.put(a, kVar);
        this.f122402a.f122971q.mo96269a(new C48873n(this.f122403b, str, a, this.f122404c));
        return a;
    }

    /* renamed from: a */
    public final String mo96313a(String str, List<String> list, boolean z, C48711p pVar) {
        String a = C48679o.m105350a();
        C48903k kVar = this.f122403b.f122047a.f122948A;
        if (kVar.f123041e == null) {
            kVar.f123041e = new HashMap();
        }
        kVar.f123041e.put(a, pVar);
        C48865f fVar = new C48865f(this.f122403b, str, a, this.f122404c, list, z);
        this.f122402a.f122971q.mo96269a(fVar);
        return a;
    }
}
