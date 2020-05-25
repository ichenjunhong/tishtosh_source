package com.p683ss.android.ugc.aweme.live.p1921d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8653c;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8654d;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.video.rtc.interact.controller.SEIHelper;
import com.p683ss.video.rtc.interact.controller.SEIHelper.Callback;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.SEI;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.d.d */
public final class C36069d implements C8653c, C36068c, Callback {

    /* renamed from: a */
    public String f92423a;

    /* renamed from: b */
    public TextureRenderView f92424b;

    /* renamed from: c */
    public C8649h f92425c;

    /* renamed from: d */
    private boolean f92426d;

    /* renamed from: e */
    private C36067b f92427e;

    /* renamed from: f */
    private LiveRoomStruct f92428f;

    /* renamed from: g */
    private FrameLayout f92429g;

    /* renamed from: h */
    private C36066a f92430h;

    /* renamed from: i */
    private Runnable f92431i;

    /* renamed from: j */
    private SEIHelper f92432j;

    /* renamed from: k */
    private int f92433k;

    /* renamed from: l */
    private int f92434l;

    /* renamed from: m */
    private int f92435m;

    /* renamed from: d */
    public final TextureRenderView mo74825d() {
        return this.f92424b;
    }

    public final boolean isVersionSupported(int i) {
        return i == 1;
    }

    public final void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
    }

    /* renamed from: g */
    private Context m81432g() {
        if (this.f92429g == null) {
            return null;
        }
        return this.f92429g.getContext();
    }

    /* renamed from: h */
    private void m81433h() {
        if (this.f92425c != null) {
            this.f92425c.mo14273d(m81432g());
        }
    }

    /* renamed from: e */
    private void m81430e() {
        try {
            this.f92425c.mo14268a((String) null, (TextureView) null, 0, (C8654d) null, (C8653c) null, (String) null);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    /* renamed from: f */
    private void m81431f() {
        if (this.f92424b != null) {
            this.f92424b.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f92424b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f92424b);
            }
        }
    }

    /* renamed from: a */
    public final void mo74820a() {
        if (this.f92425c != null && TextUtils.equals(this.f92423a, this.f92425c.mo14283k())) {
            m81430e();
            m81433h();
            m81431f();
        }
    }

    /* renamed from: b */
    public final void mo74823b() {
        if (this.f92425c != null && TextUtils.equals(this.f92423a, this.f92425c.mo14283k())) {
            m81433h();
            m81431f();
        }
    }

    /* renamed from: c */
    public final void mo74824c() {
        if (this.f92425c != null) {
            m81433h();
            this.f92425c.mo14275e(m81432g());
        }
        m81431f();
    }

    /* renamed from: b */
    private void m81429b(boolean z) {
        if (this.f92424b != null) {
            if (z) {
                LayoutParams layoutParams = this.f92424b.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 85;
                    this.f92424b.setLayoutParams(layoutParams);
                }
                return;
            }
            LayoutParams layoutParams2 = this.f92424b.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
                this.f92424b.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: a */
    public final void mo74821a(boolean z) {
        if (!(this.f92425c == null || m81432g() == null)) {
            try {
                this.f92425c.mo14270a(z, m81432g());
            } catch (Exception e) {
                C32458a.m75150b("LivePlayHelper", Log.getStackTraceString(e));
            }
        }
    }

    public final void onSeiUpdated(SEI sei) {
        this.f92433k = 0;
        if (sei != null) {
            List<Region> gridList = sei.getGridList();
            if (gridList != null && this.f92428f != null) {
                long anchorId = this.f92428f.getAnchorId();
                int i = 0;
                for (Region region : gridList) {
                    if (!(region == null || region.getUserId() == anchorId)) {
                        if (i <= 0) {
                            int width = this.f92429g.getWidth();
                            int height = this.f92429g.getHeight();
                            float f = ((float) width) / ((float) this.f92434l);
                            float f2 = (float) this.f92435m;
                            float f3 = ((float) height) / f2;
                            if (f <= f3) {
                                f = f3;
                            }
                            float f4 = f2 * f;
                            region.getX();
                            region.getWidth();
                            double d = (double) f4;
                            double y = (1.0d - region.getY()) - region.getHeight();
                            Double.isNaN(d);
                            i = (int) (d * y);
                            region.getWidth();
                            region.getHeight();
                        }
                        this.f92433k++;
                    }
                }
                if (this.f92430h != null) {
                    if (gridList.size() == 1) {
                        m81429b(true);
                    } else if (gridList.size() > 1) {
                        m81429b(true);
                    } else {
                        m81429b(false);
                    }
                }
            }
        }
    }

    public C36069d(Runnable runnable, C36067b bVar) {
        C8649h hVar;
        if (C36173w.m81665a() != null) {
            hVar = C36173w.m81665a().getLive().mo15051d();
        } else {
            hVar = null;
        }
        this.f92425c = hVar;
        this.f92433k = 0;
        this.f92431i = runnable;
        this.f92427e = bVar;
    }

    /* renamed from: a */
    public final void mo10922a(C8652b bVar, Object obj) {
        switch (bVar) {
            case VIDEO_SIZE_CHANGED:
                if (this.f92427e != null) {
                    int parseInt = Integer.parseInt((String) obj);
                    int i = 65535 & parseInt;
                    this.f92434l = i;
                    int i2 = parseInt >> 16;
                    this.f92435m = i2;
                    StringBuilder sb = new StringBuilder("width = ");
                    sb.append(i);
                    sb.append("; height = ");
                    sb.append(i2);
                    C18778a.m45848b("LivePlayHelper", sb.toString());
                    this.f92427e.mo60360a(this.f92424b, this.f92434l, this.f92435m);
                    if (this.f92424b != null) {
                        this.f92424b.setScaleType(2);
                        this.f92424b.mo15861a(this.f92434l, this.f92435m);
                        break;
                    }
                }
                break;
            case DISPLAYED_PLAY:
                if (this.f92431i != null) {
                    this.f92431i.run();
                    break;
                }
                break;
            case INTERACT_SEI:
                if (obj instanceof String) {
                    if (this.f92432j != null) {
                        this.f92432j.updateSei((String) obj);
                    }
                    if (!TextUtils.isEmpty((String) obj)) {
                        try {
                            if (!new JSONObject((String) obj).has("app_data") && this.f92433k > 0) {
                                this.f92433k = 0;
                                break;
                            }
                        } catch (JSONException unused) {
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f92427e != null) {
            this.f92427e.mo60361a(bVar, obj);
        }
    }

    /* renamed from: a */
    public final void mo74822a(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        if (frameLayout == null) {
            C32458a.m75150b("LivePlayHelper", "liveStreamContainer is null");
            return;
        }
        this.f92426d = z;
        if (liveRoomStruct.stream_url != null && !TextUtils.equals(this.f92423a, liveRoomStruct.stream_url.rtmp_pull_url)) {
            m81430e();
        }
        if (liveRoomStruct.stream_url != null) {
            this.f92423a = liveRoomStruct.stream_url.rtmp_pull_url;
        }
        this.f92428f = liveRoomStruct;
        this.f92429g = frameLayout;
        try {
            Context context = this.f92429g.getContext();
            if (this.f92424b == null) {
                LiveRoomStruct liveRoomStruct2 = this.f92428f;
                this.f92424b = new TextureRenderView(context);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f92424b.setLayoutParams(layoutParams);
            this.f92424b.setVisibility(0);
            this.f92424b.setScaleType(2);
            FrameLayout frameLayout2 = this.f92429g;
            if (frameLayout2.indexOfChild(this.f92424b) < 0) {
                m81431f();
                this.f92424b.setVisibility(0);
                frameLayout2.addView(this.f92424b);
            }
            this.f92425c.mo14274d(true);
            this.f92425c.mo14268a(this.f92428f.stream_url.rtmp_pull_url, (TextureView) this.f92424b, RoomStruct.getStreamType(this.f92428f).ordinal(), (C8654d) null, (C8653c) this, (String) null);
            this.f92425c.mo14270a(this.f92426d, m81432g());
        } catch (Exception e) {
            C32458a.m75150b("LivePlayHelper", Log.getStackTraceString(e));
        }
        this.f92432j = new SEIHelper(this);
        this.f92433k = 0;
    }
}
