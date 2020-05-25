package com.p683ss.android.ugc.asve.sandbox;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Process;
import android.os.RemoteException;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.ttve.nativePort.TEEffectUtils;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.recorder.C20483d;
import com.p683ss.android.ugc.asve.sandbox.C20803n.C20804a;
import com.p683ss.android.ugc.asve.sandbox.SandBoxResourceFinder.C20582a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20721u;
import com.p683ss.android.ugc.asve.sandbox.p1253d.C20763f;
import com.p683ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20819b;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20822c;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20828e;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper;
import com.p683ss.android.vesdk.C50630ak;
import com.p683ss.android.vesdk.C50702h;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRemoteCoreService */
public final class SandBoxRemoteCoreService extends Service {

    /* renamed from: a */
    public final String f56396a = "SandBoxCoreService";

    /* renamed from: b */
    public boolean f56397b;

    /* renamed from: c */
    public final C20580b f56398c = new C20580b(this);

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRemoteCoreService$a */
    static final class C20579a implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ SandBoxRemoteCoreService f56399a;

        /* renamed from: b */
        final /* synthetic */ UncaughtExceptionHandler f56400b;

        C20579a(SandBoxRemoteCoreService sandBoxRemoteCoreService, UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f56399a = sandBoxRemoteCoreService;
            this.f56400b = uncaughtExceptionHandler;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            this.f56400b.uncaughtException(thread, th);
            if ((th instanceof RemoteException) || (th.getCause() instanceof RemoteException)) {
                this.f56399a.f56398c.mo43720a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRemoteCoreService$b */
    public static final class C20580b extends C20804a {

        /* renamed from: a */
        final /* synthetic */ SandBoxRemoteCoreService f56401a;

        /* renamed from: b */
        private C20797l f56402b;

        /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRemoteCoreService$b$a */
        static final class C20581a implements DeathRecipient {

            /* renamed from: a */
            final /* synthetic */ C20580b f56403a;

            C20581a(C20580b bVar) {
                this.f56403a = bVar;
            }

            public final void binderDied() {
                this.f56403a.mo43720a();
            }
        }

        /* renamed from: a */
        public final void mo43720a() {
            Process.killProcess(Process.myPid());
        }

        C20580b(SandBoxRemoteCoreService sandBoxRemoteCoreService) {
            this.f56401a = sandBoxRemoteCoreService;
        }

        /* renamed from: a */
        public final void mo43721a(C20721u uVar) {
            if (uVar != null) {
                IBinder asBinder = uVar.asBinder();
                if (asBinder != null) {
                    asBinder.linkToDeath(new C20581a(this), 0);
                }
            }
        }

        /* renamed from: a */
        public final C20797l mo43719a(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) {
            C52711k.m112240b(aSSandBoxRecorderContextWrapper, "context");
            if (!this.f56401a.f56397b) {
                SandBoxRemoteCoreService.m51857a(-1);
                return null;
            }
            C20317b.f55815a.mo42962c("createSandboxRecorder remote  begin ");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("create_state", "0");
            C20483d d = C20315a.m50092a().mo43150d();
            if (d != null) {
                d.mo43439a("sandbox_create_recoder", linkedHashMap);
            }
            this.f56402b = new C20763f(aSSandBoxRecorderContextWrapper);
            C20317b.f55815a.mo42962c("createSandboxRecorder remote  end ");
            SandBoxRemoteCoreService.m51857a(1);
            C20797l lVar = this.f56402b;
            if (lVar == null) {
                C52711k.m112234a();
            }
            return lVar;
        }

        /* renamed from: a */
        public final synchronized void mo43722a(SandBoxASContextWrapper sandBoxASContextWrapper, C20800m mVar, C20822c cVar, C20828e eVar, C20819b bVar, C20779f fVar) {
            C52711k.m112240b(sandBoxASContextWrapper, "sandBoxContextWrapper");
            C52711k.m112240b(cVar, "logger");
            C50702h hVar = new C50702h();
            hVar.f127241c = sandBoxASContextWrapper.f56720n;
            hVar.f127239a = sandBoxASContextWrapper.f56721o;
            hVar.f127240b = sandBoxASContextWrapper.f56722p;
            C20315a aVar = C20315a.f55813c;
            C20583a aVar2 = new C20583a(sandBoxASContextWrapper, cVar, eVar, bVar, hVar, fVar);
            aVar.mo42958a(aVar2);
            if (mVar != null) {
                AssetManager assets = C20315a.m50093b().getAssets();
                C52711k.m112236a((Object) assets, "AS.applicationContext.assets");
                String str = sandBoxASContextWrapper.f56719m;
                C52711k.m112236a((Object) str, "sandBoxContextWrapper.effectModelDownloadPath");
                C50630ak.m109157a((C2592c) new SandBoxResourceFinder(mVar, assets, str));
            }
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("init_state", "1");
            C20483d d = C20315a.m50092a().mo43150d();
            if (d != null) {
                d.mo43439a("sandbox_init_asve", linkedHashMap);
            }
            C20317b.f55815a.mo42962c("initASVE remote all end ");
            this.f56401a.f56397b = true;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f56397b = false;
    }

    public final void onCreate() {
        super.onCreate();
        TEEffectUtils.getEffectVersion();
        C20582a aVar = SandBoxResourceFinder.Companion;
        Thread.setDefaultUncaughtExceptionHandler(new C20579a(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    public final IBinder onBind(Intent intent) {
        C52711k.m112240b(intent, "intent");
        return this.f56398c;
    }

    public final boolean onUnbind(Intent intent) {
        Process.killProcess(Process.myPid());
        return super.onUnbind(intent);
    }

    /* renamed from: a */
    public static void m51857a(int i) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("create_state", String.valueOf(i));
        C20483d d = C20315a.m50092a().mo43150d();
        if (d != null) {
            d.mo43439a("sandbox_create_recoder", linkedHashMap);
        }
    }
}
