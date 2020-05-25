package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41697d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity */
public final class WhoCanSeeMyLikeListActivity extends BaseControlSettingActivity {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f105986d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(WhoCanSeeMyLikeListActivity.class), "mPushChangePresenter", "getMPushChangePresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;"))};

    /* renamed from: e */
    public static final C41683a f105987e = new C41843b();

    /* renamed from: f */
    public static final C41842a f105988f = new C41842a(null);

    /* renamed from: g */
    private final C52668f f105989g = C52732g.m112285a(new C41844c(this));

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity$a */
    public static final class C41842a {
        private C41842a() {
        }

        public /* synthetic */ C41842a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity$b */
    public static final class C41843b implements C41683a {
        C41843b() {
        }

        /* renamed from: a */
        public final void mo47083a(Exception exc) {
            C52711k.m112240b(exc, "e");
        }

        /* renamed from: a */
        public final boolean mo47084a() {
            return false;
        }

        /* renamed from: a */
        public final void mo47082a(C41686c cVar) {
            C52711k.m112240b(cVar, "settings");
            C23183v a = C23183v.m56778a();
            C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
            C23051bf e = a.mo47909e();
            C52711k.m112236a((Object) e, "CommonSharePrefCache.ins….whoCanSeeMyLikeListValue");
            e.mo47776a(Integer.valueOf(cVar.f105460C));
            C47718bf.m103288a(new C41873ba());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity$c */
    static final class C41844c extends C52712l implements C52670a<C41697d> {

        /* renamed from: a */
        final /* synthetic */ WhoCanSeeMyLikeListActivity f105990a;

        C41844c(WhoCanSeeMyLikeListActivity whoCanSeeMyLikeListActivity) {
            this.f105990a = whoCanSeeMyLikeListActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C41697d dVar = new C41697d();
            dVar.mo54800a(this.f105990a);
            return dVar;
        }
    }

    /* renamed from: f */
    private final C41697d m91822f() {
        return (C41697d) this.f105989g.getValue();
    }

    /* renamed from: c */
    public final String mo85586c() {
        return "favorite_permission";
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo85579a() {
        this.f105626a = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        m91822f().mo46991S_();
    }

    /* renamed from: d */
    public final void mo85587d() {
        CommonItemView commonItemView = this.mEveryoneItem;
        C52711k.m112236a((Object) commonItemView, "mEveryoneItem");
        commonItemView.setTag(Integer.valueOf(0));
        CommonItemView commonItemView2 = this.mFriendsItem;
        C52711k.m112236a((Object) commonItemView2, "mFriendsItem");
        commonItemView2.setTag(Integer.valueOf(1));
        CommonItemView commonItemView3 = this.mOffItem;
        C52711k.m112236a((Object) commonItemView3, "mOffItem");
        commonItemView3.setTag(Integer.valueOf(3));
    }

    /* renamed from: b */
    public final void mo85583b() {
        C23183v a = C23183v.m56778a();
        C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
        C23051bf f = a.mo47910f();
        C52711k.m112236a((Object) f, "CommonSharePrefCache.ins…redLikeSelfVisibleSetting");
        f.mo47776a(Boolean.valueOf(true));
        TextView textView = this.mTitle;
        C52711k.m112236a((Object) textView, "mTitle");
        textView.setText(getString(R.string.h41));
        CommonItemView commonItemView = this.mOffItem;
        C52711k.m112236a((Object) commonItemView, "mOffItem");
        commonItemView.setVisibility(8);
        this.mFriendsItem.setLeftText(getString(R.string.h3s));
        switch (this.f105626a) {
            case 0:
                mo85581a(this.mEveryoneItem);
                return;
            case 1:
                mo85581a(this.mFriendsItem);
                break;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo85584b(int i) {
        m91822f().mo44934a_(mo85586c(), Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo85580a(int i) {
        if (i != 3) {
            switch (i) {
                case 0:
                    mo85581a(this.mEveryoneItem);
                    return;
                case 1:
                    mo85581a(this.mFriendsItem);
                    return;
            }
        } else {
            mo85581a(this.mOffItem);
        }
    }
}
