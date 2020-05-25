package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.model.TaskAnchorInfo;
import com.p683ss.android.ugc.aweme.shortvideo.C43838fk;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.av */
public final class C45404av {

    /* renamed from: a */
    public static final C45404av f114790a = new C45404av();

    private C45404av() {
    }

    /* renamed from: a */
    public static final C43838fk m98963a(TaskAnchorInfo taskAnchorInfo) {
        int i;
        String str;
        String str2;
        UrlModel urlModel;
        String str3;
        String str4;
        String str5;
        C43838fk fkVar = new C43838fk();
        if (taskAnchorInfo != null) {
            i = taskAnchorInfo.getType();
        } else {
            i = -1;
        }
        fkVar.setType(i);
        String str6 = null;
        if (taskAnchorInfo != null) {
            str = taskAnchorInfo.getId();
        } else {
            str = null;
        }
        fkVar.setId(str);
        if (taskAnchorInfo != null) {
            str2 = taskAnchorInfo.getContent();
        } else {
            str2 = null;
        }
        fkVar.setContent(str2);
        if (taskAnchorInfo != null) {
            urlModel = taskAnchorInfo.getIcon();
        } else {
            urlModel = null;
        }
        fkVar.setIcon(urlModel);
        if (taskAnchorInfo != null) {
            str3 = taskAnchorInfo.getTitle();
        } else {
            str3 = null;
        }
        fkVar.setTitle(str3);
        if (taskAnchorInfo != null) {
            str4 = taskAnchorInfo.getOpenUrl();
        } else {
            str4 = null;
        }
        fkVar.setOpenUrl(str4);
        if (taskAnchorInfo != null) {
            str5 = taskAnchorInfo.getMpUrl();
        } else {
            str5 = null;
        }
        fkVar.setMpUrl(str5);
        if (taskAnchorInfo != null) {
            str6 = taskAnchorInfo.getWebUrl();
        }
        fkVar.setWebUrl(str6);
        return fkVar;
    }
}
