package com.bytedance.p702im.core.proto;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.RequestBody */
public final class RequestBody extends Message<RequestBody, Builder> {
    public static final ProtoAdapter<RequestBody> ADAPTER = new ProtoAdapter_RequestBody();
    private static final long serialVersionUID = 0;
    public final BatchMarkConversationReadRequestBody batch_mark_read_body;
    public final CheckMessagePerUserRequestBody check_messages_per_user_body;
    public final ClientACKRequestBody client_ack_body;
    public final ConversationAddParticipantsRequestBody conversation_add_participants_body;
    public final ConversationParticipantsListRequestBody conversation_participants_body;
    public final ConversationRemoveParticipantsRequestBody conversation_remove_participants_body;
    public final ConversationSetRoleRequestBody conversation_set_role_body;
    public final ConversationsListRequestBody conversations_list_body;
    public final CreateConversationRequestBody create_conversation_body;
    public final CreateConversationV2RequestBody create_conversation_v2_body;
    public final DeleteConversationRequestBody delete_conversation_body;
    public final DeleteConversationCoreExtInfoRequestBody delete_conversation_core_ext_info_body;
    public final DeleteConversationSettingExtInfoRequestBody delete_conversation_setting_ext_info_body;
    public final DeleteMessageRequestBody delete_message_body;
    public final DeleteStrangerAllConversationRequestBody delete_stranger_all_conversation_body;
    public final DeleteStrangerConversationRequestBody delete_stranger_conversation_body;
    public final DeleteStrangerMessageRequestBody delete_stranger_message_body;
    public final DissolveConversationRequestBody dissolve_conversation_body;
    public final GetConfigsRequestBody get_configs_body;
    public final GetConversationCoreInfoRequestBody get_conversation_core_info_body;
    public final GetConversationCoreInfoListRequestBody get_conversation_core_info_list_body;
    public final GetConversationInfoRequestBody get_conversation_info_body;
    public final GetConversationInfoListRequestBody get_conversation_info_list_body;
    public final ConversationsPerUserByFavoriteV2RequestBody get_conversation_info_list_by_favorite_v2_body;
    public final ConversationsPerUserByTopV2RequestBody get_conversation_info_list_by_top_v2_body;
    public final GetConversationInfoListV2RequestBody get_conversation_info_list_v2_body;
    public final GetConversationInfoV2RequestBody get_conversation_info_v2_body;
    public final GetUserConversationListRequestBody get_conversation_list_body;
    public final GetConversationSettingInfoRequestBody get_conversation_setting_info_body;
    public final GetConversationsCheckInfoRequestBody get_conversations_checkinfo_body;
    public final GetGroupInfoRequestBody get_group_info_body;
    public final GetGroupInfoListRequestBody get_group_info_list_body;
    public final GetMessagesCheckInfoInConversationRequestBody get_messages_checkinfo_in_conversation_body;
    public final GetStrangerConversationListRequestBody get_stranger_conversation_body;
    public final GetStrangerMessagesRequestBody get_stranger_messages_body;
    public final ConversationLeaveRequestBody leave_conversation_body;
    public final MarkConversationReadRequestBody mark_conversation_read_body;
    public final MarkStrangerAllConversationReadRequestBody mark_stranger_all_conversation_read_body;
    public final MarkStrangerConversationReadRequestBody mark_stranger_conversation_read_body;
    public final MessagesInConversationRequestBody messages_in_conversation_body;
    public final MessagesPerUserRequestBody messages_per_user_body;
    public final MessagesPerUserInitRequestBody messages_per_user_init_body;
    public final MessagesPerUserInitV2RequestBody messages_per_user_init_v2_body;
    public final MgetConversationParticipantsRequestBody mget_conversation_participants_body;
    public final ModifyMessagePropertyRequestBody modify_message_property_body;
    public final GetConversationParticipantsMinIndexV3RequestBody participants_min_index_body;
    public final GetConversationParticipantsReadIndexV3RequestBody participants_read_index_body;
    public final ReactionMessageRequestBody reaction_message_body;
    public final RecallMessageRequestBody recall_message_body;
    public final ReportClientMetricsRequestBody report_client_metrics_body;
    public final ReportGetMessagesCursorRequestBody report_conversation_cursor_body;
    public final SendInputStatusRequestBody send_input_status_body;
    public final SendMessageRequestBody send_message_body;
    public final SendUserActionRequestBody send_user_action_body;
    public final SetConversationCoreInfoRequestBody set_conversation_core_info_body;
    public final SetConversationInfoRequestBody set_conversation_info_body;
    public final SetConversationSettingInfoRequestBody set_conversation_setting_info_body;
    public final SetGroupInfoRequestBody set_group_info_body;
    public final SyncMessageRequestBody sync_message_body;
    public final UpdateConversationParticipantRequestBody update_conversation_participant_body;
    public final UpsertConversationCoreExtInfoRequestBody upsert_conversation_core_ext_info_body;
    public final UpsertConversationSettingExtInfoRequestBody upsert_conversation_setting_ext_info_body;

    /* renamed from: com.bytedance.im.core.proto.RequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RequestBody, Builder> {
        public BatchMarkConversationReadRequestBody batch_mark_read_body;
        public CheckMessagePerUserRequestBody check_messages_per_user_body;
        public ClientACKRequestBody client_ack_body;
        public ConversationAddParticipantsRequestBody conversation_add_participants_body;
        public ConversationParticipantsListRequestBody conversation_participants_body;
        public ConversationRemoveParticipantsRequestBody conversation_remove_participants_body;
        public ConversationSetRoleRequestBody conversation_set_role_body;
        public ConversationsListRequestBody conversations_list_body;
        public CreateConversationRequestBody create_conversation_body;
        public CreateConversationV2RequestBody create_conversation_v2_body;
        public DeleteConversationRequestBody delete_conversation_body;
        public DeleteConversationCoreExtInfoRequestBody delete_conversation_core_ext_info_body;
        public DeleteConversationSettingExtInfoRequestBody delete_conversation_setting_ext_info_body;
        public DeleteMessageRequestBody delete_message_body;
        public DeleteStrangerAllConversationRequestBody delete_stranger_all_conversation_body;
        public DeleteStrangerConversationRequestBody delete_stranger_conversation_body;
        public DeleteStrangerMessageRequestBody delete_stranger_message_body;
        public DissolveConversationRequestBody dissolve_conversation_body;
        public GetConfigsRequestBody get_configs_body;
        public GetConversationCoreInfoRequestBody get_conversation_core_info_body;
        public GetConversationCoreInfoListRequestBody get_conversation_core_info_list_body;
        public GetConversationInfoRequestBody get_conversation_info_body;
        public GetConversationInfoListRequestBody get_conversation_info_list_body;
        public ConversationsPerUserByFavoriteV2RequestBody get_conversation_info_list_by_favorite_v2_body;
        public ConversationsPerUserByTopV2RequestBody get_conversation_info_list_by_top_v2_body;
        public GetConversationInfoListV2RequestBody get_conversation_info_list_v2_body;
        public GetConversationInfoV2RequestBody get_conversation_info_v2_body;
        public GetUserConversationListRequestBody get_conversation_list_body;
        public GetConversationSettingInfoRequestBody get_conversation_setting_info_body;
        public GetConversationsCheckInfoRequestBody get_conversations_checkinfo_body;
        public GetGroupInfoRequestBody get_group_info_body;
        public GetGroupInfoListRequestBody get_group_info_list_body;
        public GetMessagesCheckInfoInConversationRequestBody get_messages_checkinfo_in_conversation_body;
        public GetStrangerConversationListRequestBody get_stranger_conversation_body;
        public GetStrangerMessagesRequestBody get_stranger_messages_body;
        public ConversationLeaveRequestBody leave_conversation_body;
        public MarkConversationReadRequestBody mark_conversation_read_body;
        public MarkStrangerAllConversationReadRequestBody mark_stranger_all_conversation_read_body;
        public MarkStrangerConversationReadRequestBody mark_stranger_conversation_read_body;
        public MessagesInConversationRequestBody messages_in_conversation_body;
        public MessagesPerUserRequestBody messages_per_user_body;
        public MessagesPerUserInitRequestBody messages_per_user_init_body;
        public MessagesPerUserInitV2RequestBody messages_per_user_init_v2_body;
        public MgetConversationParticipantsRequestBody mget_conversation_participants_body;
        public ModifyMessagePropertyRequestBody modify_message_property_body;
        public GetConversationParticipantsMinIndexV3RequestBody participants_min_index_body;
        public GetConversationParticipantsReadIndexV3RequestBody participants_read_index_body;
        public ReactionMessageRequestBody reaction_message_body;
        public RecallMessageRequestBody recall_message_body;
        public ReportClientMetricsRequestBody report_client_metrics_body;
        public ReportGetMessagesCursorRequestBody report_conversation_cursor_body;
        public SendInputStatusRequestBody send_input_status_body;
        public SendMessageRequestBody send_message_body;
        public SendUserActionRequestBody send_user_action_body;
        public SetConversationCoreInfoRequestBody set_conversation_core_info_body;
        public SetConversationInfoRequestBody set_conversation_info_body;
        public SetConversationSettingInfoRequestBody set_conversation_setting_info_body;
        public SetGroupInfoRequestBody set_group_info_body;
        public SyncMessageRequestBody sync_message_body;
        public UpdateConversationParticipantRequestBody update_conversation_participant_body;
        public UpsertConversationCoreExtInfoRequestBody upsert_conversation_core_ext_info_body;
        public UpsertConversationSettingExtInfoRequestBody upsert_conversation_setting_ext_info_body;

        public final RequestBody build() {
            RequestBody requestBody = new RequestBody(this.send_message_body, this.messages_per_user_body, this.messages_per_user_init_body, this.messages_per_user_init_v2_body, this.check_messages_per_user_body, this.conversations_list_body, this.messages_in_conversation_body, this.get_messages_checkinfo_in_conversation_body, this.send_user_action_body, this.send_input_status_body, this.get_conversation_info_body, this.set_conversation_info_body, this.create_conversation_body, this.delete_conversation_body, this.mark_conversation_read_body, this.conversation_participants_body, this.get_conversation_info_list_body, this.report_conversation_cursor_body, this.batch_mark_read_body, this.dissolve_conversation_body, this.get_conversations_checkinfo_body, this.get_conversation_info_v2_body, this.create_conversation_v2_body, this.get_conversation_info_list_v2_body, this.get_conversation_info_list_by_favorite_v2_body, this.get_conversation_info_list_by_top_v2_body, this.conversation_add_participants_body, this.conversation_remove_participants_body, this.leave_conversation_body, this.conversation_set_role_body, this.mget_conversation_participants_body, this.update_conversation_participant_body, this.delete_message_body, this.recall_message_body, this.reaction_message_body, this.sync_message_body, this.modify_message_property_body, this.get_group_info_body, this.set_group_info_body, this.get_group_info_list_body, this.get_conversation_core_info_body, this.set_conversation_core_info_body, this.get_conversation_core_info_list_body, this.upsert_conversation_core_ext_info_body, this.delete_conversation_core_ext_info_body, this.get_conversation_setting_info_body, this.set_conversation_setting_info_body, this.upsert_conversation_setting_ext_info_body, this.delete_conversation_setting_ext_info_body, this.get_stranger_conversation_body, this.get_stranger_messages_body, this.delete_stranger_message_body, this.delete_stranger_conversation_body, this.delete_stranger_all_conversation_body, this.mark_stranger_conversation_read_body, this.mark_stranger_all_conversation_read_body, this.participants_read_index_body, this.participants_min_index_body, this.get_conversation_list_body, this.client_ack_body, this.report_client_metrics_body, this.get_configs_body, super.buildUnknownFields());
            return requestBody;
        }

        public final Builder batch_mark_read_body(BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
            this.batch_mark_read_body = batchMarkConversationReadRequestBody;
            return this;
        }

        public final Builder check_messages_per_user_body(CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
            this.check_messages_per_user_body = checkMessagePerUserRequestBody;
            return this;
        }

        public final Builder client_ack_body(ClientACKRequestBody clientACKRequestBody) {
            this.client_ack_body = clientACKRequestBody;
            return this;
        }

        public final Builder conversation_add_participants_body(ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody) {
            this.conversation_add_participants_body = conversationAddParticipantsRequestBody;
            return this;
        }

        public final Builder conversation_participants_body(ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
            this.conversation_participants_body = conversationParticipantsListRequestBody;
            return this;
        }

        public final Builder conversation_remove_participants_body(ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
            this.conversation_remove_participants_body = conversationRemoveParticipantsRequestBody;
            return this;
        }

        public final Builder conversation_set_role_body(ConversationSetRoleRequestBody conversationSetRoleRequestBody) {
            this.conversation_set_role_body = conversationSetRoleRequestBody;
            return this;
        }

        public final Builder conversations_list_body(ConversationsListRequestBody conversationsListRequestBody) {
            this.conversations_list_body = conversationsListRequestBody;
            return this;
        }

        public final Builder create_conversation_body(CreateConversationRequestBody createConversationRequestBody) {
            this.create_conversation_body = createConversationRequestBody;
            return this;
        }

        public final Builder create_conversation_v2_body(CreateConversationV2RequestBody createConversationV2RequestBody) {
            this.create_conversation_v2_body = createConversationV2RequestBody;
            return this;
        }

        public final Builder delete_conversation_body(DeleteConversationRequestBody deleteConversationRequestBody) {
            this.delete_conversation_body = deleteConversationRequestBody;
            return this;
        }

        public final Builder delete_conversation_core_ext_info_body(DeleteConversationCoreExtInfoRequestBody deleteConversationCoreExtInfoRequestBody) {
            this.delete_conversation_core_ext_info_body = deleteConversationCoreExtInfoRequestBody;
            return this;
        }

        public final Builder delete_conversation_setting_ext_info_body(DeleteConversationSettingExtInfoRequestBody deleteConversationSettingExtInfoRequestBody) {
            this.delete_conversation_setting_ext_info_body = deleteConversationSettingExtInfoRequestBody;
            return this;
        }

        public final Builder delete_message_body(DeleteMessageRequestBody deleteMessageRequestBody) {
            this.delete_message_body = deleteMessageRequestBody;
            return this;
        }

        public final Builder delete_stranger_all_conversation_body(DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody) {
            this.delete_stranger_all_conversation_body = deleteStrangerAllConversationRequestBody;
            return this;
        }

        public final Builder delete_stranger_conversation_body(DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
            this.delete_stranger_conversation_body = deleteStrangerConversationRequestBody;
            return this;
        }

        public final Builder delete_stranger_message_body(DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            this.delete_stranger_message_body = deleteStrangerMessageRequestBody;
            return this;
        }

        public final Builder dissolve_conversation_body(DissolveConversationRequestBody dissolveConversationRequestBody) {
            this.dissolve_conversation_body = dissolveConversationRequestBody;
            return this;
        }

        public final Builder get_configs_body(GetConfigsRequestBody getConfigsRequestBody) {
            this.get_configs_body = getConfigsRequestBody;
            return this;
        }

        public final Builder get_conversation_core_info_body(GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody) {
            this.get_conversation_core_info_body = getConversationCoreInfoRequestBody;
            return this;
        }

        public final Builder get_conversation_core_info_list_body(GetConversationCoreInfoListRequestBody getConversationCoreInfoListRequestBody) {
            this.get_conversation_core_info_list_body = getConversationCoreInfoListRequestBody;
            return this;
        }

        public final Builder get_conversation_info_body(GetConversationInfoRequestBody getConversationInfoRequestBody) {
            this.get_conversation_info_body = getConversationInfoRequestBody;
            return this;
        }

        public final Builder get_conversation_info_list_body(GetConversationInfoListRequestBody getConversationInfoListRequestBody) {
            this.get_conversation_info_list_body = getConversationInfoListRequestBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_favorite_v2_body(ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
            this.get_conversation_info_list_by_favorite_v2_body = conversationsPerUserByFavoriteV2RequestBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_top_v2_body(ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody) {
            this.get_conversation_info_list_by_top_v2_body = conversationsPerUserByTopV2RequestBody;
            return this;
        }

        public final Builder get_conversation_info_list_v2_body(GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
            this.get_conversation_info_list_v2_body = getConversationInfoListV2RequestBody;
            return this;
        }

        public final Builder get_conversation_info_v2_body(GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
            this.get_conversation_info_v2_body = getConversationInfoV2RequestBody;
            return this;
        }

        public final Builder get_conversation_list_body(GetUserConversationListRequestBody getUserConversationListRequestBody) {
            this.get_conversation_list_body = getUserConversationListRequestBody;
            return this;
        }

        public final Builder get_conversation_setting_info_body(GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody) {
            this.get_conversation_setting_info_body = getConversationSettingInfoRequestBody;
            return this;
        }

        public final Builder get_conversations_checkinfo_body(GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody) {
            this.get_conversations_checkinfo_body = getConversationsCheckInfoRequestBody;
            return this;
        }

        public final Builder get_group_info_body(GetGroupInfoRequestBody getGroupInfoRequestBody) {
            this.get_group_info_body = getGroupInfoRequestBody;
            return this;
        }

        public final Builder get_group_info_list_body(GetGroupInfoListRequestBody getGroupInfoListRequestBody) {
            this.get_group_info_list_body = getGroupInfoListRequestBody;
            return this;
        }

        public final Builder get_messages_checkinfo_in_conversation_body(GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
            this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationRequestBody;
            return this;
        }

        public final Builder get_stranger_conversation_body(GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
            this.get_stranger_conversation_body = getStrangerConversationListRequestBody;
            return this;
        }

        public final Builder get_stranger_messages_body(GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
            this.get_stranger_messages_body = getStrangerMessagesRequestBody;
            return this;
        }

        public final Builder leave_conversation_body(ConversationLeaveRequestBody conversationLeaveRequestBody) {
            this.leave_conversation_body = conversationLeaveRequestBody;
            return this;
        }

        public final Builder mark_conversation_read_body(MarkConversationReadRequestBody markConversationReadRequestBody) {
            this.mark_conversation_read_body = markConversationReadRequestBody;
            return this;
        }

        public final Builder mark_stranger_all_conversation_read_body(MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody) {
            this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadRequestBody;
            return this;
        }

        public final Builder mark_stranger_conversation_read_body(MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody) {
            this.mark_stranger_conversation_read_body = markStrangerConversationReadRequestBody;
            return this;
        }

        public final Builder messages_in_conversation_body(MessagesInConversationRequestBody messagesInConversationRequestBody) {
            this.messages_in_conversation_body = messagesInConversationRequestBody;
            return this;
        }

        public final Builder messages_per_user_body(MessagesPerUserRequestBody messagesPerUserRequestBody) {
            this.messages_per_user_body = messagesPerUserRequestBody;
            return this;
        }

        public final Builder messages_per_user_init_body(MessagesPerUserInitRequestBody messagesPerUserInitRequestBody) {
            this.messages_per_user_init_body = messagesPerUserInitRequestBody;
            return this;
        }

        public final Builder messages_per_user_init_v2_body(MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
            this.messages_per_user_init_v2_body = messagesPerUserInitV2RequestBody;
            return this;
        }

        public final Builder mget_conversation_participants_body(MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody) {
            this.mget_conversation_participants_body = mgetConversationParticipantsRequestBody;
            return this;
        }

        public final Builder modify_message_property_body(ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
            this.modify_message_property_body = modifyMessagePropertyRequestBody;
            return this;
        }

        public final Builder participants_min_index_body(GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody) {
            this.participants_min_index_body = getConversationParticipantsMinIndexV3RequestBody;
            return this;
        }

        public final Builder participants_read_index_body(GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
            this.participants_read_index_body = getConversationParticipantsReadIndexV3RequestBody;
            return this;
        }

        public final Builder reaction_message_body(ReactionMessageRequestBody reactionMessageRequestBody) {
            this.reaction_message_body = reactionMessageRequestBody;
            return this;
        }

        public final Builder recall_message_body(RecallMessageRequestBody recallMessageRequestBody) {
            this.recall_message_body = recallMessageRequestBody;
            return this;
        }

        public final Builder report_client_metrics_body(ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
            this.report_client_metrics_body = reportClientMetricsRequestBody;
            return this;
        }

        public final Builder report_conversation_cursor_body(ReportGetMessagesCursorRequestBody reportGetMessagesCursorRequestBody) {
            this.report_conversation_cursor_body = reportGetMessagesCursorRequestBody;
            return this;
        }

        public final Builder send_input_status_body(SendInputStatusRequestBody sendInputStatusRequestBody) {
            this.send_input_status_body = sendInputStatusRequestBody;
            return this;
        }

        public final Builder send_message_body(SendMessageRequestBody sendMessageRequestBody) {
            this.send_message_body = sendMessageRequestBody;
            return this;
        }

        public final Builder send_user_action_body(SendUserActionRequestBody sendUserActionRequestBody) {
            this.send_user_action_body = sendUserActionRequestBody;
            return this;
        }

        public final Builder set_conversation_core_info_body(SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
            this.set_conversation_core_info_body = setConversationCoreInfoRequestBody;
            return this;
        }

        public final Builder set_conversation_info_body(SetConversationInfoRequestBody setConversationInfoRequestBody) {
            this.set_conversation_info_body = setConversationInfoRequestBody;
            return this;
        }

        public final Builder set_conversation_setting_info_body(SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
            this.set_conversation_setting_info_body = setConversationSettingInfoRequestBody;
            return this;
        }

        public final Builder set_group_info_body(SetGroupInfoRequestBody setGroupInfoRequestBody) {
            this.set_group_info_body = setGroupInfoRequestBody;
            return this;
        }

        public final Builder sync_message_body(SyncMessageRequestBody syncMessageRequestBody) {
            this.sync_message_body = syncMessageRequestBody;
            return this;
        }

        public final Builder update_conversation_participant_body(UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
            this.update_conversation_participant_body = updateConversationParticipantRequestBody;
            return this;
        }

        public final Builder upsert_conversation_core_ext_info_body(UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody) {
            this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoRequestBody;
            return this;
        }

        public final Builder upsert_conversation_setting_ext_info_body(UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody) {
            this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoRequestBody;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.RequestBody$ProtoAdapter_RequestBody */
    static final class ProtoAdapter_RequestBody extends ProtoAdapter<RequestBody> {
        public ProtoAdapter_RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestBody.class);
        }

        public final int encodedSize(RequestBody requestBody) {
            return SendMessageRequestBody.ADAPTER.encodedSizeWithTag(100, requestBody.send_message_body) + MessagesPerUserRequestBody.ADAPTER.encodedSizeWithTag(200, requestBody.messages_per_user_body) + MessagesPerUserInitRequestBody.ADAPTER.encodedSizeWithTag(201, requestBody.messages_per_user_init_body) + MessagesPerUserInitV2RequestBody.ADAPTER.encodedSizeWithTag(203, requestBody.messages_per_user_init_v2_body) + CheckMessagePerUserRequestBody.ADAPTER.encodedSizeWithTag(210, requestBody.check_messages_per_user_body) + ConversationsListRequestBody.ADAPTER.encodedSizeWithTag(300, requestBody.conversations_list_body) + MessagesInConversationRequestBody.ADAPTER.encodedSizeWithTag(301, requestBody.messages_in_conversation_body) + GetMessagesCheckInfoInConversationRequestBody.ADAPTER.encodedSizeWithTag(302, requestBody.get_messages_checkinfo_in_conversation_body) + SendUserActionRequestBody.ADAPTER.encodedSizeWithTag(410, requestBody.send_user_action_body) + SendInputStatusRequestBody.ADAPTER.encodedSizeWithTag(411, requestBody.send_input_status_body) + GetConversationInfoRequestBody.ADAPTER.encodedSizeWithTag(600, requestBody.get_conversation_info_body) + SetConversationInfoRequestBody.ADAPTER.encodedSizeWithTag(601, requestBody.set_conversation_info_body) + CreateConversationRequestBody.ADAPTER.encodedSizeWithTag(602, requestBody.create_conversation_body) + DeleteConversationRequestBody.ADAPTER.encodedSizeWithTag(603, requestBody.delete_conversation_body) + MarkConversationReadRequestBody.ADAPTER.encodedSizeWithTag(604, requestBody.mark_conversation_read_body) + ConversationParticipantsListRequestBody.ADAPTER.encodedSizeWithTag(605, requestBody.conversation_participants_body) + GetConversationInfoListRequestBody.ADAPTER.encodedSizeWithTag(607, requestBody.get_conversation_info_list_body) + ReportGetMessagesCursorRequestBody.ADAPTER.encodedSizeWithTag(606, requestBody.report_conversation_cursor_body) + BatchMarkConversationReadRequestBody.ADAPTER.encodedSizeWithTag(613, requestBody.batch_mark_read_body) + DissolveConversationRequestBody.ADAPTER.encodedSizeWithTag(614, requestBody.dissolve_conversation_body) + GetConversationsCheckInfoRequestBody.ADAPTER.encodedSizeWithTag(615, requestBody.get_conversations_checkinfo_body) + GetConversationInfoV2RequestBody.ADAPTER.encodedSizeWithTag(608, requestBody.get_conversation_info_v2_body) + CreateConversationV2RequestBody.ADAPTER.encodedSizeWithTag(609, requestBody.create_conversation_v2_body) + GetConversationInfoListV2RequestBody.ADAPTER.encodedSizeWithTag(610, requestBody.get_conversation_info_list_v2_body) + ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.encodedSizeWithTag(611, requestBody.get_conversation_info_list_by_favorite_v2_body) + ConversationsPerUserByTopV2RequestBody.ADAPTER.encodedSizeWithTag(612, requestBody.get_conversation_info_list_by_top_v2_body) + ConversationAddParticipantsRequestBody.ADAPTER.encodedSizeWithTag(650, requestBody.conversation_add_participants_body) + ConversationRemoveParticipantsRequestBody.ADAPTER.encodedSizeWithTag(651, requestBody.conversation_remove_participants_body) + ConversationLeaveRequestBody.ADAPTER.encodedSizeWithTag(652, requestBody.leave_conversation_body) + ConversationSetRoleRequestBody.ADAPTER.encodedSizeWithTag(653, requestBody.conversation_set_role_body) + MgetConversationParticipantsRequestBody.ADAPTER.encodedSizeWithTag(654, requestBody.mget_conversation_participants_body) + UpdateConversationParticipantRequestBody.ADAPTER.encodedSizeWithTag(655, requestBody.update_conversation_participant_body) + DeleteMessageRequestBody.ADAPTER.encodedSizeWithTag(701, requestBody.delete_message_body) + RecallMessageRequestBody.ADAPTER.encodedSizeWithTag(702, requestBody.recall_message_body) + ReactionMessageRequestBody.ADAPTER.encodedSizeWithTag(703, requestBody.reaction_message_body) + SyncMessageRequestBody.ADAPTER.encodedSizeWithTag(704, requestBody.sync_message_body) + ModifyMessagePropertyRequestBody.ADAPTER.encodedSizeWithTag(705, requestBody.modify_message_property_body) + GetGroupInfoRequestBody.ADAPTER.encodedSizeWithTag(801, requestBody.get_group_info_body) + SetGroupInfoRequestBody.ADAPTER.encodedSizeWithTag(802, requestBody.set_group_info_body) + GetGroupInfoListRequestBody.ADAPTER.encodedSizeWithTag(803, requestBody.get_group_info_list_body) + GetConversationCoreInfoRequestBody.ADAPTER.encodedSizeWithTag(901, requestBody.get_conversation_core_info_body) + SetConversationCoreInfoRequestBody.ADAPTER.encodedSizeWithTag(902, requestBody.set_conversation_core_info_body) + GetConversationCoreInfoListRequestBody.ADAPTER.encodedSizeWithTag(903, requestBody.get_conversation_core_info_list_body) + UpsertConversationCoreExtInfoRequestBody.ADAPTER.encodedSizeWithTag(904, requestBody.upsert_conversation_core_ext_info_body) + DeleteConversationCoreExtInfoRequestBody.ADAPTER.encodedSizeWithTag(905, requestBody.delete_conversation_core_ext_info_body) + GetConversationSettingInfoRequestBody.ADAPTER.encodedSizeWithTag(920, requestBody.get_conversation_setting_info_body) + SetConversationSettingInfoRequestBody.ADAPTER.encodedSizeWithTag(921, requestBody.set_conversation_setting_info_body) + UpsertConversationSettingExtInfoRequestBody.ADAPTER.encodedSizeWithTag(922, requestBody.upsert_conversation_setting_ext_info_body) + DeleteConversationSettingExtInfoRequestBody.ADAPTER.encodedSizeWithTag(923, requestBody.delete_conversation_setting_ext_info_body) + GetStrangerConversationListRequestBody.ADAPTER.encodedSizeWithTag(1000, requestBody.get_stranger_conversation_body) + GetStrangerMessagesRequestBody.ADAPTER.encodedSizeWithTag(1001, requestBody.get_stranger_messages_body) + DeleteStrangerMessageRequestBody.ADAPTER.encodedSizeWithTag(BaseNotice.CHECK_PROFILE, requestBody.delete_stranger_message_body) + DeleteStrangerConversationRequestBody.ADAPTER.encodedSizeWithTag(BaseNotice.COMMENT_REPLY_WITH_VIDEO, requestBody.delete_stranger_conversation_body) + DeleteStrangerAllConversationRequestBody.ADAPTER.encodedSizeWithTag(1004, requestBody.delete_stranger_all_conversation_body) + MarkStrangerConversationReadRequestBody.ADAPTER.encodedSizeWithTag(1005, requestBody.mark_stranger_conversation_read_body) + MarkStrangerAllConversationReadRequestBody.ADAPTER.encodedSizeWithTag(1006, requestBody.mark_stranger_all_conversation_read_body) + GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.encodedSizeWithTag(2000, requestBody.participants_read_index_body) + GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.encodedSizeWithTag(2001, requestBody.participants_min_index_body) + GetUserConversationListRequestBody.ADAPTER.encodedSizeWithTag(2006, requestBody.get_conversation_list_body) + ClientACKRequestBody.ADAPTER.encodedSizeWithTag(2010, requestBody.client_ack_body) + ReportClientMetricsRequestBody.ADAPTER.encodedSizeWithTag(2016, requestBody.report_client_metrics_body) + GetConfigsRequestBody.ADAPTER.encodedSizeWithTag(2017, requestBody.get_configs_body) + requestBody.unknownFields().size();
        }

        public final RequestBody redact(RequestBody requestBody) {
            Builder newBuilder = requestBody.newBuilder();
            if (newBuilder.send_message_body != null) {
                newBuilder.send_message_body = (SendMessageRequestBody) SendMessageRequestBody.ADAPTER.redact(newBuilder.send_message_body);
            }
            if (newBuilder.messages_per_user_body != null) {
                newBuilder.messages_per_user_body = (MessagesPerUserRequestBody) MessagesPerUserRequestBody.ADAPTER.redact(newBuilder.messages_per_user_body);
            }
            if (newBuilder.messages_per_user_init_body != null) {
                newBuilder.messages_per_user_init_body = (MessagesPerUserInitRequestBody) MessagesPerUserInitRequestBody.ADAPTER.redact(newBuilder.messages_per_user_init_body);
            }
            if (newBuilder.messages_per_user_init_v2_body != null) {
                newBuilder.messages_per_user_init_v2_body = (MessagesPerUserInitV2RequestBody) MessagesPerUserInitV2RequestBody.ADAPTER.redact(newBuilder.messages_per_user_init_v2_body);
            }
            if (newBuilder.check_messages_per_user_body != null) {
                newBuilder.check_messages_per_user_body = (CheckMessagePerUserRequestBody) CheckMessagePerUserRequestBody.ADAPTER.redact(newBuilder.check_messages_per_user_body);
            }
            if (newBuilder.conversations_list_body != null) {
                newBuilder.conversations_list_body = (ConversationsListRequestBody) ConversationsListRequestBody.ADAPTER.redact(newBuilder.conversations_list_body);
            }
            if (newBuilder.messages_in_conversation_body != null) {
                newBuilder.messages_in_conversation_body = (MessagesInConversationRequestBody) MessagesInConversationRequestBody.ADAPTER.redact(newBuilder.messages_in_conversation_body);
            }
            if (newBuilder.get_messages_checkinfo_in_conversation_body != null) {
                newBuilder.get_messages_checkinfo_in_conversation_body = (GetMessagesCheckInfoInConversationRequestBody) GetMessagesCheckInfoInConversationRequestBody.ADAPTER.redact(newBuilder.get_messages_checkinfo_in_conversation_body);
            }
            if (newBuilder.send_user_action_body != null) {
                newBuilder.send_user_action_body = (SendUserActionRequestBody) SendUserActionRequestBody.ADAPTER.redact(newBuilder.send_user_action_body);
            }
            if (newBuilder.send_input_status_body != null) {
                newBuilder.send_input_status_body = (SendInputStatusRequestBody) SendInputStatusRequestBody.ADAPTER.redact(newBuilder.send_input_status_body);
            }
            if (newBuilder.get_conversation_info_body != null) {
                newBuilder.get_conversation_info_body = (GetConversationInfoRequestBody) GetConversationInfoRequestBody.ADAPTER.redact(newBuilder.get_conversation_info_body);
            }
            if (newBuilder.set_conversation_info_body != null) {
                newBuilder.set_conversation_info_body = (SetConversationInfoRequestBody) SetConversationInfoRequestBody.ADAPTER.redact(newBuilder.set_conversation_info_body);
            }
            if (newBuilder.create_conversation_body != null) {
                newBuilder.create_conversation_body = (CreateConversationRequestBody) CreateConversationRequestBody.ADAPTER.redact(newBuilder.create_conversation_body);
            }
            if (newBuilder.delete_conversation_body != null) {
                newBuilder.delete_conversation_body = (DeleteConversationRequestBody) DeleteConversationRequestBody.ADAPTER.redact(newBuilder.delete_conversation_body);
            }
            if (newBuilder.mark_conversation_read_body != null) {
                newBuilder.mark_conversation_read_body = (MarkConversationReadRequestBody) MarkConversationReadRequestBody.ADAPTER.redact(newBuilder.mark_conversation_read_body);
            }
            if (newBuilder.conversation_participants_body != null) {
                newBuilder.conversation_participants_body = (ConversationParticipantsListRequestBody) ConversationParticipantsListRequestBody.ADAPTER.redact(newBuilder.conversation_participants_body);
            }
            if (newBuilder.get_conversation_info_list_body != null) {
                newBuilder.get_conversation_info_list_body = (GetConversationInfoListRequestBody) GetConversationInfoListRequestBody.ADAPTER.redact(newBuilder.get_conversation_info_list_body);
            }
            if (newBuilder.report_conversation_cursor_body != null) {
                newBuilder.report_conversation_cursor_body = (ReportGetMessagesCursorRequestBody) ReportGetMessagesCursorRequestBody.ADAPTER.redact(newBuilder.report_conversation_cursor_body);
            }
            if (newBuilder.batch_mark_read_body != null) {
                newBuilder.batch_mark_read_body = (BatchMarkConversationReadRequestBody) BatchMarkConversationReadRequestBody.ADAPTER.redact(newBuilder.batch_mark_read_body);
            }
            if (newBuilder.dissolve_conversation_body != null) {
                newBuilder.dissolve_conversation_body = (DissolveConversationRequestBody) DissolveConversationRequestBody.ADAPTER.redact(newBuilder.dissolve_conversation_body);
            }
            if (newBuilder.get_conversations_checkinfo_body != null) {
                newBuilder.get_conversations_checkinfo_body = (GetConversationsCheckInfoRequestBody) GetConversationsCheckInfoRequestBody.ADAPTER.redact(newBuilder.get_conversations_checkinfo_body);
            }
            if (newBuilder.get_conversation_info_v2_body != null) {
                newBuilder.get_conversation_info_v2_body = (GetConversationInfoV2RequestBody) GetConversationInfoV2RequestBody.ADAPTER.redact(newBuilder.get_conversation_info_v2_body);
            }
            if (newBuilder.create_conversation_v2_body != null) {
                newBuilder.create_conversation_v2_body = (CreateConversationV2RequestBody) CreateConversationV2RequestBody.ADAPTER.redact(newBuilder.create_conversation_v2_body);
            }
            if (newBuilder.get_conversation_info_list_v2_body != null) {
                newBuilder.get_conversation_info_list_v2_body = (GetConversationInfoListV2RequestBody) GetConversationInfoListV2RequestBody.ADAPTER.redact(newBuilder.get_conversation_info_list_v2_body);
            }
            if (newBuilder.get_conversation_info_list_by_favorite_v2_body != null) {
                newBuilder.get_conversation_info_list_by_favorite_v2_body = (ConversationsPerUserByFavoriteV2RequestBody) ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.redact(newBuilder.get_conversation_info_list_by_favorite_v2_body);
            }
            if (newBuilder.get_conversation_info_list_by_top_v2_body != null) {
                newBuilder.get_conversation_info_list_by_top_v2_body = (ConversationsPerUserByTopV2RequestBody) ConversationsPerUserByTopV2RequestBody.ADAPTER.redact(newBuilder.get_conversation_info_list_by_top_v2_body);
            }
            if (newBuilder.conversation_add_participants_body != null) {
                newBuilder.conversation_add_participants_body = (ConversationAddParticipantsRequestBody) ConversationAddParticipantsRequestBody.ADAPTER.redact(newBuilder.conversation_add_participants_body);
            }
            if (newBuilder.conversation_remove_participants_body != null) {
                newBuilder.conversation_remove_participants_body = (ConversationRemoveParticipantsRequestBody) ConversationRemoveParticipantsRequestBody.ADAPTER.redact(newBuilder.conversation_remove_participants_body);
            }
            if (newBuilder.leave_conversation_body != null) {
                newBuilder.leave_conversation_body = (ConversationLeaveRequestBody) ConversationLeaveRequestBody.ADAPTER.redact(newBuilder.leave_conversation_body);
            }
            if (newBuilder.conversation_set_role_body != null) {
                newBuilder.conversation_set_role_body = (ConversationSetRoleRequestBody) ConversationSetRoleRequestBody.ADAPTER.redact(newBuilder.conversation_set_role_body);
            }
            if (newBuilder.mget_conversation_participants_body != null) {
                newBuilder.mget_conversation_participants_body = (MgetConversationParticipantsRequestBody) MgetConversationParticipantsRequestBody.ADAPTER.redact(newBuilder.mget_conversation_participants_body);
            }
            if (newBuilder.update_conversation_participant_body != null) {
                newBuilder.update_conversation_participant_body = (UpdateConversationParticipantRequestBody) UpdateConversationParticipantRequestBody.ADAPTER.redact(newBuilder.update_conversation_participant_body);
            }
            if (newBuilder.delete_message_body != null) {
                newBuilder.delete_message_body = (DeleteMessageRequestBody) DeleteMessageRequestBody.ADAPTER.redact(newBuilder.delete_message_body);
            }
            if (newBuilder.recall_message_body != null) {
                newBuilder.recall_message_body = (RecallMessageRequestBody) RecallMessageRequestBody.ADAPTER.redact(newBuilder.recall_message_body);
            }
            if (newBuilder.reaction_message_body != null) {
                newBuilder.reaction_message_body = (ReactionMessageRequestBody) ReactionMessageRequestBody.ADAPTER.redact(newBuilder.reaction_message_body);
            }
            if (newBuilder.sync_message_body != null) {
                newBuilder.sync_message_body = (SyncMessageRequestBody) SyncMessageRequestBody.ADAPTER.redact(newBuilder.sync_message_body);
            }
            if (newBuilder.modify_message_property_body != null) {
                newBuilder.modify_message_property_body = (ModifyMessagePropertyRequestBody) ModifyMessagePropertyRequestBody.ADAPTER.redact(newBuilder.modify_message_property_body);
            }
            if (newBuilder.get_group_info_body != null) {
                newBuilder.get_group_info_body = (GetGroupInfoRequestBody) GetGroupInfoRequestBody.ADAPTER.redact(newBuilder.get_group_info_body);
            }
            if (newBuilder.set_group_info_body != null) {
                newBuilder.set_group_info_body = (SetGroupInfoRequestBody) SetGroupInfoRequestBody.ADAPTER.redact(newBuilder.set_group_info_body);
            }
            if (newBuilder.get_group_info_list_body != null) {
                newBuilder.get_group_info_list_body = (GetGroupInfoListRequestBody) GetGroupInfoListRequestBody.ADAPTER.redact(newBuilder.get_group_info_list_body);
            }
            if (newBuilder.get_conversation_core_info_body != null) {
                newBuilder.get_conversation_core_info_body = (GetConversationCoreInfoRequestBody) GetConversationCoreInfoRequestBody.ADAPTER.redact(newBuilder.get_conversation_core_info_body);
            }
            if (newBuilder.set_conversation_core_info_body != null) {
                newBuilder.set_conversation_core_info_body = (SetConversationCoreInfoRequestBody) SetConversationCoreInfoRequestBody.ADAPTER.redact(newBuilder.set_conversation_core_info_body);
            }
            if (newBuilder.get_conversation_core_info_list_body != null) {
                newBuilder.get_conversation_core_info_list_body = (GetConversationCoreInfoListRequestBody) GetConversationCoreInfoListRequestBody.ADAPTER.redact(newBuilder.get_conversation_core_info_list_body);
            }
            if (newBuilder.upsert_conversation_core_ext_info_body != null) {
                newBuilder.upsert_conversation_core_ext_info_body = (UpsertConversationCoreExtInfoRequestBody) UpsertConversationCoreExtInfoRequestBody.ADAPTER.redact(newBuilder.upsert_conversation_core_ext_info_body);
            }
            if (newBuilder.delete_conversation_core_ext_info_body != null) {
                newBuilder.delete_conversation_core_ext_info_body = (DeleteConversationCoreExtInfoRequestBody) DeleteConversationCoreExtInfoRequestBody.ADAPTER.redact(newBuilder.delete_conversation_core_ext_info_body);
            }
            if (newBuilder.get_conversation_setting_info_body != null) {
                newBuilder.get_conversation_setting_info_body = (GetConversationSettingInfoRequestBody) GetConversationSettingInfoRequestBody.ADAPTER.redact(newBuilder.get_conversation_setting_info_body);
            }
            if (newBuilder.set_conversation_setting_info_body != null) {
                newBuilder.set_conversation_setting_info_body = (SetConversationSettingInfoRequestBody) SetConversationSettingInfoRequestBody.ADAPTER.redact(newBuilder.set_conversation_setting_info_body);
            }
            if (newBuilder.upsert_conversation_setting_ext_info_body != null) {
                newBuilder.upsert_conversation_setting_ext_info_body = (UpsertConversationSettingExtInfoRequestBody) UpsertConversationSettingExtInfoRequestBody.ADAPTER.redact(newBuilder.upsert_conversation_setting_ext_info_body);
            }
            if (newBuilder.delete_conversation_setting_ext_info_body != null) {
                newBuilder.delete_conversation_setting_ext_info_body = (DeleteConversationSettingExtInfoRequestBody) DeleteConversationSettingExtInfoRequestBody.ADAPTER.redact(newBuilder.delete_conversation_setting_ext_info_body);
            }
            if (newBuilder.get_stranger_conversation_body != null) {
                newBuilder.get_stranger_conversation_body = (GetStrangerConversationListRequestBody) GetStrangerConversationListRequestBody.ADAPTER.redact(newBuilder.get_stranger_conversation_body);
            }
            if (newBuilder.get_stranger_messages_body != null) {
                newBuilder.get_stranger_messages_body = (GetStrangerMessagesRequestBody) GetStrangerMessagesRequestBody.ADAPTER.redact(newBuilder.get_stranger_messages_body);
            }
            if (newBuilder.delete_stranger_message_body != null) {
                newBuilder.delete_stranger_message_body = (DeleteStrangerMessageRequestBody) DeleteStrangerMessageRequestBody.ADAPTER.redact(newBuilder.delete_stranger_message_body);
            }
            if (newBuilder.delete_stranger_conversation_body != null) {
                newBuilder.delete_stranger_conversation_body = (DeleteStrangerConversationRequestBody) DeleteStrangerConversationRequestBody.ADAPTER.redact(newBuilder.delete_stranger_conversation_body);
            }
            if (newBuilder.delete_stranger_all_conversation_body != null) {
                newBuilder.delete_stranger_all_conversation_body = (DeleteStrangerAllConversationRequestBody) DeleteStrangerAllConversationRequestBody.ADAPTER.redact(newBuilder.delete_stranger_all_conversation_body);
            }
            if (newBuilder.mark_stranger_conversation_read_body != null) {
                newBuilder.mark_stranger_conversation_read_body = (MarkStrangerConversationReadRequestBody) MarkStrangerConversationReadRequestBody.ADAPTER.redact(newBuilder.mark_stranger_conversation_read_body);
            }
            if (newBuilder.mark_stranger_all_conversation_read_body != null) {
                newBuilder.mark_stranger_all_conversation_read_body = (MarkStrangerAllConversationReadRequestBody) MarkStrangerAllConversationReadRequestBody.ADAPTER.redact(newBuilder.mark_stranger_all_conversation_read_body);
            }
            if (newBuilder.participants_read_index_body != null) {
                newBuilder.participants_read_index_body = (GetConversationParticipantsReadIndexV3RequestBody) GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.redact(newBuilder.participants_read_index_body);
            }
            if (newBuilder.participants_min_index_body != null) {
                newBuilder.participants_min_index_body = (GetConversationParticipantsMinIndexV3RequestBody) GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.redact(newBuilder.participants_min_index_body);
            }
            if (newBuilder.get_conversation_list_body != null) {
                newBuilder.get_conversation_list_body = (GetUserConversationListRequestBody) GetUserConversationListRequestBody.ADAPTER.redact(newBuilder.get_conversation_list_body);
            }
            if (newBuilder.client_ack_body != null) {
                newBuilder.client_ack_body = (ClientACKRequestBody) ClientACKRequestBody.ADAPTER.redact(newBuilder.client_ack_body);
            }
            if (newBuilder.report_client_metrics_body != null) {
                newBuilder.report_client_metrics_body = (ReportClientMetricsRequestBody) ReportClientMetricsRequestBody.ADAPTER.redact(newBuilder.report_client_metrics_body);
            }
            if (newBuilder.get_configs_body != null) {
                newBuilder.get_configs_body = (GetConfigsRequestBody) GetConfigsRequestBody.ADAPTER.redact(newBuilder.get_configs_body);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 200:
                            builder.messages_per_user_body((MessagesPerUserRequestBody) MessagesPerUserRequestBody.ADAPTER.decode(protoReader));
                            break;
                        case 201:
                            builder.messages_per_user_init_body((MessagesPerUserInitRequestBody) MessagesPerUserInitRequestBody.ADAPTER.decode(protoReader));
                            break;
                        default:
                            switch (nextTag) {
                                case 300:
                                    builder.conversations_list_body((ConversationsListRequestBody) ConversationsListRequestBody.ADAPTER.decode(protoReader));
                                    break;
                                case 301:
                                    builder.messages_in_conversation_body((MessagesInConversationRequestBody) MessagesInConversationRequestBody.ADAPTER.decode(protoReader));
                                    break;
                                case 302:
                                    builder.get_messages_checkinfo_in_conversation_body((GetMessagesCheckInfoInConversationRequestBody) GetMessagesCheckInfoInConversationRequestBody.ADAPTER.decode(protoReader));
                                    break;
                                default:
                                    switch (nextTag) {
                                        case 410:
                                            builder.send_user_action_body((SendUserActionRequestBody) SendUserActionRequestBody.ADAPTER.decode(protoReader));
                                            break;
                                        case 411:
                                            builder.send_input_status_body((SendInputStatusRequestBody) SendInputStatusRequestBody.ADAPTER.decode(protoReader));
                                            break;
                                        default:
                                            switch (nextTag) {
                                                case 600:
                                                    builder.get_conversation_info_body((GetConversationInfoRequestBody) GetConversationInfoRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 601:
                                                    builder.set_conversation_info_body((SetConversationInfoRequestBody) SetConversationInfoRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 602:
                                                    builder.create_conversation_body((CreateConversationRequestBody) CreateConversationRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 603:
                                                    builder.delete_conversation_body((DeleteConversationRequestBody) DeleteConversationRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 604:
                                                    builder.mark_conversation_read_body((MarkConversationReadRequestBody) MarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 605:
                                                    builder.conversation_participants_body((ConversationParticipantsListRequestBody) ConversationParticipantsListRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 606:
                                                    builder.report_conversation_cursor_body((ReportGetMessagesCursorRequestBody) ReportGetMessagesCursorRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 607:
                                                    builder.get_conversation_info_list_body((GetConversationInfoListRequestBody) GetConversationInfoListRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 608:
                                                    builder.get_conversation_info_v2_body((GetConversationInfoV2RequestBody) GetConversationInfoV2RequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 609:
                                                    builder.create_conversation_v2_body((CreateConversationV2RequestBody) CreateConversationV2RequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 610:
                                                    builder.get_conversation_info_list_v2_body((GetConversationInfoListV2RequestBody) GetConversationInfoListV2RequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 611:
                                                    builder.get_conversation_info_list_by_favorite_v2_body((ConversationsPerUserByFavoriteV2RequestBody) ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 612:
                                                    builder.get_conversation_info_list_by_top_v2_body((ConversationsPerUserByTopV2RequestBody) ConversationsPerUserByTopV2RequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 613:
                                                    builder.batch_mark_read_body((BatchMarkConversationReadRequestBody) BatchMarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 614:
                                                    builder.dissolve_conversation_body((DissolveConversationRequestBody) DissolveConversationRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 615:
                                                    builder.get_conversations_checkinfo_body((GetConversationsCheckInfoRequestBody) GetConversationsCheckInfoRequestBody.ADAPTER.decode(protoReader));
                                                    break;
                                                default:
                                                    switch (nextTag) {
                                                        case 650:
                                                            builder.conversation_add_participants_body((ConversationAddParticipantsRequestBody) ConversationAddParticipantsRequestBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 651:
                                                            builder.conversation_remove_participants_body((ConversationRemoveParticipantsRequestBody) ConversationRemoveParticipantsRequestBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 652:
                                                            builder.leave_conversation_body((ConversationLeaveRequestBody) ConversationLeaveRequestBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 653:
                                                            builder.conversation_set_role_body((ConversationSetRoleRequestBody) ConversationSetRoleRequestBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 654:
                                                            builder.mget_conversation_participants_body((MgetConversationParticipantsRequestBody) MgetConversationParticipantsRequestBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 655:
                                                            builder.update_conversation_participant_body((UpdateConversationParticipantRequestBody) UpdateConversationParticipantRequestBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        default:
                                                            switch (nextTag) {
                                                                case 701:
                                                                    builder.delete_message_body((DeleteMessageRequestBody) DeleteMessageRequestBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                case 702:
                                                                    builder.recall_message_body((RecallMessageRequestBody) RecallMessageRequestBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                case 703:
                                                                    builder.reaction_message_body((ReactionMessageRequestBody) ReactionMessageRequestBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                case 704:
                                                                    builder.sync_message_body((SyncMessageRequestBody) SyncMessageRequestBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                case 705:
                                                                    builder.modify_message_property_body((ModifyMessagePropertyRequestBody) ModifyMessagePropertyRequestBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                default:
                                                                    switch (nextTag) {
                                                                        case 801:
                                                                            builder.get_group_info_body((GetGroupInfoRequestBody) GetGroupInfoRequestBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        case 802:
                                                                            builder.set_group_info_body((SetGroupInfoRequestBody) SetGroupInfoRequestBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        case 803:
                                                                            builder.get_group_info_list_body((GetGroupInfoListRequestBody) GetGroupInfoListRequestBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        default:
                                                                            switch (nextTag) {
                                                                                case 901:
                                                                                    builder.get_conversation_core_info_body((GetConversationCoreInfoRequestBody) GetConversationCoreInfoRequestBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                case 902:
                                                                                    builder.set_conversation_core_info_body((SetConversationCoreInfoRequestBody) SetConversationCoreInfoRequestBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                case 903:
                                                                                    builder.get_conversation_core_info_list_body((GetConversationCoreInfoListRequestBody) GetConversationCoreInfoListRequestBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                case 904:
                                                                                    builder.upsert_conversation_core_ext_info_body((UpsertConversationCoreExtInfoRequestBody) UpsertConversationCoreExtInfoRequestBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                case 905:
                                                                                    builder.delete_conversation_core_ext_info_body((DeleteConversationCoreExtInfoRequestBody) DeleteConversationCoreExtInfoRequestBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                default:
                                                                                    switch (nextTag) {
                                                                                        case 920:
                                                                                            builder.get_conversation_setting_info_body((GetConversationSettingInfoRequestBody) GetConversationSettingInfoRequestBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        case 921:
                                                                                            builder.set_conversation_setting_info_body((SetConversationSettingInfoRequestBody) SetConversationSettingInfoRequestBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        case 922:
                                                                                            builder.upsert_conversation_setting_ext_info_body((UpsertConversationSettingExtInfoRequestBody) UpsertConversationSettingExtInfoRequestBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        case 923:
                                                                                            builder.delete_conversation_setting_ext_info_body((DeleteConversationSettingExtInfoRequestBody) DeleteConversationSettingExtInfoRequestBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        default:
                                                                                            switch (nextTag) {
                                                                                                case 1000:
                                                                                                    builder.get_stranger_conversation_body((GetStrangerConversationListRequestBody) GetStrangerConversationListRequestBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 1001:
                                                                                                    builder.get_stranger_messages_body((GetStrangerMessagesRequestBody) GetStrangerMessagesRequestBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case BaseNotice.CHECK_PROFILE /*1002*/:
                                                                                                    builder.delete_stranger_message_body((DeleteStrangerMessageRequestBody) DeleteStrangerMessageRequestBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                                                                                                    builder.delete_stranger_conversation_body((DeleteStrangerConversationRequestBody) DeleteStrangerConversationRequestBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 1004:
                                                                                                    builder.delete_stranger_all_conversation_body((DeleteStrangerAllConversationRequestBody) DeleteStrangerAllConversationRequestBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 1005:
                                                                                                    builder.mark_stranger_conversation_read_body((MarkStrangerConversationReadRequestBody) MarkStrangerConversationReadRequestBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 1006:
                                                                                                    builder.mark_stranger_all_conversation_read_body((MarkStrangerAllConversationReadRequestBody) MarkStrangerAllConversationReadRequestBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (nextTag) {
                                                                                                        case 2000:
                                                                                                            builder.participants_read_index_body((GetConversationParticipantsReadIndexV3RequestBody) GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        case 2001:
                                                                                                            builder.participants_min_index_body((GetConversationParticipantsMinIndexV3RequestBody) GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (nextTag) {
                                                                                                                case 2016:
                                                                                                                    builder.report_client_metrics_body((ReportClientMetricsRequestBody) ReportClientMetricsRequestBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 2017:
                                                                                                                    builder.get_configs_body((GetConfigsRequestBody) GetConfigsRequestBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (nextTag) {
                                                                                                                        case 100:
                                                                                                                            builder.send_message_body((SendMessageRequestBody) SendMessageRequestBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        case 203:
                                                                                                                            builder.messages_per_user_init_v2_body((MessagesPerUserInitV2RequestBody) MessagesPerUserInitV2RequestBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        case 210:
                                                                                                                            builder.check_messages_per_user_body((CheckMessagePerUserRequestBody) CheckMessagePerUserRequestBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        case 2006:
                                                                                                                            builder.get_conversation_list_body((GetUserConversationListRequestBody) GetUserConversationListRequestBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        case 2010:
                                                                                                                            builder.client_ack_body((ClientACKRequestBody) ClientACKRequestBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                                                                                                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                                                                                            break;
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, RequestBody requestBody) throws IOException {
            SendMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 100, requestBody.send_message_body);
            MessagesPerUserRequestBody.ADAPTER.encodeWithTag(protoWriter, 200, requestBody.messages_per_user_body);
            MessagesPerUserInitRequestBody.ADAPTER.encodeWithTag(protoWriter, 201, requestBody.messages_per_user_init_body);
            MessagesPerUserInitV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 203, requestBody.messages_per_user_init_v2_body);
            CheckMessagePerUserRequestBody.ADAPTER.encodeWithTag(protoWriter, 210, requestBody.check_messages_per_user_body);
            ConversationsListRequestBody.ADAPTER.encodeWithTag(protoWriter, 300, requestBody.conversations_list_body);
            MessagesInConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 301, requestBody.messages_in_conversation_body);
            GetMessagesCheckInfoInConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 302, requestBody.get_messages_checkinfo_in_conversation_body);
            SendUserActionRequestBody.ADAPTER.encodeWithTag(protoWriter, 410, requestBody.send_user_action_body);
            SendInputStatusRequestBody.ADAPTER.encodeWithTag(protoWriter, 411, requestBody.send_input_status_body);
            GetConversationInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 600, requestBody.get_conversation_info_body);
            SetConversationInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 601, requestBody.set_conversation_info_body);
            CreateConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 602, requestBody.create_conversation_body);
            DeleteConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 603, requestBody.delete_conversation_body);
            MarkConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 604, requestBody.mark_conversation_read_body);
            ConversationParticipantsListRequestBody.ADAPTER.encodeWithTag(protoWriter, 605, requestBody.conversation_participants_body);
            GetConversationInfoListRequestBody.ADAPTER.encodeWithTag(protoWriter, 607, requestBody.get_conversation_info_list_body);
            ReportGetMessagesCursorRequestBody.ADAPTER.encodeWithTag(protoWriter, 606, requestBody.report_conversation_cursor_body);
            BatchMarkConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 613, requestBody.batch_mark_read_body);
            DissolveConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 614, requestBody.dissolve_conversation_body);
            GetConversationsCheckInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 615, requestBody.get_conversations_checkinfo_body);
            GetConversationInfoV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 608, requestBody.get_conversation_info_v2_body);
            CreateConversationV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 609, requestBody.create_conversation_v2_body);
            GetConversationInfoListV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 610, requestBody.get_conversation_info_list_v2_body);
            ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 611, requestBody.get_conversation_info_list_by_favorite_v2_body);
            ConversationsPerUserByTopV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 612, requestBody.get_conversation_info_list_by_top_v2_body);
            ConversationAddParticipantsRequestBody.ADAPTER.encodeWithTag(protoWriter, 650, requestBody.conversation_add_participants_body);
            ConversationRemoveParticipantsRequestBody.ADAPTER.encodeWithTag(protoWriter, 651, requestBody.conversation_remove_participants_body);
            ConversationLeaveRequestBody.ADAPTER.encodeWithTag(protoWriter, 652, requestBody.leave_conversation_body);
            ConversationSetRoleRequestBody.ADAPTER.encodeWithTag(protoWriter, 653, requestBody.conversation_set_role_body);
            MgetConversationParticipantsRequestBody.ADAPTER.encodeWithTag(protoWriter, 654, requestBody.mget_conversation_participants_body);
            UpdateConversationParticipantRequestBody.ADAPTER.encodeWithTag(protoWriter, 655, requestBody.update_conversation_participant_body);
            DeleteMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 701, requestBody.delete_message_body);
            RecallMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 702, requestBody.recall_message_body);
            ReactionMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 703, requestBody.reaction_message_body);
            SyncMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 704, requestBody.sync_message_body);
            ModifyMessagePropertyRequestBody.ADAPTER.encodeWithTag(protoWriter, 705, requestBody.modify_message_property_body);
            GetGroupInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 801, requestBody.get_group_info_body);
            SetGroupInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 802, requestBody.set_group_info_body);
            GetGroupInfoListRequestBody.ADAPTER.encodeWithTag(protoWriter, 803, requestBody.get_group_info_list_body);
            GetConversationCoreInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 901, requestBody.get_conversation_core_info_body);
            SetConversationCoreInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 902, requestBody.set_conversation_core_info_body);
            GetConversationCoreInfoListRequestBody.ADAPTER.encodeWithTag(protoWriter, 903, requestBody.get_conversation_core_info_list_body);
            UpsertConversationCoreExtInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 904, requestBody.upsert_conversation_core_ext_info_body);
            DeleteConversationCoreExtInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 905, requestBody.delete_conversation_core_ext_info_body);
            GetConversationSettingInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 920, requestBody.get_conversation_setting_info_body);
            SetConversationSettingInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 921, requestBody.set_conversation_setting_info_body);
            UpsertConversationSettingExtInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 922, requestBody.upsert_conversation_setting_ext_info_body);
            DeleteConversationSettingExtInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 923, requestBody.delete_conversation_setting_ext_info_body);
            GetStrangerConversationListRequestBody.ADAPTER.encodeWithTag(protoWriter, 1000, requestBody.get_stranger_conversation_body);
            GetStrangerMessagesRequestBody.ADAPTER.encodeWithTag(protoWriter, 1001, requestBody.get_stranger_messages_body);
            DeleteStrangerMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, BaseNotice.CHECK_PROFILE, requestBody.delete_stranger_message_body);
            DeleteStrangerConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, BaseNotice.COMMENT_REPLY_WITH_VIDEO, requestBody.delete_stranger_conversation_body);
            DeleteStrangerAllConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 1004, requestBody.delete_stranger_all_conversation_body);
            MarkStrangerConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 1005, requestBody.mark_stranger_conversation_read_body);
            MarkStrangerAllConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 1006, requestBody.mark_stranger_all_conversation_read_body);
            GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.encodeWithTag(protoWriter, 2000, requestBody.participants_read_index_body);
            GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.encodeWithTag(protoWriter, 2001, requestBody.participants_min_index_body);
            GetUserConversationListRequestBody.ADAPTER.encodeWithTag(protoWriter, 2006, requestBody.get_conversation_list_body);
            ClientACKRequestBody.ADAPTER.encodeWithTag(protoWriter, 2010, requestBody.client_ack_body);
            ReportClientMetricsRequestBody.ADAPTER.encodeWithTag(protoWriter, 2016, requestBody.report_client_metrics_body);
            GetConfigsRequestBody.ADAPTER.encodeWithTag(protoWriter, 2017, requestBody.get_configs_body);
            protoWriter.writeBytes(requestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.send_message_body = this.send_message_body;
        builder.messages_per_user_body = this.messages_per_user_body;
        builder.messages_per_user_init_body = this.messages_per_user_init_body;
        builder.messages_per_user_init_v2_body = this.messages_per_user_init_v2_body;
        builder.check_messages_per_user_body = this.check_messages_per_user_body;
        builder.conversations_list_body = this.conversations_list_body;
        builder.messages_in_conversation_body = this.messages_in_conversation_body;
        builder.get_messages_checkinfo_in_conversation_body = this.get_messages_checkinfo_in_conversation_body;
        builder.send_user_action_body = this.send_user_action_body;
        builder.send_input_status_body = this.send_input_status_body;
        builder.get_conversation_info_body = this.get_conversation_info_body;
        builder.set_conversation_info_body = this.set_conversation_info_body;
        builder.create_conversation_body = this.create_conversation_body;
        builder.delete_conversation_body = this.delete_conversation_body;
        builder.mark_conversation_read_body = this.mark_conversation_read_body;
        builder.conversation_participants_body = this.conversation_participants_body;
        builder.get_conversation_info_list_body = this.get_conversation_info_list_body;
        builder.report_conversation_cursor_body = this.report_conversation_cursor_body;
        builder.batch_mark_read_body = this.batch_mark_read_body;
        builder.dissolve_conversation_body = this.dissolve_conversation_body;
        builder.get_conversations_checkinfo_body = this.get_conversations_checkinfo_body;
        builder.get_conversation_info_v2_body = this.get_conversation_info_v2_body;
        builder.create_conversation_v2_body = this.create_conversation_v2_body;
        builder.get_conversation_info_list_v2_body = this.get_conversation_info_list_v2_body;
        builder.get_conversation_info_list_by_favorite_v2_body = this.get_conversation_info_list_by_favorite_v2_body;
        builder.get_conversation_info_list_by_top_v2_body = this.get_conversation_info_list_by_top_v2_body;
        builder.conversation_add_participants_body = this.conversation_add_participants_body;
        builder.conversation_remove_participants_body = this.conversation_remove_participants_body;
        builder.leave_conversation_body = this.leave_conversation_body;
        builder.conversation_set_role_body = this.conversation_set_role_body;
        builder.mget_conversation_participants_body = this.mget_conversation_participants_body;
        builder.update_conversation_participant_body = this.update_conversation_participant_body;
        builder.delete_message_body = this.delete_message_body;
        builder.recall_message_body = this.recall_message_body;
        builder.reaction_message_body = this.reaction_message_body;
        builder.sync_message_body = this.sync_message_body;
        builder.modify_message_property_body = this.modify_message_property_body;
        builder.get_group_info_body = this.get_group_info_body;
        builder.set_group_info_body = this.set_group_info_body;
        builder.get_group_info_list_body = this.get_group_info_list_body;
        builder.get_conversation_core_info_body = this.get_conversation_core_info_body;
        builder.set_conversation_core_info_body = this.set_conversation_core_info_body;
        builder.get_conversation_core_info_list_body = this.get_conversation_core_info_list_body;
        builder.upsert_conversation_core_ext_info_body = this.upsert_conversation_core_ext_info_body;
        builder.delete_conversation_core_ext_info_body = this.delete_conversation_core_ext_info_body;
        builder.get_conversation_setting_info_body = this.get_conversation_setting_info_body;
        builder.set_conversation_setting_info_body = this.set_conversation_setting_info_body;
        builder.upsert_conversation_setting_ext_info_body = this.upsert_conversation_setting_ext_info_body;
        builder.delete_conversation_setting_ext_info_body = this.delete_conversation_setting_ext_info_body;
        builder.get_stranger_conversation_body = this.get_stranger_conversation_body;
        builder.get_stranger_messages_body = this.get_stranger_messages_body;
        builder.delete_stranger_message_body = this.delete_stranger_message_body;
        builder.delete_stranger_conversation_body = this.delete_stranger_conversation_body;
        builder.delete_stranger_all_conversation_body = this.delete_stranger_all_conversation_body;
        builder.mark_stranger_conversation_read_body = this.mark_stranger_conversation_read_body;
        builder.mark_stranger_all_conversation_read_body = this.mark_stranger_all_conversation_read_body;
        builder.participants_read_index_body = this.participants_read_index_body;
        builder.participants_min_index_body = this.participants_min_index_body;
        builder.get_conversation_list_body = this.get_conversation_list_body;
        builder.client_ack_body = this.client_ack_body;
        builder.report_client_metrics_body = this.report_client_metrics_body;
        builder.get_configs_body = this.get_configs_body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_message_body != null) {
            sb.append(", send_message_body=");
            sb.append(this.send_message_body);
        }
        if (this.messages_per_user_body != null) {
            sb.append(", messages_per_user_body=");
            sb.append(this.messages_per_user_body);
        }
        if (this.messages_per_user_init_body != null) {
            sb.append(", messages_per_user_init_body=");
            sb.append(this.messages_per_user_init_body);
        }
        if (this.messages_per_user_init_v2_body != null) {
            sb.append(", messages_per_user_init_v2_body=");
            sb.append(this.messages_per_user_init_v2_body);
        }
        if (this.check_messages_per_user_body != null) {
            sb.append(", check_messages_per_user_body=");
            sb.append(this.check_messages_per_user_body);
        }
        if (this.conversations_list_body != null) {
            sb.append(", conversations_list_body=");
            sb.append(this.conversations_list_body);
        }
        if (this.messages_in_conversation_body != null) {
            sb.append(", messages_in_conversation_body=");
            sb.append(this.messages_in_conversation_body);
        }
        if (this.get_messages_checkinfo_in_conversation_body != null) {
            sb.append(", get_messages_checkinfo_in_conversation_body=");
            sb.append(this.get_messages_checkinfo_in_conversation_body);
        }
        if (this.send_user_action_body != null) {
            sb.append(", send_user_action_body=");
            sb.append(this.send_user_action_body);
        }
        if (this.send_input_status_body != null) {
            sb.append(", send_input_status_body=");
            sb.append(this.send_input_status_body);
        }
        if (this.get_conversation_info_body != null) {
            sb.append(", get_conversation_info_body=");
            sb.append(this.get_conversation_info_body);
        }
        if (this.set_conversation_info_body != null) {
            sb.append(", set_conversation_info_body=");
            sb.append(this.set_conversation_info_body);
        }
        if (this.create_conversation_body != null) {
            sb.append(", create_conversation_body=");
            sb.append(this.create_conversation_body);
        }
        if (this.delete_conversation_body != null) {
            sb.append(", delete_conversation_body=");
            sb.append(this.delete_conversation_body);
        }
        if (this.mark_conversation_read_body != null) {
            sb.append(", mark_conversation_read_body=");
            sb.append(this.mark_conversation_read_body);
        }
        if (this.conversation_participants_body != null) {
            sb.append(", conversation_participants_body=");
            sb.append(this.conversation_participants_body);
        }
        if (this.get_conversation_info_list_body != null) {
            sb.append(", get_conversation_info_list_body=");
            sb.append(this.get_conversation_info_list_body);
        }
        if (this.report_conversation_cursor_body != null) {
            sb.append(", report_conversation_cursor_body=");
            sb.append(this.report_conversation_cursor_body);
        }
        if (this.batch_mark_read_body != null) {
            sb.append(", batch_mark_read_body=");
            sb.append(this.batch_mark_read_body);
        }
        if (this.dissolve_conversation_body != null) {
            sb.append(", dissolve_conversation_body=");
            sb.append(this.dissolve_conversation_body);
        }
        if (this.get_conversations_checkinfo_body != null) {
            sb.append(", get_conversations_checkinfo_body=");
            sb.append(this.get_conversations_checkinfo_body);
        }
        if (this.get_conversation_info_v2_body != null) {
            sb.append(", get_conversation_info_v2_body=");
            sb.append(this.get_conversation_info_v2_body);
        }
        if (this.create_conversation_v2_body != null) {
            sb.append(", create_conversation_v2_body=");
            sb.append(this.create_conversation_v2_body);
        }
        if (this.get_conversation_info_list_v2_body != null) {
            sb.append(", get_conversation_info_list_v2_body=");
            sb.append(this.get_conversation_info_list_v2_body);
        }
        if (this.get_conversation_info_list_by_favorite_v2_body != null) {
            sb.append(", get_conversation_info_list_by_favorite_v2_body=");
            sb.append(this.get_conversation_info_list_by_favorite_v2_body);
        }
        if (this.get_conversation_info_list_by_top_v2_body != null) {
            sb.append(", get_conversation_info_list_by_top_v2_body=");
            sb.append(this.get_conversation_info_list_by_top_v2_body);
        }
        if (this.conversation_add_participants_body != null) {
            sb.append(", conversation_add_participants_body=");
            sb.append(this.conversation_add_participants_body);
        }
        if (this.conversation_remove_participants_body != null) {
            sb.append(", conversation_remove_participants_body=");
            sb.append(this.conversation_remove_participants_body);
        }
        if (this.leave_conversation_body != null) {
            sb.append(", leave_conversation_body=");
            sb.append(this.leave_conversation_body);
        }
        if (this.conversation_set_role_body != null) {
            sb.append(", conversation_set_role_body=");
            sb.append(this.conversation_set_role_body);
        }
        if (this.mget_conversation_participants_body != null) {
            sb.append(", mget_conversation_participants_body=");
            sb.append(this.mget_conversation_participants_body);
        }
        if (this.update_conversation_participant_body != null) {
            sb.append(", update_conversation_participant_body=");
            sb.append(this.update_conversation_participant_body);
        }
        if (this.delete_message_body != null) {
            sb.append(", delete_message_body=");
            sb.append(this.delete_message_body);
        }
        if (this.recall_message_body != null) {
            sb.append(", recall_message_body=");
            sb.append(this.recall_message_body);
        }
        if (this.reaction_message_body != null) {
            sb.append(", reaction_message_body=");
            sb.append(this.reaction_message_body);
        }
        if (this.sync_message_body != null) {
            sb.append(", sync_message_body=");
            sb.append(this.sync_message_body);
        }
        if (this.modify_message_property_body != null) {
            sb.append(", modify_message_property_body=");
            sb.append(this.modify_message_property_body);
        }
        if (this.get_group_info_body != null) {
            sb.append(", get_group_info_body=");
            sb.append(this.get_group_info_body);
        }
        if (this.set_group_info_body != null) {
            sb.append(", set_group_info_body=");
            sb.append(this.set_group_info_body);
        }
        if (this.get_group_info_list_body != null) {
            sb.append(", get_group_info_list_body=");
            sb.append(this.get_group_info_list_body);
        }
        if (this.get_conversation_core_info_body != null) {
            sb.append(", get_conversation_core_info_body=");
            sb.append(this.get_conversation_core_info_body);
        }
        if (this.set_conversation_core_info_body != null) {
            sb.append(", set_conversation_core_info_body=");
            sb.append(this.set_conversation_core_info_body);
        }
        if (this.get_conversation_core_info_list_body != null) {
            sb.append(", get_conversation_core_info_list_body=");
            sb.append(this.get_conversation_core_info_list_body);
        }
        if (this.upsert_conversation_core_ext_info_body != null) {
            sb.append(", upsert_conversation_core_ext_info_body=");
            sb.append(this.upsert_conversation_core_ext_info_body);
        }
        if (this.delete_conversation_core_ext_info_body != null) {
            sb.append(", delete_conversation_core_ext_info_body=");
            sb.append(this.delete_conversation_core_ext_info_body);
        }
        if (this.get_conversation_setting_info_body != null) {
            sb.append(", get_conversation_setting_info_body=");
            sb.append(this.get_conversation_setting_info_body);
        }
        if (this.set_conversation_setting_info_body != null) {
            sb.append(", set_conversation_setting_info_body=");
            sb.append(this.set_conversation_setting_info_body);
        }
        if (this.upsert_conversation_setting_ext_info_body != null) {
            sb.append(", upsert_conversation_setting_ext_info_body=");
            sb.append(this.upsert_conversation_setting_ext_info_body);
        }
        if (this.delete_conversation_setting_ext_info_body != null) {
            sb.append(", delete_conversation_setting_ext_info_body=");
            sb.append(this.delete_conversation_setting_ext_info_body);
        }
        if (this.get_stranger_conversation_body != null) {
            sb.append(", get_stranger_conversation_body=");
            sb.append(this.get_stranger_conversation_body);
        }
        if (this.get_stranger_messages_body != null) {
            sb.append(", get_stranger_messages_body=");
            sb.append(this.get_stranger_messages_body);
        }
        if (this.delete_stranger_message_body != null) {
            sb.append(", delete_stranger_message_body=");
            sb.append(this.delete_stranger_message_body);
        }
        if (this.delete_stranger_conversation_body != null) {
            sb.append(", delete_stranger_conversation_body=");
            sb.append(this.delete_stranger_conversation_body);
        }
        if (this.delete_stranger_all_conversation_body != null) {
            sb.append(", delete_stranger_all_conversation_body=");
            sb.append(this.delete_stranger_all_conversation_body);
        }
        if (this.mark_stranger_conversation_read_body != null) {
            sb.append(", mark_stranger_conversation_read_body=");
            sb.append(this.mark_stranger_conversation_read_body);
        }
        if (this.mark_stranger_all_conversation_read_body != null) {
            sb.append(", mark_stranger_all_conversation_read_body=");
            sb.append(this.mark_stranger_all_conversation_read_body);
        }
        if (this.participants_read_index_body != null) {
            sb.append(", participants_read_index_body=");
            sb.append(this.participants_read_index_body);
        }
        if (this.participants_min_index_body != null) {
            sb.append(", participants_min_index_body=");
            sb.append(this.participants_min_index_body);
        }
        if (this.get_conversation_list_body != null) {
            sb.append(", get_conversation_list_body=");
            sb.append(this.get_conversation_list_body);
        }
        if (this.client_ack_body != null) {
            sb.append(", client_ack_body=");
            sb.append(this.client_ack_body);
        }
        if (this.report_client_metrics_body != null) {
            sb.append(", report_client_metrics_body=");
            sb.append(this.report_client_metrics_body);
        }
        if (this.get_configs_body != null) {
            sb.append(", get_configs_body=");
            sb.append(this.get_configs_body);
        }
        StringBuilder replace = sb.replace(0, 2, "RequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public RequestBody(SendMessageRequestBody sendMessageRequestBody, MessagesPerUserRequestBody messagesPerUserRequestBody, MessagesPerUserInitRequestBody messagesPerUserInitRequestBody, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody, ConversationsListRequestBody conversationsListRequestBody, MessagesInConversationRequestBody messagesInConversationRequestBody, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody, SendUserActionRequestBody sendUserActionRequestBody, SendInputStatusRequestBody sendInputStatusRequestBody, GetConversationInfoRequestBody getConversationInfoRequestBody, SetConversationInfoRequestBody setConversationInfoRequestBody, CreateConversationRequestBody createConversationRequestBody, DeleteConversationRequestBody deleteConversationRequestBody, MarkConversationReadRequestBody markConversationReadRequestBody, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody, GetConversationInfoListRequestBody getConversationInfoListRequestBody, ReportGetMessagesCursorRequestBody reportGetMessagesCursorRequestBody, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody, DissolveConversationRequestBody dissolveConversationRequestBody, GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody, CreateConversationV2RequestBody createConversationV2RequestBody, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody, ConversationLeaveRequestBody conversationLeaveRequestBody, ConversationSetRoleRequestBody conversationSetRoleRequestBody, MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody, DeleteMessageRequestBody deleteMessageRequestBody, RecallMessageRequestBody recallMessageRequestBody, ReactionMessageRequestBody reactionMessageRequestBody, SyncMessageRequestBody syncMessageRequestBody, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody, GetGroupInfoRequestBody getGroupInfoRequestBody, SetGroupInfoRequestBody setGroupInfoRequestBody, GetGroupInfoListRequestBody getGroupInfoListRequestBody, GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody, GetConversationCoreInfoListRequestBody getConversationCoreInfoListRequestBody, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody, DeleteConversationCoreExtInfoRequestBody deleteConversationCoreExtInfoRequestBody, GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody, DeleteConversationSettingExtInfoRequestBody deleteConversationSettingExtInfoRequestBody, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody, DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody, MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody, GetUserConversationListRequestBody getUserConversationListRequestBody, ClientACKRequestBody clientACKRequestBody, ReportClientMetricsRequestBody reportClientMetricsRequestBody, GetConfigsRequestBody getConfigsRequestBody) {
        this(sendMessageRequestBody, messagesPerUserRequestBody, messagesPerUserInitRequestBody, messagesPerUserInitV2RequestBody, checkMessagePerUserRequestBody, conversationsListRequestBody, messagesInConversationRequestBody, getMessagesCheckInfoInConversationRequestBody, sendUserActionRequestBody, sendInputStatusRequestBody, getConversationInfoRequestBody, setConversationInfoRequestBody, createConversationRequestBody, deleteConversationRequestBody, markConversationReadRequestBody, conversationParticipantsListRequestBody, getConversationInfoListRequestBody, reportGetMessagesCursorRequestBody, batchMarkConversationReadRequestBody, dissolveConversationRequestBody, getConversationsCheckInfoRequestBody, getConversationInfoV2RequestBody, createConversationV2RequestBody, getConversationInfoListV2RequestBody, conversationsPerUserByFavoriteV2RequestBody, conversationsPerUserByTopV2RequestBody, conversationAddParticipantsRequestBody, conversationRemoveParticipantsRequestBody, conversationLeaveRequestBody, conversationSetRoleRequestBody, mgetConversationParticipantsRequestBody, updateConversationParticipantRequestBody, deleteMessageRequestBody, recallMessageRequestBody, reactionMessageRequestBody, syncMessageRequestBody, modifyMessagePropertyRequestBody, getGroupInfoRequestBody, setGroupInfoRequestBody, getGroupInfoListRequestBody, getConversationCoreInfoRequestBody, setConversationCoreInfoRequestBody, getConversationCoreInfoListRequestBody, upsertConversationCoreExtInfoRequestBody, deleteConversationCoreExtInfoRequestBody, getConversationSettingInfoRequestBody, setConversationSettingInfoRequestBody, upsertConversationSettingExtInfoRequestBody, deleteConversationSettingExtInfoRequestBody, getStrangerConversationListRequestBody, getStrangerMessagesRequestBody, deleteStrangerMessageRequestBody, deleteStrangerConversationRequestBody, deleteStrangerAllConversationRequestBody, markStrangerConversationReadRequestBody, markStrangerAllConversationReadRequestBody, getConversationParticipantsReadIndexV3RequestBody, getConversationParticipantsMinIndexV3RequestBody, getUserConversationListRequestBody, clientACKRequestBody, reportClientMetricsRequestBody, getConfigsRequestBody, ByteString.EMPTY);
    }

    public RequestBody(SendMessageRequestBody sendMessageRequestBody, MessagesPerUserRequestBody messagesPerUserRequestBody, MessagesPerUserInitRequestBody messagesPerUserInitRequestBody, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody, ConversationsListRequestBody conversationsListRequestBody, MessagesInConversationRequestBody messagesInConversationRequestBody, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody, SendUserActionRequestBody sendUserActionRequestBody, SendInputStatusRequestBody sendInputStatusRequestBody, GetConversationInfoRequestBody getConversationInfoRequestBody, SetConversationInfoRequestBody setConversationInfoRequestBody, CreateConversationRequestBody createConversationRequestBody, DeleteConversationRequestBody deleteConversationRequestBody, MarkConversationReadRequestBody markConversationReadRequestBody, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody, GetConversationInfoListRequestBody getConversationInfoListRequestBody, ReportGetMessagesCursorRequestBody reportGetMessagesCursorRequestBody, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody, DissolveConversationRequestBody dissolveConversationRequestBody, GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody, CreateConversationV2RequestBody createConversationV2RequestBody, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody, ConversationLeaveRequestBody conversationLeaveRequestBody, ConversationSetRoleRequestBody conversationSetRoleRequestBody, MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody, DeleteMessageRequestBody deleteMessageRequestBody, RecallMessageRequestBody recallMessageRequestBody, ReactionMessageRequestBody reactionMessageRequestBody, SyncMessageRequestBody syncMessageRequestBody, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody, GetGroupInfoRequestBody getGroupInfoRequestBody, SetGroupInfoRequestBody setGroupInfoRequestBody, GetGroupInfoListRequestBody getGroupInfoListRequestBody, GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody, GetConversationCoreInfoListRequestBody getConversationCoreInfoListRequestBody, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody, DeleteConversationCoreExtInfoRequestBody deleteConversationCoreExtInfoRequestBody, GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody, DeleteConversationSettingExtInfoRequestBody deleteConversationSettingExtInfoRequestBody, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody, DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody, MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody, GetUserConversationListRequestBody getUserConversationListRequestBody, ClientACKRequestBody clientACKRequestBody, ReportClientMetricsRequestBody reportClientMetricsRequestBody, GetConfigsRequestBody getConfigsRequestBody, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_message_body = sendMessageRequestBody;
        this.messages_per_user_body = messagesPerUserRequestBody;
        this.messages_per_user_init_body = messagesPerUserInitRequestBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2RequestBody;
        this.check_messages_per_user_body = checkMessagePerUserRequestBody;
        this.conversations_list_body = conversationsListRequestBody;
        this.messages_in_conversation_body = messagesInConversationRequestBody;
        this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationRequestBody;
        this.send_user_action_body = sendUserActionRequestBody;
        this.send_input_status_body = sendInputStatusRequestBody;
        this.get_conversation_info_body = getConversationInfoRequestBody;
        this.set_conversation_info_body = setConversationInfoRequestBody;
        this.create_conversation_body = createConversationRequestBody;
        this.delete_conversation_body = deleteConversationRequestBody;
        this.mark_conversation_read_body = markConversationReadRequestBody;
        this.conversation_participants_body = conversationParticipantsListRequestBody;
        this.get_conversation_info_list_body = getConversationInfoListRequestBody;
        this.report_conversation_cursor_body = reportGetMessagesCursorRequestBody;
        this.batch_mark_read_body = batchMarkConversationReadRequestBody;
        this.dissolve_conversation_body = dissolveConversationRequestBody;
        this.get_conversations_checkinfo_body = getConversationsCheckInfoRequestBody;
        this.get_conversation_info_v2_body = getConversationInfoV2RequestBody;
        this.create_conversation_v2_body = createConversationV2RequestBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2RequestBody;
        this.get_conversation_info_list_by_favorite_v2_body = conversationsPerUserByFavoriteV2RequestBody;
        this.get_conversation_info_list_by_top_v2_body = conversationsPerUserByTopV2RequestBody;
        this.conversation_add_participants_body = conversationAddParticipantsRequestBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsRequestBody;
        this.leave_conversation_body = conversationLeaveRequestBody;
        this.conversation_set_role_body = conversationSetRoleRequestBody;
        this.mget_conversation_participants_body = mgetConversationParticipantsRequestBody;
        this.update_conversation_participant_body = updateConversationParticipantRequestBody;
        this.delete_message_body = deleteMessageRequestBody;
        this.recall_message_body = recallMessageRequestBody;
        this.reaction_message_body = reactionMessageRequestBody;
        this.sync_message_body = syncMessageRequestBody;
        this.modify_message_property_body = modifyMessagePropertyRequestBody;
        this.get_group_info_body = getGroupInfoRequestBody;
        this.set_group_info_body = setGroupInfoRequestBody;
        this.get_group_info_list_body = getGroupInfoListRequestBody;
        this.get_conversation_core_info_body = getConversationCoreInfoRequestBody;
        this.set_conversation_core_info_body = setConversationCoreInfoRequestBody;
        this.get_conversation_core_info_list_body = getConversationCoreInfoListRequestBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoRequestBody;
        this.delete_conversation_core_ext_info_body = deleteConversationCoreExtInfoRequestBody;
        this.get_conversation_setting_info_body = getConversationSettingInfoRequestBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoRequestBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoRequestBody;
        this.delete_conversation_setting_ext_info_body = deleteConversationSettingExtInfoRequestBody;
        this.get_stranger_conversation_body = getStrangerConversationListRequestBody;
        this.get_stranger_messages_body = getStrangerMessagesRequestBody;
        this.delete_stranger_message_body = deleteStrangerMessageRequestBody;
        this.delete_stranger_conversation_body = deleteStrangerConversationRequestBody;
        this.delete_stranger_all_conversation_body = deleteStrangerAllConversationRequestBody;
        this.mark_stranger_conversation_read_body = markStrangerConversationReadRequestBody;
        this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadRequestBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3RequestBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3RequestBody;
        this.get_conversation_list_body = getUserConversationListRequestBody;
        this.client_ack_body = clientACKRequestBody;
        this.report_client_metrics_body = reportClientMetricsRequestBody;
        this.get_configs_body = getConfigsRequestBody;
    }
}
