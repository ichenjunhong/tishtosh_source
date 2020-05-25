package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bp */
public abstract class C28590bp<T> {

    /* renamed from: a */
    protected Context f75103a;

    /* renamed from: b */
    protected View f75104b;

    /* renamed from: c */
    public DmtTextView f75105c = ((DmtTextView) this.f75104b.findViewById(R.id.cjh));

    /* renamed from: d */
    protected TextView f75106d = ((TextView) this.f75104b.findViewById(R.id.cjm));

    /* renamed from: e */
    protected ViewGroup f75107e = ((ViewGroup) this.f75104b.findViewById(R.id.cjj));

    /* renamed from: f */
    protected LinearLayout f75108f = ((LinearLayout) this.f75104b.findViewById(R.id.cjg));

    /* renamed from: g */
    protected C28592a f75109g;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bp$a */
    public interface C28592a {
        /* renamed from: a */
        void mo56765a();
    }

    /* renamed from: a */
    public final View mo58282a() {
        return this.f75104b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58283a(View view) {
        if (this.f75109g != null) {
            this.f75109g.mo56765a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58284a(boolean z) {
        if (z) {
            this.f75107e.setVisibility(0);
        } else {
            this.f75107e.setVisibility(8);
        }
    }

    public C28590bp(View view, Context context, C28592a aVar) {
        this.f75104b = view;
        this.f75103a = context;
        this.f75109g = aVar;
        this.f75107e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C28590bp.this.f75109g != null) {
                    C28590bp.this.f75109g.mo56765a();
                }
            }
        });
        View findViewById = this.f75104b.findViewById(R.id.eld);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C28593bq(this));
        }
        C28594br.m67825a(this.f75104b.findViewById(R.id.ax6));
    }
}
