package com.p683ss.android.ugc.aweme.follow.recommend.follow.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity */
public final class RecommendFollowActivity extends JediBaseActivity {

    /* renamed from: b */
    public static final C31908a f83356b = new C31908a(null);

    /* renamed from: c */
    private HashMap f83357c;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity$a */
    public static final class C31908a {
        private C31908a() {
        }

        public /* synthetic */ C31908a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo48631a(int i) {
        if (this.f83357c == null) {
            this.f83357c = new HashMap();
        }
        View view = (View) this.f83357c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83357c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ds);
        if (getSupportFragmentManager().mo2224a("tag_recommend_follow") == null) {
            Fragment cVar = new C31923c();
            C31923c cVar2 = (C31923c) cVar;
            Intent intent = getIntent();
            C52711k.m112236a((Object) intent, "intent");
            cVar2.setArguments(intent.getExtras());
            getSupportFragmentManager().mo2225a().mo2176a(R.id.ajf, cVar, "tag_recommend_follow").mo2195c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowActivity", "onCreate", false);
    }
}
