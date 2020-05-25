package com.p683ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.Space;
import android.widget.TabHost.TabSpec;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost.C11155a;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost.C11157c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23694h;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a.C30515a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager */
public class TabChangeManager extends C0209x {

    /* renamed from: a */
    String f93536a;

    /* renamed from: b */
    List<C23694h> f93537b = new ArrayList();

    /* renamed from: c */
    public String f93538c;

    /* renamed from: d */
    public boolean f93539d;

    /* renamed from: e */
    public C36481a f93540e;

    /* renamed from: f */
    private FragmentTabHost f93541f;

    /* renamed from: g */
    private int f93542g = 0;

    /* renamed from: h */
    private C0654k f93543h;

    /* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$a */
    public interface C36481a {
        /* renamed from: a */
        void mo69927a(String str);
    }

    /* renamed from: b */
    private boolean m82397b() {
        if (this.f93541f != null) {
            return true;
        }
        return false;
    }

    public void onCleared() {
        this.f93541f = null;
        this.f93537b.clear();
    }

    /* renamed from: a */
    public final Fragment mo75609a() {
        if (!m82397b()) {
            return null;
        }
        return this.f93541f.getCurrentFragment();
    }

    /* renamed from: a */
    public final TabChangeManager mo75610a(C0654k kVar) {
        this.f93543h = kVar;
        return this;
    }

    /* renamed from: a */
    public final TabChangeManager mo75611a(FragmentTabHost fragmentTabHost) {
        this.f93539d = true;
        this.f93541f = fragmentTabHost;
        return this;
    }

    /* renamed from: a */
    public static TabChangeManager m82396a(FragmentActivity fragmentActivity) {
        return (TabChangeManager) C0214z.m440a(fragmentActivity).mo359a(TabChangeManager.class);
    }

    /* renamed from: c */
    public final Fragment mo75619c(String str) {
        if (this.f93543h == null) {
            return null;
        }
        return this.f93543h.mo2224a(str);
    }

    /* renamed from: b */
    public final Fragment mo75617b(String str) {
        if (m82397b() && this.f93543h != null) {
            return this.f93543h.mo2224a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final TabChangeManager mo75612a(C23694h hVar) {
        this.f93537b.add(hVar);
        if (hVar instanceof C0184k) {
            ((C0184k) hVar).getLifecycle().mo324a(new TabChangeManager$$Lambda$0(this, hVar));
        }
        return this;
    }

    /* renamed from: a */
    public final void mo75614a(String str) {
        mo75615a(str, false);
    }

    /* renamed from: a */
    public final void mo75615a(String str, boolean z) {
        int i = this.f93542g + 1;
        this.f93542g = i;
        mo75616a(str, z, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo75618b(Class cls, String str, Bundle bundle) throws Exception {
        mo75613a(cls, str, bundle);
        return null;
    }

    /* renamed from: a */
    public final void mo75613a(Class cls, String str, Bundle bundle) {
        if (!m82397b()) {
            C0013i.m18a((Callable<TResult>) new C36638ef<TResult>(this, cls, str, bundle), C0013i.f25b);
            return;
        }
        TabSpec newTabSpec = this.f93541f.newTabSpec(str);
        Space space = new Space(this.f93541f.getContext());
        space.setMinimumHeight(0);
        space.setMinimumWidth(0);
        newTabSpec.setIndicator(space);
        try {
            FragmentTabHost fragmentTabHost = this.f93541f;
            newTabSpec.setContent(new C11155a(fragmentTabHost.f30075b));
            String tag = newTabSpec.getTag();
            C11157c cVar = new C11157c(tag, cls, bundle);
            if (fragmentTabHost.f30077d) {
                cVar.f30091d = fragmentTabHost.f30076c.mo2224a(tag);
                if (cVar.f30091d != null && !cVar.f30091d.isDetached()) {
                    C0679r a = fragmentTabHost.f30076c.mo2225a();
                    a.mo2197d(cVar.f30091d);
                    a.mo2195c();
                }
            }
            fragmentTabHost.f30074a.add(cVar);
            fragmentTabHost.addTab(newTabSpec);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo75616a(String str, boolean z, int i, boolean z2) {
        if (!TextUtils.equals("HOME", str)) {
            C30515a.m71483b().mo62712b();
            C22574a.m55738f().mo46914a();
            C22574a.m55738f().mo46919b();
        }
        if (!m82397b() && TextUtils.equals("HOME", str) && this.f93538c == null) {
            this.f93536a = this.f93538c;
            this.f93538c = str;
        }
        if (!m82397b()) {
            C36639eg egVar = new C36639eg(this, str, z, i, z2);
            C18842a.m45934b(egVar);
        } else if (this.f93542g <= i) {
            this.f93541f.setCurrentTabByTag(HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().getTagForCurrentTabInMainPageFragment(this, this.f93541f.getCurrentTabTag(), str));
            this.f93536a = this.f93538c;
            this.f93538c = str;
            if (this.f93540e != null) {
                this.f93540e.mo69927a(this.f93538c);
            }
            for (C23694h a : this.f93537b) {
                a.mo49118a(this.f93538c, this.f93536a, z, z2);
            }
            HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().afterTabChangedInMainPageFragment(str);
        }
    }
}
