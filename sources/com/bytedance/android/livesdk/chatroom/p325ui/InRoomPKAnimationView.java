package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7211h;
import com.bytedance.android.livesdk.gift.assets.C7214j;
import com.bytedance.android.livesdk.p279af.C4594h;
import com.bytedance.android.livesdk.p279af.C4594h.C4596b;
import com.bytedance.android.livesdk.p300c.C4961a;
import com.bytedance.android.livesdk.p399o.C8028a;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.InRoomPKAnimationView */
public class InRoomPKAnimationView extends FrameLayout {

    /* renamed from: a */
    View f15502a;

    /* renamed from: b */
    View f15503b;

    /* renamed from: c */
    C1690c f15504c;

    /* renamed from: d */
    HSImageView f15505d;

    /* renamed from: e */
    int f15506e;

    /* renamed from: f */
    private HSImageView f15507f;

    /* renamed from: g */
    private TextView f15508g;

    /* renamed from: h */
    private HSImageView f15509h;

    /* renamed from: i */
    private TextView f15510i;

    /* renamed from: a */
    public final void mo11821a() {
        long j;
        C59111 r0 = new C7214j() {
            /* renamed from: a */
            public final void mo8669a(Throwable th) {
            }

            /* renamed from: a */
            public final void mo8668a(long j, String str) {
                String str2;
                C4596b a = C4594h.m11029a(str);
                if (a != null) {
                    str2 = a.mo10396a(InRoomPKAnimationView.this.getContext());
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    Uri build = new Builder().scheme("file").path(str2).build();
                    InRoomPKAnimationView inRoomPKAnimationView = InRoomPKAnimationView.this;
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-inRoomPKAnimationView.f15506e, 0});
                    ofInt.setDuration(375);
                    ofInt.setInterpolator(new AccelerateInterpolator(2.0f));
                    ofInt.addUpdateListener(new C5935am(inRoomPKAnimationView));
                    ofInt.start();
                    C2201v.m6592a(300, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C5936an<Object>(inRoomPKAnimationView, build));
                    inRoomPKAnimationView.f15504c = C2201v.m6592a(1525, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5937ao<Object>(inRoomPKAnimationView), C5938ap.f15626a);
                }
            }
        };
        if (LiveSettingKeys.ASSET_ANIM_ID_MAP.mo9431a() == null) {
            j = 0;
        } else {
            j = ((C4961a) LiveSettingKeys.ASSET_ANIM_ID_MAP.mo9431a()).f13302b;
        }
        C7211h assetsManager = ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssetsManager();
        if (assetsManager != null) {
            AssetsModel c = assetsManager.mo13434c(j);
            if (c == null) {
                C8028a.m15932a("资源列表中找不到这个PK特效", String.valueOf(j));
            } else if (c.getResourceType() != 6) {
                C8028a.m15932a("获取到的特效资源不是PK特效", String.valueOf(j));
            } else {
                assetsManager.mo13428a(j, r0, 4);
            }
        }
    }

    /* renamed from: b */
    private void m12880b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.apv, this, true);
        this.f15502a = inflate.findViewById(R.id.amn);
        this.f15507f = (HSImageView) inflate.findViewById(R.id.ant);
        this.f15508g = (TextView) inflate.findViewById(R.id.dhg);
        this.f15503b = inflate.findViewById(R.id.amq);
        this.f15509h = (HSImageView) inflate.findViewById(R.id.anv);
        this.f15510i = (TextView) inflate.findViewById(R.id.dhi);
        this.f15505d = (HSImageView) inflate.findViewById(R.id.axx);
        this.f15506e = (int) (((float) (C9432q.m18670a(getContext()) / 2)) + C9432q.m18687b(getContext(), 30.0f));
        C9432q.m18679a(this.f15502a, this.f15506e, -3);
        C9432q.m18680a(this.f15502a, -this.f15506e, -3, -3, -3);
        C9432q.m18679a(this.f15503b, this.f15506e, -3);
        C9432q.m18680a(this.f15503b, -3, -3, -this.f15506e, -3);
    }

    public InRoomPKAnimationView(Context context) {
        super(context);
        m12880b();
    }

    public InRoomPKAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12880b();
    }

    /* renamed from: a */
    public final void mo11822a(String str, ImageModel imageModel) {
        if (this.f15508g != null) {
            this.f15508g.setText(str);
        }
        C5213c.m11817a(this.f15507f, imageModel, R.drawable.bt6, -340459, C9432q.m18687b(getContext(), 1.0f), null);
    }

    /* renamed from: b */
    public final void mo11823b(String str, ImageModel imageModel) {
        if (this.f15510i != null) {
            this.f15510i.setText(str);
        }
        C5213c.m11817a(this.f15509h, imageModel, R.drawable.bt6, -340459, C9432q.m18687b(getContext(), 1.0f), null);
    }

    public InRoomPKAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12880b();
    }
}
