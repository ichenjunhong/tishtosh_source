package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26989a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.p1426bb.C23763a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.tools.utils.C50198b;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.as */
public final class C44987as extends PopupWindow implements C26989a {

    /* renamed from: a */
    public final View f113933a;

    /* renamed from: b */
    public ImageView f113934b;

    /* renamed from: c */
    public ImageView f113935c;

    /* renamed from: d */
    public PullUpLayout f113936d;

    /* renamed from: e */
    public DraftListener f113937e;

    /* renamed from: f */
    public TextView f113938f;

    /* renamed from: g */
    public final FragmentActivity f113939g;

    /* renamed from: h */
    public final C29059c f113940h;

    /* renamed from: i */
    private RelativeLayout f113941i;

    /* renamed from: j */
    private ImageView f113942j;

    /* renamed from: k */
    private TextView f113943k;

    /* renamed from: l */
    private final boolean f113944l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.as$a */
    public static final class C44988a implements DraftListener {

        /* renamed from: a */
        final /* synthetic */ C44987as f113945a;

        public final void onDraftCheckedChanged(C29059c cVar, boolean z) {
            C52711k.m112240b(cVar, "draft");
        }

        public final void onDraftClean() {
        }

        public final void onDraftUpdate(C29059c cVar) {
            C52711k.m112240b(cVar, "draft");
        }

        public C44988a(C44987as asVar) {
            this.f113945a = asVar;
        }

        public final void onDraftDelete(C29059c cVar) {
            if (cVar != null && TextUtils.equals(cVar.mo58774ak(), this.f113945a.f113940h.mo58774ak())) {
                this.f113945a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.as$b */
    static final class C44989b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44987as f113946a;

        C44989b(C44987as asVar) {
            this.f113946a = asVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("publish_retry", C23089d.m56640a().mo47829a("action_type", "cancel").mo47829a("creation_id", this.f113946a.f113940h.mo58817z()).f61491a);
            this.f113946a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.as$c */
    public static final class C44990c implements OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ C44987as f113947a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.as$c$a */
        static final class C44991a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C44990c f113948a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f113949b;

            C44991a(C44990c cVar, Bitmap bitmap) {
                this.f113948a = cVar;
                this.f113949b = bitmap;
            }

            public final /* synthetic */ Object call() {
                if (this.f113948a.f113947a.f113934b != null) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f113949b, (int) C9432q.m18687b((Context) this.f113948a.f113947a.f113939g, 48.0f), (int) C9432q.m18687b((Context) this.f113948a.f113947a.f113939g, 62.0f), true);
                    final C52727e eVar = new C52727e();
                    eVar.element = C50198b.m108328a(createScaledBitmap, C9432q.m18687b((Context) this.f113948a.f113947a.f113939g, 2.0f));
                    ImageView imageView = this.f113948a.f113947a.f113934b;
                    if (imageView == null) {
                        C52711k.m112234a();
                    }
                    imageView.post(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44991a f113950a;

                        {
                            this.f113950a = r1;
                        }

                        public final void run() {
                            ImageView imageView = this.f113950a.f113948a.f113947a.f113934b;
                            if (imageView == null) {
                                C52711k.m112234a();
                            }
                            imageView.setImageBitmap((Bitmap) eVar.element);
                        }
                    });
                    this.f113949b.recycle();
                    createScaledBitmap.recycle();
                }
                return C52860x.f131107a;
            }
        }

        public final void onGetVideoCoverFailed(int i) {
        }

        public C44990c(C44987as asVar) {
            this.f113947a = asVar;
        }

        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C52711k.m112240b(bitmap, "bitmap");
            C0013i.m16a((Callable<TResult>) new C44991a<TResult>(this, bitmap));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.as$d */
    public static final class C44993d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44987as f113952a;

        public C44993d(C44987as asVar) {
            this.f113952a = asVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113952a.mo91281b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.as$e */
    public static final class C44994e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44987as f113953a;

        public C44994e(C44987as asVar) {
            this.f113953a = asVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113953a.mo91281b();
        }
    }

    /* renamed from: a */
    public final void mo55136a() {
        dismiss();
    }

    /* renamed from: b */
    public final void mo91281b() {
        dismiss();
        C26890h.m65011a("publish_retry", C23089d.m56640a().mo47829a("action_type", "publish").mo47829a("creation_id", this.f113940h.mo58817z()).f61491a);
        C23763a.m58315a().mo49227a(this.f113939g, this.f113940h);
    }

    public final void dismiss() {
        if (isShowing()) {
            if (this.f113939g != null && !this.f113939g.isFinishing()) {
                PullUpLayout pullUpLayout = this.f113936d;
                if (pullUpLayout == null) {
                    C52711k.m112234a();
                }
                if (pullUpLayout.hasWindowFocus()) {
                    PullUpLayout pullUpLayout2 = this.f113936d;
                    if (pullUpLayout2 == null) {
                        C52711k.m112234a();
                    }
                    pullUpLayout2.mo54988a(0.0f, true);
                }
            }
            C23763a.m58318a((String) null);
        }
        if (this.f113937e != null) {
            IDraftService a = C46994b.m102064a();
            DraftListener draftListener = this.f113937e;
            if (draftListener == null) {
                C52711k.m112234a();
            }
            a.unregisterDraftListener(draftListener);
            this.f113937e = null;
        }
        try {
            C44995at.m98337a(this);
        } catch (Exception unused) {
        }
    }

    public C44987as(FragmentActivity fragmentActivity, C29059c cVar, boolean z) {
        C52711k.m112240b(fragmentActivity, "mFragmentActivity");
        C52711k.m112240b(cVar, "mDraft");
        super(fragmentActivity);
        this.f113939g = fragmentActivity;
        this.f113940h = cVar;
        this.f113944l = z;
        Object systemService = C11010c.m22280a().getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.a96, null);
            C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_recover_popwindow, null)");
            this.f113933a = inflate;
            View view = this.f113933a;
            View findViewById = view.findViewById(R.id.cdu);
            if (findViewById != null) {
                this.f113941i = (RelativeLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.azj);
                if (findViewById2 != null) {
                    this.f113934b = (ImageView) findViewById2;
                    View findViewById3 = view.findViewById(R.id.c70);
                    if (findViewById3 != null) {
                        this.f113936d = (PullUpLayout) findViewById3;
                        PullUpLayout pullUpLayout = this.f113936d;
                        if (pullUpLayout == null) {
                            C52711k.m112234a();
                        }
                        pullUpLayout.mo54989a((View) this.f113941i, false);
                        PullUpLayout pullUpLayout2 = this.f113936d;
                        if (pullUpLayout2 == null) {
                            C52711k.m112234a();
                        }
                        pullUpLayout2.setPullUpListener(this);
                        View findViewById4 = view.findViewById(R.id.az9);
                        if (findViewById4 != null) {
                            this.f113942j = (ImageView) findViewById4;
                            View findViewById5 = view.findViewById(R.id.dha);
                            if (findViewById5 != null) {
                                this.f113943k = (TextView) findViewById5;
                                ImageView imageView = this.f113942j;
                                if (imageView == null) {
                                    C52711k.m112234a();
                                }
                                imageView.setOnClickListener(new C44989b(this));
                                View findViewById6 = view.findViewById(R.id.b3i);
                                if (findViewById6 != null) {
                                    this.f113935c = (ImageView) findViewById6;
                                    View findViewById7 = view.findViewById(R.id.f41);
                                    if (findViewById7 != null) {
                                        this.f113938f = (TextView) findViewById7;
                                        if (C39618d.f101152P.mo83103a(C40790a.PublishProgressOptimize)) {
                                            View findViewById8 = view.findViewById(R.id.ebi);
                                            C52711k.m112236a((Object) findViewById8, "view.findViewById<View>(R.id.icon_publish_failed)");
                                            findViewById8.setVisibility(0);
                                            TextView textView = this.f113938f;
                                            if (textView == null) {
                                                C52711k.m112234a();
                                            }
                                            textView.setVisibility(0);
                                            ImageView imageView2 = this.f113935c;
                                            if (imageView2 == null) {
                                                C52711k.m112234a();
                                            }
                                            imageView2.setVisibility(8);
                                            if (this.f113940h.f76124B == 0) {
                                                TextView textView2 = this.f113943k;
                                                if (textView2 == null) {
                                                    C52711k.m112234a();
                                                }
                                                textView2.setText(R.string.h76);
                                            } else {
                                                TextView textView3 = this.f113943k;
                                                if (textView3 == null) {
                                                    C52711k.m112234a();
                                                }
                                                textView3.setText(R.string.h78);
                                            }
                                        } else {
                                            View findViewById9 = view.findViewById(R.id.ebi);
                                            C52711k.m112236a((Object) findViewById9, "view.findViewById<View>(R.id.icon_publish_failed)");
                                            findViewById9.setVisibility(8);
                                            TextView textView4 = this.f113938f;
                                            if (textView4 == null) {
                                                C52711k.m112234a();
                                            }
                                            textView4.setVisibility(8);
                                            ImageView imageView3 = this.f113935c;
                                            if (imageView3 == null) {
                                                C52711k.m112234a();
                                            }
                                            imageView3.setVisibility(0);
                                        }
                                        setBackgroundDrawable(new ColorDrawable(0));
                                        setContentView(this.f113933a);
                                        setWidth(C9432q.m18670a(C11010c.m22280a()));
                                        setHeight(-2);
                                        setAnimationStyle(R.style.wt);
                                        return;
                                    }
                                    throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                                }
                                throw new C52857u("null cannot be cast to non-null type android.widget.ImageView");
                            }
                            throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.widget.ImageView");
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.widget.PullUpLayout");
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
