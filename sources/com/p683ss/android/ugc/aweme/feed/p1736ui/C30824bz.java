package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout.C26950b;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26989a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.share.p2151c.C41996b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bz */
public final class C30824bz extends C41996b implements OnClickListener, C26989a {

    /* renamed from: a */
    public int f80741a = 4000;

    /* renamed from: b */
    public boolean f80742b = false;

    /* renamed from: c */
    public C30827a f80743c;

    /* renamed from: d */
    public long f80744d = 0;

    /* renamed from: e */
    public View f80745e = ((LayoutInflater) C11010c.m22280a().getSystemService("layout_inflater")).inflate(R.layout.but, null);

    /* renamed from: f */
    public Activity f80746f;

    /* renamed from: g */
    public RelativeLayout f80747g;

    /* renamed from: h */
    public RemoteImageView f80748h;

    /* renamed from: i */
    public Aweme f80749i;

    /* renamed from: j */
    private PullUpLayout f80750j;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bz$a */
    class C30827a implements Runnable {

        /* renamed from: a */
        boolean f80754a;

        public final void run() {
            if (!this.f80754a && System.currentTimeMillis() >= C30824bz.this.f80744d) {
                C30824bz.this.mo63557c();
            }
        }

        private C30827a() {
        }
    }

    /* renamed from: a */
    public final void mo55136a() {
        this.f80742b = false;
        mo63557c();
    }

    /* renamed from: c */
    public final void mo63557c() {
        if (isShowing() && !this.f80742b) {
            try {
                if (this.f80746f != null && !this.f80746f.isFinishing()) {
                    this.f80750j.mo54988a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.f80746f = null;
        }
    }

    /* renamed from: b */
    public final void mo63556b() {
        int i;
        this.f80750j.mo54987a();
        if (this.f80746f != null && !this.f80746f.isFinishing() && !isShowing()) {
            this.f80744d = System.currentTimeMillis() + ((long) this.f80741a);
            this.f80750j.postDelayed(this.f80743c, (long) this.f80741a);
            if (this.f80745e.getParent() != null) {
                ((ViewGroup) this.f80745e.getParent()).removeView(this.f80745e);
            }
            try {
                View decorView = this.f80746f.getWindow().getDecorView();
                if (VERSION.SDK_INT >= 19) {
                    i = -C9432q.m18695e(C11010c.m22280a());
                } else {
                    i = C9432q.m18695e(C11010c.m22280a());
                }
                showAtLocation(decorView, 48, 0, i);
            } catch (Exception unused) {
            }
        }
    }

    public C30824bz() {
        super(C11010c.m22280a());
        View view = this.f80745e;
        this.f80748h = (RemoteImageView) view.findViewById(R.id.b1n);
        this.f80747g = (RelativeLayout) view.findViewById(R.id.cdu);
        this.f80750j = (PullUpLayout) view.findViewById(R.id.c70);
        this.f80750j.mo54989a((View) this.f80747g, false);
        this.f80750j.setPullUpListener(this);
        this.f80748h.setOnClickListener(this);
        this.f80750j.setInternalTouchEventListener(new C26950b() {
            /* renamed from: a */
            public final void mo55002a(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        C30824bz.this.f80742b = true;
                        if (C30824bz.this.f80743c != null) {
                            C30824bz.this.f80743c.f80754a = true;
                            return;
                        }
                        break;
                    case 1:
                        C30824bz.this.f80742b = false;
                        C30824bz.this.f80744d = System.currentTimeMillis() + ((long) C30824bz.this.f80741a);
                        C30824bz.this.f80743c.f80754a = false;
                        C30824bz.this.f80747g.postDelayed(C30824bz.this.f80743c, (long) C30824bz.this.f80741a);
                        break;
                    case 2:
                        C30824bz.this.f80742b = true;
                        return;
                }
            }
        });
        this.f80743c = new C30827a();
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.f80745e);
        setWidth(C9432q.m18670a(C11010c.m22280a()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.wt);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.b1n) {
            C41302w a = C41302w.m91042a();
            Activity activity = this.f80746f;
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(this.f80749i.getAid());
            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("refer", "upload").mo83871a());
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setPublishStatus(11);
            mo63557c();
        }
    }
}
