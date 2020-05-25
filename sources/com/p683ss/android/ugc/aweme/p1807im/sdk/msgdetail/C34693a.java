package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.C1425al;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.C33994c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1870a.C34700a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1870a.C34700a.C34703b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1872c.C34711a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.C34743a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.C34744b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.C34745c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34734a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34737d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34738e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34739f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34742i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.C35353a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.IViewInfo;
import com.p683ss.ttm.player.MediaPlayer;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a */
public final class C34693a extends C23526a implements C34703b, C34745c, C35353a {

    /* renamed from: e */
    public static final C34694a f89376e = new C34694a(null);

    /* renamed from: a */
    public RecyclerView f89377a;

    /* renamed from: b */
    public DragView f89378b;

    /* renamed from: c */
    public C34700a f89379c;

    /* renamed from: d */
    C34707b f89380d;

    /* renamed from: j */
    private MediaBrowserViewModel f89381j;

    /* renamed from: k */
    private C34710a<BaseContent> f89382k;

    /* renamed from: l */
    private boolean f89383l;

    /* renamed from: m */
    private final C34699f f89384m = new C34699f(this);

    /* renamed from: n */
    private HashMap f89385n;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a$a */
    public static final class C34694a {
        private C34694a() {
        }

        public /* synthetic */ C34694a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a$b */
    static final class C34695b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34693a f89386a;

        /* renamed from: b */
        final /* synthetic */ C11207p f89387b;

        C34695b(C34693a aVar, C11207p pVar) {
            this.f89386a = aVar;
            this.f89387b = pVar;
        }

        public final void run() {
            List a = C34693a.m78680a(this.f89386a).mo72760a();
            int size = a.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((C34710a) a.get(i)).f89411b.getIndex() == this.f89387b.getIndex() && ((C34710a) a.get(i)).f89411b.getMsgType() == this.f89387b.getMsgType()) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                RecyclerView recyclerView = this.f89386a.f89377a;
                if (recyclerView == null) {
                    C52711k.m112237a("recyclerView");
                }
                recyclerView.mo4814b(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a$c */
    static final class C34696c extends C52712l implements C52682m<List<C34710a<BaseContent>>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34693a f89388a;

        C34696c(C34693a aVar) {
            this.f89388a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Integer num;
            boolean z;
            List list = (List) obj;
            ((Boolean) obj2).booleanValue();
            StringBuilder sb = new StringBuilder("refresh onSuccess: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            sb.append(num);
            C34700a a = C34693a.m78680a(this.f89388a);
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a.mo72760a().clear();
                a.mo72760a().addAll(collection);
                a.notifyDataSetChanged();
            }
            a.f89394b = true;
            C34693a aVar = this.f89388a;
            C34707b bVar = aVar.f89380d;
            if (bVar == null) {
                C52711k.m112237a("param");
            }
            C11207p pVar = bVar.f89406b;
            if (pVar != null) {
                RecyclerView recyclerView = aVar.f89377a;
                if (recyclerView == null) {
                    C52711k.m112237a("recyclerView");
                }
                recyclerView.post(new C34695b(aVar, pVar));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a$d */
    static final class C34697d extends C52712l implements C52682m<List<C34710a<BaseContent>>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34693a f89389a;

        C34697d(C34693a aVar) {
            this.f89389a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Integer num;
            boolean z;
            List list = (List) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            StringBuilder sb = new StringBuilder("loadLatest onSuccess: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            sb.append(num);
            C34700a a = C34693a.m78680a(this.f89389a);
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int size = list.size() - a.mo72760a().size();
                a.mo72760a().clear();
                a.mo72760a().addAll(collection);
                if (size > 0) {
                    a.notifyItemRangeInserted(0, size);
                } else {
                    a.notifyDataSetChanged();
                }
            }
            a.f89394b = booleanValue;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a$e */
    static final class C34698e extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34693a f89390a;

        C34698e(C34693a aVar) {
            this.f89390a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C34693a.m78680a(this.f89390a).f89394b = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a$f */
    public static final class C34699f extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C34693a f89391a;

        C34699f(C34693a aVar) {
            this.f89391a = aVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C34693a.m78682b(this.f89391a).setCanDrag(true);
                this.f89391a.mo72756i();
                return;
            }
            if (i == 1) {
                C34693a.m78682b(this.f89391a).setCanDrag(false);
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (i > 0) {
                C34693a.m78682b(this.f89391a).setCanDrag(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo71091a() {
        m78681a(1);
    }

    /* renamed from: b */
    public final void mo71093b() {
        m78681a(4);
    }

    /* renamed from: c */
    public final void mo71094c() {
        this.f89383l = false;
        m78681a(0);
    }

    /* renamed from: d */
    public final void mo71095d() {
        this.f89383l = true;
        m78681a(2);
    }

    /* renamed from: e */
    public final void mo71096e() {
        this.f89383l = true;
        m78681a(3);
    }

    /* renamed from: f */
    public final void mo71097f() {
        m78681a(6);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f89385n != null) {
            this.f89385n.clear();
        }
    }

    /* renamed from: j */
    public final void mo72757j() {
        MediaBrowserViewModel mediaBrowserViewModel = this.f89381j;
        if (mediaBrowserViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        if (!mediaBrowserViewModel.mo71929i()) {
            MediaBrowserViewModel mediaBrowserViewModel2 = this.f89381j;
            if (mediaBrowserViewModel2 == null) {
                C52711k.m112237a("viewModel");
            }
            mediaBrowserViewModel2.mo72802e();
        }
    }

    /* renamed from: k */
    public final void mo72758k() {
        if (!this.f89383l) {
            DragView dragView = this.f89378b;
            if (dragView == null) {
                C52711k.m112237a("dragView");
            }
            dragView.mo73534a();
        }
    }

    public final void onDestroy() {
        MediaBrowserViewModel mediaBrowserViewModel = this.f89381j;
        if (mediaBrowserViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        mediaBrowserViewModel.mo72801a((C52671b<? super C34744b, C52860x>) C34737d.INSTANCE);
        super.onDestroy();
    }

    public final void onPause() {
        MediaBrowserViewModel mediaBrowserViewModel = this.f89381j;
        if (mediaBrowserViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        mediaBrowserViewModel.mo72801a((C52671b<? super C34744b, C52860x>) C34738e.INSTANCE);
        super.onPause();
    }

    /* renamed from: g */
    public final boolean mo71098g() {
        C34700a aVar = this.f89379c;
        if (aVar == null) {
            C52711k.m112237a("adapter");
        }
        if (aVar.mo72761b().isEmpty()) {
            return false;
        }
        return ((C34711a) aVar.mo72761b().get(0)).mo72774d();
    }

    /* renamed from: h */
    public final boolean mo71099h() {
        C34700a aVar = this.f89379c;
        if (aVar == null) {
            C52711k.m112237a("adapter");
        }
        if (aVar.mo72761b().isEmpty()) {
            return false;
        }
        return ((C34711a) aVar.mo72761b().get(0)).mo72775e();
    }

    /* renamed from: l */
    private final IViewInfo m78683l() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WindowManager windowManager = activity.getWindowManager();
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
        }
        float f = (((float) displayMetrics.heightPixels) * 1.0f) / ((float) displayMetrics.widthPixels);
        int i = (int) (400.0f * f);
        IViewInfo iViewInfo = new IViewInfo(Math.max((displayMetrics.widthPixels - 400) / 2, 0), Math.max((displayMetrics.heightPixels - i) / 2, 0), i, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 20.0f, f);
        return iViewInfo;
    }

    /* renamed from: i */
    public final void mo72756i() {
        C34710a<BaseContent> aVar;
        C34700a aVar2 = this.f89379c;
        if (aVar2 == null) {
            C52711k.m112237a("adapter");
        }
        IViewInfo iViewInfo = null;
        if (aVar2.mo72761b().isEmpty()) {
            aVar = null;
        } else {
            Object obj = aVar2.mo72761b().get(0);
            C52711k.m112236a(obj, "attachedViewHolders[0]");
            aVar = ((C34711a) obj).f89418e;
        }
        if (aVar != this.f89382k) {
            this.f89382k = aVar;
            if (aVar != null) {
                C11207p pVar = aVar.f89411b;
                if (pVar != null) {
                    long index = pVar.getIndex();
                    C34707b bVar = this.f89380d;
                    if (bVar == null) {
                        C52711k.m112237a("param");
                    }
                    ArrayList<DragViewInfo> arrayList = bVar.f89408d;
                    if (arrayList != null) {
                        for (DragViewInfo dragViewInfo : arrayList) {
                            if (index == dragViewInfo.f89367a && dragViewInfo.f89368b != null) {
                                iViewInfo = dragViewInfo.f89368b;
                                if (iViewInfo == null) {
                                    C52711k.m112234a();
                                }
                            }
                        }
                    }
                    if (iViewInfo == null) {
                        iViewInfo = m78683l();
                    }
                    if (iViewInfo != null) {
                        DragView dragView = this.f89378b;
                        if (dragView == null) {
                            C52711k.m112237a("dragView");
                        }
                        dragView.mo73537a(iViewInfo);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C34700a m78680a(C34693a aVar) {
        C34700a aVar2 = aVar.f89379c;
        if (aVar2 == null) {
            C52711k.m112237a("adapter");
        }
        return aVar2;
    }

    /* renamed from: b */
    public static final /* synthetic */ DragView m78682b(C34693a aVar) {
        DragView dragView = aVar.f89378b;
        if (dragView == null) {
            C52711k.m112237a("dragView");
        }
        return dragView;
    }

    /* renamed from: a */
    public final void mo71092a(ValueAnimator valueAnimator) {
        m78681a(5);
    }

    /* renamed from: a */
    private final void m78681a(int i) {
        DragView dragView = this.f89378b;
        if (dragView == null) {
            C52711k.m112237a("dragView");
        }
        int fullWidth = dragView.getFullWidth();
        DragView dragView2 = this.f89378b;
        if (dragView2 == null) {
            C52711k.m112237a("dragView");
        }
        C34743a aVar = new C34743a(i, fullWidth, dragView2.getFullHeight());
        MediaBrowserViewModel mediaBrowserViewModel = this.f89381j;
        if (mediaBrowserViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        C52711k.m112240b(aVar, "state");
        mediaBrowserViewModel.mo72801a((C52671b<? super C34744b, C52860x>) new C34742i<Object,C52860x>(aVar));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f89380d = new C34707b().mo72763b(getArguments());
        IViewInfo l = m78683l();
        C34707b bVar = this.f89380d;
        if (bVar == null) {
            C52711k.m112237a("param");
        }
        ArrayList<DragViewInfo> arrayList = bVar.f89408d;
        if (arrayList != null) {
            for (DragViewInfo dragViewInfo : arrayList) {
                IViewInfo iViewInfo = dragViewInfo.f89368b;
                if (iViewInfo != null) {
                    iViewInfo.f90786d = (int) (l.f90788f * ((float) iViewInfo.f90785c));
                }
            }
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "activity!!");
        this.f89381j = C34734a.m78773a(activity);
        MediaBrowserViewModel mediaBrowserViewModel = this.f89381j;
        if (mediaBrowserViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        C34707b bVar2 = this.f89380d;
        if (bVar2 == null) {
            C52711k.m112237a("param");
        }
        mediaBrowserViewModel.mo72800a(bVar2, m78683l());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        MediaBrowserViewModel mediaBrowserViewModel = this.f89381j;
        if (mediaBrowserViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        C0184k kVar = this;
        ListViewModel.m77692a(mediaBrowserViewModel, kVar, C33994c.m77708a(null, new C34696c(this), null, 5, null), null, C33994c.m77708a(null, new C34697d(this), new C34698e(this), 1, null), 4, null);
        View findViewById = view.findViewById(R.id.a8o);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.dragView)");
        this.f89378b = (DragView) findViewById;
        LayoutInflater from = LayoutInflater.from(getContext());
        DragView dragView = this.f89378b;
        if (dragView == null) {
            C52711k.m112237a("dragView");
        }
        View inflate = from.inflate(R.layout.bcx, dragView, false);
        View findViewById2 = inflate.findViewById(R.id.ca3);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.recyclerView)");
        this.f89377a = (RecyclerView) findViewById2;
        IViewInfo l = m78683l();
        C34707b bVar = this.f89380d;
        if (bVar == null) {
            C52711k.m112237a("param");
        }
        ArrayList<DragViewInfo> arrayList = bVar.f89408d;
        if (arrayList != null) {
            for (DragViewInfo dragViewInfo : arrayList) {
                C34707b bVar2 = this.f89380d;
                if (bVar2 == null) {
                    C52711k.m112237a("param");
                }
                C11207p pVar = bVar2.f89406b;
                if (pVar != null) {
                    j = pVar.getIndex();
                } else {
                    j = -1;
                }
                if (dragViewInfo.f89367a == j && dragViewInfo.f89368b != null) {
                    l = dragViewInfo.f89368b;
                    if (l == null) {
                        C52711k.m112234a();
                    }
                }
            }
        }
        DragView dragView2 = this.f89378b;
        if (dragView2 == null) {
            C52711k.m112237a("dragView");
        }
        RecyclerView recyclerView = this.f89377a;
        if (recyclerView == null) {
            C52711k.m112237a("recyclerView");
        }
        dragView2.mo73536a(inflate, recyclerView, l);
        DragView dragView3 = this.f89378b;
        if (dragView3 == null) {
            C52711k.m112237a("dragView");
        }
        dragView3.setFullScreenWindow(true);
        DragView dragView4 = this.f89378b;
        if (dragView4 == null) {
            C52711k.m112237a("dragView");
        }
        dragView4.setDragStateListener(this);
        C34703b bVar3 = this;
        RecyclerView recyclerView2 = this.f89377a;
        if (recyclerView2 == null) {
            C52711k.m112237a("recyclerView");
        }
        this.f89379c = new C34700a(bVar3, recyclerView2);
        RecyclerView recyclerView3 = this.f89377a;
        if (recyclerView3 == null) {
            C52711k.m112237a("recyclerView");
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView4 = this.f89377a;
        if (recyclerView4 == null) {
            C52711k.m112237a("recyclerView");
        }
        C34700a aVar = this.f89379c;
        if (aVar == null) {
            C52711k.m112237a("adapter");
        }
        recyclerView4.setAdapter(aVar);
        RecyclerView recyclerView5 = this.f89377a;
        if (recyclerView5 == null) {
            C52711k.m112237a("recyclerView");
        }
        recyclerView5.setItemViewCacheSize(2);
        RecyclerView recyclerView6 = this.f89377a;
        if (recyclerView6 == null) {
            C52711k.m112237a("recyclerView");
        }
        recyclerView6.mo4801a((C1340m) this.f89384m);
        C1425al alVar = new C1425al();
        RecyclerView recyclerView7 = this.f89377a;
        if (recyclerView7 == null) {
            C52711k.m112237a("recyclerView");
        }
        alVar.mo5634a(recyclerView7);
        MediaBrowserViewModel mediaBrowserViewModel2 = this.f89381j;
        if (mediaBrowserViewModel2 == null) {
            C52711k.m112237a("viewModel");
        }
        C34745c cVar = this;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(cVar, "server");
        mediaBrowserViewModel2.mo72803f().observe(kVar, new C34739f(cVar));
        MediaBrowserViewModel mediaBrowserViewModel3 = this.f89381j;
        if (mediaBrowserViewModel3 == null) {
            C52711k.m112237a("viewModel");
        }
        mediaBrowserViewModel3.mo72799a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bco, viewGroup, false);
    }
}
