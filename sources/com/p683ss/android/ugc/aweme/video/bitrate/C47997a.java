package com.p683ss.android.ugc.aweme.video.bitrate;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9873b;
import com.bytedance.ttnet.C13303d;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18911h;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.feed.model.BitRate;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.C48065m;
import com.p683ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.C48529b;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48528f;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48534c;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48534c.C48537b;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48538d.C48541b;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48542e;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import com.p683ss.android.ugc.playerkit.session.Session;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.a */
public final class C47997a {

    /* renamed from: a */
    public static int f120634a = -1;

    /* renamed from: b */
    public static ConcurrentHashMap<String, Float> f120635b = new ConcurrentHashMap<>(50);

    /* renamed from: c */
    public static ConcurrentLinkedQueue<String> f120636c = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public static void m103837a(C48528f fVar, VideoUrlModel videoUrlModel) {
        try {
            C48529b bVar = fVar.f121969b;
            if (C48017a.m103961c() && !VideoBitRateABManager.m103801c().f120600b) {
                bVar = new C48529b(7, "gear config is not init");
            }
            if (bVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bitrate_not_match_code", bVar.getCode());
                jSONObject.put("bitrate_not_match_msg", bVar.getMessage());
                if (videoUrlModel != null) {
                    jSONObject.put("group_id", videoUrlModel.getSourceId());
                }
                C23131p.m57779a("video_bitrate_not_match", jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static Map<String, Object> m103836a(Context context, VideoUrlModel videoUrlModel, double d, C48542e eVar) {
        int i;
        int i2;
        if (!(eVar instanceof C48534c)) {
            return C48541b.m105007a().mo96037a((int) d).f121987a;
        }
        C48537b bVar = new C48537b();
        bVar.f121985a.put("video_duration", Integer.valueOf((int) (videoUrlModel.getDuration() / 1000.0d)));
        int i3 = (int) d;
        Map<String, Object> map = bVar.f121985a;
        String str = "internet_speed";
        int i4 = i3 / 8000;
        if (i4 < 0) {
            i4 = 0;
        }
        map.put(str, Integer.valueOf(i4));
        try {
            C9873b e = C13303d.m26803e();
            bVar.mo96026a(e.f26868a).mo96029b(e.f26870c).mo96031c(e.f26869b);
        } catch (Exception unused) {
            bVar.mo96026a(0).mo96029b(0).mo96031c(0);
        }
        try {
            bVar.mo96033d(C48065m.m104081a(context).mo95336b(context));
        } catch (Exception unused2) {
            bVar.mo96033d((int) DynamicTabYellowPointVersion.DEFAULT);
        }
        try {
            C18911h networkType = NetworkUtils.getNetworkType(context);
            if (networkType == null) {
                i2 = 0;
            } else {
                i2 = networkType.getValue();
            }
            bVar.f121985a.put("access", Integer.valueOf(i2));
            bVar.mo96035e(Integer.valueOf(NetworkUtils.getNetworkOperatorCode(context)).intValue());
        } catch (NumberFormatException unused3) {
            bVar.mo96035e(0);
        }
        List<Session> a = C50122a.m108112a().mo97898a(3, videoUrlModel.getUri());
        if (a.size() > 0) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ArrayList arrayList4 = new ArrayList(3);
            ArrayList arrayList5 = new ArrayList(3);
            for (Session session : a) {
                arrayList.add(Integer.valueOf((int) session.speed));
                arrayList2.add(Integer.valueOf(session.blockCnt));
                arrayList3.add(Integer.valueOf(session.blockTime));
                arrayList4.add(Integer.valueOf(session.bitrate));
                arrayList5.add(Integer.valueOf(session.playTime));
            }
            bVar.mo96027a((List<Integer>) arrayList).mo96030b((List<Integer>) arrayList2).mo96032c((List<Integer>) arrayList3).mo96034d((List<Integer>) arrayList4).mo96036e((List<Integer>) arrayList5);
        } else {
            bVar.mo96027a(Collections.emptyList()).mo96030b(Collections.emptyList()).mo96032c(Collections.emptyList()).mo96034d(Collections.emptyList()).mo96036e(Collections.emptyList());
        }
        ArrayList arrayList6 = new ArrayList();
        for (BitRate urlKey : videoUrlModel.getBitRate()) {
            long a2 = C48107j.m104193f().mo95408g().mo95340a(urlKey.getUrlKey()) / 1024;
            if (a2 > 0) {
                i = (int) a2;
            } else {
                i = 0;
            }
            arrayList6.add(Integer.valueOf(i));
        }
        bVar.f121985a.put("cache_size_list", arrayList6);
        return bVar.mo96028a();
    }
}
