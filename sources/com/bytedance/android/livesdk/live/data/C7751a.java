package com.bytedance.android.livesdk.live.data;

import android.util.Pair;
import com.bytedance.android.live.base.model.C2973f;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C18085o;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.live.data.a */
public final class C7751a {

    /* renamed from: com.bytedance.android.livesdk.live.data.a$a */
    public static final class C7752a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C7752a f21315a = new C7752a();

        C7752a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C4172a aVar = (C4172a) obj;
            C52711k.m112240b(aVar, "response");
            ArrayList arrayList = new ArrayList();
            List<T> list = aVar.f11365b;
            if (list != null) {
                arrayList.addAll(list);
            }
            return Pair.create(arrayList, aVar.f11366c);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.data.a$b */
    public static final class C7753b<T> implements C1710e<Pair<List<? extends FeedItem>, C2974a>> {

        /* renamed from: a */
        final /* synthetic */ C7751a f21316a;

        public C7753b(C7751a aVar) {
            this.f21316a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list;
            Pair pair = (Pair) obj;
            if (pair != null) {
                list = (List) pair.first;
            } else {
                list = null;
            }
            if (list != null && !((List) pair.first).isEmpty() && pair.second != null) {
                Object obj2 = pair.second;
                C52711k.m112236a(obj2, "pair.second");
                C18085o a = ((C2974a) obj2).mo7693a();
                if (a != null) {
                    Object obj3 = pair.first;
                    C52711k.m112236a(obj3, "pair.first");
                    for (FeedItem feedItem : (Iterable) obj3) {
                        feedItem.logPb = a.toString();
                        if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
                            C2973f fVar = feedItem.item;
                            if (fVar != null) {
                                Room room = (Room) fVar;
                                room.setLog_pb(feedItem.logPb);
                                User owner = room.getOwner();
                                if (owner != null) {
                                    owner.setLogPb(feedItem.logPb);
                                }
                                room.setRequestId(feedItem.resId);
                                room.isFromRecommendCard = feedItem.isRecommendCard;
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C2201v<C4177d<Object>> mo14100a(long j, long j2, String str, List<Long> list) {
        String str2;
        StringBuilder sb;
        C52711k.m112240b(str, "unreadExtra");
        C52711k.m112240b(list, "roomIds");
        RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class);
        if (list == null || list.isEmpty()) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb2.append(list.get(i).toString());
                boolean z = true;
                if (i >= list.size() - 1) {
                    z = false;
                }
                if (z) {
                    sb = sb2;
                } else {
                    sb = null;
                }
                if (sb != null) {
                    sb.append(",");
                }
            }
            str2 = sb2.toString();
            C52711k.m112236a((Object) str2, "builder.toString()");
        }
        C2201v<C4177d<Object>> collectUnreadRequest = roomRetrofitApi.collectUnreadRequest(j, j2, str, str2);
        C52711k.m112236a((Object) collectUnreadRequest, "LiveInternalService.inst…, getObjectsStr(roomIds))");
        return collectUnreadRequest;
    }
}
