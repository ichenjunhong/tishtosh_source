package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38099m;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.u */
public final class C38406u extends C38383h {

    /* renamed from: d */
    private final TextView f97753d;

    public C38406u(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.dh8);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_time_head)");
        this.f97753d = (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo78316a(C38099m mVar) {
        C52711k.m112240b(mVar, "notice");
        switch (mVar.timeLineType) {
            case 0:
                this.f97753d.setText(R.string.ckw);
                return;
            case 1:
                this.f97753d.setText(R.string.ckz);
                return;
            case 2:
                this.f97753d.setText(R.string.cl0);
                return;
            case 3:
                this.f97753d.setText(R.string.cky);
                return;
            case 4:
                this.f97753d.setText(R.string.ckx);
                return;
            case 5:
                this.f97753d.setText(R.string.ckv);
                break;
        }
    }
}
