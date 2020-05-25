package com.p683ss.android.ugc.aweme.shortvideo.p2265y;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.h */
public final class C45633h implements C17410f<AVTextExtraStruct, TextExtraStruct> {
    /* renamed from: a */
    public static ArrayList<TextExtraStruct> m99372a(List<AVTextExtraStruct> list) {
        if (list == null) {
            return null;
        }
        return C17593ar.m43275a((Iterable<? extends E>) C17593ar.m43278a(list, new C45633h()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33734a(Object obj) {
        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setCid(aVTextExtraStruct.getCid());
        textExtraStruct.setHashTagName(aVTextExtraStruct.getHashTagName());
        textExtraStruct.setUserId(aVTextExtraStruct.getUserId());
        textExtraStruct.setAtUserType(aVTextExtraStruct.getAtUserType());
        textExtraStruct.setType(aVTextExtraStruct.getType());
        textExtraStruct.setStart(aVTextExtraStruct.getStart());
        textExtraStruct.setEnd(aVTextExtraStruct.getEnd());
        textExtraStruct.setAwemeId(aVTextExtraStruct.getAwemeId());
        textExtraStruct.setSubType(aVTextExtraStruct.getSubType());
        return textExtraStruct;
    }
}
