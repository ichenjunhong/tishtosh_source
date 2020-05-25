package com.bytedance.android.livesdk.chatroom.p301a.p304c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.FraternityInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p310f.C5235t;
import com.bytedance.android.livesdk.gift.effect.normal.p373e.C7429b;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.ugc.live.barrage.p2602a.C51605c;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.a */
public final class C4974a {

    /* renamed from: a */
    public final View f13344a;

    /* renamed from: b */
    public C51605c f13345b;

    /* renamed from: c */
    public final ImageView f13346c;

    /* renamed from: d */
    public final ImageView f13347d;

    /* renamed from: e */
    final ImageView f13348e;

    /* renamed from: f */
    final TextView f13349f;

    /* renamed from: g */
    final ImageView f13350g;

    /* renamed from: h */
    final TextView f13351h;

    /* renamed from: i */
    public final ImageView f13352i;

    /* renamed from: j */
    private final TextView f13353j;

    /* renamed from: k */
    private final ImageView f13354k;

    public C4974a(View view, C7869cj cjVar, LiveWidget liveWidget) {
        FansClubData fansClubData;
        this.f13344a = view;
        this.f13353j = (TextView) view.findViewById(R.id.d8j);
        this.f13353j.setText(cjVar.f21787b);
        if (C8607a.f23572a && VERSION.SDK_INT >= 17 && !C4206c.m10426a(C3922z.m9915e())) {
            this.f13353j.setTextDirection(3);
        }
        this.f13346c = (ImageView) view.findViewById(R.id.ao0);
        this.f13347d = (ImageView) view.findViewById(R.id.b1g);
        this.f13348e = (ImageView) view.findViewById(R.id.adx);
        this.f13349f = (TextView) view.findViewById(R.id.ady);
        this.f13350g = (ImageView) view.findViewById(R.id.ajq);
        this.f13351h = (TextView) view.findViewById(R.id.ajr);
        this.f13352i = (ImageView) view.findViewById(R.id.ka);
        TextView textView = (TextView) view.findViewById(R.id.dco);
        this.f13354k = (ImageView) view.findViewById(R.id.cql);
        TTLiveSDKContext.getHostService().mo10319l().mo15490a(cjVar.f21788c.getAvatarThumb(), (C8797c) new C8797c() {
            /* renamed from: a */
            public final void mo9146a(C8795a aVar) {
            }

            /* renamed from: a */
            public final void mo9145a(Bitmap bitmap) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap a = C7429b.m15316a(bitmap);
                    if (a != null && !a.isRecycled()) {
                        C4974a.this.f13346c.setImageBitmap(a);
                        if (C4974a.this.f13345b != null) {
                            C4974a.this.f13345b.mo105545a(C4974a.this.f13344a);
                        }
                    }
                }
            }
        });
        if (cjVar.f21788c.getUserHonor() == null || cjVar.f21788c.getUserHonor().mo8159n() <= 0) {
            this.f13347d.setVisibility(8);
        } else {
            this.f13347d.setVisibility(8);
            TTLiveSDKContext.getHostService().mo10319l().mo15490a(cjVar.f21788c.getUserHonor().mo8157l(), (C8797c) new C8797c() {
                /* renamed from: a */
                public final void mo9146a(C8795a aVar) {
                }

                /* renamed from: a */
                public final void mo9145a(Bitmap bitmap) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        ImageView imageView = C4974a.this.f13347d;
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_4444);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint();
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        RectF rectF = new RectF(rect);
                        paint.setAntiAlias(true);
                        canvas.drawARGB(0, 0, 0, 0);
                        paint.setColor(-12434878);
                        canvas.drawOval(rectF, paint);
                        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, rect, rect, paint);
                        imageView.setImageBitmap(createBitmap);
                        C4974a.this.f13347d.setVisibility(0);
                        if (C4974a.this.f13345b != null) {
                            C4974a.this.f13345b.mo105545a(C4974a.this.f13344a);
                        }
                    }
                }
            });
        }
        textView.setText(cjVar.f21788c.getNickName());
        textView.measure(0, 0);
        this.f13353j.measure(0, 0);
        if (this.f13353j.getMeasuredWidth() < textView.getMeasuredWidth()) {
            this.f13353j.setWidth(textView.getMeasuredWidth());
        }
        if (cjVar.f21791f != null) {
            if (!(cjVar.f21791f.f21864a == null || cjVar.f21791f.f21864a.getUrls() == null)) {
                C5235t.m11853a(cjVar.f21791f.f21864a, this.f13353j, C4206c.m10426a(C3922z.m9915e()), new C4978b(this));
            }
            if (!(cjVar.f21791f.f21865b == null || this.f13352i == null)) {
                TTLiveSDKContext.getHostService().mo10319l().mo15490a(cjVar.f21791f.f21865b, (C8797c) new C8797c() {
                    /* renamed from: a */
                    public final void mo9146a(C8795a aVar) {
                    }

                    /* renamed from: a */
                    public final void mo9145a(Bitmap bitmap) {
                        if (bitmap != null && !bitmap.isRecycled()) {
                            C4974a.this.f13352i.setImageBitmap(bitmap.copy(Config.ARGB_8888, true));
                            if (C4974a.this.f13345b != null) {
                                C4974a.this.f13345b.mo105545a(C4974a.this.f13344a);
                            }
                        }
                    }
                });
            }
        }
        User user = cjVar.f21788c;
        if (user != null) {
            boolean z = true;
            if (user.getFansClub() != null) {
                if (FansClubData.isValid(user.getFansClub().getData())) {
                    fansClubData = user.getFansClub().getData();
                } else if (user.getFansClub().getPreferData() != null) {
                    fansClubData = (FansClubData) user.getFansClub().getPreferData().get(Integer.valueOf(1));
                } else {
                    fansClubData = null;
                }
                if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                    ImageModel imageModel = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(2));
                    if (imageModel != null) {
                        TextImageModel textImageModel = new TextImageModel(imageModel, 1);
                        textImageModel.f23707a = fansClubData.clubName;
                        C5213c.m11812a(textImageModel).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C4979c<Object>(this, fansClubData), (C1710e<? super Throwable>) new C4980d<Object>(this));
                    }
                } else if (this.f13348e != null) {
                    this.f13348e.setVisibility(8);
                    this.f13349f.setVisibility(8);
                }
            }
            FraternityInfo fraternityInfo = user.getFraternityInfo();
            if (!(this.f13350g == null || this.f13351h == null)) {
                if (fraternityInfo != null && fraternityInfo.isValid()) {
                    ImageModel background = fraternityInfo.getBackground();
                    if (background != null) {
                        TextImageModel textImageModel2 = new TextImageModel(background, 4);
                        textImageModel2.f23707a = fraternityInfo.getName();
                        try {
                            textImageModel2.f23708b = Color.parseColor(fraternityInfo.getFontColor());
                        } catch (IllegalArgumentException e) {
                            C3831a.m9709a("BarrageViewHolder", (Throwable) e);
                        }
                        C5213c.m11812a(textImageModel2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C4981e<Object>(this, textImageModel2), (C1710e<? super Throwable>) new C4982f<Object>(this));
                        z = false;
                    }
                }
                if (z) {
                    this.f13350g.setVisibility(8);
                    this.f13351h.setVisibility(8);
                }
            }
        }
        if (cjVar.f21788c == null || TextUtils.isEmpty(cjVar.f21788c.getSpecialId())) {
            this.f13354k.setVisibility(8);
        } else {
            this.f13354k.setVisibility(0);
        }
        this.f13345b = new C51605c(this.f13344a);
        this.f13345b.f128880j = cjVar.mo14160a();
        UserProfileEvent userProfileEvent = new UserProfileEvent(cjVar.f21788c);
        userProfileEvent.mSource = UserProfileEvent.SOURCE_BARRAGE;
        this.f13345b.f128878h = new C4983g(userProfileEvent);
    }
}
