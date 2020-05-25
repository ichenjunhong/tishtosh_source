package com.p683ss.android.ugc.aweme.shortvideo.p2265y;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.i */
public final class C45634i implements C17410f<TextExtraStruct, AVTextExtraStruct> {
    /* renamed from: a */
    public static ArrayList<AVTextExtraStruct> m99374a(List<TextExtraStruct> list) {
        if (list == null) {
            return null;
        }
        return C17593ar.m43275a((Iterable<? extends E>) C17593ar.m43278a(list, new C45634i()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33734a(Object obj) {
        TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setStarAtlasTag(textExtraStruct.isStarAtlasTag());
        aVTextExtraStruct.setCid(textExtraStruct.getCid());
        aVTextExtraStruct.setHashTagName(textExtraStruct.getHashTagName());
        aVTextExtraStruct.setUserId(textExtraStruct.getUserId());
        aVTextExtraStruct.setAtUserType(textExtraStruct.getAtUserType());
        aVTextExtraStruct.setType(textExtraStruct.getType());
        aVTextExtraStruct.setStart(textExtraStruct.getStart());
        aVTextExtraStruct.setEnd(textExtraStruct.getEnd());
        aVTextExtraStruct.setAwemeId(textExtraStruct.getAwemeId());
        aVTextExtraStruct.setSubType(textExtraStruct.getSubtype());
        return aVTextExtraStruct;
    }
}
