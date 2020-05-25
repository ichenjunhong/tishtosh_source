package com.p683ss.android.ugc.aweme.p1308ad.search;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.view.IAdDownloadItemView;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.search.SearchAdBaseItemView */
public class SearchAdBaseItemView extends IAdDownloadItemView implements C0183j {

    /* renamed from: a */
    private C0184k f60401a;

    /* renamed from: b */
    private AwemeRawAd f60402b;

    /* renamed from: c */
    private HashMap f60403c;

    public SearchAdBaseItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchAdBaseItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo46690a(int i) {
        if (this.f60403c == null) {
            this.f60403c = new HashMap();
        }
        View view = (View) this.f60403c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f60403c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public final AwemeRawAd getAwemeRawAd() {
        return this.f60402b;
    }

    public final C0184k getLifecycleOwner() {
        return this.f60401a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0184k kVar = this.f60401a;
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
        C0184k kVar = this.f60401a;
        if (kVar != null) {
            C0176h lifecycle = kVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo325b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.f60402b = awemeRawAd;
    }

    public final void setLifecycleOwner(C0184k kVar) {
        this.f60401a = kVar;
    }

    /* renamed from: a */
    public void mo46691a(AwemeRawAd awemeRawAd) {
        C52711k.m112240b(awemeRawAd, "awemeRawAd");
        this.f60402b = awemeRawAd;
    }

    /* renamed from: b */
    protected static void m55444b(AwemeRawAd awemeRawAd) {
        C52711k.m112240b(awemeRawAd, "rawAd");
        C22317a a = C22317a.m55223a();
        C52711k.m112236a((Object) a, "AdDependManager.inst()");
        a.f60116c.mo46430a(awemeRawAd);
    }

    /* renamed from: a */
    protected static void m55443a(TextView textView, CharSequence charSequence) {
        C52711k.m112240b(textView, "tv");
        C52711k.m112240b(charSequence, "text");
        try {
            textView.setText(charSequence);
        } catch (Exception unused) {
        }
    }

    public SearchAdBaseItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ SearchAdBaseItemView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
