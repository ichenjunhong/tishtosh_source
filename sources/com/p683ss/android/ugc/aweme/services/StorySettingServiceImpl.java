package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.aweme.services.story.IStorySettingService;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.services.StorySettingServiceImpl */
public final class StorySettingServiceImpl implements IStorySettingService {
    public static final Companion Companion = new Companion(null);
    public static final C52668f INSTANCE$delegate = C52732g.m112285a(StorySettingServiceImpl$Companion$INSTANCE$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.services.StorySettingServiceImpl$Companion */
    public static final class Companion {
        static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/services/StorySettingServiceImpl;"))};

        private Companion() {
        }

        public static /* synthetic */ void INSTANCE$annotations() {
        }

        public final StorySettingServiceImpl getINSTANCE() {
            return (StorySettingServiceImpl) StorySettingServiceImpl.INSTANCE$delegate.getValue();
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    private StorySettingServiceImpl() {
    }

    public static final StorySettingServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    public final boolean getStorySettingDoudouSwitch() {
        return false;
    }

    public final void loadData() {
    }

    public final void setFirstPublishSuccStatus() {
    }

    public /* synthetic */ StorySettingServiceImpl(C52707g gVar) {
        this();
    }
}
