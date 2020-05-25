package com.p683ss.android.ugc.aweme.poi.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.poi.widget.RatingBar.C39475c;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.g */
final /* synthetic */ class C39493g implements OnClickListener {

    /* renamed from: a */
    private final RatingBar f101031a;

    /* renamed from: b */
    private final ImageView f101032b;

    C39493g(RatingBar ratingBar, ImageView imageView) {
        this.f101031a = ratingBar;
        this.f101032b = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        RatingBar ratingBar = this.f101031a;
        ImageView imageView = this.f101032b;
        if (ratingBar.f100944a) {
            int i = (int) ratingBar.f100945b;
            if (new BigDecimal(Float.toString(ratingBar.f100945b)).subtract(new BigDecimal(Integer.toString(i))).floatValue() == 0.0f) {
                i--;
            }
            if (ratingBar.indexOfChild(view) > i) {
                ratingBar.setStar((float) (ratingBar.indexOfChild(view) + 1));
            } else if (ratingBar.indexOfChild(view) != i) {
                ratingBar.setStar(((float) ratingBar.indexOfChild(view)) + 1.0f);
            } else if (ratingBar.f100947d != C39475c.Full) {
                if (imageView.getDrawable().getCurrent().getConstantState().equals(ratingBar.f100946c.getConstantState())) {
                    ratingBar.setStar((float) (ratingBar.indexOfChild(view) + 1));
                } else {
                    ratingBar.setStar(((float) ratingBar.indexOfChild(view)) + 0.5f);
                }
            }
        }
    }
}
