package com.p683ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.C23640a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.w */
public final class C30123w extends VideoViewHolder {

    /* renamed from: a */
    private final C30124x f78642a = new C30124x(this.f78516h, this.tagLayout);

    /* renamed from: b */
    private Aweme f78643b;

    /* renamed from: E */
    public final Aweme mo60289E() {
        return this.f78643b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo60243n() {
        super.mo60243n();
        C30124x xVar = this.f78642a;
        boolean z = true;
        if (xVar.f78646c == null || ((xVar.f78646c.getRelationLabel() == null || xVar.f78646c.getRelationLabel().getType() != 1 || TextUtils.isEmpty(xVar.f78646c.getRelationLabel().getLabelInfo())) && (xVar.f78646c.getFeedRelationLabel() == null || xVar.f78646c.getFeedRelationLabel().getType().intValue() != 3 || C9376b.m18558a((Collection<T>) xVar.f78646c.getFeedRelationLabel().getUserList())))) {
            z = false;
        }
        if (z) {
            new C30125y(xVar);
            if (xVar.f78645b != null && !RelationLabelHelper.hasDuoShanLabel(xVar.f78646c.getForwardItem()) && !RelationLabelHelper.hasNewRelationLabel(xVar.f78646c)) {
                xVar.f78646c.getForwardItem();
                xVar.f78646c.getRelationLabel().getLabelInfo();
                new C23640a(7, 20);
            }
        }
    }

    C30123w(C30069bh bhVar) {
        super(bhVar);
    }

    /* renamed from: a */
    public final void mo53996a(Aweme aweme) {
        this.f78643b = aweme;
        this.f78642a.f78646c = this.f78643b;
        super.mo53996a(C31190f.m72835c(this.f78643b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Aweme mo60229d(int i) {
        boolean z;
        if (i == 7) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo60289E();
        }
        return super.mo60229d(i);
    }
}
