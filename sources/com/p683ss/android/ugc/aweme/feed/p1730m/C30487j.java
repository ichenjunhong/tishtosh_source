package com.p683ss.android.ugc.aweme.feed.p1730m;

import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.C31219v;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30319aj;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.journey.C35781s;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.player.p2050a.C38825a;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbPrecreateplayerExp;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47831dv;
import com.p683ss.android.ugc.aweme.utils.C47832dw;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.m.j */
public final class C30487j extends C26876b<C30480d> {

    /* renamed from: a */
    public C30504w f79685a;

    /* renamed from: b */
    public boolean f79686b;

    /* renamed from: d */
    public int f79687d;

    /* renamed from: e */
    private boolean f79688e;

    /* renamed from: h */
    private boolean f79689h;

    /* renamed from: i */
    private String f79690i = "";

    /* renamed from: j */
    private Fragment f79691j;

    /* renamed from: k */
    private String f79692k;

    /* renamed from: l */
    private C31219v f79693l;

    /* renamed from: m */
    private int f79694m;

    /* renamed from: n */
    private long f79695n;

    /* renamed from: b */
    private static String m71438b(int i) {
        if (i == 4) {
            return "load_more";
        }
        switch (i) {
            case 1:
                return "refresh";
            case 2:
                return "load_latest";
            default:
                return "";
        }
    }

    /* renamed from: c */
    private static String m71439c(int i) {
        switch (i) {
            case 0:
                return "homepage_hot";
            case 1:
                return "homepage_follow";
            case 2:
                return "homepage_fresh";
            default:
                return "";
        }
    }

    /* renamed from: f */
    static final /* synthetic */ Object m71440f() throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 200);
        } catch (JSONException unused) {
        }
        C9951d.m19997a("feed_error", jSONObject);
        return null;
    }

    /* renamed from: g */
    private void m71441g() {
        if (this.f79688e) {
            this.f79688e = false;
            ((C30480d) this.f70700f).f79645a = false;
        }
        C47718bf.m103288a(new C30319aj());
    }

    /* renamed from: e */
    public final boolean mo60913e() {
        if (this.f70700f == null || !((C30480d) this.f70700f).mo60905a()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private FeedAppLogParams m71442h() {
        return new FeedAppLogParams((FeedItemList) ((C30480d) mo54803n()).getData(), ((C30480d) mo54803n()).f79646b, ((C30480d) mo54803n()).getItems());
    }

    /* renamed from: b */
    public final void mo44838b() {
        boolean z;
        C32458a.m75141a(4, "FeedFetchModel", "FeedFetchPresenter called onSuccess!");
        C22574a.m55738f().mo46921b("feed_ui_post_msg_to_feed_ui", false);
        C22574a.m55738f().mo46921b("cold_boot_start_to_feed_ui", false);
        if (C22574a.m55738f().mo46918a("feed_parse_to_ui") && !C22574a.m55738f().mo46922b("feed_parse_to_ui")) {
            C22574a.m55738f().mo46921b("feed_parse_to_ui", true);
        }
        if (!C22574a.m55738f().mo46918a("feed_ui_duration")) {
            C22574a.m55738f().mo46917a("feed_ui_duration", true);
        }
        FeedItemList feedItemList = (FeedItemList) ((C30480d) mo54803n()).getData();
        if (C30436k.m71369a() && feedItemList != null && !C9376b.m18558a((Collection<T>) feedItemList.getItems()) && !feedItemList.isFromLocalCache) {
            C30436k.f79564h.clear();
            C30436k.f79564h.addAll(feedItemList.getItems());
        }
        C30569g.f79851a.set(Boolean.valueOf(true).booleanValue());
        this.f79693l.mo64022a(1, this.f79690i, m71442h());
        this.f79693l.mo64023a(1, this.f79690i, m71442h(), null);
        if (((C30480d) mo54803n()).getData() != null && ((FeedItemList) ((C30480d) mo54803n()).getData()).isFromLocalCache) {
            ((FeedItemList) ((C30480d) mo54803n()).getData()).isFromLocalCache = false;
        }
        m71441g();
        if (this.f79685a != null) {
            C30504w wVar = this.f79685a;
            if (!this.f79689h || this.f79686b) {
                z = true;
            } else {
                z = false;
            }
            wVar.mo55806d(z);
        }
        this.f79689h = false;
        this.f79686b = false;
        if (((C30480d) mo54803n()).getData() != null && C47832dw.m103471a().mo95066a(C47831dv.FEED_FIRST_VIDEO_PRELOAD)) {
            List items = ((FeedItemList) ((C30480d) mo54803n()).getData()).getItems();
            if (!(items == null || items.size() == 0 || items.size() <= 0)) {
                C48107j.m104193f().mo95405a((Aweme) items.get(0));
            }
            Aweme aweme = (Aweme) ((FeedItemList) ((C30480d) mo54803n()).getData()).getItems().get(0);
            if (aweme != null && aweme.getVideo() != null && C10181b.m20511a().mo18168a(PlayeAbPrecreateplayerExp.class, true, "player_precreateplayer", 31744, 0) == 1 && C47832dw.m103471a().mo95066a(C47831dv.PLAYER_FIRST_VIDEO_PREPARED)) {
                C48121w.m104249M().mo95282a(aweme);
            }
        }
        super.mo44838b();
        if (((C30480d) mo54803n()).getData() != null) {
            this.f79695n = SystemClock.elapsedRealtime();
            C38825a a = C38825a.m86239a();
            String requestId = ((FeedItemList) ((C30480d) mo54803n()).getData()).getRequestId();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (requestId != null) {
                a.f98791a.put(requestId, Long.valueOf(elapsedRealtime));
            }
        }
        if (mo54803n() != null && !C9376b.m18558a((Collection<T>) ((C30480d) mo54803n()).getItems())) {
            List items2 = ((C30480d) mo54803n()).getItems();
            if (C35781s.f91899d) {
                C35781s.f91899d = false;
                C35781s.f91898c = 0;
            } else if (C35781s.f91898c == -1) {
                C35781s.f91898c = 2;
            }
            if ((C35781s.f91898c == 2 || C35781s.f91898c == 0) && items2 != null && (!items2.isEmpty()) && ((Aweme) items2.get(0)).isFakeResponse()) {
                C35781s.f91898c = 1;
            }
        }
        if (((C30480d) mo54803n()).getData() == null || ((FeedItemList) ((C30480d) mo54803n()).getData()).getItems() == null || ((FeedItemList) ((C30480d) mo54803n()).getData()).getItems().isEmpty()) {
            C0013i.m18a(C30489l.f79697a, (Executor) C26890h.m65003a());
        }
        if (C22574a.m55738f().mo46918a("feed_ui_duration") && !C22574a.m55738f().mo46922b("feed_ui_duration")) {
            C22574a.m55738f().mo46921b("feed_ui_duration", true);
        }
        if (!C22574a.m55738f().mo46918a("feed_ui_to_video")) {
            C22574a.m55738f().mo46917a("feed_ui_to_video", true);
        }
        C22574a.m55738f().mo46917a("feed_ui_to_texture_available", false);
    }

    /* renamed from: a */
    public final void mo60911a(boolean z) {
        ((C30480d) this.f70700f).f79645a = z;
        this.f79688e = z;
    }

    public C30487j(Fragment fragment) {
        this.f79691j = fragment;
        this.f79693l = new C31219v(fragment);
    }

    /* renamed from: b */
    static final /* synthetic */ Object m71437b(Exception exc) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", C10201a.m20661a((Throwable) exc, (String[]) null));
        } catch (JSONException unused) {
        }
        C9951d.m19997a("feed_error", jSONObject);
        return null;
    }

    /* renamed from: a */
    public final boolean mo46994a(C26882h hVar) {
        if (this.f70734c != null) {
            return this.f70734c.mo50463a(hVar);
        }
        return false;
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        this.f79690i = m71438b(objArr[0].intValue());
        if (5 == this.f79694m) {
            this.f79690i = "press_back";
        }
        this.f79692k = m71439c(objArr[1].intValue());
        StringBuilder sb = new StringBuilder("FeedFetchPresenter sendRequest on:");
        sb.append(this.f79692k);
        C32458a.m75141a(4, "FeedFetchModel", sb.toString());
        this.f79693l.mo64024a(this.f79690i);
        if (this.f79685a != null) {
            this.f79685a.mo55806d(this.f79686b);
        }
        this.f79689h = super.mo44934a_(objArr);
        return this.f79689h;
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        boolean z;
        C32458a.m75141a(4, "FeedFetchModel", "FeedFetchPresenter called onFailed!");
        this.f79693l.mo64022a(0, this.f79690i, null);
        this.f79693l.mo64023a(0, this.f79690i, null, exc);
        if (exc != null && !TextUtils.isEmpty(exc.getMessage())) {
            C0013i.m18a((Callable<TResult>) new C30488k<TResult>(exc), (Executor) C26890h.m65003a());
            try {
                if (C35781s.f91898c == -1) {
                    C35781s.f91898c = C10201a.m20661a((Throwable) exc, (String[]) null);
                }
            } catch (Exception unused) {
            }
        }
        m71441g();
        if (this.f79685a != null) {
            C30504w wVar = this.f79685a;
            if (!this.f79689h || this.f79686b) {
                z = true;
            } else {
                z = false;
            }
            wVar.mo55806d(z);
        }
        this.f79689h = false;
        this.f79686b = false;
        super.mo44840c_(exc);
        C35857a.m81008e();
    }

    /* renamed from: a */
    public final boolean mo60912a(int i, Object... objArr) {
        this.f79694m = 5;
        return mo44934a_(objArr);
    }
}
