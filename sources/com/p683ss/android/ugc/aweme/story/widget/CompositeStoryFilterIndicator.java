package com.p683ss.android.ugc.aweme.story.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43899b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator */
public final class CompositeStoryFilterIndicator extends LinearLayout {

    /* renamed from: a */
    private final StoryFilterIndicator f118108a = new StoryFilterIndicator(getContext());

    /* renamed from: b */
    private final StoryFilterIndicator f118109b = new StoryFilterIndicator(getContext());

    /* renamed from: a */
    public final void mo93944a(C43899b bVar, C43899b bVar2, boolean z) {
        mo93945a(bVar, bVar2, z, false);
    }

    public CompositeStoryFilterIndicator(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        setOrientation(1);
        addView(this.f118108a);
        addView(this.f118109b);
        this.f118109b.setScaleX(0.5f);
        this.f118109b.setScaleY(0.5f);
    }

    public CompositeStoryFilterIndicator(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        setOrientation(1);
        addView(this.f118108a);
        addView(this.f118109b);
        this.f118109b.setScaleX(0.5f);
        this.f118109b.setScaleY(0.5f);
    }

    public CompositeStoryFilterIndicator(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
        setOrientation(1);
        addView(this.f118108a);
        addView(this.f118109b);
        this.f118109b.setScaleX(0.5f);
        this.f118109b.setScaleY(0.5f);
    }

    /* renamed from: a */
    public final void mo93945a(C43899b bVar, C43899b bVar2, boolean z, boolean z2) {
        String str;
        String str2;
        C52711k.m112240b(bVar, "pre");
        C52711k.m112240b(bVar2, "cur");
        if (z2) {
            str = "";
        } else {
            str = bVar.f111181a;
        }
        if (z2) {
            str2 = "";
        } else {
            str2 = bVar.f111182b;
        }
        this.f118108a.mo93946a(str, bVar2.f111181a, z);
        this.f118109b.mo93946a(str2, bVar2.f111182b, z);
        setVisibility(0);
    }
}
