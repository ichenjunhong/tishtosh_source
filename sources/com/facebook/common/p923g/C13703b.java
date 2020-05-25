package com.facebook.common.p923g;

/* renamed from: com.facebook.common.g.b */
public enum C13703b {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackground(1.0d),
    OnAppBackgrounded(1.0d);
    

    /* renamed from: a */
    private double f35678a;

    public final double getSuggestedTrimRatio() {
        return this.f35678a;
    }

    private C13703b(double d) {
        this.f35678a = d;
    }
}
