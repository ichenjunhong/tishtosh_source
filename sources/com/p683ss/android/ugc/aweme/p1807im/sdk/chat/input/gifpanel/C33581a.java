package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifpanel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29361p;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.C33994c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.a */
public final class C33581a implements C26846a {

    /* renamed from: a */
    public final String f87039a = "GifChoosePanel";

    /* renamed from: b */
    LinearLayout f87040b;

    /* renamed from: c */
    public C33589c f87041c;

    /* renamed from: d */
    private RecyclerView f87042d;

    /* renamed from: e */
    private GifSearchViewModel f87043e;

    /* renamed from: f */
    private final FragmentActivity f87044f;

    /* renamed from: g */
    private final ViewGroup f87045g;

    /* renamed from: h */
    private final C29361p f87046h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.a$a */
    static final class C33582a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33581a f87047a;

        C33582a(C33581a aVar) {
            this.f87047a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LinearLayout linearLayout = this.f87047a.f87040b;
            if (linearLayout == null) {
                C52711k.m112237a("statusView");
            }
            linearLayout.setVisibility(0);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.a$b */
    static final class C33583b extends C52712l implements C52682m<List<C29285a>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33581a f87048a;

        C33583b(C33581a aVar) {
            this.f87048a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object obj3;
            boolean z;
            List list = (List) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            StringBuilder sb = new StringBuilder("refresh onSuccess: ");
            if (list != null) {
                obj3 = Integer.valueOf(list.size());
            } else {
                obj3 = null;
            }
            sb.append(obj3);
            sb.append(", ");
            sb.append(booleanValue);
            this.f87048a.mo71034b();
            C33589c a = C33581a.m76972a(this.f87048a);
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a = null;
            }
            if (a != null) {
                a.mo50303a(list);
            } else {
                this.f87048a.mo71035c();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.a$c */
    static final class C33584c extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33581a f87049a;

        C33584c(C33581a aVar) {
            this.f87049a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f87049a.mo71034b();
            this.f87049a.mo71035c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.a$d */
    static final class C33585d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33581a f87050a;

        C33585d(C33581a aVar) {
            this.f87050a = aVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.a$e */
    static final class C33586e extends C52712l implements C52682m<List<C29285a>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33581a f87051a;

        C33586e(C33581a aVar) {
            this.f87051a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Integer num;
            boolean z;
            List list = (List) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            StringBuilder sb = new StringBuilder("loadMore: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(", ");
            sb.append(booleanValue);
            C33589c a = C33581a.m76972a(this.f87051a);
            Collection collection = list;
            boolean z2 = true;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a.f87059f = false;
                Collection a2 = a.mo50673a();
                if (a2 != null && !a2.isEmpty()) {
                    z2 = false;
                }
                if (!z2) {
                    a.mo50673a().addAll(collection);
                }
                a.mo50304b(a.mo50673a());
            }
            if (!booleanValue) {
                C10691a.m21551c(a.f76720d, a.f76720d.getString(R.string.bzr)).mo19066a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.a$f */
    static final class C33587f extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33581a f87052a;

        C33587f(C33581a aVar) {
            this.f87052a = aVar;
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C52860x.f131107a;
        }
    }

    public final void ar_() {
        GifSearchViewModel gifSearchViewModel = this.f87043e;
        if (gifSearchViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        gifSearchViewModel.mo71032a();
    }

    /* renamed from: b */
    public final void mo71034b() {
        LinearLayout linearLayout = this.f87040b;
        if (linearLayout == null) {
            C52711k.m112237a("statusView");
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo71035c() {
        LinearLayout linearLayout = this.f87040b;
        if (linearLayout == null) {
            C52711k.m112237a("statusView");
        }
        linearLayout.setVisibility(0);
        C33589c cVar = this.f87041c;
        if (cVar == null) {
            C52711k.m112237a("adapter");
        }
        cVar.ao_();
        C33589c cVar2 = this.f87041c;
        if (cVar2 == null) {
            C52711k.m112237a("adapter");
        }
        cVar2.mo54785f();
    }

    /* renamed from: a */
    private final <T extends View> T m76971a(int i) {
        T findViewById = this.f87045g.findViewById(i);
        C52711k.m112236a((Object) findViewById, "layout.findViewById(id)");
        return findViewById;
    }

    /* renamed from: a */
    public static final /* synthetic */ C33589c m76972a(C33581a aVar) {
        C33589c cVar = aVar.f87041c;
        if (cVar == null) {
            C52711k.m112237a("adapter");
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo71033a(boolean z) {
        GifSearchViewModel gifSearchViewModel = this.f87043e;
        if (gifSearchViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        ListViewModel.m77692a(gifSearchViewModel, this.f87044f, C33994c.m77707a(new C33582a(this), new C33583b(this), new C33584c(this)), C33994c.m77707a(new C33585d(this), new C33586e(this), new C33587f(this)), null, 8, null);
    }

    public C33581a(FragmentActivity fragmentActivity, ViewGroup viewGroup, C29361p pVar) {
        C52711k.m112240b(fragmentActivity, "context");
        C52711k.m112240b(viewGroup, "layout");
        C52711k.m112240b(pVar, "inputBridge");
        this.f87044f = fragmentActivity;
        this.f87045g = viewGroup;
        this.f87046h = pVar;
        LayoutInflater.from(this.f87044f).inflate(R.layout.bgz, this.f87045g, true);
        this.f87042d = (RecyclerView) m76971a((int) R.id.ca3);
        this.f87040b = (LinearLayout) m76971a((int) R.id.csv);
        FragmentActivity fragmentActivity2 = this.f87044f;
        C52711k.m112240b(fragmentActivity2, "activity");
        C0209x a = C0214z.m440a(fragmentActivity2).mo359a(GifSearchViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…rchViewModel::class.java)");
        this.f87043e = (GifSearchViewModel) a;
        this.f87041c = new C33589c(this.f87044f, this);
        C33589c cVar = this.f87041c;
        if (cVar == null) {
            C52711k.m112237a("adapter");
        }
        cVar.mo59262a(this.f87046h);
        C33589c cVar2 = this.f87041c;
        if (cVar2 == null) {
            C52711k.m112237a("adapter");
        }
        RecyclerView recyclerView = this.f87042d;
        if (recyclerView == null) {
            C52711k.m112237a("recyclerView");
        }
        cVar2.mo59260a(recyclerView);
        GifSearchViewModel gifSearchViewModel = this.f87043e;
        if (gifSearchViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        gifSearchViewModel.mo71032a();
    }
}
