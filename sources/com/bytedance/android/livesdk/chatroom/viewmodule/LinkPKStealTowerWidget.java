package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4633e;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5575gh;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5575gh.C5576a;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d;
import com.bytedance.android.livesdk.chatroom.p307c.C5044e;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.ies.sdk.widgets.KVData;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

public class LinkPKStealTowerWidget extends SubWidget implements C0199s<KVData>, C5576a {

    /* renamed from: d */
    static final int f17201d = Color.parseColor("#ffee00");

    /* renamed from: e */
    View f17202e;

    /* renamed from: f */
    View f17203f;

    /* renamed from: g */
    ForegroundColorSpan f17204g;

    /* renamed from: h */
    C5038d<TextView> f17205h;

    /* renamed from: i */
    private boolean f17206i;

    /* renamed from: j */
    private C5575gh f17207j;

    /* renamed from: k */
    private ViewGroup f17208k;

    /* renamed from: l */
    private TextView f17209l;

    /* renamed from: m */
    private ProgressBar f17210m;

    /* renamed from: n */
    private LayoutParams f17211n;

    /* renamed from: o */
    private LayoutParams f17212o;

    /* renamed from: p */
    private C5044e f17213p;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public void onDestroy() {
        this.f17152a.removeObserver(this);
        this.f17213p.mo10906a();
        this.f17207j.mo8247a();
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f17206i = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17208k = (ViewGroup) this.contentView.findViewById(R.id.b_d);
        this.f17202e = this.contentView.findViewById(R.id.dgg);
        this.f17203f = this.contentView.findViewById(R.id.dgh);
        this.f17209l = (TextView) this.contentView.findViewById(R.id.dgj);
        this.f17210m = (ProgressBar) this.contentView.findViewById(R.id.c6d);
        this.f17211n = (LayoutParams) this.f17202e.getLayoutParams();
        this.f17212o = (LayoutParams) this.f17203f.getLayoutParams();
        this.f17213p = new C5044e(this.f17152a, this.contentView);
        this.f17205h = this.f17213p.mo10905a(R.id.dgi).mo10901a("data_pk_steal_tower_score", new C6510cr(this)).mo10902a();
        this.f17207j = new C5575gh(this.dataCenter);
        this.f17207j.mo8520a((C5576a) this);
        this.f17152a.observe("data_pk_steal_tower_state", this);
    }

    /* renamed from: a */
    public final void mo11481a(int i) {
        this.f17209l.setText(C3922z.m9905a((int) R.string.ely, C4574am.m10978a((long) i)));
    }

    /* renamed from: b */
    public final void mo11483b(int i) {
        this.f17209l.setText(C3922z.m9905a((int) R.string.em_, C4574am.m10978a((long) i)));
    }

    public /* synthetic */ void onChanged(Object obj) {
        long j;
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i;
        int i2;
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == 436641052 && key.equals("data_pk_steal_tower_state")) {
                c = 0;
            }
            if (c == 0) {
                if (kVData.getData().equals(C4633e.READY)) {
                    this.f17208k.setVisibility(8);
                    this.f17210m.setVisibility(0);
                    this.f17209l.setBackgroundResource(0);
                    this.f17209l.setVisibility(0);
                    this.f17202e.setBackgroundResource(R.drawable.c0a);
                    this.f17203f.setBackgroundResource(R.drawable.c0c);
                } else if (kVData.getData().equals(C4633e.IN_PROCESS)) {
                    this.f17210m.setVisibility(8);
                    this.f17209l.setBackgroundResource(R.drawable.bk4);
                    mo12434a((View) this.f17205h.f13491b, true);
                    mo12434a(this.f17203f, true);
                    mo12434a(this.f17202e, true);
                    boolean z = this.f17152a.f12610E.f12643b;
                    View view = this.f17202e;
                    if (z) {
                        layoutParams = this.f17211n;
                    } else {
                        layoutParams = this.f17212o;
                    }
                    view.setLayoutParams(layoutParams);
                    View view2 = this.f17203f;
                    if (z) {
                        layoutParams2 = this.f17212o;
                    } else {
                        layoutParams2 = this.f17211n;
                    }
                    view2.setLayoutParams(layoutParams2);
                    switch (this.f17152a.f12610E.f12648g) {
                        case 1:
                            i = R.string.em0;
                            if (!this.f17206i) {
                                i2 = R.string.em4;
                                break;
                            } else {
                                i2 = R.string.em1;
                                break;
                            }
                        case 2:
                            i = R.string.em7;
                            if (!this.f17206i) {
                                i2 = R.string.em5;
                                break;
                            } else {
                                i2 = R.string.em2;
                                break;
                            }
                        default:
                            i = R.string.em9;
                            if (!this.f17206i) {
                                i2 = R.string.em6;
                                break;
                            } else {
                                i2 = R.string.em3;
                                break;
                            }
                    }
                    C4575an.m10981a(i);
                    this.f17207j.mo11476a(C3922z.m9903a(i2));
                } else if (kVData.getData().equals(C4633e.ENDED)) {
                    this.f17208k.setVisibility(0);
                    this.f17209l.setVisibility(8);
                    if (this.f17152a.f12610E.f12647f) {
                        ((TextView) this.f17205h.f13491b).setText(R.string.em8);
                        this.f17203f.setBackgroundResource(R.drawable.c0d);
                    } else {
                        ((TextView) this.f17205h.f13491b).setText(R.string.elz);
                        this.f17202e.setBackgroundResource(R.drawable.c0b);
                    }
                    if (this.f17152a.f12610E.f12647f) {
                        j = 3000;
                    } else {
                        j = 5000;
                    }
                    C2201v.m6592a(j, TimeUnit.MILLISECONDS).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6511cs<Object>(this), (C1710e<? super Throwable>) new C6512ct<Object>(this));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11482a(int i, int i2) {
        if (this.f17210m.getMax() != i2) {
            this.f17210m.setMax(i2);
        }
        this.f17210m.setProgress(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12434a(final View view, boolean z) {
        if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200);
            view.startAnimation(alphaAnimation);
            view.setVisibility(0);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(200);
        view.startAnimation(alphaAnimation2);
        alphaAnimation2.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
            }
        });
    }
}
