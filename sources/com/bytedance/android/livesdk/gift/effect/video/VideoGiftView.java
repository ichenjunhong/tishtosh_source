package com.bytedance.android.livesdk.gift.effect.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.C4129g;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.p359b.C7328a;
import com.bytedance.android.livesdk.message.model.C7872cm;
import com.bytedance.android.livesdk.message.model.C7872cm.C7873a;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.widget.GiftUserInfoView;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8639a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

public class VideoGiftView extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    public GiftUserInfoView f20385a;

    /* renamed from: b */
    public FrameLayout f20386b;

    /* renamed from: c */
    public View f20387c;

    /* renamed from: d */
    public TextView f20388d;

    /* renamed from: e */
    public ImageView f20389e;

    /* renamed from: f */
    public C7328a f20390f;

    /* renamed from: g */
    public C7873a f20391g;

    /* renamed from: h */
    public C8639a f20392h;

    /* renamed from: i */
    private C4129g f20393i;

    /* renamed from: j */
    private float f20394j;

    /* renamed from: k */
    private float f20395k;

    /* renamed from: l */
    private boolean f20396l;

    /* renamed from: m */
    private Map<String, Object> f20397m = new HashMap();

    private int getResourceLayout() {
        return R.layout.as0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f20392h != null) {
            this.f20392h.mo13784b();
            this.f20392h.mo13787d();
            this.f20392h.mo13788e();
            this.f20392h.mo13785b(this.f20386b);
        }
    }

    public void setPortrait(boolean z) {
        this.f20396l = z;
    }

    public void setUserEventListener(C4129g gVar) {
        this.f20393i = gVar;
    }

    public VideoGiftView(Context context) {
        super(context);
        m15345a(context);
    }

    private void setTextEffect(C7872cm cmVar) {
        C7873a aVar;
        if (cmVar != null) {
            if (this.f20396l) {
                aVar = cmVar.f21799a;
            } else {
                aVar = cmVar.f21800b;
            }
            this.f20391g = aVar;
        }
    }

    public void onClick(View view) {
        if (this.f20393i != null) {
            this.f20393i.mo9499a(this.f20385a.getUserId());
        }
    }

    /* renamed from: a */
    public final void mo13756a(boolean z) {
        if (z) {
            LayoutParams layoutParams = (LayoutParams) this.f20385a.getLayoutParams();
            layoutParams.topMargin = (int) this.f20395k;
            this.f20385a.setLayoutParams(layoutParams);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) this.f20385a.getLayoutParams();
        layoutParams2.topMargin = (int) this.f20394j;
        this.f20385a.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    private void m15345a(Context context) {
        this.f20394j = getResources().getDimension(R.dimen.sy);
        this.f20395k = getResources().getDimension(R.dimen.sx);
        LayoutInflater.from(context).inflate(getResourceLayout(), this, true);
        this.f20385a = (GiftUserInfoView) findViewById(R.id.dny);
        this.f20386b = (FrameLayout) findViewById(R.id.dqi);
        this.f20387c = findViewById(R.id.cyk);
        this.f20389e = (ImageView) findViewById(R.id.cyl);
        this.f20388d = (TextView) findViewById(R.id.cym);
        this.f20385a.setOnClickListener(this);
        this.f20397m.put("desc", "播放大礼物动画");
    }

    /* renamed from: a */
    private void m15346a(C7328a aVar) {
        String str;
        this.f20397m.put("effect_id", Long.valueOf(aVar.f19957b));
        this.f20397m.put("gift_id", Long.valueOf(aVar.f19965j));
        this.f20397m.put("msg_id", Long.valueOf(aVar.f19956a));
        Map<String, Object> map = this.f20397m;
        String str2 = "from_user_id";
        if (aVar.f19962g != null) {
            str = String.valueOf(aVar.f19962g.getId());
        } else {
            str = "";
        }
        map.put(str2, str);
        C8064d.m16005b().mo9197a("ttlive_gift", this.f20397m);
    }

    private void setUserInfo(C7328a aVar) {
        ImageModel imageModel;
        if (aVar != null && aVar.f19962g != null) {
            User user = aVar.f19962g;
            this.f20385a.setUserId(user.getId());
            if (user.getAvatarThumb() != null) {
                this.f20385a.setAvatarImage(user.getAvatarThumb());
            }
            GiftUserInfoView giftUserInfoView = this.f20385a;
            String str = null;
            if (user.getBorder() != null) {
                imageModel = user.getBorder().f8838a;
            } else {
                imageModel = null;
            }
            giftUserInfoView.setAvatarBorder(imageModel);
            if (!(user.getUserHonor() == null || user.getUserHonor().mo8157l() == null)) {
                this.f20385a.setHonorImage(user.getUserHonor().mo8157l());
            }
            GiftUserInfoView giftUserInfoView2 = this.f20385a;
            if (user != null) {
                if (((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
                    str = user.displayId;
                } else if (((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion()) {
                    str = user.displayId;
                } else {
                    str = user.getNickName();
                }
            }
            giftUserInfoView2.setUserNameText(str);
            if (aVar.f19969n != null) {
                this.f20385a.setSpannable(aVar.f19969n);
            } else {
                this.f20385a.setDescriptionText(aVar.f19963h);
            }
        }
    }

    public VideoGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15345a(context);
    }

    /* renamed from: a */
    public final void mo13755a(C7328a aVar, User user) {
        if (this.f20392h != null && aVar != null) {
            this.f20390f = aVar;
            setUserInfo(aVar);
            setTextEffect(aVar.f19964i);
            m15346a(aVar);
            this.f20392h.mo13783a(aVar.f19959d, aVar.f19956a);
        }
    }

    public VideoGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15345a(context);
    }
}
