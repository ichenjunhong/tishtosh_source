package com.p683ss.android.ugc.aweme.discover.model;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchCarouselExperiment;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateViewModel */
public class SearchStateViewModel extends C0209x {
    public C0198r<C23268b<String, Object>> hotSearchLiveData = new C0198r<>();
    public C0198r<Boolean> isVisibleToUser = new C0198r<>();
    public C0198r<Integer> searchState = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$HotSearchListObserver */
    public static class HotSearchListObserver implements C0199s<C23268b<String, Object>> {
        private IHotSearchListListener listener;

        public HotSearchListObserver setListener(IHotSearchListListener iHotSearchListListener) {
            this.listener = iHotSearchListListener;
            return this;
        }

        public void onChanged(C23268b<String, Object> bVar) {
            if (this.listener != null && bVar != null) {
                String str = (String) bVar.mo48213a("key_operated_search_list");
                String str2 = (String) bVar.mo48213a("key_operated_real_search_word");
                LogPbBean logPbBean = (LogPbBean) bVar.mo48213a("key_log_pb");
                if (C10181b.m20511a().mo18168a(SearchCarouselExperiment.class, true, "search_carousel", 31744, 0) != 1 || !TextUtils.isEmpty(str)) {
                    this.listener.onShowOperatedSearchWord(str, str2, logPbBean);
                } else {
                    this.listener.onHotSearchWordsFlipper((List) bVar.mo48213a("key_hot_search_list"), logPbBean, (List) bVar.mo48213a("ad_search_list"));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$IHotSearchListListener */
    public interface IHotSearchListListener {
        void onHotSearchWordsFlipper(List<HotSearchItem> list, LogPbBean logPbBean, List<AdDefaultSearchStruct> list2);

        void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$SearchObserver */
    public static class SearchObserver implements C0199s<Integer> {
        private boolean isFirstVisible = true;
        private SearchStateListener listener;

        public SearchObserver setListener(SearchStateListener searchStateListener) {
            this.listener = searchStateListener;
            return this;
        }

        public void onChanged(Integer num) {
            if (num != null) {
                if (num.intValue() == 5) {
                    this.listener.onPageHidden();
                } else if (num.intValue() == 6) {
                    this.listener.onPageResume();
                } else if (num.intValue() == 3) {
                    this.listener.onContentVisible(false);
                } else if (this.isFirstVisible) {
                    this.isFirstVisible = false;
                } else {
                    this.listener.onContentVisible(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$SearchStateListener */
    public interface SearchStateListener {
        void onContentVisible(boolean z);

        void onPageHidden();

        void onPageResume();
    }

    public static boolean isSearchIntermediate(int i) {
        return i == 3;
    }
}
