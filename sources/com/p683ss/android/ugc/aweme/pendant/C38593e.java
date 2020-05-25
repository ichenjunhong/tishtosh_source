package com.p683ss.android.ugc.aweme.pendant;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.C2337b;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2442f;
import com.airbnb.lottie.C2472h;
import com.airbnb.lottie.C2473i;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1707b;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.pendant.e */
public final class C38593e extends C38571a {

    /* renamed from: p */
    public final LottieAnimationView f98149p;

    /* renamed from: q */
    public final LottieAnimationView f98150q;

    /* renamed from: r */
    private int f98151r;

    /* renamed from: s */
    private int f98152s;

    /* renamed from: t */
    private int f98153t;

    /* renamed from: u */
    private int f98154u;

    /* renamed from: v */
    private int f98155v;

    /* renamed from: w */
    private int f98156w;

    /* renamed from: x */
    private int f98157x;

    /* renamed from: y */
    private int f98158y;

    /* renamed from: z */
    private final String f98159z;

    /* renamed from: com.ss.android.ugc.aweme.pendant.e$a */
    static final class C38594a<T1, T2, R> implements C1707b<String, String, String> {

        /* renamed from: a */
        public static final C38594a f98160a = new C38594a();

        C38594a() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo6200a(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C52711k.m112240b(str, "t1");
            C52711k.m112240b(str2, "t2");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.e$b */
    public static final class C38595b implements C1674ab<String> {

        /* renamed from: a */
        final /* synthetic */ C38593e f98161a;

        /* renamed from: b */
        final /* synthetic */ InputStream f98162b;

        /* renamed from: c */
        final /* synthetic */ InputStream f98163c;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            try {
                this.f98162b.close();
                this.f98163c.close();
            } catch (Exception unused) {
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            C52711k.m112240b((String) obj, "t");
            this.f98161a.f98089g = true;
            List<Integer> list = this.f98161a.f98096n.f98199f;
            if (list != null && (!list.isEmpty())) {
                this.f98161a.mo78532e(true);
                this.f98161a.mo78532e(false);
            }
            this.f98161a.f98149p.mo6654b();
            this.f98161a.f98150q.mo6654b();
            C52670a<C52860x> aVar = this.f98161a.f98096n.f98198e;
            if (aVar != null) {
                aVar.invoke();
            }
            try {
                this.f98162b.close();
                this.f98163c.close();
            } catch (Exception unused) {
            }
        }

        C38595b(C38593e eVar, InputStream inputStream, InputStream inputStream2) {
            this.f98161a = eVar;
            this.f98162b = inputStream;
            this.f98163c = inputStream2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.e$c */
    static final class C38596c<T> implements C2205y<String> {

        /* renamed from: a */
        final /* synthetic */ C38593e f98164a;

        /* renamed from: b */
        final /* synthetic */ C38599d f98165b;

        /* renamed from: c */
        final /* synthetic */ InputStream f98166c;

        /* renamed from: com.ss.android.ugc.aweme.pendant.e$c$a */
        static final class C38597a<T> implements C2473i<C2408e> {

            /* renamed from: a */
            final /* synthetic */ LottieAnimationView f98167a;

            /* renamed from: b */
            final /* synthetic */ C38596c f98168b;

            /* renamed from: c */
            final /* synthetic */ C2204x f98169c;

            C38597a(LottieAnimationView lottieAnimationView, C38596c cVar, C2204x xVar) {
                this.f98167a = lottieAnimationView;
                this.f98168b = cVar;
                this.f98169c = xVar;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo6703a(Object obj) {
                this.f98167a.setComposition((C2408e) obj);
                this.f98169c.mo6282a("0");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.e$c$b */
        static final class C38598b<T> implements C2473i<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C38596c f98170a;

            /* renamed from: b */
            final /* synthetic */ C2204x f98171b;

            C38598b(C38596c cVar, C2204x xVar) {
                this.f98170a = cVar;
                this.f98171b = xVar;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo6703a(Object obj) {
                this.f98171b.mo6274a((Throwable) obj);
            }
        }

        C38596c(C38593e eVar, C38599d dVar, InputStream inputStream) {
            this.f98164a = eVar;
            this.f98165b = dVar;
            this.f98166c = inputStream;
        }

        public final void subscribe(C2204x<String> xVar) {
            C52711k.m112240b(xVar, "emitter");
            LottieAnimationView lottieAnimationView = this.f98164a.f98149p;
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setImageAssetDelegate(this.f98165b);
            C2442f.m7136a(this.f98166c, "bigLottie").mo6869a((C2473i<T>) new C38597a<T>(lottieAnimationView, this, xVar)).mo6874c(new C38598b(this, xVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.e$d */
    public static final class C38599d implements C2337b {

        /* renamed from: a */
        final /* synthetic */ String f98172a;

        C38599d(String str) {
            this.f98172a = str;
        }

        /* renamed from: a */
        public final Bitmap mo6732a(C2472h hVar) {
            Bitmap bitmap;
            if (hVar == null) {
                return null;
            }
            Options options = new Options();
            options.inScaled = true;
            Context a = C11010c.m22280a();
            if (C20141b.f55392b == -1 && a != null) {
                C20141b.f55392b = a.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
            }
            options.inDensity = C20141b.f55392b;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f98172a);
                sb.append(File.separator);
                sb.append(hVar.f7633d);
                bitmap = BitmapFactory.decodeFile(sb.toString(), options);
            } catch (Exception unused) {
                bitmap = null;
            }
            return bitmap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.e$e */
    static final class C38600e<T> implements C2205y<String> {

        /* renamed from: a */
        final /* synthetic */ C38593e f98173a;

        /* renamed from: b */
        final /* synthetic */ C38599d f98174b;

        /* renamed from: c */
        final /* synthetic */ InputStream f98175c;

        /* renamed from: com.ss.android.ugc.aweme.pendant.e$e$a */
        static final class C38601a<T> implements C2473i<C2408e> {

            /* renamed from: a */
            final /* synthetic */ LottieAnimationView f98176a;

            /* renamed from: b */
            final /* synthetic */ C38600e f98177b;

            /* renamed from: c */
            final /* synthetic */ C2204x f98178c;

            C38601a(LottieAnimationView lottieAnimationView, C38600e eVar, C2204x xVar) {
                this.f98176a = lottieAnimationView;
                this.f98177b = eVar;
                this.f98178c = xVar;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo6703a(Object obj) {
                this.f98176a.setComposition((C2408e) obj);
                this.f98178c.mo6282a("1");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.e$e$b */
        static final class C38602b<T> implements C2473i<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C38600e f98179a;

            /* renamed from: b */
            final /* synthetic */ C2204x f98180b;

            C38602b(C38600e eVar, C2204x xVar) {
                this.f98179a = eVar;
                this.f98180b = xVar;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo6703a(Object obj) {
                this.f98180b.mo6274a((Throwable) obj);
            }
        }

        C38600e(C38593e eVar, C38599d dVar, InputStream inputStream) {
            this.f98173a = eVar;
            this.f98174b = dVar;
            this.f98175c = inputStream;
        }

        public final void subscribe(C2204x<String> xVar) {
            C52711k.m112240b(xVar, "emitter");
            LottieAnimationView lottieAnimationView = this.f98173a.f98150q;
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setImageAssetDelegate(this.f98174b);
            C2442f.m7136a(this.f98175c, "smallLottie").mo6869a((C2473i<T>) new C38601a<T>(lottieAnimationView, this, xVar)).mo6874c(new C38602b(this, xVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.e$f */
    public static final class C38603f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LottieAnimationView f98181a;

        /* renamed from: b */
        final /* synthetic */ C38593e f98182b;

        /* renamed from: c */
        final /* synthetic */ int f98183c;

        /* renamed from: d */
        final /* synthetic */ int f98184d;

        /* renamed from: e */
        final /* synthetic */ boolean f98185e;

        public final void onAnimationCancel(Animator animator) {
            this.f98182b.f98087e = false;
            super.onAnimationCancel(animator);
            this.f98182b.mo78532e(this.f98185e);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f98182b.f98087e = false;
            this.f98182b.mo78532e(this.f98185e);
            this.f98181a.mo6654b();
        }

        C38603f(LottieAnimationView lottieAnimationView, C38593e eVar, int i, int i2, boolean z) {
            this.f98181a = lottieAnimationView;
            this.f98182b = eVar;
            this.f98183c = i;
            this.f98184d = i2;
            this.f98185e = z;
        }
    }

    /* renamed from: e */
    public final void mo78504e() {
    }

    /* renamed from: b */
    public final void mo78499b() {
        super.mo78499b();
        if (this.f98089g) {
            if (this.f98149p.getVisibility() == 0) {
                if (m85892a() && !this.f98087e) {
                    mo78532e(true);
                }
                if (!this.f98149p.mo6660e()) {
                    this.f98149p.mo6654b();
                }
            }
            if (this.f98150q.getVisibility() == 0) {
                if (m85892a() && !this.f98087e) {
                    mo78532e(false);
                }
                if (!this.f98150q.mo6660e()) {
                    this.f98150q.mo6654b();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo78501c() {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        int i;
        int i2;
        if (m85892a()) {
            super.mo78501c();
            if (this.f98086d) {
                lottieAnimationView = this.f98150q;
            } else {
                lottieAnimationView = this.f98149p;
            }
            this.f98087e = true;
            boolean z = !this.f98086d;
            if (z) {
                lottieAnimationView2 = this.f98149p;
            } else {
                lottieAnimationView2 = this.f98150q;
            }
            if (z) {
                i = this.f98151r;
            } else {
                i = this.f98155v;
            }
            int i3 = i;
            if (z) {
                i2 = this.f98152s;
            } else {
                i2 = this.f98156w;
            }
            int i4 = i2;
            if (m85892a()) {
                lottieAnimationView2.mo6651a(i3, i4);
                lottieAnimationView2.setRepeatCount(0);
                lottieAnimationView2.setRepeatMode(1);
                C38603f fVar = new C38603f(lottieAnimationView2, this, i3, i4, z);
                lottieAnimationView2.mo6652a((AnimatorListener) fVar);
            }
            lottieAnimationView.mo6654b();
        }
    }

    /* renamed from: e */
    public final void mo78532e(boolean z) {
        LottieAnimationView lottieAnimationView;
        int i;
        int i2;
        if (z) {
            lottieAnimationView = this.f98149p;
        } else {
            lottieAnimationView = this.f98150q;
        }
        if (z) {
            i = this.f98153t;
        } else {
            i = this.f98157x;
        }
        if (z) {
            i2 = this.f98154u;
        } else {
            i2 = this.f98158y;
        }
        lottieAnimationView.mo6651a(i, i2);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
    }

    /* renamed from: a */
    public final void mo78531a(C38622k kVar) {
        C52711k.m112240b(kVar, "resConfigure");
        InputStream inputStream = kVar.f98232a;
        InputStream inputStream2 = kVar.f98233b;
        String str = kVar.f98234c;
        if (inputStream != null && inputStream2 != null && str != null && inputStream != null && inputStream2 != null && !TextUtils.isEmpty(str)) {
            C38599d dVar = new C38599d(str);
            C2201v a = C2201v.m6601a((C2205y<T>) new C38596c<T>(this, dVar, inputStream));
            C52711k.m112236a((Object) a, "Observable.create(Observ…\n            }\n        })");
            C2201v a2 = C2201v.m6601a((C2205y<T>) new C38600e<T>(this, dVar, inputStream2));
            C52711k.m112236a((Object) a2, "Observable.create(Observ…\n            }\n        })");
            C2201v.m6603a((C2206z<? extends T1>) a, (C2206z<? extends T2>) a2, (C1707b<? super T1, ? super T2, ? extends R>) C38594a.f98160a).mo6314a((C1674ab<? super T>) new C38595b<Object>(this, inputStream2, inputStream));
        }
    }

    public C38593e(Context context, View view, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, View view2, C38609g gVar) {
        Integer num;
        Integer num2;
        Integer num3;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, C42311c.f106865i);
        C52711k.m112240b(lottieAnimationView, "bigLottieView");
        C52711k.m112240b(lottieAnimationView2, "smallLottieView");
        C52711k.m112240b(view2, "closeBtn");
        C52711k.m112240b(gVar, "configure");
        super(context, view, lottieAnimationView, lottieAnimationView2, view2, gVar);
        this.f98149p = lottieAnimationView;
        this.f98150q = lottieAnimationView2;
        if (gVar.f98199f != null && gVar.f98199f.size() == 4) {
            List<Integer> list = gVar.f98199f;
            Integer num4 = null;
            if (list != null) {
                num = (Integer) list.get(0);
            } else {
                num = null;
            }
            this.f98151r = num.intValue();
            List<Integer> list2 = gVar.f98199f;
            if (list2 != null) {
                num2 = (Integer) list2.get(1);
            } else {
                num2 = null;
            }
            this.f98152s = num2.intValue();
            this.f98153t = 0;
            this.f98154u = this.f98151r - 1;
            List<Integer> list3 = gVar.f98199f;
            if (list3 != null) {
                num3 = (Integer) list3.get(2);
            } else {
                num3 = null;
            }
            this.f98155v = num3.intValue();
            List<Integer> list4 = gVar.f98199f;
            if (list4 != null) {
                num4 = (Integer) list4.get(3);
            }
            this.f98156w = num4.intValue();
            this.f98157x = 0;
            this.f98158y = this.f98155v - 1;
        }
        this.f98159z = "newpendant";
    }
}
