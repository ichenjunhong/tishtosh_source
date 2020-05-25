package com.p683ss.android.ugc.aweme.main.story;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.main.story.live.C36744d;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.model.Story;
import com.p683ss.android.ugc.aweme.story.model.StoryResponse;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.main.story.a */
public final class C36705a {

    /* renamed from: a */
    public StoryResponse f93828a;

    /* renamed from: b */
    public C36744d f93829b;

    /* renamed from: b */
    public final boolean mo75788b() {
        if (this.f93829b == null || C9376b.m18558a((Collection<T>) this.f93829b.f93910a) || !C46635b.m101190a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo75787a() {
        boolean z;
        if (this.f93828a != null && !C9376b.m18558a((Collection<T>) this.f93828a.getStoryFeed())) {
            Iterator it = this.f93828a.getStoryFeed().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Story) it.next()).isLive()) {
                        if (C46635b.m101190a()) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            z = true;
            if (!z || mo75788b()) {
                return true;
            }
            return false;
        }
        z = false;
        if (!z) {
        }
        return true;
    }
}
