package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52549aa;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.GroupedAvatars */
public final class GroupedAvatars extends FrameLayout {

    /* renamed from: a */
    public static final C32635a f84919a = new C32635a(null);

    /* renamed from: b */
    private int f84920b;

    /* renamed from: c */
    private int f84921c;

    /* renamed from: d */
    private int f84922d;

    /* renamed from: e */
    private int f84923e;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.GroupedAvatars$a */
    public static final class C32635a {
        private C32635a() {
        }

        public /* synthetic */ C32635a(C52707g gVar) {
            this();
        }
    }

    public GroupedAvatars(Context context) {
        this(context, null, 0, 6, null);
    }

    public GroupedAvatars(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final int mo66167a(List<? extends RelativeUserInfo> list) {
        boolean z;
        if (list.isEmpty()) {
            setVisibility(8);
            return 0;
        }
        setVisibility(0);
        removeAllViews();
        int size = list.size() - 1;
        Iterator it = C52753d.m112318a(size, 0).iterator();
        while (it.hasNext()) {
            int a = ((C52549aa) it).mo110114a();
            RelativeUserInfo relativeUserInfo = (RelativeUserInfo) list.get(a);
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            int i = this.f84920b;
            int i2 = this.f84921c;
            int i3 = this.f84922d;
            if (a > 0) {
                z = true;
            } else {
                z = false;
            }
            C32765l lVar = new C32765l(context, i, i2, i3, z);
            LayoutParams layoutParams = new LayoutParams(this.f84920b, this.f84920b);
            layoutParams.setMargins(this.f84922d * a, 0, 0, 0);
            layoutParams.gravity = 16;
            lVar.setLayoutParams(layoutParams);
            C13833a aVar = (C13833a) lVar.getHierarchy();
            aVar.mo25898a(C13818b.f36062b);
            aVar.mo25898a(C13818b.f36062b);
            aVar.mo25907c(this.f84923e);
            aVar.mo25902b(this.f84923e);
            C23515d.m57669a((RemoteImageView) lVar, relativeUserInfo.getAvatar());
            addView(lVar);
        }
        return this.f84920b + (this.f84922d * size);
    }

    public GroupedAvatars(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f84920b = C23728o.m58241a(16.0d);
        this.f84921c = C23728o.m58241a(2.0d);
        this.f84922d = C23728o.m58241a(12.0d);
        this.f84923e = R.color.ang;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.abb, R.attr.abc, R.attr.abd, R.attr.abe, R.attr.abf});
        if (obtainStyledAttributes != null) {
            i2 = obtainStyledAttributes.getDimensionPixelSize(4, this.f84920b);
        } else {
            i2 = this.f84920b;
        }
        this.f84920b = i2;
        if (obtainStyledAttributes != null) {
            i3 = obtainStyledAttributes.getDimensionPixelSize(1, this.f84921c);
        } else {
            i3 = this.f84921c;
        }
        this.f84921c = i3;
        if (obtainStyledAttributes != null) {
            i4 = obtainStyledAttributes.getDimensionPixelSize(3, this.f84922d);
        } else {
            i4 = this.f84922d;
        }
        this.f84922d = i4;
        if (obtainStyledAttributes != null) {
            i5 = obtainStyledAttributes.getResourceId(2, this.f84923e);
        } else {
            i5 = this.f84923e;
        }
        this.f84923e = i5;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ GroupedAvatars(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
