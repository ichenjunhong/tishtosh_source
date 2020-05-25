package com.p683ss.android.ugc.aweme.tools.mvtemplate.net;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b */
public final class C47279b extends C45547d {

    /* renamed from: c */
    public static final C47281b f119366c = new C47281b(null);

    /* renamed from: b */
    public final Handler f119367b = new Handler();

    /* renamed from: d */
    private final ValueAnimator f119368d;

    /* renamed from: e */
    private final Context f119369e;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b$a */
    static final class C47280a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C47279b f119370a;

        C47280a(C47279b bVar) {
            this.f119370a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C47279b bVar = this.f119370a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                bVar.setProgress(((Integer) animatedValue).intValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b$b */
    public static final class C47281b {
        private C47281b() {
        }

        public /* synthetic */ C47281b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b$c */
    static final class C47282c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C47279b f119371a;

        C47282c(C47279b bVar) {
            this.f119371a = bVar;
        }

        public final void run() {
            this.f119371a.dismiss();
        }
    }

    public final void dismiss() {
        super.dismiss();
        this.f119367b.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    public final void mo94571c() {
        if (this.f119368d.isRunning()) {
            this.f119368d.end();
        }
        setProgress(100);
        this.f119367b.postDelayed(new C47282c(this), 70);
    }

    /* renamed from: a */
    public final void mo94570a(String str) {
        C52711k.m112240b(str, "message");
        if ((this.f119369e instanceof Activity) && !((Activity) this.f119369e).isFinishing()) {
            show();
        }
        setMessage(str);
        mo91828a();
        this.f119368d.start();
    }

    public C47279b(Context context) {
        C52711k.m112240b(context, "mContext");
        super(context, 3);
        this.f119369e = context;
        setCancelable(false);
        setIndeterminate(false);
        setMax(100);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 83});
        ofInt.setDuration(5000);
        ofInt.addUpdateListener(new C47280a(this));
        C52711k.m112236a((Object) ofInt, "ValueAnimator.ofInt(0, T…ue as Int\n        }\n    }");
        this.f119368d = ofInt;
    }
}
