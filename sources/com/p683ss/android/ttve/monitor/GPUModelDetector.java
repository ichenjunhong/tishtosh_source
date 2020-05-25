package com.p683ss.android.ttve.monitor;

import java.util.regex.Pattern;

/* renamed from: com.ss.android.ttve.monitor.GPUModelDetector */
public final class GPUModelDetector {

    /* renamed from: a */
    static final GPUModelDetector f55274a = new GPUModelDetector();

    /* renamed from: b */
    ENvGpuModel f55275b;

    /* renamed from: c */
    ENvGpuSubModel f55276c;

    /* renamed from: d */
    int f55277d;

    /* renamed from: com.ss.android.ttve.monitor.GPUModelDetector$ENvGpuModel */
    public enum ENvGpuModel {
        Unknown,
        Adreno,
        Mali,
        PowerVR,
        Intel,
        NVIDIA,
        Vivante,
        VideoCore
    }

    /* renamed from: com.ss.android.ttve.monitor.GPUModelDetector$ENvGpuSubModel */
    public enum ENvGpuSubModel {
        Unknown,
        Adreno,
        Mali,
        Mali_MP,
        Mali_T,
        PowerVR_SGX,
        PowerVR_SGX_MP,
        PowerVR_SGX_MP2,
        PowerVR_Rogue_Han,
        PowerVR_Rogue_Hood,
        PowerVR_Rogue_Marlowe,
        PowerVR_Rogue_G,
        Intel_HD_Graphics,
        NVIDIA_Tegra,
        NVIDIA_Tegra_X1,
        NVIDIA_AP,
        Vivante_GC,
        VideoCore_IV_HW
    }

    /* renamed from: com.ss.android.ttve.monitor.GPUModelDetector$a */
    public class C20101a {

        /* renamed from: a */
        public ENvGpuModel f55278a;

        /* renamed from: b */
        public ENvGpuSubModel f55279b;

        /* renamed from: c */
        public int f55280c;

        public C20101a(ENvGpuModel eNvGpuModel, ENvGpuSubModel eNvGpuSubModel, int i) {
            this.f55278a = eNvGpuModel;
            this.f55279b = eNvGpuSubModel;
            this.f55280c = i;
        }
    }

    private GPUModelDetector() {
    }

    /* renamed from: c */
    static int m49609c(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    static boolean m49608a(String str) {
        if (Pattern.compile("-?[0-9]+.?[0-9]+").matcher(str).matches() || Pattern.compile("[0-9]+").matcher(str).matches()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo42262b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String valueOf = String.valueOf(str.charAt(i));
            if (m49608a(valueOf)) {
                sb.append(valueOf);
            }
        }
        return sb.toString();
    }
}
