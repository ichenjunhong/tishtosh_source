package com.bytedance.android.livesdk.feed;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent.C6798a;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.bytedance.android.livesdk.feed.p341i.C6983l;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.depend.model.live.C8706l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LiveFeedRoomPlayComponent extends BaseFeedRoomPlayComponent {

    /* renamed from: s */
    public String f18645s;

    /* renamed from: t */
    private C6799b f18646t;

    /* renamed from: u */
    private C6799b f18647u;

    /* renamed from: v */
    private boolean f18648v;

    /* renamed from: w */
    private long f18649w;

    /* renamed from: com.bytedance.android.livesdk.feed.LiveFeedRoomPlayComponent$a */
    class C6801a extends C6799b {
        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo12963d() {
            LiveFeedRoomPlayComponent.this.mo12986f();
        }

        /* renamed from: f */
        public final void mo12965f() {
            if (LiveFeedRoomPlayComponent.this.f18612c != null) {
                C1352v f = LiveFeedRoomPlayComponent.this.f18612c.mo4847f(this.f18639a);
                if (f != null && (f instanceof C6983l)) {
                    ((C6983l) f).mo13161g();
                }
            }
        }

        /* renamed from: b */
        public final void mo12960b() {
            View c = LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager().mo4736c(this.f18639a);
            if (c == null || c.getBottom() <= 0 || LiveFeedRoomPlayComponent.this.f18612c.getParent() == null) {
                LiveFeedRoomPlayComponent.this.f18616g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.mo12986f();
                return;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) LiveFeedRoomPlayComponent.this.f18616g.getLayoutParams();
            marginLayoutParams.topMargin = (c.getBottom() - marginLayoutParams.height) + ((View) LiveFeedRoomPlayComponent.this.f18612c.getParent()).getPaddingTop();
            marginLayoutParams.rightMargin = LiveFeedRoomPlayComponent.this.f18612c.getPaddingRight() + C3922z.m9899a(1.5f);
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                LiveFeedRoomPlayComponent.this.f18616g.setLayoutParams(marginLayoutParams);
                if (!(LiveFeedRoomPlayComponent.this.f18619j == null || LiveFeedRoomPlayComponent.this.f18619j.getWindow() == null || LiveFeedRoomPlayComponent.this.f18619j.getWindow().getDecorView() == null)) {
                    LiveFeedRoomPlayComponent.this.f18619j.getWindow().getDecorView().requestLayout();
                }
            } else {
                LiveFeedRoomPlayComponent.this.f18616g.post(new C7135u(this, marginLayoutParams));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final int[] mo12962c() {
            int[] iArr = {-1, -1};
            if (LiveFeedRoomPlayComponent.this.f18612c == null) {
                return iArr;
            }
            int j = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager()).mo4749j();
            int l = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager()).mo4751l();
            if (j == -1 || l == -1) {
                return iArr;
            }
            int height = LiveFeedRoomPlayComponent.this.f18612c.getHeight();
            while (j <= l) {
                View c = LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager().mo4736c(j);
                float bottom = ((float) (c.getBottom() - c.getTop())) * 0.7f;
                int i = (int) (((float) height) - bottom);
                if (c.getTop() > 0 && c.getTop() <= i) {
                    FeedItem d = LiveFeedRoomPlayComponent.this.f18614e.mo12998d(j);
                    if (d != null) {
                        if (d.type == 1) {
                            iArr[1] = j;
                        } else if (d.type == 3 && (d.item instanceof C8706l) && ((C8706l) d.item).f23880v != null) {
                            iArr[1] = j;
                        }
                    }
                }
                if (c.getBottom() > 0 && ((float) c.getBottom()) < bottom) {
                    iArr[0] = j;
                }
                j++;
            }
            return iArr;
        }

        C6801a() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12989a(LayoutParams layoutParams) {
            if (LiveFeedRoomPlayComponent.this.f18616g != null && LiveFeedRoomPlayComponent.this.f18616g.getVisibility() == 0) {
                LiveFeedRoomPlayComponent.this.f18616g.setLayoutParams(layoutParams);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12988a(MarginLayoutParams marginLayoutParams) {
            LiveFeedRoomPlayComponent.this.f18616g.setLayoutParams(marginLayoutParams);
            if (LiveFeedRoomPlayComponent.this.f18619j != null && LiveFeedRoomPlayComponent.this.f18619j.getWindow() != null && LiveFeedRoomPlayComponent.this.f18619j.getWindow().getDecorView() != null) {
                LiveFeedRoomPlayComponent.this.f18619j.getWindow().getDecorView().requestLayout();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo12955a(boolean z) {
            if (LiveFeedRoomPlayComponent.this.f18612c == null) {
                return -1;
            }
            int j = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager()).mo4749j();
            int l = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager()).mo4751l();
            if (j == -1 || l == -1) {
                return -1;
            }
            int height = LiveFeedRoomPlayComponent.this.f18612c.getHeight() / 2;
            while (j <= l) {
                View c = LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager().mo4736c(j);
                if (c.getTop() <= height && c.getBottom() >= height) {
                    return j;
                }
                if (c.getTop() > height) {
                    int i = j - 1;
                    if (i >= 0) {
                        View c2 = LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager().mo4736c(i);
                        if (c2 != null && c.getTop() - height >= height - c2.getBottom()) {
                            return i;
                        }
                        return j;
                    }
                }
                j++;
            }
            return -1;
        }

        /* renamed from: c */
        private void m14296c(int i) {
            if (i != -1) {
                while (i > 0) {
                    i--;
                    FeedItem d = LiveFeedRoomPlayComponent.this.f18614e.mo12998d(i);
                    if (d != null && d.type == 1) {
                        Room room = (Room) d.item;
                        if (this.f18641c.get(Long.valueOf(room.getId())) == null && this.f18642d.get(Long.valueOf(room.getId())) == null) {
                            this.f18642d.put(Long.valueOf(room.getId()), Long.valueOf(System.currentTimeMillis()));
                            HashMap hashMap = new HashMap();
                            hashMap.put("enter_from_merge", "live_merge");
                            hashMap.put("enter_method", "live_cover");
                            hashMap.put("log_pb", room.getLog_pb());
                            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                            hashMap.put("request_id", room.getRequestId());
                            hashMap.put("room_id", String.valueOf(room.getId()));
                            hashMap.put("show_type", "streak");
                            hashMap.put("event_belong", "live_view");
                            hashMap.put("event_page", CustomActionPushReceiver.f104061f);
                            hashMap.put("event_type", "core");
                            hashMap.put("event_module", LiveFeedRoomPlayComponent.this.f18645s);
                            C7007b.m14648a("live_cover_show", (Map<String, String>) hashMap);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo12959a(int[] iArr) {
            super.mo12959a(iArr);
            FeedItem d = LiveFeedRoomPlayComponent.this.f18614e.mo12998d(iArr[1]);
            if (d != null && d.type == 1) {
                Room room = (Room) d.item;
                if (this.f18641c.get(Long.valueOf(room.getId())) == null) {
                    this.f18641c.put(Long.valueOf(room.getId()), Long.valueOf(System.currentTimeMillis()));
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from_merge", "live_merge");
                    hashMap.put("enter_method", "live_cover");
                    hashMap.put("log_pb", room.getLog_pb());
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    hashMap.put("request_id", room.getRequestId());
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    hashMap.put("show_type", "stay");
                    hashMap.put("event_belong", "live_view");
                    hashMap.put("event_page", CustomActionPushReceiver.f104061f);
                    hashMap.put("event_type", "core");
                    hashMap.put("action_type", LiveFeedRoomPlayComponent.this.f18645s);
                    C7007b.m14648a("live_cover_show", (Map<String, String>) hashMap);
                    m14296c(iArr[1]);
                }
            }
        }

        /* renamed from: a */
        public final void mo12958a(int i, int i2) {
            boolean z;
            if (i == 0 || i2 == 0) {
                LiveFeedRoomPlayComponent.this.f18616g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.mo12986f();
                return;
            }
            View c = LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager().mo4736c(this.f18639a);
            if (c != null) {
                LayoutParams layoutParams = (LayoutParams) LiveFeedRoomPlayComponent.this.f18616g.getLayoutParams();
                FeedItem d = LiveFeedRoomPlayComponent.this.f18614e.mo12998d(this.f18639a);
                if (d == null || d.item == null || !(d.item instanceof C8706l)) {
                    z = false;
                } else {
                    z = true;
                }
                float f = 0.8f;
                if (i > i2) {
                    float width = (float) c.getWidth();
                    if (z) {
                        f = 0.72f;
                    }
                    layoutParams.width = (int) (width * f);
                    layoutParams.height = (int) (((((float) layoutParams.width) * 1.0f) * ((float) i2)) / ((float) i));
                } else {
                    layoutParams.height = (int) (((float) c.getHeight()) * 0.8f);
                    layoutParams.width = (int) (((((float) layoutParams.height) * 1.0f) * ((float) i)) / ((float) i2));
                }
                if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                    LiveFeedRoomPlayComponent.this.f18616g.setLayoutParams(layoutParams);
                } else {
                    LiveFeedRoomPlayComponent.this.f18616g.post(new C7136v(this, layoutParams));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.LiveFeedRoomPlayComponent$b */
    class C6802b extends C6799b {

        /* renamed from: h */
        private Random f18652h = new Random();

        /* renamed from: i */
        private final List<Integer> f18653i = new ArrayList();

        /* renamed from: j */
        private final List<Integer> f18654j = new ArrayList();

        /* renamed from: k */
        private Handler f18655k = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (LiveFeedRoomPlayComponent.this.f18624o) {
                    int a = C6802b.this.mo12955a(false);
                    if (a == -1) {
                        a = C6802b.this.mo12955a(true);
                    }
                    C6802b.this.mo12961b(a);
                }
            }
        };

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo12963d() {
            LiveFeedRoomPlayComponent.this.mo12986f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo12966g() {
            this.f18655k.removeCallbacksAndMessages(null);
            this.f18655k.sendEmptyMessageDelayed(0, 10000);
        }

        /* renamed from: a */
        public final void mo12957a() {
            super.mo12957a();
            this.f18653i.clear();
            this.f18654j.clear();
            this.f18655k.removeCallbacksAndMessages(null);
        }

        /* renamed from: f */
        public final void mo12965f() {
            if (LiveFeedRoomPlayComponent.this.f18612c != null) {
                C1352v f = LiveFeedRoomPlayComponent.this.f18612c.mo4847f(this.f18639a);
                if (f != null && (f instanceof C6983l)) {
                    ((C6983l) f).mo13161g();
                }
            }
        }

        /* renamed from: b */
        public final void mo12960b() {
            View c = LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager().mo4736c(this.f18639a);
            if (c == null || c.getBottom() <= 0 || LiveFeedRoomPlayComponent.this.f18612c.getParent() == null) {
                LiveFeedRoomPlayComponent.this.f18616g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.mo12986f();
                return;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) LiveFeedRoomPlayComponent.this.f18616g.getLayoutParams();
            marginLayoutParams.topMargin = c.getTop() + ((View) LiveFeedRoomPlayComponent.this.f18612c.getParent()).getPaddingTop();
            marginLayoutParams.rightMargin = (((((View) LiveFeedRoomPlayComponent.this.f18612c.getParent()).getWidth() - c.getLeft()) - c.getWidth()) - LiveFeedRoomPlayComponent.this.f18612c.getPaddingLeft()) + LiveFeedRoomPlayComponent.this.f18612c.getPaddingRight();
            LiveFeedRoomPlayComponent.this.f18616g.setLayoutParams(marginLayoutParams);
        }

        C6802b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo12955a(boolean z) {
            if (LiveFeedRoomPlayComponent.this.f18612c == null) {
                return -1;
            }
            if (C9414h.m18630a(this.f18653i) && C9414h.m18630a(this.f18653i)) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager();
                int s = gridLayoutManager.mo5062s();
                for (int i = 0; i < s; i++) {
                    View g = gridLayoutManager.mo5050g(i);
                    if (gridLayoutManager.mo5030a(g, true, true)) {
                        int f = RecyclerView.m4275f(g);
                        FeedItem d = LiveFeedRoomPlayComponent.this.f18614e.mo12998d(f);
                        if (d != null && d.type == 1) {
                            this.f18653i.add(Integer.valueOf(f));
                        }
                    }
                }
            }
            if (C9414h.m18630a(this.f18654j)) {
                this.f18654j.addAll(this.f18653i);
            }
            if (this.f18654j.contains(Integer.valueOf(this.f18639a))) {
                this.f18654j.remove(Integer.valueOf(this.f18639a));
                if (z) {
                    return this.f18639a;
                }
            }
            while (this.f18654j.size() > 0) {
                Integer num = (Integer) this.f18654j.remove(this.f18652h.nextInt(this.f18654j.size()));
                Room a = mo12956a(num.intValue());
                if (a != null && a.getMosaicStatus() == 0 && !a.isLiveTypeAudio() && a.getStatus() == 2) {
                    return num.intValue();
                }
            }
            return -1;
        }

        /* renamed from: a */
        public final void mo12958a(int i, int i2) {
            if (i == 0 || i2 == 0) {
                LiveFeedRoomPlayComponent.this.f18616g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.mo12986f();
                return;
            }
            View c = LiveFeedRoomPlayComponent.this.f18612c.getLayoutManager().mo4736c(this.f18639a);
            if (c != null) {
                LayoutParams layoutParams = (LayoutParams) LiveFeedRoomPlayComponent.this.f18616g.getLayoutParams();
                layoutParams.height = c.getHeight();
                layoutParams.width = c.getWidth();
                LiveFeedRoomPlayComponent.this.f18616g.setLayoutParams(layoutParams);
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f18653i.clear();
            this.f18654j.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo12929b() {
        if (this.f18648v) {
            return ((Boolean) LiveFeedSettings.LIVE_FEED_ENABLE_PREVIEW.mo9431a()).booleanValue();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C6799b mo12930c() {
        if (this.f18648v) {
            if (this.f18646t == null) {
                this.f18646t = new C6802b();
            }
            return this.f18646t;
        }
        if (this.f18647u == null) {
            this.f18647u = new C6801a();
        }
        return this.f18647u;
    }

    /* renamed from: g */
    public final void mo12987g() {
        if (this.f18647u != null) {
            this.f18647u.mo12967h();
        }
        if (this.f18646t != null) {
            this.f18646t.mo12967h();
        }
    }

    /* renamed from: f */
    public final void mo12986f() {
        if (this.f18649w >= 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", CustomActionPushReceiver.f104061f);
            if (C6926k.f18950l != null) {
                this.f18645s = C6926k.f18950l.f19016h;
            }
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("event_module", this.f18645s);
            if (!(this.f18621l == null || this.f18621l.mo12964e() == null)) {
                Room e = this.f18621l.mo12964e();
                hashMap.put("log_pb", e.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(e.getOwnerUserId()));
                hashMap.put("request_id", e.getRequestId());
                hashMap.put("room_id", String.valueOf(e.getId()));
            }
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.f18649w));
            C7007b.m14648a("live_window_duration", (Map<String, String>) hashMap);
            this.f18649w = -1;
        }
    }

    /* renamed from: d */
    public final void mo12985d(boolean z) {
        this.f18648v = z;
        super.mo12922a();
    }

    public LiveFeedRoomPlayComponent(C6798a aVar) {
        super(aVar);
        this.f18645s = aVar.mo12954i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo12928b(boolean z) {
        if (z) {
            this.f18649w = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", CustomActionPushReceiver.f104061f);
            if (C6926k.f18950l != null) {
                this.f18645s = C6926k.f18950l.f19016h;
            }
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("event_module", this.f18645s);
            if (!(this.f18621l == null || this.f18621l.mo12964e() == null)) {
                Room e = this.f18621l.mo12964e();
                hashMap.put("log_pb", e.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(e.getOwnerUserId()));
                hashMap.put("request_id", e.getRequestId());
                hashMap.put("room_id", String.valueOf(e.getId()));
            }
            C7007b.m14648a("live_window_show", (Map<String, String>) hashMap);
            return;
        }
        mo12986f();
    }
}
