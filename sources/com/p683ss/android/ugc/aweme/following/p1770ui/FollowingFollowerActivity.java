package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.following.p1770ui.C32352x.C32357b;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a.C24482a;
import com.p683ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40242a;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity */
public class FollowingFollowerActivity extends AmeSlideSSActivity implements C0199s<C24481a<NewUserCount>> {

    /* renamed from: b */
    public int f83644b;

    /* renamed from: c */
    private MyProfileViewModel f83645c;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity$1 */
    static /* synthetic */ class C320481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f83646a = new int[C32357b.values().length];

        static {
            try {
                f83646a[C32357b.follower.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity$a */
    public static class C32049a {

        /* renamed from: a */
        private Context f83647a;

        /* renamed from: b */
        private Fragment f83648b;

        /* renamed from: c */
        private C32199n f83649c;

        /* renamed from: d */
        private C32357b f83650d;

        /* renamed from: e */
        private int f83651e;

        /* renamed from: a */
        public final void mo65247a() {
            Intent intent = new Intent(this.f83647a, FollowingFollowerActivity.class);
            intent.putExtra("following_page_param", this.f83649c);
            intent.putExtra("page_type_const_for_simpleuser", this.f83650d);
            intent.putExtra("following_or_follower_count", this.f83651e);
            if (this.f83648b instanceof C40242a) {
                this.f83648b.startActivityForResult(intent, 20001);
            } else {
                this.f83647a.startActivity(intent);
            }
        }

        /* renamed from: a */
        public final C32049a mo65246a(User user) {
            String str;
            C32199n nVar = this.f83649c;
            if (user == null) {
                str = "";
            } else {
                str = user.getSecUid();
            }
            nVar.setSecUid(str);
            C31187c.m72820a(user);
            return this;
        }

        public C32049a(Context context, Fragment fragment, String str, boolean z, C32357b bVar, int i) {
            this.f83647a = context;
            this.f83649c = new C32199n(str, z, bVar);
            this.f83650d = bVar;
            this.f83651e = i;
            this.f83648b = fragment;
        }
    }

    /* renamed from: a */
    public final void mo65244a() {
        this.f83644b = 0;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("recommend_count", this.f83644b);
        setResult(-1, intent);
        super.finish();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.wo).statusBarDarkFont(true).init();
    }

    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C24481a aVar = (C24481a) obj;
        if (!(aVar == null || aVar.f64868b == null || aVar.f64867a != C24482a.SUCCESS)) {
            int i = ((NewUserCount) aVar.f64868b).count;
            if (i > 0) {
                this.f83644b = i;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Fragment fragment;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bo_);
        this.f83645c = (MyProfileViewModel) C0214z.m440a((FragmentActivity) this).mo359a(MyProfileViewModel.class);
        this.f83645c.f103554a.observe(this, this);
        this.f83645c.mo82896a();
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a("FRAGMENT_FOLLOWING_LIST");
        C32357b bVar = (C32357b) getIntent().getSerializableExtra("page_type_const_for_simpleuser");
        if (bVar == null) {
            bVar = C32357b.following;
        }
        if (a != 0) {
            fragment = a;
        } else if (C320481.f83646a[bVar.ordinal()] != 1) {
            Bundle extras = getIntent().getExtras();
            FollowingListFragment followingListFragment = new FollowingListFragment();
            followingListFragment.setArguments(extras);
            fragment = followingListFragment;
        } else {
            Bundle extras2 = getIntent().getExtras();
            FollowerListFragment followerListFragment = new FollowerListFragment();
            followerListFragment.setArguments(extras2);
            fragment = followerListFragment;
        }
        supportFragmentManager.mo2225a().mo2192b(R.id.ajf, fragment, "FRAGMENT_FOLLOWING_LIST").mo2195c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onCreate", false);
    }
}
