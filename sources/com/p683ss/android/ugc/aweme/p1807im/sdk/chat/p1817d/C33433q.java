package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.squareup.okhttp.OkHttpClient;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.q */
public final class C33433q extends C33446z {

    /* renamed from: a */
    public static int f86664a;

    /* renamed from: b */
    C11207p f86665b;

    /* renamed from: d */
    private C9381g f86666d;

    /* renamed from: e */
    private OnlyPictureContent f86667e;

    /* renamed from: a */
    public final void mo70784a(String str) {
        super.mo70784a(str);
        f86664a++;
        C35190af.m79442a().mo73319a(this.f86665b);
        this.f86665b.setMsgStatus(3);
        this.f86666d.post(new C33436t(this));
    }

    /* renamed from: a */
    public final void mo70785a(Throwable th) {
        super.mo70785a(th);
        f86664a++;
        C35190af.m79442a().mo73319a(this.f86665b);
        this.f86665b.setMsgStatus(3);
        this.f86666d.post(new C33435s(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo70839b(String str, UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            this.f86667e.setUrl(urlModel);
            this.f86665b.setContent(C35277o.m79761a(this.f86667e));
            this.f86666d.post(new C33434r(this));
            super.mo70839b(str, urlModel);
        }
    }

    public C33433q(OkHttpClient okHttpClient, C9381g gVar, OnlyPictureContent onlyPictureContent, C11207p pVar) {
        super(okHttpClient);
        this.f86666d = gVar;
        this.f86667e = onlyPictureContent;
        this.f86684c = onlyPictureContent.getPicturePath();
        if (!onlyPictureContent.isSendRaw() && !TextUtils.isEmpty(onlyPictureContent.getCompressPath())) {
            this.f86684c = onlyPictureContent.getCompressPath();
        }
        this.f86665b = pVar;
        this.f86585f = m76551a(pVar);
    }
}
