package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.C5719aj;
import com.bytedance.android.livesdk.chatroom.model.C5720ak;
import com.bytedance.android.livesdk.chatroom.model.C5722am;
import com.bytedance.android.livesdk.chatroom.model.C5726ao;
import com.bytedance.android.livesdk.chatroom.model.C5757m;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6566eq;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.viewmodel.C8424h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.C17971f;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aj */
public final class C4831aj extends C10779d<JSONObject, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aj$a */
    static final class C4832a extends C52712l implements C52682m<C8424h, Room, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C4831aj f13045a;

        /* renamed from: b */
        final /* synthetic */ Object f13046b;

        C4832a(C4831aj ajVar, Object obj) {
            this.f13045a = ajVar;
            this.f13046b = obj;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C5757m mVar;
            Object obj3;
            Object obj4;
            C8424h hVar = (C8424h) obj;
            Room room = (Room) obj2;
            Object obj5 = null;
            if (hVar != null) {
                mVar = hVar.f22872a;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                Object obj6 = this.f13046b;
                if (C52711k.m112239a(obj6, (Object) "dismissReward")) {
                    if (hVar.f22872a instanceof C5722am) {
                        hVar.mo14657a((C5757m) new C5719aj());
                        this.f13045a.finishWithSuccess();
                    }
                } else if (C52711k.m112239a(obj6, (Object) "getInviteInfo")) {
                    C5757m mVar2 = hVar.f22872a;
                    if (!(mVar2 instanceof C5720ak)) {
                        mVar2 = null;
                    }
                    C5720ak akVar = (C5720ak) mVar2;
                    if (akVar != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("anchor", C4831aj.m11372a(akVar.f15046e));
                        jSONObject.put("sugarDaddy", C4831aj.m11372a(akVar.f15045d));
                        jSONObject.put("inviteCountDown", String.valueOf(akVar.f15043b));
                        jSONObject.put("inviteCountDownStartTime", String.valueOf(akVar.f15042a));
                        jSONObject.put("inviteRoomId", String.valueOf(akVar.f15049h));
                        jSONObject.put("portalId", String.valueOf(akVar.f15048g));
                        this.f13045a.finishWithResult(jSONObject);
                        obj5 = C52860x.f131107a;
                    }
                    if (obj5 == null) {
                        this.f13045a.finishWithFailure();
                    }
                } else if (C52711k.m112239a(obj6, (Object) "getRewardInfo")) {
                    C5757m mVar3 = hVar.f22872a;
                    if (!(mVar3 instanceof C5726ao)) {
                        mVar3 = null;
                    }
                    C5726ao aoVar = (C5726ao) mVar3;
                    if (aoVar != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("anchor", C4831aj.m11372a(aoVar.f15075e));
                        jSONObject2.put("sugarDaddy", C4831aj.m11372a(aoVar.f15074d));
                        String str = "followStatus";
                        if (room != null) {
                            User owner = room.getOwner();
                            if (owner != null) {
                                FollowInfo followInfo = owner.getFollowInfo();
                                if (followInfo != null) {
                                    obj4 = Long.valueOf(followInfo.getFollowStatus());
                                    jSONObject2.put(str, obj4);
                                    jSONObject2.put("waitCountDown", String.valueOf(aoVar.f15072b));
                                    jSONObject2.put("waitCountDownStartTime", String.valueOf(aoVar.f15071a));
                                    jSONObject2.put("rewardCountDown", String.valueOf(aoVar.f15073c));
                                    jSONObject2.put("portalId", String.valueOf(aoVar.f15077g));
                                    this.f13045a.finishWithResult(jSONObject2);
                                    obj3 = C52860x.f131107a;
                                }
                            }
                        }
                        obj4 = null;
                        jSONObject2.put(str, obj4);
                        jSONObject2.put("waitCountDown", String.valueOf(aoVar.f15072b));
                        jSONObject2.put("waitCountDownStartTime", String.valueOf(aoVar.f15071a));
                        jSONObject2.put("rewardCountDown", String.valueOf(aoVar.f15073c));
                        jSONObject2.put("portalId", String.valueOf(aoVar.f15077g));
                        this.f13045a.finishWithResult(jSONObject2);
                        obj3 = C52860x.f131107a;
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        C5757m mVar4 = hVar.f22872a;
                        if (!(mVar4 instanceof C5722am)) {
                            mVar4 = null;
                        }
                        C5722am amVar = (C5722am) mVar4;
                        if (amVar != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("anchor", C4831aj.m11372a(amVar.f15057d));
                            jSONObject3.put("sugarDaddy", C4831aj.m11372a(amVar.f15056c));
                            String str2 = "followStatus";
                            if (room != null) {
                                User owner2 = room.getOwner();
                                if (owner2 != null) {
                                    FollowInfo followInfo2 = owner2.getFollowInfo();
                                    if (followInfo2 != null) {
                                        obj5 = Long.valueOf(followInfo2.getFollowStatus());
                                    }
                                }
                            }
                            jSONObject3.put(str2, obj5);
                            jSONObject3.put("rewardCountDown", String.valueOf(amVar.f15055b));
                            jSONObject3.put("rewardCountDownStartTime", String.valueOf(amVar.f15054a));
                            jSONObject3.put("portalId", String.valueOf(amVar.f15059f));
                            this.f13045a.finishWithResult(jSONObject3);
                            obj5 = C52860x.f131107a;
                        }
                    } else {
                        obj5 = obj3;
                    }
                    if (obj5 == null) {
                        this.f13045a.finishWithFailure();
                    }
                }
                return C52860x.f131107a;
            }
            this.f13045a.finishWithFailure();
            return C52860x.f131107a;
        }
    }

    public final void onTerminate() {
    }

    /* renamed from: a */
    public static JSONObject m11372a(User user) {
        return new JSONObject(new C17971f().mo34889b(user));
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) {
        JSONObject jSONObject = (JSONObject) obj;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(fVar, "context");
        Object opt = jSONObject.opt("type");
        if (opt == null) {
            finishWithFailure();
            return;
        }
        C4495a.m10823a().mo10301a((Object) new C6566eq(new C4832a(this, opt)));
    }
}
