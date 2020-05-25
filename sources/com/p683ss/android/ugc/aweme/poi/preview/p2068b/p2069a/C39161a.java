package com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2069a;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39160a;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39168b;
import com.p683ss.android.ugc.aweme.poi.preview.view.indicator.NumberIndicator;
import com.p683ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.StatedButton;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.b.a.a */
public final class C39161a implements C39168b {

    /* renamed from: a */
    public NumberIndicator f99896a;

    /* renamed from: b */
    public C39160a f99897b;

    /* renamed from: c */
    StatedButton f99898c;

    /* renamed from: d */
    private View f99899d;

    /* renamed from: e */
    private TitleIndicator f99900e;

    /* renamed from: a */
    public final void mo79805a() {
        if (this.f99899d != null) {
            this.f99899d.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo79808b() {
        if (this.f99899d != null) {
            ViewGroup viewGroup = (ViewGroup) this.f99899d.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f99899d);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo79804a(C0013i iVar) throws Exception {
        C10691a.m21533a(this.f99897b.getActivityContext(), (int) R.string.d_h).mo19066a();
        this.f99898c.mo82723c();
        return null;
    }

    /* renamed from: a */
    public final void mo79806a(ViewPager viewPager) {
        this.f99899d.setVisibility(0);
        int i = this.f99897b.getTransferConfig().f99934F;
        this.f99896a.setRealSize(i);
        this.f99896a.setViewPager(viewPager);
        if (i <= 1) {
            this.f99896a.setVisibility(8);
        } else {
            this.f99896a.setVisibility(0);
        }
        if (this.f99898c != null && (this.f99897b.getActivityContext() instanceof Activity)) {
            if (this.f99897b == null || !this.f99897b.getTransferConfig().f99930B) {
                this.f99898c.setVisibility(8);
            } else {
                LayoutParams layoutParams = (LayoutParams) this.f99896a.getLayoutParams();
                layoutParams.addRule(9);
                this.f99896a.setLayoutParams(layoutParams);
                this.f99898c.setVisibility(0);
                this.f99898c.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        int currentItem = C39161a.this.f99896a.getCurrentItem();
                        List<String> list = C39161a.this.f99897b.getTransferConfig().f99946l;
                        if (currentItem >= 0 && currentItem < list.size()) {
                            String str = (String) list.get(currentItem);
                            if (!TextUtils.isEmpty(str)) {
                                C39161a aVar = C39161a.this;
                                C23361b.m57419a((Activity) aVar.f99897b.getActivityContext(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C39163b(aVar, str));
                                return;
                            }
                            C10691a.m21542b(C39161a.this.f99897b.getActivityContext(), (int) R.string.d_5).mo19066a();
                        }
                    }
                });
            }
        }
        if (this.f99900e != null) {
            TitleIndicator titleIndicator = this.f99900e;
            C39160a aVar = this.f99897b;
            Context context = titleIndicator.getContext();
            C52711k.m112236a((Object) context, "context");
            titleIndicator.setTextColor(context.getResources().getColor(R.color.pg));
            titleIndicator.setTextSize(17.0f);
            titleIndicator.f100136b = aVar;
            if (viewPager != null && viewPager.getAdapter() != null && titleIndicator.f100136b != null) {
                titleIndicator.setVisibility(0);
                viewPager.removeOnPageChangeListener(titleIndicator.f100137c);
                viewPager.addOnPageChangeListener(titleIndicator.f100137c);
                titleIndicator.f100137c.onPageSelected(viewPager.getCurrentItem());
            }
        }
    }

    /* renamed from: a */
    public final void mo79807a(FrameLayout frameLayout, C39160a aVar) {
        this.f99897b = aVar;
        this.f99899d = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.b4f, null);
        this.f99896a = (NumberIndicator) this.f99899d.findViewById(R.id.c4_);
        this.f99900e = (TitleIndicator) this.f99899d.findViewById(R.id.c4c);
        this.f99898c = (StatedButton) this.f99899d.findViewById(R.id.b05);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(this.f99899d, layoutParams);
    }
}
