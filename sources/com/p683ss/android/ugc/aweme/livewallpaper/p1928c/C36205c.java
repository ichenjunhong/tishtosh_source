package com.p683ss.android.ugc.aweme.livewallpaper.p1928c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.p683ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.c */
public final class C36205c {

    /* renamed from: f */
    private static C36205c f92683f = new C36205c();

    /* renamed from: a */
    public List<LiveWallPaperBean> f92684a = new LinkedList();

    /* renamed from: b */
    public C17971f f92685b = new C17971f();

    /* renamed from: c */
    public C36211e f92686c;

    /* renamed from: d */
    public LiveWallPaperBean f92687d;

    /* renamed from: e */
    public Map<String, C36209a> f92688e;

    /* renamed from: g */
    private ContentResolver f92689g;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.c$a */
    public interface C36209a {
        /* renamed from: a */
        void mo74955a(boolean z, String str);
    }

    /* renamed from: a */
    public static C36205c m81710a() {
        return f92683f;
    }

    /* renamed from: d */
    private void m81714d() {
        Iterator it = this.f92684a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            LiveWallPaperBean liveWallPaperBean = (LiveWallPaperBean) it.next();
            if (!liveWallPaperBean.isValid()) {
                z = true;
                mo74957a(liveWallPaperBean);
                it.remove();
            }
        }
        if (z && this.f92686c != null) {
            this.f92686c.mo48503b(this.f92685b.mo34889b(this.f92684a));
        }
    }

    /* renamed from: c */
    public final List<LiveWallPaperBean> mo74961c() {
        Collection collection;
        if (!C9376b.m18558a((Collection<T>) this.f92684a)) {
            m81714d();
            return this.f92684a;
        }
        String str = "";
        if (this.f92686c != null) {
            str = this.f92686c.mo48501a("");
        }
        if (TextUtils.isEmpty(str)) {
            return new LinkedList();
        }
        try {
            collection = (List) this.f92685b.mo34885a(str, new C17956a<List<LiveWallPaperBean>>() {
            }.f49843c);
        } catch (Exception unused) {
            collection = null;
        }
        if (C9376b.m18558a(collection)) {
            return new LinkedList();
        }
        this.f92684a.addAll(collection);
        m81714d();
        return this.f92684a;
    }

    private C36205c() {
        try {
            this.f92686c = (C36211e) C23540d.m57713a(AwemeApplication.m56199a(), C36211e.class);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("LiveWallPaperManager getSP failed ");
            sb.append(th.getMessage());
            C47625i.m103103a(sb.toString());
        }
        if (this.f92686c != null) {
            this.f92687d = LiveWallPaperBean.newBuilder().mo75042c(this.f92686c.mo48505c("")).mo75037a(this.f92686c.mo48500a(0)).mo75040b(this.f92686c.mo48504c(0)).mo75043d(this.f92686c.mo48508e("")).mo75039a();
        } else {
            this.f92687d = LiveWallPaperBean.newBuilder().mo75039a();
        }
        this.f92684a = mo74961c();
        this.f92688e = new HashMap();
    }

    /* renamed from: b */
    public final void mo74960b() {
        if (this.f92687d.isValid() && !m81713b(this.f92687d.getId())) {
            this.f92684a.add(0, LiveWallPaperBean.newBuilder().mo75038a(this.f92687d.getId()).mo75041b(this.f92687d.getThumbnailPath()).mo75042c(this.f92687d.getVideoPath()).mo75037a(this.f92687d.getWidth()).mo75040b(this.f92687d.getHeight()).mo75043d(this.f92687d.getSource()).mo75039a());
            if (this.f92686c != null) {
                this.f92686c.mo48503b(this.f92685b.mo34889b(this.f92684a));
            }
        }
    }

    /* renamed from: a */
    public void mo74957a(final LiveWallPaperBean liveWallPaperBean) {
        C0013i.m16a((Callable<TResult>) new Callable<Void>() {
            public final /* synthetic */ Object call() throws Exception {
                C48016e.m103947c(liveWallPaperBean.getThumbnailPath());
                C48016e.m103947c(liveWallPaperBean.getVideoPath());
                return null;
            }
        });
    }

    /* renamed from: a */
    public final void mo74958a(String str) {
        if (this.f92688e.size() != 0) {
            this.f92688e.remove(str);
        }
    }

    /* renamed from: b */
    private static ComponentName m81712b(Activity activity) {
        if (C36212f.m81748d()) {
            return new ComponentName("com.ss.android.ugc.tiktok.livewallpaper", "com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper");
        }
        return new ComponentName(activity.getPackageName(), AmeLiveWallpaper.class.getName());
    }

    /* renamed from: b */
    private boolean m81713b(String str) {
        if (C9376b.m18558a((Collection<T>) this.f92684a) || TextUtils.isEmpty(str)) {
            return false;
        }
        for (LiveWallPaperBean id : this.f92684a) {
            if (str.equals(id.getId())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m81711a(Context context) {
        if (C36212f.m81748d()) {
            if (this.f92689g == null) {
                this.f92689g = context.getContentResolver();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("video_width", this.f92687d.getWidth());
            bundle.putInt("video_height", this.f92687d.getHeight());
            bundle.putString("source", this.f92687d.getSource());
            try {
                this.f92689g.call(C36204b.f92682a, "call_plugin", "", bundle);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("notifyWallpaperService ");
                sb.append(e.getMessage());
                C47625i.m103103a(sb.toString());
                C36212f.m81734a(1, "notifyWallpaperService Unknow content uri");
            }
        } else {
            Intent intent = new Intent();
            intent.setClass(context, AmeLiveWallpaper.class);
            intent.putExtra("video_path", this.f92687d.getVideoPath());
            intent.putExtra("video_width", this.f92687d.getWidth());
            intent.putExtra("video_height", this.f92687d.getHeight());
            intent.putExtra("source", this.f92687d.getSource());
            if (C36210d.m81722a(context, intent) == null) {
                C36212f.m81734a(1, "start livewallpaper service fail");
            }
        }
    }

    /* renamed from: a */
    public final void mo74956a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            C36212f.m81734a(1, "context is finish");
        } else if (!C48016e.m103944b(this.f92687d.getVideoPath())) {
            C36212f.m81734a(1, "video path is not exist");
        } else {
            if (this.f92686c != null) {
                this.f92686c.mo48507d(this.f92687d.getVideoPath());
                this.f92686c.mo48502b(this.f92687d.getWidth());
                this.f92686c.mo48506d(this.f92687d.getHeight());
                this.f92686c.mo48509f(this.f92687d.getSource());
            }
            C0013i.m16a((Callable<TResult>) new Callable<Void>() {
                public final /* synthetic */ Object call() throws Exception {
                    C48016e.m103947c(C36212f.m81743b());
                    C48016e.m103948c(C36205c.this.f92687d.getVideoPath(), C36212f.m81743b());
                    return null;
                }
            });
            if (C36212f.m81741a((Context) activity, activity.getPackageName())) {
                m81711a((Context) activity);
                return;
            }
            Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
            intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", m81712b(activity));
            try {
                activity.startActivityForResult(intent, 100);
            } catch (Exception unused) {
                C10691a.m21542b(C11010c.m22280a(), (int) R.string.dds).mo19066a();
                C36212f.m81734a(1, "start livewallpaper activity fail");
            }
        }
    }

    /* renamed from: a */
    public final void mo74959a(String str, C36209a aVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f92688e.put(str, aVar);
        }
    }
}
