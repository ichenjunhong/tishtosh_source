package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a.C34795b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c */
public class C34801c extends C34791a implements SectionIndexer {

    /* renamed from: m */
    public SectionIndexer f89665m;

    /* renamed from: n */
    public C34803b f89666n = new C34803b();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c$a */
    public class C34802a extends C34795b {
        public C34802a(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c$b */
    public static final class C34803b {

        /* renamed from: a */
        public int f89668a = -1;

        /* renamed from: b */
        public boolean f89669b;

        /* renamed from: c */
        public boolean f89670c;

        /* renamed from: d */
        public String f89671d;
    }

    public int getItemCount() {
        if (this.f89634c != null) {
            return this.f89634c.size() + mo72919c();
        }
        return mo72919c();
    }

    public Object[] getSections() {
        if (this.f89665m != null) {
            return this.f89665m.getSections();
        }
        return new String[]{" "};
    }

    public int getPositionForSection(int i) {
        if (this.f89665m != null) {
            return this.f89665m.getPositionForSection(i);
        }
        return -1;
    }

    public int getSectionForPosition(int i) {
        if (this.f89665m != null) {
            return this.f89665m.getSectionForPosition(i);
        }
        return -1;
    }

    public int getItemViewType(int i) {
        if (mo72918b(i)) {
            return 1;
        }
        return super.getItemViewType(i - mo72919c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo72908a(IMContact iMContact) {
        IMUser a = C34010e.m77749a(iMContact);
        if (a == null) {
            return null;
        }
        if (TextUtils.isEmpty(a.getRemarkName()) || TextUtils.isEmpty(a.getNickName())) {
            return a.getSignature();
        }
        return C11010c.m22280a().getString(R.string.blf, new Object[]{a.getNickName()});
    }

    /* renamed from: c */
    public final C34803b mo72934c(int i) {
        if (this.f89666n.f89668a == i) {
            return this.f89666n;
        }
        this.f89666n.f89668a = i;
        int sectionForPosition = getSectionForPosition(i);
        boolean z = false;
        if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i) {
            this.f89666n.f89669b = false;
            this.f89666n.f89671d = null;
        } else {
            this.f89666n.f89669b = true;
            this.f89666n.f89671d = (String) getSections()[sectionForPosition];
        }
        C34803b bVar = this.f89666n;
        if (getPositionForSection(sectionForPosition + 1) - 1 == i) {
            z = true;
        }
        bVar.f89670c = z;
        return this.f89666n;
    }

    /* renamed from: a */
    public C34795b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C34802a(this.f89638g);
    }

    /* renamed from: a */
    public final void onBindViewHolder(C34795b bVar, int i) {
        if (!mo72918b(i)) {
            int c = i - mo72919c();
            bVar.mo70627a((IMContact) this.f89634c.get(c), c);
        }
    }
}
