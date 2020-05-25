package com.p683ss.android.ugc.aweme.detail.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.views.AvatarImageWithVerifyMini */
public final class AvatarImageWithVerifyMini extends AvatarImageWithVerify {

    /* renamed from: f */
    public static final C27527a f72368f = new C27527a(null);

    /* renamed from: com.ss.android.ugc.aweme.detail.views.AvatarImageWithVerifyMini$a */
    public static final class C27527a {
        private C27527a() {
        }

        public /* synthetic */ C27527a(C52707g gVar) {
            this();
        }
    }

    public AvatarImageWithVerifyMini(Context context) {
        this(context, null, 0, 6, null);
    }

    public AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getVerifyIconSize() {
        return (int) C9432q.m18687b(C11010c.m22280a(), 12.0f);
    }

    public AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
