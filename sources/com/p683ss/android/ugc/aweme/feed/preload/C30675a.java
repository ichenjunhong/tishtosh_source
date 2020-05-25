package com.p683ss.android.ugc.aweme.feed.preload;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.adapter.C30056b;
import com.p683ss.android.ugc.aweme.feed.experiment.C30223c;
import com.p683ss.android.ugc.aweme.feed.experiment.EnableSpeedMonitorExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.SmartPreoloadStrategyExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.SmartPreoloadStrategyV2Experiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.p1340am.C22572b;
import com.p683ss.android.ugc.aweme.p1963ml.C37120o;
import com.p683ss.android.ugc.aweme.video.C48065m;
import com.p683ss.android.ugc.aweme.video.C48070p;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.aweme.video.preload.experiment.H265PlayAddrPolicyUnifyExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.C48113a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.p2454f.C48918e;
import com.p683ss.android.ugc.p2454f.C48920f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.a */
public final class C30675a {

    /* renamed from: a */
    private boolean f80281a;

    /* renamed from: b */
    private PreloadStrategyConfig f80282b;

    /* renamed from: c */
    private String f80283c;

    /* renamed from: d */
    private boolean f80284d;

    /* renamed from: e */
    private boolean f80285e;

    /* renamed from: a */
    private static List<PreloadStrategyConfig> m71952a() {
        try {
            PreloadStrategyConfig[] preloadStrategyConfigArr = (PreloadStrategyConfig[]) C10181b.m20511a().mo18170a(SmartPreoloadStrategyExperiment.class, true, "smart_preload_strategy", 31744, PreloadStrategyConfig[].class);
            if (preloadStrategyConfigArr != null) {
                return Arrays.asList(preloadStrategyConfigArr);
            }
        } catch (Throwable unused) {
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private static void m71953a(String str) {
        if (C10181b.m20511a().mo18168a(EnableSpeedMonitorExperiment.class, true, "enable_speed_monitor", 31744, 0) == 1) {
            int f = C48918e.m105714f();
            String networkAccessType = NetworkUtils.getNetworkAccessType(C11010c.m22280a());
            int b = C48065m.m104081a(C11010c.m22280a()).mo95336b(C11010c.m22280a());
            C48920f[] d = C48918e.m105713a().mo96746d();
            if (d != null) {
                C30677c cVar = new C30677c(d, str, f, networkAccessType, b);
                C0013i.m18a((Callable<TResult>) cVar, (Executor) C26890h.m65003a());
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m71951a(C48920f[] fVarArr, String str, int i, String str2, int i2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int length = fVarArr.length - 1; length >= 0; length--) {
                C48920f fVar = fVarArr[length];
                if (fVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("file_size", fVar.f123082c);
                    jSONObject2.put("cost_time", fVar.f123083d);
                    if (length > 0) {
                        int i3 = length - 1;
                        if (fVarArr[i3] != null) {
                            jSONObject2.put("interval_time", fVar.f123084e - fVarArr[i3].f123084e);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject2.put("interval_time", 0);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("group_id", str);
            jSONObject.put("speed_record", jSONArray);
            jSONObject.put("internet_speed", i);
            jSONObject.put("strategy", 0);
            jSONObject.put("access", str2);
            jSONObject.put("signal", i2);
            jSONObject.put("qsize", C48918e.f123069c);
        } catch (Exception unused) {
        }
        C26890h.m65014b("video_speed_monitor", jSONObject);
        C22572b.m55734b("video_speed_monitor", jSONObject);
        return null;
    }

    /* renamed from: a */
    public final void mo63250a(boolean z, String str, long j, long j2, C30056b bVar, int i, boolean z2) {
        VideoUrlModel videoUrlModel;
        String sourceId;
        C48113a aVar;
        Aweme c = bVar.mo60285c(i);
        if (c != null && c.getVideo() != null) {
            Video video = c.getVideo();
            if (video != null) {
                if (C10181b.m20511a().mo18172a(H265PlayAddrPolicyUnifyExperiment.class, true, "h265_play_addr_policy_unify", 31744, true)) {
                    videoUrlModel = C48070p.m104093a(video);
                } else {
                    videoUrlModel = video.getProperPlayAddr();
                }
                if (videoUrlModel != null && !TextUtils.isEmpty(str)) {
                    if (!z) {
                        sourceId = videoUrlModel.getBitRatedRatioUri();
                    } else {
                        sourceId = videoUrlModel.getSourceId();
                    }
                    String str2 = sourceId;
                    if (TextUtils.equals(str, str2)) {
                        if (!TextUtils.equals(str2, this.f80283c)) {
                            this.f80285e = false;
                            this.f80284d = true;
                            this.f80283c = str2;
                            this.f80281a = false;
                            if (this.f80282b != null) {
                                this.f80282b.clearFlag();
                            }
                        } else {
                            this.f80284d = false;
                        }
                        if (j2 == j && !this.f80285e) {
                            this.f80285e = true;
                            m71953a(videoUrlModel.getSourceId());
                        }
                        if (this.f80284d) {
                            List a = m71952a();
                            if (a != null && a.size() > 0) {
                                long max = Math.max(((PreloadStrategyConfig) a.get(0)).getNetworkLower(), 0);
                                long min = Math.min(Math.max(max, (long) C48918e.m105714f()), Math.min(((PreloadStrategyConfig) a.get(a.size() - 1)).getNetworkUpper(), 25000));
                                Iterator it = a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    PreloadStrategyConfig preloadStrategyConfig = (PreloadStrategyConfig) it.next();
                                    if (preloadStrategyConfig != null && min >= preloadStrategyConfig.getNetworkLower() && min <= preloadStrategyConfig.getNetworkUpper()) {
                                        this.f80282b = preloadStrategyConfig;
                                        break;
                                    }
                                }
                            } else {
                                try {
                                    String c2 = C37120o.m83349a().mo76393c();
                                    try {
                                        aVar = (C48113a) C10181b.m20511a().mo18170a(SmartPreoloadStrategyV2Experiment.class, true, "smart_preload_strategy_v2", 31744, C48113a.class);
                                    } catch (Throwable unused) {
                                        aVar = null;
                                    }
                                    if (!TextUtils.isEmpty(c2) && aVar != null && aVar.f120922c != null && aVar.f120922c.length > 0) {
                                        PreloadStrategyConfig[] preloadStrategyConfigArr = aVar.f120922c;
                                        int i2 = aVar.f120920a;
                                        List<String> list = aVar.f120921b;
                                        if (list != null && list.size() > 0 && list.contains(c2) && list.indexOf(c2) < preloadStrategyConfigArr.length) {
                                            i2 = list.indexOf(c2);
                                        }
                                        this.f80282b = preloadStrategyConfigArr[i2];
                                    }
                                } catch (Throwable th) {
                                    C0013i.m16a((Callable<TResult>) new C30676b<TResult>(th));
                                    this.f80282b = null;
                                }
                            }
                        }
                        if (this.f80282b == null) {
                            this.f80282b = C30223c.m70963d();
                        }
                        List emptyList = Collections.emptyList();
                        for (PreloadTask preloadTask : this.f80282b.getTasks()) {
                            if (!preloadTask.alreadyPreload && 100 * j2 >= ((long) preloadTask.progress) * j) {
                                if (emptyList.isEmpty()) {
                                    emptyList = new ArrayList();
                                }
                                emptyList.add(preloadTask);
                                preloadTask.alreadyPreload = true;
                            }
                        }
                        if (!emptyList.isEmpty()) {
                            boolean z3 = z2;
                            C48107j.m104193f().mo95406a(z3, i, bVar.mo60286c(), emptyList);
                        }
                    }
                }
            }
        }
    }
}
