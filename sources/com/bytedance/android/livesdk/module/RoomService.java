package com.bytedance.android.livesdk.module;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.live.room.C4191j;
import com.bytedance.android.live.room.C4192k;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.room.C4195n;
import com.bytedance.android.live.room.p254a.C4180a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.chatroom.p307c.C5037c;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdkapi.depend.live.C8638a;
import com.bytedance.android.livesdkapi.depend.live.C8646e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.p160b.C2831a.C2832a;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p094l.C2180b;

public class RoomService implements C4193l {
    private Room mCurRoom;
    private boolean mHasAddInteractObserve;
    private final C4641g<Integer> mInteractObserver = new C8023a(this);
    private final List<C8646e> mListeners = new ArrayList();
    private C4180a sCrossRoomGift;
    private C2180b<Long> watchLiveSubject;

    public Room getCurrentRoom() {
        return this.mCurRoom;
    }

    public boolean needHideShare(C3009i iVar) {
        return iVar == null ? false : false;
    }

    public C4191j messageManagerHelper() {
        return new C4191j() {
            /* renamed from: a */
            public final IMessageManager mo9628a() {
                return C4565af.m10958a();
            }
        };
    }

    public C4192k roomManager() {
        return C5014i.m11508a();
    }

    public C4195n toolbarManagerHelper() {
        return new C4195n() {
            /* renamed from: a */
            public final C6600d mo9645a() {
                return C6610k.m13985a();
            }

            /* renamed from: b */
            public final C6600d mo9646b() {
                return C6610k.m13987c();
            }
        };
    }

    private void addInteractObserve() {
        TTLiveSDKContext.getLiveService().mo15048b().mo15064a(this.mInteractObserver);
        this.mHasAddInteractObserve = true;
    }

    public C4180a getCrossRoomGift() {
        if (this.sCrossRoomGift == null) {
            return null;
        }
        C4180a aVar = this.sCrossRoomGift;
        C4180a aVar2 = new C4180a(aVar.f11379a, aVar.f11380b, aVar.f11381c);
        aVar2.f11382d = aVar.f11382d;
        this.sCrossRoomGift = null;
        return aVar2;
    }

    public C2180b<Long> getLiveWatchTime() {
        if (this.watchLiveSubject == null) {
            synchronized (this) {
                if (this.watchLiveSubject == null) {
                    this.watchLiveSubject = C2180b.m6534l();
                }
            }
        }
        return this.watchLiveSubject;
    }

    public List<Long> getLivingRoomIds() throws Exception {
        return ((C4176c) ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getLivingRoomIds().execute().f33552b).f11365b;
    }

    public boolean isInteracting() {
        int a = TTLiveSDKContext.getLiveService().mo15048b().mo15063a();
        if (a == 2 || a == 1) {
            return true;
        }
        return false;
    }

    public C4180a setCrossRoomGift(C4180a aVar) {
        this.sCrossRoomGift = aVar;
        return aVar;
    }

    public void setCurrentRoom(Room room) {
        this.mCurRoom = room;
    }

    public void removeInteractStateChangeListener(C8646e eVar) {
        this.mListeners.remove(eVar);
    }

    public void recordEnterStart(C8638a aVar) {
        TTLiveSDKContext.getLiveService().mo15041a(aVar.typeName);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$new$0$RoomService(Integer num) {
        boolean isInteracting = isInteracting();
        for (C8646e a : this.mListeners) {
            a.mo13338a(isInteracting);
        }
    }

    public void registerInteractStateChangeListener(C8646e eVar) {
        if (!this.mHasAddInteractObserve) {
            addInteractObserve();
        }
        if (!this.mListeners.contains(eVar)) {
            this.mListeners.add(eVar);
        }
    }

    public String getLiveType(Room room) {
        if (room == null) {
            return "other";
        }
        if (room != null && room.isScreenshot) {
            return "game";
        }
        if (room != null && room.isThirdParty) {
            return "thirdparty";
        }
        if (room == null || !room.isLiveTypeAudio()) {
            return "video";
        }
        return "audio";
    }

    public Spannable parsePatternAndGetSpannable(C8851g gVar, String str) {
        return C5115z.m11756a(gVar, str);
    }

    public void cacheObj2Obj(C2832a aVar, C4189h hVar) {
        C5037c.f13472r.put(C5037c.m11522a((Object) aVar), C5037c.m11522a((Object) hVar));
    }

    public Spannable parsePatternAndGetSpannable(String str, C8851g gVar) {
        return C5115z.m11758a(str, gVar);
    }

    public void cacheEndTime(C4189h hVar, long j) {
        String a = C5037c.m11522a((Object) hVar);
        if (!TextUtils.isEmpty(a)) {
            C5037c.f13471q.put(a, Long.valueOf(j));
        }
    }
}
