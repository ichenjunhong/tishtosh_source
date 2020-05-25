package com.bytedance.opensdk.core.grant.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.opensdk.core.C12480a;
import com.bytedance.opensdk.core.C12495b;
import com.bytedance.opensdk.core.base.config.C12504a.C12505a;
import com.bytedance.opensdk.core.base.p809ui.HeloSdkBaseWebActivity;
import com.bytedance.opensdk.core.grant.config.GrantConfig;
import com.bytedance.opensdk.core.grant.web.p814a.C12524a.C12525a;
import com.bytedance.opensdk.core.p811c.p812a.C12514a;
import com.bytedance.opensdk.core.p811c.p812a.C12515b;
import com.bytedance.opensdk.core.p811c.p812a.C12516c;
import com.bytedance.opensdk.core.p811c.p812a.C12517d;
import com.bytedance.opensdk.p800b.C12460b;
import com.bytedance.opensdk.p800b.C12471i;
import com.bytedance.opensdk.p800b.C12473k;
import com.bytedance.opensdk.p800b.C12473k.C12474a;
import com.bytedance.opensdk.p800b.C12478o;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.ttm.player.MediaPlayer;
import java.util.HashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

public final class WebGrantActivity extends HeloSdkBaseWebActivity {

    /* renamed from: c */
    public static String f32878c = WebGrantActivity.class.getSimpleName();

    /* renamed from: d */
    public static final C12521a f32879d = new C12521a(null);

    /* renamed from: e */
    private GrantConfig f32880e;

    /* renamed from: f */
    private HashMap f32881f;

    /* renamed from: com.bytedance.opensdk.core.grant.web.WebGrantActivity$a */
    public static final class C12521a {
        private C12521a() {
        }

        public /* synthetic */ C12521a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo23532a(int i) {
        if (this.f32881f == null) {
            this.f32881f = new HashMap();
        }
        View view = (View) this.f32881f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f32881f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo23540a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        return false;
    }

    /* renamed from: a */
    public final String mo23533a() {
        String str;
        GrantConfig grantConfig = this.f32880e;
        if (grantConfig == null) {
            C52711k.m112237a("grantConfig");
        }
        String str2 = grantConfig.f32869b.f32833e;
        C52711k.m112240b(str2, "platform");
        if (C12505a.m25100a()) {
            StringBuilder sb = new StringBuilder("https:/passport.helo-app.com/mobile/grant/");
            sb.append(str2);
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("https:/passport.helo-app.com/mobile/grant/");
            sb2.append(str2);
            str = sb2.toString();
        }
        C12478o oVar = new C12478o(str);
        String str3 = "avatar";
        GrantConfig grantConfig2 = this.f32880e;
        if (grantConfig2 == null) {
            C52711k.m112237a("grantConfig");
        }
        C12478o a = oVar.mo23509a(str3, grantConfig2.f32870c.f32875b);
        String str4 = "nick";
        GrantConfig grantConfig3 = this.f32880e;
        if (grantConfig3 == null) {
            C52711k.m112237a("grantConfig");
        }
        C12478o a2 = a.mo23509a(str4, grantConfig3.f32870c.f32874a);
        String str5 = "code";
        GrantConfig grantConfig4 = this.f32880e;
        if (grantConfig4 == null) {
            C52711k.m112237a("grantConfig");
        }
        C12478o a3 = a2.mo23509a(str5, grantConfig4.f32871d);
        String str6 = "device_id";
        GrantConfig grantConfig5 = this.f32880e;
        if (grantConfig5 == null) {
            C52711k.m112237a("grantConfig");
        }
        C12478o a4 = a3.mo23509a(str6, grantConfig5.f32869b.f32834f);
        String str7 = "platform";
        GrantConfig grantConfig6 = this.f32880e;
        if (grantConfig6 == null) {
            C52711k.m112237a("grantConfig");
        }
        C12478o a5 = a4.mo23509a(str7, grantConfig6.f32869b.f32833e);
        String str8 = "has_bind";
        GrantConfig grantConfig7 = this.f32880e;
        if (grantConfig7 == null) {
            C52711k.m112237a("grantConfig");
        }
        C12478o a6 = a5.mo23508a(str8, grantConfig7.f32868a);
        String str9 = "region";
        GrantConfig grantConfig8 = this.f32880e;
        if (grantConfig8 == null) {
            C52711k.m112237a("grantConfig");
        }
        String country = grantConfig8.f32873f.getCountry();
        C52711k.m112236a((Object) country, "grantConfig.appLocale.country");
        C12478o a7 = a6.mo23509a(str9, country);
        String str10 = "helo_language";
        GrantConfig grantConfig9 = this.f32880e;
        if (grantConfig9 == null) {
            C52711k.m112237a("grantConfig");
        }
        String language = grantConfig9.f32873f.getLanguage();
        C52711k.m112236a((Object) language, "grantConfig.appLocale.language");
        String a8 = a7.mo23509a(str10, language).mo23510a();
        String str11 = this.f32844b;
        C52711k.m112236a((Object) str11, "TAG");
        StringBuilder sb3 = new StringBuilder("loadUrl = ");
        sb3.append(a8);
        C12471i.m25066a(str11, sb3.toString());
        return a8;
    }

    /* renamed from: a */
    private final void m25121a(C12514a aVar) {
        Intent intent = new Intent();
        intent.putExtra("result", C12495b.m25087a().mo34889b(aVar));
        if (C52711k.m112239a((Object) aVar.f32827b, (Object) "success")) {
            setResult(-1, intent);
        } else {
            setResult(3000, intent);
        }
    }

    /* renamed from: a */
    public final void mo23534a(Intent intent) {
        C52711k.m112240b(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bind_config");
        if (!(parcelableExtra instanceof GrantConfig)) {
            parcelableExtra = null;
        }
        GrantConfig grantConfig = (GrantConfig) parcelableExtra;
        if (grantConfig != null) {
            this.f32880e = grantConfig;
            return;
        }
        m25121a(new C12514a("fail", new C12515b("grant config null", Integer.valueOf(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL))));
        finish();
    }

    /* renamed from: a */
    public final boolean mo23543a(C12525a aVar) {
        int i;
        boolean z;
        C52711k.m112240b(aVar, "jsMsg");
        String str = aVar.f32888c;
        boolean z2 = false;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1743442128) {
                if (hashCode != 1251063817) {
                    if (hashCode == 1584751270 && str.equals("track_event")) {
                        C18085o oVar = aVar.f32889d;
                        if (oVar != null) {
                            String a = C12460b.m25054a(oVar, "event_name", (String) null);
                            if (a != null) {
                                C18085o a2 = C12460b.m25049a(oVar, "properties");
                                if (a2 != null) {
                                    C52711k.m112240b(a, "eventName");
                                    C52711k.m112240b(a2, "params");
                                    try {
                                        HashMap hashMap = (HashMap) C12495b.m25087a().mo34882a((C18082l) a2, new C12474a().f49843c);
                                        if (hashMap != null) {
                                            C12473k.m25071a(a, hashMap);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                } else if (str.equals("heloLogin")) {
                    String str2 = this.f32844b;
                    C52711k.m112236a((Object) str2, "TAG");
                    StringBuilder sb = new StringBuilder("handleUriHook heloLogin,   jsMsg = ");
                    sb.append(aVar);
                    C12471i.m25066a(str2, sb.toString());
                    C18085o oVar2 = aVar.f32889d;
                    if (oVar2 != null) {
                        Boolean a3 = C12460b.m25052a(oVar2, "syncHis", (Boolean) null);
                        if (a3 != null) {
                            z = a3.booleanValue();
                        } else {
                            z = false;
                        }
                        Boolean a4 = C12460b.m25052a(oVar2, "hasBind", (Boolean) null);
                        if (a4 != null) {
                            z2 = a4.booleanValue();
                        }
                        String str3 = "HeloNativeLoginEnd";
                        C18085o oVar3 = new C18085o();
                        oVar3.mo35018a("syncHis", Boolean.valueOf(z));
                        oVar3.mo35018a("hasBind", Boolean.valueOf(z2));
                        C12480a aVar2 = C12480a.BIND;
                        if (C12473k.m25072a(aVar2)) {
                            oVar3.mo35020a("result", "success");
                            mo23539a(str3, oVar3);
                            Activity activity = this;
                            GrantConfig grantConfig = this.f32880e;
                            if (grantConfig == null) {
                                C52711k.m112237a("grantConfig");
                            }
                            C52711k.m112240b(grantConfig, "receiver$0");
                            C12517d dVar = new C12517d(String.valueOf(grantConfig.f32869b.f32831c), grantConfig.f32869b.f32829a, grantConfig.f32869b.f32830b, grantConfig.f32871d, grantConfig.f32869b.f32832d, grantConfig.f32869b.f32833e, z);
                            int requestCodeInt = aVar2.getRequestCodeInt();
                            String str4 = "bind";
                            C52711k.m112240b(str4, LeakCanaryFileProvider.f132050j);
                            Builder builder = new Builder();
                            builder.scheme("snssdk1342");
                            builder.authority(str4);
                            Intent intent = new Intent("com.ss.android.heloauth.ACTION_BIND_ACCOUNT", builder.build());
                            C12516c cVar = new C12516c(100, dVar);
                            intent.setPackage("app.buzz.share");
                            intent.putExtra("data", C12495b.m25087a().mo34889b(cVar));
                            activity.startActivityForResult(intent, requestCodeInt);
                        } else {
                            oVar3.mo35020a("result", "fail");
                            mo23539a(str3, oVar3);
                        }
                    }
                }
            } else if (str.equals("bindAccount")) {
                String str5 = this.f32844b;
                C52711k.m112236a((Object) str5, "TAG");
                StringBuilder sb2 = new StringBuilder("handleUriHook bindTiktok,  jsMsg = ");
                sb2.append(aVar);
                C12471i.m25066a(str5, sb2.toString());
                C18085o oVar4 = aVar.f32889d;
                if (oVar4 != null) {
                    String a5 = C12460b.m25054a(oVar4, "status", (String) null);
                    if (a5 == null) {
                        a5 = "";
                    }
                    String a6 = C12460b.m25054a(oVar4, "code", (String) null);
                    if (a6 != null) {
                        Integer c = C52830p.m112395c(a6);
                        if (c != null) {
                            i = c.intValue();
                            m25121a(new C12514a(a5, new C12515b(a5, Integer.valueOf(i))));
                            finish();
                        }
                    }
                    i = C12460b.m25048a(oVar4, "code", -1);
                    m25121a(new C12514a(a5, new C12515b(a5, Integer.valueOf(i))));
                    finish();
                }
            }
            return true;
        }
        String str6 = this.f32844b;
        C52711k.m112236a((Object) str6, "TAG");
        StringBuilder sb3 = new StringBuilder("handleUriHook else,  jsMsg = ");
        sb3.append(aVar);
        C12471i.m25066a(str6, sb3.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r6 == null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            com.bytedance.opensdk.core.a r6 = com.bytedance.opensdk.core.C12480a.BIND
            int r6 = r6.getRequestCodeInt()
            if (r5 != r6) goto L_0x0085
            r5 = 0
            if (r7 == 0) goto L_0x0015
            java.lang.String r6 = "result"
            java.lang.String r6 = r7.getStringExtra(r6)
            goto L_0x0016
        L_0x0015:
            r6 = r5
        L_0x0016:
            com.google.gson.f r0 = com.bytedance.opensdk.core.C12495b.m25087a()     // Catch:{ Exception -> 0x0023 }
            java.lang.Class<com.bytedance.opensdk.core.c.a.a> r1 = com.bytedance.opensdk.core.p811c.p812a.C12514a.class
            java.lang.Object r6 = r0.mo34884a(r6, r1)     // Catch:{ Exception -> 0x0023 }
            com.bytedance.opensdk.core.c.a.a r6 = (com.bytedance.opensdk.core.p811c.p812a.C12514a) r6     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            if (r6 == 0) goto L_0x002b
            boolean r0 = r6.mo23524a()
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r6 == 0) goto L_0x0036
            T r1 = r6.f32828c
            com.bytedance.opensdk.core.c.a.b r1 = (com.bytedance.opensdk.core.p811c.p812a.C12515b) r1
            if (r1 == 0) goto L_0x0036
            java.lang.Integer r5 = r1.f32826d
        L_0x0036:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            if (r0 == 0) goto L_0x0047
            java.lang.String r6 = "result"
            java.lang.String r2 = "success"
            r1.put(r6, r2)
            goto L_0x0061
        L_0x0047:
            java.lang.String r2 = "result"
            java.lang.String r3 = "fail"
            r1.put(r2, r3)
            java.lang.String r2 = "fail_type"
            if (r6 == 0) goto L_0x005c
            T r6 = r6.f32828c
            com.bytedance.opensdk.core.c.a.b r6 = (com.bytedance.opensdk.core.p811c.p812a.C12515b) r6
            if (r6 == 0) goto L_0x005c
            java.lang.String r6 = r6.f32825c
            if (r6 != 0) goto L_0x005e
        L_0x005c:
            java.lang.String r6 = ""
        L_0x005e:
            r1.put(r2, r6)
        L_0x0061:
            java.lang.String r6 = "sync_connect_account_result"
            com.bytedance.opensdk.p800b.C12473k.m25071a(r6, r1)
            if (r0 != 0) goto L_0x007e
            if (r5 != 0) goto L_0x006b
            goto L_0x007e
        L_0x006b:
            int r5 = r5.intValue()
            r6 = 1041(0x411, float:1.459E-42)
            if (r5 != r6) goto L_0x007e
            java.lang.String r5 = "HasBindAnotherAccount"
            com.google.gson.o r6 = new com.google.gson.o
            r6.<init>()
            r4.mo23539a(r5, r6)
            return
        L_0x007e:
            r5 = -1
            r4.setResult(r5, r7)
            r4.finish()
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.core.grant.web.WebGrantActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}
