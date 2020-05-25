package com.p683ss.android.ugc.aweme.p1807im.sdk.common;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.d */
public final class C33999d<T> extends C23275b<Integer> {

    /* renamed from: g */
    public static final C34000a f87915g = new C34000a(null);

    /* renamed from: b */
    public boolean f87916b;

    /* renamed from: c */
    public boolean f87917c;

    /* renamed from: d */
    public boolean f87918d;

    /* renamed from: e */
    public Throwable f87919e;

    /* renamed from: f */
    public final C23275b<List<T>> f87920f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.d$a */
    public static final class C34000a {
        private C34000a() {
        }

        public /* synthetic */ C34000a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.d$b */
    static final class C34001b<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C33999d f87921a;

        /* renamed from: b */
        final /* synthetic */ C33993b f87922b;

        C34001b(C33999d dVar, C33993b bVar) {
            this.f87921a = dVar;
            this.f87922b = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                this.f87922b.mo71932a();
            } else if (num != null && num.intValue() == 3) {
                this.f87922b.mo71934a((List) this.f87921a.f87920f.getValue(), this.f87921a.f87916b);
            } else {
                if (num != null && num.intValue() == 2) {
                    this.f87922b.mo71933a(this.f87921a.f87919e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo71936a(Throwable th) {
        this.f87919e = th;
        mo71937a(false);
        setValue(Integer.valueOf(2));
    }

    /* renamed from: b */
    public final void mo71938b(boolean z) {
        this.f87918d = true;
        mo71937a(false);
        setValue(Integer.valueOf(3));
    }

    public C33999d(C23275b<List<T>> bVar) {
        C52711k.m112240b(bVar, "data");
        this.f87920f = bVar;
        setValue(Integer.valueOf(0));
    }

    /* renamed from: a */
    public final void mo71937a(boolean z) {
        this.f87917c = z;
        if (z) {
            setValue(Integer.valueOf(1));
        }
    }

    /* renamed from: a */
    public final void mo71935a(C0184k kVar, C33993b<T> bVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(bVar, "listListener");
        observe(kVar, new C34001b(this, bVar));
    }
}
