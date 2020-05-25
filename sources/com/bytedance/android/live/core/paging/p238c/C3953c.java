package com.bytedance.android.live.core.paging.p238c;

import android.arch.lifecycle.C0198r;
import android.arch.p010b.C0065d.C0067b;
import android.arch.p010b.C0073f;
import android.arch.p010b.C0073f.C0074a;
import android.arch.p010b.C0073f.C0076c;
import android.arch.p010b.C0073f.C0078e;
import android.arch.p010b.C0073f.C0079f;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.core.p222a.C3809a;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.paging.p237b.C3948c;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.core.paging.c.c */
public abstract class C3953c<DataKey, V, CacheKey> extends C0073f<DataKey, V> implements C0067b {

    /* renamed from: d */
    protected CacheKey f11004d;

    /* renamed from: e */
    protected C3810b<CacheKey, V> f11005e;

    /* renamed from: f */
    protected C3809a<CacheKey, C2974a> f11006f;

    /* renamed from: g */
    protected C0198r<C3842b> f11007g;

    /* renamed from: h */
    protected C0198r<C3842b> f11008h;

    /* renamed from: i */
    protected C0198r<Boolean> f11009i;

    /* renamed from: j */
    protected C0198r<Boolean> f11010j;

    /* renamed from: k */
    Runnable f11011k;

    /* renamed from: l */
    private final C3948c<CacheKey, V> f11012l;

    /* renamed from: m */
    private long f11013m;

    /* renamed from: n */
    private final C1689b f11014n = new C1689b();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2201v<Pair<List<V>, C2974a>> mo9341a(boolean z, DataKey datakey, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract DataKey mo9342a(C2974a aVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9347a(C0079f fVar, C0074a aVar, Throwable th) throws Exception {
        this.f11007g.postValue(C3842b.m9751a(th));
        this.f11011k = new C3965o(this, fVar, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9348a(Object obj) throws Exception {
        if (!(this.f11007g.getValue() != null && this.f11007g.getValue() == C3842b.f10821c)) {
            mo106b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo9351d() {
        return this.f11012l.mo9340i();
    }

    /* renamed from: f */
    private void m10030f() {
        this.f11005e.mo9191c(this.f11004d);
        this.f11006f.mo9181a(this.f11004d);
    }

    /* renamed from: c_ */
    public final void mo110c_() {
        this.f11014n.mo6180a();
        mo107b(this);
    }

    /* renamed from: e */
    private void m10029e() {
        if (mo9351d()) {
            m10030f();
            this.f11012l.mo9338a(false);
        }
    }

    /* renamed from: g */
    private boolean m10031g() {
        boolean z;
        synchronized (this.f11012l) {
            if (this.f11013m == this.f11012l.f10987d.get()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m10027a(C1690c cVar) {
        this.f11014n.mo6181a(cVar);
    }

    public C3953c(C3948c<CacheKey, V> cVar) {
        this.f11004d = cVar.f10988e;
        this.f11005e = cVar.f10989f;
        this.f11006f = cVar.f10990g;
        this.f11008h = cVar.mo9331b();
        this.f11007g = cVar.mo9330a();
        this.f11009i = cVar.mo9332c();
        this.f11010j = cVar.mo9333d();
        this.f11012l = cVar;
        this.f11013m = cVar.f10987d.incrementAndGet();
        m10027a(cVar.mo9335f().mo6505a((C1710e<? super T>) new C3954d<Object>(this), C3955e.f11016a));
        m10027a(cVar.mo9334e().mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3958h<Object>(this, cVar), C3959i.f11023a));
        m10027a(cVar.mo9336g().mo6545f((C1710e<? super T>) new C3960j<Object>(this)));
        mo105a(this);
    }

    /* renamed from: a */
    private List<V> m10026a(List<V> list, C2974a aVar) {
        this.f11006f.mo9182a(this.f11004d, aVar);
        return this.f11005e.mo9186a(this.f11004d, (List<V>) new ArrayList<V>(list));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9344a(C0074a aVar, Pair pair) throws Exception {
        boolean z;
        Object a = mo9342a((C2974a) pair.second);
        C0198r<Boolean> rVar = this.f11009i;
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        rVar.postValue(Boolean.valueOf(z));
        aVar.mo118a(m10026a((List) pair.first, (C2974a) pair.second), a);
        this.f11007g.postValue(C3842b.f10822d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9345a(C0076c cVar, Pair pair) throws Exception {
        boolean z;
        this.f11008h.postValue(C3842b.f10822d);
        this.f11007g.postValue(C3842b.f10822d);
        if (!m10031g()) {
            if (mo9351d()) {
                this.f11012l.mo9338a(false);
            }
            return;
        }
        Object a = mo9342a((C2974a) pair.second);
        C0198r<Boolean> rVar = this.f11009i;
        boolean z2 = true;
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        rVar.postValue(Boolean.valueOf(z));
        if (!C9414h.m18630a(this.f11005e.mo9185a(this.f11004d)) || !C9414h.m18630a((List) pair.first)) {
            z2 = false;
        }
        if (!mo9351d() || z2) {
            if (!C9414h.m18630a((List) pair.first)) {
                m10030f();
            }
            List a2 = m10026a((List) pair.first, (C2974a) pair.second);
            this.f11010j.postValue(Boolean.valueOf(C9414h.m18630a(a2)));
            cVar.mo119a(a2, null, a);
            this.f11012l.mo9338a(false);
            return;
        }
        m10029e();
        m10026a((List) pair.first, (C2974a) pair.second);
        mo106b();
        this.f11010j.postValue(Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final void mo9349b(C0078e<DataKey> eVar, C0076c<DataKey, V> cVar) {
        if (m10031g()) {
            boolean z = false;
            if (this.f11012l.f10986c) {
                this.f11012l.mo9339b(false);
                this.f11012l.mo9338a(true);
            }
            this.f11008h.postValue(C3842b.f10821c);
            this.f11007g.postValue(C3842b.f10821c);
            this.f11009i.postValue(Boolean.valueOf(true));
            this.f11011k = null;
            List a = this.f11005e.mo9185a(this.f11004d);
            if (!C9414h.m18630a(a)) {
                C2974a aVar = (C2974a) this.f11006f.mo9183b(this.f11004d);
                cVar.mo119a(new ArrayList(a), null, mo9342a(aVar));
                if (mo9351d()) {
                    m10028a(mo9341a(true, (DataKey) null, eVar.f189a), eVar, cVar);
                } else {
                    this.f11010j.postValue(Boolean.valueOf(false));
                    C0198r<Boolean> rVar = this.f11009i;
                    if (mo9342a(aVar) != null) {
                        z = true;
                    }
                    rVar.postValue(Boolean.valueOf(z));
                    this.f11008h.postValue(C3842b.f10822d);
                    this.f11007g.postValue(C3842b.f10822d);
                }
            } else {
                m10028a(mo9341a(true, (DataKey) null, eVar.f189a), eVar, cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo9350b(C0079f<DataKey> fVar, C0074a<DataKey, V> aVar) {
        if (!mo9351d()) {
            this.f11007g.postValue(C3842b.f10821c);
            this.f11011k = null;
            m10027a(mo9341a(false, (DataKey) fVar.f191a, fVar.f192b).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3963m<Object>(this, aVar), (C1710e<? super Throwable>) new C3964n<Object>(this, fVar, aVar)));
        }
    }

    /* renamed from: a */
    private void m10028a(C2201v<Pair<List<V>, C2974a>> vVar, C0078e<DataKey> eVar, C0076c<DataKey, V> cVar) {
        if (vVar == null) {
            this.f11008h.postValue(C3842b.f10822d);
            this.f11007g.postValue(C3842b.f10822d);
            return;
        }
        m10027a(vVar.mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3961k<Object>(this, cVar), (C1710e<? super Throwable>) new C3962l<Object>(this, eVar, cVar)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9346a(C0078e eVar, C0076c cVar, Throwable th) throws Exception {
        this.f11012l.mo9338a(false);
        this.f11008h.postValue(C3842b.m9751a(th));
        this.f11007g.postValue(C3842b.m9751a(th));
        if (m10031g()) {
            if (mo9351d()) {
                m10029e();
                this.f11011k = new C3956f(this);
                return;
            }
            this.f11011k = new C3957g(this, eVar, cVar);
        }
    }
}
