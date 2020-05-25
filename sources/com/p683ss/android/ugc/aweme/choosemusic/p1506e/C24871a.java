package com.p683ss.android.ugc.aweme.choosemusic.p1506e;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.e.a */
public final class C24871a extends PopupWindow {

    /* renamed from: a */
    public final Runnable f65816a = new C24872a(this);

    /* renamed from: b */
    public final RemoteImageView f65817b;

    /* renamed from: c */
    public final View f65818c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.e.a$a */
    static final class C24872a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24871a f65819a;

        C24872a(C24871a aVar) {
            this.f65819a = aVar;
        }

        public final void run() {
            this.f65819a.dismiss();
        }
    }

    public final void dismiss() {
        if (isShowing()) {
            C24873b.m60431a(this);
        }
    }

    public C24871a(Context context) {
        C52711k.m112240b(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.acq, null);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…added_to_favorited, null)");
        this.f65818c = inflate;
        setContentView(this.f65818c);
        View findViewById = this.f65818c.findViewById(R.id.b2m);
        C52711k.m112236a((Object) findViewById, "root.findViewById(R.id.iv_music_cover)");
        this.f65817b = (RemoteImageView) findViewById;
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.h1);
        setBackgroundDrawable(new ColorDrawable(0));
        this.f65818c.measure(0, 0);
    }
}
