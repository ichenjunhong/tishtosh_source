package com.p683ss.android.ugc.aweme.main.story.feed;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel_LifecycleAdapter */
public class StoryFeedPanel_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final StoryFeedPanel f93851a;

    StoryFeedPanel_LifecycleAdapter(StoryFeedPanel storyFeedPanel) {
        this.f93851a = storyFeedPanel;
    }

    /* renamed from: a */
    public final void mo313a(C0184k kVar, C0177a aVar, boolean z, C0197q qVar) {
        boolean z2;
        if (qVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && aVar == C0177a.ON_RESUME) {
            if (!z2 || qVar.mo344a("onResume", 2)) {
                this.f93851a.onResume(kVar);
            }
        }
    }
}
