package com.p683ss.android.ugc.aweme.notification.newstyle;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38252c;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38333d;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2028e.C38345a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity */
public final class LikeListDetailActivity extends AmeSSActivity implements C26846a, C26877c<User> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f97298a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/notification/newstyle/adapter/LikeListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mPresenter", "getMPresenter()Lcom/ss/android/ugc/aweme/notification/newstyle/presenter/LikeListPresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mAwemeId", "getMAwemeId()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mRefId", "getMRefId()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mDiggType", "getMDiggType()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mIsNew", "getMIsNew()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mLastReadTime", "getMLastReadTime()J")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mSecondTitle", "getMSecondTitle()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LikeListDetailActivity.class), "mCover", "getMCover()Lcom/ss/android/ugc/aweme/base/model/UrlModel;"))};

    /* renamed from: d */
    public static final C38223a f97299d = new C38223a(null);

    /* renamed from: m */
    private static final int f97300m = ((int) C9432q.m18687b(C11010c.m22280a(), 8.0f));

    /* renamed from: b */
    final C52668f f97301b = C52732g.m112286a(C52757k.NONE, new C38232j(this));

    /* renamed from: c */
    final C52668f f97302c = C52732g.m112286a(C52757k.NONE, new C38233k(this));

    /* renamed from: e */
    private ImmersionBar f97303e;

    /* renamed from: f */
    private final C52668f f97304f = C52732g.m112286a(C52757k.NONE, C38228f.f97316a);

    /* renamed from: g */
    private final C52668f f97305g = C52732g.m112286a(C52757k.NONE, new C38234l(this));

    /* renamed from: h */
    private final C52668f f97306h = C52732g.m112286a(C52757k.NONE, new C38229g(this));

    /* renamed from: i */
    private final C52668f f97307i = C52732g.m112286a(C52757k.NONE, new C38235m(this));

    /* renamed from: j */
    private final C52668f f97308j = C52732g.m112286a(C52757k.NONE, new C38231i(this));

    /* renamed from: k */
    private final C52668f f97309k = C52732g.m112286a(C52757k.NONE, new C38236n(this));

    /* renamed from: l */
    private final C52668f f97310l = C52732g.m112286a(C52757k.NONE, new C38230h(this));

    /* renamed from: n */
    private HashMap f97311n;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$a */
    public static final class C38223a {
        private C38223a() {
        }

        public /* synthetic */ C38223a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m85414a(Context context, String str, String str2, boolean z, int i, long j, String str3, UrlModel urlModel) {
            boolean z2;
            C52711k.m112240b(context, "context");
            CharSequence charSequence = str;
            boolean z3 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                CharSequence charSequence2 = str2;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z3 = true;
                }
                if (!z3) {
                    Intent intent = new Intent(context, LikeListDetailActivity.class);
                    intent.putExtra("aweme_id", str);
                    intent.putExtra("ref_id", str2);
                    intent.putExtra("is_new", z);
                    intent.putExtra("digg_type", i);
                    intent.putExtra("last_read_time", j);
                    intent.putExtra("second_title", str3);
                    if (urlModel != null) {
                        intent.putExtra("cover", urlModel);
                    }
                    context.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$b */
    static final class C38224b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97312a;

        C38224b(LikeListDetailActivity likeListDetailActivity) {
            this.f97312a = likeListDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f97312a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$c */
    static final class C38225c<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97313a;

        C38225c(LikeListDetailActivity likeListDetailActivity) {
            this.f97313a = likeListDetailActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (this.f97313a.isViewValid()) {
                ((DmtStatusView) this.f97313a.mo78208a(R.id.csv)).mo19214h();
                C10691a.m21542b((Context) this.f97313a, (int) R.string.cg1).mo19066a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$d */
    static final class C38226d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97314a;

        C38226d(LikeListDetailActivity likeListDetailActivity) {
            this.f97314a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(this.f97314a.mo78210c());
            C41311y a = C41311y.m91065a(sb.toString()).mo83870a("refer", "message");
            if (this.f97314a.mo78212h() == 3) {
                a.mo83870a("cid", this.f97314a.mo78211d());
            }
            C41302w.m91042a().mo83861a(a.mo83871a());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$e */
    static final class C38227e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97315a;

        C38227e(LikeListDetailActivity likeListDetailActivity) {
            this.f97315a = likeListDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f97315a.mo78213i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$f */
    static final class C38228f extends C52712l implements C52670a<C38252c> {

        /* renamed from: a */
        public static final C38228f f97316a = new C38228f();

        C38228f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C38252c(0, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$g */
    static final class C38229g extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97317a;

        C38229g(LikeListDetailActivity likeListDetailActivity) {
            this.f97317a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f97317a.getIntent().getStringExtra("aweme_id");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$h */
    static final class C38230h extends C52712l implements C52670a<UrlModel> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97318a;

        C38230h(LikeListDetailActivity likeListDetailActivity) {
            this.f97318a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Serializable serializableExtra = this.f97318a.getIntent().getSerializableExtra("cover");
            if (!(serializableExtra instanceof UrlModel)) {
                serializableExtra = null;
            }
            return (UrlModel) serializableExtra;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$i */
    static final class C38231i extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97319a;

        C38231i(LikeListDetailActivity likeListDetailActivity) {
            this.f97319a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f97319a.getIntent().getIntExtra("digg_type", 1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$j */
    static final class C38232j extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97320a;

        C38232j(LikeListDetailActivity likeListDetailActivity) {
            this.f97320a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.f97320a.getIntent().getBooleanExtra("is_new", true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$k */
    static final class C38233k extends C52712l implements C52670a<Long> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97321a;

        C38233k(LikeListDetailActivity likeListDetailActivity) {
            this.f97321a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.f97321a.getIntent().getLongExtra("last_read_time", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$l */
    static final class C38234l extends C52712l implements C52670a<C38345a> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97322a;

        C38234l(LikeListDetailActivity likeListDetailActivity) {
            this.f97322a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C38345a aVar = new C38345a();
            String d = this.f97322a.mo78211d();
            C52711k.m112236a((Object) d, "mRefId");
            C38333d dVar = new C38333d(d, ((Boolean) this.f97322a.f97301b.getValue()).booleanValue(), this.f97322a.mo78212h(), ((Number) this.f97322a.f97302c.getValue()).longValue());
            aVar.mo54799a(dVar);
            aVar.mo54800a(this.f97322a);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$m */
    static final class C38235m extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97323a;

        C38235m(LikeListDetailActivity likeListDetailActivity) {
            this.f97323a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f97323a.getIntent().getStringExtra("ref_id");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$n */
    static final class C38236n extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97324a;

        C38236n(LikeListDetailActivity likeListDetailActivity) {
            this.f97324a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f97324a.getIntent().getStringExtra("second_title");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$o */
    static final class C38237o<T> implements C0199s<FollowStatus> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f97325a;

        C38237o(LikeListDetailActivity likeListDetailActivity) {
            this.f97325a = likeListDetailActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            FollowStatus followStatus = (FollowStatus) obj;
            if (followStatus != null) {
                C38252c b = this.f97325a.mo78209b();
                C52711k.m112240b(followStatus, "followStatus");
                List a = b.mo50673a();
                if (a != null) {
                    int i = 0;
                    Iterator it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        User user = (User) it.next();
                        if (user != null) {
                            str = user.getUid();
                        } else {
                            str = null;
                        }
                        if (C52711k.m112239a((Object) str, (Object) followStatus.userId)) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                        Object obj2 = a.get(i);
                        C52711k.m112236a(obj2, "currentData[index]");
                        ((User) obj2).setFollowStatus(followStatus.followStatus);
                        b.notifyItemChanged(i);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private final C38345a m85398j() {
        return (C38345a) this.f97305g.getValue();
    }

    /* renamed from: a */
    public final View mo78208a(int i) {
        if (this.f97311n == null) {
            this.f97311n = new HashMap();
        }
        View view = (View) this.f97311n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f97311n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final C38252c mo78209b() {
        return (C38252c) this.f97304f.getValue();
    }

    /* renamed from: c */
    public final String mo78210c() {
        return (String) this.f97306h.getValue();
    }

    /* renamed from: c */
    public final void mo47029c(List<User> list, boolean z) {
    }

    /* renamed from: d */
    public final String mo78211d() {
        return (String) this.f97307i.getValue();
    }

    /* renamed from: h */
    public final int mo78212h() {
        return ((Number) this.f97308j.getValue()).intValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void ar_() {
        m85398j().mo78291g();
    }

    /* renamed from: e */
    public final void mo47031e() {
        mo78209b().am_();
    }

    /* renamed from: k */
    private final void m85399k() {
        mo78209b().an_();
        mo78209b().mo54798c(false);
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        ((DmtStatusView) mo78208a(R.id.csv)).mo19212f();
    }

    public final void onDestroy() {
        super.onDestroy();
        m85398j().mo46991S_();
        ImmersionBar immersionBar = this.f97303e;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f97303e = ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.wo);
        ImmersionBar immersionBar = this.f97303e;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    public final void aJ_() {
        if (mo78209b().f70699x) {
            mo78209b().mo54798c(false);
            mo78209b().notifyDataSetChanged();
            m85399k();
        }
        if (mo78209b().getItemCount() == 0) {
            ((DmtStatusView) mo78208a(R.id.csv)).mo19213g();
        }
    }

    /* renamed from: i */
    public final void mo78213i() {
        if (C38248a.m85439a(this)) {
            if (mo78209b().getItemCount() == 0) {
                ((DmtStatusView) mo78208a(R.id.csv)).mo19212f();
            }
            m85398j().mo78290f();
            return;
        }
        if (mo78209b().getItemCount() == 0) {
            C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C38225c<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        mo78209b().mo54793i();
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (mo78209b().f70699x) {
            mo78209b().mo54798c(false);
            mo78209b().notifyDataSetChanged();
        }
        if (mo78209b().getItemCount() == 0) {
            ((DmtStatusView) mo78208a(R.id.csv)).mo19214h();
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b24);
        RecyclerView recyclerView = (RecyclerView) mo78208a(R.id.btx);
        C52711k.m112236a((Object) recyclerView, "notification_recycler_view");
        C1327f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((C1440au) itemAnimator).f5184m = false;
            RecyclerView recyclerView2 = (RecyclerView) mo78208a(R.id.btx);
            C52711k.m112236a((Object) recyclerView2, "notification_recycler_view");
            Context context = this;
            recyclerView2.setLayoutManager(new LinearLayoutManager(context));
            ((RecyclerView) mo78208a(R.id.btx)).mo4798a((C1331h) new C23697k(1, (int) C9432q.m18687b(context, 1.0f), 0));
            ((RecyclerView) mo78208a(R.id.btx)).mo4801a((C1340m) new C32461a(context));
            ((DmtStatusView) mo78208a(R.id.csv)).setBuilder(C10719a.m21676a(context).mo19223a().mo19225a(R.string.bk1, R.string.bk0).mo19226a(R.drawable.dgk, R.string.f5o, R.string.f5k, R.string.f5u, new C38227e(this)));
            if (VERSION.SDK_INT >= 19) {
                View a = mo78208a(R.id.csm);
                C52711k.m112236a((Object) a, "status_bar");
                a.getLayoutParams().height = C11065a.m22390a(context);
            }
            ((AutoRTLImageView) mo78208a(R.id.ik)).setOnClickListener(new C38224b(this));
            CharSequence c = mo78210c();
            if (c == null || c.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                mo78209b().f97363a = (UrlModel) this.f97310l.getValue();
                mo78209b().f97364b = (String) this.f97309k.getValue();
                C38252c b = mo78209b();
                C52670a<C52860x> dVar = new C38226d<>(this);
                C52711k.m112240b(dVar, "<set-?>");
                b.f97365c = dVar;
            }
            mo78209b().mo54788a((C26846a) this);
            mo78209b().mo54798c(true);
            mo78209b().an_();
            RecyclerView recyclerView3 = (RecyclerView) mo78208a(R.id.btx);
            C52711k.m112236a((Object) recyclerView3, "notification_recycler_view");
            recyclerView3.setAdapter(mo78209b());
            ((DmtStatusView) mo78208a(R.id.csv)).mo19212f();
            mo78213i();
            C47588a.m103036c().mo94911b().observe(this, new C38237o(this));
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: a */
    public final void mo47018a(List<User> list, boolean z) {
        int i;
        mo78209b().mo54798c(true);
        if (!z) {
            m85399k();
        } else {
            mo78209b().ao_();
        }
        if (m85398j().mo78289e() == 0) {
            i = f97300m;
        } else {
            i = 0;
        }
        ((FrameLayout) mo78208a(R.id.btk)).setPadding(0, i, 0, 0);
        mo78209b().f97366d = m85398j().mo78289e();
        mo78209b().mo50303a(list);
        ((DmtStatusView) mo78208a(R.id.csv)).mo19209d();
    }

    /* renamed from: b */
    public final void mo47026b(List<User> list, boolean z) {
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            z = false;
        }
        if (!z) {
            m85399k();
        } else {
            mo78209b().ao_();
        }
        mo78209b().f97366d = m85398j().mo78289e();
        mo78209b().mo51189c(list);
    }
}
