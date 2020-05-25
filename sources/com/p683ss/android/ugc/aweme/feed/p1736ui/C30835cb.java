package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.feed.p1736ui.RatingBar.C30725c;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cb */
final /* synthetic */ class C30835cb implements OnClickListener {

    /* renamed from: a */
    private final RatingBar f80781a;

    /* renamed from: b */
    private final ImageView f80782b;

    C30835cb(RatingBar ratingBar, ImageView imageView) {
        this.f80781a = ratingBar;
        this.f80782b = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        RatingBar ratingBar = this.f80781a;
        ImageView imageView = this.f80782b;
        if (ratingBar.f80467b) {
            int i = (int) ratingBar.f80468c;
            if (new BigDecimal(Float.toString(ratingBar.f80468c)).subtract(new BigDecimal(Integer.toString(i))).floatValue() == 0.0f) {
                i--;
            }
            if (ratingBar.f80466a.indexOfChild(view) > i) {
                ratingBar.setStar((float) (ratingBar.f80466a.indexOfChild(view) + 1));
            } else if (ratingBar.f80466a.indexOfChild(view) != i) {
                ratingBar.setStar(((float) ratingBar.f80466a.indexOfChild(view)) + 1.0f);
            } else if (ratingBar.f80470e != C30725c.Full) {
                if (imageView.getDrawable().getCurrent().getConstantState().equals(ratingBar.f80469d.getConstantState())) {
                    ratingBar.setStar((float) (ratingBar.f80466a.indexOfChild(view) + 1));
                } else {
                    ratingBar.setStar(((float) ratingBar.f80466a.indexOfChild(view)) + 0.5f);
                }
            }
        }
    }
}
