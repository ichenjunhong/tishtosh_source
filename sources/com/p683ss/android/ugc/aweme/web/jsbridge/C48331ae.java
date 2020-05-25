package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.sdk.webview.p1210b.C19746f;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.discover.model.NationalTask;
import com.p683ss.android.ugc.aweme.nationaltask.api.NationalTaskApi;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ae */
public final class C48331ae extends C19746f {

    /* renamed from: a */
    public String f121605a;

    /* renamed from: b */
    public String f121606b;

    /* renamed from: c */
    private C10757a f121607c;

    public C48331ae(WeakReference<Context> weakReference, C10757a aVar) {
        super(weakReference);
        this.f121607c = aVar;
    }

    public final void call(final C10766h hVar, JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        String string = hVar.f28947d.getString("type");
        if (!TextUtils.equals("goods_order_share", string)) {
            hVar.f28946c = "open";
            hVar.f28947d.put("type", "openRecord");
            JSONObject jSONObject2 = null;
            if (hVar.f28947d.has("args")) {
                jSONObject2 = hVar.f28947d.getJSONObject("args");
                jSONObject2.put("recordOrigin", "jsBridge");
                if ("challenge".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("challenge_id"));
                    jSONObject2.put("recordParam", "challenge");
                } else if ("music".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("music_id"));
                    jSONObject2.put("recordParam", "music");
                } else if ("effect".equals(string)) {
                    if (jSONObject2.has("effect_id")) {
                        jSONObject2.put("id", jSONObject2.get("effect_id"));
                    }
                    jSONObject2.put("recordParam", "sticker");
                    if (jSONObject2.has("effect_meta_info")) {
                        jSONObject2.put("effect_meta_info", jSONObject2.getJSONObject("effect_meta_info").toString());
                    }
                    if (jSONObject2.has("effect_image")) {
                        jSONObject2.put("effect_image", jSONObject2.getJSONObject("effect_image").toString());
                    }
                } else if ("donation".equals(string) && jSONObject2 != null) {
                    jSONObject2.put("id", jSONObject2.get("charity_id"));
                    jSONObject2.put("recordParam", "donation");
                } else if ("star_atlas".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("star_atlas_id"));
                    jSONObject2.put("recordParam", "star_atlas");
                    jSONObject2.put("star_atlas_object", hVar.f28947d.getJSONObject("args").toString());
                } else if (TextUtils.equals("task", string)) {
                    jSONObject2.put("id", jSONObject2.get("task_id"));
                    jSONObject2.put("shoot_way", jSONObject2.get("shoot_way"));
                    jSONObject2.put("enter_from", jSONObject2.get("enter_from"));
                    jSONObject2.put("recordParam", "task_platform");
                    String str3 = "has_shopping_cart_authority";
                    if (jSONObject2.optBoolean("has_shopping_cart_authority", true)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    jSONObject2.put(str3, str);
                    String str4 = "is_limited";
                    if (jSONObject2.optBoolean("is_limited", false)) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    jSONObject2.put(str4, str2);
                    this.f121605a = jSONObject2.getString("task_id");
                    this.f121606b = jSONObject2.getString("enter_from");
                }
                jSONObject2.put("group", "1");
            }
            if (TextUtils.equals("task", string)) {
                C17825i.m43740a(NationalTaskApi.m84228a().getNationalTask(jSONObject2.getString("task_id")), new C17824h<NationalTask>() {
                    public final void onFailure(Throwable th) {
                    }

                    /* JADX WARNING: type inference failed for: r1v4 */
                    /* JADX WARNING: type inference failed for: r1v5, types: [com.ss.android.ugc.aweme.shortvideo.f] */
                    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.String] */
                    /* JADX WARNING: type inference failed for: r1v9 */
                    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.String] */
                    /* JADX WARNING: type inference failed for: r2v8, types: [com.ss.android.ugc.aweme.shortvideo.f] */
                    /* JADX WARNING: type inference failed for: r1v11 */
                    /* JADX WARNING: type inference failed for: r2v15, types: [com.ss.android.ugc.aweme.shortvideo.f] */
                    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v4
                      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.shortvideo.f, java.lang.String]
                      uses: [com.ss.android.ugc.aweme.shortvideo.f, ?[OBJECT, ARRAY]]
                      mth insns count: 73
                    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
                    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
                    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                     */
                    /* JADX WARNING: Unknown variable types count: 4 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ void onSuccess(java.lang.Object r12) {
                        /*
                            r11 = this;
                            com.ss.android.ugc.aweme.discover.model.NationalTask r12 = (com.p683ss.android.ugc.aweme.discover.model.NationalTask) r12
                            if (r12 == 0) goto L_0x00cb
                            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
                            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
                            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
                            com.ss.android.ugc.aweme.shortvideo.e r1 = com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45628d.m99364a(r12)
                            r0.addNationalTask(r1)
                            com.ss.android.ugc.aweme.web.jsbridge.ae r0 = com.p683ss.android.ugc.aweme.web.jsbridge.C48331ae.this
                            java.lang.String r0 = r0.f121605a
                            com.ss.android.ugc.aweme.web.jsbridge.ae r1 = com.p683ss.android.ugc.aweme.web.jsbridge.C48331ae.this
                            java.lang.String r1 = r1.f121606b
                            java.util.UUID r2 = java.util.UUID.randomUUID()
                            java.lang.String r2 = r2.toString()
                            java.lang.String r3 = "shoot"
                            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                            java.lang.String r5 = "task_id"
                            com.ss.android.ugc.aweme.app.f.d r0 = r4.mo47829a(r5, r0)
                            java.lang.String r4 = "shoot_way"
                            java.lang.String r5 = "task_platform"
                            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)
                            java.lang.String r4 = "enter_from"
                            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r1)
                            java.lang.String r1 = "creation_id"
                            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r0)
                            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
                            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
                            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
                            com.ss.android.ugc.aweme.shortvideo.e r12 = com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45628d.m99364a(r12)
                            r1 = 0
                            if (r12 != 0) goto L_0x005d
                            goto L_0x00bf
                        L_0x005d:
                            java.lang.String r3 = r12.getId()
                            java.util.List r2 = r12.getStickerIds()
                            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
                            r4 = 0
                            if (r2 == 0) goto L_0x006e
                            r5 = r1
                            goto L_0x0079
                        L_0x006e:
                            java.util.List r2 = r12.getStickerIds()
                            java.lang.Object r2 = r2.get(r4)
                            java.lang.String r2 = (java.lang.String) r2
                            r5 = r2
                        L_0x0079:
                            java.util.List r2 = r12.getConnectMusic()
                            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
                            if (r2 == 0) goto L_0x0085
                            r6 = r1
                            goto L_0x0090
                        L_0x0085:
                            java.util.List r2 = r12.getConnectMusic()
                            java.lang.Object r2 = r2.get(r4)
                            com.ss.android.ugc.aweme.shortvideo.c r2 = (com.p683ss.android.ugc.aweme.shortvideo.C42482c) r2
                            r6 = r2
                        L_0x0090:
                            java.util.List r2 = r12.getMvIds()
                            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
                            if (r2 == 0) goto L_0x009c
                        L_0x009a:
                            r7 = r1
                            goto L_0x00a7
                        L_0x009c:
                            java.util.List r1 = r12.getMvIds()
                            java.lang.Object r1 = r1.get(r4)
                            java.lang.String r1 = (java.lang.String) r1
                            goto L_0x009a
                        L_0x00a7:
                            com.ss.android.ugc.aweme.shortvideo.f r1 = new com.ss.android.ugc.aweme.shortvideo.f
                            r8 = 0
                            java.util.List r9 = r12.getChallengeNames()
                            java.util.List r10 = r12.getMentionedUsers()
                            java.util.List r12 = r12.getOptionalMaterials()
                            r2 = r1
                            r4 = r5
                            r5 = r8
                            r8 = r9
                            r9 = r10
                            r10 = r12
                            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                        L_0x00bf:
                            r0.addAVNationalTaskTips(r1)
                            com.ss.android.ugc.aweme.web.jsbridge.ae r12 = com.p683ss.android.ugc.aweme.web.jsbridge.C48331ae.this
                            com.bytedance.ies.g.a.h r0 = r5
                            org.json.JSONObject r0 = r0.f28947d
                            r12.open(r0)
                        L_0x00cb:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.C48331ae.C483321.onSuccess(java.lang.Object):void");
                    }
                }, C23551l.f62672a);
            } else {
                open(hVar.f28947d);
            }
        }
    }
}
