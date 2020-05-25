package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a;

import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.d */
public final /* synthetic */ class C35110d implements C33242d {

    /* renamed from: a */
    private final IMContact f90292a;

    /* renamed from: b */
    private final SharePackage f90293b;

    /* renamed from: c */
    private final C23371a f90294c;

    public C35110d(IMContact iMContact, SharePackage sharePackage, C23371a aVar) {
        this.f90292a = iMContact;
        this.f90293b = sharePackage;
        this.f90294c = aVar;
    }

    public final void sendMsg() {
        IMContact iMContact = this.f90292a;
        SharePackage sharePackage = this.f90293b;
        C23371a aVar = this.f90294c;
        C35106c.m79332a(Collections.singletonList(iMContact), (String) null, sharePackage, (BaseContent) null, (String) null);
        if (aVar != null) {
            aVar.run(Boolean.valueOf(true));
        }
    }
}
