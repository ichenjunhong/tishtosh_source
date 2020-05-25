package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.C0535b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.l */
public final class C29743l extends C0535b implements OnClickListener, C29689c {

    /* renamed from: d */
    private String f77681d;

    /* renamed from: e */
    private Aweme f77682e;

    /* renamed from: f */
    private Context f77683f;

    /* renamed from: g */
    private C29686a f77684g;

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
        C10691a.m21548c(C11010c.m22280a(), (int) R.string.wl).mo19066a();
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
        this.f77682e.setCollectStatus(0);
        C23324d.m57378a().updateCollectStatus(this.f77682e.getAid(), 0);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.dlb) {
            if (this.f77684g != null) {
                this.f77684g.mo44934a_(Integer.valueOf(2), this.f77682e.getAid(), Integer.valueOf(0));
                C26890h.m65011a("cancel_favourite_video", C23089d.m56640a().mo47829a("enter_from", this.f77681d).mo47829a("group_id", this.f77682e.getAid()).f61491a);
            }
            dismiss();
            return;
        }
        if (id == R.id.dla) {
            dismiss();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.b3y);
        int b = C9432q.m18688b(this.f77683f) - C9432q.m18695e(this.f77683f);
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        View findViewById = findViewById(R.id.dlb);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        TextView textView = (TextView) findViewById(R.id.dla);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.f77684g = new C29686a();
        this.f77684g.mo54800a(this);
    }

    public C29743l(Context context, Aweme aweme, String str) {
        super(context, R.style.a6r);
        this.f77682e = aweme;
        this.f77683f = context;
        this.f77681d = str;
    }
}
