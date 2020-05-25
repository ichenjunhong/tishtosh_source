package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32507d;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.AbsSummonFriendActivity */
public class AbsSummonFriendActivity extends AmeSSActivity {

    /* renamed from: a */
    private int f84878a;

    /* renamed from: b */
    private String f84879b;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void finish() {
        super.finish();
        superOverridePendingTransition(R.anim.m, R.anim.r);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onBackPressed() {
        C26894c.m65021a(this, findViewById(R.id.yw));
        setResult(0);
        super.onBackPressed();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    @C53771m
    public void onEvent(C32507d dVar) {
        if (dVar != null) {
            Intent intent = new Intent();
            intent.putExtra("extra_data", dVar.f84606a);
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        setContentView((int) R.layout.ax);
        superOverridePendingTransition(R.anim.q, R.anim.m);
        findViewById(R.id.yw).setBackgroundColor(getResources().getColor(R.color.a2p));
        if (VERSION.SDK_INT >= 19) {
            findViewById(R.id.csm).getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        this.f84879b = getIntent().getStringExtra("video_id");
        this.f84878a = getIntent().getIntExtra("source", 0);
        C0679r a = getSupportFragmentManager().mo2225a();
        if (((Integer) SharePrefCache.inst().getAtFriendsShowType().mo47782d()).intValue() == 1) {
            String str = this.f84879b;
            int i = this.f84878a;
            C52711k.m112240b(str, "videoId");
            Bundle bundle2 = new Bundle();
            bundle2.putString("video_id", str);
            bundle2.putInt("source", i);
            C32694a aVar = new C32694a();
            aVar.setArguments(bundle2);
            fragment = aVar;
        } else {
            String str2 = this.f84879b;
            int i2 = this.f84878a;
            Bundle bundle3 = new Bundle();
            bundle3.putString("video_id", str2);
            bundle3.putInt("source", i2);
            SummonFriendsFragment summonFriendsFragment = new SummonFriendsFragment();
            summonFriendsFragment.setArguments(bundle3);
            fragment = summonFriendsFragment;
        }
        fragment.setUserVisibleHint(true);
        a.mo2191b(R.id.yw, fragment);
        a.mo2189b();
    }

    /* renamed from: a */
    public static void m75410a(Fragment fragment, int i, String str, int i2) {
        Intent intent = new Intent(fragment.getActivity(), SummonFriendActivity.class);
        intent.putExtra("video_id", str);
        intent.putExtra("source", i2);
        fragment.startActivityForResult(intent, i);
    }
}
