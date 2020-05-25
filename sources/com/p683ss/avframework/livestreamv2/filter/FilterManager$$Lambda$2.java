package com.p683ss.avframework.livestreamv2.filter;

import com.p683ss.avframework.effect.IVideoEffectProcessor.IEffectInfoChangeListener;

/* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$$Lambda$2 */
final /* synthetic */ class FilterManager$$Lambda$2 implements Runnable {
    private final FilterManager arg$1;
    private final IEffectInfoChangeListener arg$2;

    FilterManager$$Lambda$2(FilterManager filterManager, IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.arg$1 = filterManager;
        this.arg$2 = iEffectInfoChangeListener;
    }

    public final void run() {
        this.arg$1.lambda$setEffectInfoChangeListener$2$FilterManager(this.arg$2);
    }
}
