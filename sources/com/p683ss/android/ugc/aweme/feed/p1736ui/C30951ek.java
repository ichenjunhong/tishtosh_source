package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ek */
public final class C30951ek extends C30806bl implements C0199s<C23274a> {

    /* renamed from: c */
    ImageView f81050c;

    /* renamed from: d */
    TextView f81051d;

    /* renamed from: e */
    MarqueeView f81052e;

    /* renamed from: f */
    LinearLayout f81053f;

    /* renamed from: g */
    private boolean f81054g;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo63523e() {
        if (this.f81054g) {
            this.f81054g = false;
            if (this.f81052e != null) {
                this.f81052e.mo64088c();
            }
        }
    }

    public C30951ek(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        dataCenter.mo48226a("stopPlayAnimation", (C0199s<C23274a>) this).mo48226a("startPlayAnimation", (C0199s<C23274a>) this).mo48226a("pausePlayAnimation", (C0199s<C23274a>) this);
    }

    /* renamed from: a */
    public final void mo49783a(View view) {
        super.mo49783a(view);
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b70);
        this.f81052e = (MarqueeView) view2.findViewById(R.id.bot);
        this.f81051d = (TextView) view2.findViewById(R.id.boc);
        this.f81050c = (ImageView) view2.findViewById(R.id.bo7);
        this.f81053f = (LinearLayout) view2.findViewById(R.id.bos);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
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
                    if (!this.f81054g) {
                        this.f81054g = true;
                        if (this.f81052e != null) {
                            this.f81052e.mo64085a();
                        }
                    }
                    return;
                case 1:
                    if (this.f81054g) {
                        this.f81054g = false;
                        if (this.f81052e != null) {
                            this.f81052e.mo64087b();
                        }
                    }
                    return;
                case 2:
                    mo63523e();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        String str;
        String str2;
        Object[] objArr;
        String str3;
        Resources resources;
        MarqueeView marqueeView;
        int i;
        super.mo58323a(videoItemParams);
        if (this.f81199s != null) {
            View view = this.f81199s;
            if (C26235d.m63571b(this.f81192l)) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
        this.f81050c.setVisibility(0);
        if (this.f81192l.getMusic() == null || (!this.f81192l.getMusic().isOriginMusic() && !this.f81192l.getMusic().isArtistMusic())) {
            this.f81051d.setVisibility(8);
            this.f81050c.setImageResource(R.drawable.dfb);
        } else {
            this.f81051d.setVisibility(8);
            this.f81050c.setImageResource(R.drawable.csi);
        }
        if (C26469cc.m64001b(this.f81192l, 3)) {
            this.f81052e.setText((int) R.string.d0c);
        } else {
            Music music = this.f81192l.getMusic();
            User author = this.f81192l.getAuthor();
            int i2 = R.string.cep;
            if (music != null) {
                if (TextUtils.isEmpty(music.getAuthorName())) {
                    this.f81052e.setText(music.getMusicName());
                } else {
                    if (!TextUtils.isEmpty(music.getOwnerId())) {
                        this.f81052e.setText(this.f81198r.getResources().getString(R.string.cer, new Object[]{music.getMusicName(), music.getAuthorName()}));
                        if (TextUtils.isEmpty(music.getMusicName())) {
                            marqueeView = this.f81052e;
                            resources = this.f81198r.getResources();
                            objArr = new Object[2];
                            objArr[0] = this.f81198r.getResources().getString(R.string.ce5);
                            if (TextUtils.isEmpty(music.getOwnerHandle())) {
                                str3 = "";
                            } else {
                                str3 = music.getOwnerHandle();
                            }
                        }
                    } else if (!TextUtils.isEmpty(music.getMusicName()) || !TextUtils.isEmpty(music.getAuthorName())) {
                        marqueeView = this.f81052e;
                        resources = this.f81198r.getResources();
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = music.getMusicName();
                        objArr = objArr2;
                        str3 = music.getAuthorName();
                        i2 = R.string.cer;
                    } else {
                        this.f81052e.setText(this.f81198r.getResources().getString(R.string.cm_));
                    }
                    objArr[1] = str3;
                    marqueeView.setText(resources.getString(i2, objArr));
                }
                this.f81052e.setVisibility(0);
                if (this.f81192l != null && !this.f81192l.isCanPlay() && C30806bl.m72202b(this.f81192l)) {
                    this.f81052e.setVisibility(4);
                }
            } else {
                if (author == null) {
                    str2 = "";
                } else {
                    str2 = C47915gg.m103660i(author);
                }
                if (TextUtils.isEmpty(str2)) {
                    this.f81052e.setText(this.f81198r.getResources().getString(R.string.cm_));
                } else {
                    this.f81052e.setText(this.f81198r.getResources().getString(R.string.cep, new Object[]{this.f81198r.getResources().getString(R.string.ce5), str2}));
                }
            }
            if (this.f81192l != null && this.f81192l.isWithPromotionalMusic()) {
                if (music == null || TextUtils.isEmpty(music.getMusicName())) {
                    str = this.f81198r.getResources().getString(R.string.d0c);
                } else {
                    str = music.getMusicName();
                }
                this.f81052e.setText(str);
            }
            if (C36330a.m81964a(this.f81192l)) {
                this.f81199s.setVisibility(8);
            }
        }
        this.f81052e.setOnClickListener(this.f80703b);
        this.f81050c.setOnClickListener(this.f80703b);
        this.f81051d.setOnClickListener(this.f80703b);
    }
}
