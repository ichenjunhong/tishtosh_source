package com.p683ss.avframework.livestreamv2.core;

/* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$GameLayer$$Lambda$1 */
final /* synthetic */ class LayerControl$GameLayer$$Lambda$1 implements Runnable {
    private final GameLayer arg$1;
    private final int arg$2;
    private final int arg$3;

    LayerControl$GameLayer$$Lambda$1(GameLayer gameLayer, int i, int i2) {
        this.arg$1 = gameLayer;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$createTexture$1$LayerControl$GameLayer(this.arg$2, this.arg$3);
    }
}
