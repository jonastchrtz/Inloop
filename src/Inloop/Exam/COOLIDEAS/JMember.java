package Inloop.Exam.COOLIDEAS;

import java.util.Observable;
import java.util.Set;

public class JMember implements java.util.Observer {

    private Set<JTopic> topics;

    public void subscribe(JTopic topic) {
        topics.add(topic);
    }

    public void unsubscribe(JTopic topic) {
        topics.remove(topic);
    }

    public Set<JTopic> getSubscribedTopics() {
        return topics;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
