package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify */
public final class CommentAtAvaterWithVerify extends AvatarImageWithVerify {

    /* renamed from: f */
    public static final C25287a f66883f = new C25287a(null);

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify$a */
    public static final class C25287a {
        private C25287a() {
        }

        public /* synthetic */ C25287a(C52707g gVar) {
            this();
        }
    }

    public CommentAtAvaterWithVerify(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getVerifyIconSize() {
        return (int) C9432q.m18687b(C11010c.m22280a(), 16.0f);
    }

    public CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
