package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25166c;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25230h;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.forward.api.ForwardApi;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.comment.model.ForwardPublishModel */
public class ForwardPublishModel extends C26832a<ForwardDetail> {
    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public boolean sendRequest(Object... objArr) {
        String str;
        String valueOf;
        UrlModel urlModel;
        int i;
        int i2;
        int i3;
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C25166c cVar = objArr[0];
        boolean a = C25230h.m61353a();
        C17971f gson = C47759cc.m103382a().getGson();
        if (cVar.f66623d != null) {
            str = gson.mo34889b(cVar.f66623d);
        } else {
            str = "[]";
        }
        String str2 = str;
        C29366a aVar = cVar.f66625f;
        if (aVar == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(aVar.getId());
        }
        String str3 = valueOf;
        String str4 = null;
        if (aVar == null) {
            urlModel = null;
        } else {
            urlModel = aVar.getAnimateUrl();
        }
        if (urlModel != null) {
            str4 = urlModel.getUri();
        }
        String str5 = str4;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.getStickerType();
        }
        if (aVar == null) {
            i2 = 0;
        } else {
            i2 = aVar.getWidth();
        }
        if (aVar == null) {
            i3 = 0;
        } else {
            i3 = aVar.getHeight();
        }
        ForwardApi.f84275a.createForward(cVar.f66621b, cVar.f66620a, cVar.f66677j, cVar.f66678k, cVar.f66622c, str2, a ? 1 : 0, cVar.f66624e, str3, str5, i, i2, i3, cVar.f66626g, cVar.f66627h).mo19a((C0011g<TResult, TContinuationResult>) new ForwardPublishModel$$Lambda$0<TResult,TContinuationResult>(cVar)).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }

    static final /* synthetic */ Object lambda$sendRequest$0$ForwardPublishModel(C25166c cVar, C0013i iVar) throws Exception {
        if (iVar.mo35f() != null) {
            return iVar.mo35f();
        }
        ForwardDetail forwardDetail = (ForwardDetail) iVar.mo34e();
        forwardDetail.getComment().setFakeId(cVar.f66628i);
        forwardDetail.getComment().setEmoji(cVar.f66625f);
        return forwardDetail;
    }
}
