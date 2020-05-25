package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.C14963ax;

final class bwp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f44163a;

    /* renamed from: b */
    private final /* synthetic */ bwo f44164b;

    bwp(bwo bwo, View view) {
        this.f44164b = bwo;
        this.f44163a = view;
    }

    public final void run() {
        bwo bwo = this.f44164b;
        View view = this.f44163a;
        try {
            bwi bwi = new bwi(bwo.f44153e, bwo.f44154f, bwo.f44155g, bwo.f44156h, bwo.f44157i, bwo.f44158j, bwo.f44159k);
            Context b = C14963ax.m30833c().mo30817b();
            if (b != null && !TextUtils.isEmpty(bwo.f44160l)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) caf.m37099d().mo30717a(C15740bx.f44212Z), "id", b.getPackageName()));
                if (str != null && str.equals(bwo.f44160l)) {
                    return;
                }
            }
            bws a = bwo.mo30828a(view, bwi);
            bwi.mo30807c();
            if (a.f44171a != 0 || a.f44172b != 0) {
                if (a.f44172b != 0 || bwi.f44117b != 0) {
                    if (a.f44172b != 0 || !bwo.f44152d.mo30812a(bwi)) {
                        bwo.f44152d.mo30814c(bwi);
                    }
                }
            }
        } catch (Exception e) {
            abv.m32793b("Exception in fetchContentOnUIThread", e);
            C14963ax.m30834d().mo28588a((Throwable) e, "ContentFetchTask.fetchContent");
        }
    }
}
