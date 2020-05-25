package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.p1057b.p1058a.C17421k;
import com.p683ss.android.ugc.aweme.utils.KeyBoardMonitor.C47648a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.p */
public final class C45207p implements C47648a {

    /* renamed from: a */
    LinearLayout f114367a;

    /* renamed from: b */
    private ColorDrawable f114368b;

    /* renamed from: c */
    private ColorDrawable f114369c;

    /* renamed from: a */
    public final void mo91495a() {
        if (VERSION.SDK_INT > 23) {
            if (this.f114369c == null) {
                this.f114369c = new ColorDrawable(this.f114367a.getContext().getResources().getColor(R.color.a3i, null));
            }
            if (this.f114367a.getForeground() != this.f114369c) {
                this.f114367a.setForeground(this.f114369c);
                this.f114367a.getForeground().setAlpha(NormalGiftView.MASK_TRANSLATE_VALUE);
            }
        }
    }

    /* renamed from: b */
    public final void mo91496b() {
        if (VERSION.SDK_INT > 23) {
            if (this.f114368b == null) {
                this.f114368b = new ColorDrawable(this.f114367a.getContext().getResources().getColor(R.color.arz, null));
            }
            if (this.f114367a.getForeground() != this.f114368b) {
                this.f114367a.setForeground(this.f114368b);
            }
        }
    }

    public C45207p(LinearLayout linearLayout) {
        this.f114367a = (LinearLayout) C17421k.m42653a(linearLayout);
    }
}
