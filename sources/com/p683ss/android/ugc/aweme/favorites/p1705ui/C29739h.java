package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29668b;
import com.p683ss.android.ugc.aweme.miniapp.appgroup.C36842a;
import com.p683ss.android.ugc.aweme.miniapp.appgroup.C36853d;
import com.p683ss.android.ugc.aweme.miniapp.appgroup.C36853d.C36854a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.h */
public final class C29739h extends C29716a implements C36854a {

    /* renamed from: l */
    private HashMap f77674l;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo59985n() {
        C26876b bVar = this.f77639k;
        if (bVar != null) {
            bVar.mo54799a(new C36842a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C26840g<?> mo59986o() {
        return new C29668b<>(getActivity());
    }

    public final void onDestroy() {
        C36853d.m82921b(this);
        super.onDestroy();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f77674l != null) {
            this.f77674l.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo59983k() {
        C26876b bVar = this.f77639k;
        if (bVar != null) {
            bVar.mo44934a_(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo59984m() {
        C26876b bVar = this.f77639k;
        if (bVar != null) {
            bVar.mo44934a_(Integer.valueOf(4));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36853d.m82920a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59982a(View view) {
        int i;
        super.mo59982a(view);
        Context context = getContext();
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                i = resources.getDimensionPixelSize(R.dimen.jd);
                this.f77633a.setPadding(i, 0, i, 0);
            }
        }
        i = 0;
        this.f77633a.setPadding(i, 0, i, 0);
    }
}
