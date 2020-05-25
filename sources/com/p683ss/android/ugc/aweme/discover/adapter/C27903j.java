package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p030v4.app.Fragment;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.jedi.arch.ext.list.p744a.C11841b;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.p683ss.android.ugc.aweme.common.p1598j.C26904c;
import com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26906b;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27728f;
import com.p683ss.android.ugc.aweme.discover.p1640c.C28068a;
import com.p683ss.android.ugc.aweme.discover.p1640c.C28088b;
import com.p683ss.android.ugc.aweme.discover.p1640c.C28089c;
import com.p683ss.android.ugc.aweme.discover.p1640c.C28090d;
import com.p683ss.android.ugc.aweme.discover.p1640c.C28091e;
import com.p683ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.j */
public final class C27903j extends C27728f<DiscoverItemData> implements C26906b {

    /* renamed from: e */
    public static final int f73287e = f73287e;

    /* renamed from: f */
    public static final int f73288f = f73288f;

    /* renamed from: g */
    public static final int f73289g = f73289g;

    /* renamed from: h */
    public static final int f73290h = f73290h;

    /* renamed from: i */
    public static final String f73291i = f73291i;

    /* renamed from: j */
    public static final C27904a f73292j = new C27904a(null);

    /* renamed from: a */
    public RecyclerView f73293a;

    /* renamed from: b */
    public final C28068a f73294b;

    /* renamed from: c */
    public final C28091e f73295c;

    /* renamed from: d */
    public final C11841b<Object> f73296d;

    /* renamed from: l */
    private final C28090d f73297l;

    /* renamed from: m */
    private C28088b f73298m;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.j$a */
    public static final class C27904a {
        private C27904a() {
        }

        /* renamed from: a */
        public static int m66653a() {
            return C27903j.f73287e;
        }

        /* renamed from: b */
        public static int m66654b() {
            return C27903j.f73290h;
        }

        public /* synthetic */ C27904a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.j$b */
    public interface C27905b {
        /* renamed from: a */
        void mo56317a(View view);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.j$c */
    public static final class C27906c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f73299a;

        public C27906c(RecyclerView recyclerView) {
            this.f73299a = recyclerView;
        }

        public final void run() {
            C26904c.m65028a(this.f73299a);
        }
    }

    public C27903j() {
        this(null, 1, null);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f73293a = recyclerView;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f73293a = null;
    }

    /* renamed from: a */
    public final Object mo54858a(int i) {
        int size = this.f72772k.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((DiscoverItemData) this.f72772k.get(i2)).getType() == 5) {
                break;
            } else {
                i2++;
            }
        }
        if (i < 0 || i < i2 || i >= this.f72772k.size()) {
            return Integer.valueOf(i);
        }
        return (Serializable) this.f72772k.get(i);
    }

    public C27903j(Fragment fragment) {
        this.f73296d = new C11841b<>((C1322a<?>) this, (C1212c<T>) new C27909m<T>(), (C11850b) null);
        this.f73297l = new C28090d(fragment);
        mo56159a(this.f73297l);
        this.f73295c = new C28091e(fragment);
        mo56159a(this.f73295c);
        mo56158a(f73290h, new C28089c());
        this.f73294b = new C28068a();
        mo56159a(this.f73294b);
        this.f73298m = new C28088b();
        int i = f73287e;
        C28088b bVar = this.f73298m;
        if (bVar == null) {
            C52711k.m112234a();
        }
        mo56158a(i, bVar);
    }

    /* renamed from: a */
    public final void mo56316a(boolean z) {
        if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
            boolean z2 = !z;
            if (this.f73298m != null) {
                C28088b bVar = this.f73298m;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                bVar.f73774a = z2;
            }
            C28068a aVar = this.f73294b;
            if (aVar != null) {
                aVar.f73743a = z2;
            }
        }
        if (this.f73294b != null) {
            this.f73294b.mo56491a(!z);
            this.f73294b.mo56492b(!z);
        }
    }

    private /* synthetic */ C27903j(Fragment fragment, int i, C52707g gVar) {
        this(null);
    }
}
