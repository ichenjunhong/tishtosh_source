package com.p683ss.android.ugc.aweme.commercialize.p1566f;

import android.graphics.Color;
import com.p683ss.android.ugc.aweme.main.story.live.C36742c;
import com.p683ss.android.ugc.aweme.main.story.live.p1946a.C36733a;
import com.p683ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p683ss.android.ugc.aweme.story.model.StoryResponse.C46654a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.commercialize.f.c */
public final class C25832c extends C36742c {
    /* renamed from: a */
    public final void mo53038a(C46654a aVar) {
        if (aVar == null || aVar.f117668a == null) {
            this.f93905a.setVisibility(8);
            return;
        }
        if (this.f93906b != null) {
            this.f93906b.mo75839a(Collections.singletonList(aVar.f117668a));
            if (this.f93906b instanceof C25830a) {
                int parseColor = Color.parseColor(aVar.f117674g);
                C25830a aVar2 = (C25830a) this.f93906b;
                aVar2.mo53032a(parseColor, parseColor);
                aVar2.f68279a.setText(aVar.f117675h);
                aVar2.f68280b.setText(aVar.f117669b);
            }
            this.f93907c = true;
            this.f93905a.setVisibility(0);
            if (aVar.f117673f) {
                C47718bf.m103288a(new C25835f());
            }
        } else {
            this.f93905a.setVisibility(8);
        }
    }

    public C25832c(AbsLiveStoryItemView absLiveStoryItemView, C36733a aVar) {
        super(absLiveStoryItemView, aVar);
    }
}
