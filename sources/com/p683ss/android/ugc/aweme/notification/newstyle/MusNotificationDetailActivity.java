package com.p683ss.android.ugc.aweme.notification.newstyle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38264g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38275c;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38276d;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38292m;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38337f;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2028e.C38347c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity */
public final class MusNotificationDetailActivity extends AmeSSActivity implements C1091b, C26846a, C26877c<BaseNotice> {

    /* renamed from: a */
    public static final C38244a f97338a = new C38244a(null);

    /* renamed from: b */
    private int f97339b = -1;

    /* renamed from: c */
    private int f97340c;

    /* renamed from: d */
    private final C38292m f97341d = C38292m.f97489a;

    /* renamed from: e */
    private C38275c f97342e;

    /* renamed from: f */
    private C38276d f97343f;

    /* renamed from: g */
    private C38264g f97344g;

    /* renamed from: h */
    private C38347c f97345h;

    /* renamed from: i */
    private C38337f f97346i;

    /* renamed from: j */
    private ImmersionBar f97347j;

    /* renamed from: k */
    private boolean f97348k;

    /* renamed from: l */
    private HashMap f97349l;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity$a */
    public static final class C38244a {
        private C38244a() {
        }

        public /* synthetic */ C38244a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo78227a(Context context, int i, int i2) {
            C52711k.m112240b(context, "context");
            m85435a(context, i, i2, null);
        }

        /* renamed from: a */
        private static void m85435a(Context context, int i, int i2, String str) {
            C52711k.m112240b(context, "context");
            Intent intent = new Intent(context, MusNotificationDetailActivity.class);
            intent.putExtra("from_where", i);
            intent.putExtra("unRead_message_count", i2);
            if (!TextUtils.isEmpty(null)) {
                intent.putExtra("notice_name", null);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity$b */
    public static final class C38245b implements C10713a {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f97350a;

        /* renamed from: b */
        public final void mo19167b(View view) {
            C52711k.m112240b(view, "view");
        }

        C38245b(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f97350a = musNotificationDetailActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            C52711k.m112240b(view, "view");
            this.f97350a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity$c */
    static final class C38246c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f97351a;

        C38246c(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f97351a = musNotificationDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f97351a.onRefresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity$d */
    static final class C38247d<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f97352a;

        C38247d(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f97352a = musNotificationDetailActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (this.f97352a.isViewValid()) {
                ((DmtStatusView) this.f97352a.mo78225a(R.id.csv)).mo19214h();
                C10691a.m21542b((Context) this.f97352a, (int) R.string.cg1).mo19066a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    /* renamed from: a */
    public final View mo78225a(int i) {
        if (this.f97349l == null) {
            this.f97349l = new HashMap();
        }
        View view = (View) this.f97349l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f97349l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<BaseNotice> list, boolean z) {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    public final void mo47031e() {
        C38264g gVar = this.f97344g;
        if (gVar == null) {
            C52711k.m112237a("mAdapter");
        }
        gVar.am_();
    }

    /* renamed from: b */
    private final void m85425b() {
        C38264g gVar = this.f97344g;
        if (gVar == null) {
            C52711k.m112237a("mAdapter");
        }
        gVar.an_();
        C38264g gVar2 = this.f97344g;
        if (gVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        gVar2.mo54798c(false);
    }

    public final void onDestroy() {
        super.onDestroy();
        C38347c cVar = this.f97345h;
        if (cVar == null) {
            C52711k.m112237a("mNoticePresenter");
        }
        cVar.mo46991S_();
        ImmersionBar immersionBar = this.f97347j;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f97347j = ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.wo);
        ImmersionBar immersionBar = this.f97347j;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    public final void ar_() {
        C38347c cVar = this.f97345h;
        if (cVar == null) {
            C52711k.m112237a("mNoticePresenter");
        }
        cVar.mo44934a_(Integer.valueOf(4), Integer.valueOf(this.f97339b), null);
    }

    public final Analysis getAnalysis() {
        String str;
        Analysis analysis = new Analysis();
        switch (this.f97339b) {
            case 2:
                str = "comment";
                break;
            case 3:
                str = "like";
                break;
            case 6:
                str = "at";
                break;
            case 7:
                str = "fans";
                break;
            default:
                str = "fans";
                break;
        }
        Analysis labelName = analysis.setLabelName(str);
        C52711k.m112236a((Object) labelName, "Analysis().setLabelName(getEnterFrom())");
        return labelName;
    }

    public final void aJ_() {
        C38264g gVar = this.f97344g;
        if (gVar == null) {
            C52711k.m112237a("mAdapter");
        }
        if (gVar.f70699x) {
            C38264g gVar2 = this.f97344g;
            if (gVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            gVar2.mo54798c(false);
            C38264g gVar3 = this.f97344g;
            if (gVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            gVar3.notifyDataSetChanged();
            m85425b();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78225a(R.id.bu2);
        C52711k.m112236a((Object) swipeRefreshLayout, "notification_swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        C38264g gVar4 = this.f97344g;
        if (gVar4 == null) {
            C52711k.m112237a("mAdapter");
        }
        if (gVar4.getItemCount() == 0) {
            ((DmtStatusView) mo78225a(R.id.csv)).mo19213g();
        }
    }

    public final void onRefresh() {
        if (C38348f.m85646a(this)) {
            C38264g gVar = this.f97344g;
            if (gVar == null) {
                C52711k.m112237a("mAdapter");
            }
            if (gVar.getItemCount() == 0) {
                ((DmtStatusView) mo78225a(R.id.csv)).mo19212f();
            }
            C38347c cVar = this.f97345h;
            if (cVar == null) {
                C52711k.m112237a("mNoticePresenter");
            }
            cVar.mo44934a_(Integer.valueOf(1), Integer.valueOf(this.f97339b), null);
            return;
        }
        C38264g gVar2 = this.f97344g;
        if (gVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        if (gVar2.getItemCount() == 0) {
            C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C38247d<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        C38264g gVar = this.f97344g;
        if (gVar == null) {
            C52711k.m112237a("mAdapter");
        }
        gVar.mo54793i();
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        C38264g gVar = this.f97344g;
        if (gVar == null) {
            C52711k.m112237a("mAdapter");
        }
        if (gVar.f70699x) {
            C38264g gVar2 = this.f97344g;
            if (gVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            gVar2.mo54798c(false);
            C38264g gVar3 = this.f97344g;
            if (gVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            gVar3.notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78225a(R.id.bu2);
        C52711k.m112236a((Object) swipeRefreshLayout, "notification_swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        C38264g gVar4 = this.f97344g;
        if (gVar4 == null) {
            C52711k.m112237a("mAdapter");
        }
        if (gVar4.getItemCount() == 0) {
            ((DmtStatusView) mo78225a(R.id.csv)).mo19214h();
        }
    }

    public final void onCreate(Bundle bundle) {
        C38276d dVar;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b25);
        this.f97339b = getIntent().getIntExtra("from_where", -1);
        this.f97340c = getIntent().getIntExtra("unRead_message_count", 0);
        if (C38292m.m85538a().get(Integer.valueOf(this.f97339b)) != null) {
            C38275c cVar = (C38275c) C38292m.m85538a().get(Integer.valueOf(this.f97339b));
            if (cVar != null) {
                dVar = cVar.mo78245a();
            } else {
                dVar = null;
            }
            if (dVar != null) {
                Object obj = C38292m.m85538a().get(Integer.valueOf(this.f97339b));
                if (obj == null) {
                    C52711k.m112234a();
                }
                this.f97342e = (C38275c) obj;
                C38275c cVar2 = this.f97342e;
                if (cVar2 == null) {
                    C52711k.m112237a("mDelegate");
                }
                C38276d a = cVar2.mo78245a();
                if (a == null) {
                    C52711k.m112234a();
                }
                this.f97343f = a;
                RecyclerView recyclerView = (RecyclerView) mo78225a(R.id.btx);
                C52711k.m112236a((Object) recyclerView, "notification_recycler_view");
                C1327f itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    ((C1440au) itemAnimator).f5184m = false;
                    RecyclerView recyclerView2 = (RecyclerView) mo78225a(R.id.btx);
                    C52711k.m112236a((Object) recyclerView2, "notification_recycler_view");
                    Context context = this;
                    recyclerView2.setLayoutManager(new LinearLayoutManager(context));
                    ((RecyclerView) mo78225a(R.id.btx)).mo4798a((C1331h) new C23697k(1, (int) C9432q.m18687b(context, 1.0f), 0));
                    ((RecyclerView) mo78225a(R.id.btx)).mo4801a((C1340m) new C32461a(context));
                    C10723a aVar = new C10723a(context);
                    C38276d dVar2 = this.f97343f;
                    if (dVar2 == null) {
                        C52711k.m112237a("mDetailProxy");
                    }
                    C10723a a2 = aVar.mo19279a(dVar2.mo78250b());
                    C38276d dVar3 = this.f97343f;
                    if (dVar3 == null) {
                        C52711k.m112237a("mDetailProxy");
                    }
                    ((DmtStatusView) mo78225a(R.id.csv)).setBuilder(C10719a.m21676a(context).mo19223a().mo19229a(a2.mo19281b(dVar3.mo78251c()).f28711a).mo19226a(R.drawable.dgk, R.string.f5o, R.string.f5k, R.string.f5u, new C38246c(this)));
                    if (VERSION.SDK_INT >= 19) {
                        View a3 = mo78225a(R.id.csm);
                        C52711k.m112236a((Object) a3, "status_bar");
                        a3.getLayoutParams().height = C11065a.m22390a(context);
                    }
                    ((SwipeRefreshLayout) mo78225a(R.id.bu2)).setOnRefreshListener(this);
                    TextTitleBar textTitleBar = (TextTitleBar) mo78225a(R.id.d10);
                    C38276d dVar4 = this.f97343f;
                    if (dVar4 == null) {
                        C52711k.m112237a("mDetailProxy");
                    }
                    textTitleBar.setTitle((CharSequence) dVar4.mo78247a());
                    ((TextTitleBar) mo78225a(R.id.d10)).setOnTitleBarClickListener(new C38245b(this));
                    C38276d dVar5 = this.f97343f;
                    if (dVar5 == null) {
                        C52711k.m112237a("mDetailProxy");
                    }
                    this.f97344g = new C38264g(dVar5, this.f97340c);
                    this.f97345h = new C38347c();
                    this.f97346i = new C38337f();
                    C38337f fVar = this.f97346i;
                    if (fVar == null) {
                        C52711k.m112237a("mNoticeModel");
                    }
                    fVar.f97569a = this.f97339b;
                    C38347c cVar3 = this.f97345h;
                    if (cVar3 == null) {
                        C52711k.m112237a("mNoticePresenter");
                    }
                    C38337f fVar2 = this.f97346i;
                    if (fVar2 == null) {
                        C52711k.m112237a("mNoticeModel");
                    }
                    cVar3.mo54799a(fVar2);
                    C38347c cVar4 = this.f97345h;
                    if (cVar4 == null) {
                        C52711k.m112237a("mNoticePresenter");
                    }
                    cVar4.mo54800a(this);
                    C38264g gVar = this.f97344g;
                    if (gVar == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    gVar.mo54788a((C26846a) this);
                    C38264g gVar2 = this.f97344g;
                    if (gVar2 == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    gVar2.mo54798c(true);
                    C38264g gVar3 = this.f97344g;
                    if (gVar3 == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    gVar3.an_();
                    RecyclerView recyclerView3 = (RecyclerView) mo78225a(R.id.btx);
                    C52711k.m112236a((Object) recyclerView3, "notification_recycler_view");
                    C38264g gVar4 = this.f97344g;
                    if (gVar4 == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    recyclerView3.setAdapter(gVar4);
                    ((DmtStatusView) mo78225a(R.id.csv)).mo19212f();
                    onRefresh();
                    ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onCreate", false);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo47026b(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            m85425b();
        } else {
            C38264g gVar = this.f97344g;
            if (gVar == null) {
                C52711k.m112237a("mAdapter");
            }
            gVar.ao_();
        }
        C38264g gVar2 = this.f97344g;
        if (gVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        gVar2.mo50304b(list);
    }

    /* renamed from: a */
    public final void mo47018a(List<BaseNotice> list, boolean z) {
        C38264g gVar = this.f97344g;
        if (gVar == null) {
            C52711k.m112237a("mAdapter");
        }
        gVar.mo54798c(true);
        if (this.f97348k) {
            C38264g gVar2 = this.f97344g;
            if (gVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            gVar2.f97406a = 0;
        }
        this.f97348k = true;
        if (!z) {
            m85425b();
        } else {
            C38264g gVar3 = this.f97344g;
            if (gVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            gVar3.ao_();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78225a(R.id.bu2);
        C52711k.m112236a((Object) swipeRefreshLayout, "notification_swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        C38264g gVar4 = this.f97344g;
        if (gVar4 == null) {
            C52711k.m112237a("mAdapter");
        }
        gVar4.mo50303a(list);
        ((DmtStatusView) mo78225a(R.id.csv)).mo19209d();
    }
}
