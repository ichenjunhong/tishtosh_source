package com.p683ss.android.ugc.aweme.miniapp.appgroup;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p2615tt.appbrandimpl.MicroAppApi;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27788aa;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30463p;
import com.p683ss.android.ugc.aweme.miniapp.appgroup.C36853d.C36854a;
import com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.C36857a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36967f;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity */
public final class MicroAppGroupActivity extends AmeSSActivity implements C26877c<C36966e>, C30462o, C36854a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f94152a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MicroAppGroupActivity.class), "mListAdapter", "getMListAdapter()Lcom/ss/android/ugc/aweme/miniapp/appgroup/CollectionMicroAppAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MicroAppGroupActivity.class), "mLoadMoreAdapter", "getMLoadMoreAdapter()Lcom/ss/android/ugc/aweme/discover/adapter/LoadMoreAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MicroAppGroupActivity.class), "mListPresenter", "getMListPresenter()Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;"))};

    /* renamed from: b */
    public final int f94153b = 10;

    /* renamed from: c */
    private final int f94154c = 4;

    /* renamed from: d */
    private final C52668f f94155d = C52732g.m112285a(new C36839f(this));

    /* renamed from: e */
    private final C52668f f94156e = C52732g.m112285a(new C36841h(this));

    /* renamed from: f */
    private final C52668f f94157f = C52732g.m112285a(new C36840g(this));

    /* renamed from: g */
    private HashMap f94158g;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$a */
    static final class C36834a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f94159a;

        C36834a(MicroAppGroupActivity microAppGroupActivity) {
            this.f94159a = microAppGroupActivity;
        }

        public final /* synthetic */ Object call() {
            return MicroAppApi.m111318a(0, this.f94159a.f94153b, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$b */
    public static final class C36835b implements C0011g<C36967f, Void> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f94160a;

        /* renamed from: b */
        final /* synthetic */ boolean f94161b;

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b5, code lost:
            if (r4 == null) goto L_0x00ba;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r12) {
            /*
                r11 = this;
                boolean r0 = r11.f94161b
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0017
                com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity r0 = r11.f94160a
                com.ss.android.ugc.aweme.common.f.b r0 = r0.mo76050c()
                java.lang.Object[] r3 = new java.lang.Object[r1]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                r3[r2] = r4
                r0.mo44934a_(r3)
            L_0x0017:
                r0 = 0
                if (r12 == 0) goto L_0x0117
                java.lang.Object r3 = r12.mo34e()
                com.ss.android.ugc.aweme.miniapp_api.model.f r3 = (com.p683ss.android.ugc.aweme.miniapp_api.model.C36967f) r3
                if (r3 != 0) goto L_0x0024
                goto L_0x0117
            L_0x0024:
                com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity r3 = r11.f94160a
                com.ss.android.ugc.aweme.miniapp.appgroup.c r3 = r3.mo76048b()
                java.lang.Object r4 = r12.mo34e()
                com.ss.android.ugc.aweme.miniapp_api.model.f r4 = (com.p683ss.android.ugc.aweme.miniapp_api.model.C36967f) r4
                int r4 = r4.error_code
                if (r4 != 0) goto L_0x0042
                java.lang.Object r12 = r12.mo34e()
                java.lang.String r4 = "task.result"
                p2628d.p2639f.p2641b.C52711k.m112236a(r12, r4)
                com.ss.android.ugc.aweme.miniapp_api.model.f r12 = (com.p683ss.android.ugc.aweme.miniapp_api.model.C36967f) r12
                java.util.List<com.ss.android.ugc.aweme.miniapp_api.model.e> r12 = r12.f94389a
                goto L_0x0043
            L_0x0042:
                r12 = r0
            L_0x0043:
                java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.f> r4 = r3.f94178a
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L_0x0117
                java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.f> r4 = r3.f94178a
                java.util.List r4 = (java.util.List) r4
                java.util.Iterator r4 = r4.iterator()
                r5 = 0
            L_0x0054:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0071
                java.lang.Object r6 = r4.next()
                com.ss.android.ugc.aweme.miniapp.appgroup.f r6 = (com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f) r6
                int r6 = r6.f94201a
                int r7 = com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.C36857a.m82923b()
                if (r6 != r7) goto L_0x006a
                r6 = 1
                goto L_0x006b
            L_0x006a:
                r6 = 0
            L_0x006b:
                if (r6 == 0) goto L_0x006e
                goto L_0x0072
            L_0x006e:
                int r5 = r5 + 1
                goto L_0x0054
            L_0x0071:
                r5 = -1
            L_0x0072:
                java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.f> r1 = r3.f94178a
                java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.f> r4 = r3.f94178a
                java.util.List r4 = r4.subList(r2, r5)
                java.lang.String r5 = "groupMicroApps.subList(0, collectionBlockIndex)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                java.util.Collection r4 = (java.util.Collection) r4
                r1.removeAll(r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.ss.android.ugc.aweme.miniapp.appgroup.f r10 = new com.ss.android.ugc.aweme.miniapp.appgroup.f
                int r5 = com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.C36857a.m82922a()
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r10
                r4.<init>(r5, r6, r7, r8, r9)
                r1.add(r10)
                r4 = r12
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
                if (r4 == 0) goto L_0x00d1
                com.ss.android.ugc.aweme.miniapp.appgroup.f r12 = new com.ss.android.ugc.aweme.miniapp.appgroup.f
                int r6 = com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.C36857a.m82925d()
                r7 = 0
                android.content.Context r4 = r3.f94179b
                if (r4 == 0) goto L_0x00ba
                r5 = 2132548231(0x7f1c1a87, float:2.074973E38)
                java.lang.String r4 = r4.getString(r5)
                if (r4 != 0) goto L_0x00b8
                goto L_0x00ba
            L_0x00b8:
                r8 = r4
                goto L_0x00bd
            L_0x00ba:
                java.lang.String r4 = "暂无使用记录"
                goto L_0x00b8
            L_0x00bd:
                r9 = 2
                r10 = 0
                r5 = r12
                r5.<init>(r6, r7, r8, r9, r10)
                r1.add(r12)
                java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.f> r12 = r3.f94178a
                java.util.Collection r1 = (java.util.Collection) r1
                r12.addAll(r2, r1)
                r3.notifyDataSetChanged()
                goto L_0x0117
            L_0x00d1:
                if (r12 == 0) goto L_0x00d8
                int r4 = r12.size()
                goto L_0x00d9
            L_0x00d8:
                r4 = 0
            L_0x00d9:
                r5 = 3
                if (r4 <= r5) goto L_0x0102
                com.ss.android.ugc.aweme.miniapp.appgroup.f$a r4 = com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.f94199i
                if (r12 != 0) goto L_0x00e3
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00e3:
                java.util.List r12 = r12.subList(r2, r5)
                java.util.ArrayList r12 = r4.mo76056a(r12)
                java.util.Collection r12 = (java.util.Collection) r12
                r1.addAll(r12)
                com.ss.android.ugc.aweme.miniapp.appgroup.f r12 = new com.ss.android.ugc.aweme.miniapp.appgroup.f
                int r5 = com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.C36857a.m82926e()
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9)
                r1.add(r12)
                goto L_0x010d
            L_0x0102:
                com.ss.android.ugc.aweme.miniapp.appgroup.f$a r4 = com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.f94199i
                java.util.ArrayList r12 = r4.mo76056a(r12)
                java.util.Collection r12 = (java.util.Collection) r12
                r1.addAll(r12)
            L_0x010d:
                java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.f> r12 = r3.f94178a
                java.util.Collection r1 = (java.util.Collection) r1
                r12.addAll(r2, r1)
                r3.notifyDataSetChanged()
            L_0x0117:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity.C36835b.then(a.i):java.lang.Object");
        }

        C36835b(MicroAppGroupActivity microAppGroupActivity, boolean z) {
            this.f94160a = microAppGroupActivity;
            this.f94161b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$c */
    public static final class C36836c extends C1302b {

        /* renamed from: c */
        final /* synthetic */ GridLayoutManager f94162c;

        /* renamed from: d */
        final /* synthetic */ MicroAppGroupActivity f94163d;

        /* renamed from: a */
        public final int mo4690a(int i) {
            int itemViewType = this.f94163d.mo76048b().getItemViewType(i);
            if (itemViewType == C36857a.m82922a() || itemViewType == C36857a.m82923b() || itemViewType == C36857a.m82925d()) {
                return this.f94162c.f4521b;
            }
            if (itemViewType == C36857a.m82924c() || itemViewType == C36857a.m82926e()) {
                return 1;
            }
            return 0;
        }

        C36836c(GridLayoutManager gridLayoutManager, MicroAppGroupActivity microAppGroupActivity) {
            this.f94162c = gridLayoutManager;
            this.f94163d = microAppGroupActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$d */
    static final class C36837d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f94164a;

        C36837d(MicroAppGroupActivity microAppGroupActivity) {
            this.f94164a = microAppGroupActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94164a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$e */
    static final class C36838e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f94165a;

        C36838e(MicroAppGroupActivity microAppGroupActivity) {
            this.f94165a = microAppGroupActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            MicroAppGroupActivity microAppGroupActivity = this.f94165a;
            if (((DmtStatusView) microAppGroupActivity.mo76047a((int) R.id.csv)).mo19210d(true)) {
                microAppGroupActivity.mo76049b(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$f */
    static final class C36839f extends C52712l implements C52670a<C36846c> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f94166a;

        C36839f(MicroAppGroupActivity microAppGroupActivity) {
            this.f94166a = microAppGroupActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C36846c cVar = new C36846c(this.f94166a, this.f94166a.mo76050c());
            ArrayList<C36856f> arrayList = cVar.f94178a;
            C36856f fVar = new C36856f(C36857a.m82922a(), null, null, 6, null);
            arrayList.add(fVar);
            ArrayList<C36856f> arrayList2 = cVar.f94178a;
            C36856f fVar2 = new C36856f(C36857a.m82923b(), null, null, 6, null);
            arrayList2.add(fVar2);
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$g */
    static final class C36840g extends C52712l implements C52670a<C26876b<C36842a>> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f94167a;

        C36840g(MicroAppGroupActivity microAppGroupActivity) {
            this.f94167a = microAppGroupActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26876b bVar = new C26876b();
            bVar.mo54799a(new C36842a());
            bVar.mo54800a(this.f94167a);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$h */
    static final class C36841h extends C52712l implements C52670a<C27788aa<C1352v>> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f94168a;

        C36841h(MicroAppGroupActivity microAppGroupActivity) {
            this.f94168a = microAppGroupActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C27788aa.m66530a((C1322a<VH>) this.f94168a.mo76048b());
        }
    }

    /* renamed from: d */
    private final C27788aa<C1352v> m82902d() {
        return (C27788aa) this.f94156e.getValue();
    }

    /* renamed from: a */
    public final View mo76047a(int i) {
        if (this.f94158g == null) {
            this.f94158g = new HashMap();
        }
        View view = (View) this.f94158g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f94158g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final C36846c mo76048b() {
        return (C36846c) this.f94155d.getValue();
    }

    /* renamed from: c */
    public final C26876b<C36842a> mo76050c() {
        return (C26876b) this.f94157f.getValue();
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<C36966e> list, boolean z) {
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid() && !((DmtStatusView) mo76047a((int) R.id.csv)).f28645b) {
            ((DmtStatusView) mo76047a((int) R.id.csv)).mo19212f();
        }
    }

    public final void aU_() {
        mo76050c().mo44934a_(Integer.valueOf(4));
    }

    public final boolean aW_() {
        C27788aa d = m82902d();
        C52711k.m112236a((Object) d, "mLoadMoreAdapter");
        if (d.f73026a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            C27788aa d = m82902d();
            C52711k.m112236a((Object) d, "mLoadMoreAdapter");
            d.mo56230a(1);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C36853d.m82921b(this);
        mo76050c().aq_();
        mo76050c().mo46991S_();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onResume", true);
        super.onResume();
        mo76049b(false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onResume", false);
    }

    public final void setStatusBarColor() {
        C47888fj.m103587a(this, getResources().getColor(R.color.a0_));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        if (r2 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void aJ_() {
        /*
            r9 = this;
            boolean r0 = r9.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 2132023007(0x7f1416df, float:1.968445E38)
            android.view.View r0 = r9.mo76047a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r0
            r1 = 1
            r0.mo19208c(r1)
            com.ss.android.ugc.aweme.discover.adapter.aa r0 = r9.m82902d()
            java.lang.String r1 = "mLoadMoreAdapter"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 0
            r0.mo56230a(r1)
            com.ss.android.ugc.aweme.miniapp.appgroup.c r0 = r9.mo76048b()
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.f> r1 = r0.f94178a
            com.ss.android.ugc.aweme.miniapp.appgroup.f r8 = new com.ss.android.ugc.aweme.miniapp.appgroup.f
            int r3 = com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.C36857a.m82925d()
            r4 = 0
            android.content.Context r2 = r0.f94179b
            if (r2 == 0) goto L_0x003e
            r5 = 2132542947(0x7f1c05e3, float:2.0739013E38)
            java.lang.String r2 = r2.getString(r5)
            if (r2 != 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r5 = r2
            goto L_0x0041
        L_0x003e:
            java.lang.String r2 = "暂无收藏历史"
            goto L_0x003c
        L_0x0041:
            r6 = 2
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.add(r8)
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity.aJ_():void");
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        C27788aa d = m82902d();
        C52711k.m112236a((Object) d, "mLoadMoreAdapter");
        d.mo56230a(z ? 1 : 0);
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            ((DmtStatusView) mo76047a((int) R.id.csv)).mo19214h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo76049b(boolean z) {
        C0013i.m16a((Callable<TResult>) new C36834a<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C36835b<TResult,TContinuationResult>(this, z), C0013i.f25b);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.aa3);
        TextTitleBar textTitleBar = (TextTitleBar) mo76047a((int) R.id.d10);
        C52711k.m112236a((Object) textTitleBar, "title_bar");
        textTitleBar.getBackBtn().setOnClickListener(new C36837d(this));
        Context context = this;
        C10722c a = C48190g.m104428a(context, new C36838e(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(context);
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        ((DmtStatusView) mo76047a((int) R.id.csv)).setBuilder(C10719a.m21676a(context).mo19234c((View) dmtDefaultView));
        ((DmtStatusView) mo76047a((int) R.id.csv)).setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.mh));
        RecyclerView recyclerView = (RecyclerView) mo76047a((int) R.id.cg9);
        C52711k.m112236a((Object) recyclerView, "rv_micro_app_list");
        recyclerView.setAdapter(m82902d());
        RecyclerView recyclerView2 = (RecyclerView) mo76047a((int) R.id.cg9);
        C52711k.m112236a((Object) recyclerView2, "rv_micro_app_list");
        recyclerView2.setOnFlingListener(new C30463p((RecyclerView) mo76047a((int) R.id.cg9), this));
        RecyclerView recyclerView3 = (RecyclerView) mo76047a((int) R.id.cg9);
        C52711k.m112236a((Object) recyclerView3, "rv_micro_app_list");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.f94154c);
        gridLayoutManager.f4526g = new C36836c(gridLayoutManager, this);
        recyclerView3.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView4 = (RecyclerView) mo76047a((int) R.id.cg9);
        C52711k.m112236a((Object) recyclerView4, "rv_micro_app_list");
        C1327f itemAnimator = recyclerView4.getItemAnimator();
        if (itemAnimator != null) {
            ((C1440au) itemAnimator).f5184m = false;
            mo76049b(true);
            C36853d.m82920a(this);
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: b */
    public final void mo47026b(List<C36966e> list, boolean z) {
        boolean z2;
        if (isViewValid()) {
            ((DmtStatusView) mo76047a((int) R.id.csv)).mo19208c(true);
            C27788aa d = m82902d();
            C52711k.m112236a((Object) d, "mLoadMoreAdapter");
            d.mo56230a(z ? 1 : 0);
            C36846c b = mo76048b();
            if (!C9376b.m18558a((Collection<T>) list)) {
                Iterator it = b.f94178a.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C36856f) it.next()).f94201a == C36857a.m82923b()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    i++;
                }
                C52575l.m112110a((List) b.f94178a, (C52671b) new C36850d(b, i));
                b.f94178a.addAll(C36856f.f94199i.mo76056a(list));
                b.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<? extends C36966e> list, boolean z) {
        boolean z2;
        boolean z3;
        if (isViewValid()) {
            ((DmtStatusView) mo76047a((int) R.id.csv)).mo19208c(true);
            C27788aa d = m82902d();
            C52711k.m112236a((Object) d, "mLoadMoreAdapter");
            d.mo56230a(z ? 1 : 0);
            C36846c b = mo76048b();
            if (!C9376b.m18558a((Collection<T>) list)) {
                Iterator it = b.f94178a.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C36856f) it.next()).f94201a == C36857a.m82923b()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        break;
                    }
                    i++;
                }
                Iterable iterable = b.f94178a;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (b.f94178a.indexOf((C36856f) next) <= i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        arrayList.add(next);
                    }
                }
                b.f94178a = new ArrayList<>((List) arrayList);
                b.f94178a.addAll(i + 1, C36856f.f94199i.mo76056a(list));
                b.notifyDataSetChanged();
            }
        }
    }
}
