package org.mule.modules.slack.retrievers;

import org.stevew.SlackClient;
import org.stevew.model.chat.Message;

import java.util.List;

/**
 * Created by estebanwasinger on 3/29/15.
 */
public class DirectMessageRetriever implements MessageRetriever {
    @Override
    public List<Message> retrieve(SlackClient slackClient, String channelId, String latestTimestamp, String oldestTimestamp, String mountOfMessages) {
        return slackClient.getDirectChannelHistory(channelId,latestTimestamp,oldestTimestamp,mountOfMessages);
    }
}