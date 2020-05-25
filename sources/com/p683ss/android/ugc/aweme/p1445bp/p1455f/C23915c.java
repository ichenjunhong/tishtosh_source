package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import com.p683ss.android.ugc.aweme.draft.C29050a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.C23893a;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import java.io.File;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.f.c */
public final class C23915c extends C23910a {

    /* renamed from: com.ss.android.ugc.aweme.bp.f.c$a */
    public static final class C23916a implements C29050a {

        /* renamed from: a */
        final /* synthetic */ String f63585a;

        C23916a(String str) {
            this.f63585a = str;
        }

        /* renamed from: a */
        public final boolean mo49521a(C29059c cVar) {
            C52711k.m112240b(cVar, "draft");
            return !C52711k.m112239a((Object) cVar.mo58774ak(), (Object) this.f63585a);
        }
    }

    /* renamed from: e */
    public final String mo49513e() {
        return "av-draft";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "draft";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.DRAFT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49517i() {
        return true;
    }

    /* renamed from: c */
    public final File mo23791c() {
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109493f;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sDraftDir");
        return c.mo49496b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo49519k() {
        C43214dh a = C43214dh.m94817a();
        C52711k.m112236a((Object) a, "PublishManager.inst()");
        String f = a.mo87856f();
        C52711k.m112236a((Object) f, "PublishManager.inst().publishingDraftKey");
        List queryListWithFilter = AVServiceImpl.createIInternalAVServicebyMonsterPlugin().draftService().queryListWithFilter(new C23916a(f));
        C52711k.m112236a((Object) queryListWithFilter, "ServiceManager.get().get…\n            }\n        })");
        C23893a aVar = new C23893a();
        long j = 0;
        for (C29059c a2 : C52575l.m112128b((Iterable<? extends T>) queryListWithFilter)) {
            aVar.mo49499a(a2);
            j += aVar.mo49498a();
        }
        return j;
    }
}
