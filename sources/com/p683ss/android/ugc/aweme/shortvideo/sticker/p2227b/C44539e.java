package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.e */
public final class C44539e extends C44526a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.e$a */
    static final class C44540a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44539e f112706a;

        C44540a(C44539e eVar) {
            this.f112706a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112706a.mo90467b();
            C44541f fVar = this.f112706a.f112692f;
            if (fVar != null) {
                fVar.mo88479b();
            }
        }
    }

    /* renamed from: c */
    public final View mo90468c() {
        LinearLayout d = mo90469d();
        LinearLayout a = mo90464a(R.drawable.e_, R.string.alj);
        a.setOnClickListener(new C44540a(this));
        d.addView(a);
        return d;
    }

    public C44539e(View view, C44541f fVar) {
        C52711k.m112240b(view, "contentView");
        super(view, fVar);
    }
}
