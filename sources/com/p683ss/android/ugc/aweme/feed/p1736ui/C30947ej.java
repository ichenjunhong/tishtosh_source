package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ej */
public final class C30947ej extends C31010i implements C0199s<C23274a> {

    /* renamed from: r */
    ImageView f81042r;

    /* renamed from: s */
    TextView f81043s;

    /* renamed from: t */
    MarqueeView f81044t;

    /* renamed from: u */
    LinearLayout f81045u;

    /* renamed from: v */
    private boolean f81046v = false;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo63700j() {
        if (this.f81046v) {
            this.f81046v = false;
            if (this.f81044t != null) {
                C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                    public final void run() {
                        C30947ej.this.f81044t.mo64088c();
                    }
                }));
            }
        }
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    public C30947ej(View view) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        dataCenter.mo48226a("stopPlayAnimation", (C0199s<C23274a>) this.f79009b).mo48226a("startPlayAnimation", (C0199s<C23274a>) this.f79009b).mo48226a("pausePlayAnimation", (C0199s<C23274a>) this.f79009b);
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        super.mo60585a(view);
        this.f79019l = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b70);
        this.f81044t = (MarqueeView) this.f79019l.findViewById(R.id.bot);
        this.f81043s = (TextView) this.f79019l.findViewById(R.id.boc);
        this.f81042r = (ImageView) this.f79019l.findViewById(R.id.bo7);
        this.f81045u = (LinearLayout) this.f79019l.findViewById(R.id.bos);
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2058685350) {
                if (hashCode != -1661876786) {
                    if (hashCode == 307897710 && str.equals("startPlayAnimation")) {
                        c = 0;
                    }
                } else if (str.equals("stopPlayAnimation")) {
                    c = 2;
                }
            } else if (str.equals("pausePlayAnimation")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    if (!this.f81046v) {
                        this.f81046v = true;
                        C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                            public final void run() {
                                C30947ej ejVar = C30947ej.this;
                                if (ejVar.f81044t != null) {
                                    ejVar.f81044t.mo64085a();
                                }
                            }
                        }));
                    }
                    return;
                case 1:
                    if (this.f81046v) {
                        this.f81046v = false;
                        if (this.f81044t != null) {
                            C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                                public final void run() {
                                    C30947ej.this.f81044t.mo64087b();
                                }
                            }));
                        }
                    }
                    return;
                case 2:
                    mo63700j();
                    break;
            }
        }
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        String str;
        String str2;
        Object[] objArr;
        String str3;
        Resources resources;
        MarqueeView marqueeView;
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        if (!TextUtils.equals(aVar.f62242a, "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C23274a aVar2 = new C23274a("ui_state", hashMap);
        Aweme aweme = this.f79011d;
        hashMap.put("aweme_state", aweme);
        hashMap.put("event_type_state", this.f79012e);
        hashMap.put("enter_method_state", this.f79020m);
        if (C26469cc.m64001b(aweme, 3)) {
            MarqueeView marqueeView2 = this.f81044t;
            marqueeView2.mo64086a(marqueeView2.getResources().getString(R.string.d0c));
        } else {
            Music music = aweme.getMusic();
            User author = aweme.getAuthor();
            int i = R.string.cep;
            if (music != null) {
                if (TextUtils.isEmpty(music.getAuthorName())) {
                    this.f81044t.mo64086a(music.getMusicName());
                } else {
                    if (!TextUtils.isEmpty(music.getOwnerId())) {
                        this.f81044t.mo64086a(this.f79017j.getResources().getString(R.string.cer, new Object[]{music.getMusicName(), music.getAuthorName()}));
                        if (TextUtils.isEmpty(music.getMusicName())) {
                            marqueeView = this.f81044t;
                            resources = this.f79017j.getResources();
                            objArr = new Object[2];
                            objArr[0] = this.f79017j.getResources().getString(R.string.ce5);
                            if (TextUtils.isEmpty(music.getOwnerHandle())) {
                                str3 = "";
                            } else {
                                str3 = music.getOwnerHandle();
                            }
                        }
                    } else if (!TextUtils.isEmpty(music.getMusicName()) || !TextUtils.isEmpty(music.getAuthorName())) {
                        marqueeView = this.f81044t;
                        resources = this.f79017j.getResources();
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = music.getMusicName();
                        objArr = objArr2;
                        str3 = music.getAuthorName();
                        i = R.string.cer;
                    } else {
                        this.f81044t.mo64086a(this.f79017j.getResources().getString(R.string.cm_));
                    }
                    objArr[1] = str3;
                    marqueeView.mo64086a(resources.getString(i, objArr));
                }
                this.f81044t.setVisibility(0);
                if (this.f79011d != null && !this.f79011d.isCanPlay() && m72610b(this.f79011d)) {
                    this.f81044t.setVisibility(4);
                }
            } else {
                if (author == null) {
                    str2 = "";
                } else {
                    str2 = C47915gg.m103660i(author);
                }
                if (TextUtils.isEmpty(str2)) {
                    this.f81044t.mo64086a(this.f79017j.getResources().getString(R.string.cm_));
                } else {
                    this.f81044t.mo64086a(this.f79017j.getResources().getString(R.string.cep, new Object[]{this.f79017j.getResources().getString(R.string.ce5), str2}));
                }
            }
            if (aweme != null && aweme.isWithPromotionalMusic()) {
                if (music == null || TextUtils.isEmpty(music.getMusicName())) {
                    str = this.f79017j.getResources().getString(R.string.d0c);
                } else {
                    str = music.getMusicName();
                }
                this.f81044t.mo64086a(str);
            }
        }
        return aVar2;
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        int i2;
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l);
            }
        }
        if (aVar != null) {
            Aweme aweme = (Aweme) ((HashMap) aVar.mo48246a()).get("aweme_state");
            if (this.f79018k != null) {
                View view = this.f79018k;
                if (C26235d.m63571b(aweme)) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
            this.f81042r.setVisibility(0);
            if (aweme.getMusic() == null || (!aweme.getMusic().isOriginMusic() && !aweme.getMusic().isArtistMusic())) {
                this.f81043s.setVisibility(8);
                this.f81042r.setImageResource(R.drawable.dfb);
            } else {
                this.f81043s.setVisibility(8);
                this.f81042r.setImageResource(R.drawable.csi);
            }
            if (C26469cc.m64001b(aweme, 3)) {
                this.f81044t.requestLayout();
            } else {
                Music music = aweme.getMusic();
                aweme.getAuthor();
                if (music != null) {
                    this.f81044t.setVisibility(0);
                    if (aweme != null && !aweme.isCanPlay() && m72610b(aweme)) {
                        this.f81044t.setVisibility(4);
                    }
                }
                this.f81044t.requestLayout();
                if (C36330a.m81964a(aweme)) {
                    this.f79018k.setVisibility(8);
                }
            }
            this.f81044t.setOnClickListener(this.f81204q);
            this.f81042r.setOnClickListener(this.f81204q);
            this.f81043s.setOnClickListener(this.f81204q);
        }
    }
}
