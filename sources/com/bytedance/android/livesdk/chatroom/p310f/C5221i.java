package com.bytedance.android.livesdk.chatroom.p310f;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import com.airbnb.lottie.C2472h;
import com.bytedance.android.live.core.rxutils.C4063j;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.livebuild.C7769d;
import com.bytedance.android.livesdk.p279af.C4564ae;
import com.bytedance.android.livesdk.p279af.C4612u.C4617c;
import com.bytedance.android.livesdk.p279af.C4612u.C4619d;
import com.bytedance.android.livesdk.p398n.C8025a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryFinishing;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.live.C8661k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p064c.p065a.C1680ad;
import p064c.p065a.C1684ah;
import p064c.p065a.C1685ai;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p082e.C2065s;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.i */
public final class C5221i {

    /* renamed from: com.bytedance.android.livesdk.chatroom.f.i$a */
    public static final class C5222a<T, R> implements C1711f<T, C1685ai<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C5220h f13946a;

        public C5222a(C5220h hVar) {
            this.f13946a = hVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C4564ae aeVar = this.f13946a;
            C52711k.m112240b(str, "assetRoot");
            C52711k.m112240b(aeVar, "res");
            C1680ad b = C1680ad.m5958a((C1684ah<T>) new C4619d<T>(str, aeVar)).mo6155b(C2168a.m6521b());
            C52711k.m112236a((Object) b, "Single.create<LocalLotti…scribeOn(Schedulers.io())");
            return b;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.f.i$b */
    public static final class C5223b<T, R> implements C1711f<T, C1685ai<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ Context f13947a;

        public C5223b(Context context) {
            this.f13947a = context;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C8025a aVar = (C8025a) obj;
            C52711k.m112240b(aVar, "it");
            Context context = this.f13947a;
            C52711k.m112240b(aVar, "entity");
            C1680ad b = C1680ad.m5958a((C1684ah<T>) new C4617c<T>(context, aVar)).mo6155b(C2168a.m6521b());
            C52711k.m112236a((Object) b, "Single.create<LottieComp…scribeOn(Schedulers.io())");
            C1685ai a = C1680ad.m5961a(aVar);
            C1707b jVar = new C4063j();
            C1745b.m6050a(b, "source1 is null");
            C1745b.m6050a(a, "source2 is null");
            C1711f a2 = C1723a.m6034a(jVar);
            C1685ai[] aiVarArr = {b, a};
            C1745b.m6050a(a2, "zipper is null");
            C1745b.m6050a(aiVarArr, "sources is null");
            return C2150a.m6480a((C1680ad<T>) new C2065s<T>(aiVarArr, a2));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.f.i$c */
    public static final class C5224c extends C7769d {

        /* renamed from: a */
        final /* synthetic */ C8025a f13948a;

        public C5224c(C8025a aVar) {
            this.f13948a = aVar;
        }

        /* renamed from: a */
        public final Bitmap mo6732a(C2472h hVar) {
            Object obj;
            HashMap<String, Bitmap> hashMap = this.f13948a.f21964e;
            if (hVar != null) {
                obj = hVar.f7633d;
            } else {
                obj = null;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(obj);
            if (bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            return bitmap;
        }
    }

    /* renamed from: a */
    public static final Uri m11840a(Uri uri, ILotteryState iLotteryState) {
        Integer num;
        C52711k.m112240b(uri, "$this$appendLotteryParams");
        C52711k.m112240b(iLotteryState, "state");
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return uri;
        }
        String str = "url";
        Map map = null;
        if (uri == null) {
            uri = null;
        } else {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null) {
                Builder clearQuery = uri.buildUpon().clearQuery();
                for (String str2 : queryParameterNames) {
                    if (!str2.equals(str)) {
                        clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
                    }
                }
                uri = clearQuery.build();
            }
        }
        Builder buildUpon = uri.buildUpon();
        Builder buildUpon2 = Uri.parse(queryParameter).buildUpon();
        if (iLotteryState instanceof LotteryWaiting) {
            buildUpon2.appendQueryParameter("lottery_id", String.valueOf(((LotteryWaiting) iLotteryState).getLotteryId()));
        } else if (iLotteryState instanceof LotteryFinishing) {
            buildUpon2.appendQueryParameter("lottery_id", String.valueOf(((LotteryFinishing) iLotteryState).getLotteryId()));
        }
        C8661k c = TTLiveSDKContext.getLiveService().mo15050c();
        C52711k.m112236a((Object) c, "TTLiveSDKContext.getLiveService().roomService()");
        Room currentRoom = c.getCurrentRoom();
        if (currentRoom != null) {
            num = Integer.valueOf(currentRoom.getOrientation());
        } else {
            num = null;
        }
        if (num != null) {
            buildUpon2.appendQueryParameter("orientation", String.valueOf(num.intValue()));
        }
        C8038g a = C8049c.m15979a().mo14201a(Room.class);
        if (a != null) {
            map = a.mo14192a();
        }
        if (map != null) {
            String str3 = "log_pb";
            String str4 = (String) map.get("log_pb");
            if (str4 == null) {
                str4 = "";
            }
            buildUpon2.appendQueryParameter(str3, str4);
            String str5 = "request_id";
            String str6 = (String) map.get("request_id");
            if (str6 == null) {
                str6 = "";
            }
            buildUpon2.appendQueryParameter(str5, str6);
        }
        buildUpon.appendQueryParameter("url", buildUpon2.build().toString());
        Uri build = buildUpon.build();
        C52711k.m112236a((Object) build, "UriUtils.removeQueryPara…String()) }\n    }.build()");
        return build;
    }
}
