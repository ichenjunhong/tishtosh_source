package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager.BadTokenException;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.app.services.C23165l;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26132m;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26502cf;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26515i;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout.C26950b;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26989a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment;
import com.p683ss.android.ugc.aweme.share.p2151c.C41996b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.MicroShareChannelBar;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.d */
public abstract class C41997d extends C41996b implements C26989a {

    /* renamed from: a */
    protected View f106295a;

    /* renamed from: b */
    protected Activity f106296b;

    /* renamed from: c */
    public LinearLayout f106297c;

    /* renamed from: d */
    public C42001a f106298d;

    /* renamed from: e */
    public int f106299e = 4000;

    /* renamed from: f */
    public boolean f106300f;

    /* renamed from: g */
    protected C42348d f106301g;

    /* renamed from: h */
    protected Aweme f106302h;

    /* renamed from: i */
    protected MicroShareChannelBar f106303i;

    /* renamed from: j */
    public long f106304j;

    /* renamed from: k */
    private RemoteImageView f106305k;

    /* renamed from: l */
    private PullUpLayout f106306l;

    /* renamed from: m */
    private View f106307m;

    /* renamed from: n */
    private RemoteImageView f106308n;

    /* renamed from: o */
    private TextView f106309o;

    /* renamed from: p */
    private View f106310p;

    /* renamed from: q */
    private LinearLayout f106311q;

    /* renamed from: r */
    private int f106312r = 49;

    /* renamed from: s */
    private int f106313s = 59;

    /* renamed from: t */
    private int f106314t = 23;

    /* renamed from: u */
    private int f106315u = 23;

    /* renamed from: com.ss.android.ugc.aweme.share.d$a */
    class C42001a implements Runnable {

        /* renamed from: a */
        boolean f106320a;

        public final void run() {
            if (!this.f106320a && System.currentTimeMillis() >= C41997d.this.f106304j) {
                C41997d.this.mo63557c();
            }
        }

        private C42001a() {
        }
    }

    /* renamed from: a */
    public final void mo55136a() {
        this.f106300f = false;
        mo63557c();
    }

    /* renamed from: c */
    public final void mo63557c() {
        if (isShowing() && !this.f106300f) {
            try {
                if (this.f106296b != null && !this.f106296b.isFinishing()) {
                    this.f106306l.mo54988a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo63556b() {
        int i;
        this.f106306l.mo54987a();
        if (this.f106296b != null && !this.f106296b.isFinishing() && !isShowing()) {
            this.f106304j = System.currentTimeMillis() + ((long) this.f106299e);
            this.f106306l.postDelayed(this.f106298d, (long) this.f106299e);
            if (this.f106295a.getParent() != null) {
                ((ViewGroup) this.f106295a.getParent()).removeView(this.f106295a);
            }
            try {
                View decorView = this.f106296b.getWindow().getDecorView();
                if (VERSION.SDK_INT >= 19) {
                    i = -C9432q.m18695e(this.f106296b);
                } else {
                    i = C9432q.m18695e(this.f106296b);
                }
                showAtLocation(decorView, 48, 0, i);
            } catch (BadTokenException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo86076a(final Aweme aweme) {
        boolean z;
        this.f106302h = aweme;
        if (aweme.getVideo() != null) {
            C23515d.m57670a(this.f106305k, aweme.getVideo().getCover(), (int) C9432q.m18687b((Context) this.f106296b, (float) this.f106312r), (int) C9432q.m18687b((Context) this.f106296b, (float) this.f106313s));
        }
        C26132m commerceStickerInfo = aweme.getCommerceStickerInfo();
        if (commerceStickerInfo == null || !commerceStickerInfo.enable()) {
            this.f106307m.setVisibility(8);
            this.f106310p.setVisibility(8);
            z = false;
        } else {
            this.f106307m.setVisibility(0);
            this.f106310p.setVisibility(0);
            C23515d.m57670a(this.f106308n, commerceStickerInfo.getIconUrl(), (int) C9432q.m18687b((Context) this.f106296b, (float) this.f106315u), (int) C9432q.m18687b((Context) this.f106296b, (float) this.f106314t));
            this.f106309o.setText(commerceStickerInfo.getLetters());
            this.f106307m.setOnClickListener(new C42005e(commerceStickerInfo));
            C26890h.m65011a("show_link", C23089d.m56640a().mo47827a("prop_id", commerceStickerInfo.getCommerceStickerId()).mo47829a("enter_from", "release").mo47829a("link_type", "web_link").f61491a);
            z = true;
        }
        if (!z) {
            C26131l a = CommerceSettingsApi.m62160a();
            if (a != null && a.f69006a != null && NonStandardAdPostExperiment.m92639a()) {
                this.f106311q.setBackgroundResource(R.drawable.dx9);
                ViewGroup viewGroup = (ViewGroup) this.f106295a.findViewById(R.id.c3q);
                viewGroup.setVisibility(0);
                ImageView imageView = (ImageView) this.f106295a.findViewById(R.id.c3t);
                Drawable a2 = C26502cf.m64047a(this.f106295a.getResources(), R.drawable.dxy);
                if (a2 == null) {
                    imageView.setImageResource(R.color.in);
                } else {
                    imageView.setImageDrawable(a2);
                }
                viewGroup.findViewById(R.id.c3s).bringToFront();
                DmtTextView dmtTextView = (DmtTextView) viewGroup.findViewById(R.id.c3v);
                if (TextUtils.isEmpty(a.f69006a.f69040b)) {
                    dmtTextView.setVisibility(8);
                } else {
                    dmtTextView.setVisibility(0);
                    dmtTextView.setText(a.f69006a.f69040b);
                }
                C26515i.m64154a((RemoteImageView) viewGroup.findViewById(R.id.c3u), a.f69006a.f69039a, (C13791d<C14045f>) new C13790c<C14045f>() {
                    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                        C14045f fVar = (C14045f) obj;
                        HashMap hashMap = new HashMap();
                        AwemeStatus status = aweme.getStatus();
                        if (status != null) {
                            switch (status.getPrivateStatus()) {
                                case 0:
                                    hashMap.put("privacy_status", "public");
                                    break;
                                case 1:
                                    hashMap.put("privacy_status", "private");
                                    break;
                                case 2:
                                    hashMap.put("privacy_status", "friend");
                                    break;
                            }
                        }
                        hashMap.put("enter_from", "release");
                        C26890h.m65011a("show_ad_sticker", (Map<String, String>) hashMap);
                    }
                });
                viewGroup.setOnClickListener(new C42009f(this, aweme, a));
            }
        }
    }

    public C41997d(Activity activity, C42348d dVar) {
        super(activity);
        this.f106296b = activity;
        this.f106301g = dVar;
        this.f106295a = LayoutInflater.from(activity).inflate(R.layout.bus, null);
        View view = this.f106295a;
        this.f106305k = (RemoteImageView) view.findViewById(R.id.b1n);
        this.f106297c = (LinearLayout) view.findViewById(R.id.cdu);
        this.f106306l = (PullUpLayout) view.findViewById(R.id.c70);
        this.f106308n = (RemoteImageView) view.findViewById(R.id.aze);
        this.f106309o = (TextView) view.findViewById(R.id.d8b);
        this.f106307m = view.findViewById(R.id.bey);
        this.f106310p = view.findViewById(R.id.bax);
        this.f106311q = (LinearLayout) view.findViewById(R.id.bei);
        this.f106306l.mo54989a((View) this.f106297c, false);
        this.f106306l.setPullUpListener(this);
        this.f106297c.setLayoutParams(new LayoutParams(-1, -2));
        this.f106305k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C41997d.this.f106302h != null) {
                    C23324d.m57378a().updateAweme(C41997d.this.f106302h);
                    C41302w a = C41302w.m91042a();
                    Activity activity = C41997d.this.f106296b;
                    StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                    sb.append(C41997d.this.f106302h.getAid());
                    a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83868a("profile_enterprise_type", C41997d.this.f106302h.getEnterpriseType()).mo83870a("query_aweme_mode", "from_local").mo83870a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").mo83871a());
                    AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setPublishStatus(11);
                    C41997d.this.dismiss();
                }
            }
        });
        this.f106303i = (MicroShareChannelBar) ((ViewStub) view.findViewById(R.id.cnj)).inflate().findViewById(R.id.cni);
        this.f106306l.setInternalTouchEventListener(new C26950b() {
            /* renamed from: a */
            public final void mo55002a(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        C41997d.this.f106300f = true;
                        if (C41997d.this.f106298d != null) {
                            C41997d.this.f106298d.f106320a = true;
                            return;
                        }
                        break;
                    case 1:
                        C41997d.this.f106300f = false;
                        C41997d.this.f106304j = System.currentTimeMillis() + ((long) C41997d.this.f106299e);
                        C41997d.this.f106298d.f106320a = false;
                        C41997d.this.f106297c.postDelayed(C41997d.this.f106298d, (long) C41997d.this.f106299e);
                        break;
                    case 2:
                        C41997d.this.f106300f = true;
                        return;
                }
            }
        });
        this.f106311q.setBackgroundColor(this.f106296b.getResources().getColor(R.color.in));
        this.f106298d = new C42001a();
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.f106295a);
        setWidth(C9432q.m18670a((Context) this.f106296b));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.wt);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86077a(Aweme aweme, C26131l lVar, View view) {
        if (NonStandardAdPostExperiment.m92640b()) {
            HashMap hashMap = new HashMap();
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                switch (status.getPrivateStatus()) {
                    case 0:
                        hashMap.put("privacy_status", "public");
                        break;
                    case 1:
                        hashMap.put("privacy_status", "private");
                        break;
                    case 2:
                        hashMap.put("privacy_status", "friend");
                        break;
                }
            }
            hashMap.put("enter_from", "release");
            C26890h.m65011a("click_ad_sticker", (Map<String, String>) hashMap);
            if (!C23165l.m56764c().mo47880a((Context) this.f106296b, lVar.f69006a.f69041c, false)) {
                C23165l.m56764c().mo47879a((Context) this.f106296b, lVar.f69006a.f69042d, lVar.f69006a.f69043e);
            }
        }
    }
}
