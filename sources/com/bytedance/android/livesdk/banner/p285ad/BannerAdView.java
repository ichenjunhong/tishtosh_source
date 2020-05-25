package com.bytedance.android.livesdk.banner.p285ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p307c.C5036b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4570aj;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.banner.ad.BannerAdView */
public class BannerAdView extends RelativeLayout implements OnClickListener {

    /* renamed from: a */
    View f12711a;

    /* renamed from: b */
    HSImageView f12712b;

    /* renamed from: c */
    boolean f12713c;

    /* renamed from: d */
    C8692a f12714d;

    /* renamed from: e */
    boolean f12715e;

    public BannerAdView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo10441a(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        String str4 = "banner_name";
        if (this.f12714d != null) {
            str2 = this.f12714d.f23795b;
        } else {
            str2 = "";
        }
        hashMap.put(str4, str2);
        String str5 = "banner_id";
        if (this.f12714d != null) {
            str3 = String.valueOf(this.f12714d.f23794a);
        } else {
            str3 = "";
        }
        hashMap.put(str5, str3);
        C8049c.m15979a().mo14202a(str, hashMap, new C8059j().mo14213a("live_detail"), Room.class);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.agr) {
            if (getParent() instanceof View) {
                C9432q.m18691b((View) getParent(), 8);
            }
            this.f12713c = true;
            C4495a.m10823a().mo10301a((Object) new C4656a(false));
            mo10441a("livesdk_game_ad_banner_close");
        } else if (C4570aj.m10971a()) {
            if (!C4658c.m11145a(getContext())) {
                C4575an.m10981a((int) R.string.eno);
                return;
            }
            Object tag = view.getTag();
            if (tag instanceof C8692a) {
                C5036b.m11520a(getContext(), (C8692a) tag);
                mo10441a("livesdk_game_ad_banner_click");
            }
        }
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.agm, this, true);
        setOnClickListener(this);
        this.f12711a = findViewById(R.id.agr);
        this.f12711a.setOnClickListener(this);
        this.f12712b = (HSImageView) findViewById(R.id.ayc);
    }
}
