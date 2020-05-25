package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a.C34795b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e */
public final class C34807e extends C34801c {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e$a */
    public class C34808a extends C34795b {

        /* renamed from: f */
        public AvatarImageView f89677f;

        /* renamed from: h */
        private TextView f89679h;

        /* renamed from: i */
        private TextView f89680i;

        /* renamed from: j */
        private TextView f89681j;

        /* renamed from: k */
        private TextView f89682k;

        /* renamed from: l */
        private ImageView f89683l;

        /* renamed from: m */
        private ImageView f89684m;

        /* renamed from: n */
        private ImageView f89685n;

        /* renamed from: o */
        private View f89686o;

        /* renamed from: p */
        private LinearLayout f89687p;

        /* renamed from: b */
        public final void mo70628b() {
            super.mo70628b();
            this.f89686o = this.itemView.findViewById(R.id.bas);
            this.f89687p = (LinearLayout) this.itemView.findViewById(R.id.d1b);
            this.f89680i = (TextView) this.itemView.findViewById(R.id.d1l);
            this.f89685n = (ImageView) this.itemView.findViewById(R.id.atf);
            this.f89682k = (TextView) this.itemView.findViewById(R.id.ath);
            this.f89647b = (ImageView) this.itemView.findViewById(R.id.sy);
            this.f89677f = (AvatarImageView) this.itemView.findViewById(R.id.i0);
            this.f89684m = (ImageView) this.itemView.findViewById(R.id.doe);
            this.f89679h = (TextView) this.itemView.findViewById(R.id.bpu);
            this.f89681j = (TextView) this.itemView.findViewById(R.id.a51);
            this.f89683l = (ImageView) this.itemView.findViewById(R.id.ai7);
        }

        public C34808a(View view) {
            super(view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x0289  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01fa  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x020e  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x021f  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0258  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70627a(com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact r8, int r9) {
            /*
                r7 = this;
                int r0 = r8.getType()
                r1 = -1
                if (r0 != r1) goto L_0x0008
                return
            L_0x0008:
                android.widget.ImageView r0 = r7.f89647b
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                boolean r1 = r1.f89635d
                r2 = 16
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0068
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                java.util.LinkedHashSet r1 = r1.f89637f
                boolean r1 = r1.contains(r8)
                if (r1 == 0) goto L_0x002a
                android.widget.ImageView r1 = r7.f89647b
                r1.setSelected(r3)
                goto L_0x002f
            L_0x002a:
                android.widget.ImageView r1 = r7.f89647b
                r1.setSelected(r4)
            L_0x002f:
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 <= r2) goto L_0x0051
                int r1 = r0.getMarginStart()
                int r2 = r7.f89648c
                if (r1 == r2) goto L_0x00a5
                int r1 = r7.f89648c
                r0.setMarginStart(r1)
                int r1 = r7.f89648c
                int r2 = r0.topMargin
                int r5 = r0.rightMargin
                int r6 = r0.bottomMargin
                r0.setMargins(r1, r2, r5, r6)
                android.widget.ImageView r1 = r7.f89647b
                r1.setLayoutParams(r0)
                goto L_0x00a5
            L_0x0051:
                int r1 = r0.leftMargin
                int r2 = r7.f89648c
                if (r1 == r2) goto L_0x00a5
                int r1 = r7.f89648c
                int r2 = r0.topMargin
                int r5 = r0.rightMargin
                int r6 = r0.bottomMargin
                r0.setMargins(r1, r2, r5, r6)
                android.widget.ImageView r1 = r7.f89647b
                r1.setLayoutParams(r0)
                goto L_0x00a5
            L_0x0068:
                android.widget.ImageView r1 = r7.f89647b
                r1.setSelected(r4)
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 <= r2) goto L_0x008f
                int r1 = r0.getMarginStart()
                int r2 = r7.f89649d
                if (r1 == r2) goto L_0x00a5
                int r1 = r7.f89649d
                r0.setMarginStart(r1)
                int r1 = r7.f89649d
                int r2 = r0.topMargin
                int r5 = r0.rightMargin
                int r6 = r0.bottomMargin
                r0.setMargins(r1, r2, r5, r6)
                android.widget.ImageView r1 = r7.f89647b
                r1.setLayoutParams(r0)
                goto L_0x00a5
            L_0x008f:
                int r1 = r0.leftMargin
                int r2 = r7.f89649d
                if (r1 == r2) goto L_0x00a5
                int r1 = r7.f89649d
                int r2 = r0.topMargin
                int r5 = r0.rightMargin
                int r6 = r0.bottomMargin
                r0.setMargins(r1, r2, r5, r6)
                android.widget.ImageView r1 = r7.f89647b
                r1.setLayoutParams(r0)
            L_0x00a5:
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.getDisplayAvatar()
                if (r0 == 0) goto L_0x00c2
                java.util.List r1 = r0.getUrlList()
                if (r1 == 0) goto L_0x00c2
                java.util.List r1 = r0.getUrlList()
                int r1 = r1.size()
                if (r1 != 0) goto L_0x00bc
                goto L_0x00c2
            L_0x00bc:
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r7.f89677f
                com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r1, r0)
                goto L_0x00ca
            L_0x00c2:
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f89677f
                r1 = 2131953301(0x7f130695, float:1.954307E38)
                com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r0, r1)
            L_0x00ca:
                android.widget.ImageView r0 = r7.f89685n
                r1 = 8
                r0.setVisibility(r1)
                int r0 = r8.getType()
                r2 = 2
                if (r0 == r3) goto L_0x01b9
                int r0 = r8.getType()
                if (r0 != r2) goto L_0x00e0
                goto L_0x01b9
            L_0x00e0:
                int r0 = r8.getType()
                r5 = 6
                r6 = 5
                if (r0 == r5) goto L_0x015a
                int r0 = r8.getType()
                if (r0 != r6) goto L_0x00ef
                goto L_0x015a
            L_0x00ef:
                int r0 = r8.getType()
                r5 = 3
                if (r0 == 0) goto L_0x00fc
                int r0 = r8.getType()
                if (r0 != r5) goto L_0x01e6
            L_0x00fc:
                int r0 = r8.getType()
                if (r0 != r5) goto L_0x0127
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                java.lang.String r0 = r0.f89636e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0127
                android.widget.LinearLayout r0 = r7.f89687p
                r0.setVisibility(r4)
                android.widget.TextView r0 = r7.f89680i
                r5 = 2132545454(0x7f1c0fae, float:2.0744098E38)
                r0.setText(r5)
                if (r9 != 0) goto L_0x0121
                android.view.View r0 = r7.f89686o
                r0.setVisibility(r1)
                goto L_0x0131
            L_0x0121:
                android.view.View r0 = r7.f89686o
                r0.setVisibility(r4)
                goto L_0x0131
            L_0x0127:
                android.widget.LinearLayout r0 = r7.f89687p
                r0.setVisibility(r1)
                android.view.View r0 = r7.f89686o
                r0.setVisibility(r1)
            L_0x0131:
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                int r0 = r0.f89632a
                if (r0 == r3) goto L_0x01e1
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                com.ss.android.ugc.aweme.im.sdk.relations.a.c$b r0 = r0.mo72934c(r9)
                java.lang.String r3 = r0.f89671d
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x0153
                android.widget.TextView r3 = r7.f89682k
                r3.setVisibility(r4)
                android.widget.TextView r3 = r7.f89682k
                java.lang.String r0 = r0.f89671d
                r3.setText(r0)
                goto L_0x01e6
            L_0x0153:
                android.widget.TextView r0 = r7.f89682k
                r0.setVisibility(r1)
                goto L_0x01e6
            L_0x015a:
                int r0 = r8.getType()
                if (r0 != r6) goto L_0x018a
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                java.lang.String r0 = r0.f89636e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x018a
                android.widget.LinearLayout r0 = r7.f89687p
                r0.setVisibility(r4)
                android.widget.TextView r0 = r7.f89680i
                r3 = 2132545455(0x7f1c0faf, float:2.07441E38)
                r0.setText(r3)
                android.widget.ImageView r0 = r7.f89685n
                r0.setVisibility(r4)
                if (r9 != 0) goto L_0x0184
                android.view.View r0 = r7.f89686o
                r0.setVisibility(r1)
                goto L_0x0194
            L_0x0184:
                android.view.View r0 = r7.f89686o
                r0.setVisibility(r4)
                goto L_0x0194
            L_0x018a:
                android.widget.LinearLayout r0 = r7.f89687p
                r0.setVisibility(r1)
                android.view.View r0 = r7.f89686o
                r0.setVisibility(r1)
            L_0x0194:
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                boolean r0 = r0.f89633b
                if (r0 == 0) goto L_0x01b3
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                com.ss.android.ugc.aweme.im.sdk.relations.a.c$b r0 = r0.mo72934c(r9)
                java.lang.String r0 = r0.f89671d
                boolean r3 = android.text.TextUtils.isEmpty(r0)
                if (r3 != 0) goto L_0x01b3
                android.widget.TextView r3 = r7.f89682k
                r3.setVisibility(r4)
                android.widget.TextView r3 = r7.f89682k
                r3.setText(r0)
                goto L_0x01e6
            L_0x01b3:
                android.widget.TextView r0 = r7.f89682k
                r0.setVisibility(r1)
                goto L_0x01e6
            L_0x01b9:
                int r0 = r8.getType()
                if (r0 != r2) goto L_0x01d7
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                java.lang.String r0 = r0.f89636e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x01d7
                android.widget.TextView r0 = r7.f89680i
                r3 = 2132545494(0x7f1c0fd6, float:2.074418E38)
                r0.setText(r3)
                android.widget.LinearLayout r0 = r7.f89687p
                r0.setVisibility(r4)
                goto L_0x01dc
            L_0x01d7:
                android.widget.LinearLayout r0 = r7.f89687p
                r0.setVisibility(r1)
            L_0x01dc:
                android.view.View r0 = r7.f89686o
                r0.setVisibility(r1)
            L_0x01e1:
                android.widget.TextView r0 = r7.f89682k
                r0.setVisibility(r1)
            L_0x01e6:
                if (r9 != 0) goto L_0x01f4
                android.widget.TextView r9 = r7.f89680i
                java.lang.String r0 = ""
                r9.setText(r0)
                android.widget.ImageView r9 = r7.f89685n
                r9.setVisibility(r1)
            L_0x01f4:
                com.ss.android.ugc.aweme.im.service.model.IMUser r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r8)
                if (r9 == 0) goto L_0x020e
                android.view.View r0 = r7.itemView
                android.content.Context r0 = r0.getContext()
                java.lang.String r3 = r9.getCustomVerify()
                java.lang.String r5 = r9.getEnterpriseVerifyReason()
                android.widget.TextView r6 = r7.f89679h
                com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r0, r3, r5, r6)
                goto L_0x021d
            L_0x020e:
                android.view.View r0 = r7.itemView
                android.content.Context r0 = r0.getContext()
                java.lang.String r3 = ""
                java.lang.String r5 = ""
                android.widget.TextView r6 = r7.f89679h
                com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r0, r3, r5, r6)
            L_0x021d:
                if (r9 == 0) goto L_0x0258
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f89677f
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a.m79422a(r0, r9)
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                android.widget.TextView r3 = r7.f89679h
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                java.lang.String r5 = r5.f89636e
                r0.mo72910a(r3, r9, r5)
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                android.widget.TextView r3 = r7.f89681j
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                java.lang.String r5 = r5.f89636e
                r0.mo72917b(r3, r9, r5)
                int r0 = r9.getFollowStatus()
                if (r0 != r2) goto L_0x0246
                android.widget.ImageView r0 = r7.f89683l
                r0.setVisibility(r4)
                goto L_0x024b
            L_0x0246:
                android.widget.ImageView r0 = r7.f89683l
                r0.setVisibility(r1)
            L_0x024b:
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
                java.lang.String r9 = r9.getUid()
                java.lang.String r0 = "contact"
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79509f(r9, r0)
                goto L_0x0283
            L_0x0258:
                android.widget.TextView r9 = r7.f89681j
                r9.setVisibility(r1)
                android.widget.ImageView r9 = r7.f89683l
                r9.setVisibility(r1)
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                java.lang.String r9 = r9.f89636e
                boolean r9 = android.text.TextUtils.isEmpty(r9)
                if (r9 == 0) goto L_0x0276
                android.widget.TextView r9 = r7.f89679h
                java.lang.String r0 = r8.getDisplayName()
                r9.setText(r0)
                goto L_0x0283
            L_0x0276:
                android.widget.TextView r9 = r7.f89679h
                java.lang.String r0 = r8.getDisplayName()
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                java.lang.String r1 = r1.f89636e
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.m78827a(r9, r0, r1, r4)
            L_0x0283:
                com.ss.android.ugc.aweme.im.sdk.relations.a.e r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.this
                com.ss.android.ugc.aweme.im.sdk.relations.a.a$a r9 = r9.f89642k
                if (r9 == 0) goto L_0x029d
                android.view.View r9 = r7.itemView
                com.ss.android.ugc.aweme.im.sdk.relations.a.e$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.relations.a.e$a$1
                r0.<init>()
                r9.setOnClickListener(r0)
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r9 = r7.f89677f
                com.ss.android.ugc.aweme.im.sdk.relations.a.e$a$2 r0 = new com.ss.android.ugc.aweme.im.sdk.relations.a.e$a$2
                r0.<init>()
                r9.setOnClickListener(r0)
            L_0x029d:
                android.view.View r9 = r7.itemView
                r0 = 50331648(0x3000000, float:3.761582E-37)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r9.setTag(r0, r1)
                android.view.View r9 = r7.itemView
                r1 = 83886080(0x5000000, float:6.018531E-36)
                r9.setTag(r1, r8)
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r9 = r7.f89677f
                r2 = 50331649(0x3000001, float:3.7615824E-37)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r9.setTag(r0, r2)
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r9 = r7.f89677f
                r9.setTag(r1, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e.C34808a.mo70627a(com.ss.android.ugc.aweme.im.service.model.IMContact, int):void");
        }
    }

    /* renamed from: a */
    public final void mo72909a(int i) {
        int c = i - mo72919c();
        if (c >= 0 && c < this.f89634c.size()) {
            IMContact iMContact = (IMContact) this.f89634c.get(c);
            for (int i2 = 0; i2 < this.f89634c.size(); i2++) {
                if (iMContact.equals(this.f89634c.get(i2))) {
                    notifyItemChanged(mo72919c() + i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final C34795b onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 1 && this.f89638g != null) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.bf5;
        } else {
            i2 = R.layout.bf6;
        }
        return new C34808a(from.inflate(i2, viewGroup, false));
    }
}
