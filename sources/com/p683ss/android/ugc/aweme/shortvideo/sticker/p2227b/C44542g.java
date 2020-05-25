package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.g */
public final class C44542g extends C44526a {

    /* renamed from: h */
    public boolean f112707h = true;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.g$a */
    static final class C44543a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44542g f112708a;

        C44543a(C44542g gVar) {
            this.f112708a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112708a.mo90467b();
            C44541f fVar = this.f112708a.f112692f;
            if (fVar != null) {
                fVar.mo88478a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.g$b */
    static final class C44544b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44542g f112709a;

        C44544b(C44542g gVar) {
            this.f112709a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112709a.mo90467b();
            C44541f fVar = this.f112709a.f112692f;
            if (fVar != null) {
                fVar.mo88479b();
            }
        }
    }

    /* renamed from: c */
    public final View mo90468c() {
        LinearLayout d = mo90469d();
        LinearLayout a = mo90464a(R.drawable.ea, R.string.akz);
        LinearLayout a2 = mo90464a(R.drawable.e_, R.string.alj);
        a.setOnClickListener(new C44543a(this));
        a2.setOnClickListener(new C44544b(this));
        if (this.f112707h) {
            d.addView(a);
            d.addView(mo90470e());
        }
        d.addView(a2);
        return d;
    }

    public C44542g(View view, C44541f fVar) {
        C52711k.m112240b(view, "contentView");
        super(view, fVar);
    }
}
