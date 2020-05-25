package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35868f;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39552aj;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.AVCameraInitManager */
public final class AVCameraInitManager {

    /* renamed from: a */
    public static final AVCameraInitManager f104688a = new AVCameraInitManager();

    /* renamed from: b */
    private static boolean f104689b;

    /* renamed from: c */
    private static boolean f104690c;

    /* renamed from: d */
    private static final int f104691d = C10181b.m20511a().mo18167a(LibraryCompressABGray.class, true, "decompress_so_strategy_client", ClientExpManager.decompress_so_strategy_client());

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.AVCameraInitManager$DecompressTask */
    public static final class DecompressTask implements LegoTask {
        private final boolean backEnd;
        private final int playCounts;
        private final int type;

        public final C35896f process() {
            return C35894d.m81063a(this);
        }

        public final C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        public final void run(Context context) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            C39552aj decompressService = createIAVServiceProxybyMonsterPlugin.getDecompressService();
            if (decompressService.mo74199a()) {
                decompressService.mo74196a(this.type);
            } else {
                AVCameraInitManager.f104688a.mo83838a(this.playCounts, this.backEnd, true);
            }
        }

        public DecompressTask(int i, int i2, boolean z) {
            this.type = i;
            this.playCounts = i2;
            this.backEnd = z;
        }
    }

    private AVCameraInitManager() {
    }

    /* renamed from: a */
    private static void m90985a(String str) {
        StringBuilder sb = new StringBuilder("So decompress: CameraInitManager, ");
        sb.append(str);
        C45407ay.m98968a(sb.toString());
    }

    /* renamed from: a */
    public static final void m90984a(int i, boolean z) {
        if (!f104690c) {
            f104690c = true;
            int i2 = f104691d;
            Keva.getRepo("DECOMPRESS_GRAY").storeInt("KEY", i2);
            switch (i2) {
                case 0:
                    f104688a.mo83838a(i, z, false);
                    return;
                case 1:
                    if (i == 3) {
                        m90983a(1, i, z);
                        return;
                    }
                    break;
                case 2:
                    if (z) {
                        m90983a(2, i, z);
                        return;
                    }
                    break;
                case 3:
                    m90983a(3, i, z);
                    break;
            }
        }
    }

    /* renamed from: a */
    private static void m90983a(int i, int i2, boolean z) {
        C35857a.m81001b().mo74526a(new DecompressTask(i, i2, z)).mo74527a();
    }

    /* renamed from: a */
    public final void mo83838a(int i, boolean z, boolean z2) {
        LegoTask initTask = AVExternalServiceImpl.getAVServiceImpl_Monster().initService().initTask(4);
        switch (C10181b.m20511a().mo18168a(PreLoadAVCameraAB.class, true, "preload_vesdk_task", 31744, 0)) {
            case 0:
                f104689b = true;
                C35868f b = C35857a.m81001b();
                if (initTask == null) {
                    C52711k.m112234a();
                }
                b.mo74526a(initTask).mo74527a();
                if (!z2) {
                    m90985a(" Not in decompress experiment, start camera init task");
                    break;
                }
                break;
            case 1:
                if (i == 3) {
                    f104689b = true;
                    C35868f b2 = C35857a.m81001b();
                    if (initTask == null) {
                        C52711k.m112234a();
                    }
                    b2.mo74526a(initTask).mo74527a();
                    if (!z2) {
                        m90985a(" Not in decompress experiment, start camera init task");
                        return;
                    }
                }
                break;
            case 2:
                if (z) {
                    f104689b = true;
                    C35868f b3 = C35857a.m81001b();
                    if (initTask == null) {
                        C52711k.m112234a();
                    }
                    b3.mo74526a(initTask).mo74527a();
                    if (!z2) {
                        m90985a(" Not in decompress experiment, start camera init task");
                        return;
                    }
                }
                break;
        }
    }
}
