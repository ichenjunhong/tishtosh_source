package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3045b;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.m */
public final class C3344m extends Dialog implements C3045b {

    /* renamed from: a */
    public final C3277a f9610a;

    /* renamed from: b */
    final DataCenter f9611b;

    /* renamed from: c */
    LoadingStatusView f9612c;

    /* renamed from: d */
    RtlViewPager f9613d;

    /* renamed from: e */
    public LivePagerSlidingTabStrip f9614e;

    /* renamed from: f */
    public List<EffectCategoryResponse> f9615f;

    /* renamed from: g */
    OnDismissListener f9616g;

    /* renamed from: h */
    private C3360v f9617h;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.m$a */
    class C3346a implements C0997e {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C3346a() {
        }

        public final void onPageSelected(int i) {
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) C3344m.this.f9615f.get(i);
            C3344m.this.f9610a.mo8646a(effectCategoryResponse.getId(), effectCategoryResponse.getTagsUpdateTime(), (C48715t) new C3352r(this, effectCategoryResponse, i));
            HashMap hashMap = new HashMap();
            hashMap.put("tab", effectCategoryResponse.getName());
            C8049c.m15979a().mo14202a("pm_live_sticker_tab_change", hashMap, new C8059j().mo14214b("live_take").mo14218f("other").mo14213a("live_take_detail"), new C8060k(), Room.class);
        }
    }

    /* renamed from: a */
    public final void mo8286a() {
        this.f9612c.mo9845d();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f9610a.mo8280a(C3037b.f8914b, this);
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f9616g = onDismissListener;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8715a(View view) {
        this.f9611b.lambda$put$1$DataCenter("cmd_sticker_tip", "");
        if (this.f9617h != null) {
            this.f9617h.mo8730a(0, null);
        }
    }

    /* renamed from: a */
    public final void mo8287a(EffectChannelResponse effectChannelResponse) {
        C8688c cVar;
        if (effectChannelResponse == null || C9414h.m18630a(effectChannelResponse.getCategoryResponseList())) {
            this.f9612c.mo9844c();
            return;
        }
        this.f9612c.setVisibility(4);
        this.f9614e.setVisibility(0);
        this.f9613d.setVisibility(0);
        this.f9615f = effectChannelResponse.getCategoryResponseList();
        if (this.f9617h == null) {
            Iterator it = effectChannelResponse.getCategoryResponseList().iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) it.next();
                if (effectCategoryResponse == null) {
                    break;
                }
                Iterator it2 = effectCategoryResponse.getTotalEffects().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Effect effect = (Effect) it2.next();
                        Iterator it3 = C3395f.m9156f().mo8740a().mo8260a(C3037b.f8914b).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                cVar = (C8688c) it3.next();
                                if (cVar.mo15141a(C3287f.m9010a(effect))) {
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
            cVar = null;
            this.f9617h = new C3360v(getContext(), cVar, this.f9610a);
            this.f9613d.setAdapter(this.f9617h);
            this.f9617h.mo8731a(this.f9615f);
            this.f9617h.f9653a = new C3351q(this);
            this.f9614e.setOnPageChangeListener(new C3346a());
            this.f9614e.setViewPager(this.f9613d);
        } else {
            this.f9617h.mo8731a(this.f9615f);
        }
        this.f9613d.setCurrentItem(((Integer) C4525b.f12377at.mo10345a()).intValue());
        for (final int i = 0; i < this.f9615f.size(); i++) {
            mo8716a((EffectCategoryResponse) this.f9615f.get(i), new C48710o() {
                /* renamed from: a */
                public final void mo8641a() {
                    C3344m.this.f9614e.mo14729a(i);
                }

                /* renamed from: b */
                public final void mo8642b() {
                    C3344m.this.f9614e.mo14732b(i);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.aiy, null));
        getWindow().setLayout(-1, (int) C9432q.m18687b(getContext(), 232.0f));
        getWindow().setGravity(80);
        setCanceledOnTouchOutside(true);
        this.f9612c = (LoadingStatusView) findViewById(R.id.csv);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aqx, null, false);
        inflate.setOnClickListener(new C3348n(this));
        this.f9612c.setBuilder(C4239a.m10480a(getContext()).mo9847a(getContext().getResources().getDimensionPixelSize(R.dimen.o4)).mo9852c(inflate));
        this.f9614e = (LivePagerSlidingTabStrip) findViewById(R.id.cx5);
        this.f9613d = (RtlViewPager) findViewById(R.id.ct4);
        findViewById(R.id.n4).setOnClickListener(new C3349o(this));
        this.f9612c.setVisibility(0);
        this.f9614e.setVisibility(4);
        this.f9613d.setVisibility(4);
        setOnDismissListener(new C3350p(this));
    }

    /* renamed from: a */
    public final void mo8716a(EffectCategoryResponse effectCategoryResponse, C48710o oVar) {
        if (effectCategoryResponse == null || C9414h.m18630a(effectCategoryResponse.getTags()) || !effectCategoryResponse.getTags().contains("new")) {
            oVar.mo8642b();
        } else {
            this.f9610a.mo8645a(effectCategoryResponse.getId(), effectCategoryResponse.getTagsUpdateTime(), oVar);
        }
    }

    public C3344m(Context context, DataCenter dataCenter, C3277a aVar) {
        super(context, R.style.z7);
        this.f9610a = aVar;
        this.f9611b = dataCenter;
    }
}
