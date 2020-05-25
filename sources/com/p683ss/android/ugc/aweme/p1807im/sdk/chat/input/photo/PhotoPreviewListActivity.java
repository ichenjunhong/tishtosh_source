package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33631o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity */
public class PhotoPreviewListActivity extends AmeActivity {

    /* renamed from: a */
    String f87192a;

    /* renamed from: b */
    public ArrayList<C33655i> f87193b;

    /* renamed from: c */
    public View f87194c;

    /* renamed from: d */
    public View f87195d;

    /* renamed from: e */
    public TextView f87196e;

    /* renamed from: f */
    public TextView f87197f;

    /* renamed from: g */
    public ImageView f87198g;

    /* renamed from: h */
    public View f87199h;

    /* renamed from: i */
    public C33672w f87200i;

    /* renamed from: j */
    public C33654h f87201j;

    /* renamed from: k */
    private int f87202k;

    /* renamed from: l */
    private ViewPager f87203l;

    /* renamed from: m */
    private C33631o f87204m;

    /* renamed from: n */
    private C35225a f87205n;

    /* renamed from: o */
    private C33661l f87206o;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session_id", this.f87192a);
        bundle.putInt("photo_start_index", this.f87202k);
        bundle.putSerializable("photo_param_list", this.f87193b);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.rf);
        C34004b.m77718b().setupStatusBar(this);
        if (bundle != null) {
            this.f87193b = (ArrayList) bundle.getSerializable("photo_param_list");
            this.f87192a = bundle.getString("session_id");
            this.f87202k = bundle.getInt("photo_start_index");
        } else {
            this.f87193b = (ArrayList) getIntent().getSerializableExtra("photo_param_list");
            this.f87192a = getIntent().getStringExtra("session_id");
            this.f87202k = getIntent().getIntExtra("photo_start_index", 0);
        }
        this.f87200i = C33672w.m77098a();
        if (C9376b.m18558a((Collection<T>) this.f87193b)) {
            this.f87193b = C33655i.fromPhotoItems(this.f87200i.f87302c);
        }
        this.f87203l = (ViewPager) findViewById(R.id.dss);
        this.f87194c = findViewById(R.id.clg);
        this.f87194c.setSelected(this.f87200i.f87301b);
        this.f87196e = (TextView) findViewById(R.id.cl4);
        this.f87196e.setText(this.f87200i.mo71153d());
        this.f87195d = findViewById(R.id.it);
        this.f87197f = (TextView) findViewById(R.id.ckl);
        this.f87198g = (ImageView) findViewById(R.id.ckk);
        this.f87199h = findViewById(R.id.ckm);
        if (C9376b.m18558a((Collection<T>) this.f87193b)) {
            finish();
        } else {
            if (this.f87202k < 0 || this.f87193b == null || this.f87202k >= this.f87193b.size()) {
                this.f87202k = 0;
            }
            this.f87200i.mo71146a(this.f87197f, this.f87198g, null, ((C33655i) this.f87193b.get(this.f87202k)).getPath());
            this.f87206o = new C33661l(getSupportFragmentManager(), this.f87193b);
            this.f87201j = this.f87200i.mo71149b(((C33655i) this.f87193b.get(this.f87202k)).getPath());
            this.f87203l.setAdapter(this.f87206o);
            this.f87203l.setCurrentItem(this.f87202k);
            if (this.f87204m == null) {
                this.f87204m = new C33631o() {
                    public final void onClick(View view) {
                        if (view.equals(PhotoPreviewListActivity.this.f87196e)) {
                            new C33220b(PhotoPreviewListActivity.this, new C33242d() {
                                public final void sendMsg() {
                                    PhotoPreviewListActivity photoPreviewListActivity = PhotoPreviewListActivity.this;
                                    ArrayList arrayList = new ArrayList();
                                    if (C23715d.m58202a((Collection<T>) photoPreviewListActivity.f87200i.mo71150b())) {
                                        arrayList.add(photoPreviewListActivity.f87201j);
                                    } else {
                                        arrayList.addAll(photoPreviewListActivity.f87200i.mo71150b());
                                    }
                                    C33440v.m76638a().mo70848a(photoPreviewListActivity.f87192a, (List<C33655i>) C33655i.fromPhotoItems(arrayList));
                                    photoPreviewListActivity.f87200i.mo71154e();
                                    Intent intent = new Intent();
                                    intent.putExtra("send_photo", true);
                                    photoPreviewListActivity.setResult(49, intent);
                                    photoPreviewListActivity.finish();
                                }
                            }).sendMsg();
                        } else if (view.equals(PhotoPreviewListActivity.this.f87194c)) {
                            PhotoPreviewListActivity.this.f87194c.setSelected(!PhotoPreviewListActivity.this.f87194c.isSelected());
                            PhotoPreviewListActivity.this.f87200i.f87301b = PhotoPreviewListActivity.this.f87194c.isSelected();
                        } else if (view.equals(PhotoPreviewListActivity.this.f87195d)) {
                            PhotoPreviewListActivity.this.finish();
                        } else {
                            if (view.equals(PhotoPreviewListActivity.this.f87198g)) {
                                if (view.isSelected()) {
                                    PhotoPreviewListActivity.this.f87200i.mo71151b(PhotoPreviewListActivity.this.f87201j);
                                } else if (PhotoPreviewListActivity.this.f87200i.mo71152c() >= C33672w.f87298a) {
                                    C9432q.m18672a(C11010c.m22280a(), (int) R.string.bn8);
                                    return;
                                } else {
                                    PhotoPreviewListActivity.this.f87200i.mo71147a(PhotoPreviewListActivity.this.f87201j);
                                }
                                view.setSelected(!view.isSelected());
                                PhotoPreviewListActivity.this.f87200i.mo71145a(null, PhotoPreviewListActivity.this.f87199h, PhotoPreviewListActivity.this.f87197f, PhotoPreviewListActivity.this.f87198g, null, PhotoPreviewListActivity.this.f87201j.f87272a.f50916b);
                                PhotoPreviewListActivity.this.f87196e.setText(PhotoPreviewListActivity.this.f87200i.mo71153d());
                            }
                        }
                    }
                };
            }
            if (this.f87205n == null) {
                this.f87205n = C35225a.m79617l();
            }
            this.f87205n.mo73331a(this.f87195d, this.f87194c, this.f87196e, this.f87194c, this.f87198g);
            C33631o.m77054a((OnClickListener) this.f87204m, this.f87196e, this.f87194c, this.f87195d, this.f87198g);
            this.f87203l.addOnPageChangeListener(new C0997e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    PhotoPreviewListActivity.this.f87201j = PhotoPreviewListActivity.this.f87200i.mo71149b(((C33655i) PhotoPreviewListActivity.this.f87193b.get(i)).getPath());
                    if (PhotoPreviewListActivity.this.f87201j != null && PhotoPreviewListActivity.this.f87201j.f87272a != null) {
                        PhotoPreviewListActivity.this.f87198g.setSelected(PhotoPreviewListActivity.this.f87200i.mo71148a(PhotoPreviewListActivity.this.f87201j.f87272a.f50916b));
                        PhotoPreviewListActivity.this.f87200i.mo71146a(PhotoPreviewListActivity.this.f87197f, PhotoPreviewListActivity.this.f87198g, null, PhotoPreviewListActivity.this.f87201j.f87272a.f50916b);
                    }
                }
            });
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onCreate", false);
    }
}
