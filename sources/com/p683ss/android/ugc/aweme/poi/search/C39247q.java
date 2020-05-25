package com.p683ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10721b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39045e;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.search.q */
public final class C39247q extends C1352v implements OnClickListener {

    /* renamed from: a */
    Context f100237a;

    /* renamed from: b */
    TextView f100238b;

    /* renamed from: c */
    TextView f100239c;

    /* renamed from: d */
    TextView f100240d;

    /* renamed from: e */
    TextView f100241e;

    /* renamed from: f */
    DmtTextView f100242f;

    /* renamed from: g */
    PoiStruct f100243g;

    /* renamed from: h */
    String f100244h;

    /* renamed from: i */
    int f100245i = -1;

    /* renamed from: j */
    boolean f100246j;

    /* renamed from: k */
    private View f100247k;

    /* renamed from: l */
    private int f100248l;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo80002a() {
        if (this.f100248l == 2 || this.f100248l == 3) {
            return true;
        }
        return false;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.awr) {
            if (this.f100243g != null) {
                this.f100243g.put("keyword", this.f100244h);
                this.f100243g.put("order", String.valueOf(this.f100245i));
            }
            C47718bf.m103288a(new C39045e(2, this.f100243g));
        } else if (id == R.id.br5 && !mo80002a()) {
            C47718bf.m103288a(new C39045e(1));
        }
    }

    public C39247q(View view, boolean z, int i) {
        super(view);
        this.f100237a = view.getContext();
        this.f100246j = z;
        this.f100248l = i;
        this.f100242f = (DmtTextView) view.findViewById(R.id.br5);
        this.f100242f.setOnClickListener(this);
        this.f100238b = (TextView) view.findViewById(R.id.awm);
        this.f100239c = (TextView) view.findViewById(R.id.awn);
        this.f100240d = (TextView) view.findViewById(R.id.awp);
        this.f100241e = (TextView) view.findViewById(R.id.edh);
        this.f100247k = view.findViewById(R.id.awr);
        this.f100247k.setOnClickListener(this);
        this.f100247k.setOnTouchListener(new C10721b(0.5f, 1.0f));
    }
}
