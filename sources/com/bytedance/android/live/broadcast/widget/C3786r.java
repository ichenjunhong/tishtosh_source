package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.floatwindow.ControlButton;
import com.bytedance.android.livesdk.floatwindow.ControlButton.C7168a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.widget.r */
public final class C3786r extends LinearLayout {

    /* renamed from: a */
    public ControlButton f10701a;

    /* renamed from: b */
    public ControlButton f10702b;

    /* renamed from: c */
    public C3791a f10703c;

    /* renamed from: d */
    public LinearLayout f10704d = ((LinearLayout) findViewById(R.id.za));

    /* renamed from: e */
    private ControlButton f10705e = ((ControlButton) findViewById(R.id.ou));

    /* renamed from: f */
    private ControlButton f10706f;

    /* renamed from: g */
    private ImageView f10707g = ((ImageView) findViewById(R.id.b1k));

    /* renamed from: com.bytedance.android.live.broadcast.widget.r$a */
    public interface C3791a {
        /* renamed from: a */
        void mo8410a();

        /* renamed from: a */
        void mo8411a(boolean z);

        /* renamed from: b */
        void mo8412b();

        /* renamed from: b */
        void mo8413b(boolean z);
    }

    private int getLayoutId() {
        return R.layout.aqa;
    }

    /* renamed from: a */
    public final void mo9158a() {
        this.f10704d.setVisibility(8);
    }

    /* renamed from: b */
    public final boolean mo9159b() {
        if (this.f10704d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void setOnViewClickListener(C3791a aVar) {
        this.f10703c = aVar;
    }

    public final void setMsgBtn(boolean z) {
        this.f10702b.setChecked(z);
    }

    public C3786r(Context context) {
        super(context);
        inflate(getContext(), getLayoutId(), this);
        this.f10705e.mo13295a(R.drawable.bvz, R.drawable.bvz, R.color.alt, R.color.alt, R.string.ehc, R.string.ehc, false);
        this.f10701a = (ControlButton) findViewById(R.id.oi);
        this.f10701a.mo13295a(R.drawable.bwq, R.drawable.bwr, R.color.alt, R.color.a_h, R.string.eha, R.string.ehb, true);
        this.f10702b = (ControlButton) findViewById(R.id.oh);
        this.f10702b.mo13295a(R.drawable.bwo, R.drawable.bwp, R.color.alt, R.color.a_h, R.string.eh9, R.string.eh_, true);
        this.f10706f = (ControlButton) findViewById(R.id.p0);
        this.f10706f.mo13295a(R.drawable.bym, R.drawable.bym, R.color.alt, R.color.alt, R.string.ehd, R.string.ehd, false);
        this.f10705e.setOnViewClickListener(new C7168a() {
            /* renamed from: a */
            public final void mo9162a() {
                if (C3786r.this.f10703c != null) {
                    C3786r.this.f10703c.mo8410a();
                }
            }
        });
        this.f10701a.setOnViewClickListener(new C7168a() {
            /* renamed from: a */
            public final void mo9162a() {
                if (C3786r.this.f10703c != null) {
                    C3786r.this.f10703c.mo8411a(C3786r.this.f10701a.f19457a);
                }
            }
        });
        this.f10702b.setOnViewClickListener(new C7168a() {
            /* renamed from: a */
            public final void mo9162a() {
                if (C3786r.this.f10703c != null) {
                    C3786r.this.f10703c.mo8413b(C3786r.this.f10702b.f19457a);
                }
            }
        });
        this.f10706f.setOnViewClickListener(new C7168a() {
            /* renamed from: a */
            public final void mo9162a() {
                if (C3786r.this.f10703c != null) {
                    C3786r.this.f10703c.mo8412b();
                }
            }
        });
    }
}
