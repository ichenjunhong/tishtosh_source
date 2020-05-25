package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32464b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33359af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c.C35109a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.k */
public final class C35405k extends C1164e {

    /* renamed from: a */
    public final C35109a f90995a;

    /* renamed from: b */
    public final C35109a f90996b;

    /* renamed from: c */
    public EditText f90997c;

    /* renamed from: d */
    public SharePackage f90998d;

    /* renamed from: e */
    private final IMUser[] f90999e;

    /* renamed from: f */
    private final IMContact[] f91000f;

    /* renamed from: g */
    private RemoteImageView f91001g;

    /* renamed from: h */
    private DmtTextView f91002h;

    /* renamed from: i */
    private ViewGroup f91003i;

    /* renamed from: j */
    private TextView f91004j;

    /* renamed from: k */
    private Button f91005k;

    /* renamed from: l */
    private Button f91006l;

    /* renamed from: m */
    private View f91007m;

    /* renamed from: n */
    private Context f91008n;

    /* renamed from: o */
    private String f91009o;

    /* renamed from: p */
    private int f91010p;

    /* renamed from: q */
    private int f91011q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.k$a */
    public static class C35409a {

        /* renamed from: a */
        public Context f91015a;

        /* renamed from: b */
        public IMContact[] f91016b;

        /* renamed from: c */
        public IMUser[] f91017c;

        /* renamed from: d */
        public SharePackage f91018d;

        /* renamed from: e */
        public C35109a f91019e;

        /* renamed from: f */
        public C35109a f91020f;

        /* renamed from: g */
        public String f91021g;

        /* renamed from: h */
        private int f91022h;

        /* renamed from: i */
        private int f91023i;

        /* renamed from: a */
        public final C35405k mo73690a() {
            return new C35405k(this);
        }

        /* renamed from: a */
        public final C35409a mo73686a(C35109a aVar) {
            this.f91019e = aVar;
            return this;
        }

        /* renamed from: b */
        public final C35409a mo73692b(C35109a aVar) {
            this.f91020f = aVar;
            return this;
        }

        public C35409a(Context context) {
            this.f91015a = context;
        }

        /* renamed from: a */
        public final C35409a mo73687a(SharePackage sharePackage) {
            this.f91018d = sharePackage;
            return this;
        }

        /* renamed from: a */
        public final C35409a mo73685a(int i) {
            this.f91022h = C32464b.m75163a(this.f91015a, 416.0f);
            return this;
        }

        /* renamed from: b */
        public final C35409a mo73691b(int i) {
            this.f91023i = C32464b.m75163a(this.f91015a, 335.0f);
            return this;
        }

        /* renamed from: a */
        public final C35409a mo73688a(String str) {
            if (str == null) {
                str = "";
            }
            this.f91021g = str;
            return this;
        }

        /* renamed from: a */
        public final C35409a mo73689a(IMContact[] iMContactArr) {
            this.f91016b = iMContactArr;
            this.f91017c = null;
            return this;
        }
    }

    public final void cancel() {
        m80040a();
        super.cancel();
    }

    public final void dismiss() {
        m80040a();
        super.dismiss();
    }

    /* renamed from: a */
    private void m80040a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f90997c.getWindowToken(), 0);
        }
    }

    private C35405k(C35409a aVar) {
        super(aVar.f91015a, R.style.v0);
        this.f91008n = aVar.f91015a;
        this.f90999e = aVar.f91017c;
        this.f91000f = aVar.f91016b;
        this.f90998d = aVar.f91018d;
        this.f90995a = aVar.f91019e;
        this.f90996b = aVar.f91020f;
        this.f91009o = aVar.f91021g;
    }

    /* renamed from: a */
    private <T extends IMContact> void m80042a(T[] tArr) {
        this.f91003i.removeAllViews();
        if (tArr.length == 1) {
            this.f91004j.setText(R.string.bn9);
            this.f91006l.setText(R.string.bn5);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bh3, null);
            AvatarImageView avatarImageView = (AvatarImageView) inflate.findViewById(R.id.hy);
            inflate.findViewById(R.id.doe);
            TextView textView = (TextView) inflate.findViewById(R.id.dn1);
            T t = tArr[0];
            C23515d.m57669a((RemoteImageView) avatarImageView, t.getDisplayAvatar());
            textView.setText(t.getDisplayName());
            IMUser a = C34010e.m77749a((IMContact) t);
            if (a != null) {
                C47916gh.m103675a(getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), textView);
            } else {
                C47916gh.m103675a(getContext(), "", "", textView);
            }
            this.f91003i.addView(inflate);
            return;
        }
        this.f91004j.setText(R.string.bl0);
        int length = tArr.length;
        for (T t2 : tArr) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.bh2, null);
            ImageView imageView = (ImageView) inflate2.findViewById(R.id.doe);
            C23515d.m57669a((RemoteImageView) (AvatarImageView) inflate2.findViewById(R.id.hy), t2.getDisplayAvatar());
            m80041a(imageView, t2);
            this.f91003i.addView(inflate2);
        }
        Button button = this.f91006l;
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getResources().getText(R.string.bn5));
        sb.append("(");
        sb.append(length);
        sb.append(")");
        button.setText(sb.toString());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.f91007m = LayoutInflater.from(this.f91008n).inflate(R.layout.bck, null);
        setContentView(this.f91007m);
        setCancelable(false);
        this.f91004j = (TextView) findViewById(R.id.cli);
        this.f91003i = (ViewGroup) findViewById(R.id.dmz);
        this.f91001g = (RemoteImageView) findViewById(R.id.cn2);
        this.f91002h = (DmtTextView) findViewById(R.id.cnt);
        this.f90997c = (EditText) findViewById(R.id.a9g);
        this.f90997c.setText(this.f91009o);
        this.f90997c.setSelection(this.f90997c.getText().length());
        this.f91005k = (Button) findViewById(R.id.cmt);
        this.f91006l = (Button) findViewById(R.id.cmy);
        C35221bc.m79614a(this.f91005k);
        C35221bc.m79614a(this.f91006l);
        this.f91005k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C35405k.this.f90995a != null) {
                    C35405k.this.f90995a.onShare(C35405k.this.f90997c.getText().toString());
                }
                C35405k.this.dismiss();
            }
        });
        this.f91006l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C35405k.this.f90996b != null) {
                    if (TextUtils.equals("story_reply", C35405k.this.f90998d.f106895d) && TextUtils.isEmpty(C35405k.this.f90997c.getText())) {
                        C10691a.m21549c(C35405k.this.getContext(), (int) R.string.bod, 1).mo19066a();
                    } else if (C35405k.this.f90997c.getText().length() > C35197am.m79552a()) {
                        C9432q.m18676a(C11010c.m22280a(), C11010c.m22280a().getResources().getString(R.string.bkj));
                    } else {
                        C35405k.this.f90996b.onShare(C35405k.this.f90997c.getText().toString());
                        C35405k.this.dismiss();
                    }
                }
            }
        });
        if ((C35106c.m79333a(this.f90998d) && this.f90998d.f106900i.getInt("aweme_type") == 2) || TextUtils.equals("pic", this.f90998d.f106895d)) {
            Resources resources = getContext().getResources();
            float f = (((float) this.f90998d.f106900i.getInt("aweme_width")) * 1.0f) / ((float) this.f90998d.f106900i.getInt("aweme_height"));
            if (f <= 0.7516f) {
                this.f91010p = resources.getDimensionPixelSize(R.dimen.zz);
                this.f91011q = resources.getDimensionPixelSize(R.dimen.a00);
            } else if (f >= 1.65f) {
                this.f91010p = resources.getDimensionPixelSize(R.dimen.a00);
                this.f91011q = resources.getDimensionPixelSize(R.dimen.zy);
            } else {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.a00);
                this.f91011q = dimensionPixelSize;
                this.f91010p = dimensionPixelSize;
            }
            LayoutParams layoutParams = (LayoutParams) this.f91001g.getLayoutParams();
            layoutParams.width = this.f91010p;
            layoutParams.height = this.f91011q;
            this.f91001g.setLayoutParams(layoutParams);
        }
        if (TextUtils.equals("text", this.f90998d.f106895d) || TextUtils.equals("coupon", this.f90998d.f106895d)) {
            String string = this.f90998d.f106900i.getString("share_text");
            this.f91002h.setText(string);
            this.f91001g.setVisibility(8);
            this.f91002h.setVisibility(0);
            if (string != null && string.length() <= 1024) {
                C29408b.m69342a((TextView) this.f91002h);
            }
        } else {
            this.f91001g.setVisibility(0);
            this.f91002h.setVisibility(8);
            m80043a(this.f91001g, this.f90998d);
        }
        String str = this.f90998d.f106895d;
        String str2 = this.f90998d.f106897f;
        String string2 = this.f90998d.f106900i.getString(LeakCanaryFileProvider.f132049i);
        if (TextUtils.equals("good", str) || TextUtils.equals("good_window", str)) {
            TextView textView = (TextView) findViewById(R.id.cn5);
            if (TextUtils.equals("good", str) && !TextUtils.isEmpty(str2)) {
                findViewById(R.id.bgc).setVisibility(0);
                findViewById(R.id.cn6).setVisibility(8);
                textView.setText(str2);
                textView.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = this.f91001g.getLayoutParams();
                layoutParams2.width = C32464b.m75163a(C11010c.m22280a(), 165.0f);
                layoutParams2.height = C32464b.m75163a(C11010c.m22280a(), 165.0f);
                this.f91001g.setLayoutParams(layoutParams2);
                C13837e eVar = new C13837e();
                eVar.mo25932a(C9432q.m18687b(C11010c.m22280a(), 2.0f));
                ((C13833a) this.f91001g.getHierarchy()).mo25899a(eVar);
                ((C13833a) this.f91001g.getHierarchy()).mo25902b((int) R.drawable.dai);
            } else if (TextUtils.equals("good_window", str) && !TextUtils.isEmpty(string2)) {
                findViewById(R.id.bgc).setVisibility(0);
                textView.setText(string2);
                textView.setVisibility(0);
                textView.post(new C35410l(this, textView));
                ViewGroup.LayoutParams layoutParams3 = this.f91001g.getLayoutParams();
                layoutParams3.width = C32464b.m75163a(C11010c.m22280a(), 120.0f);
                layoutParams3.height = C32464b.m75163a(C11010c.m22280a(), 120.0f);
                this.f91001g.setLayoutParams(layoutParams3);
                C13837e eVar2 = new C13837e();
                eVar2.mo25937a(true);
                ((C13833a) this.f91001g.getHierarchy()).mo25899a(eVar2);
                ((C13833a) this.f91001g.getHierarchy()).mo25902b((int) R.drawable.daj);
            }
        }
        this.f90997c.setFilters(new InputFilter[]{new C33359af(C35197am.m79552a())});
        this.f90997c.setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return i == 66;
            }
        });
        if (this.f90999e != null && this.f90999e.length > 0) {
            m80042a(this.f90999e);
        }
        if (this.f91000f != null && this.f91000f.length > 0) {
            m80042a(this.f91000f);
        }
    }

    /* renamed from: a */
    private static <T extends IMContact> void m80041a(ImageView imageView, T t) {
        C35231bg.m79631a(imageView, C34010e.m77749a((IMContact) t));
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m80043a(com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView r8, com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x01e8
            if (r9 != 0) goto L_0x0007
            goto L_0x01e8
        L_0x0007:
            java.lang.String r1 = r9.f106895d
            if (r1 != 0) goto L_0x0017
            android.os.Bundle r9 = r9.f106900i
            java.lang.String r1 = "video_cover"
            java.lang.String r9 = r9.getString(r1)
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r8, r9)
            return r0
        L_0x0017:
            com.facebook.drawee.h.b r1 = r8.getHierarchy()
            com.facebook.drawee.f.a r1 = (com.facebook.drawee.p940f.C13833a) r1
            r2 = 2131953937(0x7f130911, float:1.954436E38)
            r1.mo25902b(r2)
            android.os.Bundle r1 = r9.f106900i
            java.lang.String r2 = "video_cover"
            java.io.Serializable r1 = r1.getSerializable(r2)
            android.os.Bundle r2 = r9.f106900i
            java.lang.String r3 = "thumb_url"
            java.lang.String r2 = r2.getString(r3)
            android.os.Bundle r3 = r9.f106900i
            java.lang.String r4 = "thumb_for_share"
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = r9.f106895d
            r5 = -1
            int r6 = r4.hashCode()
            r7 = 1
            switch(r6) {
                case -1890252483: goto L_0x00af;
                case -913038159: goto L_0x00a4;
                case 102340: goto L_0x009a;
                case 108124: goto L_0x008f;
                case 117588: goto L_0x0085;
                case 3165170: goto L_0x007b;
                case 3322092: goto L_0x0071;
                case 3599307: goto L_0x0067;
                case 104263205: goto L_0x005d;
                case 978111542: goto L_0x0053;
                case 1402633315: goto L_0x0048;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x00ba
        L_0x0048:
            java.lang.String r6 = "challenge"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 0
            goto L_0x00bb
        L_0x0053:
            java.lang.String r6 = "ranking"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 1
            goto L_0x00bb
        L_0x005d:
            java.lang.String r6 = "music"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 2
            goto L_0x00bb
        L_0x0067:
            java.lang.String r6 = "user"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 5
            goto L_0x00bb
        L_0x0071:
            java.lang.String r6 = "live"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 7
            goto L_0x00bb
        L_0x007b:
            java.lang.String r6 = "game"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 3
            goto L_0x00bb
        L_0x0085:
            java.lang.String r6 = "web"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 6
            goto L_0x00bb
        L_0x008f:
            java.lang.String r6 = "mix"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 9
            goto L_0x00bb
        L_0x009a:
            java.lang.String r6 = "gif"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 4
            goto L_0x00bb
        L_0x00a4:
            java.lang.String r6 = "story_video"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 8
            goto L_0x00bb
        L_0x00af:
            java.lang.String r6 = "sticker"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 10
            goto L_0x00bb
        L_0x00ba:
            r4 = -1
        L_0x00bb:
            switch(r4) {
                case 0: goto L_0x01db;
                case 1: goto L_0x01a7;
                case 2: goto L_0x018b;
                case 3: goto L_0x015d;
                case 4: goto L_0x0152;
                case 5: goto L_0x0131;
                case 6: goto L_0x011e;
                case 7: goto L_0x0104;
                case 8: goto L_0x00ef;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00c9;
                default: goto L_0x00be;
            }
        L_0x00be:
            boolean r9 = r1 instanceof com.p683ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x01e7
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi.m79638a(r8, r1)
            goto L_0x01e6
        L_0x00c9:
            boolean r9 = r1 instanceof com.p683ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r8, r1)
            goto L_0x01e6
        L_0x00d4:
            r9 = 2131954330(0x7f130a9a, float:1.9545156E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x00dc:
            boolean r9 = r1 instanceof com.p683ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r8, r1)
            goto L_0x01e6
        L_0x00e7:
            r9 = 2131954316(0x7f130a8c, float:1.9545128E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x00ef:
            r9 = 2131954331(0x7f130a9b, float:1.9545158E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            boolean r9 = r1 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a
            if (r9 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.im.sdk.chat.d.a.a r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a.convert(r1)
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r8, r9)
            goto L_0x01e6
        L_0x0104:
            boolean r9 = r1 instanceof com.p683ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r8, r1)
            goto L_0x01e6
        L_0x010f:
            if (r3 == 0) goto L_0x0116
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r8, r3)
            goto L_0x01e6
        L_0x0116:
            r9 = 2131954319(0x7f130a8f, float:1.9545134E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x011e:
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto L_0x0129
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r8, r2)
            goto L_0x01e6
        L_0x0129:
            r9 = 2131954334(0x7f130a9e, float:1.9545164E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x0131:
            com.facebook.drawee.h.b r9 = r8.getHierarchy()
            com.facebook.drawee.f.a r9 = (com.facebook.drawee.p940f.C13833a) r9
            com.facebook.drawee.f.e r9 = r9.f36079a
            if (r9 == 0) goto L_0x0147
            r9.mo25937a(r7)
            com.facebook.drawee.h.b r0 = r8.getHierarchy()
            com.facebook.drawee.f.a r0 = (com.facebook.drawee.p940f.C13833a) r0
            r0.mo25899a(r9)
        L_0x0147:
            boolean r9 = r1 instanceof com.p683ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi.m79638a(r8, r1)
            goto L_0x01e6
        L_0x0152:
            boolean r9 = r1 instanceof com.p683ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi.m79643a(r8, r1, r0)
            goto L_0x01e6
        L_0x015d:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0168
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r8, r2)
            goto L_0x01e6
        L_0x0168:
            android.os.Bundle r9 = r9.f106900i
            java.lang.String r0 = "is_game"
            java.lang.String r9 = r9.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x01e6
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0184
            r9 = 2131954321(0x7f130a91, float:1.9545138E38)
            goto L_0x0187
        L_0x0184:
            r9 = 2131954320(0x7f130a90, float:1.9545136E38)
        L_0x0187:
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x018b:
            boolean r0 = r1 instanceof com.p683ss.android.ugc.aweme.base.model.UrlModel
            if (r0 == 0) goto L_0x0195
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi.m79638a(r8, r1)
            goto L_0x01e6
        L_0x0195:
            android.os.Bundle r9 = r9.f106900i
            java.lang.String r0 = "cover_thumb"
            java.lang.String r9 = r9.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x01e6
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r8, r9)
            goto L_0x01e6
        L_0x01a7:
            android.os.Bundle r9 = r9.f106900i
            java.lang.String r0 = "aweme_type"
            int r9 = r9.getInt(r0)
            r0 = 1801(0x709, float:2.524E-42)
            if (r9 != r0) goto L_0x01ba
            r9 = 2131954328(0x7f130a98, float:1.9545152E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x01ba:
            r0 = 1802(0x70a, float:2.525E-42)
            if (r9 != r0) goto L_0x01c5
            r9 = 2131954327(0x7f130a97, float:1.954515E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x01c5:
            r0 = 1803(0x70b, float:2.527E-42)
            if (r9 != r0) goto L_0x01d0
            r9 = 2131954326(0x7f130a96, float:1.9545148E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x01d0:
            r0 = 2301(0x8fd, float:3.224E-42)
            if (r9 != r0) goto L_0x01e6
            r9 = 2131954325(0x7f130a95, float:1.9545146E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r8, r9)
            goto L_0x01e6
        L_0x01db:
            r9 = 2131954025(0x7f130969, float:1.9544538E38)
            r8.setImageResource(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.FIT_CENTER
            r8.setScaleType(r9)
        L_0x01e6:
            return r7
        L_0x01e7:
            return r0
        L_0x01e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35405k.m80043a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.sharer.ui.SharePackage):boolean");
    }
}
