package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.bytedance.android.livesdk.chatroom.event.C5203v;
import com.bytedance.android.livesdk.chatroom.interact.C5284aq;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p325ui.C6160es;
import com.bytedance.android.livesdk.chatroom.p325ui.C6160es.C6161a;
import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter;
import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter.C5773a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6435e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4606p;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

public class RadioWidget extends LiveRecyclableWidget implements OnClickListener, C5284aq, C5773a, C6161a {

    /* renamed from: n */
    private static final String f17525n = "RadioWidget";

    /* renamed from: a */
    Room f17526a;

    /* renamed from: b */
    boolean f17527b;

    /* renamed from: c */
    public RadioViewPresenter f17528c;

    /* renamed from: d */
    public C4606p f17529d;

    /* renamed from: e */
    ImageView f17530e;

    /* renamed from: f */
    LottieAnimationView f17531f;

    /* renamed from: g */
    View f17532g;

    /* renamed from: h */
    ImageView f17533h;

    /* renamed from: i */
    ImageView f17534i;

    /* renamed from: j */
    TextView f17535j;

    /* renamed from: k */
    HSImageView f17536k;

    /* renamed from: l */
    LayoutParams f17537l;

    /* renamed from: m */
    LayoutParams f17538m;

    /* renamed from: o */
    private boolean f17539o;

    /* renamed from: p */
    private boolean f17540p;

    /* renamed from: q */
    private C0199s<KVData> f17541q = new C6560ek(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget$a */
    class C6400a implements C6601a {

        /* renamed from: b */
        private View f17544b;

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C6400a() {
        }

        public final void onClick(View view) {
            RadioWidget.this.f17528c.mo11655d();
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
            if (this.f17544b != null && (aVar instanceof C6435e)) {
                this.f17544b.setVisibility(((C6435e) aVar).f17717a);
            }
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f17544b = view;
        }
    }

    /* renamed from: a */
    public final Room mo11657a() {
        return this.f17526a;
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
        return R.layout.aqf;
    }

    /* renamed from: h */
    public final void mo12187h() {
        mo11659c();
    }

    /* renamed from: d */
    public final void mo11660d() {
        C6160es esVar = new C6160es(this.context);
        esVar.f16533a = this;
        esVar.show();
    }

    /* renamed from: g */
    public final void mo11663g() {
        if (this.f17539o) {
            C4575an.m10981a((int) R.string.epw);
        }
    }

    public void onUnload() {
        this.f17528c.mo8247a();
        this.f17531f.mo6661f();
        this.dataCenter.removeObserver("cmd_interact_audio", this.f17541q);
    }

    /* renamed from: c */
    public final void mo11659c() {
        C4606p pVar = new C4606p((Activity) this.context, null, "radio_cover", 12, 7, 12, 7, new C4183a() {
            /* renamed from: b_ */
            public final void mo8916b_() {
                RadioWidget.this.f17529d.mo9579b();
            }

            /* renamed from: a */
            public final void mo8915a(String str, String str2) {
                RadioWidget.this.f17529d.mo9577a();
                RadioWidget.this.f17528c.mo11653a(str);
                C8049c.m15979a().mo14203a("background_pic_confirm", new C8059j().mo14213a("live_take_detail").mo14214b("live_take"), Room.class);
            }
        });
        this.f17529d = pVar;
        this.f17529d.mo9580c();
    }

    /* renamed from: e */
    public final void mo11661e() {
        this.f17529d.mo9579b();
        C4575an.m10981a((int) R.string.epy);
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", "1");
        C8049c.m15979a().mo14202a("background_pic_upload", hashMap, new C8059j().mo14213a("live_take_detail").mo14214b("live_take"), Room.class);
    }

    /* renamed from: f */
    public final void mo11662f() {
        this.f17529d.mo9579b();
        C4575an.m10981a((int) R.string.epx);
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", "0");
        C8049c.m15979a().mo14202a("background_pic_upload", hashMap, new C8059j().mo14213a("live_take_detail").mo14214b("live_take"), Room.class);
    }

    /* renamed from: i */
    public final void mo12188i() {
        new C8552a(this.context).mo14996a(true).mo15008c((int) R.string.epv).mo15003b(0, (int) R.string.epu, (DialogInterface.OnClickListener) new C6562em(this)).mo15003b(1, (int) R.string.epr, C6563en.f17896a).mo15011d();
    }

    /* renamed from: a */
    public final void mo11658a(String str) {
        this.f17526a.getOwner().setBackgroundImgUrl(str);
        if (TextUtils.isEmpty(str)) {
            this.f17536k.setVisibility(4);
            C5213c.m11824b(this.f17530e, this.f17526a.getOwner().getAvatarLarge());
            return;
        }
        if (!this.f17527b) {
            this.f17536k.setVisibility(0);
        } else {
            this.f17536k.setVisibility(4);
        }
        C5213c.m11822a(this.f17536k, str);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.c7t || id == R.id.c7u) {
            if (this.f17539o && !this.f17527b && !C8607a.f23572a) {
                this.f17528c.mo11655d();
            } else if (!this.f17539o && this.f17527b && this.dataCenter != null) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_send_gift", this.f17526a.getOwner());
            }
        }
    }

    public void onInit(Object... objArr) {
        this.f17528c = new RadioViewPresenter(this.context);
        this.f17530e = (ImageView) this.contentView.findViewById(R.id.c7t);
        this.f17532g = this.contentView.findViewById(R.id.i1);
        this.f17535j = (TextView) this.contentView.findViewById(R.id.ew);
        this.f17533h = (ImageView) this.contentView.findViewById(R.id.coh);
        this.f17534i = (ImageView) this.contentView.findViewById(R.id.coi);
        this.f17531f = (LottieAnimationView) this.contentView.findViewById(R.id.c7x);
        this.f17531f.setAnimation("audio_interact_effect.json");
        this.f17531f.mo6658c(true);
        this.f17536k = (HSImageView) this.contentView.findViewById(R.id.c7u);
    }

    public void onLoad(Object... objArr) {
        long j;
        this.f17531f.setVisibility(4);
        this.f17532g.setVisibility(0);
        this.f17530e.setVisibility(4);
        this.f17533h.setVisibility(8);
        this.f17534i.setVisibility(8);
        this.f17535j.setVisibility(8);
        this.f17536k.setVisibility(8);
        this.f17526a = (Room) this.dataCenter.get("data_room");
        this.f17539o = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        C5213c.m11824b(this.f17530e, this.f17526a.getOwner().getAvatarLarge());
        if (TextUtils.isEmpty(this.f17526a.getOwner().getBackgroundImgUrl())) {
            C5213c.m11824b(this.f17530e, this.f17526a.getOwner().getAvatarLarge());
        } else {
            C5213c.m11822a(this.f17536k, this.f17526a.getOwner().getBackgroundImgUrl());
            this.f17536k.setVisibility(0);
        }
        if (this.f17539o) {
            j = 3500;
        } else {
            j = 500;
        }
        C2201v.m6592a(j, TimeUnit.MILLISECONDS).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C6561el<Object>(this));
        this.dataCenter.observeForever("cmd_interact_audio", this.f17541q);
        this.dataCenter.lambda$put$1$DataCenter("cmd_live_radio", new C5203v(true));
        C6610k.m13985a().mo12668a(C6605h.RADIO_COVER, (C6601a) new C6400a());
        this.f17528c.mo8520a((C5773a) this);
    }

    /* renamed from: a */
    public final void mo11128a(long j, boolean z) {
        if (j == this.f17526a.getOwner().getId()) {
            if (!z || this.f17533h.getVisibility() != 8) {
                if (!z && this.f17533h.getVisibility() == 0) {
                    this.f17533h.setVisibility(8);
                    this.f17534i.setVisibility(8);
                }
                return;
            }
            this.f17533h.setVisibility(0);
            this.f17534i.setVisibility(0);
            this.f17531f.mo6661f();
            this.f17531f.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo11129a(String str, boolean z) {
        if (this.f17540p != z) {
            this.f17540p = z;
            if (!this.f17540p || this.f17534i.getVisibility() != 8) {
                this.f17531f.setVisibility(4);
                this.f17531f.mo6661f();
            } else {
                this.f17531f.setVisibility(0);
                this.f17531f.mo6654b();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f17529d != null) {
            this.f17529d.mo9578a(i, i2, intent);
        }
    }
}
