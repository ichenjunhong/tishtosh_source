package com.p683ss.android.ugc.aweme.mix;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29723f;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.mix.ProfileVideoMixListActivity */
public final class ProfileVideoMixListActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C37004a f94519a = new C37004a(null);

    /* renamed from: com.ss.android.ugc.aweme.mix.ProfileVideoMixListActivity$a */
    public static final class C37004a {
        private C37004a() {
        }

        public /* synthetic */ C37004a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.ProfileVideoMixListActivity$b */
    static final class C37005b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileVideoMixListActivity f94520a;

        C37005b(ProfileVideoMixListActivity profileVideoMixListActivity) {
            this.f94520a = profileVideoMixListActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94520a.finish();
        }
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bty);
        findViewById(R.id.ik).setOnClickListener(new C37005b(this));
        C29723f fVar = new C29723f();
        fVar.mo82582g(true);
        C47661ab a = C47661ab.m103163a();
        String stringExtra = getIntent().getStringExtra("user_id");
        if (stringExtra != null) {
            a.mo94972a("user_id", stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("sec_user_id");
        if (stringExtra2 != null) {
            a.mo94972a("sec_user_id", stringExtra2);
        }
        a.mo94973a("is_from_profile_video_mix_list", true);
        fVar.setArguments(a.f120139a);
        getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, (Fragment) fVar).mo2189b();
    }
}
