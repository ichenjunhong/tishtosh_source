package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38971c;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38959d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder */
public class PoiCateTitleViewHolder extends C1352v {

    /* renamed from: a */
    private Context f99339a;
    View mMoreArrow;
    View mMoreTxt;
    TextView mTxtTitle;

    public PoiCateTitleViewHolder(View view) {
        super(view);
        this.f99339a = view.getContext();
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo79141a(C38959d dVar, final C39067g gVar, final C38971c cVar) {
        if (dVar != null) {
            if (dVar.isAweme) {
                this.mTxtTitle.setText(R.string.cq_);
            } else {
                this.mTxtTitle.setText(R.string.cqa);
            }
            if (dVar.showMore) {
                this.mMoreTxt.setVisibility(0);
                this.mMoreArrow.setVisibility(0);
                this.mTxtTitle.setTextSize(1, 17.0f);
                this.mTxtTitle.setTextColor(this.f99339a.getResources().getColor(R.color.pg));
                this.itemView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (cVar != null) {
                            cVar.mo79129a(gVar.getAwemeId(), gVar.getPoiId(), false, 1);
                        }
                    }
                });
                return;
            }
            this.mMoreTxt.setVisibility(8);
            this.mMoreArrow.setVisibility(8);
            this.mTxtTitle.setTextSize(1, 13.0f);
            this.mTxtTitle.setTextColor(this.f99339a.getResources().getColor(R.color.ye));
        }
    }
}
