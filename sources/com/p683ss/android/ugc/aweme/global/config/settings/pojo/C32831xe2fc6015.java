package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_FamiliarsRelationFetchConfig */
public final class C32831xe2fc6015 extends Message<C32831xe2fc6015, Builder> {
    public static final DefaultValueProtoAdapter<C32831xe2fc6015> ADAPTER = new C32832xf73143d();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 29687645)
    public final Long fetch_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 50971541)
    public final Long mutual_following_threshold;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_relations_model_RelationTypeParameters#ADAPTER", label = 2, tag = 194840578)
    public final List<C32841x4852abe7> relation_type_list;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_FamiliarsRelationFetchConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32831xe2fc6015, Builder> {
        public Long fetch_interval;
        public Long mutual_following_threshold;
        public List<C32841x4852abe7> relation_type_list = Internal.newMutableList();

        public final C32831xe2fc6015 build() {
            return new C32831xe2fc6015(this.fetch_interval, this.relation_type_list, this.mutual_following_threshold, super.buildUnknownFields());
        }

        public final Builder fetch_interval(Long l) {
            this.fetch_interval = l;
            return this;
        }

        public final Builder mutual_following_threshold(Long l) {
            this.mutual_following_threshold = l;
            return this;
        }

        public final Builder relation_type_list(List<C32841x4852abe7> list) {
            Internal.checkElementsNotNull(list);
            this.relation_type_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_FamiliarsRelationFetchConfig$ProtoAdapter_com_ss_android_ugc_aweme_im_sdk_abtest_FamiliarsRelationFetchConfig */
    static final class C32832xf73143d extends DefaultValueProtoAdapter<C32831xe2fc6015> {
        public final C32831xe2fc6015 redact(C32831xe2fc6015 com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig;
        }

        public C32832xf73143d() {
            super(FieldEncoding.LENGTH_DELIMITED, C32831xe2fc6015.class);
        }

        public final C32831xe2fc6015 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32831xe2fc6015) null);
        }

        public final int encodedSize(C32831xe2fc6015 com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig) {
            return ProtoAdapter.INT64.encodedSizeWithTag(29687645, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.fetch_interval) + C32841x4852abe7.ADAPTER.asRepeated().encodedSizeWithTag(194840578, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.relation_type_list) + ProtoAdapter.INT64.encodedSizeWithTag(50971541, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.mutual_following_threshold) + com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32831xe2fc6015 com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 29687645, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.fetch_interval);
            C32841x4852abe7.ADAPTER.asRepeated().encodeWithTag(protoWriter, 194840578, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.relation_type_list);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 50971541, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.mutual_following_threshold);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.unknownFields());
        }

        public final C32831xe2fc6015 decode(ProtoReader protoReader, C32831xe2fc6015 com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig) throws IOException {
            Builder builder;
            C32831xe2fc6015 com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig2 = (C32831xe2fc6015) C10617a.m21405a().mo18840a(C32831xe2fc6015.class, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig);
            if (com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig2 != null) {
                builder = com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<C32841x4852abe7> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.relation_type_list = newMutableList;
                    }
                    return builder.build();
                } else if (nextTag == 29687645) {
                    builder.fetch_interval((Long) ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 50971541) {
                    builder.mutual_following_threshold((Long) ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 194840578) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    newMutableList.add(C32841x4852abe7.ADAPTER.decode(protoReader, C10617a.m21405a().mo18839a(C32841x4852abe7.class)));
                }
            }
        }
    }

    public final List<C32841x4852abe7> getRelationTypeList() {
        return this.relation_type_list;
    }

    public final Long getFetchInterval() throws C10174a {
        if (this.fetch_interval != null) {
            return this.fetch_interval;
        }
        throw new C10174a();
    }

    public final Long getMutualFollowingThreshold() throws C10174a {
        if (this.mutual_following_threshold != null) {
            return this.mutual_following_threshold;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.fetch_interval = this.fetch_interval;
        builder.relation_type_list = Internal.copyOf("relation_type_list", this.relation_type_list);
        builder.mutual_following_threshold = this.mutual_following_threshold;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.fetch_interval != null) {
            i = this.fetch_interval.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 37) + this.relation_type_list.hashCode()) * 37;
        if (this.mutual_following_threshold != null) {
            i3 = this.mutual_following_threshold.hashCode();
        }
        int i4 = hashCode2 + i3;
        this.hashCode = i4;
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fetch_interval != null) {
            sb.append(", fetch_interval=");
            sb.append(this.fetch_interval);
        }
        if (!this.relation_type_list.isEmpty()) {
            sb.append(", relation_type_list=");
            sb.append(this.relation_type_list);
        }
        if (this.mutual_following_threshold != null) {
            sb.append(", mutual_following_threshold=");
            sb.append(this.mutual_following_threshold);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_im_sdk_abtest_FamiliarsRelationFetchConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32831xe2fc6015)) {
            return false;
        }
        C32831xe2fc6015 com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig = (C32831xe2fc6015) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.unknownFields()) || !Internal.equals(this.fetch_interval, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.fetch_interval) || !this.relation_type_list.equals(com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.relation_type_list) || !Internal.equals(this.mutual_following_threshold, com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig.mutual_following_threshold)) {
            return false;
        }
        return true;
    }

    public C32831xe2fc6015(Long l, List<C32841x4852abe7> list, Long l2) {
        this(l, list, l2, ByteString.EMPTY);
    }

    public C32831xe2fc6015(Long l, List<C32841x4852abe7> list, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fetch_interval = l;
        this.relation_type_list = Internal.immutableCopyOf("relation_type_list", list);
        this.mutual_following_threshold = l2;
    }
}
