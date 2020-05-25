package com.p683ss.android.ugc.aweme.filter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.filter.C31470k.C31471a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.l */
public final class C31472l implements C31469j {

    /* renamed from: a */
    public static final C31473a f82358a = new C31473a(null);

    /* renamed from: b */
    private final AppCompatActivity f82359b;

    /* renamed from: c */
    private final C31499l f82360c;

    /* renamed from: com.ss.android.ugc.aweme.filter.l$a */
    public static final class C31473a {
        private C31473a() {
        }

        public /* synthetic */ C31473a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo64368a() {
        AppCompatActivity appCompatActivity = this.f82359b;
        C52711k.m112240b(appCompatActivity, "activity");
        String string = appCompatActivity.getResources().getString(R.string.nv);
        C52711k.m112236a((Object) string, "activity.resources.getSt…g(R.string.av_filter_box)");
        return string;
    }

    /* renamed from: b */
    public final boolean mo64369b() {
        AppCompatActivity appCompatActivity = this.f82359b;
        C31499l lVar = this.f82360c;
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "filterRepository");
        if (C39629l.m88232a().mo58593x().mo74282b()) {
            return false;
        }
        C39629l.m88232a().mo58593x().mo74276a((Activity) appCompatActivity, "", "", (Bundle) null, (C39528a) new C31471a(lVar));
        return true;
    }

    /* renamed from: c */
    public final C31459g mo64370c() {
        List list = (List) C39629l.m88232a().mo58584o().mo64334d().mo64415e().mo64418a().getValue();
        if (list != null && !list.isEmpty()) {
            return (C31459g) list.get(0);
        }
        C31459g c = C31483a.m73320c();
        c.f82325b = this.f82359b.getResources().getStringArray(R.array.a8)[0];
        return c;
    }

    /* renamed from: a */
    public final View mo64367a(AppCompatActivity appCompatActivity) {
        C52711k.m112240b(appCompatActivity, "activity");
        Context context = appCompatActivity;
        FrameLayout frameLayout = new FrameLayout(context);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = new AVDmtHorizontalImageTextLayout(context, null, 0, 6, null);
        aVDmtHorizontalImageTextLayout.setText(mo64368a());
        aVDmtHorizontalImageTextLayout.setTextSize(15);
        aVDmtHorizontalImageTextLayout.setGravity(17);
        C52711k.m112240b(aVDmtHorizontalImageTextLayout, "view");
        aVDmtHorizontalImageTextLayout.mo93958a();
        aVDmtHorizontalImageTextLayout.setChangeColor(false);
        aVDmtHorizontalImageTextLayout.setImageRes(R.drawable.am8);
        aVDmtHorizontalImageTextLayout.setPadding(0, 0, (int) C20141b.m49696a(aVDmtHorizontalImageTextLayout.getContext(), 12.0f), 0);
        frameLayout.addView(aVDmtHorizontalImageTextLayout, new LayoutParams(-2, -2, 17));
        return frameLayout;
    }

    public C31472l(AppCompatActivity appCompatActivity, C31499l lVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "filterRepository");
        this.f82359b = appCompatActivity;
        this.f82360c = lVar;
    }
}
