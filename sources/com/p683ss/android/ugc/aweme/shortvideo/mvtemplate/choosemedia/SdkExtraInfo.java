package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo */
public final class SdkExtraInfo implements Serializable {
    private String mvAlgorithmHint = "";

    /* renamed from: pl */
    private PlDataBean f111676pl;

    public final String getMvAlgorithmHint() {
        return this.mvAlgorithmHint;
    }

    public final PlDataBean getPl() {
        return this.f111676pl;
    }

    public final boolean isLegal() {
        boolean z;
        if (this.mvAlgorithmHint.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            PlDataBean plDataBean = this.f111676pl;
            if (plDataBean != null) {
                List alg = plDataBean.getAlg();
                if (alg == null || !(!alg.isEmpty())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void setPl(PlDataBean plDataBean) {
        this.f111676pl = plDataBean;
    }

    public final void setMvAlgorithmHint(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.mvAlgorithmHint = str;
    }
}
