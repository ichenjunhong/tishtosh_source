package com.p683ss.android.ugc.aweme.p1807im.service.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.h */
public class C35471h implements Serializable {
    public String aid;
    public IMContact contact;
    public String enterFrom;
    public boolean isMulti;
    public String itemType;

    public C35471h(IMContact iMContact, boolean z, String str, String str2) {
        this.contact = iMContact;
        this.isMulti = z;
        this.itemType = str;
        this.enterFrom = str2;
    }

    public C35471h(IMContact iMContact, boolean z, String str, String str2, String str3) {
        this.contact = iMContact;
        this.isMulti = z;
        this.itemType = str;
        this.enterFrom = str2;
        this.aid = str3;
    }
}
