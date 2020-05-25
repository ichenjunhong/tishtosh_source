package com.p683ss.android.ugc.aweme.comment;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.comment.adapter.C25112e;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.c */
public final class C25146c {

    /* renamed from: a */
    public static final C25146c f66583a = new C25146c();

    private C25146c() {
    }

    /* renamed from: a */
    public static final TextExtraStruct m61086a() {
        int i;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        if (C25282a.m61494a().isBlackBackground() || C25112e.m61020a()) {
            i = C11010c.m22280a().getResources().getColor(R.color.a1a);
        } else {
            i = C11010c.m22280a().getResources().getColor(R.color.as_);
        }
        textExtraStruct.setColor(i);
        textExtraStruct.setBoldText(true);
        return textExtraStruct;
    }
}
