package com.p683ss.android.ugc.aweme.adaptation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.adaptation.C22453b.C22457c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;

/* renamed from: com.ss.android.ugc.aweme.adaptation.e */
final /* synthetic */ class C22461e implements Runnable {

    /* renamed from: a */
    private final View f60500a;

    /* renamed from: b */
    private final int f60501b;

    /* renamed from: c */
    private final View f60502c;

    /* renamed from: d */
    private final View f60503d;

    /* renamed from: e */
    private final C22457c f60504e;

    C22461e(View view, int i, View view2, View view3, C22457c cVar) {
        this.f60500a = view;
        this.f60501b = i;
        this.f60502c = view2;
        this.f60503d = view3;
        this.f60504e = cVar;
    }

    public final void run() {
        View view = this.f60500a;
        int i = this.f60501b;
        View view2 = this.f60502c;
        View view3 = this.f60503d;
        C22457c cVar = this.f60504e;
        int a = C23728o.m58241a(58.0d);
        if (i == 1) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.bottomMargin != a) {
                layoutParams.bottomMargin = a;
                view.setLayoutParams(layoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2.height != a) {
            layoutParams2.height = a;
            view2.setLayoutParams(layoutParams2);
        }
        if (view3 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
            if (layoutParams3.height != a) {
                layoutParams3.height = a;
                layoutParams3.topMargin = -a;
                view3.setLayoutParams(layoutParams3);
            }
        }
        if (cVar != null) {
            cVar.mo46748a();
        }
    }
}
