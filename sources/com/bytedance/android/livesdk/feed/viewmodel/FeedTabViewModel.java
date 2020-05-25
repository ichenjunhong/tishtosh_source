package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.live.base.model.user.C3009i.C3010a;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.C7033o;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.p339g.C6951a;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p094l.C2178a;
import p064c.p065a.p094l.C2180b;

public class FeedTabViewModel extends RxViewModel {

    /* renamed from: a */
    public C2178a<List<C6945f>> f19393a = C2178a.m6527l();

    /* renamed from: b */
    C7033o<C6945f> f19394b;

    /* renamed from: c */
    private C2180b<Integer> f19395c = C2180b.m6534l();

    /* renamed from: d */
    private C7023m f19396d;

    /* renamed from: a */
    public final List<C6945f> mo13270a() {
        return this.f19396d.mo13185c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13271a(C3010a aVar) throws Exception {
        mo9390a(this.f19396d.mo13181a().mo6522a(C7154q.f19431a).mo6541d(C7155r.f19432a).mo6522a((C1715j<? super T>) new C7156s<Object>(this)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7157t<Object>(this), C7158u.f19435a));
    }

    public FeedTabViewModel(C7023m mVar, C7033o<C6945f> oVar, C6951a aVar) {
        this.f19396d = mVar;
        this.f19394b = oVar;
        mo9390a(aVar.mo13135a().mo6453b(C7149l.f19426a).mo6447a(C7150m.f19427a).mo6438a((C1710e<? super T>) new C7152o<Object>(this), C7153p.f19430a));
        mo9390a(this.f19396d.mo13183b().mo6505a(C7159v.f19436a, C7151n.f19428a));
    }
}
