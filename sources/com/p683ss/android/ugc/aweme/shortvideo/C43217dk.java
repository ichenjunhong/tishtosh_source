package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl.C39606a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45386aj.C45387a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dk */
public final class C43217dk {

    /* renamed from: a */
    public C39606a f109303a;

    /* renamed from: b */
    public final int mo87869b() {
        return this.f109303a.mo74260c();
    }

    /* renamed from: c */
    public final void mo87870c() {
        this.f109303a.mo74252a();
    }

    /* renamed from: a */
    public final String mo87866a() {
        return this.f109303a.mo74259b();
    }

    /* renamed from: a */
    public final void mo87867a(int i) {
        C45387a.m98945a(this.f109303a, i);
    }

    /* renamed from: a */
    public static C43217dk m94834a(Fragment fragment, View view, int i) {
        return new C43217dk(fragment, view, i);
    }

    private C43217dk(Fragment fragment, View view, int i) {
        LinearLayout linearLayout;
        if (C39618d.f101137A.mo74204a()) {
            linearLayout = (LinearLayout) view.findViewById(R.id.en1);
        } else {
            linearLayout = (LinearLayout) view.findViewById(R.id.cwj);
        }
        this.f109303a = C39630m.m88234a().mo58626x().mo74251a(fragment.getActivity(), i);
        this.f109303a.mo74257a(fragment);
        linearLayout.addView(this.f109303a.mo74261d());
    }

    /* renamed from: a */
    public final void mo87868a(int i, int i2, Intent intent) {
        this.f109303a.mo74254a(i, i2, intent);
        if (i == 2 && i2 == -1 && intent != null) {
            C45387a.m98945a(this.f109303a, intent.getIntExtra("extra.PERMISSION", 0));
        }
    }
}
