package com.p683ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout.C26950b;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26989a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30828c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.share.p2151c.C41996b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.push.e */
public final class C40900e extends C41996b implements OnClickListener, C26989a {

    /* renamed from: a */
    public int f104086a = 5000;

    /* renamed from: b */
    public boolean f104087b = false;

    /* renamed from: c */
    public C40902a f104088c;

    /* renamed from: d */
    public long f104089d = 0;

    /* renamed from: e */
    public Activity f104090e;

    /* renamed from: f */
    public View f104091f;

    /* renamed from: g */
    SmartAvatarImageView f104092g;

    /* renamed from: h */
    DmtTextView f104093h;

    /* renamed from: i */
    DmtTextView f104094i;

    /* renamed from: j */
    String f104095j;

    /* renamed from: k */
    public String f104096k;

    /* renamed from: l */
    private PullUpLayout f104097l;

    /* renamed from: m */
    private View f104098m = ((LayoutInflater) C11010c.m22280a().getSystemService("layout_inflater")).inflate(R.layout.b_i, null);

    /* renamed from: n */
    private LiveCircleView f104099n;

    /* renamed from: o */
    private C30828c f104100o;

    /* renamed from: com.ss.android.ugc.aweme.push.e$a */
    class C40902a implements Runnable {

        /* renamed from: a */
        boolean f104102a;

        public final void run() {
            if (!this.f104102a && System.currentTimeMillis() >= C40900e.this.f104089d && C40900e.this.isShowing()) {
                C40904g.m90483a(C40900e.this.f104096k, "others");
                C40900e.this.mo63557c();
            }
        }

        private C40902a() {
        }
    }

    /* renamed from: d */
    private void m90478d() {
        this.f104100o.mo63567d();
    }

    /* renamed from: a */
    public final void mo55136a() {
        this.f104087b = false;
        if (isShowing()) {
            C40904g.m90483a(this.f104096k, "draw");
            mo63557c();
        }
    }

    /* renamed from: c */
    public final void mo63557c() {
        if (isShowing() && !this.f104087b) {
            try {
                if (this.f104090e != null && !this.f104090e.isFinishing()) {
                    this.f104097l.mo54988a(0.0f, true);
                    m90478d();
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.f104090e = null;
        }
    }

    public C40900e() {
        super(C11010c.m22280a());
        View view = this.f104098m;
        this.f104091f = view.findViewById(R.id.cdu);
        this.f104091f.setOnClickListener(this);
        this.f104092g = (SmartAvatarImageView) view.findViewById(R.id.ay2);
        this.f104099n = (LiveCircleView) view.findViewById(R.id.bcb);
        this.f104100o = new C30828c(true, this.f104092g, this.f104092g, this.f104099n);
        this.f104093h = (DmtTextView) view.findViewById(R.id.dhb);
        this.f104094i = (DmtTextView) view.findViewById(R.id.dbw);
        this.f104097l = (PullUpLayout) view.findViewById(R.id.c70);
        this.f104097l.mo54989a(this.f104091f, false);
        this.f104097l.setPullUpListener(this);
        this.f104097l.setInternalTouchEventListener(new C26950b() {
            /* renamed from: a */
            public final void mo55002a(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        C40900e.this.f104087b = true;
                        if (C40900e.this.f104088c != null) {
                            C40900e.this.f104088c.f104102a = true;
                            return;
                        }
                        break;
                    case 1:
                        C40900e.this.f104087b = false;
                        C40900e.this.f104089d = System.currentTimeMillis() + ((long) C40900e.this.f104086a);
                        C40900e.this.f104088c.f104102a = false;
                        C40900e.this.f104091f.postDelayed(C40900e.this.f104088c, (long) C40900e.this.f104086a);
                        break;
                    case 2:
                        C40900e.this.f104087b = true;
                        return;
                }
            }
        });
        this.f104088c = new C40902a();
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.f104098m);
        setWidth(C9432q.m18670a(C11010c.m22280a()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.wt);
    }

    /* renamed from: b */
    public final void mo63556b() {
        int i;
        this.f104097l.mo54987a();
        if (this.f104090e != null && !this.f104090e.isFinishing() && !isShowing()) {
            this.f104089d = System.currentTimeMillis() + ((long) this.f104086a);
            this.f104097l.postDelayed(this.f104088c, (long) this.f104086a);
            if (this.f104098m.getParent() != null) {
                ((ViewGroup) this.f104098m.getParent()).removeView(this.f104098m);
            }
            try {
                View decorView = this.f104090e.getWindow().getDecorView();
                if (VERSION.SDK_INT >= 19) {
                    i = -C9432q.m18695e(C11010c.m22280a());
                } else {
                    i = C9432q.m18695e(C11010c.m22280a());
                }
                showAtLocation(decorView, 48, 0, i);
                C26890h.m65011a("livesdk_live_show", C23089d.m56640a().mo47829a("enter_method", "inner_push").mo47829a("enter_from_merge", "inner_push").mo47829a("room_id", this.f104096k).mo47829a("inner_push_type", "offical").f61491a);
                this.f104100o.mo63566c();
            } catch (Exception unused) {
            }
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.cdu && !C32800a.m75679a(view) && this.f104090e != null) {
            SmartRouter.buildRoute((Context) this.f104090e, this.f104095j).open();
            C26890h.m65011a("livesdk_rec_live_play", C23089d.m56640a().mo47829a("inner_push_type", "offical").mo47829a("enter_method", "inner_push").mo47829a("enter_from_merge", "inner_push").f61491a);
            C40904g.m90483a(this.f104096k, "others");
            mo63557c();
        }
    }
}
