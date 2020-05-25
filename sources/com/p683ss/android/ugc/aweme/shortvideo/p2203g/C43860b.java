package com.p683ss.android.ugc.aweme.shortvideo.p2203g;

import android.arch.lifecycle.C0176h.C0178b;
import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2760e;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2766j;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.shortvideo.C43795es;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.tools.C47350y;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2475i.C49829a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.ss.android.ugc.trill.R;
import p2628d.C52855s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.g.b */
public final class C43860b extends C2764h<C43859a> implements C12356a, C43859a {

    /* renamed from: a */
    public final C2766j<Boolean> f111098a = new C2766j<>(Boolean.valueOf(true));

    /* renamed from: b */
    public final C2766j<Boolean> f111099b = new C2760e(Boolean.valueOf(false));

    /* renamed from: c */
    public final C2766j<Boolean> f111100c = new C2760e(Boolean.valueOf(false));

    /* renamed from: d */
    public final C2765i<C52855s<Integer, Integer, Intent>> f111101d = new C2765i<>();

    /* renamed from: e */
    public final C43795es f111102e = new C43795es(this.f111104g, this.f111105h, this.f111106i, mo23370j());

    /* renamed from: f */
    private boolean f111103f;

    /* renamed from: g */
    private final FragmentActivity f111104g = ((FragmentActivity) mo23370j().mo23373a(FragmentActivity.class, (String) null));

    /* renamed from: h */
    private final ShortVideoContext f111105h = ((ShortVideoContext) mo23370j().mo23373a(ShortVideoContext.class, (String) null));

    /* renamed from: i */
    private final C45004a f111106i = ((C45004a) mo23370j().mo23373a(C45004a.class, (String) null));

    /* renamed from: j */
    private final C12361b f111107j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.g.b$a */
    static final class C43861a<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C43860b f111108a;

        C43861a(C43860b bVar) {
            this.f111108a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C43795es esVar = this.f111108a.f111102e;
            C52711k.m112236a((Object) num, "integer");
            esVar.onEvent(new C47350y(num.intValue()));
        }
    }

    /* renamed from: h */
    public final boolean mo89407h() {
        return this.f111103f;
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f111107j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2763g mo89399c() {
        return this.f111098a;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2763g mo89401d() {
        return this.f111099b;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2763g mo89403e() {
        return this.f111100c;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2762f mo89405f() {
        return this.f111101d;
    }

    public final void bO_() {
        super.bO_();
        this.f111106i.mo91350aj().mo7349a(this, new C43861a(this));
    }

    /* renamed from: i */
    private final boolean m96303i() {
        if (!getLifecycle().mo323a().isAtLeast(C0178b.CREATED)) {
            return false;
        }
        String str = null;
        C49577b bVar = (C49577b) mo23370j().mo23375b(C49577b.class, (String) null);
        if (bVar != null) {
            str = bVar.mo97487k();
        }
        return TextUtils.equals(str, this.f111104g.getString(R.string.d5n));
    }

    /* renamed from: g */
    public final boolean mo89406g() {
        if (!getLifecycle().mo323a().isAtLeast(C0178b.CREATED)) {
            return false;
        }
        String str = null;
        C49577b bVar = (C49577b) mo23370j().mo23375b(C49577b.class, (String) null);
        if (bVar != null) {
            str = bVar.mo97487k();
        }
        return TextUtils.equals(str, this.f111104g.getString(R.string.d5h));
    }

    /* renamed from: b */
    public final void mo89398b(boolean z) {
        this.f111103f = z;
    }

    /* renamed from: d */
    public final void mo89402d(boolean z) {
        this.f111099b.mo7345a(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public final void mo89404e(boolean z) {
        this.f111100c.mo7345a(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo89400c(boolean z) {
        mo89397a(z);
        C49860a aVar = (C49860a) mo23370j().mo23375b(C49860a.class, (String) null);
        boolean z2 = false;
        if (!this.f111103f) {
            if (z && !m96303i()) {
                z2 = true;
            }
            if (aVar != null) {
                aVar.mo97693c(z2);
            }
        } else if (aVar != null) {
            aVar.mo97693c(false);
        }
        if (aVar != null) {
            aVar.mo97696d(z);
        }
    }

    public C43860b(C12361b bVar) {
        C52711k.m112240b(bVar, "diContainer");
        this.f111107j = bVar;
    }

    /* renamed from: a */
    public final void mo89395a(int i) {
        if (getLifecycle().mo323a().isAtLeast(C0178b.STARTED)) {
            C47350y yVar = new C47350y(3);
            yVar.f119501a = i;
            this.f111102e.onEvent(yVar);
            this.f111106i.mo91359d(3);
            this.f111106i.mo91358c(i);
            C49860a aVar = (C49860a) mo23370j().mo23375b(C49860a.class, (String) null);
            if (aVar != null) {
                aVar.mo97696d(true);
                aVar.mo97692c(1);
                aVar.mo97690b(true);
                aVar.mo97699f();
            }
        }
    }

    /* renamed from: a */
    public final void mo89397a(boolean z) {
        C49607a aVar = (C49607a) mo23370j().mo23375b(C49607a.class, (String) null);
        if (this.f111105h.mo86368i()) {
            if (aVar != null) {
                aVar.mo97517a(Boolean.valueOf(false), null, null);
            }
        } else if (this.f111103f) {
            if (aVar != null) {
                aVar.mo97517a(Boolean.valueOf(true), null, null);
            }
        } else if (aVar != null) {
            aVar.mo97517a(Boolean.valueOf(z), null, null);
        }
        this.f111098a.mo7345a(Boolean.valueOf(z));
        if (!z && aVar != null) {
            aVar.mo97523k();
        }
        if (this.f111105h.mo86369j()) {
            C49829a aVar2 = (C49829a) mo23370j().mo23375b(C49829a.class, (String) null);
            if (aVar2 != null) {
                aVar2.mo97673a(z);
            }
        }
        if (!this.f111105h.mo86365f() && !this.f111105h.mo86366g()) {
            if (!m96303i() && aVar != null) {
                aVar.mo97517a(null, Boolean.valueOf(z), Boolean.valueOf(z));
            }
        } else if (aVar != null) {
            aVar.mo97517a(Boolean.valueOf(false), null, null);
        }
    }

    /* renamed from: a */
    public final void mo89396a(int i, int i2, Intent intent) {
        this.f111101d.mo7350a(new C52855s(Integer.valueOf(i), Integer.valueOf(i2), intent));
    }
}
