package com.bytedance.android.livesdk.gift.honor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3014m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.p191a.C3001b;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdkapi.p455i.C8820j;
import com.bytedance.android.livesdkapi.p455i.C8820j.C8821a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1683ag;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class LiveGiftHonorLevelWidget extends LiveWidget {

    /* renamed from: a */
    C3014m f20437a;

    /* renamed from: b */
    LiveGiftHonorProgressView f20438b;

    /* renamed from: c */
    TextView f20439c;

    /* renamed from: d */
    View f20440d;

    /* renamed from: e */
    GiftDialogViewModel f20441e;

    /* renamed from: f */
    C8820j f20442f;

    /* renamed from: g */
    Handler f20443g;

    /* renamed from: h */
    ValueAnimator f20444h;

    /* renamed from: i */
    private TextView f20445i;

    /* renamed from: j */
    private TextView f20446j;

    /* renamed from: k */
    private TextView f20447k;

    /* renamed from: l */
    private boolean f20448l;

    /* renamed from: m */
    private HSImageView f20449m;

    /* renamed from: n */
    private C1690c f20450n;

    /* renamed from: o */
    private ValueAnimator f20451o;

    /* renamed from: p */
    private View f20452p;

    /* renamed from: q */
    private boolean f20453q;

    /* renamed from: r */
    private float f20454r;

    /* renamed from: s */
    private GiftViewModel f20455s;

    public int getLayoutId() {
        return R.layout.akx;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13874b() {
        LiveGiftHonorProgressView liveGiftHonorProgressView = this.f20438b;
        liveGiftHonorProgressView.f20459b = 0.0f;
        liveGiftHonorProgressView.postInvalidate();
        if (this.f20450n != null) {
            this.f20450n.dispose();
        }
        if (this.f20437a != null) {
            mo13873a(this.f20437a.mo8162q());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f20443g != null) {
            this.f20443g.removeCallbacksAndMessages(null);
        }
        if (this.f20451o != null) {
            this.f20451o.cancel();
            this.f20451o.removeAllUpdateListeners();
            this.f20451o.removeAllListeners();
        }
        if (this.f20444h != null) {
            this.f20444h.cancel();
            this.f20444h.removeAllUpdateListeners();
            this.f20444h.removeAllListeners();
        }
        ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14535e().mo6159b((C1683ag<? super T>) new C8335g<Object>());
    }

    /* renamed from: c */
    private void m15415c() {
        C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
        if (a instanceof User) {
            ((User) a).setUserHonor(this.f20437a);
        }
        String string = this.context.getString(R.string.ecz);
        if (!(this.f20442f == null || this.f20442f.f24087g == null)) {
            Iterator it = this.f20442f.f24087g.iterator();
            while (it.hasNext()) {
                C8821a aVar = (C8821a) it.next();
                if (!(aVar == null || this.f20437a == null || aVar.f24088a != this.f20437a.mo8159n())) {
                    string = aVar.f24089b;
                }
            }
        }
        this.f20439c.setText(string);
        this.f20438b.setAlpha(0.0f);
        this.f20446j.setAlpha(0.0f);
        this.f20438b.mo13878a(0.0f, false);
        if (this.f20437a != null) {
            float r = (float) ((this.f20437a.mo8163r() - this.f20437a.mo8164s()) + 0);
            if (r > 0.0f) {
                this.f20438b.mo13877a(this.f20454r / r);
            }
        }
        if (this.f20437a != null) {
            if (this.f20437a.mo8159n() == 0) {
                this.f20449m.setActualImageResource(R.drawable.c6n);
            } else {
                C3899m.m9868b(this.f20449m, this.f20437a.mo8156k());
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f20451o = ofFloat;
        Paint paint = new Paint();
        paint.setTextSize(C9432q.m18669a(this.context, 10.0f));
        ofFloat.addUpdateListener(new C7468e(this, paint.measureText(this.f20439c.getText().toString()) + C9432q.m18687b(this.context, 40.0f)));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ((C4002ac) C2201v.m6614b(Integer.valueOf(1)).mo6539d(1500, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) LiveGiftHonorLevelWidget.this.autoDispose())).mo9405a((C1710e<? super T>) new C7482s<Object>(this));
            }
        });
        ofFloat.setDuration(500).start();
    }

    public void onCreate() {
        C3001b bVar;
        super.onCreate();
        if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            this.f20453q = true;
        }
        if (this.f20453q) {
            bVar = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a().getUserHonor();
        } else {
            bVar = null;
        }
        if (bVar instanceof C3014m) {
            this.f20437a = (C3014m) bVar;
        }
        this.f20443g = new Handler(Looper.getMainLooper());
        this.f20442f = (C8820j) LiveSettingKeys.LIVE_HONOR_LEVEL_SETTINGS_SETTING_KEY.mo9431a();
        this.f20445i = (TextView) this.contentView.findViewById(R.id.a4v);
        this.f20445i.setOnClickListener(new C7481r(this));
        this.f20440d = this.containerView.findViewById(R.id.bac);
        this.f20439c = (TextView) this.containerView.findViewById(R.id.bad);
        this.f20438b = (LiveGiftHonorProgressView) this.containerView.findViewById(R.id.apd);
        this.f20446j = (TextView) this.containerView.findViewById(R.id.bq7);
        this.f20449m = (HSImageView) this.containerView.findViewById(R.id.ba1);
        this.f20447k = (TextView) this.containerView.findViewById(R.id.dw6);
        this.f20446j.setAlpha(0.6f);
        this.f20438b.setProgressAnimatorFinishCallBack(new C7466c(this));
        this.f20452p = this.containerView.findViewById(R.id.e_n);
        ((C4002ac) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14536f().mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C7467d<Object>(this));
        if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14535e().mo6159b((C1683ag<? super T>) new C8335g<Object>());
            this.f20453q = true;
        }
        mo13871a(this.f20437a, true);
        this.f20441e = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        if (this.f20455s != null) {
            this.f20455s.mo13530a((C0184k) this, (C0199s<C7290b>) new C7465b<C7290b>(this));
            this.f20452p.setVisibility(8);
            return;
        }
        if (this.f20441e != null) {
            this.f20441e.f20754A.observe(this, new C7474k(this));
            this.f20441e.f20786s.observe(this, new C7475l(this));
            this.f20441e.f20755B.observe(this, new C7476m(this));
            this.f20452p.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13873a(String str) {
        int i;
        if (this.f20443g != null) {
            this.f20446j.setAlpha(0.6f);
            this.f20446j.setText(str);
            TextView textView = this.f20446j;
            if (this.f20448l) {
                i = 8;
            } else {
                i = 0;
            }
            C9432q.m18691b((View) textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13870a(int i) {
        float f = (float) i;
        this.f20454r = f;
        if (i <= 0 || this.f20437a == null || this.f20448l) {
            if (this.f20437a != null) {
                mo13873a(this.f20437a.mo8162q());
            }
            return;
        }
        StringBuilder sb = new StringBuilder("+");
        sb.append(i);
        String sb2 = sb.toString();
        this.f20438b.mo13877a(f / ((float) ((this.f20437a.mo8163r() - this.f20437a.mo8164s()) + 0)));
        this.f20446j.setText(sb2);
        if (this.f20450n != null) {
            this.f20450n.dispose();
        }
        this.f20450n = ((C4002ac) C2201v.m6614b(Integer.valueOf(1)).mo6539d(5000, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C7464a<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13872a(C7491b bVar) {
        int i;
        if (this.f20443g != null) {
            if (bVar == null) {
                this.f20443g.post(new C7477n(this));
                return;
            }
            C7505d dVar = null;
            if (bVar.f20516d instanceof C7505d) {
                dVar = bVar.f20516d;
            } else if (bVar.f20516d instanceof Prop) {
                dVar = ((Prop) bVar.f20516d).gift;
            }
            if (dVar != null) {
                i = dVar.f20545f;
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f20443g.post(new C7478o(this, i));
            } else {
                this.f20443g.post(new C7479p(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13871a(C3014m mVar, boolean z) {
        String str;
        int i;
        if (mVar != null) {
            C3014m mVar2 = this.f20437a;
            this.f20437a = mVar;
            TextView textView = this.f20445i;
            if (this.f20442f != null) {
                str = this.f20442f.f24084d;
            } else {
                str = this.context.getString(R.string.ecx);
            }
            textView.setText(str);
            long a = this.f20437a.mo8179a();
            if (a == 0) {
                this.f20448l = true;
                if (this.f20442f != null) {
                    this.f20447k.setText(this.f20442f.f24085e);
                }
                C9432q.m18691b((View) this.f20447k, 0);
                C9432q.m18691b((View) this.f20449m, 8);
                C9432q.m18691b((View) this.f20438b, 8);
                C9432q.m18691b((View) this.f20446j, 8);
                return;
            }
            if (this.f20437a != null) {
                mo13873a(this.f20437a.mo8162q());
            }
            C9432q.m18691b((View) this.f20447k, 8);
            C9432q.m18691b((View) this.f20449m, 0);
            C9432q.m18691b((View) this.f20438b, 0);
            this.f20448l = false;
            long s = mVar.mo8164s();
            float f = (float) (a - s);
            float r = (float) ((mVar.mo8163r() - s) + 0);
            float f2 = 0.0f;
            if (f > 0.0f && r > 0.0f) {
                f2 = f / r;
            }
            if (z || !this.f20453q) {
                this.f20453q = true;
                if (mVar.mo8159n() == 0) {
                    this.f20449m.setActualImageResource(R.drawable.c6n);
                } else {
                    C3899m.m9868b(this.f20449m, mVar.mo8156k());
                }
                this.f20438b.mo13878a(f2, false);
                return;
            }
            if (mVar2 == null) {
                i = 0;
            } else {
                i = mVar2.mo8159n();
            }
            int n = mVar.mo8159n();
            if (i == n) {
                if (mVar.mo8159n() == 0) {
                    this.f20449m.setActualImageResource(R.drawable.c6n);
                } else {
                    C3899m.m9868b(this.f20449m, mVar.mo8156k());
                }
                this.f20438b.mo13878a(f2, true);
            } else if (i < n) {
                this.f20438b.mo13878a(1.0f, false);
                m15415c();
            } else {
                if (mVar.mo8159n() == 0) {
                    this.f20449m.setActualImageResource(R.drawable.c6n);
                } else {
                    C3899m.m9868b(this.f20449m, mVar.mo8156k());
                }
                this.f20438b.mo13878a(f2, false);
            }
        }
    }
}
