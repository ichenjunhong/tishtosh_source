package com.p683ss.android.ugc.gamora.recorder.p2466c;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2767k;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43206da;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.c.f */
public final class C49628f extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f124491i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49628f.class), "uiHandler", "getUiHandler()Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;"))};

    /* renamed from: q */
    public static final C49629a f124492q = new C49629a(null);

    /* renamed from: j */
    public boolean f124493j = true;

    /* renamed from: k */
    C49610c f124494k;

    /* renamed from: l */
    public C10660a f124495l;

    /* renamed from: m */
    public ImageView f124496m;

    /* renamed from: n */
    protected TextView f124497n;

    /* renamed from: o */
    protected RelativeLayout f124498o;

    /* renamed from: p */
    public final C49609b f124499p;

    /* renamed from: r */
    private ShortVideoContextViewModel f124500r;

    /* renamed from: s */
    private boolean f124501s;

    /* renamed from: t */
    private boolean f124502t;

    /* renamed from: u */
    private final C52668f f124503u = C52732g.m112285a(new C49647q(this));

    /* renamed from: v */
    private final C2763g<Boolean> f124504v;

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$a */
    public static final class C49629a {
        private C49629a() {
        }

        public /* synthetic */ C49629a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$b */
    static final class C49630b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C49628f f124505a;

        C49630b(C49628f fVar) {
            this.f124505a = fVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f124505a.mo97540L();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$c */
    static final class C49631c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49628f f124506a;

        C49631c(C49628f fVar) {
            this.f124506a = fVar;
        }

        public final void run() {
            this.f124506a.mo97534F().requestFocus();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$d */
    static final class C49632d<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124507a;

        C49632d(C49628f fVar) {
            this.f124507a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49628f fVar = this.f124507a;
            C52711k.m112236a((Object) bool, "it");
            fVar.mo97541a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$e */
    static final class C49633e<T> implements C2767k<Void> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124508a;

        C49633e(C49628f fVar) {
            this.f124508a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            this.f124508a.mo97537I();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$f */
    static final class C49634f<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124509a;

        C49634f(C49628f fVar) {
            this.f124509a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            LayoutParams layoutParams = this.f124509a.mo97535G().getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                Activity activity = this.f124509a.f33840g_;
                if (activity == null) {
                    C52711k.m112234a();
                }
                marginLayoutParams.topMargin = C43303dy.m94972c(activity) + this.f124509a.mo24478w().getDimensionPixelSize(R.dimen.lz);
                this.f124509a.mo97535G().setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$g */
    static final class C49635g<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124510a;

        C49635g(C49628f fVar) {
            this.f124510a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49628f fVar = this.f124510a;
            C52711k.m112236a((Object) bool, "it");
            fVar.mo97542b(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$h */
    static final class C49636h<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124511a;

        C49636h(C49628f fVar) {
            this.f124511a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                this.f124511a.mo97540L();
            } else {
                this.f124511a.mo97543d(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$i */
    static final class C49637i<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124512a;

        C49637i(C49628f fVar) {
            this.f124512a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "enable");
            if (bool.booleanValue()) {
                C49628f.m107116a(this.f124512a).setImageAlpha(NormalGiftView.ALPHA_255);
                this.f124512a.mo97534F().setAlpha(1.0f);
                return;
            }
            C49628f.m107116a(this.f124512a).setImageAlpha(127);
            this.f124512a.mo97534F().setAlpha(0.5f);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$j */
    static final class C49638j<T> implements C2767k<C42482c> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124513a;

        C49638j(C49628f fVar) {
            this.f124513a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C42482c cVar = (C42482c) obj;
            if (cVar == null) {
                this.f124513a.mo97534F().setText(R.string.a2t);
                C49628f.m107116a(this.f124513a).setImageResource(R.drawable.ajr);
                this.f124513a.mo97536H().post(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49638j f124514a;

                    {
                        this.f124514a = r1;
                    }

                    public final void run() {
                        this.f124514a.f124513a.mo97534F().clearFocus();
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder(cVar.getName());
            CharSequence singer = cVar.getSinger();
            if (singer == null || singer.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                sb.append('-');
                sb.append(cVar.getSinger());
            }
            this.f124513a.mo97534F().setText(sb);
            C49628f.m107116a(this.f124513a).setImageResource(R.drawable.ajs);
            this.f124513a.mo97536H().post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C49638j f124515a;

                {
                    this.f124515a = r1;
                }

                public final void run() {
                    this.f124515a.f124513a.mo97534F().requestFocus();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$k */
    static final class C49641k<T> implements C2767k<Void> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124516a;

        C49641k(C49628f fVar) {
            this.f124516a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C49628f fVar = this.f124516a;
            fVar.mo97539K();
            C49610c cVar = fVar.f124494k;
            if (cVar != null) {
                cVar.mo87838a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$l */
    static final class C49642l<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124517a;

        C49642l(C49628f fVar) {
            this.f124517a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ImageView a = C49628f.m107116a(this.f124517a);
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$m */
    static final class C49643m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49628f f124518a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f124519b;

        C49643m(C49628f fVar, ShortVideoContext shortVideoContext) {
            this.f124518a = fVar;
            this.f124519b = shortVideoContext;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                ShortVideoContext shortVideoContext = this.f124519b;
                C52711k.m112236a((Object) shortVideoContext, "shortVideoContext");
                if (!shortVideoContext.mo86362d()) {
                    C49628f fVar = this.f124518a;
                    ShortVideoContext shortVideoContext2 = this.f124519b;
                    C52711k.m112236a((Object) shortVideoContext2, "shortVideoContext");
                    if (!TextUtils.isEmpty(shortVideoContext2.mo86371l())) {
                        C43214dh a = C43214dh.m94817a();
                        C52711k.m112236a((Object) a, "PublishManager.inst()");
                        C43804f fVar2 = a.f109289d;
                        if (!(fVar2 == null || fVar2.f110929f || (fVar2.f110927d == null && fVar2.f110928e == null))) {
                            if (fVar2.f110927d != null && TextUtils.equals(fVar2.f110936m, shortVideoContext2.mo86371l())) {
                                C10691a.m21548c((Context) fVar.f33840g_, (int) R.string.gtp).mo19066a();
                                C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "5").mo47829a("task_id", fVar2.f110924a).f61491a);
                            }
                            if (fVar2.f110927d != null && !TextUtils.equals(fVar2.f110936m, shortVideoContext2.mo86371l())) {
                                fVar2.f110929f = true;
                            }
                            if (fVar2.f110928e != null && TextUtils.equals(fVar2.f110936m, shortVideoContext2.mo86371l())) {
                                C10691a.m21548c((Context) fVar.f33840g_, (int) R.string.gtp).mo19066a();
                                C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "5").mo47829a("task_id", fVar2.f110924a).f61491a);
                            }
                            if (fVar2.f110928e != null && !TextUtils.equals(fVar2.f110936m, shortVideoContext2.mo86371l())) {
                                fVar2.f110929f = true;
                            }
                        }
                    }
                    C26890h.m65011a("change_music", C23089d.m56640a().mo47829a("creation_id", this.f124519b.f107131x).mo47829a("shoot_way", this.f124519b.f107132y).mo47826a("draft_id", this.f124519b.f107022A).mo47829a("enter_from", "video_shoot_page").f61491a);
                    this.f124518a.f124499p.f124451k.mo7350a(C52860x.f131107a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$n */
    static final class C49644n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f124520a;

        C49644n(ShortVideoContext shortVideoContext) {
            this.f124520a = shortVideoContext;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("change_music_grey", C23089d.m56640a().mo47829a("creation_id", this.f124520a.f107131x).mo47829a("shoot_way", this.f124520a.f107132y).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$o */
    static final class C49645o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49628f f124521a;

        C49645o(C49628f fVar) {
            this.f124521a = fVar;
        }

        public final void run() {
            this.f124521a.mo97534F().requestFocus();
            this.f124521a.mo97534F().setSelected(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$p */
    static final class C49646p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10660a f124522a;

        /* renamed from: b */
        final /* synthetic */ C49628f f124523b;

        C49646p(C10660a aVar, C49628f fVar) {
            this.f124522a = aVar;
            this.f124523b = fVar;
        }

        public final void run() {
            if (this.f124523b.f33840g_ != null) {
                Activity activity = this.f124523b.f33840g_;
                if (activity == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) activity, "activity!!");
                if (!activity.isFinishing()) {
                    C52847n J = this.f124523b.mo97538J();
                    this.f124522a.mo18998a(this.f124523b.mo97534F(), ((Number) J.getFirst()).intValue(), ((int[]) J.getSecond())[0], ((int[]) J.getSecond())[1], (float) ((int[]) J.getSecond())[2]);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.f$q */
    static final class C49647q extends C52712l implements C52670a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C49628f f124524a;

        C49647q(C49628f fVar) {
            this.f124524a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SafeHandler(this.f124524a);
        }
    }

    /* renamed from: H */
    public final SafeHandler mo97536H() {
        return (SafeHandler) this.f124503u.getValue();
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        View j_ = mo24467j_(R.id.cdl);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.rl_music_container)");
        this.f124498o = (RelativeLayout) j_;
        View j_2 = mo24467j_(R.id.az2);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.iv_choose_music)");
        this.f124496m = (ImageView) j_2;
        View j_3 = mo24467j_(R.id.d7y);
        C52711k.m112236a((Object) j_3, "requireViewById(R.id.tv_choose_music)");
        this.f124497n = (TextView) j_3;
        mo97536H().post(new C49631c(this));
        Typeface a = C10749b.m21787a().mo19435a(C10751d.f28908g);
        if (a != null) {
            TextView textView = this.f124497n;
            if (textView == null) {
                C52711k.m112237a("tvChooseMusic");
            }
            textView.setTypeface(a);
        }
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a2 = C0214z.m440a((FragmentActivity) activity).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…extViewModel::class.java)");
            this.f124500r = (ShortVideoContextViewModel) a2;
            C0184k kVar = this;
            this.f124504v.mo7352a(kVar, new C49634f(this));
            this.f124499p.f124448h.mo7349a(kVar, new C49635g(this));
            this.f124499p.f124449i.mo7349a(kVar, new C49636h(this));
            this.f124499p.f124446f.mo7352a(kVar, new C49637i(this));
            this.f124499p.f124447g.mo7349a(kVar, new C49638j(this));
            this.f124499p.f124445e.mo7349a(kVar, new C49641k(this));
            this.f124499p.f124442b.mo7352a(kVar, new C49642l(this));
            this.f124499p.f124443c.mo7352a(kVar, new C49632d(this));
            this.f124499p.f124450j.mo7349a(kVar, new C49633e(this));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo97541a(boolean z) {
        if (!z || !this.f124493j) {
            TextView textView = this.f124497n;
            if (textView == null) {
                C52711k.m112237a("tvChooseMusic");
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = this.f124497n;
        if (textView2 == null) {
            C52711k.m112237a("tvChooseMusic");
        }
        textView2.setVisibility(0);
        mo97536H().post(new C49645o(this));
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: M */
    private View m107115M() {
        TextView textView = this.f124497n;
        if (textView == null) {
            C52711k.m112237a("tvChooseMusic");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final TextView mo97534F() {
        TextView textView = this.f124497n;
        if (textView == null) {
            C52711k.m112237a("tvChooseMusic");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final RelativeLayout mo97535G() {
        RelativeLayout relativeLayout = this.f124498o;
        if (relativeLayout == null) {
            C52711k.m112237a("chooseMusicContainer");
        }
        return relativeLayout;
    }

    /* renamed from: L */
    public final void mo97540L() {
        C10660a aVar = this.f124495l;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public final void mo97539K() {
        if (this.f124494k == null) {
            Activity activity = this.f33840g_;
            if (activity != null) {
                this.f124494k = new C43206da((FragmentActivity) activity);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final C52847n<Integer, int[]> mo97538J() {
        int i;
        int i2;
        int[] iArr = new int[2];
        TextView textView = this.f124497n;
        if (textView == null) {
            C52711k.m112237a("tvChooseMusic");
        }
        textView.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        TextView textView2 = this.f124497n;
        if (textView2 == null) {
            C52711k.m112237a("tvChooseMusic");
        }
        int measuredWidth = textView2.getMeasuredWidth();
        C10660a aVar = this.f124495l;
        if (aVar != null) {
            i = aVar.mo19003d();
        } else {
            i = 0;
        }
        int i4 = i3 + ((measuredWidth - i) / 2);
        float f = (float) iArr[1];
        TextView textView3 = this.f124497n;
        if (textView3 == null) {
            C52711k.m112237a("tvChooseMusic");
        }
        float measuredHeight = (float) textView3.getMeasuredHeight();
        Activity activity = this.f33840g_;
        if (activity == null) {
            C52711k.m112234a();
        }
        int b = (int) (f + (measuredHeight - C9432q.m18687b((Context) activity, 10.0f)));
        C10660a aVar2 = this.f124495l;
        if (aVar2 != null) {
            i2 = aVar2.mo19003d();
        } else {
            i2 = 0;
        }
        int i5 = i2 / 2;
        return new C52847n<>(Integer.valueOf(80), new int[]{i4, b, i5});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r0 != null) goto L_0x0072;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97537I() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r5.f124500r
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "shortVideoContextViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.f107134a
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r1 = r0.mo86362d()
            if (r1 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r1 = r0.f107036O
            r2 = 1
            r5.f124502t = r2
            android.widget.TextView r3 = r5.f124497n
            if (r3 != 0) goto L_0x0024
            java.lang.String r4 = "tvChooseMusic"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0024:
            r4 = 0
            r3.setClickable(r4)
            android.widget.TextView r3 = r5.f124497n
            if (r3 != 0) goto L_0x0031
            java.lang.String r4 = "tvChooseMusic"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0031:
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.setAlpha(r4)
            android.widget.ImageView r3 = r5.f124496m
            if (r3 != 0) goto L_0x003f
            java.lang.String r4 = "ivChooseMusic"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x003f:
            r4 = 127(0x7f, float:1.78E-43)
            r3.setImageAlpha(r4)
            boolean r0 = r0.mo86364e()
            if (r0 != 0) goto L_0x005a
            r5.f124501s = r2
            android.widget.RelativeLayout r0 = r5.f124498o
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "chooseMusicContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0055:
            r1 = 4
            r0.setVisibility(r1)
            return
        L_0x005a:
            com.ss.android.ugc.aweme.shortvideo.c r0 = r1.getMusic()
            android.widget.TextView r1 = r5.f124497n
            if (r1 != 0) goto L_0x0067
            java.lang.String r2 = "tvChooseMusic"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0067:
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r0.getMusicName()
            if (r0 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            java.lang.String r0 = ""
        L_0x0072:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.widget.ImageView r0 = r5.f124496m
            if (r0 != 0) goto L_0x0080
            java.lang.String r1 = "ivChooseMusic"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0080:
            r1 = 2131953618(0x7f1307d2, float:1.9543712E38)
            r0.setImageResource(r1)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2466c.C49628f.mo97537I():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m107116a(C49628f fVar) {
        ImageView imageView = fVar.f124496m;
        if (imageView == null) {
            C52711k.m112237a("ivChooseMusic");
        }
        return imageView;
    }

    /* renamed from: b */
    public final void mo97542b(boolean z) {
        ShortVideoContextViewModel shortVideoContextViewModel = this.f124500r;
        if (shortVideoContextViewModel == null) {
            C52711k.m112237a("shortVideoContextViewModel");
        }
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f107134a;
        if (z) {
            m107115M().setOnClickListener(new C49643m(this, shortVideoContext));
        } else {
            m107115M().setOnClickListener(new C49644n(shortVideoContext));
        }
    }

    /* renamed from: d */
    public final void mo97543d(int i) {
        C10660a aVar = this.f124495l;
        if (aVar == null || !aVar.isShowing()) {
            mo97539K();
            C10660a aVar2 = null;
            if (i == 1) {
                C49610c cVar = this.f124494k;
                if (cVar != null) {
                    aVar2 = cVar.mo87837a();
                }
            } else {
                C49610c cVar2 = this.f124494k;
                if (cVar2 != null) {
                    aVar2 = cVar2.mo87839b();
                }
            }
            this.f124495l = aVar2;
            C10660a aVar3 = this.f124495l;
            if (aVar3 != null) {
                mo97536H().post(new C49646p(aVar3, this));
            }
            TextView textView = this.f124497n;
            if (textView == null) {
                C52711k.m112237a("tvChooseMusic");
            }
            textView.setOnTouchListener(new C49630b(this));
        }
    }

    public C49628f(C49609b bVar, C2763g<Boolean> gVar) {
        C52711k.m112240b(bVar, "states");
        C52711k.m112240b(gVar, "enableTopMarginEvent");
        this.f124499p = bVar;
        this.f124504v = gVar;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.atp, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(getLayo…esId(), container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
