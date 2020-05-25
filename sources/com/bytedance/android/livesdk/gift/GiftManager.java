package com.bytedance.android.livesdk.gift;

import android.arch.lifecycle.C0198r;
import android.os.SystemClock;
import android.support.p030v4.p038f.C0785g;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4061i;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.gift.C4121b;
import com.bytedance.android.live.gift.C4126d;
import com.bytedance.android.live.gift.C4128f;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5190j;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7209f;
import com.bytedance.android.livesdk.gift.assets.C7211h;
import com.bytedance.android.livesdk.gift.model.C7504c;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7507f;
import com.bytedance.android.livesdk.gift.model.C7508g;
import com.bytedance.android.livesdk.gift.model.C7511j;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.C7516o;
import com.bytedance.android.livesdk.gift.model.DoodleTemplate;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p353a.C7197c;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8069h;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.google.gson.C17971f;
import com.p683ss.ugc.live.p2595a.p2596a.C51560b;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.C51588f;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51569a;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51570b;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51571c;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51572d;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51573e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1663a;
import p064c.p065a.C1673aa;
import p064c.p065a.C2149h;
import p064c.p065a.C2158j;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p079b.C1799b;
import p064c.p065a.p072e.p077e.p081d.C1934aq;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

public class GiftManager {
    private static final int DEFAULT_LIVE_TYPE = 0;
    public static final long DOODLE_GIFT_ID = 998;
    public static final int GIFT_LIST_STRATEGY_UNKNOWN = -1;
    public static final int GIFT_LIST_STRATEGY_V1 = 0;
    public static final int GIFT_LIST_STRATEGY_V2 = 1;
    private static GiftManager sInst;
    C17971f gson = C2942b.m8369a();
    private final C7211h mAssetsManager = C7209f.m14962a("effects");
    private List<DoodleTemplate> mDoodleTemplates;
    private List<Long> mFansClubIds = new ArrayList();
    private C7505d mFastGift;
    private List<C7504c> mGameGiftItemList;
    private C51560b mGetResourceListener = new C51560b() {
        /* renamed from: a */
        public final void mo13388a(C51569a aVar) {
            int i;
            long j;
            try {
                JSONObject jSONObject = new JSONObject();
                int i2 = -1;
                if (aVar instanceof C51571c) {
                    jSONObject.put("response_code", ((C51571c) aVar).getErrorCode());
                    i = 1;
                } else if (aVar instanceof C51573e) {
                    i = 2;
                } else if (aVar instanceof C51570b) {
                    i = 3;
                } else if (aVar instanceof C51572d) {
                    i = 4;
                } else if (aVar instanceof C7197c) {
                    i = 5;
                    jSONObject.put("downloader_error_code", ((C7197c) aVar).getErrorCode());
                } else {
                    i = -1;
                }
                long j2 = -1;
                if (aVar.getResourceRequest() != null) {
                    j = aVar.getResourceRequest().f128819c;
                } else {
                    j = -1;
                }
                AssetsModel c = C7209f.m14962a("effects").mo13434c((long) ((int) aVar.getId()));
                if (c != null) {
                    i2 = c.getResourceType();
                    j2 = c.getSize();
                }
                jSONObject.put("gift_id", aVar.getId());
                jSONObject.put("gift_type", i2);
                jSONObject.put("size", j2);
                jSONObject.put("error_code", i);
                jSONObject.put("error_desc", aVar.toString());
                jSONObject.put("download_assets_from", j);
                new C8069h().mo14226a(jSONObject).mo14228a("hotsoon_live_gift_resource_download_rate", 1);
                HashMap hashMap = new HashMap(1);
                hashMap.put("info", jSONObject.toString());
                C8049c.m15979a().mo14202a("hotsoon_live_gift_resource_download_failed", hashMap, new Object[0]);
                if (aVar instanceof C7197c) {
                    i = ((C7197c) aVar).getErrorCode();
                }
                long id = aVar.getId();
                String aVar2 = aVar.toString();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("asset_id", Long.valueOf(id));
                hashMap2.put("asset_type", Integer.valueOf(i2));
                hashMap2.put("download_assets_from", Long.valueOf(j));
                hashMap2.put("error_code", Integer.valueOf(i));
                hashMap2.put("error_msg", aVar2);
                C3837e.m9743a(C7647s.m15643a("ttlive_gift_asset_download_status"), 1, (Map<String, Object>) hashMap2);
                C3837e.m9743a(C7647s.m15652b("ttlive_gift_asset_download_status"), 1, (Map<String, Object>) hashMap2);
                C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_gift_asset_download_status", 1, (Map) hashMap2);
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo13387a(long j, C51568c cVar) {
            long j2;
            int i;
            JSONObject jSONObject = new JSONObject();
            long j3 = -1;
            if (cVar != null) {
                j2 = cVar.f128819c;
            } else {
                j2 = -1;
            }
            AssetsModel c = C7209f.m14962a("effects").mo13434c((long) ((int) j));
            if (c != null) {
                int resourceType = c.getResourceType();
                long size = c.getSize();
                i = resourceType;
                j3 = size;
            } else {
                i = -1;
            }
            try {
                jSONObject.put("gift_id", j);
                jSONObject.put("gift_type", i);
                jSONObject.put("size", j3);
                jSONObject.put("download_assets_from", j2);
            } catch (JSONException unused) {
            }
            new C8069h().mo14226a(jSONObject).mo14228a("hotsoon_live_gift_resource_download_rate", 0);
            C4495a.m10823a().mo10301a((Object) new C7520p(j));
            HashMap hashMap = new HashMap(1);
            hashMap.put("resource_id", String.valueOf(j));
            C8049c.m15979a().mo14202a("hotsoon_live_gift_resource_download_success", hashMap, new Object[0]);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("asset_id", Long.valueOf(j));
            hashMap2.put("asset_type", Integer.valueOf(i));
            hashMap2.put("download_assets_from", Long.valueOf(j2));
            C3837e.m9743a(C7647s.m15643a("ttlive_gift_asset_download_status"), 0, (Map<String, Object>) hashMap2);
        }
    };
    private final HashMap<Integer, Integer> mGiftListStrategyMaps = new HashMap<>();
    private List<C7631c> mGiftRelayInfoList;
    private Map<Integer, C7508g> mGiftsMap = new HashMap();
    private SparseArray<C0785g<C7505d>> mGiftsMapByFind = new SparseArray<>();
    private final List<C7507f> mGroupCountInfo = new ArrayList();
    private boolean mHasNewGift = false;
    public C0198r<Boolean> mHideBottomBar = new C0198r<>();
    private List<Long> mHonorLevelIds = new ArrayList();
    private long mNewGiftId = -1;
    private String mNewGiftTip = "";
    private List<Long> mNobleIds = new ArrayList();
    private long mXgCoinCache;
    private C7505d temporaryFastGift;

    @FunctionalInterface
    /* renamed from: com.bytedance.android.livesdk.gift.GiftManager$a */
    public interface C7190a {
        /* renamed from: a */
        void mo13389a(long j);
    }

    static final /* synthetic */ void lambda$loadLocal$6$GiftManager(Throwable th) throws Exception {
    }

    public long getXgCoinCache() {
        return this.mXgCoinCache;
    }

    public List<C7507f> getGroupCountInfo() {
        return new ArrayList(this.mGroupCountInfo);
    }

    public boolean isTemporaryFastGiftPresent() {
        if (this.temporaryFastGift != null) {
            return true;
        }
        return false;
    }

    public C7505d getFastGift() {
        if (this.temporaryFastGift != null) {
            return this.temporaryFastGift;
        }
        return this.mFastGift;
    }

    public String getNewGiftTip() {
        if (!this.mHasNewGift) {
            return null;
        }
        this.mHasNewGift = false;
        this.mNewGiftId = -1;
        return this.mNewGiftTip;
    }

    public static synchronized GiftManager inst() {
        GiftManager giftManager;
        synchronized (GiftManager.class) {
            if (sInst == null) {
                sInst = new GiftManager();
            }
            giftManager = sInst;
        }
        return giftManager;
    }

    public List<DoodleTemplate> getDoodleTemplates() {
        if (this.mDoodleTemplates == null || this.mDoodleTemplates.isEmpty()) {
            return new ArrayList();
        }
        return new ArrayList(this.mDoodleTemplates);
    }

    private void loadLocal() {
        C7484i iVar = new C7484i(this);
        C1663a aVar = C1663a.BUFFER;
        C1745b.m6050a(iVar, "source is null");
        C1745b.m6050a(aVar, "mode is null");
        C2150a.m6483a((C2149h<T>) new C1799b<T>(iVar, aVar)).mo6452b(C2168a.m6521b()).mo6443a(C1667a.m5940a()).mo6452b(C2168a.m6521b()).mo6438a((C1710e<? super T>) new C7485j<Object>(this), C7486k.f20501a);
    }

    public int getCurrentStrategyByLiveType() {
        int i;
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        Integer num = (Integer) this.mGiftListStrategyMaps.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public List<C7505d> getGiftList() {
        int i;
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        C7508g gVar = (C7508g) this.mGiftsMap.get(Integer.valueOf(i));
        if (gVar == null || C9414h.m18630a(gVar.f20574a)) {
            return new ArrayList();
        }
        return new ArrayList(gVar.f20574a);
    }

    public List<GiftPage> getGiftPageList() {
        int i;
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        C7508g gVar = (C7508g) this.mGiftsMap.get(Integer.valueOf(i));
        if (gVar == null || C9414h.m18630a(gVar.f20576c)) {
            return new ArrayList();
        }
        return new ArrayList(gVar.f20576c);
    }

    public boolean hideBottomBar() {
        int i;
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        C7508g gVar = (C7508g) this.mGiftsMap.get(Integer.valueOf(i));
        if (gVar != null) {
            return gVar.f20575b.f20597j;
        }
        return false;
    }

    public boolean isGiftListLoaded() {
        int currentStrategyByLiveType = getCurrentStrategyByLiveType();
        if (currentStrategyByLiveType == 0) {
            List giftList = getGiftList();
            if (giftList == null || giftList.isEmpty()) {
                return false;
            }
            return true;
        } else if (currentStrategyByLiveType != 1) {
            return false;
        } else {
            List giftPageList = getGiftPageList();
            if (giftPageList == null || giftPageList.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    public C7505d getRedEnvelopeGift() {
        List<C7505d> arrayList = new ArrayList<>();
        int currentStrategyByLiveType = getCurrentStrategyByLiveType();
        if (currentStrategyByLiveType == 0) {
            arrayList = getGiftList();
        } else if (currentStrategyByLiveType == 1) {
            List<GiftPage> giftPageList = getGiftPageList();
            if (giftPageList != null) {
                for (GiftPage giftPage : giftPageList) {
                    arrayList.addAll(giftPage.gifts);
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        for (C7505d dVar : arrayList) {
            if (dVar != null && 3 == dVar.f20544e) {
                return dVar;
            }
        }
        return null;
    }

    public List<C7505d> getStickerGifts() {
        ArrayList arrayList = new ArrayList();
        List<C7505d> arrayList2 = new ArrayList<>();
        int currentStrategyByLiveType = getCurrentStrategyByLiveType();
        if (currentStrategyByLiveType == 0) {
            arrayList2 = getGiftList();
        } else if (currentStrategyByLiveType == 1) {
            List<GiftPage> giftPageList = getGiftPageList();
            if (giftPageList != null) {
                for (GiftPage giftPage : giftPageList) {
                    arrayList2.addAll(giftPage.gifts);
                }
            }
        }
        for (C7505d dVar : arrayList2) {
            if (dVar.f20544e == 4) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    private GiftManager() {
        ((IHostApp) C4116c.m10249a(IHostApp.class)).initImageLib();
        loadLocal();
        try {
            ((IGiftService) C4116c.m10249a(IGiftService.class)).initGiftResourceManager(C3922z.m9915e());
        } catch (Exception unused) {
        }
        C51588f a = C51588f.m110738a();
        C51560b bVar = this.mGetResourceListener;
        if (bVar != null && !a.f128858d.contains(bVar)) {
            a.f128858d.add(bVar);
        }
    }

    public List<C7505d> filterFansClubGifts(Collection<? extends C7505d> collection) {
        return filterGiftsForType(collection, this.mFansClubIds);
    }

    public List<C7505d> filterNobleGifts(Collection<? extends C7505d> collection) {
        return filterGiftsForType(collection, this.mNobleIds);
    }

    public void syncGiftList(int i) {
        syncGiftList(null, 0, i, false);
    }

    public static void filterNotDisplayedOnPanel(Collection<? extends C7505d> collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((C7505d) it.next()).f20556q) {
                it.remove();
            }
        }
    }

    private C4526c<String> getPropertyByLiveType(int i) {
        StringBuilder sb = new StringBuilder("gift_list_response_");
        sb.append(i);
        return new C4526c<>(sb.toString(), "");
    }

    static final /* synthetic */ void lambda$syncXgCoin$3$GiftManager(Throwable th) throws Exception {
        Exception exc = new Exception(th);
        StringBuilder sb = new StringBuilder("sync xg coin error! ");
        sb.append(exc.getMessage());
        C3831a.m9716d("GIFT_MANAGER", sb.toString());
    }

    public C7631c getGiftRelayInfo(long j) {
        if (this.mGiftRelayInfoList != null) {
            for (C7631c cVar : this.mGiftRelayInfoList) {
                if (cVar.f20985c == j) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public void removeTemporaryFastGift(long j) {
        if (this.temporaryFastGift != null && this.temporaryFastGift.f20543d == j) {
            this.temporaryFastGift = null;
        }
        C4495a.m10823a().mo10301a((Object) new C5190j(this.mFastGift, 1));
    }

    public List<C7505d> filterHonorLevelGifts(Collection<? extends C7505d> collection) {
        List<C7505d> filterGiftsForType = filterGiftsForType(collection, this.mHonorLevelIds);
        ArrayList arrayList = new ArrayList();
        for (Long longValue : this.mHonorLevelIds) {
            long longValue2 = longValue.longValue();
            for (C7505d dVar : filterGiftsForType) {
                if (dVar.f20543d == longValue2) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    public String findGameGiftRuleUrl(long j) {
        if (this.mGameGiftItemList == null) {
            return null;
        }
        for (C7504c cVar : this.mGameGiftItemList) {
            if (cVar != null && cVar.f20530a == j) {
                return cVar.f20531b;
            }
        }
        return null;
    }

    public C7505d findGiftById(long j) {
        int i;
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        C0785g gVar = (C0785g) this.mGiftsMapByFind.get(i);
        if (gVar == null) {
            return null;
        }
        return (C7505d) gVar.mo2487a(j);
    }

    public void syncXgCoin(C7190a aVar) {
        if (aVar != null) {
            ((C4585b) ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).syncXgCoin().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10390a(3).mo6505a((C1710e<? super T>) new C7450g<Object>(this, aVar), C7458h.f20436a);
        }
    }

    public C4121b getGiftType(C7505d dVar) {
        if (dVar == null) {
            return C4121b.UNKNOWN;
        }
        if (dVar.f20544e == 10) {
            return C4121b.GOLDEN_BEAN_CELL;
        }
        if (dVar.f20544e == 9) {
            return C4121b.FREE_CELL;
        }
        if (dVar.f20544e == 1) {
            return C4121b.NORMAL_GIFT;
        }
        if (dVar.f20544e == 5) {
            return C4121b.TASK_GIFT;
        }
        if (dVar.f20544e == 4) {
            return C4121b.STICKER_GIFT;
        }
        if (dVar.f20544e == 8) {
            return C4121b.MIDDLE_GIFT;
        }
        if (dVar.f20544e == 2) {
            return C4121b.SPECIAL_GIFT;
        }
        if (dVar.f20544e == 11) {
            return C4121b.GAME;
        }
        return C4121b.UNKNOWN;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$loadLocal$4$GiftManager(C2158j jVar) throws Exception {
        Set<String> set = (Set) C4525b.f12384b.mo10345a();
        HashMap hashMap = new HashMap(4);
        for (String valueOf : set) {
            int intValue = Integer.valueOf(valueOf).intValue();
            String str = (String) getPropertyByLiveType(intValue).mo10345a();
            if (!C9431p.m18664a(str)) {
                hashMap.put(Integer.valueOf(intValue), (C7508g) this.gson.mo34884a(str, C7508g.class));
            }
        }
        jVar.mo6282a(hashMap);
        jVar.mo6273a();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$loadLocal$5$GiftManager(Map map) throws Exception {
        if (map != null && !map.isEmpty()) {
            for (Integer num : map.keySet()) {
                C7508g gVar = (C7508g) map.get(num);
                if (gVar != null) {
                    this.mGiftListStrategyMaps.put(num, Integer.valueOf(C9414h.m18630a(gVar.f20576c) ^ true ? 1 : 0));
                    addGiftMap(gVar, num.intValue());
                }
            }
            updateGiftsInfo((C7508g) this.mGiftsMap.get(Integer.valueOf(0)), false);
        }
    }

    public void setTemporaryFastGift(long j) {
        List giftPageList = getGiftPageList();
        if (!C9414h.m18630a(giftPageList)) {
            GiftPage giftPage = null;
            Iterator it = giftPageList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GiftPage giftPage2 = (GiftPage) it.next();
                if (giftPage2.pageType == 1) {
                    giftPage = giftPage2;
                    break;
                }
            }
            if (giftPage != null) {
                List<C7505d> list = giftPage.gifts;
                if (!C9414h.m18630a(list)) {
                    for (C7505d dVar : new ArrayList(list)) {
                        if (dVar.f20543d == j) {
                            this.temporaryFastGift = dVar;
                            C4495a.m10823a().mo10301a((Object) new C5190j(dVar, 1));
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void filterInteractNotSupportGift(Collection<? extends C7505d> collection, boolean z) {
        filterNotSupportGift(collection, z);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((C7505d) it.next()).f20550k) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$syncXgCoin$2$GiftManager(C7190a aVar, C4177d dVar) throws Exception {
        if (dVar != null && dVar.data != null) {
            this.mXgCoinCache = ((C7516o) dVar.data).f20638a;
            aVar.mo13389a(this.mXgCoinCache);
        }
    }

    private static List<C7505d> filterGiftsForType(Collection<? extends C7505d> collection, List<Long> list) {
        if (collection == null || collection.isEmpty() || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C7505d dVar : collection) {
            if (list.contains(Long.valueOf(dVar.f20543d))) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public boolean canSendHonorGift(User user, C7505d dVar) {
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c() || dVar == null || user == null || user.getUserHonor() == null || ((long) user.getUserHonor().mo8159n()) < dVar.f20563x) {
            return false;
        }
        return true;
    }

    public boolean canSendNobleGift(User user, C7505d dVar) {
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c() || dVar == null || user == null || user.getNobleLevelInfo() == null || user.getNobleLevelInfo().getNobleLevel() < dVar.f20532A) {
            return false;
        }
        return true;
    }

    public void getGiftIconBitmap(long j, C8797c cVar) {
        C7505d findGiftById = findGiftById(j);
        if (findGiftById == null && cVar != null) {
            C8795a aVar = new C8795a();
            StringBuilder sb = new StringBuilder("can't find gift by id: ");
            sb.append(j);
            aVar.f24035a = new Throwable(sb.toString());
            cVar.mo9146a(aVar);
        }
        ((C8794c) C4116c.m10249a(C8794c.class)).mo15490a(findGiftById.f20541b, cVar);
    }

    private void addGiftMap(C7508g gVar, int i) {
        if (gVar != null) {
            this.mGiftsMap.put(Integer.valueOf(i), gVar);
            C0785g gVar2 = (C0785g) this.mGiftsMapByFind.get(i);
            if (gVar2 != null) {
                gVar2.mo2495c();
            } else {
                gVar2 = new C0785g();
                this.mGiftsMapByFind.append(i, gVar2);
            }
            List<C7505d> arrayList = new ArrayList<>();
            int currentStrategyByLiveType = getCurrentStrategyByLiveType();
            if (currentStrategyByLiveType == 0 && !C9414h.m18630a(gVar.f20574a)) {
                arrayList = gVar.f20574a;
            } else if (currentStrategyByLiveType == 1 && !C9414h.m18630a(gVar.f20576c)) {
                List<GiftPage> list = gVar.f20576c;
                if (list != null) {
                    for (GiftPage giftPage : list) {
                        arrayList.addAll(giftPage.gifts);
                    }
                }
            }
            for (C7505d dVar : arrayList) {
                gVar2.mo2497c(dVar.f20543d, dVar);
            }
        }
    }

    public static void filterNotSupportGift(Collection<? extends C7505d> collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C7505d dVar = (C7505d) it.next();
            if (dVar.f20543d == 998) {
                it.remove();
            } else if ((dVar.f20544e == 2 || dVar.f20544e == 8 || dVar.f20544e == 11) && !C7209f.m14962a("effects").mo13431a(dVar.f20558s)) {
                it.remove();
            } else if (dVar.f20544e == 4 && z && !C7209f.m14962a("effects").mo13431a(dVar.f20558s)) {
                it.remove();
            }
        }
    }

    private void notifyFastGiftModule(long j, boolean z) {
        if (0 == j) {
            this.mFastGift = null;
            C4495a.m10823a().mo10301a((Object) new C5190j(null));
            return;
        }
        List arrayList = new ArrayList();
        int currentStrategyByLiveType = getCurrentStrategyByLiveType();
        if (currentStrategyByLiveType == 0) {
            arrayList = getGiftList();
        } else if (currentStrategyByLiveType == 1) {
            List<GiftPage> giftPageList = getGiftPageList();
            if (giftPageList != null) {
                for (GiftPage giftPage : giftPageList) {
                    arrayList.addAll(giftPage.gifts);
                }
            }
        }
        ArrayList<C7505d> arrayList2 = new ArrayList<>(arrayList);
        filterNotSupportGift(arrayList2, z);
        for (C7505d dVar : arrayList2) {
            if (dVar.f20543d == j) {
                this.mFastGift = dVar;
                C4495a.m10823a().mo10301a((Object) new C5190j(dVar));
                return;
            }
        }
    }

    private void updateGiftsInfo(C7508g gVar, boolean z) {
        if (gVar != null) {
            C7511j jVar = gVar.f20575b;
            if (jVar != null) {
                this.mGiftRelayInfoList = jVar.f20593f;
                this.mGameGiftItemList = jVar.f20594g;
                this.mDoodleTemplates = gVar.f20577d;
                if (jVar.f20591d > 0 && !TextUtils.isEmpty(jVar.f20592e)) {
                    updateNewGiftTip(gVar.f20574a, jVar.f20591d, jVar.f20592e);
                }
                notifyFastGiftModule(jVar.f20588a, z);
                if (jVar.f20589b != null) {
                    this.mGroupCountInfo.clear();
                    this.mGroupCountInfo.addAll(jVar.f20589b);
                }
                if (jVar.f20590c != null) {
                    this.mFansClubIds = jVar.f20590c;
                }
                if (jVar.f20595h != null) {
                    this.mHonorLevelIds = jVar.f20595h;
                }
                if (jVar.f20596i != null) {
                    this.mNobleIds = jVar.f20596i;
                }
            }
        }
    }

    static final /* synthetic */ void lambda$syncGiftList$1$GiftManager(boolean z, WeakReference weakReference, Throwable th) throws Exception {
        Exception exc = new Exception(th);
        StringBuilder sb = new StringBuilder("syncgiftlist error! ");
        sb.append(exc.getMessage());
        C3831a.m9716d("GIFT_MANAGER", sb.toString());
        if (z) {
            C7647s.m15655c(exc.getMessage());
        }
        if (weakReference.get() != null) {
            ((C4128f) weakReference.get()).mo9498a();
        }
    }

    private void updateNewGiftTip(List<C7505d> list, long j, String str) {
        C7505d dVar;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            dVar = (C7505d) it.next();
            if (dVar.f20543d == j) {
                break;
            }
        }
        if (dVar != null) {
            this.mNewGiftId = j;
            this.mNewGiftTip = str;
            if (((Long) C4525b.f12309E.mo10345a()).longValue() == this.mNewGiftId) {
                this.mHasNewGift = false;
            } else {
                this.mHasNewGift = true;
            }
        }
    }

    private void onSyncGiftListSuccess(C7508g gVar, boolean z, C4128f fVar) {
        int i;
        if (gVar == null) {
            if (fVar != null) {
                fVar.mo8456a(new ArrayList());
            }
            return;
        }
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        int i2 = 0;
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        addGiftMap(gVar, i);
        List<C7505d> list = gVar.f20574a;
        List<GiftPage> list2 = gVar.f20576c;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            if (list2 == null || list2.isEmpty()) {
                z2 = false;
            } else {
                i2 = 1;
            }
        }
        this.mGiftListStrategyMaps.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (z2) {
            getPropertyByLiveType(i).mo10346a(this.gson.mo34889b(gVar));
            Set set = (Set) C4525b.f12384b.mo10345a();
            set.add(String.valueOf(i));
            C4525b.f12384b.mo10346a(set);
        }
        if (fVar != null) {
            if (i2 == 0) {
                fVar.mo8456a(list);
            } else {
                fVar.mo8457b(list2);
            }
        }
        updateGiftsInfo(gVar, z);
    }

    public boolean canSendFansClubGift(User user, User user2, C7505d dVar) {
        boolean z = false;
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            return false;
        }
        if (!(user == null || user2 == null || dVar == null || !dVar.f20564y || dVar.f20565z == null)) {
            user.getId();
            FansClubMember fansClub = user2.getFansClub();
            if (fansClub != null) {
                FansClubData data = fansClub.getData();
                if (FansClubData.isValid(data) && data.userFansClubStatus > 0 && data.level >= dVar.f20565z.f20586a) {
                    z = true;
                }
            }
        }
        return z;
    }

    public void sendGiftInternal(long j, int i, C4126d dVar) {
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null && currentRoom.getOwner() != null) {
            User owner = currentRoom.getOwner();
            long id = currentRoom.getId();
            long uptimeMillis = SystemClock.uptimeMillis();
            C2201v a = ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).send(j, currentRoom.getId(), owner.getId(), i).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
            C7487l lVar = new C7487l(dVar, id, owner, j, uptimeMillis);
            C7488m mVar = new C7488m(dVar, j, id);
            a.mo6505a((C1710e<? super T>) lVar, (C1710e<? super Throwable>) mVar);
        }
    }

    static final /* synthetic */ void lambda$sendGiftInternal$8$GiftManager(C4126d dVar, long j, long j2, Throwable th) throws Exception {
        if (dVar != null) {
            dVar.mo9497a(th);
        }
        C7647s.m15649a(j, j2, th);
    }

    public void syncGiftList(C4128f fVar, long j, int i, boolean z) {
        boolean z2;
        if (C7518n.m15508a(C3922z.m9915e())) {
            this.mAssetsManager.mo13427a(i, z);
            WeakReference weakReference = new WeakReference(fVar);
            if (j != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            C4585b bVar = (C4585b) ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).syncGiftList(String.valueOf(j), i).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a());
            C2201v a = C2150a.m6486a((C2201v<T>) new C1934aq<T>(bVar.f12552a, new C4061i(3, 500)));
            C7304e eVar = new C7304e(this, z, weakReference, uptimeMillis, z2);
            a.mo6505a((C1710e<? super T>) eVar, (C1710e<? super Throwable>) new C7448f<Object>(z2, weakReference));
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$syncGiftList$0$GiftManager(boolean z, WeakReference weakReference, long j, boolean z2, C4177d dVar) throws Exception {
        String str;
        if (dVar == null || dVar.data == null) {
            if (z2) {
                if (dVar == null) {
                    str = "response is empty";
                } else {
                    str = "response.data is empty";
                }
                C7647s.m15655c(str);
            }
            return;
        }
        this.mHideBottomBar.setValue(Boolean.valueOf(((C7508g) dVar.data).f20575b.f20597j));
        onSyncGiftListSuccess((C7508g) dVar.data, z, (C4128f) weakReference.get());
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (z2) {
            C3837e.m9740a(C7647s.m15643a("ttlive_gift_list_status"), 0, uptimeMillis);
        }
    }

    static final /* synthetic */ void lambda$sendGiftInternal$7$GiftManager(C4126d dVar, long j, User user, long j2, long j3, C4177d dVar2) throws Exception {
        if (dVar2 != null) {
            C7514m mVar = (C7514m) dVar2.data;
            if (dVar != null) {
                dVar.mo9496a(mVar);
            }
            for (C7810ao insertMessage : C7519o.m15515b(j, mVar, user, User.from(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a()))) {
                ((C4193l) C4116c.m10249a(C4193l.class)).messageManagerHelper().mo9628a().insertMessage(insertMessage);
            }
            C7647s.m15648a(j2, j, SystemClock.uptimeMillis() - j3);
        }
    }
}
