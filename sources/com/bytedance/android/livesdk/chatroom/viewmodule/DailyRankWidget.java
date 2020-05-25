package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0199s;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.GuardApi;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.chatroom.event.C5180az;
import com.bytedance.android.livesdk.chatroom.model.C5754k;
import com.bytedance.android.livesdk.chatroom.model.C5756l;
import com.bytedance.android.livesdk.chatroom.presenter.C5876j;
import com.bytedance.android.livesdk.chatroom.presenter.C5876j.C5877a;
import com.bytedance.android.livesdk.chatroom.presenter.C5878k;
import com.bytedance.android.livesdk.chatroom.presenter.C5879l;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdk.rank.C8127b;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.p410c.C8143c;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8545f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.pendant.C38588b;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Map;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public class DailyRankWidget extends LiveRecyclableWidget implements C0199s<KVData>, OnClickListener, C5877a {

    /* renamed from: A */
    private boolean f16862A = false;

    /* renamed from: B */
    private boolean f16863B;

    /* renamed from: C */
    private int f16864C = 0;

    /* renamed from: D */
    private CharSequence f16865D;

    /* renamed from: E */
    private String f16866E;

    /* renamed from: F */
    private int f16867F = -1;

    /* renamed from: G */
    private final C1689b f16868G = new C1689b();

    /* renamed from: H */
    private AnimatorSet f16869H;

    /* renamed from: a */
    public View f16870a;

    /* renamed from: b */
    public View f16871b;

    /* renamed from: c */
    public View f16872c;

    /* renamed from: d */
    public TextView f16873d;

    /* renamed from: e */
    public View f16874e;

    /* renamed from: f */
    public TextView f16875f;

    /* renamed from: g */
    public View f16876g;

    /* renamed from: h */
    C8127b f16877h;

    /* renamed from: i */
    C8127b f16878i;

    /* renamed from: j */
    public boolean f16879j;

    /* renamed from: k */
    C5876j f16880k;

    /* renamed from: l */
    Room f16881l;

    /* renamed from: m */
    boolean f16882m;

    /* renamed from: n */
    boolean f16883n;

    /* renamed from: o */
    public C6267b f16884o;

    /* renamed from: p */
    public C6267b f16885p;

    /* renamed from: q */
    public int f16886q = 0;

    /* renamed from: r */
    public CharSequence f16887r;

    /* renamed from: s */
    public int f16888s = -1;

    /* renamed from: t */
    public AnimatorSet f16889t;

    /* renamed from: u */
    public AnimatorSet f16890u;

    /* renamed from: v */
    public boolean f16891v = true;

    /* renamed from: w */
    public boolean f16892w = true;

    /* renamed from: x */
    private TextView f16893x;

    /* renamed from: y */
    private TextView f16894y;

    /* renamed from: z */
    private ImageView f16895z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$a */
    class C6264a implements OnGlobalLayoutListener {

        /* renamed from: a */
        int f16901a;

        /* renamed from: b */
        int f16902b;

        /* renamed from: c */
        public View f16903c;

        /* renamed from: d */
        public View f16904d;

        /* renamed from: e */
        public Runnable f16905e;

        /* renamed from: g */
        private boolean f16907g;

        /* renamed from: h */
        private int f16908h = NormalGiftView.MASK_TRANSLATE_VALUE;

        public final void onGlobalLayout() {
            int height = this.f16903c.getHeight();
            int width = this.f16903c.getWidth();
            if (VERSION.SDK_INT >= 16) {
                this.f16903c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                this.f16903c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            this.f16903c.setVisibility(8);
            if (this.f16907g) {
                if (DailyRankWidget.this.isViewValid()) {
                    if (this.f16901a <= 0 || this.f16901a >= width || this.f16902b <= 0 || this.f16902b >= height) {
                        DailyRankWidget.this.mo12333d();
                        DailyRankWidget.this.mo12331b(8);
                        DailyRankWidget.this.f16876g.setVisibility(0);
                        if (this.f16905e != null) {
                            this.f16905e.run();
                        }
                    } else {
                        int i = width - this.f16901a;
                        int i2 = height - this.f16902b;
                        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 10});
                        ofInt.addUpdateListener(new C6439aa(this, i, i2));
                        ofInt.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                if (DailyRankWidget.this.isViewValid()) {
                                    C6264a.this.f16903c.setVisibility(0);
                                    C6264a.this.f16904d.getLayoutParams().width = -2;
                                    C6264a.this.f16904d.getLayoutParams().height = -2;
                                }
                                if (C6264a.this.f16905e != null) {
                                    C6264a.this.f16905e.run();
                                }
                            }
                        });
                        ofInt.setDuration((long) this.f16908h).start();
                    }
                }
            } else if (DailyRankWidget.this.isViewValid()) {
                if (this.f16901a <= 0 || this.f16901a <= width || this.f16902b <= 0 || this.f16902b <= height) {
                    DailyRankWidget.this.f16876g.setVisibility(8);
                    DailyRankWidget.this.mo12331b(0);
                    DailyRankWidget.this.mo12332c();
                    if (this.f16905e != null) {
                        this.f16905e.run();
                    }
                } else {
                    int i3 = this.f16901a - width;
                    int i4 = this.f16902b - height;
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{1, 10});
                    ofInt2.addUpdateListener(new C6440ab(this, i3, i4));
                    ofInt2.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            if (DailyRankWidget.this.isViewValid()) {
                                C6264a.this.f16903c.setVisibility(0);
                                C6264a.this.f16904d.getLayoutParams().width = -2;
                                C6264a.this.f16904d.getLayoutParams().height = -2;
                            }
                            if (C6264a.this.f16905e != null) {
                                C6264a.this.f16905e.run();
                            }
                        }
                    });
                    ofInt2.setDuration((long) this.f16908h).start();
                }
            }
        }

        C6264a(int i, int i2, View view, View view2, boolean z, Runnable runnable) {
            this.f16901a = i;
            this.f16902b = i2;
            this.f16903c = view;
            this.f16904d = view2;
            this.f16907g = z;
            this.f16905e = runnable;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$b */
    static class C6267b {

        /* renamed from: a */
        TextView f16911a;

        /* renamed from: b */
        View f16912b;

        /* renamed from: c */
        CharSequence f16913c;

        /* renamed from: d */
        CharSequence f16914d;

        /* renamed from: e */
        public int f16915e = -1;

        /* renamed from: f */
        ObjectAnimator f16916f;

        /* renamed from: g */
        ObjectAnimator f16917g;

        /* renamed from: h */
        ObjectAnimator f16918h;

        /* renamed from: i */
        public C6273a f16919i;

        /* renamed from: j */
        long f16920j;

        /* renamed from: k */
        int f16921k;

        /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$b$a */
        interface C6273a {
        }

        /* renamed from: b */
        private void m13463b() {
            m13464c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo12341a() {
            m13466e();
            this.f16911a = null;
            this.f16912b = null;
            this.f16913c = null;
            this.f16914d = null;
            this.f16915e = -1;
            this.f16916f = null;
            this.f16917g = null;
        }

        /* renamed from: c */
        private void m13464c() {
            this.f16916f = ObjectAnimator.ofFloat(this.f16911a, "alpha", new float[]{1.0f, 0.0f, 0.0f});
            this.f16916f.setDuration(480);
            this.f16916f.removeAllListeners();
            this.f16916f.addListener(new AnimatorListener() {
                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationCancel(Animator animator) {
                    C6267b.this.f16911a.setAlpha(1.0f);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (C6267b.this.f16911a != null) {
                        C6267b.this.f16911a.setTranslationX(0.0f);
                        if (C6267b.this.f16915e == 1) {
                            C6267b.this.mo12343a(C6267b.this.f16914d);
                            C6267b.this.f16911a.setText(C6267b.this.f16914d);
                            C6267b.this.f16915e = 2;
                        } else if (C6267b.this.f16915e == 2) {
                            C6267b.this.mo12343a(C6267b.this.f16913c);
                            C6267b.this.f16911a.setText(C6267b.this.f16913c);
                            C6267b.this.f16915e = -1;
                            C6267b.this.mo12342a(5000);
                        } else {
                            return;
                        }
                        if (C6267b.this.f16918h != null) {
                            C6267b.this.f16918h.cancel();
                        }
                        C6267b.this.f16918h = ObjectAnimator.ofFloat(C6267b.this.f16911a, "alpha", new float[]{0.0f, 1.0f, 1.0f});
                        C6267b.this.f16918h.setDuration(480);
                        C6267b.this.f16918h.removeAllListeners();
                        C6267b.this.f16918h.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                int i;
                                long j;
                                if (C6267b.this.f16915e == 2) {
                                    C6267b bVar = C6267b.this;
                                    if (bVar.f16921k > 0) {
                                        i = 0;
                                    } else {
                                        i = bVar.f16921k;
                                    }
                                    bVar.f16921k = i;
                                    bVar.f16917g = ObjectAnimator.ofFloat(bVar.f16911a, "translationX", new float[]{0.0f, (float) bVar.f16921k});
                                    if (bVar.f16920j <= 0) {
                                        j = 5000;
                                    } else {
                                        j = bVar.f16920j;
                                    }
                                    bVar.f16920j = j;
                                    long min = Math.min(bVar.f16920j, (long) (Math.abs(bVar.f16921k) * 60));
                                    long j2 = bVar.f16920j - min;
                                    bVar.f16917g.setDuration(min);
                                    bVar.f16917g.removeAllListeners();
                                    bVar.f16917g.addListener(new AnimatorListenerAdapter(j2) {

                                        /* renamed from: a */
                                        final /* synthetic */ long f16925a;

                                        public final void onAnimationStart(Animator animator) {
                                            C6267b.this.f16915e = 3;
                                        }

                                        public final void onAnimationCancel(Animator animator) {
                                            if (C6267b.this.f16911a != null) {
                                                C6267b.this.f16911a.setTranslationX(0.0f);
                                            }
                                            C6267b.this.f16919i = null;
                                        }

                                        public final void onAnimationEnd(Animator animator) {
                                            C6267b.this.f16915e = 2;
                                            if (C6267b.this.f16919i == null) {
                                                C6267b.this.mo12342a(this.f16925a);
                                            } else if (C6267b.this.f16912b != null) {
                                                C6267b.this.f16912b.postDelayed(new Runnable() {
                                                    public final void run() {
                                                    }
                                                }, this.f16925a);
                                            }
                                        }

                                        {
                                            this.f16925a = r2;
                                        }
                                    });
                                    if (bVar.f16917g != null) {
                                        bVar.f16917g.start();
                                    }
                                }
                            }
                        });
                        C6267b.this.f16918h.start();
                    }
                }
            });
        }

        /* renamed from: d */
        private int m13465d() {
            float f;
            if (TextUtils.isEmpty(this.f16913c) || TextUtils.isEmpty(this.f16914d)) {
                f = 0.0f;
            } else {
                f = this.f16911a.getPaint().measureText(this.f16913c.toString());
            }
            if (f == 0.0f) {
                return 0;
            }
            return -((int) (this.f16911a.getPaint().measureText(this.f16914d.toString()) - f));
        }

        /* renamed from: e */
        private void m13466e() {
            this.f16915e = -1;
            if (this.f16917g != null) {
                this.f16917g.removeAllListeners();
                this.f16917g.cancel();
                this.f16917g = null;
            }
            if (this.f16916f != null) {
                this.f16916f.removeAllListeners();
                this.f16916f.cancel();
                this.f16916f = null;
            }
            if (this.f16918h != null) {
                this.f16918h.removeAllListeners();
                this.f16918h.cancel();
                this.f16918h = null;
            }
            this.f16919i = null;
            if (this.f16911a != null) {
                this.f16911a.clearAnimation();
                this.f16911a.setText(this.f16913c);
                this.f16911a.setAlpha(1.0f);
                this.f16911a.setTranslationX(0.0f);
            }
            if (this.f16912b != null) {
                this.f16912b.setVisibility(8);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo12344b(CharSequence charSequence) {
            this.f16914d = charSequence;
            this.f16921k = m13465d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo12342a(long j) {
            if (((this.f16916f != null && !this.f16916f.isRunning()) || j != 0) && !TextUtils.isEmpty(this.f16914d)) {
                if ((this.f16915e == -1 || this.f16915e == 2) && this.f16912b != null) {
                    if (this.f16915e == -1) {
                        this.f16915e = 1;
                    }
                    m13463b();
                    this.f16912b.postDelayed(new Runnable() {
                        public final void run() {
                            if (C6267b.this.f16916f != null) {
                                C6267b.this.f16916f.start();
                            }
                        }
                    }, j);
                }
            }
        }

        /* renamed from: a */
        public final void mo12343a(CharSequence charSequence) {
            int i;
            LayoutParams layoutParams = (LayoutParams) this.f16911a.getLayoutParams();
            if (TextUtils.isEmpty(charSequence)) {
                i = -2;
            } else {
                i = (int) this.f16911a.getPaint().measureText(charSequence.toString());
            }
            layoutParams.width = i;
            this.f16911a.setLayoutParams(layoutParams);
        }

        C6267b(TextView textView, View view) {
            this.f16911a = textView;
            this.f16912b = view;
            m13463b();
        }
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.aps;
    }

    /* renamed from: c */
    public final void mo12332c() {
        if (this.f16862A) {
            this.f16893x.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo12333d() {
        if (this.f16862A) {
            this.f16893x.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static boolean m13450a() {
        if (((Integer) LiveSettingKeys.LIVE_DAILY_RANK.mo9431a()).intValue() != 0) {
            return true;
        }
        return false;
    }

    public DailyRankWidget() {
        ((Integer) LiveSettingKeys.LIVE_ENABLE_GUARD.mo9431a()).intValue();
    }

    public void onUnload() {
        this.f16880k.mo8247a();
        if (this.f16889t != null) {
            this.f16889t.removeAllListeners();
            this.f16889t.cancel();
            this.f16889t = null;
        }
        if (this.f16890u != null) {
            this.f16890u.removeAllListeners();
            this.f16890u.cancel();
            this.f16890u = null;
        }
        if (this.f16872c != null) {
            this.f16872c.setScaleY(1.0f);
        }
        if (this.f16874e != null) {
            this.f16874e.setScaleY(1.0f);
        }
        this.f16888s = -1;
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        if (this.f16877h != null) {
            try {
                this.f16877h.dismiss();
            } catch (IllegalStateException unused) {
            }
            this.f16877h = null;
        }
        this.f16879j = false;
        this.f16893x.setVisibility(8);
        if (this.f16884o != null) {
            this.f16884o.mo12341a();
            this.f16884o = null;
        }
        if (this.f16885p != null) {
            this.f16885p.mo12341a();
            this.f16885p = null;
        }
        this.f16887r = null;
        this.f16865D = null;
        this.f16864C = 0;
        this.f16886q = 0;
        this.f16868G.mo6180a();
        if (this.f16869H != null) {
            this.f16869H.cancel();
            this.f16869H = null;
        }
    }

    public void onEvent(C5180az azVar) {
        if (isViewValid() && this.f16877h != null) {
            this.f16877h.dismiss();
        }
    }

    /* renamed from: b */
    private void m13451b(String str) {
        new C8545f(this.context).mo14978a(str).mo14979b(new C6619y(this)).mo14977a(C6620z.f17979a).show();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12328a(int i) {
        if (this.f16877h != null) {
            this.f16877h.dismiss();
        } else {
            this.f16877h = C8127b.m16198a(this.f16881l, this.f16882m, this.f16883n, this.dataCenter, i);
        }
        this.f16877h.f22201h = i;
        this.f16877h.show(((FragmentActivity) this.context).getSupportFragmentManager(), C8127b.f22192a);
    }

    /* renamed from: b */
    public final void mo12331b(int i) {
        if (this.f16863B) {
            C9432q.m18691b(this.f16872c, 8);
        } else {
            C9432q.m18691b(this.f16872c, i);
        }
    }

    public void onClick(View view) {
        String str;
        if (isViewValid()) {
            int id = view.getId();
            if (id == R.id.a35) {
                mo12328a(0);
            } else if (id == R.id.bij) {
                mo12328a(1);
            } else {
                if (id == R.id.amv) {
                    if (this.f16882m) {
                        str = "https://hotsoon.snssdk.com/falcon/live_inroom/page/guard_list/index.html?room_id=%s&anchor_id=%s&user_id=%s&source=%s&is_first_consume=%s";
                    } else {
                        str = "https://hotsoon.snssdk.com/falcon/live_inroom/page/guard/index.html?room_id=%s&anchor_id=%s&user_id=%s&source=%s&is_first_consume=%s";
                    }
                    mo12330a(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11761a(C8214a aVar) {
        String str;
        if (isViewValid() && aVar != null) {
            this.f16863B = aVar.f22423k;
            if (aVar.f22423k) {
                C9432q.m18691b(this.f16872c, 8);
                return;
            }
            if (aVar.f22429q == null) {
                str = null;
            } else {
                str = aVar.f22429q.f22448g;
            }
            this.f16866E = str;
            LiveSettingKeys.AWEME_HOUR_RANK_ENTRANCE_STYLE.mo9431a();
            if (aVar.f22414b != null && !C9431p.m18664a(aVar.f22414b.f22445d)) {
                this.f16887r = aVar.f22414b.f22445d;
                this.f16865D = aVar.f22414b.f22445d;
                if (aVar.f22429q != null) {
                    this.f16886q = aVar.f22429q.f22444c;
                    this.f16865D = aVar.f22429q.f22445d;
                }
                mo12329a(aVar.f22414b.f22444c, this.f16886q, true);
            }
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -774172322) {
                if (hashCode == 1433895618 && key.equals("cmd_send_gift")) {
                    c = 0;
                }
            } else if (key.equals("cmd_dismiss_dialog_end")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    if (isViewValid() && this.f16877h != null) {
                        this.f16877h.dismiss();
                    }
                    return;
                case 1:
                    if (isViewValid() && this.f16877h != null) {
                        this.f16877h.dismiss();
                        break;
                    }
            }
        }
    }

    public void onInit(Object... objArr) {
        this.f16871b = this.contentView.findViewById(R.id.a36);
        this.f16872c = this.contentView.findViewById(R.id.a35);
        this.f16873d = (TextView) this.contentView.findViewById(R.id.a34);
        this.f16874e = this.contentView.findViewById(R.id.bij);
        this.f16875f = (TextView) this.contentView.findViewById(R.id.bii);
        this.f16876g = this.contentView.findViewById(R.id.a38);
        this.f16894y = (TextView) this.contentView.findViewById(R.id.a37);
        this.f16870a = this.contentView.findViewById(R.id.a33);
        this.f16872c.setOnClickListener(this);
        this.f16874e.setOnClickListener(this);
        this.f16893x = (TextView) this.contentView.findViewById(R.id.amv);
        if (this.contentView != null) {
            this.f16895z = (ImageView) this.contentView.findViewById(R.id.c8i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16895z.getLayoutParams();
            C9432q.m18691b((View) this.f16895z, 8);
            this.f16895z.setLayoutParams(layoutParams);
            getContext();
        }
        if (C8607a.f23572a) {
            this.f16893x.setVisibility(8);
            Drawable[] compoundDrawables = this.f16873d.getCompoundDrawables();
            if (compoundDrawables != null && compoundDrawables.length > 0 && VERSION.SDK_INT >= 19) {
                for (Drawable drawable : compoundDrawables) {
                    if (drawable != null) {
                        drawable.setAutoMirrored(true);
                    }
                }
            }
        }
        this.f16893x.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo11759a(C5754k kVar) {
        C5756l lVar;
        if (isViewValid() && kVar != null && this.f16862A && kVar.f15125c != 0) {
            Map map = (Map) C4525b.f12379av.mo10345a();
            try {
                lVar = (C5756l) C2942b.m8369a().mo34884a((String) map.get(Long.valueOf(this.f16881l.getOwnerUserId())), C5756l.class);
            } catch (Exception e) {
                C3831a.m9716d("DailyRankWidget", e.toString());
                lVar = null;
            }
            if (lVar == null) {
                lVar = new C5756l();
            }
            if (kVar.f15125c == 1) {
                if (!lVar.f15130a && (kVar.f15127e.f15128a * 1000) - System.currentTimeMillis() < 604800000) {
                    int currentTimeMillis = ((int) ((kVar.f15127e.f15128a * 1000) - System.currentTimeMillis())) / C38588b.f98133g;
                    if (currentTimeMillis >= 0) {
                        m13451b(C3922z.m9905a((int) R.string.eid, Integer.valueOf(currentTimeMillis)));
                        lVar.f15130a = true;
                        map.put(Long.valueOf(this.f16881l.getOwnerUserId()), C2942b.m8369a().mo34889b(lVar));
                    }
                } else if ((kVar.f15127e.f15128a * 1000) - System.currentTimeMillis() > 604800000) {
                    lVar.f15130a = false;
                    lVar.f15131b = 0;
                    lVar.f15132c = 0;
                    map.put(Long.valueOf(this.f16881l.getOwnerUserId()), C2942b.m8369a().mo34889b(lVar));
                }
            } else if (kVar.f15125c == 2) {
                int i = lVar.f15132c;
                if (i < 3 && System.currentTimeMillis() - lVar.f15131b > 604800000) {
                    int i2 = kVar.f15123a;
                    m13451b(C3922z.m9905a((int) R.string.eie, Long.valueOf(kVar.f15126d), Long.valueOf(kVar.f15124b), C3922z.m9903a((int) R.string.eig)));
                    lVar.f15131b = System.currentTimeMillis();
                    lVar.f15132c = i + 1;
                    map.put(Long.valueOf(this.f16881l.getOwnerUserId()), C2942b.m8369a().mo34889b(lVar));
                }
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f16881l = (Room) this.dataCenter.get("data_room");
        this.f16882m = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16883n = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f16880k = new C5876j();
        this.f16880k.f15384a = this.f16881l.getOwner().getId();
        this.f16880k.f15385b = this.f16881l.getId();
        this.f16880k.mo8520a((C5877a) this);
        this.dataCenter.observe("cmd_send_gift", this);
        this.dataCenter.observe("cmd_dismiss_dialog_end", this);
        this.f16868G.mo6181a(C4495a.m10823a().mo10300a(C5180az.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<C5180az>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                DailyRankWidget.this.onEvent((C5180az) obj);
            }
        }));
        this.f16868G.mo6181a(C4495a.m10823a().mo10300a(C8143c.class).mo6545f((C1710e<? super T>) new C6617w<Object>(this)));
        if (isViewValid() && this.f16873d != null) {
            this.f16872c.setVisibility(8);
            this.f16876g.setVisibility(8);
            this.f16884o = new C6267b(this.f16873d, this.f16872c);
            this.f16885p = new C6267b(this.f16875f, this.f16874e);
            if (m13450a()) {
                this.f16880k.mo11758b();
            }
        }
        if (this.f16862A && !this.f16882m) {
            C5876j jVar = this.f16880k;
            jVar.f15386c = ((C4585b) ((GuardApi) C4514j.m10883j().mo10321b().mo9550a(GuardApi.class)).getGuardInfo(jVar.f15385b).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10390a(3).mo6514a(C1667a.m5940a()).mo6529b(C2168a.m6521b()).mo6505a((C1710e<? super T>) new C5878k<Object>(jVar), (C1710e<? super Throwable>) new C5879l<Object>(jVar));
        }
        mo12332c();
        LiveSettingKeys.AWEME_HOUR_RANK_ENTRANCE_STYLE.mo9431a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ef  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11760a(final com.bytedance.android.livesdk.message.model.C8012v r14) {
        /*
            r13 = this;
            boolean r0 = r13.isViewValid()
            if (r0 == 0) goto L_0x019d
            if (r14 != 0) goto L_0x000a
            goto L_0x019d
        L_0x000a:
            java.lang.String r0 = r14.f21934l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = r14.f21934l
            r13.f16866E = r0
        L_0x0016:
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdkapi.i.k> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.AWEME_HOUR_RANK_ENTRANCE_STYLE
            java.lang.Object r0 = r0.mo9431a()
            com.bytedance.android.livesdkapi.i.k r0 = (com.bytedance.android.livesdkapi.p455i.C8822k) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0031
            int r3 = r0.f24090a
            if (r3 != 0) goto L_0x002f
            long r3 = r14.f21933k
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            goto L_0x0032
        L_0x0031:
            r3 = 1
        L_0x0032:
            if (r0 == 0) goto L_0x0042
            int r0 = r0.f24090a
            if (r0 <= 0) goto L_0x0042
            long r4 = r14.f21933k
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            int r4 = r14.f21928f
            r5 = 6
            if (r4 == r5) goto L_0x0054
            switch(r4) {
                case 1: goto L_0x0054;
                case 2: goto L_0x004d;
                case 3: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x019b
        L_0x004d:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.add(r14)
            goto L_0x019b
        L_0x0054:
            com.bytedance.android.livesdkapi.message.b r4 = r14.baseMessage
            if (r4 == 0) goto L_0x019c
            boolean r4 = r13.f16879j
            if (r4 == 0) goto L_0x005e
            goto L_0x019c
        L_0x005e:
            if (r3 != 0) goto L_0x0063
            if (r0 != 0) goto L_0x0063
            return
        L_0x0063:
            java.lang.String r3 = r14.f21935m
            if (r0 == 0) goto L_0x0069
            java.lang.String r3 = "2"
        L_0x0069:
            java.lang.String r4 = "1"
            boolean r4 = android.text.TextUtils.equals(r3, r4)
            r5 = 8
            if (r4 == 0) goto L_0x0152
            java.lang.String r3 = r14.f21923a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0081
            boolean r3 = r14.supportDisplayText()
            if (r3 == 0) goto L_0x0198
        L_0x0081:
            int r3 = r14.f21927e
            if (r3 <= 0) goto L_0x0198
            com.bytedance.android.livesdkapi.message.g r3 = r14.f21926d
            if (r3 == 0) goto L_0x0092
            com.bytedance.android.livesdkapi.message.g r3 = r14.f21926d
            java.lang.String r4 = r14.f21924b
            android.text.Spannable r3 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r3, r4)
            goto L_0x0099
        L_0x0092:
            android.text.SpannableString r3 = new android.text.SpannableString
            java.lang.String r4 = r14.f21924b
            r3.<init>(r4)
        L_0x0099:
            boolean r4 = r14.supportDisplayText()
            if (r4 == 0) goto L_0x00aa
            com.bytedance.android.livesdkapi.message.b r4 = r14.baseMessage
            com.bytedance.android.livesdkapi.message.g r4 = r4.f24139j
            java.lang.String r6 = r14.f21923a
            android.text.Spannable r4 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r4, r6)
            goto L_0x00b1
        L_0x00aa:
            android.text.SpannableString r4 = new android.text.SpannableString
            java.lang.String r6 = r14.f21923a
            r4.<init>(r6)
        L_0x00b1:
            android.text.Spannable r6 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.f13664a
            boolean r6 = android.text.TextUtils.equals(r3, r6)
            if (r6 != 0) goto L_0x00bb
            r13.f16887r = r3
        L_0x00bb:
            boolean r6 = r13.f16882m
            boolean r6 = com.bytedance.android.livesdk.rank.C8213m.m16290b(r6)
            if (r6 == 0) goto L_0x00c5
        L_0x00c3:
            r6 = 1
            goto L_0x00d5
        L_0x00c5:
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.chatroom.model.r> r6 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_RANK_CONFIG
            java.lang.Object r6 = r6.mo9431a()
            com.bytedance.android.livesdk.chatroom.model.r r6 = (com.bytedance.android.livesdk.chatroom.model.C5763r) r6
            if (r6 == 0) goto L_0x00d4
            boolean r6 = r6.f15152b
            if (r6 == 0) goto L_0x00d4
            goto L_0x00c3
        L_0x00d4:
            r6 = 0
        L_0x00d5:
            if (r6 == 0) goto L_0x00ef
            com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$b r0 = r13.f16884o
            r0.mo12344b(r4)
            com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$b r0 = r13.f16884o
            int r1 = r14.f21927e
            long r3 = (long) r1
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.f16920j = r3
            int r14 = r14.f21931i
            int r0 = r13.f16886q
            r13.mo12329a(r14, r0, r2)
            return
        L_0x00ef:
            r13.f16879j = r1
            android.view.View r1 = r13.f16871b
            r1.setVisibility(r5)
            r13.mo12333d()
            android.widget.TextView r1 = r13.f16894y
            r1.setText(r4)
            android.view.View r1 = r13.f16876g
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$a r12 = new com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$a
            android.view.View r4 = r13.f16870a
            int r6 = r4.getWidth()
            android.view.View r4 = r13.f16870a
            int r7 = r4.getHeight()
            android.view.View r8 = r13.f16876g
            android.view.View r9 = r13.f16870a
            r10 = 1
            r11 = 0
            r4 = r12
            r5 = r13
            r4.<init>(r6, r7, r8, r9, r10, r11)
            r1.addOnGlobalLayoutListener(r12)
            android.view.View r1 = r13.f16876g
            r1.setVisibility(r2)
            android.view.View r1 = r13.f16876g
            com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$2 r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$2
            r2.<init>(r3, r14)
            int r3 = r14.f21927e
            int r3 = r3 * 1000
            long r3 = (long) r3
            r1.postDelayed(r2, r3)
            android.view.View r1 = r13.f16876g
            com.bytedance.android.livesdk.chatroom.viewmodule.x r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.x
            r2.<init>(r13, r14)
            r1.setOnClickListener(r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "trace_id"
            java.lang.String r14 = r14.f21930h     // Catch:{ JSONException -> 0x0150 }
            r1.put(r2, r14)     // Catch:{ JSONException -> 0x0150 }
            android.content.Context r14 = r13.context     // Catch:{ JSONException -> 0x0150 }
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r14)     // Catch:{ JSONException -> 0x0150 }
            goto L_0x0198
        L_0x0150:
            goto L_0x0198
        L_0x0152:
            java.lang.String r1 = "2"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0198
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.f13664a
            boolean r3 = r14.supportDisplayText()
            if (r3 == 0) goto L_0x016d
            com.bytedance.android.livesdkapi.message.b r1 = r14.baseMessage
            com.bytedance.android.livesdkapi.message.g r1 = r1.f24139j
            java.lang.String r3 = r14.f21923a
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r1, r3)
            goto L_0x017c
        L_0x016d:
            java.lang.String r3 = r14.f21923a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x017c
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.String r3 = r14.f21923a
            r1.<init>(r3)
        L_0x017c:
            android.text.Spannable r3 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.f13664a
            boolean r3 = android.text.TextUtils.equals(r1, r3)
            if (r3 != 0) goto L_0x0198
            com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$b r3 = r13.f16884o
            r4 = 0
            r3.mo12344b(r4)
            android.view.View r3 = r13.f16876g
            r3.setVisibility(r5)
            r13.f16887r = r1
            int r14 = r14.f21931i
            int r1 = r13.f16886q
            r13.mo12329a(r14, r1, r2)
        L_0x0198:
            if (r0 == 0) goto L_0x019b
            return
        L_0x019b:
            return
        L_0x019c:
            return
        L_0x019d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget.mo11760a(com.bytedance.android.livesdk.message.model.v):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12330a(String str) {
        int i;
        int i2;
        if (this.f16862A) {
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.context, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev7)).mo14543c("guard").mo14539a(0).mo14541a()).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
            } else if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.GUARD)) {
                String a = C2240a.m6773a(Locale.US, str, new Object[]{Long.valueOf(this.f16881l.getId()), Long.valueOf(this.f16881l.getOwner().getId()), Long.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()), "", String.valueOf(C4627a.m11090a(TTLiveSDKContext.getHostService().mo10315h().mo14521a()))});
                float f = this.context.getResources().getDisplayMetrics().density;
                boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
                if (booleanValue) {
                    i = (int) (((float) this.context.getResources().getDisplayMetrics().widthPixels) / f);
                } else {
                    i = (int) (((float) this.context.getResources().getDisplayMetrics().heightPixels) / f);
                }
                int i3 = i;
                C4495a a2 = C4495a.m10823a();
                String str2 = "guard";
                if (booleanValue) {
                    i2 = 80;
                } else {
                    i2 = 5;
                }
                C5161ag agVar = new C5161ag(a, str2, i2, i3, i3, 0, 0);
                a2.mo10301a((Object) agVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo12329a(int i, int i2, boolean z) {
        this.f16872c.setVisibility(0);
        this.f16873d.setText(this.f16887r);
    }
}
