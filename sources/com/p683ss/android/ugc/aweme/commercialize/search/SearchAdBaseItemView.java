package com.p683ss.android.ugc.aweme.commercialize.search;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdBaseItemView */
public class SearchAdBaseItemView extends LinearLayout implements C0183j {

    /* renamed from: a */
    private C0184k f69183a;

    /* renamed from: b */
    private AwemeRawAd f69184b;

    /* access modifiers changed from: protected */
    public final AwemeRawAd getAwemeRawAd() {
        return this.f69184b;
    }

    public final C0184k getLifecycleOwner() {
        return this.f69183a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0184k kVar = this.f69183a;
        if (kVar != null) {
            C0176h lifecycle = kVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo324a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0184k kVar = this.f69183a;
        if (kVar != null) {
            C0176h lifecycle = kVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo325b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.f69184b = awemeRawAd;
    }

    public final void setLifecycleOwner(C0184k kVar) {
        this.f69183a = kVar;
    }
}
