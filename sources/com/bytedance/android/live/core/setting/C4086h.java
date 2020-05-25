package com.bytedance.android.live.core.setting;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3862aa.C3863a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.core.setting.h */
public final class C4086h extends C3846a {

    /* renamed from: a */
    public String[] f11240a = {"直播AB", "直播配置", "feed配置"};

    /* renamed from: b */
    public String[][] f11241b = {new String[]{"com.bytedance.android.livesdk.config.LiveSettingKeys"}, new String[]{"com.bytedance.android.livesdk.config.LiveConfigSettingKeys", "com.bytedance.android.live.core.setting.CoreSettingKeys", "com.bytedance.android.live.network.NetworkSettingKeys"}, new String[]{"com.bytedance.android.livesdk.feed.setting.LiveFeedSettings"}};

    /* renamed from: c */
    private TabLayout f11242c;

    /* renamed from: d */
    private ViewPager f11243d;

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            ((Activity) context).setRequestedOrientation(1);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11242c = (TabLayout) view.findViewById(R.id.cwz);
        this.f11243d = (ViewPager) view.findViewById(R.id.ds2);
        this.f11243d.setAdapter(new C0677p(getChildFragmentManager()) {
            public final int getCount() {
                return C4086h.this.f11240a.length;
            }

            public final CharSequence getPageTitle(int i) {
                return C4086h.this.f11240a[i];
            }

            /* renamed from: a */
            public final Fragment mo2309a(int i) {
                String[] strArr = C4086h.this.f11241b[i];
                C4090k kVar = new C4090k();
                kVar.f11250b = strArr;
                return kVar;
            }
        });
        this.f11243d.addOnPageChangeListener(new C3863a(this.f11243d));
        this.f11242c.setupWithViewPager(this.f11243d);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ajy, viewGroup, false);
    }
}
