package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24528b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.SearchAwemeViewHolder */
public class SearchAwemeViewHolder extends C1352v {

    /* renamed from: a */
    public SearchChallenge f64957a;
    TextView mDescView;
    TextView mJoinCountView;
    TextView mTitleView;
    int margin;

    public SearchAwemeViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (SearchAwemeViewHolder.this.f64957a != null) {
                    if (SearchAwemeViewHolder.this.f64957a.challenge != null) {
                        C26890h.onEvent(MobClick.obtain().setEventName("challenge_add").setLabelName("publish").setValue(SearchAwemeViewHolder.this.f64957a.challenge.getCid()).setJsonObject(C23088c.m56631a().mo47824a("search_keyword", SearchAwemeViewHolder.this.mTitleView.getText().toString()).mo47825b()));
                    }
                    if (SearchAwemeViewHolder.this.f64957a.isFake) {
                        C47718bf.m103288a(new C24528b(1, SearchAwemeViewHolder.this.f64957a.challenge));
                    } else if (SearchAwemeViewHolder.this.f64957a.challenge != null) {
                        C47718bf.m103288a(new C24528b(SearchAwemeViewHolder.this.f64957a.challenge));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SpannableString mo50299a(SpannableString spannableString, int i, int i2) {
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getResources().getColor(R.color.a36)), max, i2, 17);
        return spannableString;
    }
}
