package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cz */
final /* synthetic */ class C30894cz implements OnClickListener {

    /* renamed from: a */
    private final C30890cy f80926a;

    C30894cz(C30890cy cyVar) {
        this.f80926a = cyVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C30890cy cyVar = this.f80926a;
        if (TextUtils.isEmpty(cyVar.f80911w) || TextUtils.isEmpty(cyVar.f80913y)) {
            cyVar.f80911w = new SpannableStringBuilder(cyVar.f79011d.getProcessedDesc());
            cyVar.f80913y = new SpannableStringBuilder(cyVar.f79011d.getEllipsizeDesc());
        }
        boolean equals = cyVar.f80905q.getText().equals(cyVar.f79017j.getString(R.string.b1o));
        if (equals) {
            cyVar.mo63646a(cyVar.f80911w, equals);
        } else {
            cyVar.mo63646a(cyVar.f80913y, equals);
        }
    }
}
