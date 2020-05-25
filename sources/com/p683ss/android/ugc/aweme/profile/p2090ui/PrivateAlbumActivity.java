package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23396j;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p683ss.android.ugc.aweme.profile.C39938k;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq.C40267a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity */
public final class PrivateAlbumActivity extends AmeSlideSSActivity {

    /* renamed from: e */
    public static final C40112a f102316e = new C40112a(null);

    /* renamed from: f */
    private static final String f102317f = f102317f;

    /* renamed from: b */
    public DmtStatusView f102318b;

    /* renamed from: c */
    public ScrollableLayout f102319c;

    /* renamed from: d */
    public C40200a f102320d;

    /* renamed from: g */
    private HashMap f102321g;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity$a */
    public static final class C40112a {
        private C40112a() {
        }

        public /* synthetic */ C40112a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m89238a(Context context) {
            ((C39938k) C23396j.m57478a(C11010c.m22280a(), C39938k.class)).mo48468b(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity$b */
    public static final class C40113b implements C40267a {

        /* renamed from: a */
        final /* synthetic */ PrivateAlbumActivity f102322a;

        C40113b(PrivateAlbumActivity privateAlbumActivity) {
            this.f102322a = privateAlbumActivity;
        }

        /* renamed from: a */
        public final void mo82252a(boolean z, int i) {
            DmtStatusView dmtStatusView = this.f102322a.f102318b;
            if (dmtStatusView != null) {
                dmtStatusView.mo19213g();
            }
            ScrollableLayout scrollableLayout = this.f102322a.f102319c;
            if (scrollableLayout != null) {
                scrollableLayout.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo82253b(boolean z, int i) {
            ScrollableLayout scrollableLayout = this.f102322a.f102319c;
            if (scrollableLayout != null) {
                scrollableLayout.setVisibility(0);
            }
            DmtStatusView dmtStatusView = this.f102322a.f102318b;
            if (dmtStatusView != null) {
                dmtStatusView.mo19209d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity$c */
    public static final class C40114c implements C10713a {

        /* renamed from: a */
        final /* synthetic */ PrivateAlbumActivity f102323a;

        /* renamed from: b */
        public final void mo19167b(View view) {
            C52711k.m112240b(view, "view");
        }

        C40114c(PrivateAlbumActivity privateAlbumActivity) {
            this.f102323a = privateAlbumActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            C52711k.m112240b(view, "view");
            this.f102323a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.PrivateAlbumActivity$d */
    static final class C40115d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivateAlbumActivity f102324a;

        C40115d(PrivateAlbumActivity privateAlbumActivity) {
            this.f102324a = privateAlbumActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C40200a aVar = this.f102324a.f102320d;
            if (aVar != null) {
                aVar.mo82510w();
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a0_).init();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.boc);
        if (this.f102321g == null) {
            this.f102321g = new HashMap();
        }
        View view = (View) this.f102321g.get(Integer.valueOf(R.id.d10));
        if (view == null) {
            view = findViewById(R.id.d10);
            this.f102321g.put(Integer.valueOf(R.id.d10), view);
        }
        ((TextTitleBar) view).setOnTitleBarClickListener(new C40114c(this));
        this.f102319c = (ScrollableLayout) findViewById(R.id.chv);
        this.f102318b = (DmtStatusView) findViewById(R.id.e5j);
        Context context = this;
        C10719a a = C10719a.m21676a(context).mo19229a(new C10723a(context).mo19277a((int) R.drawable.b0t).mo19279a("没有私密作品").mo19281b("发布过的私密作品会出现在这里").f28711a);
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.tf));
        dmtTextView.setTextColor(getResources().getColor(R.color.a19));
        dmtTextView.setText(R.string.c0e);
        dmtTextView.setOnClickListener(new C40115d(this));
        a.mo19234c((View) dmtTextView);
        DmtStatusView dmtStatusView = this.f102318b;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(a);
        }
        DmtStatusView dmtStatusView2 = this.f102318b;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo19212f();
        }
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a2 = supportFragmentManager.mo2224a(f102317f);
        if (a2 == null) {
            C0679r a3 = supportFragmentManager.mo2225a();
            C52711k.m112236a((Object) a3, "fm.beginTransaction()");
            C40733z zVar = C40733z.f103767a;
            int dimension = (int) getResources().getDimension(R.dimen.a0u);
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            User curUser = g.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
            String uid = curUser.getUid();
            C52711k.m112236a((Object) uid, "AccountProxyService.userService().curUser.uid");
            IAccountUserService g2 = C20854a.m53167g();
            C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
            User curUser2 = g2.getCurUser();
            C52711k.m112236a((Object) curUser2, "AccountProxyService.userService().curUser");
            a2 = zVar.newAwemeListFragment(dimension, 14, uid, curUser2.getSecUid(), true, true, new Bundle());
            a3.mo2176a(R.id.ajf, a2, f102317f);
            a3.mo2189b();
        }
        if (!(a2 instanceof C40200a)) {
            a2 = null;
        }
        this.f102320d = (C40200a) a2;
        C40200a aVar = this.f102320d;
        if (aVar != null) {
            aVar.mo82499a(this.f102318b);
            aVar.setUserVisibleHint(true);
            aVar.mo82505d(true);
            aVar.mo82500a((C40267a) new C40113b(this));
        }
        ScrollableLayout scrollableLayout = this.f102319c;
        if (scrollableLayout != null) {
            C26990b helper = scrollableLayout.getHelper();
            if (helper != null) {
                helper.f71219b = this.f102320d;
            }
        }
        C40112a.m89238a(context);
    }
}
