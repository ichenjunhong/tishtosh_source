package com.p683ss.android.ugc.aweme.shortvideo.p2265y;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.discover.model.NationalTask;
import com.p683ss.android.ugc.aweme.discover.model.TaskAnchorInfo;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.shortvideo.C43305e;
import com.p683ss.android.ugc.aweme.shortvideo.C43838fk;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.d */
public final class C45628d implements C17410f<NationalTask, C43305e> {
    /* renamed from: a */
    public final /* synthetic */ Object mo33734a(Object obj) {
        return m99365b((NationalTask) obj);
    }

    /* renamed from: a */
    public static C43305e m99364a(NationalTask nationalTask) {
        if (nationalTask == null) {
            return null;
        }
        new C45628d();
        return m99365b(nationalTask);
    }

    /* renamed from: b */
    private static C43305e m99365b(NationalTask nationalTask) {
        int i;
        String str;
        String str2;
        UrlModel urlModel;
        String str3;
        String str4;
        String str5;
        C43305e eVar = new C43305e();
        eVar.setId(nationalTask.f74686id);
        eVar.setChallengeNames(nationalTask.challengeNames);
        ArrayList arrayList = new ArrayList();
        if (nationalTask.connectMusic != null) {
            for (int i2 = 0; i2 < nationalTask.connectMusic.size(); i2++) {
                arrayList.add(((Music) nationalTask.connectMusic.get(i2)).convertToMusicModel());
            }
        }
        TaskAnchorInfo taskAnchorInfo = nationalTask.anchor;
        C43838fk fkVar = new C43838fk();
        if (taskAnchorInfo != null) {
            i = taskAnchorInfo.getType();
        } else {
            i = C25600a.NO_TYPE.getTYPE();
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
        eVar.setAnchor(fkVar);
        eVar.setConnectMusic(C17593ar.m43275a((Iterable<? extends E>) C17593ar.m43278a(arrayList, new C45627c())));
        eVar.setStickerIds(nationalTask.stickerIds);
        eVar.setMvIds(nationalTask.mvIds);
        eVar.setMentionedUsers(nationalTask.mentionedUsers);
        eVar.setOptionalMaterials(nationalTask.optionalMaterials);
        return eVar;
    }
}
