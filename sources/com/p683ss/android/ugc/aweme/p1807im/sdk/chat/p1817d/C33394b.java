package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35208au;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.b */
public final class C33394b extends C33410c {

    /* renamed from: g */
    private static C35208au<C33394b> f86587g = new C35208au<C33394b>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo70757a() {
            return new C33394b();
        }
    };

    /* renamed from: a */
    public C11207p f86588a;

    private C33394b() {
    }

    /* renamed from: b */
    public final void mo70779b() {
        C11213r.m22771c(this.f86588a);
    }

    /* renamed from: a */
    public static C33394b m76552a() {
        return (C33394b) f86587g.mo73326b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C33393ac mo70778a(C11207p pVar, BaseContent baseContent) {
        if (baseContent instanceof AudioContent) {
            return new C33429p(this.f86621f, this.f86620e, (AudioContent) baseContent, pVar);
        }
        return null;
    }
}
