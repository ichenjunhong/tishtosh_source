package com.bytedance.android.livesdk.gift.effect.doodle.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.gift.C4129g;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.doodle.p360a.C7345b;
import com.bytedance.android.livesdk.gift.effect.doodle.p361b.C7348a;
import com.bytedance.android.livesdk.gift.effect.doodle.p362c.C7351b;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView.C7368a;
import com.bytedance.android.livesdk.message.C7776b;
import com.bytedance.android.livesdk.message.C7789c;
import com.bytedance.android.livesdk.message.C7791e;
import com.bytedance.android.livesdk.message.model.C8017z;
import com.bytedance.android.livesdk.widget.GiftUserInfoView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.view.a */
public final class C7369a extends FrameLayout implements OnClickListener, C7789c {

    /* renamed from: a */
    public Queue<C7351b> f20121a;

    /* renamed from: b */
    public DoodleGiftView f20122b;

    /* renamed from: c */
    public GiftUserInfoView f20123c;

    /* renamed from: d */
    int f20124d;

    /* renamed from: e */
    public boolean f20125e;

    /* renamed from: f */
    public boolean f20126f;

    /* renamed from: g */
    private C7345b f20127g;

    /* renamed from: h */
    private C4129g f20128h;

    /* renamed from: i */
    private long f20129i;

    /* renamed from: j */
    private int f20130j = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.mo9431a()).intValue();

    /* renamed from: k */
    private AnimatorSet f20131k;

    /* renamed from: l */
    private ObjectAnimator f20132l;

    private int getLayoutResource() {
        return R.layout.apd;
    }

    /* renamed from: b */
    private void m15212b() {
        if (this.f20121a.size() > this.f20130j) {
            this.f20121a.remove();
        }
    }

    /* renamed from: a */
    public final void mo13638a() {
        if (!this.f20121a.isEmpty() && !this.f20125e) {
            C7351b bVar = (C7351b) this.f20121a.poll();
            setUserInfo(bVar);
            this.f20122b.mo13632a(bVar).mo13634a();
            this.f20125e = true;
            StringBuilder sb = new StringBuilder("播放涂鸦礼物动画， giftMessageId=");
            sb.append(bVar.f20317i);
            C3831a.m9712b("DoodleAnimationView", sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f20121a.clear();
        this.f20125e = false;
        if (this.f20122b != null) {
            this.f20122b.f20096d = true;
            this.f20122b.setVisibility(4);
        }
        if (this.f20123c != null) {
            this.f20123c.setVisibility(4);
        }
        if (this.f20131k != null && this.f20131k.isRunning()) {
            this.f20131k.cancel();
        }
        if (this.f20132l != null && this.f20132l.isRunning()) {
            this.f20132l.cancel();
        }
        if (this.f20126f) {
            C7791e.m15852a().mo14135b(this);
        }
        super.onDetachedFromWindow();
    }

    public final void setUserEventListener(C4129g gVar) {
        this.f20128h = gVar;
    }

    public final void onClick(View view) {
        if (this.f20128h != null && this.f20125e) {
            this.f20128h.mo9499a(this.f20129i);
        }
    }

    private void setUserInfo(C7351b bVar) {
        ImageModel imageModel;
        if (bVar.f20320l != null) {
            this.f20129i = bVar.f20320l.getId();
            if (!(bVar.f20320l == null || bVar.f20320l.getAvatarThumb() == null)) {
                this.f20123c.setAvatarImage(bVar.f20320l.getAvatarThumb());
            }
            if (bVar.f20320l != null) {
                GiftUserInfoView giftUserInfoView = this.f20123c;
                if (bVar.f20320l.getBorder() != null) {
                    imageModel = bVar.f20320l.getBorder().f8838a;
                } else {
                    imageModel = null;
                }
                giftUserInfoView.setAvatarBorder(imageModel);
            }
            if (!(bVar.f20320l == null || bVar.f20320l.getUserHonor() == null || bVar.f20320l.getUserHonor().mo8157l() == null)) {
                this.f20123c.setHonorImage(bVar.f20320l.getUserHonor().mo8157l());
            }
            this.f20123c.setUserNameText(bVar.f20320l.getNickName());
            this.f20123c.setDescriptionText(bVar.f20319k);
            this.f20123c.setUserId(this.f20129i);
        }
    }

    /* renamed from: a */
    public final void mo13639a(C8017z zVar) {
        User user = zVar.f21944a;
        if (user != null && user.getId() == ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) {
            zVar.f21952i = true;
        }
        if (this.f20126f) {
            C7791e.m15852a().mo14132a((C7776b) zVar);
            return;
        }
        C7351b a = C7345b.m15191a(zVar);
        if (a != null) {
            this.f20121a.add(a);
            m15212b();
        }
        mo13638a();
    }

    public C7369a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutResource(), this, true);
        setLayoutParams(new LayoutParams(-1, -1));
        this.f20126f = ((Boolean) LiveSettingKeys.LIVE_SDK_NEW_EFFECT_PLAYER.mo9431a()).booleanValue();
        this.f20124d = (int) getResources().getDimension(R.dimen.sy);
        this.f20123c = (GiftUserInfoView) findViewById(R.id.alz);
        this.f20123c.setOnClickListener(this);
        this.f20122b = (DoodleGiftView) findViewById(R.id.a6y);
        this.f20122b.mo13633a(C7368a.play).f20095c = new C7348a() {
            /* renamed from: a */
            public final void mo13619a() {
                C7369a.this.f20122b.setVisibility(4);
                C7369a.this.f20123c.setVisibility(4);
                C7369a.this.f20125e = false;
                if (C7369a.this.f20126f) {
                    C7791e.m15852a().mo14134b();
                } else {
                    C7369a.this.mo13638a();
                }
            }

            /* renamed from: a */
            public final void mo13620a(long j) {
                C7369a.this.f20123c.mo14714c();
            }

            /* renamed from: a */
            public final void mo13621a(long j, float f) {
                C7369a.this.f20122b.setVisibility(0);
                C7369a aVar = C7369a.this;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.f20123c.getLayoutParams();
                layoutParams.topMargin = (((int) f) - ((int) aVar.getResources().getDimension(R.dimen.p1))) - ((int) aVar.getResources().getDimension(R.dimen.of));
                if (layoutParams.topMargin <= aVar.f20124d) {
                    layoutParams.topMargin = aVar.f20124d;
                }
                aVar.f20123c.setLayoutParams(layoutParams);
                C7369a aVar2 = C7369a.this;
                aVar2.f20123c.mo14713b();
                aVar2.f20123c.post(new Runnable(300) {

                    /* renamed from: a */
                    final /* synthetic */ long f20134a;

                    public final void run() {
                        C7369a.this.f20123c.mo14712a(this.f20134a);
                    }

                    {
                        this.f20134a = r2;
                    }
                });
            }
        };
        this.f20127g = new C7345b();
        this.f20121a = new ArrayDeque();
        if (this.f20126f) {
            C7791e.m15852a().mo14133a((C7789c) this);
        }
    }

    /* renamed from: a */
    public final boolean mo12552a(C7776b bVar) {
        if (bVar instanceof C8017z) {
            C7351b a = C7345b.m15191a(bVar);
            if (a != null) {
                setUserInfo(a);
                this.f20122b.mo13632a(a).mo13634a();
                this.f20125e = true;
                StringBuilder sb = new StringBuilder("播放涂鸦礼物动画， giftMessageId=");
                sb.append(a.f20317i);
                C3831a.m9712b("DoodleAnimationView", sb.toString());
                return true;
            }
        }
        return false;
    }
}
