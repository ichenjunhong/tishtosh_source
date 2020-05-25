package com.p683ss.android.ugc.aweme.commercialize.p1566f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.story.model.StoryResponse.C46654a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.f.b */
public final class C25831b implements C25834e {

    /* renamed from: a */
    static C46654a f68281a;

    /* renamed from: b */
    private C25832c f68282b;

    private C25831b() {
    }

    /* renamed from: a */
    public final void mo53036a() {
        this.f68282b.mo53038a(f68281a);
    }

    /* renamed from: a */
    public static void m62485a(C46654a aVar) {
        f68281a = aVar;
    }

    public C25831b(Context context) {
        C25833d dVar = new C25833d(context);
        dVar.setPadding((int) C9432q.m18687b(context, 16.0f), (int) C9432q.m18687b(context, 2.0f), 0, 0);
        C25830a aVar = new C25830a();
        aVar.mo53033a(dVar);
        this.f68282b = new C25832c(dVar, aVar);
    }

    /* renamed from: a */
    public final void mo53037a(ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this.f68282b.mo75838c());
        if (indexOfChild != 0) {
            if (indexOfChild > 0) {
                viewGroup.removeView(this.f68282b.mo75838c());
            }
            viewGroup.addView(this.f68282b.mo75838c(), 0);
            View childAt = viewGroup.getChildAt(1);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin -= (int) C9432q.m18687b(viewGroup.getContext(), 9.0f);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }
}
