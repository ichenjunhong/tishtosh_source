package com.p683ss.android.ugc.aweme.detail.views;

import android.content.Context;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.views.AvatarImageWithVerifyInCell */
public final class AvatarImageWithVerifyInCell extends AvatarImageWithVerify {

    /* renamed from: f */
    public static final C27526a f72367f = new C27526a(null);

    /* renamed from: com.ss.android.ugc.aweme.detail.views.AvatarImageWithVerifyInCell$a */
    public static final class C27526a {
        private C27526a() {
        }

        public /* synthetic */ C27526a(C52707g gVar) {
            this();
        }
    }

    public AvatarImageWithVerifyInCell(Context context) {
        this(context, null, 0, 6, null);
    }

    public AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getVerifyIconMarginEnd() {
        return -C23728o.m58241a(4.0d);
    }

    public final int getVerifyIconSize() {
        return C23728o.m58241a(16.0d);
    }

    public AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
