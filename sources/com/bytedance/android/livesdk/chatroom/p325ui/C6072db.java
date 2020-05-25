package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2970d;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3012k;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.event.C5189i;
import com.bytedance.android.livesdk.chatroom.presenter.C5793ao;
import com.bytedance.android.livesdk.chatroom.presenter.C5793ao.C5795b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p279af.C4559aa;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p328d.C6737a;
import com.bytedance.android.livesdk.p328d.C6742f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p069b.C1689b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.db */
public class C6072db extends C6736d implements OnClickListener, C5795b, C6742f {

    /* renamed from: a */
    public static final String f16229a = "db";

    /* renamed from: A */
    public View f16230A;

    /* renamed from: B */
    public HSImageView f16231B;

    /* renamed from: C */
    HSImageView f16232C;

    /* renamed from: D */
    ImageView f16233D;

    /* renamed from: E */
    public Activity f16234E;

    /* renamed from: F */
    public DataCenter f16235F;

    /* renamed from: G */
    public C6049cl f16236G;

    /* renamed from: H */
    View f16237H;

    /* renamed from: I */
    public final C1689b f16238I = new C1689b();

    /* renamed from: J */
    private C5793ao f16239J;

    /* renamed from: K */
    private C6737a f16240K;

    /* renamed from: L */
    private User f16241L;

    /* renamed from: M */
    private View f16242M;

    /* renamed from: N */
    private View f16243N;

    /* renamed from: O */
    private ViewGroup f16244O;

    /* renamed from: P */
    private boolean f16245P;

    /* renamed from: Q */
    private View f16246Q;

    /* renamed from: R */
    private List<C2970d> f16247R;

    /* renamed from: S */
    private boolean f16248S = true;

    /* renamed from: b */
    public int f16249b;

    /* renamed from: c */
    public C4559aa f16250c;

    /* renamed from: d */
    public long f16251d;

    /* renamed from: e */
    public User f16252e;

    /* renamed from: f */
    public Room f16253f;

    /* renamed from: g */
    boolean f16254g;

    /* renamed from: h */
    public boolean f16255h;

    /* renamed from: i */
    public boolean f16256i;

    /* renamed from: k */
    public boolean f16257k;

    /* renamed from: l */
    public boolean f16258l;

    /* renamed from: m */
    public boolean f16259m;

    /* renamed from: n */
    public boolean f16260n;

    /* renamed from: o */
    public boolean f16261o;

    /* renamed from: p */
    String f16262p;

    /* renamed from: q */
    String f16263q = "";

    /* renamed from: r */
    public long f16264r;

    /* renamed from: s */
    public String f16265s;

    /* renamed from: t */
    public View f16266t;

    /* renamed from: u */
    public View f16267u;

    /* renamed from: v */
    public TextView f16268v;

    /* renamed from: w */
    public View f16269w;

    /* renamed from: x */
    public TextView f16270x;

    /* renamed from: y */
    public HSImageView f16271y;

    /* renamed from: z */
    public LivingView f16272z;

    /* renamed from: a */
    public final void mo11682a() {
        dismiss();
    }

    /* renamed from: b */
    private void m13228b() {
        if (this.f16253f != null && this.f16252e != null) {
            this.f16244O.setVisibility(4);
            this.f16242M.setVisibility(4);
            this.f16244O.post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:104:0x02c2  */
                /* JADX WARNING: Removed duplicated region for block: B:107:0x02d7  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x012a  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x012f  */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x0173  */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x01bd  */
                /* JADX WARNING: Removed duplicated region for block: B:54:0x01c5  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r11 = this;
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16267u
                        r1 = 0
                        r0.setVisibility(r1)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f16271y
                        com.bytedance.android.livesdk.chatroom.ui.db r2 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f16252e
                        com.bytedance.android.live.base.model.ImageModel r2 = r2.getAvatarThumb()
                        com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11820a(r0, r2)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.app.Activity r0 = r0.f16234E
                        r2 = 0
                        r4 = 8
                        if (r0 == 0) goto L_0x009c
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.app.Activity r0 = r0.f16234E
                        int r0 = r0.getRequestedOrientation()
                        if (r0 != 0) goto L_0x009c
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        long r5 = r0.getLiveRoomId()
                        int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                        if (r0 == 0) goto L_0x0045
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        r0.getId()
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f16253f
                        r0.getOwnerUserId()
                    L_0x0045:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        com.bytedance.android.live.base.model.user.f r0 = r0.getBorder()
                        if (r0 == 0) goto L_0x0077
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16230A
                        com.bytedance.common.utility.C9432q.m18691b(r0, r4)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f16271y
                        r0.setPadding(r1, r1, r1, r1)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f16271y
                        r0.setBackgroundResource(r1)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f16231B
                        com.bytedance.android.livesdk.chatroom.ui.db r2 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f16252e
                        com.bytedance.android.live.base.model.user.f r2 = r2.getBorder()
                        com.bytedance.android.live.base.model.ImageModel r2 = r2.f8838a
                        com.bytedance.android.live.core.p230g.C3899m.m9868b(r0, r2)
                        goto L_0x00ed
                    L_0x0077:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16230A
                        com.bytedance.common.utility.C9432q.m18691b(r0, r4)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f16271y
                        r2 = 1084227584(0x40a00000, float:5.0)
                        int r2 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r2)
                        r3 = 1088421888(0x40e00000, float:7.0)
                        int r3 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r3)
                        r0.setPadding(r1, r2, r1, r3)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f16271y
                        r2 = 2131955531(0x7f130f4b, float:1.9547592E38)
                        r0.setBackgroundResource(r2)
                        goto L_0x00ed
                    L_0x009c:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16230A
                        com.bytedance.common.utility.C9432q.m18691b(r0, r1)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        long r5 = r0.getLiveRoomId()
                        int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                        if (r0 == 0) goto L_0x00bd
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        r0.getId()
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f16253f
                        r0.getOwnerUserId()
                    L_0x00bd:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16230A
                        if (r0 == 0) goto L_0x00ed
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        com.bytedance.android.live.base.model.user.f r0 = r0.getBorder()
                        if (r0 == 0) goto L_0x00e6
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16230A
                        com.bytedance.common.utility.C9432q.m18691b(r0, r4)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f16231B
                        com.bytedance.android.livesdk.chatroom.ui.db r2 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f16252e
                        com.bytedance.android.live.base.model.user.f r2 = r2.getBorder()
                        com.bytedance.android.live.base.model.ImageModel r2 = r2.f8838a
                        com.bytedance.android.live.core.p230g.C3899m.m9868b(r0, r2)
                        goto L_0x00ed
                    L_0x00e6:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16230A
                        com.bytedance.common.utility.C9432q.m18691b(r0, r1)
                    L_0x00ed:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f16271y
                        r2 = 2132017508(0x7f140164, float:1.9673296E38)
                        com.bytedance.android.livesdk.chatroom.ui.db r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r3 = r3.f16252e
                        r0.setTag(r2, r3)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f16253f
                        com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
                        r2 = 1
                        if (r0 != 0) goto L_0x0109
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        goto L_0x0121
                    L_0x0109:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdk.chatroom.ui.db r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f16253f
                        com.bytedance.android.live.base.model.user.User r3 = r3.getOwner()
                        long r5 = r3.getId()
                        com.bytedance.android.livesdk.chatroom.ui.db r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        long r7 = r3.f16251d
                        int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                        if (r3 != 0) goto L_0x0121
                        r3 = 1
                        goto L_0x0122
                    L_0x0121:
                        r3 = 0
                    L_0x0122:
                        r0.f16256i = r3
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16256i
                        if (r0 == 0) goto L_0x012f
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        r0.f16257k = r2
                        goto L_0x015b
                    L_0x012f:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        if (r0 == 0) goto L_0x015b
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        com.bytedance.android.live.base.model.user.k r0 = r0.getUserAttr()
                        if (r0 == 0) goto L_0x015b
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdk.chatroom.ui.db r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r3 = r3.f16252e
                        com.bytedance.android.live.base.model.user.k r3 = r3.getUserAttr()
                        boolean r3 = r3.f8851b
                        r0.f16257k = r3
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdk.chatroom.ui.db r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r3 = r3.f16252e
                        com.bytedance.android.live.base.model.user.k r3 = r3.getUserAttr()
                        boolean r3 = r3.f8852c
                        r0.f16258l = r3
                    L_0x015b:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdk.af.aa r0 = r0.f16250c
                        com.bytedance.android.livesdk.chatroom.ui.db r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        long r5 = r3.f16251d
                        com.bytedance.android.livesdk.chatroom.ui.db r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r3 = r3.f16256i
                        com.bytedance.android.livesdk.chatroom.ui.db r5 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r5 = r5.f16256i
                        com.bytedance.android.livesdk.chatroom.ui.db r6 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r6 = r6.f16255h
                        boolean r7 = r0.f12522c
                        if (r7 != 0) goto L_0x01b7
                        org.json.JSONObject r7 = new org.json.JSONObject
                        r7.<init>()
                        java.lang.String r8 = "rid"
                        com.bytedance.android.livesdkapi.depend.model.live.Room r9 = r0.f12521b     // Catch:{ Exception -> 0x01b6 }
                        long r9 = r9.getId()     // Catch:{ Exception -> 0x01b6 }
                        r7.put(r8, r9)     // Catch:{ Exception -> 0x01b6 }
                        java.lang.String r8 = "source"
                        com.bytedance.android.livesdkapi.depend.model.live.Room r9 = r0.f12521b     // Catch:{ Exception -> 0x01b6 }
                        long r9 = r9.getUserFrom()     // Catch:{ Exception -> 0x01b6 }
                        r7.put(r8, r9)     // Catch:{ Exception -> 0x01b6 }
                        if (r3 == 0) goto L_0x019e
                        if (r6 == 0) goto L_0x0198
                        android.content.Context r3 = r0.f12520a
                        com.bytedance.android.livesdk.p399o.C8068g.m16014a(r3)
                        goto L_0x01b3
                    L_0x0198:
                        android.content.Context r3 = r0.f12520a
                        com.bytedance.android.livesdk.p399o.C8068g.m16014a(r3)
                        goto L_0x01b3
                    L_0x019e:
                        if (r6 == 0) goto L_0x01a6
                        android.content.Context r3 = r0.f12520a
                        com.bytedance.android.livesdk.p399o.C8068g.m16014a(r3)
                        goto L_0x01b3
                    L_0x01a6:
                        if (r5 == 0) goto L_0x01ae
                        android.content.Context r3 = r0.f12520a
                        com.bytedance.android.livesdk.p399o.C8068g.m16014a(r3)
                        goto L_0x01b3
                    L_0x01ae:
                        android.content.Context r3 = r0.f12520a
                        com.bytedance.android.livesdk.p399o.C8068g.m16014a(r3)
                    L_0x01b3:
                        r0.f12522c = r2
                        goto L_0x01b7
                    L_0x01b6:
                    L_0x01b7:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16255h
                        if (r0 == 0) goto L_0x01c5
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16266t
                        r0.setVisibility(r4)
                        goto L_0x01d8
                    L_0x01c5:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16266t
                        r0.setVisibility(r1)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16266t
                        com.bytedance.android.livesdk.chatroom.ui.db$1$1 r2 = new com.bytedance.android.livesdk.chatroom.ui.db$1$1
                        r2.<init>()
                        r0.setOnClickListener(r2)
                    L_0x01d8:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16256i
                        if (r0 != 0) goto L_0x0288
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16258l
                        if (r0 == 0) goto L_0x01ea
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16255h
                        if (r0 == 0) goto L_0x0288
                    L_0x01ea:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16260n
                        if (r0 != 0) goto L_0x01f6
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16261o
                        if (r0 == 0) goto L_0x0288
                    L_0x01f6:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16259m
                        if (r0 != 0) goto L_0x0208
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16261o
                        if (r0 != 0) goto L_0x0208
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16257k
                        if (r0 != 0) goto L_0x0288
                    L_0x0208:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16259m
                        if (r0 != 0) goto L_0x021a
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16261o
                        if (r0 != 0) goto L_0x021a
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16255h
                        if (r0 != 0) goto L_0x0288
                    L_0x021a:
                        com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
                        long r2 = r0.f12614e
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        long r5 = r0.getId()
                        int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                        if (r0 == 0) goto L_0x0288
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        int r0 = r0.f16249b
                        r2 = 2
                        if (r0 != r2) goto L_0x0234
                        goto L_0x0288
                    L_0x0234:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16259m
                        if (r0 != 0) goto L_0x026d
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        boolean r0 = r0.f16261o
                        if (r0 == 0) goto L_0x0241
                        goto L_0x026d
                    L_0x0241:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        com.bytedance.android.live.base.model.user.k r0 = r0.getUserAttr()
                        if (r0 == 0) goto L_0x0262
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        com.bytedance.android.live.base.model.user.k r0 = r0.getUserAttr()
                        boolean r0 = r0.f8850a
                        if (r0 == 0) goto L_0x0262
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.widget.TextView r0 = r0.f16268v
                        r2 = 2132550892(0x7f1c24ec, float:2.0755128E38)
                        r0.setText(r2)
                        goto L_0x0277
                    L_0x0262:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.widget.TextView r0 = r0.f16268v
                        r2 = 2132550899(0x7f1c24f3, float:2.0755142E38)
                        r0.setText(r2)
                        goto L_0x0277
                    L_0x026d:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.widget.TextView r0 = r0.f16268v
                        r2 = 2132550889(0x7f1c24e9, float:2.0755122E38)
                        r0.setText(r2)
                    L_0x0277:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.widget.TextView r0 = r0.f16268v
                        r0.setVisibility(r1)
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.widget.TextView r0 = r0.f16268v
                        com.bytedance.android.livesdk.chatroom.ui.db r2 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        r0.setOnClickListener(r2)
                        goto L_0x028f
                    L_0x0288:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.widget.TextView r0 = r0.f16268v
                        r0.setVisibility(r4)
                    L_0x028f:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.widget.TextView r0 = r0.f16268v
                        int r0 = r0.getVisibility()
                        if (r0 != 0) goto L_0x02b5
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16266t
                        int r0 = r0.getVisibility()
                        if (r0 == 0) goto L_0x02ad
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.widget.TextView r0 = r0.f16270x
                        int r0 = r0.getVisibility()
                        if (r0 != 0) goto L_0x02b5
                    L_0x02ad:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16269w
                        r0.setVisibility(r1)
                        goto L_0x02bc
                    L_0x02b5:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        android.view.View r0 = r0.f16269w
                        r0.setVisibility(r4)
                    L_0x02bc:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdk.chatroom.ui.cl r0 = r0.f16236G
                        if (r0 == 0) goto L_0x02cd
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdk.chatroom.ui.cl r0 = r0.f16236G
                        com.bytedance.android.livesdk.chatroom.ui.db r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r1 = r1.f16252e
                        r0.mo12080a(r1)
                    L_0x02cd:
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f16252e
                        com.bytedance.android.live.base.model.ImageModel r0 = r0.getPersonalCard()
                        if (r0 == 0) goto L_0x0308
                        com.bytedance.android.livesdk.chatroom.ui.db r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.livesdk.chatroom.ui.db r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6072db.this
                        com.bytedance.android.live.base.model.user.User r1 = r1.f16252e
                        com.bytedance.android.live.base.model.ImageModel r1 = r1.getPersonalCard()
                        if (r1 == 0) goto L_0x0307
                        android.view.View r2 = r0.f16237H
                        if (r2 == 0) goto L_0x0307
                        com.bytedance.android.live.core.widget.HSImageView r2 = r0.f16232C
                        if (r2 == 0) goto L_0x0307
                        android.widget.ImageView r2 = r0.f16233D
                        if (r2 != 0) goto L_0x02f0
                        goto L_0x0307
                    L_0x02f0:
                        c.a.v r1 = com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11812a(r1)
                        com.bytedance.android.live.core.rxutils.g r2 = com.bytedance.android.live.core.rxutils.C4064k.m10182a()
                        c.a.v r1 = r1.mo6513a(r2)
                        com.bytedance.android.livesdk.chatroom.ui.dc r2 = new com.bytedance.android.livesdk.chatroom.ui.dc
                        r2.<init>(r0)
                        c.a.d.e r0 = com.bytedance.android.livesdk.chatroom.p325ui.C6077dd.f16277a
                        r1.mo6505a(r2, r0)
                        goto L_0x0308
                    L_0x0307:
                        return
                    L_0x0308:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6072db.C60731.run():void");
                }
            });
        }
    }

    public void onDestroy() {
        if (this.f16239J != null) {
            this.f16239J.mo8247a();
        }
        if (this.f16240K != null) {
            this.f16240K.f18413a = null;
        }
        this.f16254g = false;
        if (this.f16235F != null) {
            this.f16235F.lambda$put$1$DataCenter(C5957b.f15689N, Boolean.valueOf(false));
        }
        this.f16238I.mo6180a();
        super.onDestroy();
    }

    /* renamed from: c */
    private void m13229c() {
        String str;
        if (this.f16253f != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("target_uid", String.valueOf(this.f16251d));
            hashMap.put("sec_target_uid", TTLiveSDKContext.getHostService().mo10315h().mo14522a(this.f16251d));
            hashMap.put("packed_level", "2");
            hashMap.put("current_room_id", String.valueOf(this.f16253f.getId()));
            hashMap.put("request_from", "live_push_settings");
            String str2 = "anchor_id";
            if (this.f16253f.getOwner() != null) {
                str = String.valueOf(this.f16253f.getOwner().getId());
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            hashMap.put("sec_anchor_id", TTLiveSDKContext.getHostService().mo10315h().mo14522a(this.f16253f.getOwnerUserId()));
            if (this.f16239J != null) {
                this.f16239J.mo11677a(hashMap);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    /* renamed from: b */
    public final void mo11686b(Throwable th) {
        if (!(th instanceof C2949a)) {
            C4602l.m11046a(getContext(), th);
        }
    }

    /* renamed from: a */
    public final void mo11684a(Throwable th) {
        if (this.f16254g) {
            if (this.f16243N.getVisibility() == 8) {
                this.f16242M.setVisibility(8);
                this.f16243N.setVisibility(0);
            } else if (th instanceof C2949a) {
                C4575an.m10987a(((C2949a) th).getPrompt());
            } else {
                C4575an.m10981a((int) R.string.eoy);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            if (!this.f16245P) {
                window.setGravity(8388693);
                window.setLayout(-2, -1);
                window.setBackgroundDrawable(new ColorDrawable(0));
                return;
            }
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f16245P) {
            i = R.style.xy;
        } else {
            i = R.style.xz;
        }
        setStyle(1, i);
        this.f16254g = true;
        if (this.f16239J != null) {
            this.f16239J.mo8520a((C5795b) this);
        }
        if (this.f16240K != null) {
            this.f16240K.f18413a = this;
        }
    }

    /* renamed from: a */
    public final void mo11683a(C3009i iVar) {
        if (this.f16254g) {
            if (iVar == null || iVar.getId() <= 0) {
                mo11684a((Throwable) new IllegalArgumentException("User is invalid"));
            } else {
                this.f16252e = User.from(iVar);
                m13228b();
                if (this.f16252e.getFollowInfo() != null && this.f16256i) {
                    this.f16235F.lambda$put$1$DataCenter("data_xt_followed_change", Long.valueOf(this.f16252e.getFollowInfo().getFollowerCount()));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11685a(List<C2970d> list) {
        if (list != null && list.size() > 0) {
            this.f16247R = list;
            if (this.f16236G != null) {
                this.f16236G.f16200y = list;
            }
            this.f16270x.setVisibility(0);
            if (this.f16268v.getVisibility() == 0) {
                this.f16269w.setVisibility(0);
                return;
            }
            this.f16269w.setVisibility(8);
        }
    }

    public void onClick(View view) {
        FansClubData fansClubData;
        boolean z;
        boolean z2;
        int id = view.getId();
        if (id == R.id.hi) {
            if (view.getTag(R.id.hi) instanceof User) {
                if (!(this.f16252e == null || this.f16253f == null || this.f16252e.getLiveRoomId() == 0)) {
                    this.f16252e.getId();
                    this.f16253f.getOwnerUserId();
                }
                if (!this.f16259m) {
                    User user = (User) view.getTag(R.id.hi);
                    if (this.f16253f != null) {
                        if (((Integer) C4639e.m11122a().f12651b).intValue() == 2) {
                            C4575an.m10981a((int) R.string.ejr);
                        } else {
                            if (this.f16256i) {
                                this.f16250c.mo10374a("live_audience_c_anchor", user.getId());
                            } else {
                                this.f16250c.mo10374a("live_audience_c_audience", user.getId());
                            }
                            HashMap hashMap = new HashMap(1);
                            if (this.f16235F != null) {
                                hashMap.put("log_enter_live_source", this.f16235F.get("log_enter_live_source"));
                            } else {
                                hashMap.put("log_enter_live_source", this.f16263q);
                            }
                            hashMap.put("sec_user_id", user.getSecUid());
                            TTLiveSDKContext.getHostService().mo10313f().mo14425a(user.getId(), (Map<String, String>) hashMap);
                            dismiss();
                        }
                    }
                    dismiss();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        if (id == R.id.cbv) {
            this.f16242M.setVisibility(0);
            this.f16243N.setVisibility(8);
            m13229c();
            return;
        }
        if (id == R.id.bk0) {
            if (this.f16253f != null) {
                if (!C6078de.m13238a(getContext())) {
                    C4575an.m10981a((int) R.string.e77);
                } else if (this.f16259m || this.f16261o) {
                    dismiss();
                    if (this.f16241L == null || this.f16252e == null || this.f16241L.getId() != this.f16252e.getId()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int intValue = ((Integer) LiveSettingKeys.LIVE_PROFILE_MANAGE_DIALOG_STYLE.mo9431a()).intValue();
                    if (this.f16261o || intValue == 0) {
                        C6079df dfVar = new C6079df(getContext(), this.f16253f, this.f16252e, z, this.f16245P);
                        dfVar.show();
                    } else {
                        C6080dg dgVar = new C6080dg(getContext(), this.f16253f, this.f16252e, z, this.f16245P);
                        dgVar.show();
                    }
                } else if (this.f16260n) {
                    if (this.f16252e.getUserAttr() == null || !this.f16252e.getUserAttr().f8850a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f16240K != null) {
                        this.f16240K.mo12852a(z2, this.f16253f.getId(), this.f16251d, this.f16252e.getSecUid());
                    }
                }
            }
        } else if (id == R.id.adn) {
            dismiss();
            if (this.f16255h && this.f16235F != null) {
                C5189i iVar = new C5189i();
                iVar.f13897b = this.f16247R;
                if (!(this.f16252e == null || this.f16252e.getFansClub() == null)) {
                    FansClubMember fansClub = this.f16252e.getFansClub();
                    if (fansClub.getPreferData() == null || fansClub.getPreferData().size() <= 0) {
                        fansClubData = null;
                    } else {
                        fansClubData = (FansClubData) fansClub.getPreferData().get(Integer.valueOf(0));
                    }
                    iVar.f13896a = fansClubData;
                }
                this.f16235F.lambda$put$1$DataCenter("cmd_show_fans_club_setting", iVar);
            }
        } else if (id == R.id.bdr) {
            dismiss();
        }
    }

    /* renamed from: a */
    public final void mo12005a(boolean z) {
        int i;
        if (this.f16254g) {
            if (this.f16252e.getUserAttr() == null) {
                this.f16252e.setUserAttr(new C3012k());
            }
            this.f16252e.getUserAttr().f8850a = z;
            TextView textView = this.f16268v;
            if (z) {
                i = R.string.ep1;
            } else {
                i = R.string.ep6;
            }
            textView.setText(i);
        }
    }

    /* renamed from: b */
    public final void mo12006b(boolean z, Exception exc) {
        if (this.f16254g) {
            C4602l.m11047a(getContext(), (Throwable) exc, (int) R.string.eon);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        if (this.f16253f != null) {
            this.f16267u = view.findViewById(R.id.bdr);
            this.f16267u.setOnClickListener(this);
            this.f16237H = view.findViewById(R.id.c5o);
            this.f16237H.setOnClickListener(this);
            this.f16244O = (ViewGroup) view.findViewById(R.id.bhy);
            this.f16242M = view.findViewById(R.id.c62);
            this.f16243N = view.findViewById(R.id.cbv);
            this.f16243N.setOnClickListener(this);
            boolean z2 = false;
            this.f16242M.setVisibility(0);
            this.f16243N.setVisibility(8);
            this.f16266t = view.findViewById(R.id.cbk);
            this.f16268v = (TextView) view.findViewById(R.id.bk0);
            this.f16269w = view.findViewById(R.id.bk2);
            this.f16270x = (TextView) view.findViewById(R.id.adn);
            this.f16270x.setOnClickListener(this);
            this.f16270x.setVisibility(8);
            this.f16271y = (HSImageView) view.findViewById(R.id.hi);
            this.f16272z = (LivingView) view.findViewById(R.id.bef);
            this.f16230A = view.findViewById(R.id.ay8);
            this.f16231B = (HSImageView) view.findViewById(R.id.ay3);
            this.f16232C = (HSImageView) view.findViewById(R.id.ak7);
            this.f16233D = (ImageView) view.findViewById(R.id.ak6);
            this.f16271y.setOnClickListener(this);
            Activity activity = this.f16234E;
            User user = this.f16252e;
            Room room = this.f16253f;
            boolean z3 = this.f16245P;
            int i = this.f16249b;
            C5793ao aoVar = this.f16239J;
            DataCenter dataCenter = this.f16235F;
            C6049cl clVar = new C6049cl();
            clVar.f16188m = user;
            if (user != null) {
                clVar.f16191p = user.getId();
                clVar.f16193r = new C4559aa(activity, room, user.getId());
            }
            clVar.f16192q = room;
            clVar.f16196u = i;
            clVar.f16194s = z3;
            clVar.f16195t = aoVar;
            clVar.f16178c = activity;
            clVar.f16179d = dataCenter;
            if (C8607a.f23572a || ((Integer) LiveSettingKeys.SHOW_ANCHOR_LEVEL.mo9431a()).intValue() != 1) {
                z = false;
            } else {
                z = true;
            }
            clVar.f16201z = z;
            this.f16236G = clVar;
            if (this.f16239J != null) {
                this.f16239J.f15237a = this.f16236G;
            }
            C6049cl clVar2 = this.f16236G;
            if (clVar2 != null) {
                C0679r a = getChildFragmentManager().mo2225a();
                a.mo2191b(R.id.c5i, clVar2);
                a.mo2195c();
            }
            if (this.f16252e == null) {
                this.f16267u.setVisibility(8);
                this.f16244O.setVisibility(0);
            } else {
                m13228b();
            }
            long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
            if (this.f16253f.getOwner() != null && b == this.f16253f.getOwner().getId()) {
                z2 = true;
            }
            this.f16259m = z2;
            if (this.f16259m) {
                this.f16260n = true;
            } else if (!(this.f16241L == null || this.f16241L.getUserAttr() == null)) {
                this.f16261o = this.f16241L.getUserAttr().f8852c;
                this.f16260n = this.f16241L.getUserAttr().f8851b;
            }
            m13229c();
            if (this.f16248S && this.f16255h && !C8607a.f23572a && this.f16239J != null) {
                this.f16239J.mo11678b();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16246Q = layoutInflater.inflate(R.layout.aiv, viewGroup, false);
        return this.f16246Q;
    }

    /* renamed from: a */
    public static C6072db m13227a(Context context, boolean z, long j, Room room, User user, String str) {
        return m13226a(context, z, j, room, user, 1, str);
    }

    /* renamed from: a */
    private static C6072db m13226a(Context context, boolean z, long j, Room room, User user, int i, String str) {
        boolean z2;
        C6072db dbVar = new C6072db();
        dbVar.f16245P = z;
        dbVar.f16251d = j;
        if (TTLiveSDKContext.getHostService().mo10315h().mo14529b() == j) {
            z2 = true;
        } else {
            z2 = false;
        }
        dbVar.f16255h = z2;
        dbVar.f16253f = room;
        dbVar.f16241L = user;
        dbVar.f16239J = new C5793ao();
        dbVar.f16250c = new C4559aa(context, room, j);
        dbVar.f16240K = new C6737a();
        dbVar.f16249b = 1;
        dbVar.f16263q = str;
        dbVar.f16234E = (Activity) context;
        return dbVar;
    }
}
