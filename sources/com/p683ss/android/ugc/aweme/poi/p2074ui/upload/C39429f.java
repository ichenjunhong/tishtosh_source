package com.p683ss.android.ugc.aweme.poi.p2074ui.upload;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.feed.C30433j;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.f */
public final class C39429f extends Dialog {

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.f$a */
    static final class C39430a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39429f f100851a;

        C39430a(C39429f fVar) {
            this.f100851a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f100851a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.f$b */
    static final class C39431b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39429f f100852a;

        C39431b(C39429f fVar) {
            this.f100852a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C30433j.m71357d(false);
            this.f100852a.dismiss();
        }
    }

    public C39429f(Context context) {
        C52711k.m112240b(context, "context");
        super(context, R.style.a70);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bmo);
        setCanceledOnTouchOutside(false);
        ((DmtTextView) findViewById(R.id.b68)).setOnClickListener(new C39430a(this));
        ((DmtTextView) findViewById(R.id.brm)).setOnClickListener(new C39431b(this));
    }
}
