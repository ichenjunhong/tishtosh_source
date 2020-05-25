package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.poi.adapter.C38971c;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38958c;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder */
public class PoiCateMoreViewHolder extends C1352v {
    View mDivider;
    TextView mTxtMore;

    public PoiCateMoreViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo79139a(C38958c cVar, boolean z, int i, C38971c cVar2) {
        View view = this.itemView;
        final C38971c cVar3 = cVar2;
        final C38958c cVar4 = cVar;
        final boolean z2 = z;
        final int i2 = i;
        C389931 r1 = new OnClickListener() {
            public final void onClick(View view) {
                int i;
                ClickInstrumentation.onClick(view);
                if (cVar3 != null) {
                    C38971c cVar = cVar3;
                    String str = cVar4.aid;
                    String str2 = cVar4.relatedId;
                    boolean z = z2;
                    if (z2) {
                        i = i2;
                    } else {
                        i = cVar4.targetPosition;
                    }
                    cVar.mo79129a(str, str2, z, i);
                }
            }
        };
        view.setOnClickListener(r1);
        if (cVar.showDividerLine) {
            this.mDivider.setVisibility(0);
        } else {
            this.mDivider.setVisibility(8);
        }
    }
}
