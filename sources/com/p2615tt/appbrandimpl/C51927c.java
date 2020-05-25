package com.p2615tt.appbrandimpl;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.experiment.MicroAppItemTypeExperiment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.tt.appbrandimpl.c */
public final class C51927c extends Dialog implements OnClickListener {

    /* renamed from: a */
    private DmtTextView f129604a;

    /* renamed from: b */
    private View f129605b;

    public C51927c(Context context) {
        super(context, R.style.vb);
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.ue) {
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C10181b.m20511a().mo18168a(MicroAppItemTypeExperiment.class, true, "micro_app_item_type", 31744, 0) == 1) {
            setContentView(R.layout.kd);
        } else {
            setContentView(R.layout.kc);
        }
        setCanceledOnTouchOutside(false);
        this.f129604a = (DmtTextView) findViewById(R.id.brz);
        this.f129605b = findViewById(R.id.ue);
        this.f129604a.setTypeface(Typeface.defaultFromStyle(1));
        this.f129605b.setOnClickListener(this);
    }
}
