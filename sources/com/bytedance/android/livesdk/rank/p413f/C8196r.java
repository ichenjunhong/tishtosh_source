package com.bytedance.android.livesdk.rank.p413f;

import android.graphics.Typeface;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.r */
public class C8196r extends C53035c<C8219f, C8197a> {

    /* renamed from: a */
    public C8333e f22364a;

    /* renamed from: b */
    public boolean f22365b;

    /* renamed from: c */
    public int f22366c;

    /* renamed from: d */
    public Fragment f22367d;

    /* renamed from: f */
    private int f22368f;

    /* renamed from: com.bytedance.android.livesdk.rank.f.r$a */
    class C8197a extends C1352v {

        /* renamed from: a */
        ImageView f22369a;

        /* renamed from: b */
        TextView f22370b;

        /* renamed from: c */
        ImageView f22371c;

        /* renamed from: d */
        HSImageView f22372d;

        /* renamed from: e */
        View f22373e;

        /* renamed from: f */
        ImageView f22374f;

        /* renamed from: g */
        TextView f22375g;

        /* renamed from: h */
        TextView f22376h;

        /* renamed from: i */
        ImageView f22377i;

        /* renamed from: j */
        TextView f22378j;

        /* renamed from: k */
        User f22379k;

        /* renamed from: l */
        View f22380l;

        /* renamed from: m */
        View f22381m;

        /* renamed from: n */
        boolean f22382n;

        public C8197a(View view) {
            super(view);
            this.f22369a = (ImageView) view.findViewById(R.id.c8c);
            this.f22370b = (TextView) view.findViewById(R.id.c8g);
            this.f22371c = (ImageView) view.findViewById(R.id.dm3);
            this.f22372d = (HSImageView) view.findViewById(R.id.ay3);
            this.f22373e = view.findViewById(R.id.ai0);
            this.f22374f = (ImageView) view.findViewById(R.id.ap8);
            this.f22375g = (TextView) view.findViewById(R.id.dn1);
            this.f22376h = (TextView) view.findViewById(R.id.d02);
            this.f22377i = (ImageView) view.findViewById(R.id.d4n);
            this.f22378j = (TextView) view.findViewById(R.id.d4m);
            this.f22380l = view.findViewById(R.id.cfg);
            this.f22381m = view.findViewById(R.id.e80);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8197a(layoutInflater.inflate(R.layout.ams, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        boolean z;
        int i;
        C8197a aVar = (C8197a) vVar;
        C8219f fVar = (C8219f) obj;
        if (fVar.f22444c <= this.f22368f) {
            z = true;
        } else {
            z = false;
        }
        if (fVar != null) {
            aVar.f22382n = z;
            if (22 == C8196r.this.f22366c) {
                C9432q.m18691b((View) aVar.f22369a, 8);
                C9432q.m18691b((View) aVar.f22370b, 8);
                if (!(aVar.itemView == null || aVar.itemView.getContext() == null)) {
                    C9432q.m18680a(aVar.itemView.findViewById(R.id.dm6), (int) C9432q.m18687b(aVar.itemView.getContext(), 8.0f), -3, -3, -3);
                }
            } else if (fVar.f22444c <= 0) {
                aVar.f22369a.setVisibility(0);
                aVar.f22369a.setImageLevel(fVar.f22444c + 3);
                aVar.f22370b.setVisibility(8);
            } else if (fVar.f22443b <= 0) {
                aVar.f22369a.setVisibility(8);
                aVar.f22370b.setVisibility(0);
                aVar.f22370b.setText("-");
            } else if (fVar.f22444c <= 3) {
                aVar.f22369a.setVisibility(0);
                aVar.f22369a.setImageLevel(fVar.f22444c + 3);
                aVar.f22370b.setVisibility(8);
            } else {
                aVar.f22369a.setVisibility(8);
                aVar.f22370b.setVisibility(0);
                aVar.f22370b.setText(String.valueOf(fVar.f22444c));
                aVar.f22370b.setTextColor(C3922z.m9909b((int) R.color.b32));
            }
            if (fVar.f22444c < 0) {
                i = R.color.alt;
            } else {
                i = R.color.a8w;
            }
            aVar.itemView.setBackgroundColor(aVar.itemView.getResources().getColor(i));
            C5213c.m11826b(aVar.f22371c, fVar.f22442a.getAvatarThumb(), aVar.f22371c.getWidth(), aVar.f22371c.getHeight(), R.drawable.bt6);
            if (fVar.f22442a.getBorder() != null) {
                aVar.f22372d.setVisibility(0);
                C5213c.m11820a(aVar.f22372d, fVar.f22442a.getBorder().f8838a);
            } else {
                aVar.f22372d.setVisibility(8);
            }
            User user = fVar.f22442a;
            aVar.f22379k = user;
            aVar.f22373e.setVisibility(8);
            ImageModel imageModel = null;
            if (!(user == null || user.getUserHonor() == null)) {
                imageModel = user.getUserHonor().mo8156k();
            }
            if (imageModel == null || C9376b.m18558a((Collection<T>) imageModel.getUrls())) {
                aVar.f22374f.setVisibility(8);
            } else {
                C5213c.m11819a(aVar.f22374f, imageModel, (C3910a) new C3910a() {
                    /* renamed from: a */
                    public final void mo9270a(ImageModel imageModel) {
                    }

                    /* renamed from: a */
                    public final void mo9272a(ImageModel imageModel, Exception exc) {
                    }

                    /* renamed from: a */
                    public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                        LayoutParams layoutParams = C8197a.this.f22374f.getLayoutParams();
                        int a = C3922z.m9899a(30.0f);
                        layoutParams.width = a;
                        layoutParams.height = (i2 * a) / i;
                        C8197a.this.f22374f.setLayoutParams(layoutParams);
                    }
                });
                aVar.f22374f.setVisibility(0);
            }
            C9432q.m18691b((View) aVar.f22377i, 8);
            C9432q.m18691b((View) aVar.f22378j, 8);
            if (user != null) {
                if (user.displayId == null || !((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
                    aVar.f22375g.setText(user.getNickName());
                } else {
                    aVar.f22375g.setText(user.displayId);
                }
            }
            aVar.f22375g.setTextColor(aVar.itemView.getResources().getColor(R.color.ag1));
            if (22 == C8196r.this.f22366c) {
                C9432q.m18691b((View) aVar.f22376h, 8);
            } else {
                aVar.f22376h.setText(fVar.f22445d);
            }
            aVar.itemView.setOnClickListener(new C8199s(aVar, fVar));
            User user2 = fVar.f22442a;
            if (C8196r.this.f22367d.isAdded()) {
                C8196r.this.f22364a.mo14534d(user2.getId()).mo6513a(C4064k.m10180a(C8196r.this.f22367d)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8200t<Object>(aVar, user2), C8201u.f22389a);
            }
            if (aVar.f22375g != null) {
                aVar.f22375g.setTypeface(Typeface.DEFAULT_BOLD);
            }
            C9432q.m18691b(aVar.f22381m, 8);
            C9432q.m18678a(aVar.f22380l, 0);
        }
    }

    public C8196r(C8333e eVar, boolean z, int i, Fragment fragment, int i2) {
        this.f22364a = eVar;
        this.f22365b = z;
        this.f22368f = i;
        this.f22367d = fragment;
        this.f22366c = i2;
    }
}
