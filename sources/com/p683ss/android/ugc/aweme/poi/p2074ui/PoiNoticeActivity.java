package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.p683ss.android.ugc.aweme.poi.utils.C39441b;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity */
public final class PoiNoticeActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C39266a f100342a = new C39266a(null);

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity$a */
    public static final class C39266a {
        private C39266a() {
        }

        public /* synthetic */ C39266a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m87280a(Context context, String str, C39092f fVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
            C52711k.m112240b(fVar, "data");
            Intent intent = new Intent(context, PoiNoticeActivity.class);
            intent.putExtra("INTENT_TITLE", str);
            intent.putExtra("INTENT_DATA", fVar);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity$b */
    static final class C39267b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiNoticeActivity f100343a;

        /* renamed from: b */
        final /* synthetic */ C52727e f100344b;

        C39267b(PoiNoticeActivity poiNoticeActivity, C52727e eVar) {
            this.f100343a = poiNoticeActivity;
            this.f100344b = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f100343a.finish();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        C39441b.m87688a(ImmersionBar.with((Activity) this));
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bme);
        if (VERSION.SDK_INT >= 19) {
            View findViewById = findViewById(R.id.csm);
            C52711k.m112236a((Object) findViewById, "findViewById<View>(R.id.status_bar)");
            findViewById.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("INTENT_DATA");
        if (serializableExtra != null) {
            C39092f fVar = (C39092f) serializableExtra;
            C52727e eVar = new C52727e();
            eVar.element = getIntent().getStringExtra("INTENT_TITLE");
            if (fVar != null) {
                View findViewById2 = findViewById(R.id.brz);
                C52711k.m112236a((Object) findViewById2, "findViewById<TextView>(R.id.notice_title)");
                ((TextView) findViewById2).setText((String) eVar.element);
                View findViewById3 = findViewById(R.id.bry);
                C52711k.m112236a((Object) findViewById3, "findViewById<TextView>(R.id.notice_summary)");
                ((TextView) findViewById3).setText(fVar.getTitle());
                View findViewById4 = findViewById(R.id.brr);
                C52711k.m112236a((Object) findViewById4, "findViewById<TextView>(R.id.notice_content)");
                ((TextView) findViewById4).setText(fVar.getDescription());
                C23515d.m57669a((RemoteImageView) findViewById(R.id.brx), fVar.getBannerUrl());
                findViewById(R.id.brp).setOnClickListener(new C39267b(this, eVar));
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct");
    }
}
