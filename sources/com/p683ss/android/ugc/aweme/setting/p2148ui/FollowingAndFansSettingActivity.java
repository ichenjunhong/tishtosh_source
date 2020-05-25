package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41697d;
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

/* renamed from: com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity */
public final class FollowingAndFansSettingActivity extends BaseControlSettingActivity {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f105695d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FollowingAndFansSettingActivity.class), "mPushChangePresenter", "getMPushChangePresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;"))};

    /* renamed from: e */
    public static final C41762a f105696e = new C41762a(null);

    /* renamed from: f */
    private final C52668f f105697f = C52732g.m112285a(new C41763b(this));

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity$a */
    public static final class C41762a {
        private C41762a() {
        }

        public /* synthetic */ C41762a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity$b */
    static final class C41763b extends C52712l implements C52670a<C41697d> {

        /* renamed from: a */
        final /* synthetic */ FollowingAndFansSettingActivity f105698a;

        C41763b(FollowingAndFansSettingActivity followingAndFansSettingActivity) {
            this.f105698a = followingAndFansSettingActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C41697d dVar = new C41697d();
            dVar.mo54800a(this.f105698a);
            return dVar;
        }
    }

    /* renamed from: f */
    private final C41697d m91683f() {
        return (C41697d) this.f105697f.getValue();
    }

    /* renamed from: c */
    public final String mo85586c() {
        return "following_follower_permission";
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo85579a() {
        this.f105626a = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        m91683f().mo46991S_();
    }

    /* renamed from: d */
    public final void mo85587d() {
        CommonItemView commonItemView = this.mEveryoneItem;
        C52711k.m112236a((Object) commonItemView, "mEveryoneItem");
        commonItemView.setTag(Integer.valueOf(0));
        CommonItemView commonItemView2 = this.mFriendsItem;
        C52711k.m112236a((Object) commonItemView2, "mFriendsItem");
        commonItemView2.setTag(Integer.valueOf(1));
    }

    /* renamed from: l */
    public final void mo55288l() {
        super.mo55288l();
        C10691a.m21542b((Context) this, (int) R.string.cg0).mo19066a();
    }

    /* renamed from: b */
    public final void mo85583b() {
        this.mTitle.setText(R.string.dfh);
        this.mEveryoneItem.setLeftText(getText(R.string.h8));
        this.mFriendsItem.setLeftText(getText(R.string.clr));
        CommonItemView commonItemView = this.mOffItem;
        C52711k.m112236a((Object) commonItemView, "mOffItem");
        commonItemView.setVisibility(8);
        switch (this.f105626a) {
            case 0:
                mo85581a(this.mEveryoneItem);
                return;
            case 1:
                mo85581a(this.mFriendsItem);
                break;
        }
    }

    /* renamed from: a */
    public final void mo85580a(int i) {
        mo85588e();
        switch (i) {
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
        m91683f().mo44934a_(mo85586c(), Integer.valueOf(i));
    }
}
