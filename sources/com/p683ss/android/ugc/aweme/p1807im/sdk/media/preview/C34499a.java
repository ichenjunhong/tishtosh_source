package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.C1425al;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.C33994c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1853b.C34448a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1849a.C34407b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1857a.C34512a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel.MediaPreviewViewModel.C34539a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a */
public final class C34499a extends C23526a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88966a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34499a.class), "adapter", "getAdapter()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/adapter/MediaPreviewAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34499a.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/viewmodel/MediaPreviewViewModel;"))};

    /* renamed from: b */
    public boolean f88967b;

    /* renamed from: c */
    private final C52668f f88968c = C52732g.m112285a(new C34500a(this));

    /* renamed from: d */
    private final C52668f f88969d = C52732g.m112285a(new C34511l(this));

    /* renamed from: e */
    private HashMap f88970e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$a */
    static final class C34500a extends C52712l implements C52670a<C34512a> {

        /* renamed from: a */
        final /* synthetic */ C34499a f88971a;

        C34500a(C34499a aVar) {
            this.f88971a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34512a(this.f88971a.mo72522e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$b */
    static final class C34501b implements OnClickListener {

        /* renamed from: a */
        public static final C34501b f88972a = new C34501b();

        C34501b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$c */
    static final class C34502c implements OnClickListener {

        /* renamed from: a */
        public static final C34502c f88973a = new C34502c();

        C34502c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$d */
    static final class C34503d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34499a f88974a;

        C34503d(C34499a aVar) {
            this.f88974a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34499a aVar = this.f88974a;
            C34409a aVar2 = (C34409a) aVar.mo72522e().mo72558n().getValue();
            if (aVar2 != null) {
                if (!aVar.isViewValid()) {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar.f88967b = true;
                    MediaPreviewViewModel e = aVar.mo72522e();
                    C52711k.m112236a((Object) aVar2, "it");
                    boolean a = true ^ e.mo72508a(aVar2);
                    aVar.mo72522e().mo72507a(aVar2, a, new C34510k(a, aVar));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$e */
    static final class C34504e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34499a f88975a;

        C34504e(C34499a aVar) {
            this.f88975a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52711k.m112236a((Object) view, "it");
            view.setSelected(!view.isSelected());
            this.f88975a.mo72522e().f88934c = view.isSelected();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$f */
    static final class C34505f extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34499a f88976a;

        C34505f(C34499a aVar) {
            this.f88976a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f88976a.mo72521a(true);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$g */
    static final class C34506g extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34499a f88977a;

        C34506g(C34499a aVar) {
            this.f88977a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f88977a.mo72521a(false);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$h */
    static final class C34507h extends C52712l implements C52682m<List<C34409a>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34499a f88978a;

        C34507h(C34499a aVar) {
            this.f88978a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            ((Boolean) obj2).booleanValue();
            if (list != null) {
                if (!this.f88978a.isViewValid()) {
                    list = null;
                }
                if (list != null) {
                    C34512a a = this.f88978a.mo72520a();
                    C52711k.m112240b(list, "list");
                    a.mo72528a().clear();
                    a.mo72528a().addAll(list);
                    a.notifyDataSetChanged();
                    C34512a a2 = this.f88978a.mo72520a();
                    C34409a aVar = (C34409a) this.f88978a.mo72522e().mo72558n().getValue();
                    if (aVar != null) {
                        if (!a2.mo72528a().contains(aVar)) {
                            aVar = null;
                        }
                        if (aVar != null) {
                            RecyclerView recyclerView = a2.f88986b;
                            if (recyclerView != null) {
                                recyclerView.mo4814b(a2.mo72528a().indexOf(aVar));
                            }
                        }
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$i */
    static final class C34508i<T> implements C0199s<List<C34409a>> {

        /* renamed from: a */
        final /* synthetic */ C34499a f88979a;

        C34508i(C34499a aVar) {
            this.f88979a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            List list = (List) obj;
            C34499a aVar = this.f88979a;
            if (aVar.isViewValid()) {
                List list2 = (List) aVar.mo72522e().mo72510e().getValue();
                Collection collection = list2;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    DmtButton dmtButton = (DmtButton) aVar.mo72519a((int) R.id.p3);
                    C52711k.m112236a((Object) dmtButton, "btn_send");
                    dmtButton.setText(aVar.getResources().getString(R.string.bn5));
                    return;
                }
                DmtButton dmtButton2 = (DmtButton) aVar.mo72519a((int) R.id.p3);
                C52711k.m112236a((Object) dmtButton2, "btn_send");
                dmtButton2.setText(aVar.getResources().getString(R.string.bn7, new Object[]{Integer.valueOf(list2.size())}));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$j */
    static final class C34509j<T> implements C0199s<C34409a> {

        /* renamed from: a */
        final /* synthetic */ C34499a f88980a;

        C34509j(C34499a aVar) {
            this.f88980a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C34409a aVar = (C34409a) obj;
            this.f88980a.mo72523f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$k */
    static final class C34510k extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ boolean f88981a;

        /* renamed from: b */
        final /* synthetic */ C34499a f88982b;

        C34510k(boolean z, C34499a aVar) {
            this.f88981a = z;
            this.f88982b = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (!this.f88981a || intValue > 0) {
                FrameLayout frameLayout = (FrameLayout) this.f88982b.mo72519a((int) R.id.eim);
                C52711k.m112236a((Object) frameLayout, "layout_select");
                View view = frameLayout;
                ImageView imageView = (ImageView) this.f88982b.mo72519a((int) R.id.b41);
                C52711k.m112236a((Object) imageView, "iv_select");
                DmtTextView dmtTextView = (DmtTextView) this.f88982b.mo72519a((int) R.id.f4a);
                C52711k.m112236a((Object) dmtTextView, "tv_select");
                C34448a.m78385a(null, null, view, imageView, dmtTextView, intValue);
            }
            this.f88982b.f88967b = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a$l */
    static final class C34511l extends C52712l implements C52670a<MediaPreviewViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34499a f88983a;

        C34511l(C34499a aVar) {
            this.f88983a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f88983a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            return C34539a.m78480a(activity);
        }
    }

    /* renamed from: a */
    public final View mo72519a(int i) {
        if (this.f88970e == null) {
            this.f88970e = new HashMap();
        }
        View view = (View) this.f88970e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88970e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final C34512a mo72520a() {
        return (C34512a) this.f88968c.getValue();
    }

    /* renamed from: e */
    public final MediaPreviewViewModel mo72522e() {
        return (MediaPreviewViewModel) this.f88969d.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f88970e != null) {
            this.f88970e.clear();
        }
    }

    public final void onStart() {
        super.onStart();
        mo72522e().mo72513l();
    }

    /* renamed from: f */
    public final void mo72523f() {
        boolean z;
        C34409a aVar = (C34409a) mo72522e().mo72558n().getValue();
        int i = -1;
        if (aVar != null) {
            if (!isViewValid() || this.f88967b) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                aVar = null;
            }
            if (aVar != null) {
                List list = (List) mo72522e().mo72510e().getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                C52711k.m112236a((Object) list, "viewModel.selectedMediaL….value ?: mutableListOf()");
                if (!list.contains(aVar)) {
                    list = null;
                }
                if (list != null) {
                    i = list.indexOf(aVar) + 1;
                }
                ImageView imageView = (ImageView) mo72519a((int) R.id.b41);
                C52711k.m112236a((Object) imageView, "iv_select");
                DmtTextView dmtTextView = (DmtTextView) mo72519a((int) R.id.f4a);
                C52711k.m112236a((Object) dmtTextView, "tv_select");
                C34448a.m78386a(null, null, imageView, dmtTextView, i);
                return;
            }
        }
        ImageView imageView2 = (ImageView) mo72519a((int) R.id.b41);
        C52711k.m112236a((Object) imageView2, "iv_select");
        DmtTextView dmtTextView2 = (DmtTextView) mo72519a((int) R.id.f4a);
        C52711k.m112236a((Object) dmtTextView2, "tv_select");
        C34448a.m78386a(null, null, imageView2, dmtTextView2, -1);
    }

    /* renamed from: a */
    public final void mo72521a(boolean z) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MediaPreviewActivity)) {
            activity = null;
        }
        MediaPreviewActivity mediaPreviewActivity = (MediaPreviewActivity) activity;
        if (mediaPreviewActivity != null) {
            mediaPreviewActivity.mo72517a(z);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C0184k kVar = this;
        ListViewModel.m77692a(mo72522e(), kVar, C33994c.m77708a(null, new C34507h(this), null, 5, null), null, null, 12, null);
        mo72522e().mo72510e().observe(kVar, new C34508i(this));
        mo72522e().mo72558n().observe(kVar, new C34509j(this));
        ((FrameLayout) mo72519a((int) R.id.b_g)).setOnClickListener(C34501b.f88972a);
        ((FrameLayout) mo72519a((int) R.id.b73)).setOnClickListener(C34502c.f88973a);
        ((FrameLayout) mo72519a((int) R.id.eim)).setOnClickListener(new C34503d(this));
        DmtTextView dmtTextView = (DmtTextView) mo72519a((int) R.id.e0s);
        C52711k.m112236a((Object) dmtTextView, "btn_send_raw");
        dmtTextView.setSelected(mo72522e().f88934c);
        ((DmtTextView) mo72519a((int) R.id.e0s)).setOnClickListener(new C34504e(this));
        DmtButton dmtButton = (DmtButton) mo72519a((int) R.id.p3);
        C52711k.m112236a((Object) dmtButton, "btn_send");
        C34407b.m78359a(dmtButton, new C34505f(this));
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo72519a((int) R.id.ay9);
        C52711k.m112236a((Object) autoRTLImageView, "iv_back");
        C34407b.m78359a(autoRTLImageView, new C34506g(this));
        RecyclerView recyclerView = (RecyclerView) mo72519a((int) R.id.ca2);
        C52711k.m112236a((Object) recyclerView, "recycle_view");
        recyclerView.setAdapter(mo72520a());
        RecyclerView recyclerView2 = (RecyclerView) mo72519a((int) R.id.ca2);
        C52711k.m112236a((Object) recyclerView2, "recycle_view");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        ((RecyclerView) mo72519a((int) R.id.ca2)).setItemViewCacheSize(3);
        new C1425al().mo5634a((RecyclerView) mo72519a((int) R.id.ca2));
        mo72523f();
        C35225a.m79617l().mo73331a((DmtTextView) mo72519a((int) R.id.e0s), (DmtButton) mo72519a((int) R.id.p3));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bcp, viewGroup, false);
    }
}
