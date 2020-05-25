package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43594e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a */
public final class C43603a implements C2593a {

    /* renamed from: a */
    public String f110344a = "";

    /* renamed from: b */
    public boolean f110345b = true;

    /* renamed from: c */
    private String f110346c = "";

    /* renamed from: d */
    private LinkedHashMap<String, List<NormalTrackTimeStamp>> f110347d = new LinkedHashMap<>();

    /* renamed from: e */
    private LinkedHashMap<String, ExtraParams> f110348e = new LinkedHashMap<>();

    /* renamed from: f */
    private int f110349f = 0;

    public C43603a() {
        MessageCenter.init();
        MessageCenter.addListener(this);
    }

    /* renamed from: a */
    public final boolean mo88853a(int i) {
        if (!this.f110345b) {
            return false;
        }
        if (i - this.f110349f < -10) {
            m95785b(i);
            this.f110349f = i;
            return false;
        } else if (C9431p.m18664a(this.f110346c)) {
            return false;
        } else {
            if (this.f110349f != -1 && i - this.f110349f <= 300) {
                return false;
            }
            this.f110349f = i;
            return true;
        }
    }

    /* renamed from: b */
    private void m95785b(int i) {
        if (this.f110345b) {
            for (Entry value : this.f110347d.entrySet()) {
                List list = (List) value.getValue();
                if (!C9376b.m18558a((Collection<T>) list)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((NormalTrackTimeStamp) it.next()).getPts() > i) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo88851a(ShortVideoContext shortVideoContext) {
        if (this.f110345b) {
            int i = (int) shortVideoContext.f107120m;
            if (this.f110345b && i - this.f110349f < -10) {
                m95785b(i);
                this.f110349f = i;
            }
            LinkedList linkedList = new LinkedList();
            int i2 = 0;
            for (Entry entry : this.f110347d.entrySet()) {
                ExtraParams extraParams = (ExtraParams) this.f110348e.get(entry.getKey());
                List list = (List) entry.getValue();
                if (!C9376b.m18558a((Collection<T>) list) && extraParams != null) {
                    RecordInteractExtra recordInteractExtra = new RecordInteractExtra();
                    recordInteractExtra.formatFromExtraParams(extraParams, (String) entry.getKey());
                    InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("interaction_extra", recordInteractExtra);
                    interactStickerStruct.setAttr(C39618d.f101139C.getRetrofitFactoryGson().mo34889b(linkedHashMap));
                    interactStickerStruct.setType(2);
                    interactStickerStruct.setIndex(i2);
                    interactStickerStruct.setTrackList(C39618d.f101139C.getRetrofitFactoryGson().mo34889b(list));
                    linkedList.add(interactStickerStruct);
                    i2++;
                }
            }
            shortVideoContext.f107098ax = C43577d.m95724a(shortVideoContext.f107098ax, (List<InteractStickerStruct>) linkedList, C43596f.TRACK_PAGE_RECORD);
        }
    }

    /* renamed from: a */
    public final void mo88850a(int i, ExtraParams extraParams) {
        if (this.f110345b && !C9431p.m18664a(this.f110346c)) {
            ArrayList arrayList = new ArrayList();
            List list = (List) this.f110347d.get(this.f110344a);
            if (!C9376b.m18558a((Collection<T>) list)) {
                arrayList.addAll(list);
            }
            EffectLocationMessage effectLocationMessage = null;
            try {
                effectLocationMessage = (EffectLocationMessage) C39618d.f101139C.getRetrofitFactoryGson().mo34884a(this.f110346c, EffectLocationMessage.class);
            } catch (Exception unused) {
            }
            if (effectLocationMessage != null && !C9376b.m18558a((Collection<T>) effectLocationMessage.locations)) {
                LinkedList linkedList = new LinkedList();
                for (EffectLocation effectLocation : effectLocationMessage.locations) {
                    NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                    normalTrackTimeStamp.setPts(i);
                    normalTrackTimeStamp.setWidth(effectLocation.getW());
                    normalTrackTimeStamp.setHeight(effectLocation.getH());
                    normalTrackTimeStamp.setX(effectLocation.getX());
                    normalTrackTimeStamp.setY(effectLocation.getY());
                    normalTrackTimeStamp.setScale(Float.valueOf(1.0f));
                    normalTrackTimeStamp.setRotation(effectLocation.getR());
                    linkedList.add(normalTrackTimeStamp);
                }
                arrayList.addAll(linkedList);
                this.f110347d.put(this.f110344a, arrayList);
                this.f110348e.put(this.f110344a, extraParams);
            }
        }
    }

    /* renamed from: a */
    public final void mo88852a(String str, int i) {
        List<InteractStickerStruct> list;
        if (this.f110345b) {
            this.f110349f = i;
            C43596f fVar = C43596f.TRACK_PAGE_RECORD;
            C43594e a = C43577d.m95721a(str);
            if (a == null) {
                list = null;
            } else {
                list = a.getStickerStructsByPage(fVar);
            }
            if (!C9376b.m18558a((Collection<T>) list)) {
                for (InteractStickerStruct interactStickerStruct : list) {
                    if (interactStickerStruct.getType() == 2 && !C9431p.m18664a(interactStickerStruct.getAttr()) && !C9431p.m18664a(interactStickerStruct.getTrackList())) {
                        Map map = (Map) C39618d.f101139C.getRetrofitFactoryGson().mo34884a(interactStickerStruct.getAttr(), Map.class);
                        if (map != null && map.containsKey("interaction_extra")) {
                            try {
                                RecordInteractExtra recordInteractExtra = (RecordInteractExtra) C39618d.f101139C.getRetrofitFactoryGson().mo34884a(new JSONObject((Map) map.get("interaction_extra")).toString(), RecordInteractExtra.class);
                                if (recordInteractExtra != null && !C9431p.m18664a(recordInteractExtra.getStickerId())) {
                                    NormalTrackTimeStamp[] normalTrackTimeStampArr = (NormalTrackTimeStamp[]) C39618d.f101139C.getRetrofitFactoryGson().mo34884a(interactStickerStruct.getTrackList(), NormalTrackTimeStamp[].class);
                                    if (!(normalTrackTimeStampArr == null || normalTrackTimeStampArr.length == 0)) {
                                        this.f110347d.put(recordInteractExtra.getStickerId(), new ArrayList(Arrays.asList(normalTrackTimeStampArr)));
                                        this.f110348e.put(recordInteractExtra.getStickerId(), recordInteractExtra.toExtraParams());
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 28) {
            this.f110346c = str;
        }
    }
}
