package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.n */
final /* synthetic */ class C47276n implements Runnable {

    /* renamed from: a */
    private final MvTemplateView f119360a;

    /* renamed from: b */
    private final int f119361b;

    /* renamed from: c */
    private final List f119362c;

    C47276n(MvTemplateView mvTemplateView, int i, List list) {
        this.f119360a = mvTemplateView;
        this.f119361b = i;
        this.f119362c = list;
    }

    public final void run() {
        MvTemplateView mvTemplateView = this.f119360a;
        int i = this.f119361b;
        List list = this.f119362c;
        if (i == 0) {
            mvTemplateView.f119211q.notifyDataSetChanged();
        } else {
            mvTemplateView.f119211q.notifyItemRangeInserted(i + 1, list.size());
        }
    }
}
