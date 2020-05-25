package com.p683ss.android.ugc.aweme.movie.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailActivity */
public final class MovieDetailActivity extends AmeSlideSSActivity {

    /* renamed from: g */
    public static final C37190a f94934g = new C37190a(null);

    /* renamed from: b */
    public String f94935b = "";

    /* renamed from: c */
    public String f94936c = "";

    /* renamed from: d */
    public String f94937d = "";

    /* renamed from: e */
    public String f94938e = "";

    /* renamed from: f */
    public int f94939f;

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailActivity$a */
    public static final class C37190a {
        private C37190a() {
        }

        public /* synthetic */ C37190a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailActivity$b */
    public static final class C37191b implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ MovieDetailActivity f94940a;

        /* renamed from: b */
        final /* synthetic */ int f94941b;

        /* renamed from: c */
        final /* synthetic */ int f94942c;

        /* renamed from: d */
        final /* synthetic */ Intent f94943d;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            asyncAVService.uiService().recordService().recordActivityResult(this.f94940a, this.f94941b, this.f94942c, this.f94943d);
        }

        C37191b(MovieDetailActivity movieDetailActivity, int i, int i2, Intent intent) {
            this.f94940a = movieDetailActivity;
            this.f94941b = i;
            this.f94942c = i2;
            this.f94943d = intent;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            j = Long.parseLong(this.f94935b);
            try {
                j2 = Long.parseLong(this.f94938e);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        Analysis value = new Analysis().setLabelName("mv_page").setExt_value(j).setValue(j2);
        C52711k.m112236a((Object) value, "Analysis().setLabelName(…t_value(id).setValue(aid)");
        return value;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ct);
        String stringExtra = getIntent().getStringExtra("mv_id");
        C52711k.m112236a((Object) stringExtra, "intent.getStringExtra(Mob.Key.MV_ID)");
        this.f94935b = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("enter_method");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f94937d = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("enter_from");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f94936c = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("group_id");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f94938e = stringExtra4;
        this.f94939f = getIntent().getIntExtra("type", 0);
        C0654k supportFragmentManager = getSupportFragmentManager();
        C0679r a = supportFragmentManager.mo2225a();
        C52711k.m112236a((Object) a, "fm.beginTransaction()");
        Fragment a2 = supportFragmentManager.mo2224a("movie_detail_fragment_tag");
        if (a2 == null) {
            String str = this.f94935b;
            String str2 = this.f94936c;
            String str3 = this.f94938e;
            String str4 = this.f94937d;
            int i = this.f94939f;
            C52711k.m112240b(str, "mvId");
            C52711k.m112240b(str2, "enterFrom");
            C52711k.m112240b(str3, "groupId");
            C52711k.m112240b(str4, "enterMethod");
            C37199f fVar = new C37199f();
            Bundle bundle2 = new Bundle(3);
            bundle2.putString("mv_id", str);
            bundle2.putString("enter_from", str2);
            bundle2.putString("enter_method", str4);
            bundle2.putString("group_id", str3);
            bundle2.putInt("type", i);
            fVar.setArguments(bundle2);
            a2 = fVar;
        }
        a2.setUserVisibleHint(true);
        a.mo2192b(R.id.yw, a2, "movie_detail_fragment_tag");
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C37191b(this, i, i2, intent));
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
