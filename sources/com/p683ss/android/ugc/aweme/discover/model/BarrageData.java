package com.p683ss.android.ugc.aweme.discover.model;

import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.BarrageData */
public final class BarrageData {
    public static final BarrageData INSTANCE = new BarrageData();
    private static Map<String, List<Comment>> commentMap = new LinkedHashMap();
    private static Map<String, CommentItemList> map = new LinkedHashMap();
    private static Set<String> show = new LinkedHashSet();

    private BarrageData() {
    }

    public final Map<String, List<Comment>> getCommentMap() {
        return commentMap;
    }

    public final Map<String, CommentItemList> getMap() {
        return map;
    }

    public final Set<String> getShow() {
        return show;
    }

    public final void setCommentMap(Map<String, List<Comment>> map2) {
        C52711k.m112240b(map2, "<set-?>");
        commentMap = map2;
    }

    public final void setMap(Map<String, CommentItemList> map2) {
        C52711k.m112240b(map2, "<set-?>");
        map = map2;
    }

    public final void setShow(Set<String> set) {
        C52711k.m112240b(set, "<set-?>");
        show = set;
    }
}
