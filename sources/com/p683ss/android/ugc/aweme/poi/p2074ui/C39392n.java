package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.n */
final /* synthetic */ class C39392n implements Runnable {

    /* renamed from: a */
    private final C39389l f100768a;

    C39392n(C39389l lVar) {
        this.f100768a = lVar;
    }

    public final void run() {
        C39389l lVar = this.f100768a;
        if (lVar.f100757a != null && lVar.f100757a.isViewValid() && lVar.mo80355a() != null) {
            if (lVar.f100760d == null || !lVar.f100760d.isShowing()) {
                lVar.f100760d = new C39481c(lVar.mo80355a());
                View inflate = ((LayoutInflater) lVar.mo80355a().getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.bo5, null);
                ((DmtTextView) inflate.findViewById(R.id.cya)).setText(R.string.cqf);
                ((DmtTextView) inflate.findViewById(R.id.cyb)).setText(R.string.cr3);
                ((LinearLayout) inflate.findViewById(R.id.bez)).setOnClickListener(new C39393o(lVar));
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) C9432q.m18687b((Context) lVar.mo80355a(), 4.0f);
                inflate.findViewById(R.id.cyb).setLayoutParams(layoutParams);
                lVar.f100760d.mo80487a((int) C9432q.m18687b((Context) lVar.mo80355a(), 202.0f), (int) C9432q.m18687b((Context) lVar.mo80355a(), 50.0f));
                lVar.f100760d.mo80499c(Color.parseColor("#33FFFFFF"));
                lVar.f100760d.f101001p = 200;
                lVar.f100760d.f101002q = 200;
                lVar.f100760d.mo80488a(inflate);
                lVar.f100760d.f100999n = 3000;
                float width = (float) ((lVar.f100760d.getWidth() - lVar.f100761e.getWidth()) / 2);
                lVar.f100760d.f100993h = lVar.f100762f ? -16 : -4;
                lVar.f100760d.mo80490a(lVar.f100761e, (int) width, (int) (-width));
            }
        }
    }
}
