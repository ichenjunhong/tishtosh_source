package com.p683ss.android.ugc.aweme.discover.activity;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29723f;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchVideoMixListActivity */
public final class SearchVideoMixListActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C27745a f72816a = new C27745a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchVideoMixListActivity$a */
    public static final class C27745a {
        private C27745a() {
        }

        public /* synthetic */ C27745a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchVideoMixListActivity$b */
    static final class C27746b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchVideoMixListActivity f72817a;

        C27746b(SearchVideoMixListActivity searchVideoMixListActivity) {
            this.f72817a = searchVideoMixListActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f72817a.finish();
        }
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.e3);
        findViewById(R.id.ik).setOnClickListener(new C27746b(this));
        C29723f fVar = new C29723f();
        fVar.mo82582g(true);
        C47661ab a = C47661ab.m103163a().mo94972a("enter_from", "general_search").mo94972a("enter_method", "general_search_aladdin_more");
        Serializable serializableExtra = getIntent().getSerializableExtra("mix_more");
        if (serializableExtra != null) {
            String str = "mix_ids";
            if (serializableExtra != null) {
                a.mo94971a(str, (Serializable) (ArrayList) serializableExtra);
            } else {
                throw new C52857u("null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
            }
        }
        String stringExtra = getIntent().getStringExtra("search_keyword");
        if (stringExtra != null) {
            a.mo94972a("search_keyword", stringExtra);
        }
        fVar.setArguments(a.f120139a);
        getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, (Fragment) fVar).mo2189b();
    }
}
