package com.p683ss.android.ugc.trill.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.share.g */
final /* synthetic */ class C50455g implements OnClickListener {

    /* renamed from: a */
    private final SyncShareView f126511a;

    C50455g(SyncShareView syncShareView) {
        this.f126511a = syncShareView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        SyncShareView syncShareView = this.f126511a;
        syncShareView.mo98319a(syncShareView.mRadioGroup.getCheckedRadioButtonId() == R.id.p1, "download");
    }
}
