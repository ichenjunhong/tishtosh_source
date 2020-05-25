package com.p683ss.android.ugc.aweme.browserecord;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel;
import com.p683ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel.C24037a;
import com.p683ss.android.ugc.aweme.browserecord.model.C24042a;
import com.p683ss.android.ugc.aweme.browserecord.model.C24045d;
import com.p683ss.android.ugc.aweme.browserecord.p1464a.C23986a;
import com.p683ss.android.ugc.aweme.browserecord.p1464a.C23988b;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.aweme.unread.UnReadVideoViewModel;
import com.p683ss.android.ugc.aweme.unread.UnReadVideoViewModel.C47491a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.BottomSheetNestedLayout;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.browserecord.b */
public final class C23997b extends C0649f implements OnClickListener, C23452y<User>, C24045d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63706a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mRootLayout", "getMRootLayout()Lcom/ss/android/ugc/aweme/views/BottomSheetNestedLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mTitle", "getMTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mRecyclerView", "getMRecyclerView()Landroid/support/v7/widget/RecyclerView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mBack", "getMBack()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mInfo", "getMInfo()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/browserecord/model/BrowseRecordViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mParams", "getMParams()Lcom/ss/android/ugc/aweme/browserecord/BrowseRecordListDialogParams;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/browserecord/adapter/BrowseRecordAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23997b.class), "mUnreadVideoViewModel", "getMUnreadVideoViewModel()Lcom/ss/android/ugc/aweme/unread/UnReadVideoViewModel;"))};

    /* renamed from: b */
    public static final C23998a f63707b = new C23998a(null);

    /* renamed from: c */
    private final C52668f f63708c = C52732g.m112286a(C52757k.NONE, new C24007i(this));

    /* renamed from: d */
    private final C52668f f63709d = C52732g.m112286a(C52757k.NONE, new C24009k(this));

    /* renamed from: e */
    private final C52668f f63710e = C52732g.m112286a(C52757k.NONE, new C24006h(this));

    /* renamed from: f */
    private final C52668f f63711f = C52732g.m112286a(C52757k.NONE, new C24008j(this));

    /* renamed from: g */
    private final C52668f f63712g = C52732g.m112286a(C52757k.NONE, new C24003e(this));

    /* renamed from: h */
    private final C52668f f63713h = C52732g.m112286a(C52757k.NONE, new C24004f(this));

    /* renamed from: i */
    private final C52668f f63714i = C52732g.m112286a(C52757k.NONE, new C24011m(this));

    /* renamed from: j */
    private final C52668f f63715j = C52732g.m112286a(C52757k.NONE, new C24005g(this));

    /* renamed from: k */
    private final String f63716k = "video_play_list";

    /* renamed from: l */
    private final C52668f f63717l = C52732g.m112285a(new C24001d(this));

    /* renamed from: m */
    private boolean f63718m;

    /* renamed from: n */
    private boolean f63719n;

    /* renamed from: o */
    private final C52668f f63720o = C52732g.m112285a(new C24010l(this));

    /* renamed from: p */
    private HashMap f63721p;

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$a */
    public static final class C23998a {
        private C23998a() {
        }

        public /* synthetic */ C23998a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo49758a(C0654k kVar, C24016e eVar) {
            C52711k.m112240b(kVar, "fragmentManager");
            C52711k.m112240b(eVar, "params");
            Fragment a = kVar.mo2224a("BrowseRecordListDialogFragment");
            if (!(a instanceof C23997b)) {
                a = null;
            }
            C23997b bVar = (C23997b) a;
            if (bVar == null) {
                bVar = new C23997b();
                Bundle bundle = new Bundle();
                bundle.putSerializable("params", eVar);
                bVar.setArguments(bundle);
            }
            if (!bVar.isAdded()) {
                kVar.mo2225a().mo2178a((Fragment) bVar, "BrowseRecordListDialogFragment").mo2195c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$b */
    static final class C23999b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23997b f63722a;

        C23999b(C23997b bVar) {
            this.f63722a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f63722a.mo49749b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$c */
    static final class C24000c extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63723a;

        C24000c(C23997b bVar) {
            this.f63723a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f63723a.dismiss();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$d */
    static final class C24001d extends C52712l implements C52670a<C23986a> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63724a;

        /* renamed from: com.ss.android.ugc.aweme.browserecord.b$d$a */
        static final /* synthetic */ class C24002a extends C52710j implements C52670a<C52860x> {
            C24002a(C23997b bVar) {
                super(0, bVar);
            }

            public final String getName() {
                return "doLoadMore";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(C23997b.class);
            }

            public final String getSignature() {
                return "doLoadMore()V";
            }

            public final /* synthetic */ Object invoke() {
                ((C23997b) this.receiver).mo49752c();
                return C52860x.f131107a;
            }
        }

        C24001d(C23997b bVar) {
            this.f63724a = bVar;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            if (r1 == null) goto L_0x0012;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.browserecord.b r0 = r5.f63724a
                android.arch.lifecycle.k r0 = (android.arch.lifecycle.C0184k) r0
                com.ss.android.ugc.aweme.browserecord.b r1 = r5.f63724a
                com.ss.android.ugc.aweme.browserecord.e r1 = r1.mo49745a()
                if (r1 == 0) goto L_0x0012
                java.lang.String r1 = r1.getPreviousPage()
                if (r1 != 0) goto L_0x0014
            L_0x0012:
                java.lang.String r1 = ""
            L_0x0014:
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                com.ss.android.ugc.aweme.browserecord.b r3 = r5.f63724a
                com.ss.android.ugc.aweme.base.activity.y r3 = (com.p683ss.android.ugc.aweme.base.activity.C23452y) r3
                com.ss.android.ugc.aweme.browserecord.a.a r4 = new com.ss.android.ugc.aweme.browserecord.a.a
                r4.<init>(r0, r1, r2, r3)
                com.ss.android.ugc.aweme.browserecord.b$d$a r0 = new com.ss.android.ugc.aweme.browserecord.b$d$a
                com.ss.android.ugc.aweme.browserecord.b r1 = r5.f63724a
                r0.<init>(r1)
                d.f.a.a r0 = (p2628d.p2639f.p2640a.C52670a) r0
                com.ss.android.ugc.aweme.browserecord.d r1 = new com.ss.android.ugc.aweme.browserecord.d
                r1.<init>(r0)
                com.ss.android.ugc.aweme.common.a.j$a r1 = (com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a) r1
                r4.mo54788a(r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.C23997b.C24001d.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$e */
    static final class C24003e extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63725a;

        C24003e(C23997b bVar) {
            this.f63725a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f63725a.mo49744a((int) R.id.ij);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$f */
    static final class C24004f extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63726a;

        C24004f(C23997b bVar) {
            this.f63726a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f63726a.mo49744a((int) R.id.atp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$g */
    static final class C24005g extends C52712l implements C52670a<C24016e> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63727a;

        C24005g(C23997b bVar) {
            this.f63727a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Serializable serializable;
            Bundle arguments = this.f63727a.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("params");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C24016e)) {
                serializable = null;
            }
            return (C24016e) serializable;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$h */
    static final class C24006h extends C52712l implements C52670a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63728a;

        C24006h(C23997b bVar) {
            this.f63728a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecyclerView) this.f63728a.mo49744a((int) R.id.ca3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$i */
    static final class C24007i extends C52712l implements C52670a<BottomSheetNestedLayout> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63729a;

        C24007i(C23997b bVar) {
            this.f63729a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (BottomSheetNestedLayout) this.f63729a.mo49744a((int) R.id.b9e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$j */
    static final class C24008j extends C52712l implements C52670a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63730a;

        C24008j(C23997b bVar) {
            this.f63730a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtStatusView) this.f63730a.mo49744a((int) R.id.csv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$k */
    static final class C24009k extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63731a;

        C24009k(C23997b bVar) {
            this.f63731a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f63731a.mo49744a((int) R.id.title);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$l */
    static final class C24010l extends C52712l implements C52670a<UnReadVideoViewModel> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63732a;

        C24010l(C23997b bVar) {
            this.f63732a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C47491a.m102890a((Fragment) this.f63732a, "video_play_list");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$m */
    static final class C24011m extends C52712l implements C52670a<BrowseRecordViewModel> {

        /* renamed from: a */
        final /* synthetic */ C23997b f63733a;

        C24011m(C23997b bVar) {
            this.f63733a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f63733a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            return C24037a.m58865a(activity, this.f63733a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$n */
    static final class C24012n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23997b f63734a;

        /* renamed from: b */
        final /* synthetic */ List f63735b;

        /* renamed from: c */
        final /* synthetic */ boolean f63736c;

        C24012n(C23997b bVar, List list, boolean z) {
            this.f63734a = bVar;
            this.f63735b = list;
            this.f63736c = z;
        }

        public final void run() {
            this.f63734a.mo49751b(this.f63735b, this.f63736c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.b$o */
    static final class C24013o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23997b f63737a;

        C24013o(C23997b bVar) {
            this.f63737a = bVar;
        }

        public final void run() {
            Dialog dialog = this.f63737a.getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.a6n);
                }
            }
        }
    }

    /* renamed from: f */
    private final RecyclerView m58801f() {
        return (RecyclerView) this.f63710e.getValue();
    }

    /* renamed from: g */
    private final DmtStatusView m58802g() {
        return (DmtStatusView) this.f63711f.getValue();
    }

    /* renamed from: h */
    private final BrowseRecordViewModel m58803h() {
        return (BrowseRecordViewModel) this.f63714i.getValue();
    }

    /* renamed from: i */
    private final C23986a m58804i() {
        return (C23986a) this.f63717l.getValue();
    }

    /* renamed from: k */
    private final UnReadVideoViewModel m58806k() {
        return (UnReadVideoViewModel) this.f63720o.getValue();
    }

    /* renamed from: a */
    public final View mo49744a(int i) {
        if (this.f63721p == null) {
            this.f63721p = new HashMap();
        }
        View view = (View) this.f63721p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f63721p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final C24016e mo49745a() {
        return (C24016e) this.f63715j.getValue();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onUnReadVideoChanged(C47496d dVar) {
        if (dVar == null) {
        }
    }

    /* renamed from: d */
    public final void mo49754d() {
        m58802g().mo19212f();
    }

    /* renamed from: e */
    public final void mo49755e() {
        m58804i().am_();
    }

    /* renamed from: j */
    private final Context m58805j() {
        Context context = getContext();
        if (context == null) {
            return C11010c.m22280a();
        }
        return context;
    }

    /* renamed from: b */
    public final void mo49749b() {
        C24016e a = mo49745a();
        if (a != null) {
            String aid = a.getAid();
            if (aid != null) {
                m58803h().mo49793b(aid);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.postDelayed(new C24013o(this), 50);
        }
    }

    public final void onStop() {
        if (!this.f63719n) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(0);
                }
            }
        }
        super.onStop();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f63718m = false;
        C47718bf.m103291d(this);
        BrowseRecordViewModel h = m58803h();
        C24045d dVar = this;
        C52711k.m112240b(dVar, "view");
        h.f63801e.remove(dVar);
        if (this.f63721p != null) {
            this.f63721p.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f A[LOOP:1: B:19:0x0059->B:21:0x005f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49752c() {
        /*
            r17 = this;
            com.ss.android.ugc.aweme.browserecord.e r0 = r17.mo49745a()
            if (r0 == 0) goto L_0x0145
            java.lang.String r2 = r0.getAid()
            if (r2 == 0) goto L_0x0145
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel r1 = r17.m58803h()
            com.ss.android.ugc.aweme.browserecord.a.a r0 = r17.m58804i()
            java.util.List r0 = r0.mo50673a()
            java.lang.String r3 = "mAdapter.data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002e
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x004b
        L_0x002e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.browserecord.a.b r3 = (com.p683ss.android.ugc.aweme.browserecord.p1464a.C23988b) r3
            int r3 = r3.getType()
            if (r3 != r5) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            if (r3 == 0) goto L_0x0032
            r0 = 1
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            java.lang.String r3 = "aid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            java.util.List<com.ss.android.ugc.aweme.browserecord.model.d> r3 = r1.f63801e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0059:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0069
            java.lang.Object r6 = r3.next()
            com.ss.android.ugc.aweme.browserecord.model.d r6 = (com.p683ss.android.ugc.aweme.browserecord.model.C24045d) r6
            r6.mo49755e()
            goto L_0x0059
        L_0x0069:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.browserecord.model.b> r3 = r1.f63799c
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.browserecord.model.b r3 = (com.p683ss.android.ugc.aweme.browserecord.model.C24043b) r3
            if (r3 == 0) goto L_0x009d
            boolean r3 = r3.f63818e
            if (r3 != r5) goto L_0x009d
            r3 = 20
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.browserecord.model.b> r0 = r1.f63799c
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.browserecord.model.b r0 = (com.p683ss.android.ugc.aweme.browserecord.model.C24043b) r0
            r4 = 0
            if (r0 == 0) goto L_0x0088
            long r6 = r0.f63816c
            goto L_0x0089
        L_0x0088:
            r6 = r4
        L_0x0089:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.browserecord.model.b> r0 = r1.f63799c
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.browserecord.model.b r0 = (com.p683ss.android.ugc.aweme.browserecord.model.C24043b) r0
            if (r0 == 0) goto L_0x0095
            long r4 = r0.f63817d
        L_0x0095:
            r8 = r4
            r4 = r6
            r6 = r8
            r1.mo49792a(r2, r3, r4, r6)
            goto L_0x0145
        L_0x009d:
            if (r0 != 0) goto L_0x00ce
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r1.f63800d
            if (r0 != 0) goto L_0x00a4
            goto L_0x00ce
        L_0x00a4:
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r1.f63800d
            if (r0 == 0) goto L_0x00cd
            java.util.List<com.ss.android.ugc.aweme.browserecord.model.d> r1 = r1.f63801e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0145
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.browserecord.model.d r2 = (com.p683ss.android.ugc.aweme.browserecord.model.C24045d) r2
            java.util.List r3 = r0.getUserList()
            java.lang.String r4 = "userList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            boolean r4 = r0.hasMore()
            r2.mo49751b(r3, r4)
            goto L_0x00b0
        L_0x00cd:
            return
        L_0x00ce:
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r1.f63800d
            if (r0 == 0) goto L_0x00d7
            int r0 = r0.getCursor()
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            com.ss.android.ugc.aweme.friends.service.c r2 = com.p683ss.android.ugc.aweme.friends.service.C32616c.f84865a
            com.ss.android.ugc.aweme.friends.d.a r6 = r2.createRecommendListRepository()
            r2 = 20
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = ""
            r10 = 20
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r3 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            boolean r2 = r2.isUidContactPermisioned()
            if (r2 == 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r5 = 2
        L_0x0101:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            com.ss.android.ugc.aweme.newfollow.util.g r2 = com.p683ss.android.ugc.aweme.newfollow.util.C37940g.m84832a()
            java.lang.String r3 = "RecUserImpressionReporter.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r13 = r2.mo77416b()
            r14 = 0
            int r2 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r16 = 0
            c.a.v r2 = r6.mo65910a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            c.a.ac r3 = p064c.p065a.p093k.C2168a.m6521b()
            c.a.v r2 = r2.mo6529b(r3)
            c.a.ac r3 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            c.a.v r2 = r2.mo6514a(r3)
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$d r3 = new com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$d
            r3.<init>(r1, r0)
            c.a.d.e r3 = (p064c.p065a.p071d.C1710e) r3
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$e r0 = new com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$e
            r0.<init>(r1)
            c.a.d.e r0 = (p064c.p065a.p071d.C1710e) r0
            c.a.b.c r0 = r2.mo6505a(r3, r0)
            r1.f63802f = r0
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.C23997b.mo49752c():void");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f63719n = true;
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a6s);
    }

    /* renamed from: a */
    public final void mo49746a(Throwable th) {
        C52711k.m112240b(th, "throwable");
        m58802g().mo19214h();
    }

    /* renamed from: c */
    public final void mo49753c(Throwable th) {
        C52711k.m112240b(th, "throwable");
        m58804i().mo54787a(m58801f(), false);
    }

    /* renamed from: b */
    public final void mo49750b(Throwable th) {
        C52711k.m112240b(th, "throwable");
        m58804i().mo54787a(m58801f(), true);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.a6n);
                LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.dimAmount = 0.0f;
                }
                window.setLayout(-1, -1);
            }
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C32800a.m75679a(view)) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.ij) {
                dismiss();
                return;
            }
            if (num != null && num.intValue() == R.id.atp) {
                C10691a.m21548c(m58805j(), (int) R.string.hvy).mo19066a();
            }
        }
    }

    /* renamed from: a */
    public final void mo49748a(List<C24042a> list, boolean z) {
        C52711k.m112240b(list, "list");
        UnReadVideoViewModel k = m58806k();
        Iterable<C24042a> iterable = list;
        Collection arrayList = new ArrayList();
        for (C24042a user : iterable) {
            User user2 = user.getUser();
            if (user2 != null) {
                arrayList.add(user2);
            }
        }
        k.mo94779a((List) arrayList, false);
        C23986a i = m58804i();
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C24042a bVar : iterable) {
            C23988b bVar2 = new C23988b(0, bVar, null, 4, null);
            arrayList2.add(bVar2);
        }
        i.mo51189c((List) arrayList2);
        if (z) {
            m58804i().ao_();
        } else {
            m58804i().an_();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r8, (java.lang.Object) r9) == false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0037 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1 A[EDGE_INSN: B:54:0x00b1->B:30:0x00b1 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49751b(java.util.List<? extends com.p683ss.android.ugc.aweme.profile.model.User> r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "list"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            android.support.v7.widget.RecyclerView r0 = r11.m58801f()
            java.lang.String r1 = "mRecyclerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.mo4875i()
            if (r0 == 0) goto L_0x0023
            android.support.v7.widget.RecyclerView r0 = r11.m58801f()
            com.ss.android.ugc.aweme.browserecord.b$n r1 = new com.ss.android.ugc.aweme.browserecord.b$n
            r1.<init>(r11, r12, r13)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
            return
        L_0x0023:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r12 = r12.iterator()
        L_0x0037:
            boolean r2 = r12.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r2 = r12.next()
            r5 = r2
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.p683ss.android.ugc.aweme.profile.model.User) r5
            com.ss.android.ugc.aweme.browserecord.a.a r6 = r11.m58804i()
            java.util.List r6 = r6.mo50673a()
            java.lang.String r7 = "mAdapter.data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0062
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x00b0
        L_0x0062:
            java.util.Iterator r6 = r6.iterator()
        L_0x0066:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b0
            java.lang.Object r7 = r6.next()
            com.ss.android.ugc.aweme.browserecord.a.b r7 = (com.p683ss.android.ugc.aweme.browserecord.p1464a.C23988b) r7
            com.ss.android.ugc.aweme.browserecord.model.a r8 = r7.getMBrowseItem()
            if (r8 == 0) goto L_0x0092
            java.lang.String r8 = r5.getUid()
            com.ss.android.ugc.aweme.browserecord.model.a r9 = r7.getMBrowseItem()
            com.ss.android.ugc.aweme.profile.model.User r9 = r9.getUser()
            if (r9 == 0) goto L_0x008b
            java.lang.String r9 = r9.getUid()
            goto L_0x008c
        L_0x008b:
            r9 = 0
        L_0x008c:
            boolean r8 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r9)
            if (r8 != 0) goto L_0x00aa
        L_0x0092:
            com.ss.android.ugc.aweme.profile.model.User r8 = r7.getMRecommendUser()
            if (r8 == 0) goto L_0x00ac
            java.lang.String r8 = r5.getUid()
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getMRecommendUser()
            java.lang.String r7 = r7.getUid()
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r7)
            if (r7 == 0) goto L_0x00ac
        L_0x00aa:
            r7 = 1
            goto L_0x00ad
        L_0x00ac:
            r7 = 0
        L_0x00ad:
            if (r7 == 0) goto L_0x0066
            goto L_0x00b1
        L_0x00b0:
            r3 = 1
        L_0x00b1:
            if (r3 == 0) goto L_0x0037
            r1.add(r2)
            goto L_0x0037
        L_0x00b7:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r12 = r1.iterator()
        L_0x00bf:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r12.next()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            r8 = r1
            com.ss.android.ugc.aweme.profile.model.User r8 = (com.p683ss.android.ugc.aweme.profile.model.User) r8
            com.ss.android.ugc.aweme.browserecord.a.b r1 = new com.ss.android.ugc.aweme.browserecord.a.b
            r6 = 2
            r7 = 0
            r9 = 2
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r2.add(r1)
            goto L_0x00bf
        L_0x00dd:
            r12 = r0
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r4
            if (r12 == 0) goto L_0x0110
            com.ss.android.ugc.aweme.browserecord.a.a r12 = r11.m58804i()
            java.util.List r12 = r12.mo50673a()
            java.lang.String r1 = "mAdapter.data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)
            java.lang.Object r12 = p2628d.p2629a.C52575l.m112144h(r12)
            com.ss.android.ugc.aweme.browserecord.a.b r12 = (com.p683ss.android.ugc.aweme.browserecord.p1464a.C23988b) r12
            if (r12 == 0) goto L_0x0110
            int r12 = r12.getType()
            if (r12 != 0) goto L_0x0110
            com.ss.android.ugc.aweme.browserecord.a.b r12 = new com.ss.android.ugc.aweme.browserecord.a.b
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.add(r3, r12)
        L_0x0110:
            com.ss.android.ugc.aweme.browserecord.a.a r12 = r11.m58804i()
            r12.mo51189c(r0)
            if (r13 == 0) goto L_0x0121
            com.ss.android.ugc.aweme.browserecord.a.a r12 = r11.m58804i()
            r12.ao_()
            return
        L_0x0121:
            com.ss.android.ugc.aweme.browserecord.a.a r12 = r11.m58804i()
            r12.an_()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.C23997b.mo49751b(java.util.List, boolean):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f63718m = true;
        RecyclerView f = m58801f();
        f.setLayoutManager(new WrapLinearLayoutManager(f.getContext()));
        f.setAdapter(m58804i());
        DmtTextView dmtTextView = (DmtTextView) this.f63709d.getValue();
        C52711k.m112236a((Object) dmtTextView, "mTitle");
        String string = m58805j().getString(R.string.gxt);
        C52711k.m112236a((Object) string, "mContext.getString(R.string.player_views)");
        Object[] objArr = new Object[1];
        C24016e a = mo49745a();
        if (a != null) {
            j = a.getBrowseCount();
        } else {
            j = 0;
        }
        objArr[0] = C33095b.m76068a(j);
        String a2 = C2240a.m6772a(string, Arrays.copyOf(objArr, 1));
        C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
        dmtTextView.setText(a2);
        OnClickListener onClickListener = this;
        ((ImageView) this.f63712g.getValue()).setOnClickListener(onClickListener);
        ((ImageView) this.f63713h.getValue()).setOnClickListener(onClickListener);
        ((BottomSheetNestedLayout) this.f63708c.getValue()).setShowStateChangedListener(new C24000c(this));
        Context context = getContext();
        if (context == null) {
            context = C11010c.m22280a();
        }
        C52711k.m112236a((Object) context, "context ?: AppContextMan…r.getApplicationContext()");
        DmtTextView dmtTextView2 = new DmtTextView(new ContextThemeWrapper(context, R.style.tf));
        int c = C0726c.m2098c(context, R.color.b13);
        dmtTextView2.setText(R.string.axx);
        dmtTextView2.setTextColor(c);
        DmtTextView dmtTextView3 = new DmtTextView(new ContextThemeWrapper(context, R.style.tf));
        dmtTextView3.setOnClickListener(new C23999b(this));
        dmtTextView3.setText(R.string.c0c);
        dmtTextView3.setTextColor(c);
        m58802g().setBuilder(C10719a.m21676a(context).mo19233c(0).mo19234c((View) dmtTextView3).mo19231b((View) dmtTextView2));
        mo49749b();
        C47718bf.m103290c(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b8q, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (r3 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0097, code lost:
        if (r2 == null) goto L_0x0099;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m58800a(com.p683ss.android.ugc.aweme.profile.model.User r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "follow_card"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "find_friends"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            java.lang.String r1 = r5.getUid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)
            com.ss.android.ugc.aweme.app.f.c r1 = new com.ss.android.ugc.aweme.app.f.c
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r4.f63716k
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            java.lang.String r2 = "event_type"
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r7)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.browserecord.e r3 = r4.mo49745a()
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.getPreviousPage()
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r3 = ""
        L_0x003b:
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            java.lang.String r2 = "rec_uid"
            java.lang.String r3 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            java.lang.String r2 = "impr_order"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47822a(r2, r3)
            java.lang.String r2 = "req_id"
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel r3 = r4.m58803h()
            java.lang.String r3 = r3.mo49790a()
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            java.lang.String r2 = "rec_reason"
            java.lang.String r3 = r5.getRecommendReason()
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            org.json.JSONObject r1 = r1.mo47825b()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)
            java.lang.String r0 = "follow_card"
            com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r4.f63716k
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "event_type"
            com.ss.android.ugc.aweme.app.f.d r7 = r1.mo47829a(r2, r7)
            java.lang.String r1 = "previous_page"
            com.ss.android.ugc.aweme.browserecord.e r2 = r4.mo49745a()
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = r2.getPreviousPage()
            if (r2 != 0) goto L_0x009b
        L_0x0099:
            java.lang.String r2 = ""
        L_0x009b:
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r1, r2)
            java.lang.String r1 = "rec_uid"
            java.lang.String r2 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r1, r2)
            java.lang.String r1 = "impr_order"
            com.ss.android.ugc.aweme.app.f.d r6 = r7.mo47826a(r1, r6)
            java.lang.String r7 = "req_id"
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel r1 = r4.m58803h()
            java.lang.String r1 = r1.mo49790a()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r1)
            java.lang.String r7 = "rec_reason"
            java.lang.String r5 = r5.getRecommendReason()
            com.ss.android.ugc.aweme.app.f.d r5 = r6.mo47829a(r7, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.C23997b.m58800a(com.ss.android.ugc.aweme.profile.model.User, int, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo49747a(List<C24042a> list, long j, boolean z, boolean z2) {
        C52711k.m112240b(list, "list");
        m58802g().mo19209d();
        UnReadVideoViewModel k = m58806k();
        Iterable<C24042a> iterable = list;
        Collection arrayList = new ArrayList();
        for (C24042a user : iterable) {
            User user2 = user.getUser();
            if (user2 != null) {
                arrayList.add(user2);
            }
        }
        k.mo94779a((List) arrayList, false);
        if (list.isEmpty()) {
            m58802g().mo19213g();
            return;
        }
        C23986a i = m58804i();
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C24042a bVar : iterable) {
            C23988b bVar2 = new C23988b(0, bVar, null, 4, null);
            arrayList2.add(bVar2);
        }
        i.mo50303a((List) arrayList2);
        if (z) {
            m58804i().mo54798c(true);
            m58804i().ao_();
            return;
        }
        m58804i().mo54798c(false);
        m58804i().an_();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0149, code lost:
        if (r11 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0199, code lost:
        if (r11 == null) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0293, code lost:
        if (r11 == null) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f6, code lost:
        if (r11 == null) goto L_0x02f8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo48614a(int r7, java.lang.Object r8, int r9, android.view.View r10, java.lang.String r11) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.profile.model.User r8 = (com.p683ss.android.ugc.aweme.profile.model.User) r8
            if (r8 == 0) goto L_0x0318
            r10 = 2132546921(0x7f1c1569, float:2.0747074E38)
            r11 = 0
            r0 = 1
            switch(r7) {
                case 100: goto L_0x01c3;
                case 101: goto L_0x010f;
                case 102: goto L_0x0014;
                case 103: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0318
        L_0x000e:
            java.lang.String r7 = "impression"
            r6.m58800a(r8, r9, r7)
            return
        L_0x0014:
            boolean r7 = r6.f63718m
            if (r7 == 0) goto L_0x0318
            android.content.Context r7 = r6.getContext()
            boolean r7 = com.p683ss.android.ugc.aweme.browserecord.C24014c.m58821a(r7)
            if (r7 != 0) goto L_0x002e
            android.content.Context r7 = r6.getContext()
            com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r7, r10)
            r7.mo19066a()
            return
        L_0x002e:
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel r7 = r6.m58803h()
            java.lang.String r10 = "user"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r10)
            com.ss.android.ugc.aweme.friends.model.RecommendList r7 = r7.f63800d
            r10 = -1
            if (r7 == 0) goto L_0x0077
            java.util.List r7 = r7.getUserList()
            if (r7 == 0) goto L_0x0077
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
        L_0x0047:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x006a
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p683ss.android.ugc.aweme.profile.model.User) r3
            java.lang.String r4 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getUid()
            java.lang.String r4 = r8.getUid()
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r3 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r2 = r2 + 1
            goto L_0x0047
        L_0x006a:
            r2 = -1
        L_0x006b:
            int r1 = r7.size()
            if (r2 >= 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            if (r1 <= r2) goto L_0x0077
            r7.remove(r2)
        L_0x0077:
            com.ss.android.ugc.aweme.browserecord.a.a r7 = r6.m58804i()
            java.lang.String r1 = "user"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r1)
            java.util.List r1 = r7.f70670n
            java.lang.String r2 = "mItems"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x008c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ba
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.browserecord.a.b r3 = (com.p683ss.android.ugc.aweme.browserecord.p1464a.C23988b) r3
            com.ss.android.ugc.aweme.profile.model.User r4 = r3.getMRecommendUser()
            if (r4 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getMRecommendUser()
            java.lang.String r3 = r3.getUid()
            java.lang.String r4 = r8.getUid()
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r3 == 0) goto L_0x00b2
            r3 = 1
            goto L_0x00b3
        L_0x00b2:
            r3 = 0
        L_0x00b3:
            if (r3 == 0) goto L_0x00b7
            r10 = r2
            goto L_0x00ba
        L_0x00b7:
            int r2 = r2 + 1
            goto L_0x008c
        L_0x00ba:
            java.util.List r11 = r7.f70670n
            int r11 = r11.size()
            if (r10 < 0) goto L_0x00e4
            if (r10 < r11) goto L_0x00c5
            goto L_0x00e4
        L_0x00c5:
            java.util.List r1 = r7.f70670n
            r1.remove(r10)
            int r1 = r10 + -1
            if (r1 <= 0) goto L_0x00e1
            int r11 = r11 - r0
            if (r10 != r11) goto L_0x00e1
            int r11 = r7.mo48641a(r1)
            if (r11 != r0) goto L_0x00e1
            java.util.List r10 = r7.f70670n
            r10.remove(r1)
            r10 = 2
            r7.notifyItemRangeRemoved(r1, r10)
            goto L_0x00e4
        L_0x00e1:
            r7.notifyItemRemoved(r10)
        L_0x00e4:
            android.content.Context r7 = r6.getContext()
            r10 = 2132542438(0x7f1c03e6, float:2.073798E38)
            com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r7, r10)
            r7.mo19066a()
            boolean r7 = r8 instanceof com.p683ss.android.ugc.aweme.friends.model.RecommendContact
            if (r7 != 0) goto L_0x0318
            com.ss.android.ugc.aweme.friends.service.c r7 = com.p683ss.android.ugc.aweme.friends.service.C32616c.f84865a
            java.lang.String r10 = r8.getUid()
            java.lang.String r11 = "user.uid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            java.lang.String r11 = r8.getSecUid()
            r7.dislikeRecommendUser(r10, r11)
            java.lang.String r7 = "delete"
            r6.m58800a(r8, r9, r7)
            goto L_0x0318
        L_0x010f:
            android.support.v4.app.FragmentActivity r7 = r6.getActivity()
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r10 = "aweme://user/profile/"
            com.bytedance.router.SmartRoute r7 = com.bytedance.router.SmartRouter.buildRoute(r7, r10)
            java.lang.String r10 = "uid"
            java.lang.String r11 = r8.getUid()
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r11)
            java.lang.String r10 = "sec_user_id"
            java.lang.String r11 = r8.getSecUid()
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r11)
            java.lang.String r10 = "from_recommend_card"
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r0)
            java.lang.String r10 = "enter_from"
            java.lang.String r11 = r6.f63716k
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r11)
            java.lang.String r10 = "extra_previous_page_position"
            com.ss.android.ugc.aweme.browserecord.e r11 = r6.mo49745a()
            if (r11 == 0) goto L_0x014b
            java.lang.String r11 = r11.getPreviousPage()
            if (r11 != 0) goto L_0x014d
        L_0x014b:
            java.lang.String r11 = ""
        L_0x014d:
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r11)
            java.lang.String r10 = "need_track_compare_recommend_reason"
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r0)
            java.lang.String r10 = "previous_recommend_reason"
            java.lang.String r11 = r8.getRecommendReason()
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r11)
            java.lang.String r10 = "recommend_from_type"
            java.lang.String r11 = "list"
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r11)
            java.lang.String r10 = "enter_from_request"
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel r11 = r6.m58803h()
            java.lang.String r11 = r11.mo49790a()
            com.bytedance.router.SmartRoute r7 = r7.withParam(r10, r11)
            r7.open()
            java.lang.String r7 = "enter_profile"
            r6.m58800a(r8, r9, r7)
            java.lang.String r7 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.f.d r9 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r10 = "enter_from"
            java.lang.String r11 = r6.f63716k
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "previous_page"
            com.ss.android.ugc.aweme.browserecord.e r11 = r6.mo49745a()
            if (r11 == 0) goto L_0x019b
            java.lang.String r11 = r11.getPreviousPage()
            if (r11 != 0) goto L_0x019d
        L_0x019b:
            java.lang.String r11 = ""
        L_0x019d:
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "to_user_id"
            java.lang.String r11 = r8.getUid()
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "rec_uid"
            java.lang.String r8 = r8.getUid()
            com.ss.android.ugc.aweme.app.f.d r8 = r9.mo47829a(r10, r8)
            java.lang.String r9 = "enter_method"
            java.lang.String r10 = "click_head"
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r9, r10)
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r8)
            return
        L_0x01c3:
            boolean r7 = r6.f63718m
            if (r7 == 0) goto L_0x0317
            android.content.Context r7 = r6.getContext()
            boolean r7 = com.p683ss.android.ugc.aweme.browserecord.C24014c.m58821a(r7)
            if (r7 != 0) goto L_0x01de
            android.content.Context r7 = r6.getContext()
            com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r7, r10)
            r7.mo19066a()
            goto L_0x0318
        L_0x01de:
            int r7 = r8.getFollowStatus()
            if (r7 == 0) goto L_0x01e5
            r11 = 1
        L_0x01e5:
            r7 = r11 ^ 1
            com.ss.android.ugc.aweme.browserecord.a.a r10 = r6.m58804i()
            int r11 = r8.getFollowStatus()
            java.lang.String r1 = "user"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r1)
            java.util.List r1 = r10.f70670n
            java.lang.String r2 = "mItems"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            d.j.c r1 = p2628d.p2629a.C52575l.m112095a(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0207:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x023d
            r2 = r1
            d.a.aa r2 = (p2628d.p2629a.C52549aa) r2
            int r2 = r2.mo110114a()
            java.util.List r3 = r10.f70670n
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.browserecord.a.b r3 = (com.p683ss.android.ugc.aweme.browserecord.p1464a.C23988b) r3
            if (r3 == 0) goto L_0x0207
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getMRecommendUser()
            if (r3 == 0) goto L_0x0207
            java.lang.String r4 = r3.getUid()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = r8.getUid()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x0207
            r3.setFollowStatus(r11)
            r10.notifyItemChanged(r2)
            goto L_0x0207
        L_0x023d:
            if (r7 != r0) goto L_0x02bd
            java.lang.String r7 = "follow"
            r6.m58800a(r8, r9, r7)
            java.lang.String r7 = "follow"
            com.ss.android.ugc.aweme.app.f.d r10 = new com.ss.android.ugc.aweme.app.f.d
            r10.<init>()
            java.lang.String r11 = "enter_from"
            java.lang.String r0 = r6.f63716k
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r0)
            java.lang.String r11 = "rec_uid"
            java.lang.String r0 = r8.getUid()
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r0)
            java.lang.String r11 = "impr_order"
            com.ss.android.ugc.aweme.app.f.d r9 = r10.mo47826a(r11, r9)
            java.lang.String r10 = "req_id"
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel r11 = r6.m58803h()
            java.lang.String r11 = r11.mo49790a()
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r11 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel r0 = r6.m58803h()
            java.lang.String r0 = r0.mo49790a()
            java.lang.String r11 = r11.mo60161a(r0)
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "previous_page"
            com.ss.android.ugc.aweme.browserecord.e r11 = r6.mo49745a()
            if (r11 == 0) goto L_0x0295
            java.lang.String r11 = r11.getPreviousPage()
            if (r11 != 0) goto L_0x0297
        L_0x0295:
            java.lang.String r11 = ""
        L_0x0297:
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "rec_reason"
            java.lang.String r11 = r8.getRecommendReason()
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "to_user_id"
            java.lang.String r8 = r8.getUid()
            com.ss.android.ugc.aweme.app.f.d r8 = r9.mo47829a(r10, r8)
            java.lang.String r9 = "enter_method"
            java.lang.String r10 = "follow_button"
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r9, r10)
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r8)
            goto L_0x0318
        L_0x02bd:
            java.lang.String r7 = "follow_cancel"
            com.ss.android.ugc.aweme.app.f.d r10 = new com.ss.android.ugc.aweme.app.f.d
            r10.<init>()
            java.lang.String r11 = "enter_from"
            java.lang.String r0 = r6.f63716k
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r0)
            java.lang.String r11 = "rec_uid"
            java.lang.String r0 = r8.getUid()
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r0)
            java.lang.String r11 = "impr_order"
            com.ss.android.ugc.aweme.app.f.d r9 = r10.mo47826a(r11, r9)
            java.lang.String r10 = "req_id"
            com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel r11 = r6.m58803h()
            java.lang.String r11 = r11.mo49790a()
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "previous_page"
            com.ss.android.ugc.aweme.browserecord.e r11 = r6.mo49745a()
            if (r11 == 0) goto L_0x02f8
            java.lang.String r11 = r11.getPreviousPage()
            if (r11 != 0) goto L_0x02fa
        L_0x02f8:
            java.lang.String r11 = ""
        L_0x02fa:
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "rec_reason"
            java.lang.String r11 = r8.getRecommendReason()
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "to_user_id"
            java.lang.String r8 = r8.getUid()
            com.ss.android.ugc.aweme.app.f.d r8 = r9.mo47829a(r10, r8)
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r8)
        L_0x0317:
            return
        L_0x0318:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.C23997b.mo48614a(int, java.lang.Object, int, android.view.View, java.lang.String):void");
    }
}
