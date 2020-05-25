package com.p683ss.android.ugc.aweme.longvideo.p1934b;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.facebook.p987k.p988a.C14460b;
import com.google.gson.C17978g;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.BitRate;
import com.p683ss.android.ugc.aweme.feed.model.BitRate.ExcludeStrategy;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.feed.utils.C31189e;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43929l;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p683ss.android.ugc.aweme.video.p2394c.C48005c;
import com.p683ss.android.ugc.aweme.video.preload.C48075e;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.p2454f.C48918e;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.toutiao.proxyserver.C51895s;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.g */
public final class C36363g {

    /* renamed from: a */
    public static final C36364a f93076a = new C36364a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.g$a */
    public static final class C36364a {

        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.g$a$a */
        static final class C36365a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C50112d f93077a;

            /* renamed from: b */
            final /* synthetic */ Video f93078b;

            /* renamed from: c */
            final /* synthetic */ String f93079c;

            /* renamed from: d */
            final /* synthetic */ int f93080d;

            /* renamed from: e */
            final /* synthetic */ String f93081e;

            /* renamed from: f */
            final /* synthetic */ String f93082f;

            C36365a(C50112d dVar, Video video, String str, int i, String str2, String str3) {
                this.f93077a = dVar;
                this.f93078b = video;
                this.f93079c = str;
                this.f93080d = i;
                this.f93081e = str2;
                this.f93082f = str3;
            }

            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:52:? A[ExcHandler: JSONException (unused org.json.JSONException), SYNTHETIC, Splitter:B:33:0x0126] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "sourceId"
                    com.ss.android.ugc.playerkit.c.d r2 = r7.f93077a     // Catch:{  }
                    java.lang.String r2 = r2.f125523a     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "errorCode"
                    com.ss.android.ugc.playerkit.c.d r2 = r7.f93077a     // Catch:{  }
                    int r2 = r2.f125526d     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "errorExtra"
                    com.ss.android.ugc.playerkit.c.d r2 = r7.f93077a     // Catch:{  }
                    int r2 = r2.f125527e     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "netWorkQuality"
                    com.facebook.k.a.b r2 = com.facebook.p987k.p988a.C14460b.m29586a()     // Catch:{  }
                    java.lang.String r3 = "ConnectionClassManager.getInstance()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{  }
                    com.facebook.k.a.c r2 = r2.mo26625b()     // Catch:{  }
                    java.lang.String r2 = r2.toString()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "netWorkSpeed"
                    com.facebook.k.a.b r2 = com.facebook.p987k.p988a.C14460b.m29586a()     // Catch:{  }
                    java.lang.String r3 = "ConnectionClassManager.getInstance()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{  }
                    double r2 = r2.mo26626c()     // Catch:{  }
                    int r2 = (int) r2     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "playUrl"
                    com.ss.android.ugc.aweme.feed.model.Video r2 = r7.f93078b     // Catch:{  }
                    com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getProperPlayAddr()     // Catch:{  }
                    java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r2)     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "playUrlIsLowBr"
                    com.ss.android.ugc.aweme.feed.model.Video r2 = r7.f93078b     // Catch:{  }
                    boolean r2 = r2.isLowBr()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    com.p683ss.android.ugc.aweme.video.p2394c.C48005c.m103856a(r0)     // Catch:{  }
                    com.ss.android.ugc.playerkit.c.d r1 = r7.f93077a     // Catch:{  }
                    java.lang.Object r1 = r1.f125528f     // Catch:{  }
                    if (r1 == 0) goto L_0x0079
                    java.lang.String r1 = "extraInfo"
                    com.ss.android.ugc.playerkit.c.d r2 = r7.f93077a     // Catch:{  }
                    java.lang.Object r2 = r2.f125528f     // Catch:{  }
                    java.lang.String r2 = r2.toString()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                L_0x0079:
                    java.io.File r1 = com.p683ss.android.ugc.aweme.video.C48016e.m103940b()     // Catch:{  }
                    java.lang.String r2 = "cache"
                    java.io.File r1 = com.p683ss.android.ugc.aweme.video.C48016e.m103933a(r1, r2)     // Catch:{  }
                    java.lang.String r2 = ""
                    com.ss.android.ugc.aweme.feed.model.Video r3 = r7.f93078b     // Catch:{  }
                    com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r3.getProperPlayAddr()     // Catch:{  }
                    if (r3 == 0) goto L_0x0096
                    java.lang.String r2 = r3.getBitRatedRatioUri()     // Catch:{  }
                    java.lang.String r3 = "urlModel.bitRatedRatioUri"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{  }
                L_0x0096:
                    r3 = r2
                    java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{  }
                    boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{  }
                    if (r3 == 0) goto L_0x00a2
                    java.lang.String r2 = ""
                    goto L_0x00a6
                L_0x00a2:
                    java.lang.String r2 = com.toutiao.proxyserver.p2614f.C51835a.m111161a(r2)     // Catch:{  }
                L_0x00a6:
                    java.lang.String r3 = "file"
                    if (r1 != 0) goto L_0x00ad
                    java.lang.String r1 = ""
                    goto L_0x00d5
                L_0x00ad:
                    com.ss.android.ugc.aweme.shortvideo.k.l r4 = new com.ss.android.ugc.aweme.shortvideo.k.l     // Catch:{  }
                    java.lang.String r5 = "file"
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{  }
                    r6.<init>()     // Catch:{  }
                    java.lang.String r1 = r1.getPath()     // Catch:{  }
                    r6.append(r1)     // Catch:{  }
                    java.lang.String r1 = "/"
                    r6.append(r1)     // Catch:{  }
                    r6.append(r2)     // Catch:{  }
                    java.lang.String r1 = r6.toString()     // Catch:{  }
                    r4.<init>(r5, r1)     // Catch:{  }
                    java.lang.String r1 = r4.toString()     // Catch:{  }
                    java.lang.String r2 = "FileInfo(\"file\",\n       …  + \"/\" + md5).toString()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{  }
                L_0x00d5:
                    r0.put(r3, r1)     // Catch:{  }
                    java.lang.String r1 = "play_sdcard_writable"
                    boolean r2 = com.p683ss.android.ugc.aweme.video.C48016e.m103957g()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "play_network_available"
                    com.ss.android.ugc.aweme.base.utils.g r2 = com.p683ss.android.ugc.aweme.base.utils.C23718g.m58207b()     // Catch:{  }
                    java.lang.String r3 = "NetworkStateManager.getInstance()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{  }
                    boolean r2 = r2.mo49153d()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "play_free_space"
                    long r2 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103305a()     // Catch:{ Exception -> 0x0105 }
                    r0.put(r1, r2)     // Catch:{ Exception -> 0x0105 }
                    java.lang.String r1 = "play_all_space"
                    long r2 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103313b()     // Catch:{ Exception -> 0x0105 }
                    r0.put(r1, r2)     // Catch:{ Exception -> 0x0105 }
                L_0x0105:
                    java.lang.String r1 = "play_diskcache"
                    com.toutiao.proxyserver.g r2 = com.toutiao.proxyserver.C51895s.m111283f()     // Catch:{  }
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L_0x0111
                    r2 = 0
                    goto L_0x0112
                L_0x0111:
                    r2 = 1
                L_0x0112:
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "play_diskLruCache"
                    com.toutiao.proxyserver.h r2 = com.toutiao.proxyserver.C51895s.m111282e()     // Catch:{  }
                    if (r2 != 0) goto L_0x011e
                    goto L_0x011f
                L_0x011e:
                    r3 = 1
                L_0x011f:
                    r0.put(r1, r3)     // Catch:{  }
                    java.lang.Class<com.toutiao.proxyserver.t> r1 = com.toutiao.proxyserver.C51897t.class
                    java.lang.String r2 = "e"
                    java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r1 == 0) goto L_0x0174
                    r1.setAccessible(r4)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    r2 = 0
                    java.lang.Object r1 = r1.get(r2)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r1 == 0) goto L_0x016b
                    com.toutiao.proxyserver.t r1 = (com.toutiao.proxyserver.C51897t) r1     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r1 == 0) goto L_0x0174
                    java.lang.Class<com.toutiao.proxyserver.t> r3 = com.toutiao.proxyserver.C51897t.class
                    java.lang.String r5 = "c"
                    java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r3 == 0) goto L_0x0174
                    r3.setAccessible(r4)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.Object r1 = r3.get(r1)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r1 == 0) goto L_0x0163
                    java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.String r3 = "proxyserver_state"
                    if (r1 == 0) goto L_0x015b
                    int r1 = r1.intValue()     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                L_0x015b:
                    int r1 = r2.intValue()     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    r0.put(r3, r1)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    goto L_0x0174
                L_0x0163:
                    d.u r1 = new d.u     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.String r2 = "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicInteger"
                    r1.<init>(r2)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    throw r1     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                L_0x016b:
                    d.u r1 = new d.u     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.String r2 = "null cannot be cast to non-null type com.toutiao.proxyserver.ProxyServer"
                    r1.<init>(r2)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    throw r1     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                L_0x0173:
                L_0x0174:
                    com.ss.android.ugc.aweme.base.utils.g r1 = com.p683ss.android.ugc.aweme.base.utils.C23718g.m58207b()
                    java.lang.String r2 = "NetworkStateManager.getInstance()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                    boolean r1 = r1.mo49153d()
                    if (r1 == 0) goto L_0x0192
                    java.lang.String r1 = r7.f93079c
                    int r2 = r7.f93080d
                    com.ss.android.ugc.aweme.app.f.c r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56632a(r0)
                    org.json.JSONObject r3 = r3.mo47825b()
                    com.p683ss.android.ugc.aweme.app.C23131p.m57776a(r1, r2, r3)
                L_0x0192:
                    java.lang.String r1 = r7.f93081e
                    java.lang.String r2 = r7.f93082f
                    com.ss.android.ugc.aweme.app.f.c r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56632a(r0)
                    org.json.JSONObject r0 = r0.mo47825b()
                    com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r1, r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideo.p1934b.C36363g.C36364a.C36365a.run():void");
            }
        }

        private C36364a() {
        }

        public /* synthetic */ C36364a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m82051a(long j, String str) {
            C52711k.m112240b(str, "serviceName");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C23131p.m57779a(str, jSONObject);
        }

        /* renamed from: a */
        private static void m82053a(VideoUrlModel videoUrlModel, JSONObject jSONObject) {
            C48075e k = C48107j.m104193f().mo95412k(videoUrlModel);
            if (k != null) {
                try {
                    jSONObject.put("video_cache_read_time", (double) ((((float) k.f120801a) * 1.0f) / ((float) k.f120803c)));
                    jSONObject.put("video_cache_read_size", (double) ((((float) k.f120802b) * 1.0f) / ((float) k.f120803c)));
                    jSONObject.put("video_cache_read_cnt", k.f120803c);
                    jSONObject.put("video_cache_use_ttnet", C51895s.f129475j);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public static void m82052a(Video video, String str) {
            Object obj;
            C52711k.m112240b(str, "rateServiceName");
            if (video != null) {
                JSONObject jSONObject = new JSONObject();
                String str2 = "netWorkQuality";
                try {
                    C14460b a = C14460b.m29586a();
                    C52711k.m112236a((Object) a, "ConnectionClassManager.getInstance()");
                    jSONObject.put(str2, a.mo26625b().toString());
                    C14460b a2 = C14460b.m29586a();
                    C52711k.m112236a((Object) a2, "ConnectionClassManager.getInstance()");
                    jSONObject.put("netWorkSpeed", (int) a2.mo26626c());
                    jSONObject.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
                    C48005c.m103856a(jSONObject);
                    File a3 = C48016e.m103933a(C48016e.m103940b(), "cache");
                    String str3 = "file";
                    if (a3 == null) {
                        obj = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a3.getPath());
                        sb.append("/");
                        sb.append(C36362f.m82050a(video));
                        obj = new C43929l("file", sb.toString());
                    }
                    jSONObject.put(str3, obj);
                } catch (Exception unused) {
                }
                C23131p.m57776a(str, 0, jSONObject);
            }
        }

        /* renamed from: a */
        public static void m82054a(C50112d dVar, Video video, String str, int i, String str2, String str3) {
            C52711k.m112240b(str, "rateServiceName");
            C52711k.m112240b(str2, "logType");
            C52711k.m112240b(str3, "logServiceName");
            if (dVar != null && video != null && video.getPlayAddr() != null) {
                C36365a aVar = new C36365a(dVar, video, str, 1, str2, str3);
                C18842a.m45932a(aVar);
            }
        }

        /* renamed from: a */
        public final void mo75275a(Video video, String str, long j, String str2, String str3, String str4, C48121w wVar) {
            int i;
            C52711k.m112240b(str, "groupId");
            C52711k.m112240b(str2, "endType");
            C52711k.m112240b(str4, "logType");
            if (video != null) {
                VideoUrlModel playAddr = video.getPlayAddr();
                if (playAddr != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("request_id", str3);
                        jSONObject.put("duration", j);
                        jSONObject.put("end_type", str2);
                        if (wVar == null) {
                            C48021h M = C48121w.m104249M();
                            C52711k.m112236a((Object) M, "PlayerManager.inst()");
                            jSONObject.put("player_type", M.mo95242a().toString());
                        } else {
                            jSONObject.put("player_type", wVar.mo95242a().toString());
                        }
                        VideoBitRateABManager c = VideoBitRateABManager.m103801c();
                        C52711k.m112236a((Object) c, "VideoBitRateABManager.getInstance()");
                        if (c.mo95132d()) {
                            Integer a = C31189e.m72827a(playAddr);
                            int b = C31189e.m72828b(playAddr);
                            if (a == null) {
                                List bitRate = video.getBitRate();
                                if (bitRate != null) {
                                    Iterator it = bitRate.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        BitRate bitRate2 = (BitRate) it.next();
                                        if (!(bitRate2 == null || bitRate2.getPlayAddr() == null)) {
                                            UrlModel playAddr2 = bitRate2.getPlayAddr();
                                            C52711k.m112236a((Object) playAddr2, "temp.playAddr");
                                            if (!TextUtils.isEmpty(playAddr2.getUri()) && playAddr.getUri() != null) {
                                                String uri = playAddr.getUri();
                                                C52711k.m112236a((Object) uri, "model.uri");
                                                UrlModel playAddr3 = bitRate2.getPlayAddr();
                                                C52711k.m112236a((Object) playAddr3, "temp.playAddr");
                                                String uri2 = playAddr3.getUri();
                                                C52711k.m112236a((Object) uri2, "temp.playAddr.uri");
                                                if (C52830p.m112411b(uri, uri2, false, 2, null)) {
                                                    a = Integer.valueOf(bitRate2.getBitRate());
                                                    b = bitRate2.getQualityType();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            String str5 = "video_bitrate";
                            if (a != null) {
                                i = a.intValue();
                            } else {
                                i = -1;
                            }
                            jSONObject.put(str5, i);
                            jSONObject.put("video_quality", b);
                            List bitRate3 = playAddr.getBitRate();
                            if (bitRate3 != null && !bitRate3.isEmpty()) {
                                jSONObject.put("bitrate_set", new JSONArray(new C17978g().mo34897a(new ExcludeStrategy()).mo34900d().mo34889b(bitRate3)));
                            }
                        }
                        jSONObject.put("strategy_status", "-1");
                        jSONObject.put("internet_speed", C48918e.m105714f());
                        jSONObject.put("group_id", str);
                    } catch (Exception e) {
                        C32458a.m75143a(e);
                        jSONObject = new JSONObject();
                    }
                    m82053a(playAddr, jSONObject);
                    C23131p.m57779a(str4, jSONObject);
                }
            }
        }
    }
}
