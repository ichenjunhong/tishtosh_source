package com.p683ss.android.ugc.aweme.discover.p1635a;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.discover.adapter.C27934y;
import com.p683ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.trill.R;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.a.g */
public final class C27729g implements C0199s<C52847n<? extends Integer, ? extends Long>> {

    /* renamed from: a */
    public MusicPlayHelper f72773a;

    /* renamed from: b */
    public Animation f72774b;

    /* renamed from: c */
    public String f72775c;

    /* renamed from: d */
    public C52670a<C52860x> f72776d;

    /* renamed from: e */
    public Music f72777e;

    /* renamed from: f */
    public String f72778f;

    /* renamed from: g */
    public ImageView f72779g;

    /* renamed from: h */
    public FragmentActivity f72780h;

    /* renamed from: i */
    public final C27731a f72781i;

    /* renamed from: com.ss.android.ugc.aweme.discover.a.g$a */
    public interface C27731a {

        /* renamed from: c_ */
        public static final C27732a f72784c_ = C27732a.f72785a;

        /* renamed from: com.ss.android.ugc.aweme.discover.a.g$a$a */
        public static final class C27732a {

            /* renamed from: a */
            static final /* synthetic */ C27732a f72785a = new C27732a();

            private C27732a() {
            }
        }

        /* renamed from: a */
        void mo56164a(int i);
    }

    /* renamed from: a */
    private final void m66393a() {
        long j;
        this.f72779g.clearAnimation();
        MusicPlayHelper musicPlayHelper = this.f72773a;
        Music music = this.f72777e;
        long j2 = -1;
        if (music != null) {
            j = music.getId();
        } else {
            j = -1;
        }
        if (musicPlayHelper.mo56589a(j)) {
            this.f72779g.setImageResource(R.drawable.dtt);
            this.f72773a.mo56586a((C0184k) this.f72780h, (C0199s<C52847n<Integer, Long>>) this);
            return;
        }
        MusicPlayHelper musicPlayHelper2 = this.f72773a;
        Music music2 = this.f72777e;
        if (music2 != null) {
            j2 = music2.getId();
        }
        if (musicPlayHelper2.mo56590b(j2)) {
            this.f72779g.setImageResource(R.drawable.dts);
            this.f72779g.startAnimation(this.f72774b);
            return;
        }
        this.f72779g.setImageResource(R.drawable.dtu);
        this.f72773a.mo56587a((C0199s<C52847n<Integer, Long>>) this);
    }

    /* renamed from: a */
    public final void mo56160a(Music music) {
        this.f72777e = music;
        m66393a();
    }

    /* renamed from: b */
    public final void mo56162b(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f72778f = str;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C52847n nVar = (C52847n) obj;
        m66393a();
    }

    /* renamed from: a */
    public final void mo56161a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f72775c = str;
    }

    public C27729g(ImageView imageView, FragmentActivity fragmentActivity, C27934y yVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(imageView, "playStatus");
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aVar, "performClick");
        this(imageView, fragmentActivity, yVar, null, 8, null);
        this.f72776d = aVar;
    }

    private C27729g(ImageView imageView, FragmentActivity fragmentActivity, final C27934y yVar, C27731a aVar) {
        C52711k.m112240b(imageView, "playStatus");
        C52711k.m112240b(fragmentActivity, "activity");
        this.f72779g = imageView;
        this.f72780h = fragmentActivity;
        this.f72781i = aVar;
        C0209x a = C0214z.m440a(this.f72780h).mo359a(MusicPlayHelper.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…icPlayHelper::class.java)");
        this.f72773a = (MusicPlayHelper) a;
        this.f72774b = AnimationUtils.loadAnimation(this.f72780h, R.anim.fp);
        this.f72775c = "";
        this.f72778f = "";
        this.f72779g.setVisibility(0);
        this.f72779g.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27729g f72782a;

            {
                this.f72782a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.music.model.Music r8 = r8.f72777e
                    if (r8 != 0) goto L_0x000a
                    return
                L_0x000a:
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r8 = r8.f72773a
                    com.ss.android.ugc.aweme.discover.a.g r0 = r7.f72782a
                    com.ss.android.ugc.aweme.music.model.Music r0 = r0.f72777e
                    if (r0 != 0) goto L_0x0017
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x0017:
                    long r0 = r0.getId()
                    boolean r8 = r8.mo56589a(r0)
                    if (r8 != 0) goto L_0x008f
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r8 = r8.f72773a
                    com.ss.android.ugc.aweme.discover.a.g r0 = r7.f72782a
                    com.ss.android.ugc.aweme.music.model.Music r0 = r0.f72777e
                    if (r0 != 0) goto L_0x002e
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x002e:
                    long r0 = r0.getId()
                    boolean r8 = r8.mo56590b(r0)
                    if (r8 == 0) goto L_0x0039
                    goto L_0x008f
                L_0x0039:
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r8 = r8.f72773a
                    com.ss.android.ugc.aweme.discover.a.g r0 = r7.f72782a
                    android.support.v4.app.FragmentActivity r0 = r0.f72780h
                    android.arch.lifecycle.k r0 = (android.arch.lifecycle.C0184k) r0
                    com.ss.android.ugc.aweme.discover.a.g r1 = r7.f72782a
                    android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
                    r8.mo56586a(r0, r1)
                    com.ss.android.ugc.aweme.discover.adapter.y r8 = r4
                    r0 = 0
                    if (r8 == 0) goto L_0x005e
                    com.ss.android.ugc.aweme.discover.a.g r1 = r7.f72782a
                    com.ss.android.ugc.aweme.music.model.Music r1 = r1.f72777e
                    if (r1 != 0) goto L_0x0058
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x0058:
                    int r8 = r8.mo56250a(r1)
                    r5 = r8
                    goto L_0x005f
                L_0x005e:
                    r5 = 0
                L_0x005f:
                    java.lang.String r8 = "general_search"
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    com.ss.android.ugc.aweme.discover.a.g r1 = r7.f72782a
                    java.lang.String r1 = r1.f72775c
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r6 = android.text.TextUtils.equals(r8, r1)
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r1 = r8.f72773a
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    android.support.v4.app.FragmentActivity r2 = r8.f72780h
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.music.model.Music r3 = r8.f72777e
                    if (r3 != 0) goto L_0x007e
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x007e:
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    java.lang.String r4 = r8.f72778f
                    r1.mo56588a(r2, r3, r4, r5, r6)
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.discover.a.g$a r8 = r8.f72781i
                    if (r8 == 0) goto L_0x00a0
                    r8.mo56164a(r0)
                    goto L_0x00a0
                L_0x008f:
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r8 = r8.f72773a
                    r8.mo56585a()
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    com.ss.android.ugc.aweme.discover.a.g$a r8 = r8.f72781i
                    if (r8 == 0) goto L_0x00a0
                    r0 = 1
                    r8.mo56164a(r0)
                L_0x00a0:
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    android.view.animation.Animation r8 = r8.f72774b
                    if (r8 == 0) goto L_0x00b0
                    android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
                    r0.<init>()
                    android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
                    r8.setInterpolator(r0)
                L_0x00b0:
                    com.ss.android.ugc.aweme.discover.a.g r8 = r7.f72782a
                    d.f.a.a<d.x> r8 = r8.f72776d
                    if (r8 == 0) goto L_0x00ba
                    r8.invoke()
                    return
                L_0x00ba:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1635a.C27729g.C277301.onClick(android.view.View):void");
            }
        });
    }

    private /* synthetic */ C27729g(ImageView imageView, FragmentActivity fragmentActivity, C27934y yVar, C27731a aVar, int i, C52707g gVar) {
        this(imageView, fragmentActivity, yVar, (C27731a) null);
    }
}
