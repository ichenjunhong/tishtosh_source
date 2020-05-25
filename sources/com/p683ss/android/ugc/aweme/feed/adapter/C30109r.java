package com.p683ss.android.ugc.aweme.feed.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0199s;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.service.C8859b;
import com.bytedance.android.livesdkapi.service.C8860c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.feedwidget.FeedLiveWindowWidget;
import com.p683ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p683ss.android.ugc.aweme.live.C36065d;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47855em;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.r */
public final class C30109r extends C30010aa implements OnClickListener {

    /* renamed from: J */
    private int f78612J = -1;

    /* renamed from: K */
    private FeedLiveWindowWidget f78613K;

    /* renamed from: L */
    private View f78614L;

    /* renamed from: M */
    private Animator f78615M;

    /* renamed from: N */
    private boolean f78616N;

    /* renamed from: O */
    private boolean f78617O;

    /* renamed from: P */
    private boolean f78618P;

    /* renamed from: Q */
    private boolean f78619Q;

    /* renamed from: R */
    private Handler f78620R = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (C30109r.this.f78623c && message.what == 100 && C30109r.this.f78622b && C30109r.this.mo60375l()) {
                C30109r.this.mo60371N();
            }
        }
    };

    /* renamed from: a */
    public RoomStruct f78621a;

    /* renamed from: b */
    public boolean f78622b;

    /* renamed from: c */
    public boolean f78623c;

    /* renamed from: d */
    public View f78624d;

    /* renamed from: e */
    public boolean f78625e;

    /* renamed from: f */
    public Room f78626f;

    /* renamed from: g */
    public C36068c f78627g = C36173w.m81665a().generateLivePlayHelper(new C30117s(this), new C36067b() {
        /* renamed from: a */
        public final void mo60360a(TextureView textureView, int i, int i2) {
        }

        /* renamed from: a */
        public final void mo60361a(C8652b bVar, Object obj) {
            switch (C301167.f78636a[bVar.ordinal()]) {
                case 1:
                case 2:
                    C30109r.this.mo60372O();
                    return;
                default:
                    return;
            }
        }
    });

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.r$7 */
    static /* synthetic */ class C301167 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78636a = new int[C8652b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.bytedance.android.livesdkapi.depend.live.h$b[] r0 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f78636a = r0
                int[] r0 = f78636a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f78636a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.C30109r.C301167.<clinit>():void");
        }
    }

    /* renamed from: am */
    private void m70659am() {
        this.f78620R.removeMessages(100);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo60243n() {
        super.mo60243n();
        mo60370C();
    }

    /* renamed from: ap */
    private void m70662ap() {
        if (mo60375l()) {
            mo60372O();
        }
    }

    /* renamed from: ar */
    private void m70664ar() {
        if (this.f78615M != null) {
            this.f78615M.cancel();
            this.f78615M = null;
        }
    }

    public final void aw_() {
        super.aw_();
        this.f78627g.mo74824c();
        m70659am();
        m70664ar();
    }

    /* renamed from: f */
    public final void mo54000f() {
        super.mo54000f();
        this.f78627g.mo74823b();
        this.f78616N = false;
    }

    /* renamed from: l */
    public final boolean mo60375l() {
        if (this.f78621a == null || !this.f78621a.isPullUrlValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public final void mo60372O() {
        C36065d live = C36173w.m81665a().getLive();
        if (live != null) {
            live.mo15036a(this.f78621a.f79734id, (C8859b) new C8859b() {
                /* renamed from: a */
                public final void mo15858a(boolean z) {
                    boolean z2 = true;
                    if (z != C30109r.this.f78622b) {
                        C30109r.this.f78622b = z;
                        C30109r.this.f78516h.mo48228a("live_has_end", (Object) Boolean.valueOf(!C30109r.this.f78622b));
                        if (C30109r.this.f78623c) {
                            C30109r.this.mo60370C();
                        }
                    }
                    if (!z) {
                        C30109r.this.f78627g.mo74820a();
                        C30109r rVar = C30109r.this;
                        if (!C30109r.this.f78623c || !C30109r.this.f78625e) {
                            z2 = false;
                        }
                        rVar.mo60374i(z2);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo54002h() {
        super.mo54002h();
        m70662ap();
        if (this.f78625e) {
            mo60371N();
            return;
        }
        if (this.f78618P) {
            m70661ao();
        }
    }

    /* renamed from: i */
    public final void mo54003i() {
        super.mo54003i();
        this.f78623c = false;
        this.f78627g.mo74820a();
        mo60374i(false);
        this.f78616N = false;
        this.f78618P = false;
        m70659am();
        m70664ar();
    }

    /* renamed from: ao */
    private void m70661ao() {
        long liveWindowShowTime = this.f78325p.getLiveWindowShowTime() * 1000;
        if (liveWindowShowTime > 0) {
            if (liveWindowShowTime < 2000) {
                liveWindowShowTime = 2000;
            }
            this.f78620R.sendMessageDelayed(this.f78620R.obtainMessage(100), liveWindowShowTime);
        }
    }

    /* renamed from: aq */
    private void m70663aq() {
        if (!this.f78625e) {
            if (this.f78624d.getVisibility() == 8) {
                this.f78624d.setVisibility(0);
                this.f78624d.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        C30109r.this.f78624d.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        C30109r.this.f78624d.setTranslationX(C30109r.m70657a(C30109r.this.f78624d));
                    }
                });
                return;
            }
            this.f78624d.setVisibility(0);
            this.f78624d.setTranslationX(m70657a(this.f78624d));
        }
    }

    /* renamed from: as */
    private boolean m70665as() {
        User author = this.f78325p.getAuthor();
        if (author == null) {
            return false;
        }
        long j = author.roomId;
        if (j > 0) {
            Object b = this.f78516h.mo48230b("key_open_live_aweme_list", null);
            if (b != null && (b instanceof Set)) {
                return ((Set) b).contains(Long.valueOf(j));
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void mo60370C() {
        this.f78621a = null;
        m70660an();
        if (this.f78624d.getVisibility() == 0) {
            this.f78624d.setVisibility(4);
        }
        if (this.f78622b) {
            this.f78617O = m70665as();
        }
        m70662ap();
    }

    /* renamed from: N */
    public final void mo60371N() {
        if (this.f78622b && this.f78623c && !this.f78617O && this.f78613K.mo60578d() != null && mo60375l() && !this.f78616N) {
            this.f78616N = true;
            m70663aq();
            this.f78627g.mo74822a(true, this.f78621a, this.f78613K.mo60578d());
        }
    }

    /* renamed from: g */
    public final void mo54001g() {
        super.mo54001g();
        this.f78622b = false;
        this.f78626f = null;
        this.f78619Q = false;
        this.f78625e = false;
        m70664ar();
        if (this.f78624d.getVisibility() == 0) {
            this.f78624d.setVisibility(4);
            this.f78624d.setTranslationX(0.0f);
        }
        if (this.f78614L.getVisibility() != 0) {
            this.f78614L.setVisibility(0);
            this.f78614L.setTranslationX(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo60241k() {
        super.mo60241k();
        this.f78516h.mo48226a("dismiss_live_window", (C0199s<C23274a>) this).mo48226a("live_window_clicked", (C0199s<C23274a>) this);
        this.f78613K = new FeedLiveWindowWidget();
        this.f78517i.mo48255b(R.id.eig, this.f78613K);
        this.f78624d = this.f78613K.f78983a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public final /* synthetic */ void mo60373P() {
        if (!this.f78625e) {
            this.f78625e = true;
            if (this.f78621a != null) {
                C23089d a = C23089d.m56640a().mo47829a("enter_from_merge", "homepage_follow").mo47829a("action_type", "click").mo47827a("anchor_id", this.f78621a.ownerUserId).mo47827a("room_id", this.f78621a.f79734id).mo47829a("enter_method", "live_window");
                if (this.f78325p != null) {
                    a.mo47829a("request_id", this.f78325p.getRequestId()).mo47826a("order", this.f78325p.getAwemePosition());
                }
                C26890h.m65011a("livesdk_live_show", a.f61491a);
            }
            m70658a(this.f78614L, this.f78624d);
        }
    }

    /* renamed from: an */
    private void m70660an() {
        boolean z;
        if (this.f78626f != null) {
            this.f78621a = C47855em.m103503a(this.f78626f);
        }
        if (!(this.f78325p == null || this.f78325p.getAuthor() == null)) {
            String str = this.f78325p.getAuthor().roomData;
            if (str != null) {
                SlimRoom slimRoom = (SlimRoom) C47760cd.m103384a(str, SlimRoom.class);
                RoomStruct roomStruct = null;
                if (slimRoom != null) {
                    RoomStruct roomStruct2 = new RoomStruct();
                    roomStruct2.f79734id = slimRoom.getId();
                    roomStruct2.ownerUserId = slimRoom.getOwnerUserId();
                    StreamUrlStruct a = C47855em.m103502a(slimRoom.getStreamUrl(), slimRoom.getMultiStreamDefaultQualitySdkKey());
                    if (a != null) {
                        roomStruct2.stream_url = a;
                        roomStruct2.isThirdParty = slimRoom.isThirdParty;
                        roomStruct2.isScreenshot = slimRoom.isScreenshot;
                        if (slimRoom.getStreamType() == C8710m.AUDIO) {
                            z = true;
                        } else {
                            z = false;
                        }
                        roomStruct2.liveTypeAudio = z;
                        roomStruct = roomStruct2;
                    }
                }
                this.f78621a = roomStruct;
            }
            if (this.f78621a == null) {
                long j = this.f78325p.getAuthor().roomId;
                if (!this.f78619Q && j > 0) {
                    this.f78619Q = true;
                    C36173w.m81665a().getLive().mo15037a(j, (C8860c) new C8860c() {
                        /* renamed from: a */
                        public final void mo15859a(Room room) {
                            C30109r.this.f78626f = room;
                            C30109r.this.f78621a = C47855em.m103503a(room);
                            if (C30109r.this.f78623c) {
                                C30109r.this.mo60370C();
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    private ObjectAnimator m70666b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{m70657a(view), 0.0f});
        ofFloat.setDuration(300);
        return ofFloat;
    }

    /* renamed from: c */
    private ObjectAnimator m70667c(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, m70657a(view)});
        ofFloat.setDuration(300);
        return ofFloat;
    }

    /* renamed from: a */
    public final void mo53995a(int i) {
        super.mo53995a(i);
        this.f78612J = i;
        this.f78623c = true;
        m70662ap();
        if (!mo60375l() || this.f78617O) {
            mo60374i(false);
        } else {
            m70661ao();
        }
    }

    public C30109r(C30069bh bhVar) {
        super(bhVar);
        this.f78614L = bhVar.f78493a.findViewById(R.id.id);
    }

    /* renamed from: a */
    public static float m70657a(View view) {
        if (view.getContext() != null && C47842ed.m103485a(view.getContext())) {
            return (float) view.getContext().getResources().getDisplayMetrics().widthPixels;
        }
        float f = (float) (-view.getWidth());
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return f;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return (f - ((float) marginLayoutParams.leftMargin)) - ((float) marginLayoutParams.rightMargin);
    }

    /* renamed from: i */
    public final void mo60374i(boolean z) {
        this.f78625e = false;
        if (z) {
            m70658a(this.f78624d, this.f78614L);
            return;
        }
        this.f78624d.setVisibility(8);
        this.f78614L.setVisibility(0);
        this.f78614L.setTranslationX(0.0f);
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        super.onChanged(aVar);
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -906007925) {
                if (hashCode != -162745511) {
                    if (hashCode == 1471092846 && str.equals("dismiss_live_window")) {
                        c = 0;
                    }
                } else if (str.equals("feed_internal_event")) {
                    c = 2;
                }
            } else if (str.equals("live_window_clicked")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo60374i(true);
                    return;
                case 1:
                    this.f78627g.mo74820a();
                    if (this.f78624d.getVisibility() == 0) {
                        mo60374i(true);
                    }
                    if (this.f78325p != null) {
                        String aid = this.f78325p.getAid();
                        if (aid != null) {
                            this.f78617O = true;
                            Object b = this.f78516h.mo48230b("key_open_live_aweme_list", null);
                            if (b == null) {
                                HashSet hashSet = new HashSet();
                                hashSet.add(aid);
                                this.f78516h.mo48228a("key_open_live_aweme_list", (Object) hashSet);
                                break;
                            } else if (b instanceof Set) {
                                ((Set) b).add(aid);
                            }
                        }
                    }
                    return;
                case 2:
                    C30332aw awVar = (C30332aw) aVar.mo48246a();
                    if (awVar != null && awVar.f79228a == 19) {
                        this.f78627g.mo74820a();
                        mo60374i(false);
                        this.f78618P = true;
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    private void m70658a(final View view, final View view2) {
        m70664ar();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f78615M = animatorSet;
        animatorSet.playTogether(new Animator[]{m70666b(view2), m70667c(view)});
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                view.setVisibility(4);
            }

            public final void onAnimationEnd(Animator animator) {
                view.setVisibility(4);
            }

            public final void onAnimationStart(Animator animator) {
                view2.setVisibility(0);
            }
        });
        animatorSet.start();
    }
}
