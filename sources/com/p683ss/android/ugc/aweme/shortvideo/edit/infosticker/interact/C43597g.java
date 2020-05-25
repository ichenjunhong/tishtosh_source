package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.g */
public class C43597g implements Serializable {

    /* renamed from: a */
    private C26916m f110326a;
    public C43594e mInteractStickerContext;

    public static String updateSDKShareContextWhenSaveOrPost(boolean z, String str) {
        return str;
    }

    public C43594e getInteractStickerContext() {
        return this.mInteractStickerContext;
    }

    public C26916m getShareContext() {
        return this.f110326a;
    }

    public String toBusinessData() {
        return C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(this);
    }

    public void setInteractStickerContext(C43594e eVar) {
        this.mInteractStickerContext = eVar;
    }

    public void setShareContext(C26916m mVar) {
        this.f110326a = mVar;
    }

    public static String getShareContext(C43597g gVar) {
        if (gVar == null || gVar.getShareContext() == null) {
            return null;
        }
        return C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(gVar.getShareContext());
    }

    public static String getShareContext(String str) {
        if (C9431p.m18664a(str)) {
            return null;
        }
        C43597g gVar = (C43597g) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34884a(str, C43597g.class);
        if (gVar == null || gVar.getShareContext() == null) {
            return null;
        }
        return C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(gVar.getShareContext());
    }
}
