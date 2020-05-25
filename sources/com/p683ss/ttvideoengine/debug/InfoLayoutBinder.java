package com.p683ss.ttvideoengine.debug;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.debug.InfoLayoutBinder */
public class InfoLayoutBinder {
    private TextView mCheckButton;
    public HashMap<String, String> mCheckInfoMap;
    public ScrollView mCheckScrollView;
    private TableLayout mCheckTableLayout;
    private TextView mCodecButton;
    public HashMap<String, String> mCodecInfoMap;
    public ScrollView mCodecScrollView;
    private TableLayout mCodecTableLayout;
    public Context mContext;
    private TextView mCopyButton;
    public Boolean mLogStart;
    private TextView mMediaButton;
    public HashMap<String, String> mMediaInfoMap;
    public ScrollView mMediaScrollView;
    private TableLayout mMediaTableLayout;
    private TextView mOtherButton;
    public HashMap<String, String> mOtherInfoMap;
    public ScrollView mOtherScrollView;
    private TableLayout mOtherTableLayout;
    public TextView mSaveButton;
    private ViewGroup mTableView;

    /* renamed from: com.ss.ttvideoengine.debug.InfoLayoutBinder$ViewHolder */
    static class ViewHolder {
        public TextView mNameTextView;
        public TextView mValueTextView;

        private ViewHolder() {
        }

        public void setName(String str) {
            if (this.mNameTextView != null) {
                this.mNameTextView.setText(str);
            }
        }

        public void setValue(String str) {
            if (this.mValueTextView != null) {
                if (str == null || str.length() <= 40) {
                    this.mValueTextView.setText(str);
                } else {
                    TextView textView = this.mValueTextView;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.substring(0, 30));
                    sb.append("......");
                    textView.setText(sb.toString());
                }
            }
        }
    }

    public ViewGroup buildLayout() {
        return this.mTableView;
    }

    private void initCopyButton() {
        this.mCopyButton = (TextView) this.mTableView.findViewById(R.id.e3s);
        this.mCopyButton.setOnClickListener(new OnClickListener() {

            /* renamed from: com.ss.ttvideoengine.debug.InfoLayoutBinder$5$_lancet */
            class _lancet {
                private _lancet() {
                }

                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (VERSION.SDK_INT == 25) {
                        C47905fy.m103630a(toast);
                    }
                    toast.show();
                }
            }

            public void onClick(View view) {
                if (InfoLayoutBinder.this.mMediaScrollView.getVisibility() == 0) {
                    ((ClipboardManager) InfoLayoutBinder.this.mContext.getSystemService("clipboard")).setText(new JSONObject(InfoLayoutBinder.this.mMediaInfoMap).toString());
                } else if (InfoLayoutBinder.this.mCodecScrollView.getVisibility() == 0) {
                    ((ClipboardManager) InfoLayoutBinder.this.mContext.getSystemService("clipboard")).setText(new JSONObject(InfoLayoutBinder.this.mCodecInfoMap).toString());
                } else if (InfoLayoutBinder.this.mOtherScrollView.getVisibility() == 0) {
                    ((ClipboardManager) InfoLayoutBinder.this.mContext.getSystemService("clipboard")).setText(new JSONObject(InfoLayoutBinder.this.mOtherInfoMap).toString());
                } else if (InfoLayoutBinder.this.mCheckScrollView.getVisibility() == 0) {
                    ((ClipboardManager) InfoLayoutBinder.this.mContext.getSystemService("clipboard")).setText(new JSONObject(InfoLayoutBinder.this.mCheckInfoMap).toString());
                }
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(InfoLayoutBinder.this.mContext, "当前界面内容已复制到剪切板", 0));
            }
        });
    }

    private void initSaveButton() {
        this.mSaveButton = (TextView) this.mTableView.findViewById(R.id.ets);
        this.mSaveButton.setOnClickListener(new OnClickListener() {

            /* renamed from: com.ss.ttvideoengine.debug.InfoLayoutBinder$6$_lancet */
            class _lancet {
                private _lancet() {
                }

                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (VERSION.SDK_INT == 25) {
                        C47905fy.m103630a(toast);
                    }
                    toast.show();
                }
            }

            public void onClick(View view) {
                if (InfoLayoutBinder.this.mLogStart.booleanValue()) {
                    LogCatHelper.getInstance(InfoLayoutBinder.this.mContext).start();
                    _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(InfoLayoutBinder.this.mContext, "开始记录日志", 1));
                    InfoLayoutBinder.this.mLogStart = Boolean.valueOf(false);
                    InfoLayoutBinder.this.mSaveButton.setText(R.string.hky);
                    return;
                }
                LogCatHelper.getInstance(InfoLayoutBinder.this.mContext).stop();
                Context context = InfoLayoutBinder.this.mContext;
                StringBuilder sb = new StringBuilder("日志内容已存储在");
                sb.append(LogCatHelper.getInstance(InfoLayoutBinder.this.mContext).getFileName());
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context, sb.toString(), 1));
                InfoLayoutBinder.this.mLogStart = Boolean.valueOf(true);
                InfoLayoutBinder.this.mSaveButton.setText(R.string.h8m);
            }
        });
    }

    private void initCheckInfoView() {
        this.mCheckTableLayout = (TableLayout) this.mTableView.findViewById(R.id.f0d);
        this.mCheckScrollView = (ScrollView) this.mTableView.findViewById(R.id.eyu);
        this.mCheckButton = (TextView) this.mTableView.findViewById(R.id.e07);
        this.mCheckScrollView.setVisibility(8);
        this.mCheckInfoMap = new HashMap<>();
        this.mCheckButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                InfoLayoutBinder.this.mMediaScrollView.setVisibility(8);
                InfoLayoutBinder.this.mCodecScrollView.setVisibility(8);
                InfoLayoutBinder.this.mOtherScrollView.setVisibility(8);
                InfoLayoutBinder.this.mCheckScrollView.setVisibility(0);
            }
        });
    }

    private void initCodecInfoView() {
        this.mCodecTableLayout = (TableLayout) this.mTableView.findViewById(R.id.f0e);
        this.mCodecScrollView = (ScrollView) this.mTableView.findViewById(R.id.eyv);
        this.mCodecButton = (TextView) this.mTableView.findViewById(R.id.e08);
        this.mCodecScrollView.setVisibility(8);
        this.mCodecInfoMap = new HashMap<>();
        this.mCodecButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                InfoLayoutBinder.this.mMediaScrollView.setVisibility(8);
                InfoLayoutBinder.this.mCodecScrollView.setVisibility(0);
                InfoLayoutBinder.this.mOtherScrollView.setVisibility(8);
                InfoLayoutBinder.this.mCheckScrollView.setVisibility(8);
            }
        });
    }

    private void initMediaInfoView() {
        this.mMediaTableLayout = (TableLayout) this.mTableView.findViewById(R.id.f0g);
        this.mMediaScrollView = (ScrollView) this.mTableView.findViewById(R.id.eyw);
        this.mMediaButton = (TextView) this.mTableView.findViewById(R.id.e0_);
        this.mMediaInfoMap = new HashMap<>();
        this.mMediaButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                InfoLayoutBinder.this.mMediaScrollView.setVisibility(0);
                InfoLayoutBinder.this.mCodecScrollView.setVisibility(8);
                InfoLayoutBinder.this.mOtherScrollView.setVisibility(8);
                InfoLayoutBinder.this.mCheckScrollView.setVisibility(8);
            }
        });
    }

    private void initOtherInfoView() {
        this.mOtherTableLayout = (TableLayout) this.mTableView.findViewById(R.id.f0h);
        this.mOtherScrollView = (ScrollView) this.mTableView.findViewById(R.id.eyx);
        this.mOtherButton = (TextView) this.mTableView.findViewById(R.id.e0a);
        this.mOtherScrollView.setVisibility(8);
        this.mOtherInfoMap = new HashMap<>();
        this.mOtherButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                InfoLayoutBinder.this.mMediaScrollView.setVisibility(8);
                InfoLayoutBinder.this.mCodecScrollView.setVisibility(8);
                InfoLayoutBinder.this.mCheckScrollView.setVisibility(8);
                InfoLayoutBinder.this.mOtherScrollView.setVisibility(0);
            }
        });
    }

    public InfoLayoutBinder(Context context) {
        this(context, R.layout.byi);
    }

    public ViewHolder obtainViewHolder(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            return viewHolder;
        }
        ViewHolder viewHolder2 = new ViewHolder();
        viewHolder2.mNameTextView = (TextView) view.findViewById(R.id.bpp);
        viewHolder2.mValueTextView = (TextView) view.findViewById(R.id.do9);
        view.setTag(viewHolder2);
        return viewHolder2;
    }

    public void setValueText(View view, String str) {
        obtainViewHolder(view).setValue(str);
    }

    public InfoLayoutBinder(Context context, int i) {
        this.mLogStart = Boolean.valueOf(true);
        this.mContext = context;
        this.mTableView = (ViewGroup) LayoutInflater.from(this.mContext).inflate(i, null);
        initMediaInfoView();
        initCodecInfoView();
        initOtherInfoView();
        initCheckInfoView();
        initCopyButton();
        initSaveButton();
    }

    public View appendRow(int i, String str, String str2) {
        return appendRow(i, R.layout.byj, str, str2);
    }

    public View appendRow(int i, int i2, String str) {
        return appendRow(i, this.mContext.getString(i2), str);
    }

    public void setNameValueText(View view, String str, String str2) {
        ViewHolder obtainViewHolder = obtainViewHolder(view);
        obtainViewHolder.setName(str);
        obtainViewHolder.setValue(str2);
    }

    public void updateText(int i, View view, int i2, String str) {
        String string = this.mContext.getString(i2);
        if (i == 0 && this.mMediaInfoMap != null) {
            this.mMediaInfoMap.put(string, str);
        } else if (i == 1 && this.mCodecInfoMap != null) {
            this.mCodecInfoMap.put(string, str);
        } else if (i == 2 && this.mOtherInfoMap != null) {
            this.mOtherInfoMap.put(string, str);
        }
        setValueText(view, str);
    }

    public View appendRow(int i, int i2, String str, String str2) {
        if (i == 0) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(i2, this.mMediaTableLayout, false);
            setNameValueText(viewGroup, str, str2);
            this.mMediaTableLayout.addView(viewGroup);
            if (this.mMediaInfoMap == null) {
                return viewGroup;
            }
            this.mMediaInfoMap.put(str, str2);
            return viewGroup;
        } else if (i == 1) {
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.mContext).inflate(i2, this.mCodecTableLayout, false);
            setNameValueText(viewGroup2, str, str2);
            this.mCodecTableLayout.addView(viewGroup2);
            if (this.mCodecInfoMap == null) {
                return viewGroup2;
            }
            this.mCodecInfoMap.put(str, str2);
            return viewGroup2;
        } else if (i == 2) {
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(this.mContext).inflate(i2, this.mOtherTableLayout, false);
            setNameValueText(viewGroup3, str, str2);
            this.mOtherTableLayout.addView(viewGroup3);
            if (this.mOtherInfoMap == null) {
                return viewGroup3;
            }
            this.mOtherInfoMap.put(str, str2);
            return viewGroup3;
        } else if (i != 3) {
            return null;
        } else {
            ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(this.mContext).inflate(i2, this.mCheckTableLayout, false);
            setNameValueText(viewGroup4, str, str2);
            this.mCheckTableLayout.addView(viewGroup4);
            if (this.mCheckInfoMap == null) {
                return viewGroup4;
            }
            this.mCheckInfoMap.put(str, str2);
            return viewGroup4;
        }
    }
}
