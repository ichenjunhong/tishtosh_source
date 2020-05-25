package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AvatarImageWithVerifyMus */
public final class AvatarImageWithVerifyMus extends AvatarImageWithVerify {

    /* renamed from: f */
    public static final C40401a f103101f = new C40401a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AvatarImageWithVerifyMus$a */
    public static final class C40401a {
        private C40401a() {
        }

        public /* synthetic */ C40401a(C52707g gVar) {
            this();
        }
    }

    public AvatarImageWithVerifyMus(Context context) {
        this(context, null, 0, 6, null);
    }

    public AvatarImageWithVerifyMus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getVerifyIconSize() {
        return (int) C9432q.m18687b(C11010c.m22280a(), 20.0f);
    }

    public AvatarImageWithVerifyMus(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AvatarImageWithVerifyMus(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
