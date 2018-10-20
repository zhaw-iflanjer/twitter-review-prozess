package ch.zhaw.gpi.twitterreview.delegates;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Implementation Service Task "Tweet senden"
 * @author jerem
 */
@Named("sendTweetAdapter")
public class SendTweetDelegate implements JavaDelegate {

/*
 * 1. Die Prozessvariable tweetContent wird ausgelesen
 * 2. Dieser Text wird in der Console ausgegeben
 *
 * @param de Objekt, welches die Verknüpfung zur Process Engine und zur aktuellen Execution enthält
*/    
    @Override
    public void execute(DelegateExecution de) throws Exception {
        String tweetContent = (String)de.getVariable("tweetContent");
        System.out.println(tweetContent);
    }
    
}
