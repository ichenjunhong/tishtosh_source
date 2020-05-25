package com.bytedance.apm;

import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.C8994d;
import com.bytedance.apm.C8994d.C8996a;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.core.C8990c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p465a.C8911a;
import com.bytedance.apm.p465a.C8913b;
import com.bytedance.apm.p478d.C9007d;
import com.bytedance.apm.p480f.C9029e;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p481a.C9015b;
import com.bytedance.apm.p485h.C9043e;
import com.bytedance.apm.p489l.C9094b;
import com.bytedance.apm.p489l.C9103c;
import com.bytedance.apm.p489l.C9104d;
import com.bytedance.apm.p489l.C9109f;
import com.bytedance.apm.p489l.C9114h;
import com.bytedance.apm.p489l.C9120j;
import com.bytedance.apm.p493m.C9139c;
import com.bytedance.apm.p493m.C9139c.C91401;
import com.bytedance.apm.p493m.p494a.C9130c;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.baselib.p565a.C9801d;
import com.bytedance.frameworks.baselib.p565a.C9801d.C9803b;
import com.bytedance.frameworks.core.apm.C9926a;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.services.apm.api.C13225h;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a */
public final class C8908a {

    /* renamed from: com.bytedance.apm.a$a */
    public static class C8910a {

        /* renamed from: a */
        public static final C8908a f24278a = new C8908a();
    }

    private C8908a() {
    }

    /* renamed from: a */
    public static void m17633a(C9007d dVar) {
        ApmDelegate a = ApmDelegate.m17947a();
        if (!a.f24749i) {
            throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start(). If you have any questions, pls lark wangkai.android");
        } else if (dVar == null) {
            throw new IllegalArgumentException("startConfig must not be allowed");
        } else if (!a.f24750j) {
            C9149b a2 = C9149b.m18170a();
            a2.f25067b = true;
            if (a2.f25066a != null && !a2.f25070g.isEmpty()) {
                a2.f25066a.mo16531b(a2.f25068e);
                a2.f25066a.mo16530a(a2.f25068e, C9149b.f25064c);
            }
            if (a2.f25066a != null && !a2.f25071h.isEmpty()) {
                a2.f25066a.mo16531b(a2.f25069f);
                a2.f25066a.mo16530a(a2.f25069f, C9149b.f25065d);
            }
            a.f24750j = true;
            a.f24743c = dVar;
            C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                public final void run() {
                    ApmDelegate apmDelegate = ApmDelegate.this;
                    try {
                        C8976c.f24428f = System.currentTimeMillis();
                        if (C9190h.m18253a(apmDelegate.f24743c.f24519a) && !C9190h.m18253a(apmDelegate.f24756q)) {
                            apmDelegate.f24743c.f24519a = apmDelegate.f24756q;
                        }
                        if (C9190h.m18253a(apmDelegate.f24743c.f24520b) && !C9190h.m18253a(apmDelegate.f24757r)) {
                            apmDelegate.f24743c.f24520b = apmDelegate.f24757r;
                        }
                        if (C9190h.m18253a(apmDelegate.f24743c.f24521c) && !C9190h.m18253a(apmDelegate.f24758s)) {
                            apmDelegate.f24743c.f24521c = apmDelegate.f24758s;
                        }
                        C8994d.m17799a().f24477a = new C8996a() {
                            /* renamed from: a */
                            public final void mo16327a(String str) {
                                C9220a.m18310a(str);
                            }

                            /* renamed from: a */
                            public final void mo16328a(Throwable th, String str) {
                                C9220a.m18312a(th, str);
                            }
                        };
                        C8976c.m17743a(apmDelegate.f24743c.f24533o);
                        C8976c.m17741a(apmDelegate.f24743c.f24534p);
                        IHttpService iHttpService = apmDelegate.f24743c.f24535q;
                        if (iHttpService != null) {
                            C8976c.f24426d = iHttpService;
                        }
                        C8976c.f24427e = apmDelegate.f24743c.f24523e;
                        apmDelegate.f24746f = apmDelegate.f24743c.f24542x;
                        apmDelegate.f24752m = apmDelegate.f24743c.f24536r;
                        C9029e a = C9029e.m17898a();
                        a.f24629b = C8976c.m17747c();
                        a.f24630c = System.currentTimeMillis();
                        ((IConfigManager) C12401c.m24975a(IConfigManager.class)).registerConfigListener(a);
                        if (apmDelegate.f24751k) {
                            C9139c a2 = C9139c.m18134a();
                            C9007d dVar = apmDelegate.f24743c;
                            C91401 r4 = new C9803b(a2) {

                                /* renamed from: a */
                                final /* synthetic */ C9139c f25045a;

                                /* renamed from: a */
                                public final 
/*
Method generation error in method: com.bytedance.apm.m.c.1.a(android.content.Context):null, dex: classes.dex
                                java.lang.NullPointerException
                                	at jadx.core.codegen.ClassGen.useType(ClassGen.java:442)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:109)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:311)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:661)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:595)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:353)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:138)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:299)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:661)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:595)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:353)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:773)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:713)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:138)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:163)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:144)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:163)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:144)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:76)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:32)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:36)
                                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                                
*/
                            };
                            if (!C9801d.f26668b) {
                                C9801d.f26667a = r4;
                                C9801d.f26668b = true;
                            }
                            ((IConfigManager) C12401c.m24975a(IConfigManager.class)).registerConfigListener(a2);
                            ActivityLifeObserver.getInstance().register(a2);
                            C9130c.f24997a = a2;
                            List<String> list = dVar.f24520b;
                            if (!C9190h.m18253a(list)) {
                                a2.f25019a = new ArrayList(list);
                            }
                            List<String> list2 = dVar.f24521c;
                            if (!C9190h.m18253a(list2)) {
                                a2.f25020b = new ArrayList(list2);
                            }
                            a2.f25021c = dVar.f24537s;
                        }
                        apmDelegate.f24753n = new C9103c();
                        apmDelegate.f24753n.mo16446g();
                        new C9109f(apmDelegate.f24743c.f24522d).mo16446g();
                        if (apmDelegate.f24751k) {
                            C9114h hVar = new C9114h();
                            hVar.f24929g = apmDelegate.f24743c.f24540v;
                            hVar.mo16446g();
                            if (apmDelegate.f24743c.f24524f) {
                                new C9120j(apmDelegate.f24743c.f24525g).mo16446g();
                            }
                            if (apmDelegate.f24743c.f24523e) {
                                new C9104d().mo16446g();
                            }
                            if (apmDelegate.f24743c.f24530l) {
                                new C9094b().mo16446g();
                            }
                        }
                        if (apmDelegate.f24743c.f24526h && !apmDelegate.f24743c.f24527i) {
                            apmDelegate.mo16432b();
                        }
                        C9014a.m17825a().mo16337a(apmDelegate.f24743c.f24539u);
                        C9015b.m17827a().mo16337a(apmDelegate.f24743c.f24539u);
                        C8976c.m17736a();
                        C8911a.f24279a = new C8913b();
                        long j = apmDelegate.f24743c.f24537s;
                        C9149b a3 = C9149b.m18170a();
                        C90648 r5 = new Runnable() {
                            public final void run() {
                                ApmDelegate.this.f24747g.initParams(new C8990c() {
                                    /* renamed from: a */
                                    public final Map<String, String> mo16304a() {
                                        return C8976c.m17752h();
                                    }
                                }, ApmDelegate.this.f24743c.f24519a);
                                if (!ApmDelegate.this.f24743c.f24532n || !C8976c.m17747c()) {
                                    ApmDelegate.this.f24747g.fetchConfig();
                                } else {
                                    ApmDelegate.this.f24747g.forceUpdateFromRemote(null, null);
                                }
                            }
                        };
                        long j2 = j * 1000;
                        if (a3.f25067b) {
                            a3.f25066a.mo16530a((Runnable) r5, j2);
                        }
                        if (apmDelegate.f24751k) {
                            String string = C9069b.m17971a().f24779a.getString("update_version_code", null);
                            String optString = C8976c.m17753i().optString("update_version_code");
                            if (!TextUtils.equals(string, optString)) {
                                C8976c.m17738a(1);
                                C9069b.m17971a().f24779a.edit().putString("update_version_code", optString).apply();
                            } else {
                                C8976c.m17738a(2);
                            }
                            JSONObject i = C8976c.m17753i();
                            if (i != null) {
                                C9043e eVar = new C9043e(i.optString("version_code"), i.optString("version_name"), i.optString("manifest_version_code"), i.optString("update_version_code"), i.optString("app_version"));
                                C9926a.m19912a().mo17872a(eVar);
                            }
                        }
                        apmDelegate.mo16427a(C8976c.m17736a());
                        C13225h hVar2 = new C13225h();
                        hVar2.f34491a = apmDelegate.f24743c.f24520b;
                        apmDelegate.mo16429a(hVar2);
                        apmDelegate.mo16435c();
                        apmDelegate.f24745e = apmDelegate.f24743c.f24541w;
                        ApmDelegate.m17948a(apmDelegate.f24743c);
                        apmDelegate.f24744d = apmDelegate.f24743c.f24538t;
                        AutoLaunchTraceHelper.reportStats();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
