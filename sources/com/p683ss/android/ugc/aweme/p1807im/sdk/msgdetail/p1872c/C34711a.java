package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1872c;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.C34743a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.C34744b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.C34748f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34734a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.a */
public abstract class C34711a extends C1352v implements C34744b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89413a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34711a.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/msgdetail/viewmodel/MediaBrowserViewModel;"))};

    /* renamed from: f */
    public static final C34712a f89414f = new C34712a(null);

    /* renamed from: b */
    public final RecyclerView f89415b;

    /* renamed from: c */
    public boolean f89416c;

    /* renamed from: d */
    public C34743a f89417d = new C34743a(0, 0, 0);

    /* renamed from: e */
    public C34710a<BaseContent> f89418e;

    /* renamed from: g */
    private final C52668f f89419g = C52732g.m112285a(new C34713b(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.a$a */
    public static final class C34712a {
        private C34712a() {
        }

        public /* synthetic */ C34712a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.a$b */
    static final class C34713b extends C52712l implements C52670a<MediaBrowserViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34711a f89420a;

        C34713b(C34711a aVar) {
            this.f89420a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity b = this.f89420a.mo72772b();
            if (b == null) {
                C52711k.m112234a();
            }
            return C34734a.m78773a(b);
        }
    }

    /* renamed from: i */
    private MediaBrowserViewModel mo72779i() {
        return (MediaBrowserViewModel) this.f89419g.getValue();
    }

    /* renamed from: a */
    public void mo72769a(View view) {
        C52711k.m112240b(view, "itemView");
    }

    /* renamed from: d */
    public boolean mo72774d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo72775e() {
        return false;
    }

    /* renamed from: f */
    public void mo72776f() {
        this.f89416c = false;
    }

    /* renamed from: g */
    public void mo72777g() {
    }

    /* renamed from: h */
    public void mo72778h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final FragmentActivity mo72772b() {
        Activity d = C23729p.m58270d(this.itemView);
        if (!(d instanceof FragmentActivity)) {
            d = null;
        }
        return (FragmentActivity) d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo72767a() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        return context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo72773c() {
        MediaBrowserViewModel i = mo72779i();
        if (!this.f89417d.mo72805a()) {
            i = null;
        }
        if (i != null) {
            i.mo72803f().setValue(C34748f.PERFORM_BACK);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo72768a(int i) {
        T findViewById = this.itemView.findViewById(i);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(id)");
        return findViewById;
    }

    /* renamed from: a */
    public void mo72770a(C34710a<BaseContent> aVar) {
        C52711k.m112240b(aVar, "data");
        if (this.f89418e != aVar) {
            this.f89418e = aVar;
        }
    }

    /* renamed from: a */
    public void mo72771a(C34743a aVar) {
        C52711k.m112240b(aVar, "dragState");
        this.f89417d = aVar;
    }

    public C34711a(View view, RecyclerView recyclerView) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(recyclerView, "_recyclerView");
        super(view);
        this.f89415b = recyclerView;
        mo72769a(view);
        MediaBrowserViewModel i = mo72779i();
        C34744b bVar = this;
        C52711k.m112240b(bVar, "client");
        if (!i.mo72804g().contains(bVar)) {
            i.mo72804g().add(bVar);
        }
    }
}
