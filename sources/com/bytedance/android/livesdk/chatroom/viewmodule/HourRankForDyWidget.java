package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.C5156ab;
import com.bytedance.android.livesdk.chatroom.event.C5180az;
import com.bytedance.android.livesdk.chatroom.model.C5754k;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.presenter.C5876j;
import com.bytedance.android.livesdk.chatroom.presenter.C5876j.C5877a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.drawerfeed.C6749b;
import com.bytedance.android.livesdk.message.model.C8012v;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.rank.C8127b;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p455i.C8826o;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class HourRankForDyWidget extends LiveRecyclableWidget implements C0199s<KVData>, OnClickListener, C5877a {

    /* renamed from: a */
    AnimatorSet f17067a;

    /* renamed from: b */
    public C1689b f17068b = new C1689b();

    /* renamed from: c */
    public View f17069c;

    /* renamed from: d */
    PopupWindow f17070d;

    /* renamed from: e */
    private View f17071e;

    /* renamed from: f */
    private View f17072f;

    /* renamed from: g */
    private TextView f17073g;

    /* renamed from: h */
    private C8127b f17074h;

    /* renamed from: i */
    private boolean f17075i;

    /* renamed from: j */
    private C5876j f17076j;

    /* renamed from: k */
    private Room f17077k;

    /* renamed from: l */
    private boolean f17078l;

    /* renamed from: m */
    private boolean f17079m;

    /* renamed from: n */
    private CharSequence f17080n;

    /* renamed from: o */
    private HSImageView f17081o;

    /* renamed from: p */
    private HSImageView f17082p;

    /* renamed from: q */
    private HSImageView f17083q;

    /* renamed from: r */
    private int f17084r;

    /* renamed from: a */
    public final void mo11759a(C5754k kVar) {
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
        return R.layout.apu;
    }

    public void onUnload() {
        this.f17076j.mo8247a();
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        if (this.f17074h != null) {
            try {
                this.f17074h.dismiss();
            } catch (IllegalStateException unused) {
            }
            this.f17074h = null;
        }
        this.f17075i = false;
        this.f17080n = null;
    }

    /* renamed from: a */
    private void m13561a() {
        this.f17071e.setVisibility(0);
        if (TextUtils.isEmpty(this.f17080n)) {
            this.f17071e.setVisibility(4);
            return;
        }
        this.f17073g.setText(this.f17080n);
        if (this.f17084r != 10) {
            this.f17084r = 10;
            this.f17073g.setTextSize((float) this.f17084r);
        }
    }

    public void onEvent(C5180az azVar) {
        if (isViewValid() && this.f17074h != null) {
            this.f17074h.dismiss();
        }
    }

    public void onInit(Object... objArr) {
        this.f17071e = this.contentView.findViewById(R.id.apv);
        this.f17072f = this.contentView.findViewById(R.id.bmz);
        this.f17073g = (TextView) this.contentView.findViewById(R.id.apu);
        this.f17071e.setOnClickListener(this);
        this.f17072f.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo11760a(C8012v vVar) {
        if (isViewValid() && vVar != null && vVar.baseMessage != null && !this.f17075i) {
            Spannable spannable = C5115z.f13664a;
            if (vVar.supportDisplayText()) {
                spannable = C5115z.m11756a(vVar.baseMessage.f24139j, vVar.f21932j);
            } else if (!TextUtils.isEmpty(vVar.f21932j)) {
                spannable = new SpannableString(vVar.f21932j);
            }
            if (spannable != C5115z.f13664a) {
                this.f17080n = spannable;
                m13561a();
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
                    if (isViewValid() && this.f17074h != null) {
                        this.f17074h.dismiss();
                    }
                    return;
                case 1:
                    if (isViewValid() && this.f17074h != null) {
                        this.f17074h.dismiss();
                        break;
                    }
            }
        }
    }

    public void onClick(View view) {
        if (isViewValid()) {
            int id = view.getId();
            if (id == R.id.apv) {
                this.f17076j.mo11758b();
                if (this.f17074h != null) {
                    this.f17074h.dismiss();
                } else {
                    this.f17074h = C8127b.m16198a(this.f17077k, this.f17078l, this.f17079m, this.dataCenter, 0);
                }
                this.f17074h.f22201h = 0;
                this.f17074h.show(((FragmentActivity) this.context).getSupportFragmentManager(), C8127b.f22192a);
                return;
            }
            if (id == R.id.bmz) {
                C4495a.m10823a().mo10301a((Object) new C5156ab("button"));
                C6749b.m14142a(C3889d.m9831a(getContext()), Boolean.valueOf(true));
                C4525b.f12416bn.mo10346a("result");
            }
        }
    }

    /* renamed from: a */
    public final void mo11761a(C8214a aVar) {
        if (isViewValid() && aVar != null) {
            if (aVar.f22423k) {
                C9432q.m18691b(this.f17071e, 4);
                return;
            }
            if (aVar.f22414b != null && !C9431p.m18664a(aVar.f22414b.f22447f)) {
                this.f17080n = aVar.f22414b.f22447f;
                m13561a();
            }
        }
    }

    public void onLoad(Object... objArr) {
        List<String> list;
        int[] iArr;
        this.f17077k = (Room) this.dataCenter.get("data_room");
        this.f17078l = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17079m = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f17076j = new C5876j();
        this.f17076j.f15384a = this.f17077k.getOwner().getId();
        this.f17076j.f15385b = this.f17077k.getId();
        this.f17076j.mo8520a((C5877a) this);
        this.dataCenter.observe("cmd_send_gift", this);
        this.dataCenter.observe("cmd_dismiss_dialog_end", this);
        C4495a.m10823a().mo10300a(C5180az.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<C5180az>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                HourRankForDyWidget.this.onEvent((C5180az) obj);
            }
        });
        if (isViewValid() && this.f17073g != null) {
            boolean z = true;
            if (!TextUtils.equals((String) C4525b.f12416bn.mo10345a(), "result")) {
                C4525b.f12416bn.mo10346a("result");
                if (this.f17070d == null || !this.f17070d.isShowing()) {
                    if (this.f17069c == null || this.f17070d == null) {
                        this.f17069c = LayoutInflater.from(getContext()).inflate(R.layout.apt, this.containerView, false);
                        this.f17069c.setVisibility(4);
                        this.f17081o = (HSImageView) this.f17069c.findViewById(R.id.asc);
                        this.f17082p = (HSImageView) this.f17069c.findViewById(R.id.asd);
                        this.f17083q = (HSImageView) this.f17069c.findViewById(R.id.asz);
                        if (LiveSettingKeys.LIVE_RANK_INFO_LIST.mo9431a() == null || ((C8826o) LiveSettingKeys.LIVE_RANK_INFO_LIST.mo9431a()).f24103a == null) {
                            list = Arrays.asList(new String[]{"http://p1-webcast-dycdn.byteimg.com/img/webcast/6690142627768568584~tplv-resize:400:400.jpeg", "https://p3-dy.byteimg.com/aweme/1080x1080/24023000230ca9e85dd48.jpeg", "https://p9-dy.byteimg.com/aweme/720x720/1cb25000672c8dded103b.jpeg", "https://p9-dy.byteimg.com/aweme/720x720/2ce9d0006872c3f3d5886.jpeg", "https://p3-dy.byteimg.com/aweme/720x720/2409f0005bf8faaa4e78b.jpeg"});
                        } else {
                            list = ((C8826o) LiveSettingKeys.LIVE_RANK_INFO_LIST.mo9431a()).f24103a;
                        }
                        if (list != null && list.size() > 2) {
                            int size = list.size() - 1;
                            int i = size + 0 + 1;
                            if (size < 0 || 3 > i || size <= 2) {
                                iArr = null;
                            } else {
                                int[] iArr2 = new int[i];
                                for (int i2 = 0; i2 < i + 0; i2++) {
                                    iArr2[i2 + 0] = i2;
                                }
                                iArr = new int[3];
                                Random random = new Random();
                                int i3 = i;
                                int i4 = 0;
                                while (i4 < 3) {
                                    int i5 = i3 - 1;
                                    int abs = Math.abs(random.nextInt() % i3);
                                    iArr[i4] = iArr2[abs];
                                    iArr2[abs] = iArr2[i5];
                                    i4++;
                                    i3 = i5;
                                }
                            }
                            if (iArr != null) {
                                C5213c.m11822a(this.f17081o, (String) list.get(iArr[0]));
                                C5213c.m11822a(this.f17082p, (String) list.get(iArr[1]));
                                C5213c.m11822a(this.f17083q, (String) list.get(iArr[2]));
                            }
                        }
                        this.f17069c.setVisibility(0);
                        this.f17070d = new PopupWindow(this.f17069c, -2, -2, false);
                        this.f17070d.setBackgroundDrawable(null);
                        this.f17070d.setFocusable(true);
                        this.f17070d.setOutsideTouchable(true);
                        this.f17069c.setOnClickListener(new C6460av(this));
                    }
                    if (!(this.f17069c == null || this.f17069c == null || this.f17070d == null)) {
                        int b = (int) C9432q.m18687b(getContext(), -138.0f);
                        int b2 = (int) C9432q.m18687b(getContext(), -40.0f);
                        this.f17067a = new AnimatorSet();
                        this.f17069c.clearAnimation();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17069c, "scaleX", new float[]{0.8f, 1.0f, 1.0f});
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f17069c, "scaleY", new float[]{0.8f, 1.0f, 1.0f});
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f17069c, "alpha", new float[]{0.0f, 1.0f, 1.0f});
                        this.f17069c.setPivotX((float) (C3922z.m9910c() - C3922z.m9899a(66.0f)));
                        this.f17069c.setPivotY((float) (this.f17069c.getHeight() / 2));
                        this.f17067a.setDuration(300);
                        this.f17067a.play(ofFloat).with(ofFloat2).with(ofFloat3);
                        this.f17067a.start();
                        this.f17067a.addListener(new AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                HourRankForDyWidget.this.f17068b.mo6181a(C2201v.m6592a(3000, TimeUnit.MILLISECONDS).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6545f((C1710e<? super T>) new C1710e<Long>() {
                                    public final /* synthetic */ void accept(Object obj) throws Exception {
                                        Long l = (Long) obj;
                                        HourRankForDyWidget hourRankForDyWidget = HourRankForDyWidget.this;
                                        if (hourRankForDyWidget.f17067a != null) {
                                            hourRankForDyWidget.f17067a.cancel();
                                        }
                                        hourRankForDyWidget.f17069c.clearAnimation();
                                        C6461aw.m13901a(hourRankForDyWidget.f17070d);
                                    }
                                }));
                                HourRankForDyWidget.this.f17069c.setLayerType(0, null);
                            }
                        });
                        this.f17070d.showAsDropDown(this.f17072f, b, b2);
                        this.f17069c.setLayerType(2, null);
                    }
                }
            }
            if (((Integer) LiveSettingKeys.LIVE_DAILY_RANK.mo9431a()).intValue() == 0) {
                z = false;
            }
            if (z) {
                this.f17076j.mo11758b();
            }
        }
    }
}
