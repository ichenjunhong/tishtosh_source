package com.p683ss.android.ugc.aweme.comment;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.j */
final /* synthetic */ class C25211j implements OnClickListener {

    /* renamed from: a */
    private final C25156f f66794a;

    C25211j(C25156f fVar) {
        this.f66794a = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C25156f fVar = this.f66794a;
        Resources resources = fVar.f66596l.getResources();
        CharSequence[] charSequenceArr = {resources.getString(R.string.hb4), resources.getString(R.string.wf)};
        C26891a aVar = new C26891a(view.getContext());
        aVar.mo54844a(charSequenceArr, (DialogInterface.OnClickListener) new C25270m(fVar));
        aVar.mo54845b();
    }
}
