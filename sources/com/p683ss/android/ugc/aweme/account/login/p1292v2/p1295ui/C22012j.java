package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.j */
final /* synthetic */ class C22012j implements OnClickListener {

    /* renamed from: a */
    private final C22006f f59486a;

    C22012j(C22006f fVar) {
        this.f59486a = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C22006f fVar = this.f59486a;
        if (fVar.f59477f == null) {
            fVar.f59481j.dismiss();
        } else if (TextUtils.isEmpty(fVar.f59474c.getText().toString())) {
            fVar.f59476e.setVisibility(8);
            fVar.f59475d.setText(R.string.ayx);
            fVar.f59475d.setVisibility(0);
        } else {
            fVar.f59477f.onOk(fVar.f59474c.getText().toString(), fVar.f59480i);
        }
    }
}
