package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bu */
public abstract class C28598bu<T> {

    /* renamed from: a */
    private RecyclerView f75116a;

    /* renamed from: b */
    protected Context f75117b;

    /* renamed from: c */
    protected View f75118c;

    /* renamed from: d */
    public DmtTextView f75119d;

    /* renamed from: e */
    protected TextView f75120e;

    /* renamed from: f */
    protected ViewGroup f75121f;

    /* renamed from: g */
    protected C28600a f75122g;

    /* renamed from: h */
    protected C1322a f75123h;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bu$a */
    public interface C28600a {
        /* renamed from: a */
        void mo56761a();
    }

    /* renamed from: b */
    public final View mo58292b() {
        return this.f75118c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58289a() {
        this.f75119d = (DmtTextView) this.f75118c.findViewById(R.id.cjh);
        this.f75116a = (RecyclerView) this.f75118c.findViewById(R.id.cjg);
        this.f75120e = (TextView) this.f75118c.findViewById(R.id.cjm);
        this.f75121f = (ViewGroup) this.f75118c.findViewById(R.id.cjj);
        this.f75121f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C28598bu.this.f75122g != null) {
                    C28598bu.this.f75122g.mo56761a();
                }
            }
        });
        View findViewById = this.f75118c.findViewById(R.id.eld);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C28601bv(this));
        }
        C28594br.m67825a(this.f75118c.findViewById(R.id.ax6));
        if (this.f75123h != null) {
            this.f75116a.setAdapter(this.f75123h);
        }
    }

    /* renamed from: a */
    private void m67832a(List<C28540ba<T>> list) {
        ((C28484am) this.f75123h).mo58149a(list);
    }

    /* renamed from: a */
    public final void mo58290a(C1322a aVar) {
        this.f75123h = aVar;
        this.f75116a.setAdapter(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58291a(View view) {
        if (this.f75122g != null) {
            this.f75122g.mo56761a();
        }
    }

    protected C28598bu(View view, Context context, C28600a aVar) {
        this(view, context, null, aVar);
    }

    /* renamed from: b */
    public final void mo58293b(List<T> list, C41440e eVar, boolean z) {
        m67832a(C28540ba.m67706a(list, eVar, z));
    }

    /* renamed from: a */
    public void mo58287a(List<T> list, C41440e eVar, boolean z) {
        if (z) {
            this.f75121f.setVisibility(0);
        } else {
            this.f75121f.setVisibility(8);
        }
    }

    private C28598bu(View view, Context context, C1322a aVar, C28600a aVar2) {
        this.f75118c = view;
        this.f75117b = context;
        this.f75122g = aVar2;
        this.f75123h = null;
        mo58289a();
    }
}
