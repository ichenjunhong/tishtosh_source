package com.p683ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.live.C8657i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.android.livesdkapi.p450h.C8752c;
import com.bytedance.android.livesdkapi.p458l.C8833a;
import com.bytedance.android.livesdkapi.view.C8865b;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.p753k.C12103a;
import com.bytedance.p753k.p754a.p755a.C12109d;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.sdk.p1207a.C19717a;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.live.p1923f.C36076a;
import com.p683ss.android.ugc.aweme.live.p1923f.C36079c.C36081a;
import com.p683ss.android.ugc.aweme.live.p1924g.C36094a;
import com.p683ss.android.ugc.aweme.main.C36640eh;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.ss.android.ugc.aweme.live.LivePlayActivity */
public class LivePlayActivity extends BaseLiveSdkActivity implements C8752c {

    /* renamed from: k */
    private static long f92255k;

    /* renamed from: a */
    public C36081a f92256a = new C36081a();

    /* renamed from: b */
    private Rect f92257b;

    /* renamed from: c */
    private Fragment f92258c;

    /* renamed from: d */
    private C8657i f92259d;

    /* renamed from: e */
    private boolean f92260e = false;

    /* renamed from: f */
    private boolean f92261f = false;

    /* renamed from: g */
    private boolean f92262g = false;

    /* renamed from: h */
    private boolean f92263h = false;

    /* renamed from: i */
    private String f92264i = "";

    /* renamed from: j */
    private HashMap f92265j;

    /* renamed from: l */
    private C1690c f92266l;

    /* renamed from: m */
    private C36094a f92267m;

    /* renamed from: n */
    private int f92268n = 0;

    /* renamed from: a */
    public final void mo15413a() {
    }

    /* renamed from: a */
    public final void mo15414a(String str) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo74728c() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        return super.getResources();
    }

    /* renamed from: b */
    public final void mo74727b() {
        if (!this.f92260e) {
            m81200d();
            super.finish();
            return;
        }
        C36076a.m81448a(findViewById(R.id.cfg), this.f92257b, new C36176y(this), new View[0]);
    }

    public void onBackPressed() {
        if ((this.f92258c instanceof C8865b) && !((C8865b) this.f92258c).mo12867a()) {
            super.onBackPressed();
        }
    }

    /* renamed from: d */
    private void m81200d() {
        if (getIntent() != null) {
            long longExtra = getIntent().getLongExtra("current_room_id", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("has_page_slide", false);
            if (longExtra > 0 && booleanExtra) {
                C36148r.m81573a().sendLiveRoomScrollEvent(longExtra);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        String stringExtra = getIntent().getStringExtra("player_tag");
        if (!(stringExtra == null || C8830k.m17330d() == null)) {
            C8830k.m17330d().mo15049b(stringExtra);
        }
        Live.getService().mo15052e().mo13795b(hashCode());
        if (this.f92266l != null) {
            this.f92266l.dispose();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", true);
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
            return;
        }
        super.onResume();
        C47859eq.m103529a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if (r2 != false) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r6 = this;
            boolean r0 = r6.f92263h
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0020
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x0020
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "live_room_effect_watch_one_min"
            boolean r0 = r0.getBooleanExtra(r3, r2)
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.main.f.a r0 = new com.ss.android.ugc.aweme.main.f.a
            r0.<init>()
            r0.mo74850a(r1)
        L_0x0020:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "backurl"
            java.lang.String r0 = r0.getStringExtra(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x007e
            android.content.Intent r3 = r6.getIntent()
            if (r3 == 0) goto L_0x0050
            java.lang.String r4 = "host_room_status_event"
            android.os.Parcelable r3 = r3.getParcelableExtra(r4)
            com.bytedance.android.live.base.event.RoomStatusEvent r3 = (com.bytedance.android.live.base.event.RoomStatusEvent) r3
            if (r3 == 0) goto L_0x0050
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r3)
            com.ss.android.ugc.aweme.live.ILiveHostOuterService r4 = com.p683ss.android.ugc.aweme.live.C36148r.m81573a()
            com.ss.android.ugc.aweme.live.ILiveHostOuterService r4 = (com.p683ss.android.ugc.aweme.live.ILiveHostOuterService) r4
            boolean r3 = r3.f8662c
            boolean r5 = r6.f92261f
            r4.startMainActivity(r6, r3, r5)
        L_0x0050:
            android.graphics.Rect r3 = r6.f92257b
            if (r3 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.live.f.c$a r0 = r6.f92256a
            if (r0 != 0) goto L_0x005f
            com.ss.android.ugc.aweme.live.f.c$a r0 = new com.ss.android.ugc.aweme.live.f.c$a
            r0.<init>()
            r6.f92256a = r0
        L_0x005f:
            com.ss.android.ugc.aweme.live.f.c$a r0 = r6.f92256a
            com.p683ss.android.ugc.aweme.live.p1923f.C36079c.m81449a(r6, r0)
            com.ss.android.ugc.aweme.live.f.c$a r0 = r6.f92256a
            boolean r0 = r0.f92445a
            if (r0 == 0) goto L_0x006e
            r6.mo74727b()
            return
        L_0x006e:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.ss.android.ugc.aweme.live.LivePlayActivity$1 r1 = new com.ss.android.ugc.aweme.live.LivePlayActivity$1
            r1.<init>(r0)
            r2 = 50
            r0.postDelayed(r1, r2)
            return
        L_0x007e:
            super.finish()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r6.isTaskRoot()
            if (r0 == 0) goto L_0x00b8
            android.content.Intent r0 = r6.getIntent()
            if (r0 != 0) goto L_0x0094
            goto L_0x00b8
        L_0x0094:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
            java.lang.String r0 = r0.getStringExtra(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r0
            com.ss.android.ugc.aweme.i.c r0 = r0.getLiveWatcherUtils()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.mo70089a(r6, r1)
            goto L_0x00b8
        L_0x00b7:
            r2 = 1
        L_0x00b8:
            if (r2 == 0) goto L_0x00bd
        L_0x00ba:
            com.p683ss.android.ugc.aweme.push.C40884a.m90455a(r6)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.live.LivePlayActivity.finish():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @C53771m
    public void onEvent(C19717a aVar) {
        if (Live.getService() != null) {
            Live.getService().mo15054g().mo15021b();
        }
    }

    public void setTheme(int i) {
        Bundle bundleExtra = getIntent().getBundleExtra("live_play_params");
        if (bundleExtra == null || bundleExtra.getParcelable("live.intent.extra.SOURCE_POSITION") == null) {
            super.setTheme(R.style.a2);
        } else {
            super.setTheme(R.style.a2);
        }
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (this.f92262g && TextUtils.equals(CustomActionPushReceiver.f104061f, hVar.itemType)) {
            C12103a.m24530b(C8612a.class);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r0.getBoolean("live.intent.extra.FROM_NEW_STYLE", false) != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r1 != false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r14) {
        /*
            r13 = this;
            super.onNewIntent(r14)
            if (r14 != 0) goto L_0x0006
            return
        L_0x0006:
            com.bytedance.android.livesdkapi.depend.live.i r0 = r13.f92259d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0056
            com.bytedance.android.livesdkapi.depend.live.i r0 = r13.f92259d
            com.bytedance.android.livesdkapi.depend.live.j r0 = r0.mo12871c()
            if (r0 == 0) goto L_0x0056
            com.bytedance.android.livesdkapi.depend.live.i r0 = r13.f92259d
            com.bytedance.android.livesdkapi.depend.live.j r0 = r0.mo12871c()
            android.support.v4.app.Fragment r0 = r0.mo12049i()
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L_0x0039
            java.lang.String r3 = "live.intent.extra.ROOM_ID"
            r4 = -1
            long r3 = r0.getLong(r3, r4)
            java.lang.String r5 = "room_id"
            r6 = -2
            long r5 = r14.getLongExtra(r5, r6)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0039
            return
        L_0x0039:
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = "live.intent.extra.FROM_NEW_STYLE"
            boolean r3 = r0.getBoolean(r3, r2)
            if (r3 == 0) goto L_0x0045
        L_0x0043:
            r0 = 1
            goto L_0x0057
        L_0x0045:
            java.lang.String r3 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r0 = r0.getBundle(r3)
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = "live.intent.extra.FROM_NEW_STYLE"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L_0x0056
            goto L_0x0043
        L_0x0056:
            r0 = 0
        L_0x0057:
            java.lang.String r3 = "live_play_params"
            android.os.Bundle r3 = r14.getBundleExtra(r3)
            java.lang.String r4 = "room_id"
            r5 = 0
            long r7 = r14.getLongExtra(r4, r5)
            r9 = -3
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x006c
            return
        L_0x006c:
            r11 = -4
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x009c
            android.content.Intent r14 = r13.getIntent()
            if (r14 == 0) goto L_0x0098
            android.content.Intent r14 = r13.getIntent()
            java.lang.String r0 = "room_id"
            long r3 = r14.getLongExtra(r0, r5)
            int r14 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.live.g.a r14 = r13.f92267m
            if (r14 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.live.g.a r14 = r13.f92267m
            boolean r0 = r14.f92478c
            if (r0 != 0) goto L_0x0096
            boolean r14 = r14.f92479d
            if (r14 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r1 = 0
        L_0x0096:
            if (r1 == 0) goto L_0x009b
        L_0x0098:
            r13.finish()
        L_0x009b:
            return
        L_0x009c:
            android.content.Intent r4 = r13.getIntent()
            r11 = 0
            if (r4 == 0) goto L_0x00b5
            android.content.Intent r4 = r13.getIntent()
            java.lang.String r12 = "room_id"
            long r4 = r4.getLongExtra(r12, r5)
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r13.f92267m = r11
            goto L_0x00b8
        L_0x00b5:
            r13.setIntent(r14)
        L_0x00b8:
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "push"
            java.lang.String r4 = "enter_from_merge"
            java.lang.String r4 = r3.getString(r4)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = "push"
            java.lang.String r4 = "enter_method"
            java.lang.String r4 = r3.getString(r4)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00db
        L_0x00d6:
            java.lang.String r0 = "live.intent.extra.FROM_NEW_STYLE"
            r3.putBoolean(r0, r1)
        L_0x00db:
            com.bytedance.android.livesdkapi.service.e r0 = com.p683ss.android.ugc.aweme.live.Live.getService()
            com.bytedance.android.livesdkapi.depend.live.i r0 = r0.mo15029a(r7, r3)
            r13.f92259d = r0
            com.bytedance.android.livesdkapi.depend.live.i r0 = r13.f92259d
            android.support.v4.app.Fragment r0 = r0.mo12869b()
            r13.f92258c = r0
            android.support.v4.app.Fragment r0 = r13.f92258c
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L_0x0145
            android.support.v4.app.Fragment r0 = r13.f92258c
            android.os.Bundle r0 = r0.getArguments()
            java.lang.String r4 = "live.intent.extra.ROOM_ID"
            r0.putLong(r4, r7)
            android.support.v4.app.Fragment r0 = r13.f92258c
            android.os.Bundle r0 = r0.getArguments()
            java.lang.String r4 = "extra_bool_flag_from_new_intent"
            r0.putBoolean(r4, r1)
            android.support.v4.app.Fragment r0 = r13.f92258c
            android.os.Bundle r0 = r0.getArguments()
            java.lang.String r4 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE"
            java.lang.String r5 = "click"
            r0.putString(r4, r5)
            android.support.v4.app.Fragment r0 = r13.f92258c
            android.os.Bundle r0 = r0.getArguments()
            java.lang.String r4 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME"
            long r5 = f92255k
            r0.putLong(r4, r5)
            android.support.v4.app.Fragment r0 = r13.f92258c
            android.os.Bundle r0 = r0.getArguments()
            java.lang.String r4 = "previous_page"
            java.lang.String r5 = r13.f92264i
            r0.putString(r4, r5)
            java.lang.String r0 = "player_tag"
            java.lang.String r14 = r14.getStringExtra(r0)
            if (r14 == 0) goto L_0x0145
            android.support.v4.app.Fragment r0 = r13.f92258c
            android.os.Bundle r0 = r0.getArguments()
            java.lang.String r4 = "live.intent.extra.WARM_UP_PLAYER_TAG"
            r0.putString(r4, r14)
        L_0x0145:
            if (r3 == 0) goto L_0x0151
            java.lang.String r14 = "enter_from_dou_plus"
            boolean r14 = r3.getBoolean(r14, r2)
            if (r14 == 0) goto L_0x0151
            r14 = 1
            goto L_0x0152
        L_0x0151:
            r14 = 0
        L_0x0152:
            r13.f92262g = r14
            boolean r14 = r13.f92262g
            if (r14 == 0) goto L_0x0166
            java.lang.String r14 = "live_douplus_log_extra"
            java.io.Serializable r14 = r3.getSerializable(r14)
            boolean r0 = r14 instanceof java.util.HashMap
            if (r0 == 0) goto L_0x0166
            java.util.HashMap r14 = (java.util.HashMap) r14
            r13.f92265j = r14
        L_0x0166:
            android.support.v4.app.k r14 = r13.getSupportFragmentManager()
            android.support.v4.app.r r14 = r14.mo2225a()
            r0 = 2132019228(0x7f14081c, float:1.9676785E38)
            android.support.v4.app.Fragment r4 = r13.f92258c
            r14.mo2191b(r0, r4)
            r14.mo2189b()
            if (r3 == 0) goto L_0x01a4
            java.lang.String r14 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r14 = r3.getBundle(r14)
            java.lang.String r0 = "1"
            java.lang.String r4 = "enable_feed_drawer"
            java.lang.String r5 = "0"
            java.lang.String r3 = r3.getString(r4, r5)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01a3
            if (r14 == 0) goto L_0x01a4
            java.lang.String r0 = "1"
            java.lang.String r3 = "enable_feed_drawer"
            java.lang.String r4 = "0"
            java.lang.String r14 = r14.getString(r3, r4)
            boolean r14 = r0.equals(r14)
            if (r14 == 0) goto L_0x01a4
        L_0x01a3:
            r2 = 1
        L_0x01a4:
            if (r2 == 0) goto L_0x01bf
            android.content.Intent r14 = r13.getIntent()
            if (r14 == 0) goto L_0x01b6
            android.content.Intent r14 = r13.getIntent()
            java.lang.String r0 = "live_play_params"
            android.os.Bundle r11 = r14.getBundleExtra(r0)
        L_0x01b6:
            if (r11 == 0) goto L_0x01bf
            java.lang.String r14 = "enable_feed_drawer"
            java.lang.String r0 = "1"
            r11.putString(r14, r0)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.live.LivePlayActivity.onNewIntent(android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", true);
        Intent intent = getIntent();
        long longExtra = intent.getLongExtra("room_id", 0);
        Bundle bundleExtra = intent.getBundleExtra("live_play_params");
        super.onCreate(bundle);
        if (bundleExtra != null) {
            if (bundleExtra.getBundle("live.intent.extra.ENTER_LIVE_EXTRA") != null) {
                this.f92263h = TextUtils.equals("live_square", bundleExtra.getBundle("live.intent.extra.ENTER_LIVE_EXTRA").getString("enter_from_live_square"));
            }
            this.f92257b = (Rect) bundleExtra.getParcelable("live.intent.extra.SOURCE_POSITION");
            Bundle bundle2 = bundleExtra.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle2 == null || !TextUtils.equals(bundle2.getString("enter_from_merge"), "push")) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f92261f = z2;
            if (bundle2 != null) {
                this.f92264i = bundle2.getString("previous_page");
            }
            if (bundleExtra == null || !bundleExtra.getBoolean("enter_from_dou_plus", false)) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.f92262g = z3;
            if (this.f92262g) {
                Serializable serializable = bundleExtra.getSerializable("live_douplus_log_extra");
                if (serializable instanceof HashMap) {
                    this.f92265j = (HashMap) serializable;
                }
            }
            if (this.f92257b == null || !this.f92260e) {
                try {
                    C8833a.m17336a((Object) this, "convertFromTranslucent", new Object[0]);
                } catch (Throwable th) {
                    C32458a.m75148a(th);
                }
                if (TextUtils.isEmpty(bundleExtra.getString("live.intent.extra.PULL_SHARE_URL")) || bundleExtra.getBoolean("enter_from_live_follow")) {
                    overridePendingTransition(R.anim.bm, R.anim.bv);
                }
            } else {
                overridePendingTransition(0, 0);
            }
        }
        setContentView((int) R.layout.bl6);
        if (this.f92260e && this.f92257b != null) {
            View findViewById = findViewById(R.id.cfg);
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(findViewById, this.f92257b, new View[0]) {

                /* renamed from: a */
                final /* synthetic */ View f92440a;

                /* renamed from: b */
                final /* synthetic */ Rect f92441b;

                /* renamed from: c */
                final /* synthetic */ View[] f92442c;

                public final void onGlobalLayout() {
                    View[] viewArr;
                    this.f92440a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.f92440a.setPivotX((float) this.f92441b.centerX());
                    this.f92440a.setPivotY((float) this.f92441b.centerY());
                    this.f92440a.setScaleX(0.0f);
                    this.f92440a.setScaleY(0.0f);
                    this.f92440a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(C36078b.f92443a).start();
                    if (this.f92442c != null && this.f92442c.length != 0) {
                        for (View view : this.f92442c) {
                            Rect rect = new Rect();
                            if (view != null) {
                                int[] iArr = new int[2];
                                view.getLocationOnScreen(iArr);
                                rect.left = iArr[0];
                                rect.top = iArr[1];
                                rect.right = iArr[0] + view.getMeasuredWidth();
                                rect.bottom = iArr[1] + view.getMeasuredHeight();
                                view.setTranslationX((float) (this.f92441b.left - rect.left));
                                view.setTranslationY((float) (this.f92441b.top - rect.top));
                                view.setPivotX(0.0f);
                                view.setPivotY(0.0f);
                                view.setScaleX(((float) this.f92441b.width()) / ((float) view.getWidth()));
                                view.setScaleY(((float) this.f92441b.height()) / ((float) view.getHeight()));
                                view.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(200).start();
                            }
                        }
                    }
                }

                {
                    this.f92440a = r1;
                    this.f92441b = r2;
                    this.f92442c = r3;
                }
            });
        }
        getWindow().setSoftInputMode(48);
        getWindow().addFlags(128);
        if (VERSION.SDK_INT != 19 && !C23059a.m56592a(this)) {
            C36148r.m81573a().hideStatusBar(this);
        }
        Live.getService().mo15052e().mo13794a(hashCode(), this);
        if (longExtra == -3) {
            z = true;
        } else {
            z = false;
        }
        int i = 8;
        if (z) {
            this.f92267m = new C36094a(this);
            C36094a aVar = this.f92267m;
            if (aVar.f92481f != null) {
                aVar.f92481f.setVisibility(0);
            }
            View view = aVar.f92480e;
            if (aVar.f92478c) {
                i = 0;
            }
            C9432q.m18691b(view, i);
            if (!(aVar.f92476a == null || aVar.f92476a.getIntent() == null)) {
                Bundle bundleExtra2 = aVar.f92476a.getIntent().getBundleExtra("live_play_params");
                if (bundleExtra2 != null) {
                    long j = bundleExtra2.getLong("live.intent.extra.LOADING_SHOW", 0);
                    if (j > 0) {
                        bundleExtra2.remove("live.intent.extra.LOADING_SHOW");
                        aVar.f92482g = SystemClock.elapsedRealtime() - j;
                    }
                }
            }
            C36094a aVar2 = this.f92267m;
            if (aVar2.f92479d && aVar2.f92476a != null) {
                C9432q.m18691b((View) aVar2.f92477b, 0);
                float a = ((float) C9432q.m18670a(((C12109d) C12103a.m24530b(C12109d.class)).mo22890a())) / ((float) C9432q.m18688b(((C12109d) C12103a.m24530b(C12109d.class)).mo22890a()));
                StringBuilder sb = new StringBuilder("res://");
                sb.append(aVar2.f92476a.getPackageName());
                sb.append("/2131954633");
                C5213c.m11823a(aVar2.f92477b, sb.toString(), (C14234d) new C4620v(5, a, null));
            }
            boolean z4 = aVar2.f92479d;
        } else {
            if (this.f92267m != null) {
                C36094a aVar3 = this.f92267m;
                aVar3.f92478c = false;
                C9432q.m18691b((View) aVar3.f92481f, 8);
                if (!aVar3.f92479d && !aVar3.f92478c) {
                    C9432q.m18691b(aVar3.f92480e, 8);
                }
                if (aVar3.f92482g > 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("duration", String.valueOf(aVar3.f92482g));
                    C8049c.m15979a().mo14202a("livesdk_pre_loading_duration", hashMap, new C8059j(), Room.class);
                    aVar3.f92482g = 0;
                }
            }
            if (this.f92267m != null) {
                C36094a aVar4 = this.f92267m;
                aVar4.f92479d = false;
                C9432q.m18691b((View) aVar4.f92477b, 8);
                if (!aVar4.f92479d && !aVar4.f92478c) {
                    C9432q.m18691b(aVar4.f92480e, 8);
                }
            }
        }
        if (!z) {
            C0679r a2 = getSupportFragmentManager().mo2225a();
            this.f92259d = Live.getService().mo15029a(longExtra, bundleExtra);
            this.f92258c = this.f92259d.mo12869b();
            if (this.f92258c.getArguments() != null) {
                this.f92258c.getArguments().putLong("live.intent.extra.ROOM_ID", longExtra);
                this.f92258c.getArguments().putString("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE", "click");
                this.f92258c.getArguments().putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", f92255k);
                String stringExtra = intent.getStringExtra("player_tag");
                if (stringExtra != null) {
                    this.f92258c.getArguments().putString("live.intent.extra.WARM_UP_PLAYER_TAG", stringExtra);
                }
            }
            a2.mo2175a((int) R.id.ajf, this.f92258c);
            a2.mo2189b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", false);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C8830k.m17330d().mo15054g().mo15020a(0, i, keyEvent);
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public static void m81198a(Context context, long j, Bundle bundle) {
        f92255k = System.currentTimeMillis();
        if (!C36148r.m81573a().isEnableShowTeenageTip()) {
            Intent intent = new Intent(context, LivePlayActivity.class);
            intent.putExtra("room_id", j);
            intent.putExtra("live_play_params", bundle);
            intent.putExtra("backurl", bundle.getString("backUrl"));
            int i = bundle.getInt("live.intent.extra.BACK_TAB_INDEX", -1);
            if (i >= 0) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", C36640eh.m82543a(Integer.valueOf(i)));
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            String a = Live.getService().mo15034a(j, bundle, context);
            if (a != null) {
                intent.putExtra("player_tag", a);
            }
            context.startActivity(intent);
            return;
        }
        if (TextUtils.equals(bundle.getString("enter_method", ""), "push")) {
            C46641d.m101211a(bundle.getString("anchor_id", ""), j, "user_is_teen_mode");
        }
    }
}
