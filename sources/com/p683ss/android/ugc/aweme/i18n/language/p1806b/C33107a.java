package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.views.C48217o;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.a */
public final class C33107a extends C48217o {

    /* renamed from: a */
    RecyclerView f85937a = ((RecyclerView) findViewById(R.id.bbx));

    /* renamed from: b */
    boolean f85938b;

    /* renamed from: c */
    private Handler f85939c;

    /* renamed from: c */
    public final void mo63505c() {
        this.f121344h = (int) C9432q.m18687b(C11010c.m22280a(), 280.0f);
    }

    public final void dismiss() {
        super.dismiss();
        if (this.f85938b) {
            C48121w.m104249M().mo95291x();
            this.f85938b = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo70136a() {
        if (C48121w.m104249M().mo95257o()) {
            C48121w.m104249M().mo95293z();
            this.f85938b = true;
            return;
        }
        this.f85939c.postDelayed(new C33110d(this), 1000);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo70136a();
        }
    }

    public C33107a(Context context, String[] strArr) {
        super(context, (int) R.style.a4u, false, true);
        setContentView(R.layout.b3v);
        findViewById(R.id.qa).setOnClickListener(new C33108b(this));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(C33109c.f85941a);
        ArrayList arrayList = new ArrayList();
        Map localeMap = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getLocaleMap();
        HashMap hashMap = new HashMap();
        for (C35834e eVar : localeMap.values()) {
            hashMap.put(eVar.mo70121a(), eVar);
        }
        for (String str : strArr) {
            C35834e eVar2 = (C35834e) hashMap.get(str);
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        this.f85937a.setLayoutManager(new WrapLinearLayoutManager(context));
        this.f85937a.mo4798a((C1331h) new C23697k(1, C23728o.m58241a(0.5d), Color.parseColor("#20161823")));
        this.f85937a.setAdapter(new C33111e(context, arrayList, this));
        this.f85939c = new Handler();
        C26890h.m65011a("show_language_popup", new C23089d().mo47829a("enter_from", "homepage_hot").f61491a);
    }
}
