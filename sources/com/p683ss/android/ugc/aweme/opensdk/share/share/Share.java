package com.p683ss.android.ugc.aweme.opensdk.share.share;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.opensdk.share.base.DYBaseRequest;
import com.p683ss.android.ugc.aweme.opensdk.share.base.DYBaseResp;
import com.p683ss.android.ugc.aweme.opensdk.share.base.DYMediaContent;
import com.p683ss.android.ugc.aweme.opensdk.share.base.DYMediaContent.C38521a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.Share */
public final class Share {

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.Share$Request */
    public static class Request extends DYBaseRequest {
        public ArrayList<String> mHashTagList = new ArrayList<>();
        public DYMediaContent mMediaContent;
        public int mTargetSceneType;

        public int getType() {
            return 3;
        }

        public Request() {
        }

        public boolean checkArgs() {
            if (this.mMediaContent == null) {
                return false;
            }
            return this.mMediaContent.checkArgs();
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene", 0);
            this.mHashTagList = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
            this.mMediaContent = C38521a.m85855a(bundle);
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            DYMediaContent dYMediaContent = this.mMediaContent;
            Bundle bundle2 = new Bundle();
            if (dYMediaContent.mMediaObject != null) {
                bundle2.putString("_dyobject_identifier_", dYMediaContent.mMediaObject.getClass().getName());
                dYMediaContent.mMediaObject.serialize(bundle2);
            }
            bundle.putAll(bundle2);
            bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
            bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.mHashTagList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.Share$Response */
    public static class Response extends DYBaseResp {
        public String state;
        public int subErrorCode;

        public Response() {
        }

        public int getType() {
            return 4;
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.state = bundle.getString("_aweme_open_sdk_params_state");
            this.subErrorCode = bundle.getInt("_aweme_open_sdk_params_sub_error_code");
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_aweme_open_sdk_params_state", this.state);
            bundle.putInt("_aweme_open_sdk_params_sub_error_code", this.subErrorCode);
        }
    }
}
