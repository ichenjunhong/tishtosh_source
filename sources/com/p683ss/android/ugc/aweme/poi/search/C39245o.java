package com.p683ss.android.ugc.aweme.poi.search;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10721b;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39045e;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.search.o */
public final class C39245o extends C1352v implements OnClickListener {

    /* renamed from: a */
    TextView f100226a;

    /* renamed from: b */
    TextView f100227b;

    /* renamed from: c */
    TextView f100228c;

    /* renamed from: d */
    View f100229d;

    /* renamed from: e */
    View f100230e;

    /* renamed from: f */
    View f100231f;

    /* renamed from: g */
    PoiStruct f100232g;

    /* renamed from: h */
    String f100233h;

    /* renamed from: i */
    int f100234i = -1;

    /* renamed from: j */
    boolean f100235j;

    /* renamed from: k */
    private LinearLayout f100236k;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.awr) {
            if (this.f100232g != null) {
                this.f100232g.put("keyword", this.f100233h);
                this.f100232g.put("order", String.valueOf(this.f100234i));
            }
            C47718bf.m103288a(new C39045e(2, this.f100232g));
            return;
        }
        if (id == R.id.br5) {
            C47718bf.m103288a(new C39045e(1));
        }
    }

    public C39245o(View view, boolean z) {
        super(view);
        this.f100235j = z;
        this.f100226a = (TextView) view.findViewById(R.id.aws);
        this.f100227b = (TextView) view.findViewById(R.id.awm);
        this.f100228c = (TextView) view.findViewById(R.id.edh);
        this.f100229d = view.findViewById(R.id.awo);
        this.f100230e = view.findViewById(R.id.awq);
        this.f100236k = (LinearLayout) view.findViewById(R.id.awr);
        this.f100231f = view.findViewById(R.id.br5);
        this.f100236k.setOnClickListener(this);
        this.f100231f.setOnClickListener(this);
        this.f100236k.setOnTouchListener(new C10721b(0.5f, 1.0f));
    }
}
