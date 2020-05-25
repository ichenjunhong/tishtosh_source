package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PublishPermissionFragment */
public class PublishPermissionFragment extends Fragment {

    /* renamed from: a */
    int f113660a;

    /* renamed from: b */
    int f113661b;

    /* renamed from: c */
    int f113662c;

    /* renamed from: d */
    private int f113663d;
    @BindDrawable(2131296504)
    Drawable mImgNormal;
    @BindView(2131493771)
    ImageView mImgPermissionFriend;
    @BindView(2131493772)
    ImageView mImgPermissionOpen;
    @BindView(2131493773)
    ImageView mImgPermissionPrivate;
    @BindDrawable(2131296950)
    Drawable mImgSelected;
    @BindString(2132083617)
    String mTitle;
    @BindView(2131494356)
    TextView mTvPermissionOpen;
    @BindView(2131494357)
    TextView mTvPermissionOpenText;
    @BindView(2131493570)
    LinearLayout permissionFriendLayout;
    @BindView(2131493571)
    LinearLayout permissionOpenLayout;
    @BindView(2131493572)
    LinearLayout permissionPrivateLayout;

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo91089a() {
        Intent intent = new Intent();
        intent.putExtra("extra.PERMISSION", this.f113662c);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    /* renamed from: b */
    private void m98151b(int i) {
        this.f113662c = i;
        mo91090a(this.f113662c);
        mo91089a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f113662c = arguments.getInt("extra.PERMISSION");
        this.f113661b = arguments.getInt("extra.Private.DESCRIPTION");
        this.f113660a = arguments.getInt("extra.Friend.DESCRIPTION");
        this.f113663d = arguments.getInt("extra.TYPE");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo91090a(int i) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        ImageView imageView = this.mImgPermissionOpen;
        if (i == 0) {
            drawable = this.mImgSelected;
        } else {
            drawable = this.mImgNormal;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView2 = this.mImgPermissionFriend;
        if (i == 2) {
            drawable2 = this.mImgSelected;
        } else {
            drawable2 = this.mImgNormal;
        }
        imageView2.setImageDrawable(drawable2);
        ImageView imageView3 = this.mImgPermissionPrivate;
        if (i == 1) {
            drawable3 = this.mImgSelected;
        } else {
            drawable3 = this.mImgNormal;
        }
        imageView3.setImageDrawable(drawable3);
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131493571, 2131493570, 2131493572})
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.b8s) {
            m98151b(0);
        } else if (id == R.id.b8r) {
            boolean a = C39618d.f101151O.mo83117a(C40796a.PublishPermissionDialogFriend);
            if (a) {
                C39618d.f101151O.mo83116a(C40796a.PublishPermissionDialogFriend, false);
            }
            if (a) {
                m98149a(2, this.f113660a);
            } else {
                m98151b(2);
            }
        } else {
            if (id == R.id.b8t) {
                boolean a2 = C39618d.f101151O.mo83117a(C40796a.PublishPermissionDialogPrivate);
                if (a2) {
                    C39618d.f101151O.mo83116a(C40796a.PublishPermissionDialogPrivate, false);
                }
                if (a2) {
                    m98149a(1, this.f113661b);
                    return;
                }
                m98151b(1);
            }
        }
    }

    /* renamed from: a */
    private void m98149a(int i, int i2) {
        m98150a(i, getContext().getString(i2));
    }

    /* renamed from: a */
    private void m98150a(int i, String str) {
        C10643a aVar = new C10643a(getContext());
        aVar.mo18902b(str);
        aVar.mo18886a((int) R.string.apf, (OnClickListener) new C44974al(this, i));
        aVar.mo18897a().mo18882b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        this.permissionOpenLayout.setBackground(C10678c.m21505e(getContext()));
        this.permissionFriendLayout.setBackground(C10678c.m21505e(getContext()));
        this.permissionPrivateLayout.setBackground(C10678c.m21505e(getContext()));
        mo91090a(this.f113662c);
        C22055c e = C39618d.f101183x.mo74285e();
        if (e != null && e.mo46160d()) {
            TextView textView = this.mTvPermissionOpen;
            TextView textView2 = this.mTvPermissionOpenText;
            C52711k.m112240b(textView, "mTvPermissionOpen");
            C52711k.m112240b(textView2, "mTvPermissionOpenText");
            textView.setText(R.string.d0m);
            textView2.setText(R.string.d0n);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pi, viewGroup, false);
    }
}
