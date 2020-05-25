package com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image;

import android.support.p030v4.content.C0726c;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p940f.C13833a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.d */
public final class C22387d extends C22386c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46606a() {
        super.mo46606a();
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25939c(C9432q.m18687b(getContext(), 1.0f));
            ((C13833a) getHierarchy()).f36079a.mo25938b(getResources().getColor(R.color.bs));
            ((C13833a) getHierarchy()).f36079a.mo25940d(C9432q.m18687b(getContext(), 1.0f));
        }
    }

    public final void setBorderColor(int i) {
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25938b(C0726c.m2098c(getContext(), i));
        }
    }

    public final void setBorderWidth(int i) {
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25939c(C9432q.m18687b(getContext(), (float) i));
        }
    }
}
