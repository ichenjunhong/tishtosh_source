package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0199s;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.widget.roundcorner.RoundCornerFrameLayout;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;

public class LiveDrawerEntranceWidget extends LiveRecyclableWidget implements C0199s<KVData> {

    /* renamed from: b */
    public static boolean f17256b = true;

    /* renamed from: c */
    static int f17257c = 30;

    /* renamed from: a */
    public View f17258a;

    /* renamed from: d */
    private ObjectAnimator f17259d;

    /* renamed from: e */
    private LottieAnimationView f17260e;

    /* renamed from: f */
    private float f17261f;

    /* renamed from: g */
    private float f17262g;

    /* renamed from: h */
    private C1690c f17263h;

    /* renamed from: i */
    private C1690c f17264i;

    /* renamed from: j */
    private boolean f17265j;

    /* renamed from: k */
    private RoundCornerFrameLayout f17266k;

    public int getLayoutId() {
        return R.layout.bvo;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12444a() {
        if (this.f17260e != null) {
            this.f17260e.mo6661f();
        }
        if (this.f17263h != null) {
            this.f17263h.dispose();
        }
        if (this.f17264i != null) {
            this.f17264i.dispose();
        }
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
        mo12444a();
        if (this.f17259d != null) {
            this.f17259d.cancel();
            this.f17259d = null;
        }
    }

    public void onLoad(Object[] objArr) {
        if (this.f17258a != null && this.f17260e != null) {
            this.dataCenter.observe("DATA_DRAWER_LAYOUT_IS_OPEN", this);
            this.contentView.setOnClickListener(new C6526dg(this));
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && kVData.getData() != null && "DATA_DRAWER_LAYOUT_IS_OPEN".equals(kVData.getKey()) && ((Boolean) kVData.getData()).booleanValue()) {
            f17256b = false;
            f17257c = 0;
            mo12444a();
        }
    }

    public void onInit(Object[] objArr) {
        this.f17261f = C4577ap.m10990a(getContext(), 100.0f) + C4577ap.m10990a(getContext(), 64.0f);
        this.f17262g = (this.f17261f * 1000.0f) / 280.0f;
        this.f17258a = this.contentView.findViewById(R.id.ew7);
        this.f17260e = (LottieAnimationView) this.contentView.findViewById(R.id.e7i);
        if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof Boolean)) {
            this.f17265j = false;
        } else {
            this.f17265j = objArr[0].booleanValue();
        }
        this.f17266k = (RoundCornerFrameLayout) this.contentView.findViewById(R.id.e7j);
        if (C4206c.m10426a(getContext())) {
            this.f17266k.setBackground(getContext().getResources().getDrawable(R.drawable.dz5));
        } else {
            this.f17266k.setBackground(getContext().getResources().getDrawable(R.drawable.dz4));
        }
    }
}
