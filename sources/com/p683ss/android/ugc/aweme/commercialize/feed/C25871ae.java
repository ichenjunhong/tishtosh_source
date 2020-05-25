package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26044ak;
import com.p683ss.android.ugc.aweme.commercialize.log.C26053at;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.log.C26089m;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26461ca;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedAdAsyncLogExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.C36385k;
import com.p683ss.android.ugc.aweme.miniapp.utils.C36917d;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ae */
public enum C25871ae implements C25874af {
    RAW_AD {
        /* renamed from: a */
        public final boolean mo53178a() {
            return true;
        }

        /* renamed from: b */
        public final void mo53180b(Context context, Aweme aweme) {
            C26088l.m63322b(context, "music_click", aweme, C26088l.m63373m(context, aweme, "raw ad music click"));
        }

        /* renamed from: f */
        public final void mo53186f(Context context, Aweme aweme) {
            C25867ab.f68404a.removeMessages(1048577);
            C25867ab.f68405b = null;
        }

        /* renamed from: a */
        public final void mo53172a(Context context, Aweme aweme) {
            if (RAW_AD.isRealAuthor) {
                C26088l.m63360g(context, aweme, LeakCanaryFileProvider.f132049i);
                if (C26512f.m64065h(aweme)) {
                    C26088l.m63330c(context, aweme);
                }
                if (!aweme.isAd() || aweme.getAwemeRawAd().getProfileWithWebview() != 1) {
                    C26088l.m63348e(context, aweme, LeakCanaryFileProvider.f132049i);
                } else {
                    C26088l.m63340d(context, aweme, LeakCanaryFileProvider.f132049i);
                }
            } else if (C26512f.m64133aa(aweme) || !RAW_AD.hasLandPage) {
                C26088l.m63348e(context, aweme, LeakCanaryFileProvider.f132049i);
            } else {
                C26088l.m63360g(context, aweme, LeakCanaryFileProvider.f132049i);
                C26088l.m63340d(context, aweme, LeakCanaryFileProvider.f132049i);
            }
        }

        /* renamed from: c */
        public final void mo53182c(Context context, Aweme aweme) {
            C25862a a = C25862a.m62591a();
            String aid = aweme.getAid();
            if (!a.f68397a.contains(aid)) {
                a.f68397a.add(aid);
            }
            C0013i.m18a((Callable<TResult>) new C25886b<TResult>(aid), (Executor) C0013i.f24a);
            if (C26088l.m63256C(context, aweme)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && !C9431p.m18664a(awemeRawAd.getOpenUrl())) {
                    Uri parse = Uri.parse(awemeRawAd.getOpenUrl());
                    if ("webcast_room".equals(parse.getHost()) && "ad_link".equals(parse.getQueryParameter("enter_from_merge"))) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from_merge", "ad_link");
                        hashMap.put("action_type", "click");
                        String queryParameter = parse.getQueryParameter("enter_method");
                        if (!C9431p.m18664a(queryParameter)) {
                            hashMap.put("enter_method", queryParameter);
                        }
                        String queryParameter2 = parse.getQueryParameter("user_id");
                        if (!C9431p.m18664a(queryParameter2)) {
                            hashMap.put("anchor_id", queryParameter2);
                        }
                        String queryParameter3 = parse.getQueryParameter("room_id");
                        if (!C9431p.m18664a(queryParameter3)) {
                            hashMap.put("room_id", queryParameter3);
                        }
                        String queryParameter4 = parse.getQueryParameter("video_id");
                        if (!C9431p.m18664a(queryParameter4)) {
                            hashMap.put("video_id", queryParameter4);
                        }
                        String queryParameter5 = parse.getQueryParameter("log_pb");
                        if (!C9431p.m18664a(queryParameter5)) {
                            hashMap.put("log_pb", queryParameter5);
                        }
                        String queryParameter6 = parse.getQueryParameter("request_id");
                        if (!C9431p.m18664a(queryParameter6)) {
                            hashMap.put("request_id", queryParameter6);
                        }
                        C26890h.m65011a("livesdk_live_show", (Map<String, String>) hashMap);
                    }
                }
            }
            if (aweme != null && !aweme.isLive()) {
                if (FeedAdAsyncLogExperiment.m70945a()) {
                    C26088l.m63305a((Callable) new C26089m(context, aweme));
                    return;
                }
                C26088l.m63277a(context, aweme);
            }
        }

        /* renamed from: d */
        public final void mo53184d(Context context, Aweme aweme) {
            boolean z;
            if (!C26512f.m64052D(aweme).booleanValue() || !aweme.withFakeUser()) {
                if (RAW_AD.isDownloadMode && !RAW_AD.isRealAuthor) {
                    C26088l.m63365i(context, aweme);
                    if (RAW_AD.allowJumpToGooglePlay) {
                        C26088l.m63340d(context, aweme, "slide");
                        if (C26540w.m64257g(context, aweme)) {
                            return;
                        }
                    }
                }
                if (isVast(aweme)) {
                    C26088l.m63365i(context, aweme);
                    C26088l.m63340d(context, aweme, "slide");
                    if (C26540w.m64214a(context, aweme, (String) null, (String) null)) {
                        return;
                    }
                }
                if (C26540w.m64244d(context, aweme)) {
                    C26088l.m63365i(context, aweme);
                    C26088l.m63340d(context, aweme, "slide");
                    return;
                }
                if (!RAW_AD.isRealAuthor()) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd == null) {
                        z = false;
                    } else {
                        z = C36949e.m83168d(awemeRawAd.getMicroAppUrl());
                    }
                    if (z) {
                        C26088l.m63365i(context, aweme);
                        C26088l.m63340d(context, aweme, "slide");
                        if (C36917d.m83053a(context, aweme)) {
                            return;
                        }
                    }
                }
                C10691a.m21542b(context, (int) R.string.dm).mo19066a();
            } else if (C26512f.m64122X(aweme)) {
                C26540w.m64203a(context, aweme, "slide");
            } else {
                C26540w.m64211a(context, aweme);
                C26088l.m63365i(context, aweme);
                C26088l.m63340d(context, aweme, "slide");
            }
        }

        /* renamed from: e */
        public final void mo53185e(Context context, Aweme aweme) {
            Integer num;
            int i;
            String str;
            if (RAW_AD.isRealAuthor) {
                if (!C26512f.m64061d(aweme) || !aweme.isLive()) {
                    if (C26512f.m64064g(aweme)) {
                        str = "video";
                    } else {
                        str = "";
                    }
                    C26088l.m63368j(context, aweme, str);
                } else {
                    C26088l.m63284a(context, aweme, "slide", "", Long.valueOf(0));
                }
                if (aweme.isAd() && aweme.getAwemeRawAd().getProfileWithWebview() == 1) {
                    C26088l.m63340d(context, aweme, "slide");
                } else if (!C26512f.m64061d(aweme) || !aweme.isLive()) {
                    C26088l.m63348e(context, aweme, "slide");
                } else {
                    C26088l.m63284a(context, aweme, "otherclick", "slide", Long.valueOf(0));
                }
            } else if (C26512f.m64133aa(aweme)) {
                C26088l.m63348e(context, aweme, "slide");
            } else if (!RAW_AD.isDownloadMode) {
                if (RAW_AD.hasLandPage) {
                    C26088l.m63365i(context, aweme);
                    String str2 = "slide";
                    if (!(context == null || aweme == null || !aweme.isAd())) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (awemeRawAd != null) {
                            num = Integer.valueOf(awemeRawAd.getLeftSlideClickType());
                        } else {
                            num = null;
                        }
                        if (num != null && num.intValue() == 0) {
                            C26088l.m63340d(context, aweme, str2);
                        } else if (num == null || num.intValue() != 1) {
                            if (num != null && num.intValue() == 2) {
                                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                if (awemeRawAd2 != null) {
                                    i = awemeRawAd2.getLeftSlideClickDuration();
                                } else {
                                    i = 0;
                                }
                                C25867ab.f68404a.removeMessages(1048577);
                                try {
                                    Message obtain = Message.obtain();
                                    obtain.what = 1048577;
                                    C52711k.m112236a((Object) obtain, "msg");
                                    Bundle bundle = new Bundle();
                                    bundle.putString("refer", str2);
                                    bundle.putSerializable("aweme_raw_data", aweme.getAwemeRawAd());
                                    obtain.setData(bundle);
                                    C25867ab.f68404a.sendMessageDelayed(obtain, ((long) i) * 1000);
                                } catch (Throwable unused) {
                                }
                            } else {
                                if (num != null && num.intValue() == 3) {
                                    C25867ab.f68405b = new C25868a(aweme, str2);
                                }
                                C26088l.m63340d(context, aweme, str2);
                            }
                        }
                    }
                    return;
                }
                C26088l.m63348e(context, aweme, "slide");
            } else if (RAW_AD.allowJumpToGooglePlay) {
                C26088l.m63365i(context, aweme);
                C26088l.m63340d(context, aweme, "slide");
            } else {
                C26088l.m63365i(context, aweme);
            }
        }

        /* renamed from: a */
        public final void mo53177a(Context context, Aweme aweme, boolean z) {
            if (z) {
                C26088l.m63367j(context, aweme);
            } else {
                C26088l.m63369k(context, aweme);
            }
        }

        /* renamed from: c */
        public final void mo53183c(Context context, Aweme aweme, int i) {
            C26088l.m63312b(context, aweme, i);
            C25493a.m62004a();
            C25493a.m62005a(context, aweme);
        }

        /* renamed from: b */
        public final void mo53181b(Context context, Aweme aweme, int i) {
            C26088l.m63312b(context, aweme, i);
            C25493a.m62004a();
            C25493a.m62005a(context, aweme);
        }

        /* renamed from: a */
        public final void mo53175a(Context context, Aweme aweme, String str) {
            boolean z;
            if (TextUtils.isEmpty(str)) {
                str = "photo";
            }
            if (C26469cc.m63997a(aweme, 3)) {
                C26471cd.m64008a(C26469cc.m64003d(aweme));
            }
            if (RAW_AD.isRealAuthor) {
                if (!C26512f.m64064g(aweme) || !C25871ae.showLive(aweme.getAuthor())) {
                    C26088l.m63360g(context, aweme, str);
                }
                if (!C26512f.m64065h(aweme)) {
                    if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().liveRoom != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        if (!aweme.isAd() || aweme.getAwemeRawAd().getProfileWithWebview() != 1) {
                            C26088l.m63348e(context, aweme, str);
                            return;
                        } else {
                            C26088l.m63340d(context, aweme, "photo");
                            return;
                        }
                    }
                }
                C26088l.m63340d(context, aweme, str);
            } else if (C26512f.m64133aa(aweme) || !RAW_AD.hasLandPage) {
                C26088l.m63348e(context, aweme, str);
            } else {
                if (!C26512f.m64064g(aweme) || !C25871ae.showLive(aweme.getAuthor())) {
                    HashMap hashMap = null;
                    if (C26503d.m64062e(aweme)) {
                        hashMap = new HashMap();
                        hashMap.put("photo_link", Integer.valueOf(aweme.getAwemeRawAd().getAdAvatarLinkTagStyle()));
                    }
                    C26088l.m63317b(context, aweme, str, (Map<String, Object>) hashMap);
                }
                C26088l.m63340d(context, aweme, str);
            }
        }

        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo53179a(android.content.Context r17, com.p683ss.android.ugc.aweme.feed.model.Aweme r18, int r19) {
            /*
                r16 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r18.getAwemeRawAd()
                java.lang.String r3 = r3.getType()
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                r5 = 0
                if (r4 == 0) goto L_0x0016
                return r5
            L_0x0016:
                if (r1 != 0) goto L_0x0019
                return r5
            L_0x0019:
                boolean r4 = r18.isAd()
                if (r4 != 0) goto L_0x0020
                return r5
            L_0x0020:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r18.getAwemeRawAd()
                java.lang.String r4 = r4.getOpenUrl()
                r6 = 1
                if (r2 == r6) goto L_0x002f
                r7 = 34
                if (r2 != r7) goto L_0x0066
            L_0x002f:
                com.ss.android.ugc.aweme.commercialize.feed.ae r7 = RAW_AD
                boolean r7 = r7.hasLandPage
                if (r7 != 0) goto L_0x0042
                com.ss.android.ugc.aweme.commercialize.feed.ae r7 = RAW_AD
                boolean r7 = r7.hasOpenUrl
                if (r7 == 0) goto L_0x003c
                goto L_0x0042
            L_0x003c:
                java.lang.String r7 = "title"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63348e(r0, r1, r7)
                goto L_0x0066
            L_0x0042:
                boolean r7 = com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r4)
                if (r7 == 0) goto L_0x0056
                java.lang.String r7 = "draw_ad"
                java.lang.String r8 = "click_message"
                java.lang.String r9 = "raw ad click"
                org.json.JSONObject r9 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63263a(r0, r1, r9, r5)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63296a(r0, r7, r8, r1, r9)
                goto L_0x0061
            L_0x0056:
                java.lang.String r7 = "ad_click"
                java.lang.String r8 = "raw ad ad click"
                org.json.JSONObject r8 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r8)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r0, r7, r1, r8)
            L_0x0061:
                java.lang.String r7 = "title"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r1, r7)
            L_0x0066:
                r7 = 37
                if (r2 != r7) goto L_0x009a
                com.ss.android.ugc.aweme.commercialize.feed.ae r7 = RAW_AD
                boolean r7 = r7.hasLandPage
                if (r7 != 0) goto L_0x0095
                com.ss.android.ugc.aweme.commercialize.feed.ae r7 = RAW_AD
                boolean r7 = r7.hasOpenUrl
                if (r7 == 0) goto L_0x0077
                goto L_0x0095
            L_0x0077:
                java.lang.String r7 = "title"
                com.ss.android.ugc.aweme.commercialize.log.e$b r8 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
                java.lang.String r9 = "homepage_ad"
                com.ss.android.ugc.aweme.commercialize.log.e$b r8 = r8.mo53582a(r9)
                java.lang.String r9 = "otherclick"
                com.ss.android.ugc.aweme.commercialize.log.e$b r8 = r8.mo53593b(r9)
                com.ss.android.ugc.aweme.commercialize.log.e$b r7 = r8.mo53602g(r7)
                com.ss.android.ugc.aweme.commercialize.log.e$b r7 = r7.mo53590b(r1)
                r7.mo53586a(r0)
                goto L_0x009a
            L_0x0095:
                java.lang.String r7 = "title"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63370k(r0, r1, r7)
            L_0x009a:
                java.util.HashMap r7 = new java.util.HashMap
                r7.<init>()
                r8 = -1
                int r9 = r3.hashCode()
                r10 = 3
                r11 = 2
                switch(r9) {
                    case -1354573786: goto L_0x00e6;
                    case 96801: goto L_0x00dc;
                    case 117588: goto L_0x00d2;
                    case 3083120: goto L_0x00c8;
                    case 3148996: goto L_0x00be;
                    case 957829685: goto L_0x00b4;
                    case 1893962841: goto L_0x00aa;
                    default: goto L_0x00a9;
                }
            L_0x00a9:
                goto L_0x00f0
            L_0x00aa:
                java.lang.String r9 = "redpacket"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00f0
                r3 = 6
                goto L_0x00f1
            L_0x00b4:
                java.lang.String r9 = "counsel"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00f0
                r3 = 0
                goto L_0x00f1
            L_0x00be:
                java.lang.String r9 = "form"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00f0
                r3 = 5
                goto L_0x00f1
            L_0x00c8:
                java.lang.String r9 = "dial"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00f0
                r3 = 4
                goto L_0x00f1
            L_0x00d2:
                java.lang.String r9 = "web"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00f0
                r3 = 1
                goto L_0x00f1
            L_0x00dc:
                java.lang.String r9 = "app"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00f0
                r3 = 3
                goto L_0x00f1
            L_0x00e6:
                java.lang.String r9 = "coupon"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00f0
                r3 = 2
                goto L_0x00f1
            L_0x00f0:
                r3 = -1
            L_0x00f1:
                r13 = 28
                r14 = 20
                r15 = 30
                r6 = 19
                r5 = 27
                r8 = 12
                r9 = 14
                r12 = 11
                switch(r3) {
                    case 0: goto L_0x02d6;
                    case 1: goto L_0x02d6;
                    case 2: goto L_0x027f;
                    case 3: goto L_0x018b;
                    case 4: goto L_0x015e;
                    case 5: goto L_0x0139;
                    case 6: goto L_0x0106;
                    default: goto L_0x0104;
                }
            L_0x0104:
                goto L_0x03f3
            L_0x0106:
                if (r2 != r11) goto L_0x0112
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63382s(r17, r18)
                java.lang.String r2 = "button"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r1, r2)
                goto L_0x03f3
            L_0x0112:
                if (r2 != r10) goto L_0x012b
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                java.lang.String r2 = "click_redpacket"
                java.lang.String r3 = "raw ad background click red packet"
                org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63336c(r0, r2, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x012b:
                r3 = 9
                if (r2 != r3) goto L_0x03f3
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63382s(r17, r18)
                java.lang.String r2 = "redpacket"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r1, r2)
                goto L_0x03f3
            L_0x0139:
                if (r2 != r11) goto L_0x014d
                java.lang.String r2 = "click_form"
                java.lang.String r3 = "raw ad form click"
                org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r0, r2, r1, r3)
                java.lang.String r2 = "button"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r1, r2)
                goto L_0x03f3
            L_0x014d:
                if (r2 != r10) goto L_0x03f3
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63378o(r17, r18)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x015e:
                if (r2 != r11) goto L_0x0172
                java.lang.String r2 = "click_call"
                java.lang.String r3 = "raw ad phone click"
                org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r0, r2, r1, r3)
                java.lang.String r2 = "button"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r1, r2)
                goto L_0x03f3
            L_0x0172:
                if (r2 != r10) goto L_0x03f3
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                java.lang.String r2 = "click_call"
                java.lang.String r3 = "raw ad background phone click"
                org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63336c(r0, r2, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x018b:
                if (r2 != r11) goto L_0x019c
                java.lang.String r3 = "click_start"
                org.json.JSONObject r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r0, r3, r1, r4)
                java.lang.String r3 = "button"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r1, r3)
                goto L_0x01c0
            L_0x019c:
                if (r2 != r10) goto L_0x01b4
                java.lang.String r3 = "refer"
                java.lang.String r4 = "button"
                r7.put(r3, r4)
                java.lang.String r3 = "click_start"
                java.lang.String r4 = "raw ad background click"
                org.json.JSONObject r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r4)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63336c(r0, r3, r1, r4)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x01c0
            L_0x01b4:
                r3 = 8
                if (r2 != r3) goto L_0x01c0
                java.lang.String r3 = "button"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63370k(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63384u(r17, r18)
            L_0x01c0:
                if (r2 != r12) goto L_0x01ce
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x01ce:
                if (r2 != r5) goto L_0x01e7
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_photo"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x01e7:
                if (r2 != r6) goto L_0x01f5
                java.lang.String r2 = "refer"
                java.lang.String r3 = "image"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x01f5:
                if (r2 != r9) goto L_0x0203
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x0203:
                if (r2 != r15) goto L_0x021c
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_name"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x021c:
                if (r2 == r8) goto L_0x0273
                if (r2 != r14) goto L_0x0221
                goto L_0x0273
            L_0x0221:
                if (r2 == r13) goto L_0x025c
                r3 = 32
                if (r2 != r3) goto L_0x0228
                goto L_0x025c
            L_0x0228:
                r3 = 13
                if (r2 == r3) goto L_0x0250
                r3 = 15
                if (r2 != r3) goto L_0x0231
                goto L_0x0250
            L_0x0231:
                r3 = 29
                if (r2 == r3) goto L_0x0239
                r3 = 31
                if (r2 != r3) goto L_0x03f3
            L_0x0239:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_hot_region"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x0250:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "hot_region"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x025c:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_title"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x0273:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x027f:
                if (r2 != r11) goto L_0x0293
                java.lang.String r2 = "click_coupon"
                java.lang.String r3 = "raw ad coupon click"
                org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r0, r2, r1, r3)
                java.lang.String r2 = "button"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r1, r2)
                goto L_0x03f3
            L_0x0293:
                if (r2 != r10) goto L_0x02ac
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                java.lang.String r2 = "click_coupon"
                java.lang.String r3 = "raw ad background coupon click"
                org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63336c(r0, r2, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x02ac:
                if (r2 != r12) goto L_0x02ba
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x02ba:
                if (r2 != r9) goto L_0x02c8
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x02c8:
                if (r2 != r8) goto L_0x03f3
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x02d6:
                if (r2 != r11) goto L_0x02fd
                boolean r2 = com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r4)
                if (r2 == 0) goto L_0x02eb
                java.lang.String r2 = "click_message"
                java.lang.String r3 = "raw ad click"
                r4 = 0
                org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63263a(r0, r1, r3, r4)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r0, r2, r1, r3)
                goto L_0x02f6
            L_0x02eb:
                java.lang.String r2 = "click_button"
                java.lang.String r3 = "raw ad button click"
                org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r0, r2, r1, r3)
            L_0x02f6:
                java.lang.String r2 = "button"
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r1, r2)
                goto L_0x03f3
            L_0x02fd:
                if (r2 != r10) goto L_0x0323
                boolean r2 = com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r4)
                if (r2 == 0) goto L_0x0314
                java.lang.String r2 = "background_ad"
                java.lang.String r3 = "click_message"
                java.lang.String r4 = "raw ad click"
                r5 = 0
                org.json.JSONObject r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63263a(r0, r1, r4, r5)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63296a(r0, r2, r3, r1, r4)
                goto L_0x0317
            L_0x0314:
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63378o(r17, r18)
            L_0x0317:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x0323:
                r3 = 26
                if (r2 != r3) goto L_0x033e
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_more_button"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x033e:
                if (r2 != r12) goto L_0x034c
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x034c:
                if (r2 != r5) goto L_0x0365
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_photo"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x0365:
                if (r2 != r6) goto L_0x0373
                java.lang.String r2 = "refer"
                java.lang.String r3 = "image"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x0373:
                if (r2 != r9) goto L_0x0381
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x0381:
                if (r2 != r15) goto L_0x0399
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_name"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x0399:
                if (r2 == r8) goto L_0x03e9
                if (r2 != r14) goto L_0x039e
                goto L_0x03e9
            L_0x039e:
                if (r2 == r13) goto L_0x03d3
                r3 = 32
                if (r2 != r3) goto L_0x03a5
                goto L_0x03d3
            L_0x03a5:
                r3 = 13
                if (r2 == r3) goto L_0x03c8
                r3 = 21
                if (r2 != r3) goto L_0x03ae
                goto L_0x03c8
            L_0x03ae:
                r3 = 29
                if (r2 != r3) goto L_0x03f3
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_hot_region"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x03c8:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "hot_region"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
                goto L_0x03f3
            L_0x03d3:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_title"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63357f(r0, r2, r3, r1)
                goto L_0x03f3
            L_0x03e9:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r7.put(r2, r3)
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63318b(r0, r1, r7)
            L_0x03f3:
                com.ss.android.ugc.aweme.commercialize.feed.ae r0 = RAW_AD
                boolean r0 = r0.isRealAuthor
                if (r0 != 0) goto L_0x0401
                com.ss.android.ugc.aweme.commercialize.feed.ae r0 = RAW_AD
                boolean r0 = r0.hasLandPage
                if (r0 == 0) goto L_0x0401
                r0 = 1
                return r0
            L_0x0401:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.C25871ae.C258721.mo53179a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
        }

        /* renamed from: a */
        public final void mo53173a(Context context, Aweme aweme, long j, int i) {
            int i2 = 0;
            if (C26053at.m63105a(aweme)) {
                Video a = C36385k.f93161b.mo75308a(aweme);
                if (a != null) {
                    i2 = a.getDuration();
                }
                C26088l.m63313b(context, aweme, j + C26053at.m63106b(), i2);
                C26053at.m63107c();
            } else if (aweme != null && aweme.getAwemeRawAd() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("play_order", Integer.valueOf(i));
                if (C26461ca.m63988e(aweme)) {
                    hashMap.put("is_pre_valid_action", Integer.valueOf(C26461ca.m63987d(aweme) ? 1 : 0));
                }
                JSONObject a2 = C26088l.m63264a(context, aweme, "raw ad over duration", false, C26088l.m63261a((Map<String, Object>) hashMap));
                try {
                    if (aweme.getVideo() != null) {
                        i2 = aweme.getVideo().getVideoLength();
                    }
                    String str = "duration";
                    if (i2 != 0) {
                        j = (long) i2;
                    }
                    a2.put(str, j);
                    a2.put("video_length", i2);
                } catch (JSONException unused) {
                }
                C26461ca.m63985b(aweme);
                C26088l.m63322b(context, "over", aweme, a2);
                if (C26503d.m64061d(aweme)) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    C26060ay.f68819a.mo53545a("play_over", awemeRawAd.getPlayOverTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26044ak<Object,Object,Object>(aweme));
                }
            }
        }

        /* renamed from: a */
        public final void mo53176a(Context context, Aweme aweme, String str, long j, int i) {
            logBreak(context, aweme, str, j, i);
        }

        /* renamed from: a */
        public final void mo53174a(Context context, Aweme aweme, Aweme aweme2, String str, long j, int i) {
            if (str != null && aweme2 != null) {
                if (aweme == null || !TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    logBreak(context, aweme2, str, j, i);
                }
            }
        }
    },
    NONE {
        /* renamed from: a */
        public final void mo53172a(Context context, Aweme aweme) {
        }

        /* renamed from: a */
        public final void mo53173a(Context context, Aweme aweme, long j, int i) {
        }

        /* renamed from: a */
        public final void mo53175a(Context context, Aweme aweme, String str) {
        }

        /* renamed from: a */
        public final void mo53176a(Context context, Aweme aweme, String str, long j, int i) {
        }

        /* renamed from: a */
        public final void mo53177a(Context context, Aweme aweme, boolean z) {
        }

        /* renamed from: a */
        public final boolean mo53178a() {
            return false;
        }

        /* renamed from: a */
        public final boolean mo53179a(Context context, Aweme aweme, int i) {
            return false;
        }

        /* renamed from: b */
        public final void mo53180b(Context context, Aweme aweme) {
        }

        /* renamed from: b */
        public final void mo53181b(Context context, Aweme aweme, int i) {
        }

        /* renamed from: c */
        public final void mo53182c(Context context, Aweme aweme) {
        }

        /* renamed from: c */
        public final void mo53183c(Context context, Aweme aweme, int i) {
        }

        /* renamed from: d */
        public final void mo53184d(Context context, Aweme aweme) {
        }

        /* renamed from: e */
        public final void mo53185e(Context context, Aweme aweme) {
        }

        /* renamed from: f */
        public final void mo53186f(Context context, Aweme aweme) {
        }

        /* renamed from: a */
        public final void mo53174a(Context context, Aweme aweme, Aweme aweme2, String str, long j, int i) {
            if (str != null && aweme2 != null) {
                if (aweme == null || !TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    logBreak(context, aweme2, str, j, i);
                }
            }
        }
    };
    

    /* renamed from: a */
    private boolean f68411a;
    public boolean allowJumpToGooglePlay;

    /* renamed from: b */
    private boolean f68412b;

    /* renamed from: c */
    private boolean f68413c;
    public boolean hasLandPage;
    public boolean hasOpenUrl;
    public boolean isDownloadMode;
    public boolean isRealAuthor;

    public boolean enableComment() {
        return this.f68413c;
    }

    public boolean isDownloadMode() {
        return this.isDownloadMode;
    }

    public boolean isRealAuthor() {
        return this.isRealAuthor;
    }

    public boolean hasLandPage() {
        if (!mo53178a() || !this.hasLandPage) {
            return false;
        }
        return true;
    }

    public boolean hasMpUrl() {
        if (!mo53178a() || !this.f68411a) {
            return false;
        }
        return true;
    }

    public boolean hasOpenUrl() {
        if (!mo53178a() || !this.hasOpenUrl) {
            return false;
        }
        return true;
    }

    public static boolean showLive(User user) {
        if (user == null || !user.isLive() || !C46635b.m101190a() || user.isBlock()) {
            return false;
        }
        return true;
    }

    public boolean isVast(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !RAW_AD.f68412b || RAW_AD.isRealAuthor) {
            return false;
        }
        if ((C26471cd.m64022c(aweme) || C26471cd.m64023d(aweme)) && !TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl())) {
            return true;
        }
        return false;
    }

    public static C25871ae valueOf(Aweme aweme) {
        boolean z;
        boolean z2 = false;
        if (!aweme.isAd() || aweme.getAwemeRawAd() == null) {
            NONE.hasLandPage = false;
            C25871ae aeVar = NONE;
            if (aweme.getAuthor() == null || aweme.getAuthor().isAdFake()) {
                z = false;
            } else {
                z = true;
            }
            aeVar.isRealAuthor = z;
            NONE.f68413c = !aweme.isCmtSwt();
            NONE.hasOpenUrl = false;
            NONE.f68411a = false;
            NONE.isDownloadMode = false;
            NONE.f68412b = false;
            NONE.allowJumpToGooglePlay = false;
            return NONE;
        }
        RAW_AD.hasLandPage = !TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl());
        C25871ae aeVar2 = RAW_AD;
        if (aweme.getAuthor() != null && !aweme.getAuthor().isAdFake()) {
            z2 = true;
        }
        aeVar2.isRealAuthor = z2;
        RAW_AD.f68413c = !aweme.isCmtSwt();
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        RAW_AD.hasOpenUrl = C26540w.m64242c(openUrl);
        RAW_AD.f68411a = true ^ TextUtils.isEmpty(microAppUrl);
        RAW_AD.isDownloadMode = TextUtils.equals(aweme.getAwemeRawAd().getType(), "app");
        RAW_AD.f68412b = TextUtils.equals(aweme.getAwemeRawAd().getType(), "web");
        RAW_AD.allowJumpToGooglePlay = aweme.getAwemeRawAd().allowJumpToPlayStore();
        return RAW_AD;
    }

    public void clickAvatar(Context context, Aweme aweme) {
        mo53175a(context, aweme, (String) null);
    }

    public void logBreak(Context context, Aweme aweme, String str, long j, int i) {
        int i2;
        if (aweme != null && TextUtils.equals(str, aweme.getAid()) && aweme.isAd()) {
            if (C26053at.m63105a(aweme)) {
                Video a = C36385k.f93161b.mo75308a(aweme);
                if (a != null) {
                    i2 = a.getDuration();
                } else {
                    i2 = 0;
                }
                if (C26053at.f68804c) {
                    C26088l.m63313b(context, aweme, j + C26053at.m63106b(), i2);
                } else {
                    C26088l.m63279a(context, aweme, j + C26053at.m63106b(), i2);
                }
                C26053at.m63107c();
                return;
            }
            C26088l.m63280a(context, aweme, j, i, "break", (Integer) null);
        }
    }
}
