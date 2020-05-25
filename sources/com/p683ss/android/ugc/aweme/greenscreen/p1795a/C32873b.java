package com.p683ss.android.ugc.aweme.greenscreen.p1795a;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.greenscreen.C32870a;
import com.p683ss.android.ugc.aweme.greenscreen.C32885b;
import com.p683ss.android.ugc.aweme.greenscreen.C32920s;
import com.p683ss.android.ugc.aweme.greenscreen.C32922t;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenImage;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44086a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c;
import com.p683ss.android.ugc.aweme.views.C48219q;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b */
public final class C32873b extends C44086a {

    /* renamed from: a */
    public C32871a f85489a;

    /* renamed from: b */
    public C32884e f85490b;

    /* renamed from: c */
    Dialog f85491c;

    /* renamed from: v */
    private HashMap f85492v;

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b$a */
    public static final class C32874a extends C32870a {

        /* renamed from: a */
        final /* synthetic */ C32873b f85493a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f85494b;

        C32874a(C32873b bVar, MediaModel mediaModel) {
            this.f85493a = bVar;
            this.f85494b = mediaModel;
        }

        /* renamed from: a */
        public final void mo69768a(Integer num, String str) {
            super.mo69768a(num, str);
            this.f85493a.mo69795f();
            C10691a.m21549c(this.f85493a.getContext(), (int) R.string.gh8, 0).mo19066a();
        }

        /* renamed from: a */
        public final void mo69769a(String str, String str2, Long l) {
            C52711k.m112240b(str, "imagePath");
            C52711k.m112240b(str2, "imageName");
            super.mo69769a(str, str2, l);
            this.f85493a.mo69795f();
            this.f85494b.f95383b = str;
            C44082c cVar = this.f85493a.f111679j;
            if (cVar != null) {
                cVar.mo89950b(this.f85494b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b$b */
    public static final class C32875b implements C32883d {

        /* renamed from: a */
        final /* synthetic */ C32873b f85495a;

        C32875b(C32873b bVar) {
            this.f85495a = bVar;
        }

        /* renamed from: a */
        public final void mo69796a(View view, MediaModel mediaModel) {
            C52711k.m112240b(view, "v");
            C52711k.m112240b(mediaModel, "item");
            C32873b bVar = this.f85495a;
            String a = C9395d.m18571a(mediaModel.f95383b);
            if (a != null) {
                FragmentActivity activity = bVar.getActivity();
                if (activity != null) {
                    C52711k.m112236a((Object) activity, "it");
                    if (!activity.isFinishing()) {
                        bVar.f85491c = new C48219q(activity);
                        Dialog dialog = bVar.f85491c;
                        if (dialog != null) {
                            dialog.show();
                        }
                    }
                }
                String str = mediaModel.f95383b;
                C52711k.m112236a((Object) str, "model.filePath");
                C32920s.m75824a(a, str, new C32874a(bVar, mediaModel));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b$c */
    public static final class C32876c implements C32884e {

        /* renamed from: a */
        final /* synthetic */ C32873b f85496a;

        C32876c(C32873b bVar) {
            this.f85496a = bVar;
        }

        /* renamed from: a */
        public final void mo69797a(String str) {
            C32884e eVar = this.f85496a.f85490b;
            if (eVar != null) {
                eVar.mo69797a(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b$d */
    public static final class C32877d extends C1302b {

        /* renamed from: c */
        final /* synthetic */ C32873b f85497c;

        /* renamed from: d */
        final /* synthetic */ WrapGridLayoutManager f85498d;

        /* renamed from: a */
        public final int mo4690a(int i) {
            C32871a aVar = this.f85497c.f85489a;
            if (aVar == null) {
                C52711k.m112237a("mMediaAdapter");
            }
            if (aVar.getItemViewType(i) == 1) {
                return this.f85498d.f4521b;
            }
            return 1;
        }

        C32877d(C32873b bVar, WrapGridLayoutManager wrapGridLayoutManager) {
            this.f85497c = bVar;
            this.f85498d = wrapGridLayoutManager;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b$e */
    public static final class C32878e implements C32885b {

        /* renamed from: a */
        final /* synthetic */ C32873b f85499a;

        /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b$e$a */
        static final class C32879a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C32878e f85500a;

            C32879a(C32878e eVar) {
                this.f85500a = eVar;
            }

            public final /* synthetic */ Object call() {
                C32873b bVar = this.f85500a.f85499a;
                DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) bVar.mo69792a(R.id.ard);
                C52711k.m112236a((Object) dmtLoadingLayout, "image_loading");
                dmtLoadingLayout.setVisibility(8);
                LinearLayout linearLayout = (LinearLayout) bVar.mo69792a(R.id.es9);
                C52711k.m112236a((Object) linearLayout, "retryRootView");
                linearLayout.setVisibility(0);
                ((LinearLayout) bVar.mo69792a(R.id.e28)).setOnClickListener(new C32881f(bVar));
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b$e$b */
        static final class C32880b<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C32878e f85501a;

            /* renamed from: b */
            final /* synthetic */ List f85502b;

            C32880b(C32878e eVar, List list) {
                this.f85501a = eVar;
                this.f85502b = list;
            }

            public final /* synthetic */ Object call() {
                Iterable<GreenScreenImage> iterable = this.f85502b;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (GreenScreenImage greenScreenImage : iterable) {
                    C52711k.m112240b(greenScreenImage, "$this$toMediaModel");
                    MediaModel mediaModel = new MediaModel(0);
                    mediaModel.f95383b = greenScreenImage.getCoverLarge();
                    mediaModel.f95389h = greenScreenImage.getCoverThumb();
                    mediaModel.f95397p = greenScreenImage.getImageId();
                    arrayList.add(mediaModel);
                }
                List e = C52575l.m112138e((Iterable<? extends T>) (List) arrayList);
                C32873b bVar = this.f85501a.f85499a;
                if (e != null) {
                    DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) bVar.mo69792a(R.id.ard);
                    C52711k.m112236a((Object) dmtLoadingLayout, "image_loading");
                    dmtLoadingLayout.setVisibility(8);
                    LinearLayout linearLayout = (LinearLayout) bVar.mo69792a(R.id.es9);
                    C52711k.m112236a((Object) linearLayout, "retryRootView");
                    linearLayout.setVisibility(8);
                    if (e.isEmpty()) {
                        DmtTextView dmtTextView = (DmtTextView) bVar.mo69792a(R.id.br2);
                        C52711k.m112236a((Object) dmtTextView, "no_image_hint");
                        dmtTextView.setVisibility(0);
                        ((DmtTextView) bVar.mo69792a(R.id.br2)).setText(R.string.chd);
                    } else {
                        DmtTextView dmtTextView2 = (DmtTextView) bVar.mo69792a(R.id.br2);
                        C52711k.m112236a((Object) dmtTextView2, "no_image_hint");
                        dmtTextView2.setVisibility(8);
                    }
                    C32871a aVar = bVar.f85489a;
                    if (aVar == null) {
                        C52711k.m112237a("mMediaAdapter");
                    }
                    if (e != null) {
                        aVar.f85484c.clear();
                        aVar.f85484c.addAll(e);
                        aVar.notifyDataSetChanged();
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo69798a() {
            C0013i.m18a((Callable<TResult>) new C32879a<TResult>(this), C0013i.f25b);
        }

        C32878e(C32873b bVar) {
            this.f85499a = bVar;
        }

        /* renamed from: a */
        public final void mo69799a(List<GreenScreenImage> list) {
            C52711k.m112240b(list, "images");
            C0013i.m18a((Callable<TResult>) new C32880b<TResult>(this, list), C0013i.f25b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.b$f */
    static final class C32881f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32873b f85503a;

        C32881f(C32873b bVar) {
            this.f85503a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f85503a.mo69793a();
        }
    }

    /* renamed from: a */
    public final View mo69792a(int i) {
        if (this.f85492v == null) {
            this.f85492v = new HashMap();
        }
        View view = (View) this.f85492v.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f85492v.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f85492v != null) {
            this.f85492v.clear();
        }
    }

    /* renamed from: e */
    public final void mo69794e() {
        if (((FastScrollRecyclerView) mo69792a(R.id.arb)) instanceof FastScrollRecyclerView) {
            ((FastScrollRecyclerView) mo69792a(R.id.arb)).mo49162o();
        }
    }

    /* renamed from: f */
    public final void mo69795f() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C52711k.m112236a((Object) activity, "it");
            if (!activity.isFinishing()) {
                Dialog dialog = this.f85491c;
                if (dialog != null) {
                    dialog.hide();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69793a() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo69792a(R.id.ard);
        C52711k.m112236a((Object) dmtLoadingLayout, "image_loading");
        dmtLoadingLayout.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) mo69792a(R.id.es9);
        C52711k.m112236a((Object) linearLayout, "retryRootView");
        linearLayout.setVisibility(8);
        FragmentActivity requireActivity = requireActivity();
        C52711k.m112236a((Object) requireActivity, "requireActivity()");
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        C32922t.m75825a(new C32922t(requireActivity, C29242c.m68869a(b, null)), 0, new C32878e(this), 1, null);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) mo69792a(R.id.arb);
            C52711k.m112236a((Object) fastScrollRecyclerView, "image_grid");
            if (fastScrollRecyclerView.getAdapter() == null) {
                Context requireContext = requireContext();
                C52711k.m112236a((Object) requireContext, "requireContext()");
                C32871a aVar = new C32871a(requireContext, 4, 1.0f, 0);
                aVar.f85482a = new C32875b(this);
                aVar.f85483b = new C32876c(this);
                this.f85489a = aVar;
                FastScrollRecyclerView fastScrollRecyclerView2 = (FastScrollRecyclerView) mo69792a(R.id.arb);
                C52711k.m112236a((Object) fastScrollRecyclerView2, "image_grid");
                C32871a aVar2 = this.f85489a;
                if (aVar2 == null) {
                    C52711k.m112237a("mMediaAdapter");
                }
                fastScrollRecyclerView2.setAdapter(aVar2);
            } else {
                FastScrollRecyclerView fastScrollRecyclerView3 = (FastScrollRecyclerView) mo69792a(R.id.arb);
                C52711k.m112236a((Object) fastScrollRecyclerView3, "image_grid");
                C1322a adapter = fastScrollRecyclerView3.getAdapter();
                if (adapter != null) {
                    this.f85489a = (C32871a) adapter;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.greenscreen.mediachoose.ChooseLibraryPhotoAdapter");
                }
            }
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(null, 4);
            wrapGridLayoutManager.f4526g = new C32877d(this, wrapGridLayoutManager);
            FastScrollRecyclerView fastScrollRecyclerView4 = (FastScrollRecyclerView) mo69792a(R.id.arb);
            C52711k.m112236a((Object) fastScrollRecyclerView4, "image_grid");
            fastScrollRecyclerView4.setLayoutManager(wrapGridLayoutManager);
            ((FastScrollRecyclerView) mo69792a(R.id.arb)).mo4798a((C1331h) new C23745a(4, (int) C9432q.m18687b(getContext(), 1.0f), false));
            ((FastScrollRecyclerView) mo69792a(R.id.arb)).setFastScrollEnabled(false);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo69792a(R.id.ard);
            C52711k.m112236a((Object) dmtLoadingLayout, "image_loading");
            dmtLoadingLayout.setVisibility(0);
            mo69793a();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b5d, viewGroup, false);
    }
}
