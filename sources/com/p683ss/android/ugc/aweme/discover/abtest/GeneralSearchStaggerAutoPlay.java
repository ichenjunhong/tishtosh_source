package com.p683ss.android.ugc.aweme.discover.abtest;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "general_search_stagger_auto_play")
/* renamed from: com.ss.android.ugc.aweme.discover.abtest.GeneralSearchStaggerAutoPlay */
public final class GeneralSearchStaggerAutoPlay {
    @C10179b
    public static final int AUTO_PLAY_BUT_MUTE = 2;
    @C10179b
    public static final int AUTO_PLAY_WITH_VOICE = 1;
    @C10179b(mo18165a = true)
    public static final int DONT_AUTO_PLAY = 0;
    public static final GeneralSearchStaggerAutoPlay INSTANCE = new GeneralSearchStaggerAutoPlay();

    private GeneralSearchStaggerAutoPlay() {
    }
}
