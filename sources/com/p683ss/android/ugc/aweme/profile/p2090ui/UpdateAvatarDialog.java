package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40394v.C40397b;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.util.C40534ah;
import com.p683ss.android.ugc.aweme.profile.util.C40549j;
import com.p683ss.android.ugc.aweme.profile.util.C40567r;
import com.p683ss.android.ugc.aweme.profile.util.C40569t;
import com.p683ss.android.ugc.aweme.utils.C47933n;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog */
public class UpdateAvatarDialog extends UpdateUserInfoDialog implements C39978l, C40397b {

    /* renamed from: l */
    private static final int[] f102580l = {R.drawable.ds1, R.drawable.ds2, R.drawable.ds3, R.drawable.ds4};

    /* renamed from: m */
    private static final int[] f102581m = {R.drawable.drw, R.drawable.drx, R.drawable.dry, R.drawable.drz};

    /* renamed from: n */
    private static final int[] f102582n = {R.drawable.ds5, R.drawable.ds6, R.drawable.ds7, R.drawable.ds8};

    /* renamed from: a */
    protected C39948a f102583a;

    /* renamed from: f */
    private C40394v f102584f;

    /* renamed from: g */
    private List<Integer> f102585g;

    /* renamed from: h */
    private boolean f102586h;

    /* renamed from: i */
    private boolean f102587i;
    ImageView ivDisclaimer;

    /* renamed from: j */
    private int f102588j;

    /* renamed from: k */
    private int f102589k;
    View mAvatarContainer;
    ImageView mAvatarDecoration;
    AvatarImageView mAvatarImageView;
    RecyclerView mDecorationRecyclerView;
    TextView mPolicyDes;
    ViewGroup mVpExpandContainer;
    TextView txtDisclaimer;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog$a */
    class C40195a extends C1331h {
        private C40195a() {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            int i;
            int i2;
            int f = RecyclerView.m4275f(view);
            if (f == 0) {
                i = 0;
            } else {
                i = (int) C9432q.m18687b(view.getContext(), 4.0f);
            }
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || f == layoutManager.mo5013A() - 1) {
                i2 = 0;
            } else {
                i2 = (int) C9432q.m18687b(view.getContext(), 4.0f);
            }
            rect.set(i, 0, i2, 0);
        }
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo82390d() {
        if (this.f102589k == 3) {
            return R.layout.kw;
        }
        return R.layout.ku;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82385a() {
        super.mo82385a();
        for (int valueOf : f102580l) {
            this.f102585g.add(Integer.valueOf(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42942b() {
        super.mo42942b();
        C40549j.m89966a(m89389e(), this.mPolicyDes, this.mVpExpandContainer, this.txtDisclaimer, this.ivDisclaimer, true);
        C23515d.m57669a((RemoteImageView) this.mAvatarImageView, C47933n.m103706a(this.f102597d));
        this.mAvatarContainer.setOnClickListener(new C40368eb(this));
        this.f102584f = new C40394v();
        this.f102584f.mo54798c(false);
        this.f102584f.f103088c = this;
        this.mDecorationRecyclerView.setNestedScrollingEnabled(false);
        this.mDecorationRecyclerView.setAdapter(this.f102584f);
        this.mDecorationRecyclerView.mo4798a((C1331h) new C40195a());
        C401941 r0 = new WrapLinearLayoutManager(getContext()) {
            /* renamed from: e */
            public final boolean mo4742e() {
                return false;
            }
        };
        r0.mo4731b(0);
        this.mDecorationRecyclerView.setLayoutManager(r0);
        this.f102584f.mo50303a(this.f102585g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo82389c() {
        String str;
        if (this.f102589k == 3) {
            if (this.mNickNameEditText == null || this.mNickNameEditText.getText() == null) {
                str = "";
            } else {
                str = this.mNickNameEditText.getText().toString();
            }
            if (m89388b(str)) {
                return;
            }
        }
        if (!this.f102586h) {
            C23515d.m57666a(C47933n.m103706a(this.f102597d), 0, 0, (C23522b<Bitmap>) new C40367ea<Bitmap>(this));
        } else if (!this.f102587i) {
            this.f102583a.mo81845a(C40567r.m89999a().getAbsolutePath(), null);
            return;
        } else {
            C0013i.m16a((Callable<TResult>) new C40364dy<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C40365dz<TResult,TContinuationResult>(this), C0013i.f25b);
        }
        C26890h.m65011a("profile_update_alert_finish", C23089d.m56640a().mo47829a("type", C40534ah.m89941a(this.f102589k)).f61491a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82387a(View view) {
        if (this.f102583a != null) {
            this.f102583a.mo81843a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo82384a(C0013i iVar) throws Exception {
        if (this.f102583a != null && iVar.mo26b() && !TextUtils.isEmpty((CharSequence) iVar.mo34e())) {
            this.f102583a.mo81845a((String) iVar.mo34e(), null);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo82388b(C0013i iVar) throws Exception {
        if (this.f102583a != null && iVar.mo26b() && !TextUtils.isEmpty((CharSequence) iVar.mo34e())) {
            this.f102583a.mo81845a((String) iVar.mo34e(), null);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo82386a(int i) {
        boolean z;
        this.f102587i = true;
        if (this.f102586h) {
            if (this.f102588j != i) {
                z = true;
            } else {
                z = false;
            }
            this.f102587i = z;
        }
        if (this.mAvatarDecoration != null) {
            if (this.f102587i) {
                C23729p.m58261a(true, this.mAvatarDecoration);
                this.mAvatarDecoration.setImageResource(f102581m[i]);
                this.f102588j = i;
                return;
            }
            C23729p.m58261a(false, this.mAvatarDecoration);
            this.f102588j = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo82383a(Bitmap bitmap) {
        int i;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, createBitmap.getConfig());
        Resources resources = getContext().getResources();
        int[] iArr = f102582n;
        if (this.f102588j < 0) {
            i = 0;
        } else {
            i = this.f102588j;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, iArr[i]);
        if (decodeResource.getWidth() <= 0 || decodeResource.getHeight() <= 0) {
            return "";
        }
        float width2 = ((float) width) / ((float) decodeResource.getWidth());
        float height2 = ((float) height) / ((float) decodeResource.getHeight());
        Matrix matrix = new Matrix();
        matrix.postScale(width2, height2);
        Bitmap createBitmap3 = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, null);
        canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, null);
        File a = C40567r.m89999a();
        boolean saveBitmapToSD = BitmapUtils.saveBitmapToSD(createBitmap2, a.getParent(), a.getName());
        if (createBitmap != null) {
            createBitmap.recycle();
        }
        if (createBitmap2 != null) {
            createBitmap2.recycle();
        }
        if (decodeResource != null) {
            decodeResource.recycle();
        }
        if (createBitmap3 != null) {
            createBitmap3.recycle();
        }
        if (saveBitmapToSD) {
            return a.getAbsolutePath();
        }
        return "";
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        if (this.f102583a != null) {
            this.f102583a.mo81848e();
        }
        if (avatarUri == null) {
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.cq).mo19066a();
            return;
        }
        if (!(this.f102595b == null || this.f102596c == null)) {
            this.f102595b.f101359d = avatarUri.uri;
            if (this.f102589k == 3) {
                String obj = this.mNickNameEditText.getText().toString();
                if (!C40569t.m90003a(obj)) {
                    C10691a.m21548c(C11010c.m22280a(), (int) R.string.cgq).mo19066a();
                    return;
                } else if (!TextUtils.equals(obj, C20902b.m53242a().getCurUser().getNickname())) {
                    this.f102595b.f101356a = obj;
                }
            }
            Map a = this.f102595b.mo80822a();
            a.put("target_user", "1");
            this.f102596c.mo81853a(a);
        }
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        this.f102586h = true;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        C13771c.m27875c().mo26191b(parse);
        C23515d.m57677a((RemoteImageView) this.mAvatarImageView, parse.toString());
        if (this.mAvatarDecoration != null) {
            this.mAvatarDecoration.setVisibility(8);
        }
        if (this.f102584f != null) {
            this.f102584f.f103086a = true;
            this.f102584f.f103089d.clear();
            this.f102584f.mo82627b(-1);
        }
    }
}
