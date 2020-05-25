package com.p683ss.android.ugc.aweme.live.p1924g;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.ies.dmt.p664ui.widget.DoubleColorBallAnimationView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.live.g.a */
public final class C36094a {

    /* renamed from: a */
    public Activity f92476a;

    /* renamed from: b */
    public HSImageView f92477b;

    /* renamed from: c */
    public boolean f92478c = true;

    /* renamed from: d */
    public boolean f92479d = true;

    /* renamed from: e */
    public View f92480e;

    /* renamed from: f */
    public DoubleColorBallAnimationView f92481f;

    /* renamed from: g */
    public long f92482g;

    /* renamed from: h */
    private ViewStub f92483h;

    public C36094a(Activity activity) {
        this.f92476a = activity;
        if (this.f92476a != null) {
            this.f92483h = (ViewStub) this.f92476a.findViewById(R.id.ekk);
            if (this.f92483h != null) {
                this.f92480e = this.f92483h.inflate();
                if (this.f92480e != null) {
                    this.f92477b = (HSImageView) this.f92480e.findViewById(R.id.bc5);
                    this.f92481f = (DoubleColorBallAnimationView) this.f92480e.findViewById(R.id.ejd);
                }
            }
        }
    }
}
