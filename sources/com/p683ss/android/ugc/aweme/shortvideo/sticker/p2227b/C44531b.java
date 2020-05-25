package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.b */
public final class C44531b extends C44526a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.b$a */
    static final class C44532a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44531b f112700a;

        C44532a(C44531b bVar) {
            this.f112700a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112700a.mo90467b();
            C44541f fVar = this.f112700a.f112692f;
            if (fVar != null) {
                fVar.mo88478a();
            }
            this.f112700a.f112690d.mo88524a(true);
        }
    }

    /* renamed from: c */
    public final View mo90468c() {
        LinearLayout d = mo90469d();
        LinearLayout a = mo90464a(R.drawable.ea, R.string.akz);
        a.setOnClickListener(new C44532a(this));
        d.addView(a);
        return d;
    }

    public C44531b(View view, C44541f fVar) {
        C52711k.m112240b(view, "contentView");
        super(view, fVar);
    }
}
