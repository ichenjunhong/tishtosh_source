package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26315f;
import com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.h */
public final class C30082h implements C30011ab {
    /* renamed from: a */
    public final C30071bj mo60283a() {
        return new C30118t(new C52671b<C30069bh, VideoViewHolder>() {
            public final /* synthetic */ Object invoke(Object obj) {
                return C30082h.this.mo60280a((C30069bh) obj);
            }
        });
    }

    /* renamed from: a */
    public final View mo60278a(Context context) {
        return new SymphonyVideoView(context);
    }

    /* renamed from: a */
    public final VideoViewHolder mo60280a(C30069bh bhVar) {
        if (TextUtils.equals("homepage_follow", bhVar.f78502j)) {
            return new C30109r(bhVar);
        }
        return new C30010aa(bhVar);
    }

    /* renamed from: a */
    public final View mo60279a(LayoutInflater layoutInflater, String str, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.u2, viewGroup, false);
    }

    /* renamed from: a */
    public final C30016ag mo60282a(View view, C30313ae<C30332aw> aeVar, String str, long j) {
        return new C30088l(view, aeVar, str);
    }

    /* renamed from: a */
    public final C30016ag mo60281a(Context context, int i, View view, C30313ae<C30332aw> aeVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C26315f fVar = new C26315f(context, i, view, aeVar, str, onTouchListener, fragment, i2);
        return fVar;
    }
}
