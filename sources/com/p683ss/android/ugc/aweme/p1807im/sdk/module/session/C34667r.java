package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.AppCompatTextView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService.C36678a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1865b.C34647a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a.C34572a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34582d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.unread.UnReadVideoSessionViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.unread.UnReadVideoSessionViewModel.C34672a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34028i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34041l;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34044o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.BadgeTextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35414p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.SessionStatusImageView;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.r */
public class C34667r extends C1352v {

    /* renamed from: a */
    protected final AppCompatTextView f89301a;

    /* renamed from: b */
    protected final AppCompatTextView f89302b;

    /* renamed from: c */
    protected final ImageView f89303c;

    /* renamed from: d */
    protected IUnReadVideoService f89304d;

    /* renamed from: e */
    protected UnReadCircleView f89305e;

    /* renamed from: f */
    public C35456b f89306f;

    /* renamed from: g */
    int f89307g;

    /* renamed from: h */
    private final AvatarImageView f89308h;

    /* renamed from: i */
    private final AnimationImageView f89309i;

    /* renamed from: j */
    private final AppCompatTextView f89310j;

    /* renamed from: k */
    private final AppCompatTextView f89311k;

    /* renamed from: l */
    private final BadgeTextView f89312l;

    /* renamed from: m */
    private final SessionStatusImageView f89313m;

    /* renamed from: n */
    private final ImageView f89314n;

    /* renamed from: o */
    private final ImageView f89315o;

    /* renamed from: p */
    private final View f89316p;

    /* renamed from: q */
    private final UnReadVideoSessionViewModel f89317q;

    /* renamed from: r */
    private C36678a f89318r;

    /* renamed from: s */
    private final C35414p f89319s = new C35414p();

    /* renamed from: t */
    private String f89320t;

    /* renamed from: a */
    public void mo72727a() {
        if (!C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112955a((Object) this);
        }
    }

    /* renamed from: b */
    public void mo72730b() {
        if (C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112959c((Object) this);
        }
    }

    @C53771m
    public void onSessionUpdate(C34041l lVar) {
        if (TextUtils.equals(this.f89306f.bm_(), lVar.f88007a)) {
            String str = lVar.f88008b;
            if ((this.f89306f instanceof C34582d) && !TextUtils.isEmpty(str)) {
                this.f89306f.f91117h = str;
                this.f89301a.setText(((C34582d) this.f89306f).mo72645e());
            }
        }
    }

    @C53771m
    public void onUserUpdate(C34044o oVar) {
        C34572a aVar;
        if (TextUtils.equals(this.f89320t, oVar.f88009a)) {
            IMUser b = C34010e.m77748a().mo71964b(oVar.f88009a);
            if (b != null) {
                UrlModel avatarThumb = b.getAvatarThumb();
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    C23515d.m57668a((RemoteImageView) this.f89308h, 2131953301);
                } else {
                    C23515d.m57669a((RemoteImageView) this.f89308h, avatarThumb);
                }
                if (this.f89306f != null && !TextUtils.isEmpty(this.f89306f.bm_())) {
                    m78651a(b, this.f89306f.bm_());
                    this.f89306f.bm_();
                }
                this.f89310j.setText(b.getDisplayName());
                ImageView imageView = this.f89319s.f91053a;
                if (C35231bg.m79633c(b)) {
                    aVar = C34572a.MUSICIAN;
                } else if (C35231bg.m79634d(b)) {
                    aVar = C34572a.ENTERPRISE;
                } else if (C35231bg.m79632b(b)) {
                    aVar = C34572a.OTHER;
                } else {
                    aVar = C34572a.NONE;
                }
                imageView.setVisibility(0);
                switch (aVar) {
                    case MUSICIAN:
                        imageView.setImageResource(R.drawable.azc);
                        break;
                    case ENTERPRISE:
                        imageView.setImageResource(R.drawable.azd);
                        break;
                    case OTHER:
                        imageView.setImageResource(R.drawable.az5);
                        break;
                    default:
                        imageView.setVisibility(4);
                        break;
                }
                if (b != null) {
                    C47916gh.m103675a(this.itemView.getContext(), b.getCustomVerify(), b.getEnterpriseVerifyReason(), this.f89310j);
                    return;
                }
                C47916gh.m103675a(this.itemView.getContext(), "", "", this.f89310j);
            }
        }
    }

    /* renamed from: a */
    private static void m78651a(IMUser iMUser, String str) {
        if (iMUser != null && TextUtils.isEmpty(iMUser.getSecUid())) {
            C34028i.m77786a(str);
        }
    }

    /* renamed from: a */
    private void m78650a(AvatarImageView avatarImageView, C35456b bVar) {
        if (bVar.f91115f instanceof UrlModel) {
            C23515d.m57669a((RemoteImageView) avatarImageView, (UrlModel) bVar.f91115f);
        } else if (bVar.f91115f instanceof C23556a) {
            C23515d.m57676a((RemoteImageView) avatarImageView, (C23556a) bVar.f91115f);
        }
        if (!TextUtils.isEmpty(bVar.f91116g)) {
            C35178a.m79421a((View) this.f89308h, bVar.f91116g);
        }
    }

    public C34667r(View view, C34647a aVar) {
        IUnReadVideoService iUnReadVideoService;
        super(view);
        this.f89308h = (AvatarImageView) view.findViewById(R.id.hy);
        this.f89309i = (AnimationImageView) view.findViewById(R.id.i4);
        this.f89310j = (AppCompatTextView) view.findViewById(R.id.dn1);
        this.f89311k = (AppCompatTextView) view.findViewById(R.id.amo);
        this.f89301a = (AppCompatTextView) view.findViewById(R.id.b6j);
        this.f89302b = (AppCompatTextView) view.findViewById(R.id.b6k);
        this.f89312l = (BadgeTextView) view.findViewById(R.id.car);
        this.f89314n = (ImageView) view.findViewById(R.id.cas);
        this.f89315o = (ImageView) view.findViewById(R.id.bp3);
        this.f89313m = (SessionStatusImageView) view.findViewById(R.id.b46);
        this.f89303c = (ImageView) view.findViewById(R.id.ces);
        this.f89316p = view.findViewById(R.id.cll);
        this.f89305e = (UnReadCircleView) view.findViewById(R.id.f7l);
        this.f89317q = C34672a.m78655a((FragmentActivity) view.getContext());
        Object a = C27991b.m66756a(IUnReadVideoService.class);
        if (a != null) {
            iUnReadVideoService = (IUnReadVideoService) a;
        } else {
            iUnReadVideoService = (IUnReadVideoService) C20302a.m50070a(IUnReadVideoService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        this.f89304d = iUnReadVideoService;
        view.setOnClickListener(new C34668s(this, aVar));
        view.setOnLongClickListener(new C34669t(this, aVar));
        this.f89308h.setOnClickListener(new C34670u(this, aVar));
    }

    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05c9  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x05fb  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x06f2  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x072e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02cc  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72728a(com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r0.f89306f = r1
            r0.f89307g = r2
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a.b r3 = new com.ss.android.ugc.aweme.im.sdk.module.session.a.a.b
            r3.<init>(r1)
            com.ss.android.ugc.aweme.im.sdk.widget.SessionStatusImageView r4 = r0.f89313m
            android.graphics.drawable.Drawable r5 = r3.mo72641d()
            r4.setImageDrawable(r5)
            com.ss.android.ugc.aweme.im.sdk.widget.p r4 = r0.f89319s
            android.widget.ImageView r5 = r4.f91053a
            r6 = 8
            r5.setVisibility(r6)
            int r5 = r17.bn_()
            r7 = 1
            r8 = 0
            if (r5 == r7) goto L_0x0083
            boolean r5 = r1 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a
            if (r5 == 0) goto L_0x0035
            r9 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a r9 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a) r9
            boolean r9 = r9.f89109b
            if (r9 == 0) goto L_0x0035
            goto L_0x0083
        L_0x0035:
            if (r5 == 0) goto L_0x0096
            java.lang.String r4 = r17.bm_()
            long r4 = com.bytedance.p702im.core.p706c.C11190e.m22685a(r4)
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0096
            com.ss.android.ugc.aweme.im.sdk.d.e r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r9.mo71964b(r4)
            boolean r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79633c(r4)
            if (r5 == 0) goto L_0x005f
            r4 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a) r4
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a$a r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a.C34572a.MUSICIAN
            r4.f89108a = r5
            goto L_0x0096
        L_0x005f:
            boolean r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79634d(r4)
            if (r5 == 0) goto L_0x006d
            r4 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a) r4
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a$a r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a.C34572a.ENTERPRISE
            r4.f89108a = r5
            goto L_0x0096
        L_0x006d:
            boolean r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79632b(r4)
            if (r4 == 0) goto L_0x007b
            r4 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a) r4
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a$a r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a.C34572a.OTHER
            r4.f89108a = r5
            goto L_0x0096
        L_0x007b:
            r4 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a) r4
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a$a r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a.C34572a.NONE
            r4.f89108a = r5
            goto L_0x0096
        L_0x0083:
            boolean r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
            if (r5 != 0) goto L_0x0096
            android.widget.ImageView r5 = r4.f91053a
            r5.setVisibility(r8)
            android.widget.ImageView r4 = r4.f91053a
            r5 = 2131954225(0x7f130a31, float:1.9544943E38)
            r4.setImageResource(r5)
        L_0x0096:
            android.widget.ImageView r4 = r0.f89314n
            r4.setVisibility(r6)
            android.support.v7.widget.AppCompatTextView r4 = r0.f89311k
            r4.setVisibility(r6)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r4 = r0.f89312l
            r4.setBadgeCount(r8)
            r4 = 0
            r0.f89320t = r4
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r5 = r0.f89308h
            com.facebook.drawee.h.b r5 = r5.getHierarchy()
            com.facebook.drawee.f.a r5 = (com.facebook.drawee.p940f.C13833a) r5
            r9 = 2131953301(0x7f130695, float:1.954307E38)
            r5.mo25902b(r9)
            com.bytedance.im.core.c.d r5 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r10 = r17.bm_()
            com.bytedance.im.core.c.b r5 = r5.mo20658a(r10)
            boolean r10 = r17.mo73754h()
            if (r10 == 0) goto L_0x00d2
            if (r5 == 0) goto L_0x00d2
            boolean r10 = r5.isMute()
            if (r10 == 0) goto L_0x00d2
            r10 = 1
            goto L_0x00d3
        L_0x00d2:
            r10 = 0
        L_0x00d3:
            com.ss.android.ugc.aweme.unread.UnReadCircleView r11 = r0.f89305e
            r11.setVisibility(r6)
            int r11 = r17.mo72634b()
            r13 = 33
            switch(r11) {
                case 0: goto L_0x04c5;
                case 1: goto L_0x04a6;
                case 2: goto L_0x047f;
                case 3: goto L_0x045a;
                case 4: goto L_0x043b;
                case 5: goto L_0x041e;
                case 6: goto L_0x00e1;
                case 7: goto L_0x00e1;
                case 8: goto L_0x00e1;
                case 9: goto L_0x00e1;
                case 10: goto L_0x03f6;
                case 11: goto L_0x00e1;
                case 12: goto L_0x00e1;
                case 13: goto L_0x00e1;
                case 14: goto L_0x03d9;
                case 15: goto L_0x00e1;
                case 16: goto L_0x00e1;
                case 17: goto L_0x034e;
                case 18: goto L_0x0339;
                case 19: goto L_0x00e1;
                case 20: goto L_0x02cc;
                case 21: goto L_0x00e1;
                case 22: goto L_0x029c;
                case 23: goto L_0x0272;
                case 24: goto L_0x0243;
                case 25: goto L_0x021b;
                case 26: goto L_0x0200;
                case 27: goto L_0x00e1;
                case 28: goto L_0x022a;
                case 29: goto L_0x011e;
                case 30: goto L_0x00e1;
                case 31: goto L_0x00f5;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
            if (r2 == 0) goto L_0x05c0
            android.widget.ImageView r2 = r0.f89314n
            int r4 = r1.f91119j
            if (r4 <= 0) goto L_0x05ba
            r4 = 0
            goto L_0x05bc
        L_0x00f5:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r9 = r1.f91119j
            r2.setBadgeCount(r9)
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r2 = "task_message"
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r11 = "show_type"
            r9.put(r11, r2)
            java.lang.String r2 = "show_commerce_message"
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r9)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x011e:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            android.view.View r2 = r0.itemView
            r9 = 2132017531(0x7f14017b, float:1.9673343E38)
            android.view.View r2 = r2.findViewById(r9)
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            boolean r9 = r9 instanceof android.widget.LinearLayout.LayoutParams
            if (r9 == 0) goto L_0x013e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r9 = 48
            r2.gravity = r9
        L_0x013e:
            android.support.v7.widget.AppCompatTextView r2 = r0.f89301a
            r2.setSingleLine(r8)
            android.view.View r2 = r0.f89316p
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r9 = -2
            r2.height = r9
            android.support.v7.widget.AppCompatTextView r2 = r0.f89301a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r2.height = r9
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34591g
            if (r2 == 0) goto L_0x05c7
            android.support.v7.widget.AppCompatTextView r2 = r0.f89301a
            java.lang.String r9 = "tv"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r9)
            com.ss.android.ugc.aweme.im.sdk.d.b r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r11 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r11)
            com.ss.android.ugc.aweme.im.service.j r9 = r9.mo71949f()
            if (r9 == 0) goto L_0x05c7
            com.ss.android.ugc.aweme.im.sdk.d.b r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r11 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r11)
            com.ss.android.ugc.aweme.im.service.j r9 = r9.mo71949f()
            java.lang.String r11 = "AwemeImManager.instance().proxy"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r11)
            com.ss.android.ugc.aweme.im.service.m r9 = r9.getUnder16Proxy()
            java.lang.String r11 = "AwemeImManager.instance().proxy.under16Proxy"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r11)
            if (r9 == 0) goto L_0x05c7
            java.lang.String r11 = r9.mo70453g()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x05c7
            java.lang.String r11 = r9.mo70452f()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x05c7
            android.text.SpannableString r11 = new android.text.SpannableString
            java.lang.String r14 = r9.mo70452f()
            java.lang.String r15 = r9.mo70453g()
            java.lang.String r14 = p2628d.p2639f.p2641b.C52711k.m112231a(r14, r15)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r11.<init>(r14)
            java.lang.String r14 = r9.mo70453g()
            if (r14 != 0) goto L_0x01bf
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01bf:
            int r14 = r14.length()
            android.text.style.ForegroundColorSpan r15 = new android.text.style.ForegroundColorSpan
            android.content.res.Resources r4 = com.p683ss.android.ugc.aweme.base.utils.C23723j.m58217a()
            r12 = 2131821392(0x7f110350, float:1.9275526E38)
            int r4 = r4.getColor(r12)
            r15.<init>(r4)
            int r4 = r11.length()
            int r4 = r4 - r14
            int r12 = r11.length()
            int r12 = r12 - r7
            r11.setSpan(r15, r4, r12, r13)
            com.ss.android.ugc.aweme.im.sdk.module.session.a.g$b r4 = new com.ss.android.ugc.aweme.im.sdk.module.session.a.g$b
            r4.<init>(r9)
            int r9 = r11.length()
            int r9 = r9 - r14
            int r12 = r11.length()
            int r12 = r12 - r7
            r11.setSpan(r4, r9, r12, r13)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r2.setText(r11)
            android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r4)
            goto L_0x05c7
        L_0x0200:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            android.widget.ImageView r2 = r0.f89314n
            int r4 = r1.f91119j
            if (r4 <= 0) goto L_0x020d
            r4 = 0
            goto L_0x020f
        L_0x020d:
            r4 = 8
        L_0x020f:
            r2.setVisibility(r4)
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x021b:
            int r2 = r1.f91119j
            if (r2 <= 0) goto L_0x0225
            android.support.v7.widget.AppCompatTextView r2 = r0.f89302b
            r2.setVisibility(r6)
            goto L_0x022a
        L_0x0225:
            android.support.v7.widget.AppCompatTextView r2 = r0.f89302b
            r2.setVisibility(r8)
        L_0x022a:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            android.widget.ImageView r2 = r0.f89314n
            int r4 = r1.f91119j
            if (r4 <= 0) goto L_0x0237
            r4 = 0
            goto L_0x0239
        L_0x0237:
            r4 = 8
        L_0x0239:
            r2.setVisibility(r4)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            r2.setVisibility(r6)
            goto L_0x05c7
        L_0x0243:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            if (r10 == 0) goto L_0x025d
            android.widget.ImageView r2 = r0.f89314n
            int r4 = r1.f91119j
            if (r4 <= 0) goto L_0x0252
            r4 = 0
            goto L_0x0254
        L_0x0252:
            r4 = 8
        L_0x0254:
            r2.setVisibility(r4)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            r2.setVisibility(r6)
            goto L_0x0269
        L_0x025d:
            android.widget.ImageView r2 = r0.f89314n
            r2.setVisibility(r6)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
        L_0x0269:
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x0272:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r0.f89308h
            r0.m78650a(r4, r1)
            android.widget.ImageView r4 = r0.f89314n
            int r9 = r1.f91119j
            if (r9 <= 0) goto L_0x027f
            r9 = 0
            goto L_0x0281
        L_0x027f:
            r9 = 8
        L_0x0281:
            r4.setVisibility(r9)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r4 = r0.f89312l
            r4.setVisibility(r6)
            boolean r4 = r1.f91123n
            if (r4 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r4 = "urge_update_info"
            int r9 = r1.f91119j
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79459a(r4, r2, r9, r8)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x029c:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r2 = "dou_plus_message"
            java.lang.String r4 = "1001"
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r11 = "show_type"
            r9.put(r11, r2)
            java.lang.String r2 = "scene_id"
            r9.put(r2, r4)
            java.lang.String r2 = "show_commerce_message"
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r9)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x02cc:
            java.lang.Object r2 = r1.f91115f
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x02df
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r4 = 2131954213(0x7f130a25, float:1.9544919E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r2, r4)
            goto L_0x02e8
        L_0x02df:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            java.lang.Object r4 = r1.f91115f
            java.lang.String r4 = (java.lang.String) r4
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r2, r4)
        L_0x02e8:
            if (r10 == 0) goto L_0x02fd
            android.widget.ImageView r2 = r0.f89314n
            int r4 = r1.f91119j
            if (r4 <= 0) goto L_0x02f2
            r4 = 0
            goto L_0x02f4
        L_0x02f2:
            r4 = 8
        L_0x02f4:
            r2.setVisibility(r4)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            r2.setVisibility(r6)
            goto L_0x0309
        L_0x02fd:
            android.widget.ImageView r2 = r0.f89314n
            r2.setVisibility(r6)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
        L_0x0309:
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x0310
            r1.mo73752a(r7)
        L_0x0310:
            if (r5 == 0) goto L_0x05c7
            android.support.v7.widget.AppCompatTextView r2 = r0.f89311k
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            r9 = 2132545355(0x7f1c0f4b, float:2.0743897E38)
            java.lang.Object[] r11 = new java.lang.Object[r7]
            int r12 = r5.getMemberCount()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r8] = r12
            java.lang.String r4 = r4.getString(r9, r11)
            r2.setText(r4)
            android.support.v7.widget.AppCompatTextView r2 = r0.f89311k
            r2.setVisibility(r8)
            goto L_0x05c7
        L_0x0339:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x034e:
            com.ss.android.ugc.aweme.im.sdk.d.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            com.ss.android.ugc.aweme.im.service.j r2 = r2.mo71949f()
            com.ss.android.ugc.aweme.im.service.model.e r2 = r2.getIMSetting()
            if (r2 == 0) goto L_0x039e
            com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings r4 = r2.f91146d
            if (r4 == 0) goto L_0x039e
            com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings r2 = r2.f91146d
            java.lang.String r4 = r2.getMsgCellAvatarUrl()     // Catch:{ a -> 0x039d }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ a -> 0x039d }
            if (r4 != 0) goto L_0x038c
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r0.f89308h     // Catch:{ a -> 0x039d }
            com.facebook.drawee.h.b r4 = r4.getHierarchy()     // Catch:{ a -> 0x039d }
            com.facebook.drawee.f.a r4 = (com.facebook.drawee.p940f.C13833a) r4     // Catch:{ a -> 0x039d }
            r9 = 2131954306(0x7f130a82, float:1.9545108E38)
            r4.mo25902b(r9)     // Catch:{ a -> 0x039d }
            java.lang.String r4 = r2.getMsgCellAvatarUrl()     // Catch:{ a -> 0x039d }
            java.util.List r4 = java.util.Collections.singletonList(r4)     // Catch:{ a -> 0x039d }
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = new com.ss.android.ugc.aweme.base.model.UrlModel     // Catch:{ a -> 0x039d }
            r9.<init>()     // Catch:{ a -> 0x039d }
            r9.setUrlList(r4)     // Catch:{ a -> 0x039d }
            r1.f91115f = r9     // Catch:{ a -> 0x039d }
        L_0x038c:
            java.lang.String r4 = r2.getMsgCellName()     // Catch:{ a -> 0x039d }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ a -> 0x039d }
            if (r4 != 0) goto L_0x039e
            java.lang.String r2 = r2.getMsgCellName()     // Catch:{ a -> 0x039d }
            r1.f91116g = r2     // Catch:{ a -> 0x039d }
            goto L_0x039e
        L_0x039d:
        L_0x039e:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            r2 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.b r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34576b) r2
            int r4 = r2.f89121a
            int r2 = r2.f91119j
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r9 = r0.f89312l
            r9.setBadgeCount(r2)
            android.widget.ImageView r9 = r0.f89314n
            if (r2 != 0) goto L_0x03b7
            if (r4 <= 0) goto L_0x03b7
            r2 = 0
            goto L_0x03b9
        L_0x03b7:
            r2 = 8
        L_0x03b9:
            r9.setVisibility(r2)
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r4 = "action_type"
            java.lang.String r9 = "show"
            r2.put(r4, r9)
            java.lang.String r4 = "flipchat_message_entrance"
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r2)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x03d9:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r2 = "ad_order_assistant_message"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79523i(r2)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x03f6:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r0.f89308h
            r0.m78650a(r4, r1)
            r4 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.f r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34589f) r4
            int r4 = r4.mo72648f()
            android.widget.ImageView r9 = r0.f89314n
            if (r4 <= 0) goto L_0x0408
            r11 = 0
            goto L_0x040a
        L_0x0408:
            r11 = 8
        L_0x040a:
            r9.setVisibility(r11)
            boolean r9 = r1.f91123n
            if (r9 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r9 = "message_assistant"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79459a(r9, r2, r4, r8)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x041e:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r0.m78650a(r2, r1)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r2 = "shopping_assistant_message"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79523i(r2)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x043b:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r0.f89308h
            r0.m78650a(r4, r1)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r4 = r0.f89312l
            int r9 = r1.f91119j
            r4.setBadgeCount(r9)
            boolean r4 = r1.f91123n
            if (r4 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r4 = "official_info"
            int r9 = r1.f91119j
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79459a(r4, r2, r9, r7)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x045a:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r0.f89308h
            r0.m78650a(r4, r1)
            android.widget.ImageView r4 = r0.f89314n
            int r9 = r1.f91119j
            if (r9 <= 0) goto L_0x0467
            r9 = 0
            goto L_0x0469
        L_0x0467:
            r9 = 8
        L_0x0469:
            r4.setVisibility(r9)
            boolean r4 = r1.f91123n
            if (r4 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r4 = "douyin_assistant"
            int r9 = r1.f91119j
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79459a(r4, r2, r9, r8)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x047f:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            r4 = 2131954310(0x7f130a86, float:1.9545116E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r2, r4)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r9 = 2132545192(0x7f1c0ea8, float:2.0743567E38)
            java.lang.String r4 = r4.getString(r9)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a.m79421a(r2, r4)
            android.widget.ImageView r2 = r0.f89314n
            int r4 = r1.f91119j
            if (r4 <= 0) goto L_0x049f
            r4 = 0
            goto L_0x04a1
        L_0x049f:
            r4 = 8
        L_0x04a1:
            r2.setVisibility(r4)
            goto L_0x05c7
        L_0x04a6:
            java.lang.Object r2 = r1.f91115f
            boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.base.model.UrlModel
            if (r2 == 0) goto L_0x04b5
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            java.lang.Object r4 = r1.f91115f
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r4
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r2, r4)
        L_0x04b5:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r0.f89308h
            java.lang.String r4 = r1.f91116g
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a.m79421a(r2, r4)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
            goto L_0x05c7
        L_0x04c5:
            java.lang.String r2 = r17.bm_()
            long r11 = com.bytedance.p702im.core.p706c.C11190e.m22685a(r2)
            com.ss.android.ugc.aweme.im.sdk.d.e r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            java.lang.String r4 = java.lang.String.valueOf(r11)
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = r2.mo71964b(r4)
            java.lang.String r4 = java.lang.String.valueOf(r11)
            r0.f89320t = r4
            if (r2 == 0) goto L_0x04f5
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r2.getAvatarThumb()
            java.lang.String r14 = r17.bm_()
            m78651a(r2, r14)
            r17.bm_()
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r14 = r0.f89308h
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a.m79422a(r14, r2)
            goto L_0x04f6
        L_0x04f5:
            r4 = 0
        L_0x04f6:
            if (r4 == 0) goto L_0x050f
            java.util.List r14 = r4.getUrlList()
            if (r14 == 0) goto L_0x050f
            java.util.List r14 = r4.getUrlList()
            int r14 = r14.size()
            if (r14 != 0) goto L_0x0509
            goto L_0x050f
        L_0x0509:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r9 = r0.f89308h
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r9, r4)
            goto L_0x0514
        L_0x050f:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r0.f89308h
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r4, r9)
        L_0x0514:
            com.ss.android.ugc.aweme.main.service.IUnReadVideoService r4 = r0.f89304d
            r9 = 4
            boolean r4 = r4.checkEnableExperiment(r9)
            if (r4 == 0) goto L_0x0554
            if (r2 == 0) goto L_0x0554
            java.lang.String r2 = r2.getUid()
            com.ss.android.ugc.aweme.im.sdk.module.session.unread.UnReadVideoSessionViewModel r4 = r0.f89317q
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r4.f89330a
            java.lang.Object r2 = r4.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0534
            int r2 = r2.intValue()
            goto L_0x0535
        L_0x0534:
            r2 = 0
        L_0x0535:
            com.ss.android.ugc.aweme.im.sdk.module.session.unread.UnReadVideoSessionViewModel r4 = r0.f89317q
            java.util.List<java.lang.String> r4 = r4.f89331b
            if (r2 <= 0) goto L_0x0554
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            if (r2 != 0) goto L_0x0554
            com.ss.android.ugc.aweme.main.service.IUnReadVideoService$a r2 = r0.f89318r
            if (r2 != 0) goto L_0x0551
            com.ss.android.ugc.aweme.main.service.IUnReadVideoService r2 = r0.f89304d
            com.ss.android.ugc.aweme.unread.UnReadCircleView r4 = r0.f89305e
            java.lang.String r9 = "homepage_message"
            com.ss.android.ugc.aweme.main.service.IUnReadVideoService$a r2 = r2.createUnReadListController(r4, r9)
            r0.f89318r = r2
        L_0x0551:
            com.ss.android.ugc.aweme.main.service.IUnReadVideoService$a r2 = r0.f89318r
            goto L_0x0559
        L_0x0554:
            com.ss.android.ugc.aweme.unread.UnReadCircleView r2 = r0.f89305e
            r2.setVisibility(r6)
        L_0x0559:
            if (r10 == 0) goto L_0x056e
            android.widget.ImageView r2 = r0.f89314n
            int r4 = r1.f91119j
            if (r4 <= 0) goto L_0x0563
            r4 = 0
            goto L_0x0565
        L_0x0563:
            r4 = 8
        L_0x0565:
            r2.setVisibility(r4)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            r2.setVisibility(r6)
            goto L_0x057a
        L_0x056e:
            android.widget.ImageView r2 = r0.f89314n
            r2.setVisibility(r6)
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
        L_0x057a:
            com.ss.android.ugc.aweme.im.sdk.module.session.d r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34604d.f89152b
            com.ss.android.ugc.aweme.im.sdk.module.session.g r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34604d.m78559c(r5)
            if (r2 == 0) goto L_0x0587
            int r2 = r2.getMark_read()
            goto L_0x0588
        L_0x0587:
            r2 = 1
        L_0x0588:
            if (r2 != 0) goto L_0x058c
            r2 = 1
            goto L_0x058d
        L_0x058c:
            r2 = 0
        L_0x058d:
            if (r2 == 0) goto L_0x059c
            android.widget.ImageView r2 = r0.f89314n
            int r4 = r1.f91119j
            if (r4 <= 0) goto L_0x0598
            r4 = 8
            goto L_0x0599
        L_0x0598:
            r4 = 0
        L_0x0599:
            r2.setVisibility(r4)
        L_0x059c:
            boolean r2 = r1.f91123n
            if (r2 != 0) goto L_0x05c7
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r2 = java.lang.String.valueOf(r11)
            java.lang.String r4 = "message"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79509f(r2, r4)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r2 = "chat_notice_show"
            int r4 = r1.f91119j
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79483b(r2, r4)
            r1.mo73752a(r7)
            goto L_0x05c7
        L_0x05ba:
            r4 = 8
        L_0x05bc:
            r2.setVisibility(r4)
            goto L_0x05c7
        L_0x05c0:
            com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView r2 = r0.f89312l
            int r4 = r1.f91119j
            r2.setBadgeCount(r4)
        L_0x05c7:
            if (r10 == 0) goto L_0x05cf
            android.widget.ImageView r2 = r0.f89315o
            r2.setVisibility(r8)
            goto L_0x05d4
        L_0x05cf:
            android.widget.ImageView r2 = r0.f89315o
            r2.setVisibility(r6)
        L_0x05d4:
            java.lang.String r2 = r3.mo72638a()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x05e0
            java.lang.String r2 = ""
        L_0x05e0:
            android.support.v7.widget.AppCompatTextView r4 = r0.f89310j
            r4.setText(r2)
            java.lang.String r4 = r17.bm_()
            long r9 = com.bytedance.p702im.core.p706c.C11190e.m22685a(r4)
            com.ss.android.ugc.aweme.im.sdk.d.e r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            java.lang.String r6 = java.lang.String.valueOf(r9)
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.mo71964b(r6)
            if (r4 == 0) goto L_0x060f
            android.view.View r6 = r0.itemView
            android.content.Context r6 = r6.getContext()
            java.lang.String r9 = r4.getCustomVerify()
            java.lang.String r4 = r4.getEnterpriseVerifyReason()
            android.support.v7.widget.AppCompatTextView r10 = r0.f89310j
            com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r6, r9, r4, r10)
            goto L_0x061e
        L_0x060f:
            android.view.View r4 = r0.itemView
            android.content.Context r4 = r4.getContext()
            java.lang.String r6 = ""
            java.lang.String r9 = ""
            android.support.v7.widget.AppCompatTextView r10 = r0.f89310j
            com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r4, r6, r9, r10)
        L_0x061e:
            int r4 = r17.mo72634b()
            r6 = 29
            if (r4 == r6) goto L_0x06ee
            java.lang.String r4 = r3.mo72639b()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0645
            java.lang.String r4 = r3.mo72639b()
            int r4 = r4.length()
            r6 = 300(0x12c, float:4.2E-43)
            if (r4 <= r6) goto L_0x0645
            java.lang.String r4 = r3.mo72639b()
            java.lang.String r4 = r4.substring(r8, r6)
            goto L_0x064d
        L_0x0645:
            java.lang.String r4 = r3.mo72639b()
            if (r4 != 0) goto L_0x064d
            java.lang.String r4 = ""
        L_0x064d:
            int r6 = r17.mo72634b()
            r9 = 20
            if (r6 != r9) goto L_0x0663
            android.support.v7.widget.AppCompatTextView r2 = r0.f89301a
            r4 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.d r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34582d) r4
            android.text.SpannableStringBuilder r4 = r4.mo72645e()
            r2.setText(r4)
            goto L_0x06ee
        L_0x0663:
            int r6 = r17.mo72634b()
            if (r6 != 0) goto L_0x06e9
            com.ss.android.ugc.aweme.im.sdk.module.session.d r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34604d.f89152b
            java.lang.String r6 = "finalSetUserName"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r6)
            boolean r2 = r4.mo72653a(r5)
            if (r2 == 0) goto L_0x0686
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2132546073(0x7f1c1219, float:2.0745354E38)
            java.lang.String r4 = r2.getString(r4)
            goto L_0x0687
        L_0x0686:
            r4 = 0
        L_0x0687:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x06a2
            java.lang.String r2 = "DmHelper"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "bind->dmSessionSugst->"
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r7 = 4
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r7, r2, r6)
            goto L_0x06e3
        L_0x06a2:
            r2 = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a) r2
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.lang.String r6 = r2.f91117h
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x06e3
            java.lang.String r6 = r2.f91117h
            r4.append(r6)
            int r2 = r2.f91119j
            if (r2 <= 0) goto L_0x06e3
            boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImUnreadMessageEnhanceExperiment.m76329a()
            if (r2 == 0) goto L_0x06e3
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            int r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImUnreadMessageEnhanceExperiment.m76331c()
            r2.<init>(r6)
            int r6 = r4.length()
            r4.setSpan(r2, r8, r6, r13)
            boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImUnreadMessageEnhanceExperiment.m76330b()
            if (r2 == 0) goto L_0x06e3
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r7)
            int r6 = r4.length()
            r4.setSpan(r2, r8, r6, r13)
        L_0x06e3:
            android.support.v7.widget.AppCompatTextView r2 = r0.f89301a
            r2.setText(r4)
            goto L_0x06ee
        L_0x06e9:
            android.support.v7.widget.AppCompatTextView r2 = r0.f89301a
            r2.setText(r4)
        L_0x06ee:
            boolean r2 = r1.f91124o
            if (r2 == 0) goto L_0x06f7
            android.support.v7.widget.AppCompatTextView r2 = r0.f89301a
            com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b.m69342a(r2)
        L_0x06f7:
            if (r5 == 0) goto L_0x0715
            com.bytedance.im.core.c.p r2 = r5.getLastMessage()
            if (r2 == 0) goto L_0x0715
            com.bytedance.im.core.c.p r2 = r5.getLastMessage()
            android.support.v7.widget.AppCompatTextView r3 = r0.f89302b
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            long r5 = r2.getCreatedAt()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35220bb.m79611b(r4, r5)
            r3.setText(r2)
            goto L_0x071e
        L_0x0715:
            android.support.v7.widget.AppCompatTextView r2 = r0.f89302b
            java.lang.String r3 = r3.mo72640c()
            r2.setText(r3)
        L_0x071e:
            int r1 = r1.f91121l
            if (r1 <= 0) goto L_0x072e
            android.view.View r1 = r0.f89316p
            r2 = 2131953954(0x7f130922, float:1.9544394E38)
            r3 = 2131821403(0x7f11035b, float:1.9275548E38)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35203aq.m79583a(r1, r2, r3)
            return
        L_0x072e:
            android.view.View r1 = r0.f89316p
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35203aq.m79582a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34667r.mo72728a(com.ss.android.ugc.aweme.im.service.h.b, int):void");
    }
}
