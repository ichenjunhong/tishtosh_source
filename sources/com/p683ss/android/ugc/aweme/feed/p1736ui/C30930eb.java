package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.eb */
public abstract class C30930eb extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    private boolean f81006a;

    /* renamed from: a */
    public final void mo49781a() {
        mo63692j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo63689b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo63690d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo63691e();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo63692j();

    public C30930eb(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo49783a(View view) {
        if (this.f81199s != null) {
            this.f81199s.setVisibility(8);
        }
    }

    @C53771m
    public void onTopViewEnd(C26216b bVar) {
        if (bVar.f69221a == 4) {
            C47718bf.m103291d(this);
            mo63691e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49784a(DataCenter dataCenter) {
        dataCenter.mo48226a("startPlayAnimation", (C0199s<C23274a>) this).mo48226a("pausePlayAnimation", (C0199s<C23274a>) this).mo48226a("on_page_selected", (C0199s<C23274a>) this).mo48226a("on_page_unselected", (C0199s<C23274a>) this);
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        if (this.f81199s != null) {
            if (C26235d.m63571b(this.f81192l)) {
                if (!this.f81006a) {
                    mo63689b(this.f81199s);
                    this.f81006a = true;
                }
                this.f81199s.setVisibility(0);
                mo63690d();
                return;
            }
            this.f81199s.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        if (aVar != null && C26235d.m63571b(this.f81192l)) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2058685350) {
                if (hashCode != 307897710) {
                    if (hashCode != 350216171) {
                        if (hashCode == 1628582276 && str.equals("on_page_unselected")) {
                            c = 3;
                        }
                    } else if (str.equals("on_page_selected")) {
                        c = 0;
                    }
                } else if (str.equals("startPlayAnimation")) {
                    c = 1;
                }
            } else if (str.equals("pausePlayAnimation")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    mo63690d();
                    return;
                case 1:
                    if (C26235d.m63572c(this.f81192l) || C26235d.m63573d(this.f81192l)) {
                        mo63691e();
                        return;
                    } else {
                        C47718bf.m103290c(this);
                        return;
                    }
                case 2:
                    return;
                case 3:
                    mo63692j();
                    break;
            }
        }
    }
}
