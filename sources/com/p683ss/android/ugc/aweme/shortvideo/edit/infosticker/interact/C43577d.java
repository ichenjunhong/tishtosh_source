package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import android.support.p030v4.p038f.C0794k;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d */
public final class C43577d {
    /* renamed from: a */
    public static C43594e m95720a(C43597g gVar) {
        if (gVar != null) {
            return gVar.mInteractStickerContext;
        }
        return null;
    }

    /* renamed from: a */
    public static C43594e m95721a(String str) {
        if (C9431p.m18664a(str)) {
            return null;
        }
        try {
            return ((C43597g) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34884a(str, C43597g.class)).mInteractStickerContext;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static NormalTrackTimeStamp m95722a(InteractStickerStruct interactStickerStruct) {
        List list;
        try {
            list = (List) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34885a(interactStickerStruct.getTrackList(), new C17956a<List<NormalTrackTimeStamp>>() {
            }.f49843c);
        } catch (Exception unused) {
            list = null;
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        return (NormalTrackTimeStamp) list.get(0);
    }

    /* renamed from: b */
    public static C0794k<String, String> m95729b(C43597g gVar) {
        String str = "";
        String str2 = "";
        List a = m95726a(gVar, 1, C43596f.TRACK_PAGE_EDIT);
        if (a == null || a.isEmpty() || C9431p.m18664a(((InteractStickerStruct) a.get(0)).getAttr())) {
            return new C0794k<>(str, str2);
        }
        try {
            HashMap hashMap = (HashMap) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34885a(((InteractStickerStruct) a.get(0)).getAttr(), new C17956a<HashMap<String, String>>() {
            }.f49843c);
            if (hashMap != null) {
                if (hashMap.containsKey("poll_sticker_id")) {
                    str = (String) hashMap.get("poll_sticker_id");
                }
                if (hashMap.containsKey("poll_sticker_tab_id")) {
                    str2 = (String) hashMap.get("poll_sticker_tab_id");
                }
            }
        } catch (Exception e) {
            C39629l.m88232a().mo58567E().mo49424a(e);
        }
        return new C0794k<>(str, str2);
    }

    /* renamed from: b */
    public static List<InteractStickerStruct> m95730b(C43597g gVar, C43596f... fVarArr) {
        LinkedList linkedList = new LinkedList();
        C43594e a = m95720a(gVar);
        if (a == null || a.isEmpty(fVarArr)) {
            return null;
        }
        List stickerStructsByPage = a.getStickerStructsByPage(fVarArr);
        Iterator it = stickerStructsByPage.iterator();
        while (it.hasNext()) {
            if (((InteractStickerStruct) it.next()).getVoteStruct() != null) {
                it.remove();
            }
        }
        linkedList.addAll(stickerStructsByPage);
        return linkedList;
    }

    /* renamed from: a */
    public static Collection<InteractStickerStruct> m95725a(BaseShortVideoContext baseShortVideoContext, C43596f... fVarArr) {
        C43594e eVar;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            eVar = m95720a(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
        } else {
            eVar = m95721a(baseShortVideoContext.getMainBusinessData());
        }
        if (eVar == null || eVar.isEmpty(fVarArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = eVar.getStickerStructsByPage(fVarArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPoiStruct() != null) {
                PoiStruct poiStruct = new PoiStruct();
                poiStruct.setPoiId(interactStickerStruct.getPoiStruct().getPoiId());
                interactStickerStruct.setPoiStruct(poiStruct);
            }
            if (interactStickerStruct.getVoteStruct() != null) {
                VoteStruct voteStruct = interactStickerStruct.getVoteStruct();
                if (!C9376b.m18558a((Collection<T>) voteStruct.getOptions()) && voteStruct.getOptions().size() >= 2) {
                    if (C9431p.m18664a(((OptionsBean) voteStruct.getOptions().get(0)).getPostOption())) {
                        ((OptionsBean) voteStruct.getOptions().get(0)).setPostOption(C39629l.m88233b().getString(R.string.fdd));
                    }
                    if (C9431p.m18664a(((OptionsBean) voteStruct.getOptions().get(1)).getPostOption())) {
                        ((OptionsBean) voteStruct.getOptions().get(1)).setPostOption(C39629l.m88233b().getString(R.string.fde));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    /* renamed from: a */
    public static List<InteractStickerStruct> m95727a(C43597g gVar, C43596f... fVarArr) {
        C43594e a = m95720a(gVar);
        if (a == null || a.isEmpty(fVarArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = a.getStickerStructsByPage(fVarArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPoiStruct() != null) {
                PoiStruct poiStruct = new PoiStruct();
                poiStruct.setPoiId(interactStickerStruct.getPoiStruct().getPoiId());
                interactStickerStruct.setPoiStruct(poiStruct);
            }
            if (interactStickerStruct.getVoteStruct() != null) {
                VoteStruct voteStruct = interactStickerStruct.getVoteStruct();
                if (!C9376b.m18558a((Collection<T>) voteStruct.getOptions()) && voteStruct.getOptions().size() >= 2) {
                    if (C9431p.m18664a(((OptionsBean) voteStruct.getOptions().get(0)).getPostOption())) {
                        ((OptionsBean) voteStruct.getOptions().get(0)).setPostOption(C39629l.m88233b().getString(R.string.fdd));
                    }
                    if (C9431p.m18664a(((OptionsBean) voteStruct.getOptions().get(1)).getPostOption())) {
                        ((OptionsBean) voteStruct.getOptions().get(1)).setPostOption(C39629l.m88233b().getString(R.string.fde));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    /* renamed from: a */
    public static void m95728a(C20347c cVar, C43597g gVar) {
        if (gVar != null) {
            HashMap hashMap = new HashMap();
            List a = m95727a(gVar, C43596f.TRACK_PAGE_RECORD);
            if (!C9376b.m18558a((Collection<T>) a)) {
                hashMap.put(C44576a.f112779s, C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(a));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C44576a.f112778r, C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(hashMap));
            } catch (JSONException unused) {
            }
            cVar.mo43002a(C44576a.f112776p, jSONObject.toString());
        }
    }

    /* renamed from: a */
    public static String m95723a(C43597g gVar, List<InteractStickerStruct> list, C43596f fVar) {
        C43594e eVar;
        if (gVar == null) {
            gVar = new C43597g();
        }
        if (gVar.mInteractStickerContext == null) {
            eVar = new C43594e();
        } else {
            eVar = gVar.mInteractStickerContext;
        }
        eVar.upDateStickerStructs(list, fVar);
        gVar.setInteractStickerContext(eVar);
        return C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(gVar);
    }

    /* renamed from: a */
    public static String m95724a(String str, List<InteractStickerStruct> list, C43596f fVar) {
        C43597g gVar;
        C43594e eVar;
        if (C9431p.m18664a(str)) {
            gVar = new C43597g();
        } else {
            try {
                gVar = (C43597g) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34884a(str, C43597g.class);
            } catch (Exception unused) {
                gVar = new C43597g();
            }
        }
        if (gVar.mInteractStickerContext == null) {
            eVar = new C43594e();
        } else {
            eVar = gVar.mInteractStickerContext;
        }
        eVar.upDateStickerStructs(list, fVar);
        gVar.setInteractStickerContext(eVar);
        return C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(gVar);
    }

    /* renamed from: a */
    public static List<InteractStickerStruct> m95726a(C43597g gVar, int i, C43596f fVar) {
        C43594e a = m95720a(gVar);
        if (a == null) {
            return null;
        }
        return a.getTrackByType(Integer.valueOf(i), fVar);
    }
}
