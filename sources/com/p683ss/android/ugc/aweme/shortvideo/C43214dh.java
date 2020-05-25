package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.draft.C29051b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24437f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.IInternalAVService;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dh */
public class C43214dh implements C24437f, C29051b {

    /* renamed from: k */
    public static boolean f109284k;

    /* renamed from: l */
    private static C43214dh f109285l;

    /* renamed from: a */
    public C42482c f109286a;

    /* renamed from: b */
    public List<AVChallenge> f109287b = new ArrayList();

    /* renamed from: c */
    public C43305e f109288c = null;

    /* renamed from: d */
    public C43804f f109289d = null;

    /* renamed from: e */
    public String f109290e;

    /* renamed from: f */
    public int f109291f;

    /* renamed from: g */
    public AVChallenge f109292g = null;

    /* renamed from: h */
    public String f109293h;

    /* renamed from: i */
    public RecordScene f109294i;

    /* renamed from: j */
    public volatile boolean f109295j = false;

    /* renamed from: m */
    private C42482c f109296m;

    /* renamed from: n */
    private int f109297n;

    /* renamed from: i */
    public static boolean m94820i() {
        return f109284k;
    }

    /* renamed from: b */
    public final C42482c mo50201b() {
        return this.f109296m;
    }

    /* renamed from: c */
    public final void mo87853c() {
        this.f109288c = null;
    }

    /* renamed from: d */
    public final void mo87854d() {
        this.f109289d = null;
    }

    /* renamed from: e */
    public final void mo87855e() {
        this.f109293h = "";
    }

    /* renamed from: g */
    public final void mo87857g() {
        this.f109287b.clear();
    }

    /* renamed from: f */
    public final String mo87856f() {
        if (this.f109293h != null) {
            return this.f109293h;
        }
        return "";
    }

    private C43214dh() {
        C39629l.m88232a().mo58573d().mo80731a((C29051b) this);
    }

    /* renamed from: a */
    public static C43214dh m94817a() {
        if (f109285l == null) {
            synchronized (C43214dh.class) {
                if (f109285l == null) {
                    f109285l = new C43214dh();
                }
            }
        }
        return f109285l;
    }

    /* renamed from: h */
    public final boolean mo87858h() {
        IInternalAVService createIInternalAVServicebyMonsterPlugin = AVServiceImpl.createIInternalAVServicebyMonsterPlugin();
        if (createIInternalAVServicebyMonsterPlugin.enableMultiPublisherScheduler()) {
            return createIInternalAVServicebyMonsterPlugin.isPublishServiceRunning(null);
        }
        int i = this.f109297n;
        if (i != 0) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo50200a(C42482c cVar) {
        this.f109296m = cVar;
    }

    /* renamed from: a */
    public final void mo87849a(int i) {
        this.f109297n = i;
        m94819b(i);
    }

    /* renamed from: b */
    private void m94819b(int i) {
        switch (i) {
            case 9:
            case 10:
            case 12:
                this.f109293h = "";
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static void m94818a(RecordScene recordScene) {
        if (recordScene != null && recordScene.extractFramesModel != null) {
            C48016e.m103954e(recordScene.extractFramesModel.extractFramesDir);
            C48016e.m103947c(recordScene.extractFramesModel.extractFramesDir);
        }
    }

    /* renamed from: a */
    public final void mo87850a(AVChallenge aVChallenge) {
        if (aVChallenge != null && aVChallenge.getCid() != null) {
            this.f109287b.clear();
            this.f109287b.add(aVChallenge);
        }
    }

    /* renamed from: a */
    public final void mo87851a(Collection<AVChallenge> collection) {
        if (collection != null) {
            this.f109287b.clear();
            this.f109287b.addAll(collection);
        }
    }

    /* renamed from: a */
    public final boolean mo87852a(Context context) {
        IInternalAVService createIInternalAVServicebyMonsterPlugin = AVServiceImpl.createIInternalAVServicebyMonsterPlugin();
        if (!mo87858h() || !createIInternalAVServicebyMonsterPlugin.isPublishServiceRunning(context)) {
            return true;
        }
        C10691a.m21548c(context.getApplicationContext(), (int) R.string.hr).mo19066a();
        return false;
    }

    /* renamed from: a */
    public final void mo49538a(C29059c cVar, boolean z) {
        if (!z) {
            mo87855e();
        }
    }
}
